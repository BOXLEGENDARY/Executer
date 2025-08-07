package com.google.android.gms.internal.play_billing;

import S5.Cg.XjqcfAbdbc;

public class Y {
    Y() {
    }

    static int a(int i7, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException(XjqcfAbdbc.JpRUwmG);
        }
        if (i8 <= i7) {
            return i7;
        }
        int i9 = i7 + (i7 >> 1) + 1;
        if (i9 < i8) {
            int iHighestOneBit = Integer.highestOneBit(i8 - 1);
            i9 = iHighestOneBit + iHighestOneBit;
        }
        if (i9 < 0) {
            return Integer.MAX_VALUE;
        }
        return i9;
    }
}
