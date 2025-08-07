package com.google.android.gms.common.api.internal;

import a4.C1574k;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import l3.C2526a;
import l3.C2526a.b;
import m3.C2565F;
import m3.InterfaceC2578i;
import n3.C2651i;

public abstract class AbstractC1808h<A extends C2526a.b, ResultT> {

    private final Feature[] f14148a;

    private final boolean f14149b;

    private final int f14150c;

    public static class a<A extends C2526a.b, ResultT> {

        private InterfaceC2578i f14151a;

        private Feature[] f14153c;

        private boolean f14152b = true;

        private int f14154d = 0;

        a(C2565F c2565f) {
        }

        public AbstractC1808h<A, ResultT> a() {
            C2651i.b(this.f14151a != null, "execute parameter required");
            return new C(this, this.f14153c, this.f14152b, this.f14154d);
        }

        public a<A, ResultT> b(InterfaceC2578i<A, C1574k<ResultT>> interfaceC2578i) {
            this.f14151a = interfaceC2578i;
            return this;
        }

        public a<A, ResultT> c(boolean z7) {
            this.f14152b = z7;
            return this;
        }

        public a<A, ResultT> d(Feature... featureArr) {
            this.f14153c = featureArr;
            return this;
        }

        public a<A, ResultT> e(int i7) {
            this.f14154d = i7;
            return this;
        }
    }

    protected AbstractC1808h(Feature[] featureArr, boolean z7, int i7) {
        this.f14148a = featureArr;
        boolean z8 = false;
        if (featureArr != null && z7) {
            z8 = true;
        }
        this.f14149b = z8;
        this.f14150c = i7;
    }

    public static <A extends C2526a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    protected abstract void b(A a2, C1574k<ResultT> c1574k) throws RemoteException;

    public boolean c() {
        return this.f14149b;
    }

    public final int d() {
        return this.f14150c;
    }

    public final Feature[] e() {
        return this.f14148a;
    }
}
