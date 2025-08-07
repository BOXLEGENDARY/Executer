package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

public final class C2052d1 {
    public static boolean a(Unsafe unsafe, Object obj, long j7, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j7, obj2, obj3)) {
            if (unsafe.getObject(obj, j7) != obj2) {
                return false;
            }
        }
        return true;
    }
}
