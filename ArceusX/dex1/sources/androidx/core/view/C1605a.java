package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import y0.C3019t;
import y0.C3020u;

public class C1605a {

    private static final View.AccessibilityDelegate f10636c = new View.AccessibilityDelegate();

    private final View.AccessibilityDelegate f10637a;

    private final View.AccessibilityDelegate f10638b;

    static final class C0086a extends View.AccessibilityDelegate {

        final C1605a f10639a;

        C0086a(C1605a c1605a) {
            this.f10639a = c1605a;
        }

        @Override
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f10639a.a(view, accessibilityEvent);
        }

        @Override
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C3020u c3020uB = this.f10639a.b(view);
            if (c3020uB != null) {
                return (AccessibilityNodeProvider) c3020uB.e();
            }
            return null;
        }

        @Override
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f10639a.f(view, accessibilityEvent);
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C3019t c3019tF0 = C3019t.F0(accessibilityNodeInfo);
            c3019tF0.w0(Z.U(view));
            c3019tF0.o0(Z.P(view));
            c3019tF0.t0(Z.o(view));
            c3019tF0.A0(Z.G(view));
            this.f10639a.g(view, c3019tF0);
            c3019tF0.d(accessibilityNodeInfo.getText(), view);
            List<C3019t.a> listC = C1605a.c(view);
            for (int i7 = 0; i7 < listC.size(); i7++) {
                c3019tF0.b(listC.get(i7));
            }
        }

        @Override
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f10639a.h(view, accessibilityEvent);
        }

        @Override
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f10639a.i(viewGroup, view, accessibilityEvent);
        }

        @Override
        public boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
            return this.f10639a.j(view, i7, bundle);
        }

        @Override
        public void sendAccessibilityEvent(View view, int i7) {
            this.f10639a.l(view, i7);
        }

        @Override
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f10639a.m(view, accessibilityEvent);
        }
    }

    public C1605a() {
        this(f10636c);
    }

    static List<C3019t.a> c(View view) {
        List<C3019t.a> list = (List) view.getTag(o0.e.f22332H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrO = C3019t.o(view.createAccessibilityNodeInfo().getText());
            for (int i7 = 0; clickableSpanArrO != null && i7 < clickableSpanArrO.length; i7++) {
                if (clickableSpan.equals(clickableSpanArrO[i7])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i7, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(o0.e.f22333I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i7)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f10637a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C3020u b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f10637a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C3020u(accessibilityNodeProvider);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f10638b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f10637a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, C3019t c3019t) {
        this.f10637a.onInitializeAccessibilityNodeInfo(view, c3019t.E0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f10637a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f10637a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i7, Bundle bundle) {
        List<C3019t.a> listC = c(view);
        boolean zPerformAccessibilityAction = false;
        int i8 = 0;
        while (true) {
            if (i8 >= listC.size()) {
                break;
            }
            C3019t.a aVar = listC.get(i8);
            if (aVar.b() == i7) {
                zPerformAccessibilityAction = aVar.d(view, bundle);
                break;
            }
            i8++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f10637a.performAccessibilityAction(view, i7, bundle);
        }
        return (zPerformAccessibilityAction || i7 != o0.e.f22344a || bundle == null) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i7) {
        this.f10637a.sendAccessibilityEvent(view, i7);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f10637a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C1605a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f10637a = accessibilityDelegate;
        this.f10638b = new C0086a(this);
    }
}
