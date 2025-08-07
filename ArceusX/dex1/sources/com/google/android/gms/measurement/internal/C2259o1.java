package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class C2259o1 extends T3 {
    public C2259o1(c4 c4Var) {
        super(c4Var);
    }

    @Override
    protected final boolean l() {
        return false;
    }

    public final boolean m() {
        i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f16818a.f().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
