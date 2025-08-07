package com.google.firebase.analytics.connector.internal;

import Q4.c;
import S4.C1529d;
import S4.e;
import S4.h;
import S4.i;
import S4.q;
import Y4.d;
import android.content.Context;
import java.util.Arrays;
import java.util.List;

public class AnalyticsConnectorRegistrar implements i {
    @Override
    public List<C1529d<?>> getComponents() {
        return Arrays.asList(C1529d.c(R4.a.class).b(q.h(c.class)).b(q.h(Context.class)).b(q.h(d.class)).f(new h() {
            @Override
            public final Object a(e eVar) {
                return R4.b.c((c) eVar.a(c.class), (Context) eVar.a(Context.class), (d) eVar.a(d.class));
            }
        }).e().d(), j5.h.b("fire-analytics", "20.0.0"));
    }
}
