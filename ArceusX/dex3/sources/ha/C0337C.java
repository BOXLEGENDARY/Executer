package ha;

import C9.h;
import J8.q;
import android.content.Context;
import com.withpersona.sdk2.inquiry.internal.n;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;

public final class C0337C {
    private final h<Context> a;
    private final h<q> b;

    public C0337C(h<Context> hVar, h<q> hVar2) {
        this.a = hVar;
        this.b = hVar2;
    }

    public static C0337C a(h<Context> hVar, h<q> hVar2) {
        return new C0337C(hVar, hVar2);
    }

    public static n c(String str, String str2, InquirySessionConfig inquirySessionConfig, Context context, q qVar) {
        return new n(str, str2, inquirySessionConfig, context, qVar);
    }

    public n b(String str, String str2, InquirySessionConfig inquirySessionConfig) {
        return c(str, str2, inquirySessionConfig, (Context) this.a.get(), (q) this.b.get());
    }
}
