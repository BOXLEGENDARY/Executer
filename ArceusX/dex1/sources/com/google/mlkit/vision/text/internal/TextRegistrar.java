package com.google.mlkit.vision.text.internal;

import S3.M;
import S4.C1529d;
import S4.q;
import com.google.mlkit.vision.text.internal.m;
import java.util.List;
import o5.C2687d;
import o5.C2692i;

public class TextRegistrar implements S4.i {
    @Override
    public final List getComponents() {
        return M.n(C1529d.c(m.class).b(q.h(C2692i.class)).f(new S4.h() {
            @Override
            public final Object a(S4.e eVar) {
                return new m((C2692i) eVar.a(C2692i.class));
            }
        }).d(), C1529d.c(l.class).b(q.h(m.class)).b(q.h(C2687d.class)).f(new S4.h() {
            @Override
            public final Object a(S4.e eVar) {
                return new l((m) eVar.a(m.class), (C2687d) eVar.a(C2687d.class));
            }
        }).d());
    }
}
