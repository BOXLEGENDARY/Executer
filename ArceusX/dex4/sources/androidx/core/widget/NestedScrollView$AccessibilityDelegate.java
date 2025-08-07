package androidx.core.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;

class NestedScrollView$AccessibilityDelegate extends AccessibilityDelegateCompat {
    NestedScrollView$AccessibilityDelegate() {
    }

    @Override
    public boolean performAccessibilityAction(View host, int action, Bundle arguments) {
        if (super.performAccessibilityAction(host, action, arguments)) {
            return true;
        }
        NestedScrollView nsvHost = (NestedScrollView) host;
        if (!nsvHost.isEnabled()) {
            return false;
        }
        switch (action) {
            case 4096:
                int viewportHeight = (nsvHost.getHeight() - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop();
                int targetScrollY = Math.min(nsvHost.getScrollY() + viewportHeight, nsvHost.getScrollRange());
                if (targetScrollY == nsvHost.getScrollY()) {
                    return false;
                }
                nsvHost.smoothScrollTo(0, targetScrollY);
                return true;
            case 8192:
                int viewportHeight2 = (nsvHost.getHeight() - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop();
                int targetScrollY2 = Math.max(nsvHost.getScrollY() - viewportHeight2, 0);
                if (targetScrollY2 == nsvHost.getScrollY()) {
                    return false;
                }
                nsvHost.smoothScrollTo(0, targetScrollY2);
                return true;
            default:
                return false;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
        int scrollRange;
        super.onInitializeAccessibilityNodeInfo(host, info);
        NestedScrollView nsvHost = (NestedScrollView) host;
        info.setClassName(ScrollView.class.getName());
        if (nsvHost.isEnabled() && (scrollRange = nsvHost.getScrollRange()) > 0) {
            info.setScrollable(true);
            if (nsvHost.getScrollY() > 0) {
                info.addAction(8192);
            }
            if (nsvHost.getScrollY() < scrollRange) {
                info.addAction(4096);
            }
        }
    }

    @Override
    public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(host, event);
        NestedScrollView nsvHost = (NestedScrollView) host;
        event.setClassName(ScrollView.class.getName());
        boolean scrollable = nsvHost.getScrollRange() > 0;
        event.setScrollable(scrollable);
        event.setScrollX(nsvHost.getScrollX());
        event.setScrollY(nsvHost.getScrollY());
        AccessibilityRecordCompat.setMaxScrollX(event, nsvHost.getScrollX());
        AccessibilityRecordCompat.setMaxScrollY(event, nsvHost.getScrollRange());
    }
}
