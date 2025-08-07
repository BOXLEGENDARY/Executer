package y0;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

public class C3021v {
    @Deprecated
    public static void a(AccessibilityRecord accessibilityRecord, int i7) {
        accessibilityRecord.setMaxScrollX(i7);
    }

    @Deprecated
    public static void b(AccessibilityRecord accessibilityRecord, int i7) {
        accessibilityRecord.setMaxScrollY(i7);
    }

    @Deprecated
    public static void c(AccessibilityRecord accessibilityRecord, View view, int i7) {
        accessibilityRecord.setSource(view, i7);
    }
}
