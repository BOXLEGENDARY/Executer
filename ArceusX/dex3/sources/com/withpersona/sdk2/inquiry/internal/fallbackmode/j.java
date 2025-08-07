package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import I8.k;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.i;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;

public final class j implements i.a {
    private final k a;

    j(k kVar) {
        this.a = kVar;
    }

    public static C9.h<i.a> b(k kVar) {
        return C9.e.a(new j(kVar));
    }

    @Override
    public i a(List<? extends NextStep> list, String str) {
        return this.a.b(list, str);
    }
}
