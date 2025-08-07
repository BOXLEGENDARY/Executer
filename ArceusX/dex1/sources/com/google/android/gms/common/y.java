package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class y extends w {

    private static final WeakReference f14402i = new WeakReference(null);

    private WeakReference f14403e;

    y(byte[] bArr) {
        super(bArr);
        this.f14403e = f14402i;
    }

    @Override
    final byte[] h3() {
        byte[] bArrN3;
        synchronized (this) {
            try {
                bArrN3 = (byte[]) this.f14403e.get();
                if (bArrN3 == null) {
                    bArrN3 = n3();
                    this.f14403e = new WeakReference(bArrN3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrN3;
    }

    protected abstract byte[] n3();
}
