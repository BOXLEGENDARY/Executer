package com.google.android.gms.common.api.internal;

import a4.C1574k;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C1804d;
import l3.C2526a;
import l3.C2526a.b;

public abstract class AbstractC1806f<A extends C2526a.b, L> {

    private final C1804d f14134a;

    private final Feature[] f14135b;

    private final boolean f14136c;

    private final int f14137d;

    protected AbstractC1806f(C1804d<L> c1804d, Feature[] featureArr, boolean z7, int i7) {
        this.f14134a = c1804d;
        this.f14135b = featureArr;
        this.f14136c = z7;
        this.f14137d = i7;
    }

    public void a() {
        this.f14134a.a();
    }

    public C1804d.a<L> b() {
        return this.f14134a.b();
    }

    public Feature[] c() {
        return this.f14135b;
    }

    protected abstract void d(A a2, C1574k<Void> c1574k) throws RemoteException;

    public final int e() {
        return this.f14137d;
    }

    public final boolean f() {
        return this.f14136c;
    }
}
