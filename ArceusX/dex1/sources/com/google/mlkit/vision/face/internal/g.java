package com.google.mlkit.vision.face.internal;

import R3.A4;
import R3.B4;
import R3.C1040c4;
import R3.C1120m4;
import R3.C1130n6;
import R3.C1146p6;
import R3.C1154q6;
import R3.C1159r4;
import R3.C4;
import R3.EnumC1128n4;
import R3.EnumC1217z4;
import R3.InterfaceC1034b6;
import R3.InterfaceC1114l6;
import R3.N0;
import R3.O0;
import R3.Q0;
import R3.S4;
import R3.U4;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k5.C2518a;
import n3.C2651i;
import o5.AbstractC2689f;
import o5.C2690g;
import o5.C2692i;
import u5.C2938a;
import v5.C2946a;
import v5.C2949d;
import w5.C2972a;
import w5.C2976e;

public final class g extends AbstractC2689f {

    static final AtomicBoolean f19322j = new AtomicBoolean(true);

    private static final C2949d f19323k = C2949d.b();

    private final C2976e f19324d;

    private final C1130n6 f19325e;

    private final C1146p6 f19326f;

    private final b f19327g;

    private boolean f19328h;

    private final C2946a f19329i = new C2946a();

    public g(C1130n6 c1130n6, C2976e c2976e, b bVar) {
        C2651i.m(c2976e, "FaceDetectorOptions can not be null");
        this.f19324d = c2976e;
        this.f19325e = c1130n6;
        this.f19327g = bVar;
        this.f19326f = C1146p6.a(C2692i.c().b());
    }

    static void m(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C2972a) it.next()).g(-1);
        }
    }

    private final synchronized void n(final A4 a42, long j7, final C2938a c2938a, final int i7, final int i8) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j7;
        this.f19325e.f(new InterfaceC1114l6() {
            @Override
            public final InterfaceC1034b6 zza() {
                return this.f19315a.j(jElapsedRealtime, a42, i7, i8, c2938a);
            }
        }, B4.ON_DEVICE_FACE_DETECT);
        O0 o02 = new O0();
        o02.c(a42);
        o02.d(Boolean.valueOf(f19322j.get()));
        o02.a(Integer.valueOf(i7));
        o02.e(Integer.valueOf(i8));
        o02.b(h.a(this.f19324d));
        final Q0 q0F = o02.f();
        final f fVar = new f(this);
        final C1130n6 c1130n6 = this.f19325e;
        final B4 b42 = B4.AGGREGATED_ON_DEVICE_FACE_DETECTION;
        final byte[] bArr = null;
        C2690g.d().execute(new Runnable(b42, q0F, jElapsedRealtime, fVar, bArr) {

            public final B4 f5591e;

            public final Object f5592i;

            public final long f5593v;

            public final com.google.mlkit.vision.face.internal.f f5594w;

            @Override
            public final void run() {
                this.f5590d.h(this.f5591e, this.f5592i, this.f5593v, this.f5594w);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f19326f.c(true != this.f19328h ? 24303 : 24304, a42.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    @Override
    public final synchronized void b() throws C2518a {
        this.f19328h = this.f19327g.d();
    }

    @Override
    public final synchronized void d() {
        try {
            this.f19327g.zzb();
            f19322j.set(true);
            C1130n6 c1130n6 = this.f19325e;
            C4 c42 = new C4();
            c42.e(this.f19328h ? EnumC1217z4.TYPE_THICK : EnumC1217z4.TYPE_THIN);
            c1130n6.d(C1154q6.e(c42), B4.ON_DEVICE_FACE_CLOSE);
        } catch (Throwable th) {
            throw th;
        }
    }

    final InterfaceC1034b6 j(long j7, A4 a42, int i7, int i8, C2938a c2938a) {
        S4 s42 = new S4();
        C1159r4 c1159r4 = new C1159r4();
        c1159r4.c(Long.valueOf(j7));
        c1159r4.d(a42);
        c1159r4.e(Boolean.valueOf(f19322j.get()));
        Boolean bool = Boolean.TRUE;
        c1159r4.a(bool);
        c1159r4.b(bool);
        s42.g(c1159r4.f());
        s42.e(h.a(this.f19324d));
        s42.d(Integer.valueOf(i7));
        s42.h(Integer.valueOf(i8));
        C2949d c2949d = f19323k;
        int iC = c2949d.c(c2938a);
        int iD = c2949d.d(c2938a);
        C1120m4 c1120m4 = new C1120m4();
        c1120m4.a(iC != -1 ? iC != 35 ? iC != 842094169 ? iC != 16 ? iC != 17 ? EnumC1128n4.f5715e : EnumC1128n4.NV21 : EnumC1128n4.NV16 : EnumC1128n4.YV12 : EnumC1128n4.YUV_420_888 : EnumC1128n4.BITMAP);
        c1120m4.b(Integer.valueOf(iD));
        s42.f(c1120m4.d());
        U4 u4I = s42.i();
        C4 c42 = new C4();
        c42.e(this.f19328h ? EnumC1217z4.TYPE_THICK : EnumC1217z4.TYPE_THIN);
        c42.g(u4I);
        return C1154q6.e(c42);
    }

    final InterfaceC1034b6 k(Q0 q02, int i7, C1040c4 c1040c4) {
        C4 c42 = new C4();
        c42.e(this.f19328h ? EnumC1217z4.TYPE_THICK : EnumC1217z4.TYPE_THIN);
        N0 n02 = new N0();
        n02.a(Integer.valueOf(i7));
        n02.c(q02);
        n02.b(c1040c4);
        c42.d(n02.e());
        return C1154q6.e(c42);
    }

    @Override
    public final synchronized java.util.List i(u5.C2938a r21) throws k5.C2518a {
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.internal.g.i(u5.a):java.util.List");
    }
}
