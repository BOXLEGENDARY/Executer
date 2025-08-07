package com.google.android.gms.common;

import android.util.Log;

class H {

    private static final H f14044e = new H(true, 3, 1, null, null);

    final boolean f14045a;

    final String f14046b;

    final Throwable f14047c;

    final int f14048d;

    private H(boolean z7, int i7, int i8, String str, Throwable th) {
        this.f14045a = z7;
        this.f14048d = i7;
        this.f14046b = str;
        this.f14047c = th;
    }

    @Deprecated
    static H b() {
        return f14044e;
    }

    static H c(String str) {
        return new H(false, 1, 5, str, null);
    }

    static H d(String str, Throwable th) {
        return new H(false, 1, 5, str, th);
    }

    static H f(int i7) {
        return new H(true, i7, 1, null, null);
    }

    static H g(int i7, int i8, String str, Throwable th) {
        return new H(false, i7, i8, str, th);
    }

    String a() {
        return this.f14046b;
    }

    final void e() {
        if (this.f14045a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f14047c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f14047c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
