package com.google.android.gms.common.api.internal;

import a4.C1574k;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C1804d;
import l3.C2526a;
import l3.C2526a.b;
import m3.C2560A;
import m3.InterfaceC2578i;
import n3.C2651i;

public class C1807g<A extends C2526a.b, L> {

    public final AbstractC1806f<A, L> f14138a;

    public final AbstractC1809i f14139b;

    public final Runnable f14140c;

    public static class a<A extends C2526a.b, L> {

        private InterfaceC2578i f14141a;

        private InterfaceC2578i f14142b;

        private C1804d f14144d;

        private Feature[] f14145e;

        private int f14147g;

        private Runnable f14143c = new Runnable() {
            @Override
            public final void run() {
            }
        };

        private boolean f14146f = true;

        a(m3.z zVar) {
        }

        public C1807g<A, L> a() {
            C2651i.b(this.f14141a != null, "Must set register function");
            C2651i.b(this.f14142b != null, "Must set unregister function");
            C2651i.b(this.f14144d != null, "Must set holder");
            return new C1807g<>(new A(this, this.f14144d, this.f14145e, this.f14146f, this.f14147g), new B(this, (C1804d.a) C2651i.m(this.f14144d.b(), "Key must not be null")), this.f14143c, null);
        }

        public a<A, L> b(InterfaceC2578i<A, C1574k<Void>> interfaceC2578i) {
            this.f14141a = interfaceC2578i;
            return this;
        }

        public a<A, L> c(boolean z7) {
            this.f14146f = z7;
            return this;
        }

        public a<A, L> d(Feature... featureArr) {
            this.f14145e = featureArr;
            return this;
        }

        public a<A, L> e(int i7) {
            this.f14147g = i7;
            return this;
        }

        public a<A, L> f(InterfaceC2578i<A, C1574k<Boolean>> interfaceC2578i) {
            this.f14142b = interfaceC2578i;
            return this;
        }

        public a<A, L> g(C1804d<L> c1804d) {
            this.f14144d = c1804d;
            return this;
        }
    }

    C1807g(AbstractC1806f abstractC1806f, AbstractC1809i abstractC1809i, Runnable runnable, C2560A c2560a) {
        this.f14138a = abstractC1806f;
        this.f14139b = abstractC1809i;
        this.f14140c = runnable;
    }

    public static <A extends C2526a.b, L> a<A, L> a() {
        return new a<>(null);
    }
}
