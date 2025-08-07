package com.google.firebase.installations;

import S4.C1529d;
import S4.h;
import S4.i;
import S4.q;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;

public class FirebaseInstallationsRegistrar implements i {
    public static d5.c lambda$getComponents$0(S4.e eVar) {
        return new b((Q4.c) eVar.a(Q4.c.class), eVar.b(j5.i.class), eVar.b(Z4.f.class));
    }

    @Override
    public List<C1529d<?>> getComponents() {
        return Arrays.asList(C1529d.c(d5.c.class).b(q.h(Q4.c.class)).b(q.g(Z4.f.class)).b(q.g(j5.i.class)).f(new h() {
            @Override
            public final Object a(S4.e eVar) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(eVar);
            }
        }).d(), j5.h.b("fire-installations", "17.0.0"));
    }
}
