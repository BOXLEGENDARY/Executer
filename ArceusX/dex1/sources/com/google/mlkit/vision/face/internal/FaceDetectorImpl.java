package com.google.mlkit.vision.face.internal;

import R3.B4;
import R3.C1130n6;
import R3.C1154q6;
import R3.C4;
import R3.EnumC1217z4;
import R3.S4;
import R3.y6;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import java.util.concurrent.Executor;
import o5.C2687d;
import o5.m;
import u5.C2938a;
import w5.C2972a;
import w5.C2976e;
import w5.InterfaceC2975d;
import x5.C2991a;

public class FaceDetectorImpl extends MobileVisionBase<List<C2972a>> implements InterfaceC2975d {

    static final C2976e f19302B = new C2976e.a().a();

    private final boolean f19303A;

    FaceDetectorImpl(g gVar, C2687d c2687d, C2976e c2976e, C2991a c2991a) {
        Executor executorA = c2687d.a(c2976e.f());
        C1130n6 c1130n6B = y6.b(h.b());
        super(gVar, executorA);
        boolean zD = h.d();
        this.f19303A = zD;
        C4 c42 = new C4();
        c42.e(zD ? EnumC1217z4.TYPE_THICK : EnumC1217z4.TYPE_THIN);
        S4 s42 = new S4();
        s42.e(h.a(c2976e));
        c42.g(s42.i());
        c1130n6B.d(C1154q6.f(c42, 1), B4.ON_DEVICE_FACE_CREATE);
    }

    @Override
    public final int H() {
        return 2;
    }

    @Override
    public final Feature[] b() {
        return this.f19303A ? m.f22461a : new Feature[]{m.f22464d};
    }

    @Override
    public final Task<List<C2972a>> d(C2938a c2938a) {
        return super.f(c2938a);
    }
}
