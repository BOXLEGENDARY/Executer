package s4;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

public class C2884b {

    public static final boolean f23671a = true;

    private static final int[] f23672b = {R.attr.state_pressed};

    private static final int[] f23673c = {R.attr.state_hovered, R.attr.state_focused};

    private static final int[] f23674d = {R.attr.state_focused};

    private static final int[] f23675e = {R.attr.state_hovered};

    private static final int[] f23676f = {R.attr.state_selected, R.attr.state_pressed};

    private static final int[] f23677g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    private static final int[] f23678h = {R.attr.state_selected, R.attr.state_focused};

    private static final int[] f23679i = {R.attr.state_selected, R.attr.state_hovered};

    private static final int[] f23680j = {R.attr.state_selected};

    private static final int[] f23681k = {R.attr.state_enabled, R.attr.state_pressed};

    static final String f23682l = C2884b.class.getSimpleName();

    private C2884b() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f23681k, 0)) != 0) {
            Log.w(f23682l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z7 = false;
        boolean z8 = false;
        for (int i7 : iArr) {
            if (i7 == 16842910) {
                z7 = true;
            } else if (i7 == 16842908 || i7 == 16842919 || i7 == 16843623) {
                z8 = true;
            }
        }
        return z7 && z8;
    }
}
