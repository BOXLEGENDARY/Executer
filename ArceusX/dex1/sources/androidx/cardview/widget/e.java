package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

class e extends Drawable {

    private static final double f9756a = Math.cos(Math.toRadians(45.0d));

    static float a(float f7, float f8, boolean z7) {
        return z7 ? (float) (f7 + ((1.0d - f9756a) * f8)) : f7;
    }

    static float b(float f7, float f8, boolean z7) {
        return z7 ? (float) ((f7 * 1.5f) + ((1.0d - f9756a) * f8)) : f7 * 1.5f;
    }
}
