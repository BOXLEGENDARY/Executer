package com.google.mlkit.vision.barcode.internal;

import O3.AbstractC0633h0;
import S4.C1529d;
import S4.e;
import S4.q;
import com.google.mlkit.vision.barcode.internal.f;
import java.util.List;
import o5.C2687d;
import o5.C2692i;

public class BarcodeRegistrar implements S4.i {
    @Override
    public final List getComponents() {
        return AbstractC0633h0.n(C1529d.c(f.class).b(q.h(C2692i.class)).f(new S4.h() {
            @Override
            public final Object a(e eVar) {
                return new f((C2692i) eVar.a(C2692i.class));
            }
        }).d(), C1529d.c(e.class).b(q.h(f.class)).b(q.h(C2687d.class)).b(q.h(C2692i.class)).f(new S4.h() {
            @Override
            public final Object a(S4.e eVar) {
                return new e((f) eVar.a(f.class), (C2687d) eVar.a(C2687d.class), (C2692i) eVar.a(C2692i.class));
            }
        }).d());
    }
}
