package com.withpersona.sdk2.inquiry.internal;

import J8.q;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import u8.InterfaceC0808a;

public final class l {
    private final C9.h<q> a;
    private final C9.h<InterfaceC0808a> b;

    public l(C9.h<q> hVar, C9.h<InterfaceC0808a> hVar2) {
        this.a = hVar;
        this.b = hVar2;
    }

    public static l a(C9.h<q> hVar, C9.h<InterfaceC0808a> hVar2) {
        return new l(hVar, hVar2);
    }

    public static TransitionWorker c(String str, String str2, InquirySessionConfig inquirySessionConfig, TransitionWorker.TransitionData transitionData, q qVar, InterfaceC0808a interfaceC0808a) {
        return new TransitionWorker(str, str2, inquirySessionConfig, transitionData, qVar, interfaceC0808a);
    }

    public TransitionWorker b(String str, String str2, InquirySessionConfig inquirySessionConfig, TransitionWorker.TransitionData transitionData) {
        return c(str, str2, inquirySessionConfig, transitionData, (q) this.a.get(), (InterfaceC0808a) this.b.get());
    }
}
