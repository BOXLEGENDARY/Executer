package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.n;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import ha.C0337C;

public final class o implements n.a {
    private final C0337C a;

    o(C0337C c0337c) {
        this.a = c0337c;
    }

    public static C9.h<n.a> b(C0337C c0337c) {
        return C9.e.a(new o(c0337c));
    }

    @Override
    public n a(String str, String str2, InquirySessionConfig inquirySessionConfig) {
        return this.a.b(str, str2, inquirySessionConfig);
    }
}
