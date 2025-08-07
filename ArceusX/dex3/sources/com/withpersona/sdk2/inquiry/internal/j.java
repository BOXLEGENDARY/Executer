package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.i;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import ha.u;
import ha.w;

public final class j implements i.b {
    private final w a;

    j(w wVar) {
        this.a = wVar;
    }

    public static C9.h<i.b> b(w wVar) {
        return C9.e.a(new j(wVar));
    }

    @Override
    public i a(String str, String str2, u uVar, InquirySessionConfig inquirySessionConfig) {
        return this.a.b(str, str2, uVar, inquirySessionConfig);
    }
}
