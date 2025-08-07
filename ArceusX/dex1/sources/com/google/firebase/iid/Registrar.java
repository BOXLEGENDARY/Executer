package com.google.firebase.iid;

import S4.C1529d;
import b5.InterfaceC1741a;
import java.util.Arrays;
import java.util.List;

public final class Registrar implements S4.i {

    static class a implements InterfaceC1741a {

        private final FirebaseInstanceId f19026a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.f19026a = firebaseInstanceId;
        }
    }

    @Override
    public final List<C1529d<?>> getComponents() {
        return Arrays.asList(C1529d.c(FirebaseInstanceId.class).b(S4.q.h(Q4.c.class)).b(S4.q.h(Y4.d.class)).b(S4.q.h(j5.i.class)).f(C2344b.f19028a).c().d(), C1529d.c(InterfaceC1741a.class).b(S4.q.h(FirebaseInstanceId.class)).f(C2345c.f19029a).d(), j5.h.b("fire-iid", "20.0.0"));
    }
}
