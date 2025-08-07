package com.google.common.util.concurrent;

import com.github.luben.zstd.BuildConfig;
import com.google.common.util.concurrent.j;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

abstract class b<I, O, F, T> extends j.a<O> implements Runnable {

    p<? extends I> f18939A;

    F f18940B;

    private static final class a<I, O> extends b<I, O, g<? super I, ? extends O>, p<? extends O>> {
        a(p<? extends I> pVar, g<? super I, ? extends O> gVar) {
            super(pVar, gVar);
        }

        @Override
        public p<? extends O> I(g<? super I, ? extends O> gVar, I i7) throws Exception {
            p<? extends O> pVarApply = gVar.apply(i7);
            K4.g.i(pVarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", gVar);
            return pVarApply;
        }

        @Override
        public void J(p<? extends O> pVar) {
            F(pVar);
        }
    }

    b(p<? extends I> pVar, F f7) {
        this.f18939A = (p) K4.g.g(pVar);
        this.f18940B = (F) K4.g.g(f7);
    }

    static <I, O> p<O> H(p<I> pVar, g<? super I, ? extends O> gVar, Executor executor) {
        K4.g.g(executor);
        a aVar = new a(pVar, gVar);
        pVar.c(aVar, q.b(executor, aVar));
        return aVar;
    }

    @Override
    protected String A() {
        String string;
        p<? extends I> pVar = this.f18939A;
        F f7 = this.f18940B;
        String strA = super.A();
        if (pVar != null) {
            String strValueOf = String.valueOf(pVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(strValueOf);
            sb.append("], ");
            string = sb.toString();
        } else {
            string = BuildConfig.FLAVOR;
        }
        if (f7 == null) {
            if (strA == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(string);
            return strA.length() != 0 ? strValueOf2.concat(strA) : new String(strValueOf2);
        }
        String strValueOf3 = String.valueOf(f7);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 11 + strValueOf3.length());
        sb2.append(string);
        sb2.append("function=[");
        sb2.append(strValueOf3);
        sb2.append("]");
        return sb2.toString();
    }

    abstract T I(F f7, I i7) throws Exception;

    abstract void J(T t7);

    @Override
    protected final void o() {
        z(this.f18939A);
        this.f18939A = null;
        this.f18940B = null;
    }

    @Override
    public final void run() {
        p<? extends I> pVar = this.f18939A;
        F f7 = this.f18940B;
        if ((isCancelled() | (pVar == null)) || (f7 == null)) {
            return;
        }
        this.f18939A = null;
        if (pVar.isCancelled()) {
            F(pVar);
            return;
        }
        try {
            try {
                Object objI = I(f7, l.a(pVar));
                this.f18940B = null;
                J(objI);
            } catch (Throwable th) {
                try {
                    E(th);
                } finally {
                    this.f18940B = null;
                }
            }
        } catch (Error e7) {
            E(e7);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e8) {
            E(e8);
        } catch (ExecutionException e9) {
            E(e9.getCause());
        }
    }
}
