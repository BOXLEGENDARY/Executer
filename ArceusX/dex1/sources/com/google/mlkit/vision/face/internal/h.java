package com.google.mlkit.vision.face.internal;

import R3.A4;
import R3.B4;
import R3.C1056e4;
import R3.C1112l4;
import R3.C1130n6;
import R3.C1154q6;
import R3.C4;
import R3.EnumC1064f4;
import R3.EnumC1072g4;
import R3.EnumC1088i4;
import R3.EnumC1096j4;
import R3.EnumC1217z4;
import R3.InterfaceC1034b6;
import R3.InterfaceC1114l6;
import R3.V4;
import java.util.concurrent.atomic.AtomicReference;
import o5.C2692i;
import w5.C2976e;

public final class h {

    static final AtomicReference f19330a = new AtomicReference();

    public static C1112l4 a(C2976e c2976e) {
        C1056e4 c1056e4 = new C1056e4();
        int iD = c2976e.d();
        c1056e4.d(iD != 1 ? iD != 2 ? EnumC1088i4.UNKNOWN_LANDMARKS : EnumC1088i4.ALL_LANDMARKS : EnumC1088i4.NO_LANDMARKS);
        int iB = c2976e.b();
        c1056e4.a(iB != 1 ? iB != 2 ? EnumC1064f4.UNKNOWN_CLASSIFICATIONS : EnumC1064f4.ALL_CLASSIFICATIONS : EnumC1064f4.NO_CLASSIFICATIONS);
        int iE = c2976e.e();
        c1056e4.f(iE != 1 ? iE != 2 ? EnumC1096j4.UNKNOWN_PERFORMANCE : EnumC1096j4.ACCURATE : EnumC1096j4.FAST);
        int iC = c2976e.c();
        c1056e4.b(iC != 1 ? iC != 2 ? EnumC1072g4.UNKNOWN_CONTOURS : EnumC1072g4.ALL_CONTOURS : EnumC1072g4.NO_CONTOURS);
        c1056e4.c(Boolean.valueOf(c2976e.g()));
        c1056e4.e(Float.valueOf(c2976e.a()));
        return c1056e4.k();
    }

    public static String b() {
        return true != d() ? "play-services-mlkit-face-detection" : "face-detection";
    }

    public static void c(C1130n6 c1130n6, final boolean z7, final A4 a42) {
        c1130n6.f(new InterfaceC1114l6() {
            @Override
            public final InterfaceC1034b6 zza() {
                boolean z8 = z7;
                A4 a43 = a42;
                C4 c42 = new C4();
                c42.e(z8 ? EnumC1217z4.TYPE_THICK : EnumC1217z4.TYPE_THIN);
                V4 v42 = new V4();
                v42.b(a43);
                c42.h(v42.c());
                return C1154q6.e(c42);
            }
        }, B4.ON_DEVICE_FACE_LOAD);
    }

    static boolean d() {
        AtomicReference atomicReference = f19330a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zA = a.a(C2692i.c().b());
        atomicReference.set(Boolean.valueOf(zA));
        return zA;
    }
}
