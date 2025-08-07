package com.google.mlkit.vision.face.internal;

import R3.P;
import S4.C1529d;
import S4.e;
import S4.q;
import com.google.mlkit.vision.face.internal.d;
import java.util.List;
import o5.C2687d;
import o5.C2692i;

public class FaceRegistrar implements S4.i {
    @Override
    public final List getComponents() {
        return P.n(C1529d.c(d.class).b(q.h(C2692i.class)).f(new S4.h() {
            @Override
            public final Object a(e eVar) {
                return new d((C2692i) eVar.a(C2692i.class));
            }
        }).d(), C1529d.c(c.class).b(q.h(d.class)).b(q.h(C2687d.class)).f(new S4.h() {
            @Override
            public final Object a(S4.e eVar) {
                return new c((d) eVar.a(d.class), (C2687d) eVar.a(C2687d.class));
            }
        }).d());
    }
}
