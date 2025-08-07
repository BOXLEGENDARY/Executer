package com.google.android.gms.internal.measurement;

import android.os.Binder;

public final class C2011x2 {
    public static <V> V a(InterfaceC2019y2<V> interfaceC2019y2) {
        try {
            return interfaceC2019y2.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC2019y2.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
