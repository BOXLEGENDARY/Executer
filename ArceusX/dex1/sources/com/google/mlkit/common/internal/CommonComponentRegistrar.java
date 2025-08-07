package com.google.mlkit.common.internal;

import N3.AbstractC0535f;
import S4.C1529d;
import S4.h;
import S4.i;
import S4.q;
import java.util.List;
import m5.C2583a;
import n5.C2670a;
import n5.c;
import o5.C2684a;
import o5.C2685b;
import o5.C2687d;
import o5.C2692i;
import o5.C2693j;
import o5.n;
import p5.C2726b;

public class CommonComponentRegistrar implements i {
    @Override
    public final List getComponents() {
        return AbstractC0535f.n(n.f22487b, C1529d.c(C2726b.class).b(q.h(C2692i.class)).f(new h() {
            @Override
            public final Object a(S4.e eVar) {
                return new C2726b((C2692i) eVar.a(C2692i.class));
            }
        }).d(), C1529d.c(C2693j.class).f(new h() {
            @Override
            public final Object a(S4.e eVar) {
                return new C2693j();
            }
        }).d(), C1529d.c(c.class).b(q.j(c.a.class)).f(new h() {
            @Override
            public final Object a(S4.e eVar) {
                return new n5.c(eVar.d(c.a.class));
            }
        }).d(), C1529d.c(C2687d.class).b(q.i(C2693j.class)).f(new h() {
            @Override
            public final Object a(S4.e eVar) {
                return new C2687d(eVar.b(C2693j.class));
            }
        }).d(), C1529d.c(C2684a.class).f(new h() {
            @Override
            public final Object a(S4.e eVar) {
                return C2684a.a();
            }
        }).d(), C1529d.c(C2685b.class).b(q.h(C2684a.class)).f(new h() {
            @Override
            public final Object a(S4.e eVar) {
                return new C2685b((C2684a) eVar.a(C2684a.class));
            }
        }).d(), C1529d.c(C2583a.class).b(q.h(C2692i.class)).f(new h() {
            @Override
            public final Object a(S4.e eVar) {
                return new C2583a((C2692i) eVar.a(C2692i.class));
            }
        }).d(), C1529d.j(c.a.class).b(q.i(C2583a.class)).f(new h() {
            @Override
            public final Object a(S4.e eVar) {
                return new c.a(C2670a.class, eVar.b(C2583a.class));
            }
        }).d());
    }
}
