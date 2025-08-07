package com.google.android.material.internal;

final class f {
    static void a(float f7, float[] fArr) {
        if (f7 <= 0.5f) {
            fArr[0] = 1.0f - (f7 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f7 * 2.0f) - 1.0f;
        }
    }
}
