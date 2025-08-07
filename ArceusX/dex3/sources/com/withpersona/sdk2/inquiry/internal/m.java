package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;

public final class m implements TransitionWorker.a {
    private final l a;

    m(l lVar) {
        this.a = lVar;
    }

    public static C9.h<TransitionWorker.a> b(l lVar) {
        return C9.e.a(new m(lVar));
    }

    @Override
    public TransitionWorker a(String str, String str2, InquirySessionConfig inquirySessionConfig, TransitionWorker.TransitionData transitionData) {
        return this.a.b(str, str2, inquirySessionConfig, transitionData);
    }
}
