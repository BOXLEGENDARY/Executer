package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.util.concurrent.Executor;
import n3.C2651i;
import w3.ExecutorC2968a;

public final class C1804d<L> {

    private final Executor f14129a;

    private volatile Object f14130b;

    private volatile a f14131c;

    public static final class a<L> {

        private final Object f14132a;

        private final String f14133b;

        a(L l7, String str) {
            this.f14132a = l7;
            this.f14133b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14132a == aVar.f14132a && this.f14133b.equals(aVar.f14133b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f14132a) * 31) + this.f14133b.hashCode();
        }
    }

    public interface b<L> {
        void a(L l7);

        void b();
    }

    C1804d(Looper looper, L l7, String str) {
        this.f14129a = new ExecutorC2968a(looper);
        this.f14130b = C2651i.m(l7, "Listener must not be null");
        this.f14131c = new a(l7, C2651i.f(str));
    }

    public void a() {
        this.f14130b = null;
        this.f14131c = null;
    }

    public a<L> b() {
        return this.f14131c;
    }

    public void c(final b<? super L> bVar) {
        C2651i.m(bVar, "Notifier must not be null");
        this.f14129a.execute(new Runnable() {
            @Override
            public final void run() {
                this.f14195d.d(bVar);
            }
        });
    }

    final void d(b bVar) {
        Object obj = this.f14130b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e7) {
            bVar.b();
            throw e7;
        }
    }

    C1804d(Executor executor, L l7, String str) {
        this.f14129a = (Executor) C2651i.m(executor, "Executor must not be null");
        this.f14130b = C2651i.m(l7, "Listener must not be null");
        this.f14131c = new a(l7, C2651i.f(str));
    }
}
