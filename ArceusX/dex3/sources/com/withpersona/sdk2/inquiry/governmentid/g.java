package com.withpersona.sdk2.inquiry.governmentid;

import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;

public final class g implements GovernmentIdAnalyzeWorker.a {
    private final f a;

    g(f fVar) {
        this.a = fVar;
    }

    public static C9.h<GovernmentIdAnalyzeWorker.a> b(f fVar) {
        return C9.e.a(new g(fVar));
    }

    @Override
    public GovernmentIdAnalyzeWorker a(IdConfig.b bVar, String str) {
        return this.a.b(bVar, str);
    }
}
