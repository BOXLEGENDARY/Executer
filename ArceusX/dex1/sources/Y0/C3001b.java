package y0;

import android.view.accessibility.AccessibilityEvent;

public final class C3001b {
    @Deprecated
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Deprecated
    public static void b(AccessibilityEvent accessibilityEvent, int i7) {
        accessibilityEvent.setContentChangeTypes(i7);
    }
}
