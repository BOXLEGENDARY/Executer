package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import u5.w;

public final class f {
    private final C9.h<Context> a;
    private final C9.h<w> b;

    public f(C9.h<Context> hVar, C9.h<w> hVar2) {
        this.a = hVar;
        this.b = hVar2;
    }

    public static f a(C9.h<Context> hVar, C9.h<w> hVar2) {
        return new f(hVar, hVar2);
    }

    public static GovernmentIdAnalyzeWorker c(Context context, w wVar, IdConfig.b bVar, String str) {
        return new GovernmentIdAnalyzeWorker(context, wVar, bVar, str);
    }

    public GovernmentIdAnalyzeWorker b(IdConfig.b bVar, String str) {
        return c((Context) this.a.get(), (w) this.b.get(), bVar, str);
    }
}
