package com.google.common.util.concurrent;

import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class e<InputT, OutputT> extends f<OutputT> {

    private static final Logger f18946H = Logger.getLogger(e.class.getName());

    private L4.b<? extends p<? extends InputT>> f18947E;

    private final boolean f18948F;

    private final boolean f18949G;

    enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    e(L4.b<? extends p<? extends InputT>> bVar, boolean z7, boolean z8) {
        super(bVar.size());
        this.f18947E = (L4.b) K4.g.g(bVar);
        this.f18948F = z7;
        this.f18949G = z8;
    }

    private static boolean Q(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    private void S(int i7, Future<? extends InputT> future) {
        try {
            R(i7, l.a(future));
        } catch (ExecutionException e7) {
            V(e7.getCause());
        } catch (Throwable th) {
            V(th);
        }
    }

    public void Y(L4.b<? extends Future<? extends InputT>> bVar) {
        int iM = M();
        K4.g.m(iM >= 0, GObvYfBKohxpYX.QiXRXkCWZzggWOf);
        if (iM == 0) {
            a0(bVar);
        }
    }

    private void V(Throwable th) {
        K4.g.g(th);
        if (this.f18948F && !E(th) && Q(N(), th)) {
            Z(th);
        } else if (th instanceof Error) {
            Z(th);
        }
    }

    public void X(p pVar, int i7) {
        try {
            if (pVar.isCancelled()) {
                this.f18947E = null;
                cancel(false);
            } else {
                S(i7, pVar);
            }
            Y(null);
        } catch (Throwable th) {
            Y(null);
            throw th;
        }
    }

    private static void Z(Throwable th) {
        f18946H.log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
    }

    private void a0(L4.b<? extends Future<? extends InputT>> bVar) {
        if (bVar != null) {
            L4.j<? extends Future<? extends InputT>> it = bVar.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    S(i7, next);
                }
                i7++;
            }
        }
        L();
        U();
        b0(a.ALL_INPUT_FUTURES_PROCESSED);
    }

    @Override
    protected final String A() {
        L4.b<? extends p<? extends InputT>> bVar = this.f18947E;
        if (bVar == null) {
            return super.A();
        }
        String strValueOf = String.valueOf(bVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
        sb.append("futures=");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override
    final void K(Set<Throwable> set) {
        K4.g.g(set);
        if (isCancelled()) {
            return;
        }
        Throwable thA = a();
        Objects.requireNonNull(thA);
        Q(set, thA);
    }

    abstract void R(int i7, InputT inputt);

    abstract void U();

    final void W() {
        Objects.requireNonNull(this.f18947E);
        if (this.f18947E.isEmpty()) {
            U();
            return;
        }
        if (!this.f18948F) {
            final L4.b<? extends p<? extends InputT>> bVar = this.f18949G ? this.f18947E : null;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f18944d.Y(bVar);
                }
            };
            L4.j<? extends p<? extends InputT>> it = this.f18947E.iterator();
            while (it.hasNext()) {
                it.next().c(runnable, q.a());
            }
            return;
        }
        L4.j<? extends p<? extends InputT>> it2 = this.f18947E.iterator();
        final int i7 = 0;
        while (it2.hasNext()) {
            final p<? extends InputT> next = it2.next();
            next.c(new Runnable() {
                @Override
                public final void run() {
                    this.f18941d.X(next, i7);
                }
            }, q.a());
            i7++;
        }
    }

    void b0(a aVar) {
        K4.g.g(aVar);
        this.f18947E = null;
    }

    @Override
    protected final void o() {
        super.o();
        L4.b<? extends p<? extends InputT>> bVar = this.f18947E;
        b0(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (bVar != null)) {
            boolean zG = G();
            L4.j<? extends p<? extends InputT>> it = bVar.iterator();
            while (it.hasNext()) {
                it.next().cancel(zG);
            }
        }
    }
}
