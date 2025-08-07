package androidx.appcompat.widget;

import android.view.View;

public class TooltipCompat {

    static class a {
        static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    private TooltipCompat() {
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        a.a(view, charSequence);
    }
}
