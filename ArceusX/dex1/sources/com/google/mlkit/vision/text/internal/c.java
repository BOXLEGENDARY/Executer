package com.google.mlkit.vision.text.internal;

import S3.C1317g6;
import S3.C1352j8;
import S3.C1372l6;
import S3.C1374l8;
import S3.C1396n8;
import S3.C1440r9;
import S3.C1448s6;
import S3.C1454t1;
import S3.C1462t9;
import S3.C1465u1;
import S3.C1473u9;
import S3.C1487w1;
import S3.E6;
import S3.EnumC1383m6;
import S3.F6;
import S3.G6;
import S3.H6;
import S3.InterfaceC1309f9;
import S3.InterfaceC1430q9;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import k5.C2518a;
import o5.AbstractC2689f;
import o5.C2690g;
import o5.C2692i;
import u5.C2938a;
import v5.C2949d;
import z5.C3082a;

public class c extends AbstractC2689f<C3082a, C2938a> {

    static boolean f19340i = true;

    private final k f19342d;

    private final C1440r9 f19343e;

    private final C1462t9 f19344f;

    private final z5.d f19345g;

    private static final C2949d f19341j = C2949d.b();

    private static final o5.o f19339h = new o5.o();

    c(C1440r9 c1440r9, k kVar, z5.d dVar) {
        super((dVar.d() == 8 || dVar.d() == 7) ? new o5.o() : f19339h);
        this.f19343e = c1440r9;
        this.f19342d = kVar;
        this.f19344f = C1462t9.a(C2692i.c().b());
        this.f19345g = dVar;
    }

    private final void m(final F6 f62, long j7, final C2938a c2938a) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j7;
        this.f19343e.f(new InterfaceC1430q9() {
            @Override
            public final InterfaceC1309f9 zza() {
                return this.f19363a.j(jElapsedRealtime, f62, c2938a);
            }
        }, G6.f6745z);
        C1465u1 c1465u1 = new C1465u1();
        c1465u1.a(f62);
        c1465u1.b(Boolean.valueOf(f19340i));
        C1396n8 c1396n8 = new C1396n8();
        c1396n8.a(a.a(this.f19345g.d()));
        c1465u1.c(c1396n8.c());
        final C1487w1 c1487w1D = c1465u1.d();
        final o oVar = new o(this);
        final G6 g62 = G6.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
        Executor executorD = C2690g.d();
        final C1440r9 c1440r9 = this.f19343e;
        executorD.execute(new Runnable() {
            @Override
            public final void run() {
                c1440r9.h(g62, c1487w1D, jElapsedRealtime, oVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f19344f.c(this.f19345g.h(), f62.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    @Override
    public final synchronized void b() throws C2518a {
        this.f19342d.zzb();
    }

    @Override
    public final synchronized void d() {
        f19340i = true;
        this.f19342d.a();
    }

    final InterfaceC1309f9 j(long j7, F6 f62, C2938a c2938a) {
        C1352j8 c1352j8 = new C1352j8();
        C1448s6 c1448s6 = new C1448s6();
        c1448s6.c(Long.valueOf(j7));
        c1448s6.d(f62);
        c1448s6.e(Boolean.valueOf(f19340i));
        Boolean bool = Boolean.TRUE;
        c1448s6.a(bool);
        c1448s6.b(bool);
        c1352j8.d(c1448s6.f());
        C2949d c2949d = f19341j;
        int iC = c2949d.c(c2938a);
        int iD = c2949d.d(c2938a);
        C1372l6 c1372l6 = new C1372l6();
        c1372l6.a(iC != -1 ? iC != 35 ? iC != 842094169 ? iC != 16 ? iC != 17 ? EnumC1383m6.UNKNOWN_FORMAT : EnumC1383m6.NV21 : EnumC1383m6.NV16 : EnumC1383m6.YV12 : EnumC1383m6.YUV_420_888 : EnumC1383m6.BITMAP);
        c1372l6.b(Integer.valueOf(iD));
        c1352j8.c(c1372l6.d());
        C1396n8 c1396n8 = new C1396n8();
        c1396n8.a(a.a(this.f19345g.d()));
        c1352j8.e(c1396n8.c());
        C1374l8 c1374l8F = c1352j8.f();
        H6 h62 = new H6();
        h62.e(this.f19345g.g() ? E6.TYPE_THICK : E6.TYPE_THIN);
        h62.h(c1374l8F);
        return C1473u9.e(h62);
    }

    final InterfaceC1309f9 k(C1487w1 c1487w1, int i7, C1317g6 c1317g6) {
        H6 h62 = new H6();
        h62.e(this.f19345g.g() ? E6.TYPE_THICK : E6.TYPE_THIN);
        C1454t1 c1454t1 = new C1454t1();
        c1454t1.a(Integer.valueOf(i7));
        c1454t1.c(c1487w1);
        c1454t1.b(c1317g6);
        h62.d(c1454t1.e());
        return C1473u9.e(h62);
    }

    @Override
    public final synchronized C3082a i(C2938a c2938a) throws C2518a {
        C3082a c3082aB;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            c3082aB = this.f19342d.b(c2938a);
            m(F6.NO_ERROR, jElapsedRealtime, c2938a);
            f19340i = false;
        } catch (C2518a e7) {
            m(e7.a() == 14 ? F6.MODEL_NOT_DOWNLOADED : F6.UNKNOWN_ERROR, jElapsedRealtime, c2938a);
            throw e7;
        }
        return c3082aB;
    }
}
