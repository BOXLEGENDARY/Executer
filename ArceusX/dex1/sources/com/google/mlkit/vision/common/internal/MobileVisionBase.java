package com.google.mlkit.vision.common.internal;

import Q3.C0916k5;
import a4.C1565b;
import a4.C1576m;
import a4.InterfaceC1569f;
import android.graphics.Matrix;
import android.media.Image;
import android.view.AbstractC1694h;
import android.view.InterfaceC1700n;
import android.view.InterfaceC1711y;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import k5.C2518a;
import n3.C2645c;
import n3.C2651i;
import o5.AbstractC2689f;
import u5.C2938a;

public class MobileVisionBase<DetectionResultT> implements Closeable, InterfaceC1700n {

    private static final C2645c f19287y = new C2645c("MobileVisionBase", BuildConfig.FLAVOR);

    public static final int f19288z = 0;

    private final AtomicBoolean f19289d = new AtomicBoolean(false);

    private final AbstractC2689f f19290e;

    private final C1565b f19291i;

    private final Executor f19292v;

    private final Task f19293w;

    public MobileVisionBase(AbstractC2689f<DetectionResultT, C2938a> abstractC2689f, Executor executor) {
        this.f19290e = abstractC2689f;
        C1565b c1565b = new C1565b();
        this.f19291i = c1565b;
        this.f19292v = executor;
        abstractC2689f.c();
        this.f19293w = abstractC2689f.a(executor, new Callable() {
            @Override
            public final Object call() {
                int i7 = MobileVisionBase.f19288z;
                return null;
            }
        }, c1565b.b()).c(new InterfaceC1569f() {
            @Override
            public final void onFailure(Exception exc) {
                MobileVisionBase.f19287y.d("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    public Task<DetectionResultT> E(Image image, int i7, Matrix matrix) {
        return f(C2938a.d(image, i7, matrix));
    }

    @Override
    @InterfaceC1711y(AbstractC1694h.a.ON_DESTROY)
    public synchronized void close() {
        if (this.f19289d.getAndSet(true)) {
            return;
        }
        this.f19291i.a();
        this.f19290e.e(this.f19292v);
    }

    public synchronized Task<DetectionResultT> f(final C2938a c2938a) {
        C2651i.m(c2938a, "InputImage can not be null");
        if (this.f19289d.get()) {
            return C1576m.e(new C2518a("This detector is already closed!", 14));
        }
        if (c2938a.m() < 32 || c2938a.i() < 32) {
            return C1576m.e(new C2518a("InputImage width and height should be at least 32!", 3));
        }
        return this.f19290e.a(this.f19292v, new Callable() {
            @Override
            public final Object call() {
                return this.f19298d.u(c2938a);
            }
        }, this.f19291i.b());
    }

    final Object u(C2938a c2938a) throws Exception {
        C0916k5 c0916k5M = C0916k5.m("detectorTaskWithResource#run");
        c0916k5M.e();
        try {
            Object objI = this.f19290e.i(c2938a);
            c0916k5M.close();
            return objI;
        } catch (Throwable th) {
            try {
                c0916k5M.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }
}
