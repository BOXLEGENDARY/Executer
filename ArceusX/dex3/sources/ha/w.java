package ha;

import C9.h;
import I8.i;
import J8.q;
import T8.c;
import android.content.Context;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import d9.InterfaceC0550a;

public final class w {
    private final h<Context> a;
    private final h<q> b;
    private final h<InterfaceC0550a> c;
    private final h<c> d;
    private final h<i> e;

    public w(h<Context> hVar, h<q> hVar2, h<InterfaceC0550a> hVar3, h<c> hVar4, h<i> hVar5) {
        this.a = hVar;
        this.b = hVar2;
        this.c = hVar3;
        this.d = hVar4;
        this.e = hVar5;
    }

    public static w a(h<Context> hVar, h<q> hVar2, h<InterfaceC0550a> hVar3, h<c> hVar4, h<i> hVar5) {
        return new w(hVar, hVar2, hVar3, hVar4, hVar5);
    }

    public static com.withpersona.sdk2.inquiry.internal.i c(String str, String str2, u uVar, InquirySessionConfig inquirySessionConfig, Context context, q qVar, InterfaceC0550a interfaceC0550a, c cVar, i iVar) {
        return new com.withpersona.sdk2.inquiry.internal.i(str, str2, uVar, inquirySessionConfig, context, qVar, interfaceC0550a, cVar, iVar);
    }

    public com.withpersona.sdk2.inquiry.internal.i b(String str, String str2, u uVar, InquirySessionConfig inquirySessionConfig) {
        return c(str, str2, uVar, inquirySessionConfig, (Context) this.a.get(), (q) this.b.get(), (InterfaceC0550a) this.c.get(), (c) this.d.get(), (i) this.e.get());
    }
}
