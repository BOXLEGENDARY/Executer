package L6;

import E6.k;
import O6.ValidatePurchaseResponsePayload;
import h7.l;
import ha.C2704j;
import ha.InterfaceC2700f;
import ha.InterfaceC2706l;
import q6.C2738b;

public class d {

    private InterfaceC2700f f2151a;

    private E6.h f2152b = E6.h.b();

    class a implements InterfaceC2706l {

        final InterfaceC0032d f2153a;

        final String f2154b;

        a(InterfaceC0032d interfaceC0032d, String str) {
            this.f2153a = interfaceC0032d;
            this.f2154b = str;
        }

        @Override
        public void a(ha.C2704j r9) throws org.json.JSONException {
            throw new UnsupportedOperationException("Method not decompiled: L6.d.a.a(o6.j):void");
        }

        @Override
        public void b(C2704j c2704j) {
        }
    }

    class b implements k.d {

        final String f2156a;

        final String f2157b;

        final String f2158c;

        final String f2159d;

        final InterfaceC0032d f2160e;

        b(String str, String str2, String str3, String str4, InterfaceC0032d interfaceC0032d) {
            this.f2156a = str;
            this.f2157b = str2;
            this.f2158c = str3;
            this.f2159d = str4;
            this.f2160e = interfaceC0032d;
        }

        @Override
        public void a(boolean z7, int i7) {
            if (z7) {
                d.this.c(this.f2156a, this.f2157b, this.f2158c, this.f2159d, this.f2160e);
                return;
            }
            InterfaceC0032d interfaceC0032d = this.f2160e;
            if (interfaceC0032d != null) {
                interfaceC0032d.a(c.ERROR_CHECKING_BALANCE, this.f2157b, null);
            }
        }
    }

    public enum c {
        OK,
        ERROR,
        RETRY,
        LIMIT,
        LIMIT_UNDER_13,
        ERROR_CHECKING_BALANCE,
        UNKNOWN_ERROR
    }

    public interface InterfaceC0032d {
        void a(c cVar, String str, ValidatePurchaseResponsePayload validatePurchaseResponsePayload);
    }

    public d(InterfaceC2700f interfaceC2700f) {
        this.f2151a = interfaceC2700f;
    }

    public void b(String str, String str2, String str3, InterfaceC0032d interfaceC0032d) {
        c(str, str2, str3, null, interfaceC0032d);
    }

    public void c(String str, String str2, String str3, String str4, InterfaceC0032d interfaceC0032d) {
        this.f2151a.a(str, (!j6.d.a().l3() || str4 == null) ? new C2738b(str2, str3) : new C2738b(str2, str3, str4), null, new a(interfaceC0032d, str2)).b();
        this.f2152b.y();
    }

    public void d(String str, String str2, String str3, InterfaceC0032d interfaceC0032d) {
        e(str, str2, str3, null, interfaceC0032d);
    }

    public void e(String str, String str2, String str3, String str4, InterfaceC0032d interfaceC0032d) {
        l.g("rbx.purchaseflow", "Get balance.");
        k.e().m(new b(str, str2, str3, str4, interfaceC0032d), this.f2151a);
    }
}
