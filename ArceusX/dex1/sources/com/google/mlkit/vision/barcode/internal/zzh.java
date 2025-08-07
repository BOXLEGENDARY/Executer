package com.google.mlkit.vision.barcode.internal;

import O3.B9;
import O3.C0563a7;
import O3.C0585c7;
import O3.C0828y9;
import O3.L6;
import O3.N6;
import O3.N9;
import O3.O6;
import a4.C1576m;
import a4.InterfaceC1573j;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import java.util.concurrent.Executor;
import o5.C2692i;
import o5.m;
import q5.C2735b;
import q5.InterfaceC2734a;
import r5.C2756a;
import u5.C2938a;

public final class zzh extends MobileVisionBase implements InterfaceC2734a {

    private static final C2735b f19281F = new C2735b.a().a();

    private final boolean f19282A;

    private final C2735b f19283B;

    final N9 f19284C;

    private int f19285D;

    private boolean f19286E;

    zzh(C2735b c2735b, i iVar, Executor executor, C0828y9 c0828y9, C2692i c2692i) {
        super(iVar, executor);
        c2735b.b();
        this.f19283B = c2735b;
        boolean zF = b.f();
        this.f19282A = zF;
        C0563a7 c0563a7 = new C0563a7();
        c0563a7.i(b.c(c2735b));
        C0585c7 c0585c7J = c0563a7.j();
        O6 o62 = new O6();
        o62.e(zF ? L6.TYPE_THICK : L6.TYPE_THIN);
        o62.g(c0585c7J);
        c0828y9.d(B9.f(o62, 1), N6.ON_DEVICE_BARCODE_CREATE);
    }

    private final Task K(Task task, final int i7, final int i8) {
        return task.p(new InterfaceC1573j() {
            @Override
            public final Task a(Object obj) {
                return this.f19246a.A(i7, i8, (List) obj);
            }
        });
    }

    final Task A(int i7, int i8, List list) throws Exception {
        return C1576m.f(list);
    }

    @Override
    public final int H() {
        return 1;
    }

    @Override
    public final Feature[] b() {
        return this.f19282A ? m.f22461a : new Feature[]{m.f22462b};
    }

    @Override
    public final synchronized void close() {
        super.close();
    }

    @Override
    public final Task<List<C2756a>> d(C2938a c2938a) {
        return K(super.f(c2938a), c2938a.m(), c2938a.i());
    }
}
