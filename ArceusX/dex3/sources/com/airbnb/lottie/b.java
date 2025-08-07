package com.airbnb.lottie;

import P1.g;
import P1.k;
import android.os.Handler;
import android.os.Looper;
import b2.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class b<T> {
    public static Executor e = Executors.newCachedThreadPool();
    private final Set<g<T>> a;
    private final Set<g<Throwable>> b;
    private final Handler c;
    private volatile k<T> d;

    class a implements Runnable {
        a() {
        }

        @Override
        public void run() {
            if (b.this.d == null) {
                return;
            }
            k kVar = b.this.d;
            if (kVar.b() != null) {
                b.this.i(kVar.b());
            } else {
                b.this.g(kVar.a());
            }
        }
    }

    private class C0061b extends FutureTask<k<T>> {
        C0061b(Callable<k<T>> callable) {
            super(callable);
        }

        @Override
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                b.this.l(get());
            } catch (InterruptedException | ExecutionException e) {
                b.this.l(new k(e));
            }
        }
    }

    public b(Callable<k<T>> callable) {
        this(callable, false);
    }

    public synchronized void g(Throwable th) {
        ArrayList arrayList = new ArrayList(this.b);
        if (arrayList.isEmpty()) {
            d.d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).onResult(th);
        }
    }

    private void h() {
        this.c.post(new a());
    }

    public synchronized void i(T t) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).onResult(t);
        }
    }

    public void l(k<T> kVar) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = kVar;
        h();
    }

    public synchronized b<T> e(g<Throwable> gVar) {
        try {
            if (this.d != null && this.d.a() != null) {
                gVar.onResult(this.d.a());
            }
            this.b.add(gVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized b<T> f(g<T> gVar) {
        try {
            if (this.d != null && this.d.b() != null) {
                gVar.onResult(this.d.b());
            }
            this.a.add(gVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized b<T> j(g<Throwable> gVar) {
        this.b.remove(gVar);
        return this;
    }

    public synchronized b<T> k(g<T> gVar) {
        this.a.remove(gVar);
        return this;
    }

    b(Callable<k<T>> callable, boolean z) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (!z) {
            e.execute(new C0061b(callable));
            return;
        }
        try {
            l(callable.call());
        } catch (Throwable th) {
            l(new k<>(th));
        }
    }
}
