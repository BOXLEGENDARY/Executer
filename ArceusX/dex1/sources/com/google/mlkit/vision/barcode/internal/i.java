package com.google.mlkit.vision.barcode.internal;

import O3.A9;
import O3.B9;
import O3.C0557a1;
import O3.C0563a7;
import O3.C0568b1;
import O3.C0590d1;
import O3.C0600e0;
import O3.C0716o6;
import O3.C0759s6;
import O3.C0828y9;
import O3.C0836z6;
import O3.EnumC0770t6;
import O3.InterfaceC0708n9;
import O3.InterfaceC0817x9;
import O3.L6;
import O3.M6;
import O3.N6;
import O3.O6;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import k5.C2518a;
import n3.C2651i;
import o5.AbstractC2689f;
import o5.C2690g;
import o5.C2692i;
import q5.C2735b;
import r5.C2756a;
import u5.C2938a;
import v5.C2946a;
import v5.C2949d;

public final class i extends AbstractC2689f {

    private static final C2949d f19260j = C2949d.b();

    static boolean f19261k = true;

    private final C2735b f19262d;

    private final j f19263e;

    private final C0828y9 f19264f;

    private final A9 f19265g;

    private final C2946a f19266h = new C2946a();

    private boolean f19267i;

    public i(C2692i c2692i, C2735b c2735b, j jVar, C0828y9 c0828y9) {
        C2651i.m(c2692i, "MlKitContext can not be null");
        C2651i.m(c2735b, "BarcodeScannerOptions can not be null");
        this.f19262d = c2735b;
        this.f19263e = jVar;
        this.f19264f = c0828y9;
        this.f19265g = A9.a(c2692i.b());
    }

    private final void m(final M6 m62, long j7, final C2938a c2938a, List list) {
        final C0600e0 c0600e0 = new C0600e0();
        final C0600e0 c0600e02 = new C0600e0();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2756a c2756a = (C2756a) it.next();
                c0600e0.e(b.a(c2756a.c()));
                c0600e02.e(b.b(c2756a.e()));
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j7;
        this.f19264f.f(new InterfaceC0817x9() {
            @Override
            public final InterfaceC0708n9 zza() {
                return this.f19253a.j(jElapsedRealtime, m62, c0600e0, c0600e02, c2938a);
            }
        }, N6.ON_DEVICE_BARCODE_DETECT);
        C0568b1 c0568b1 = new C0568b1();
        c0568b1.e(m62);
        c0568b1.f(Boolean.valueOf(f19261k));
        c0568b1.g(b.c(this.f19262d));
        c0568b1.c(c0600e0.g());
        c0568b1.d(c0600e02.g());
        final C0590d1 c0590d1H = c0568b1.h();
        final h hVar = new h(this);
        final C0828y9 c0828y9 = this.f19264f;
        final N6 n62 = N6.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        C2690g.d().execute(new Runnable() {
            @Override
            public final void run() {
                c0828y9.h(n62, c0590d1H, jElapsedRealtime, hVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f19265g.c(true != this.f19267i ? 24301 : 24302, m62.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    @Override
    public final synchronized void b() throws C2518a {
        this.f19267i = this.f19263e.a();
    }

    @Override
    public final synchronized void d() {
        try {
            this.f19263e.zzb();
            f19261k = true;
            O6 o62 = new O6();
            L6 l62 = this.f19267i ? L6.TYPE_THICK : L6.TYPE_THIN;
            C0828y9 c0828y9 = this.f19264f;
            o62.e(l62);
            C0563a7 c0563a7 = new C0563a7();
            c0563a7.i(b.c(this.f19262d));
            o62.g(c0563a7.j());
            c0828y9.d(B9.e(o62), N6.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th) {
            throw th;
        }
    }

    final InterfaceC0708n9 j(long j7, M6 m62, C0600e0 c0600e0, C0600e0 c0600e02, C2938a c2938a) {
        C0563a7 c0563a7 = new C0563a7();
        C0836z6 c0836z6 = new C0836z6();
        c0836z6.c(Long.valueOf(j7));
        c0836z6.d(m62);
        c0836z6.e(Boolean.valueOf(f19261k));
        Boolean bool = Boolean.TRUE;
        c0836z6.a(bool);
        c0836z6.b(bool);
        c0563a7.h(c0836z6.f());
        c0563a7.i(b.c(this.f19262d));
        c0563a7.e(c0600e0.g());
        c0563a7.f(c0600e02.g());
        int iH = c2938a.h();
        int iD = f19260j.d(c2938a);
        C0759s6 c0759s6 = new C0759s6();
        c0759s6.a(iH != -1 ? iH != 35 ? iH != 842094169 ? iH != 16 ? iH != 17 ? EnumC0770t6.UNKNOWN_FORMAT : EnumC0770t6.NV21 : EnumC0770t6.NV16 : EnumC0770t6.YV12 : EnumC0770t6.YUV_420_888 : EnumC0770t6.f3578A);
        c0759s6.b(Integer.valueOf(iD));
        c0563a7.g(c0759s6.d());
        O6 o62 = new O6();
        o62.e(this.f19267i ? L6.TYPE_THICK : L6.TYPE_THIN);
        o62.g(c0563a7.j());
        return B9.e(o62);
    }

    final InterfaceC0708n9 k(C0590d1 c0590d1, int i7, C0716o6 c0716o6) {
        O6 o62 = new O6();
        o62.e(this.f19267i ? L6.TYPE_THICK : L6.TYPE_THIN);
        C0557a1 c0557a1 = new C0557a1();
        c0557a1.a(Integer.valueOf(i7));
        c0557a1.c(c0590d1);
        c0557a1.b(c0716o6);
        o62.d(c0557a1.e());
        return B9.e(o62);
    }

    @Override
    public final synchronized List i(C2938a c2938a) throws C2518a {
        List listB;
        C2946a c2946a = this.f19266h;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c2946a.a(c2938a);
        try {
            listB = this.f19263e.b(c2938a);
            m(M6.NO_ERROR, jElapsedRealtime, c2938a, listB);
            f19261k = false;
        } catch (C2518a e7) {
            m(e7.a() == 14 ? M6.MODEL_NOT_DOWNLOADED : M6.UNKNOWN_ERROR, jElapsedRealtime, c2938a, null);
            throw e7;
        }
        return listB;
    }
}
