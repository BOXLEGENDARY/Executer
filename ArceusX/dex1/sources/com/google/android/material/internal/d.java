package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.C1628l0;
import k4.C2517a;

public class d {
    public static void a(Window window, boolean z7, Integer num, Integer num2) {
        boolean z8 = num == null || num.intValue() == 0;
        boolean z9 = num2 == null || num2.intValue() == 0;
        if (z8 || z9) {
            int iB = C2517a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z8) {
                num = Integer.valueOf(iB);
            }
            if (z9) {
                num2 = Integer.valueOf(iB);
            }
        }
        C1628l0.b(window, !z7);
        int iC = c(window.getContext(), z7);
        int iB2 = b(window.getContext(), z7);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        f(window, d(iC, C2517a.h(num.intValue())));
        e(window, d(iB2, C2517a.h(num2.intValue())));
    }

    private static int b(Context context, boolean z7) {
        if (z7 && Build.VERSION.SDK_INT < 27) {
            return androidx.core.graphics.a.l(C2517a.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z7) {
            return 0;
        }
        return C2517a.b(context, R.attr.navigationBarColor, -16777216);
    }

    private static int c(Context context, boolean z7) {
        if (z7) {
            return 0;
        }
        return C2517a.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean d(int i7, boolean z7) {
        return C2517a.h(i7) || (i7 == 0 && z7);
    }

    public static void e(Window window, boolean z7) {
        C1628l0.a(window, window.getDecorView()).b(z7);
    }

    public static void f(Window window, boolean z7) {
        C1628l0.a(window, window.getDecorView()).c(z7);
    }
}
