package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

public final class i {

    static class a {
        static void a(PopupWindow popupWindow, boolean z7) {
            popupWindow.setOverlapAnchor(z7);
        }

        static void b(PopupWindow popupWindow, int i7) {
            popupWindow.setWindowLayoutType(i7);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z7) {
        a.a(popupWindow, z7);
    }

    public static void b(PopupWindow popupWindow, int i7) {
        a.b(popupWindow, i7);
    }

    @Deprecated
    public static void c(PopupWindow popupWindow, View view, int i7, int i8, int i9) {
        popupWindow.showAsDropDown(view, i7, i8, i9);
    }
}
