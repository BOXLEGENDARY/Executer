package L6;

import com.roblox.client.purchase.model.PurchaseVerificationResponse;
import h7.l;
import ha.C2704j;
import ha.InterfaceC2700f;
import ha.InterfaceC2706l;
import q6.InterfaceC2737a;

public class i {

    private InterfaceC2700f f2174a;

    private E6.h f2175b = E6.h.b();

    class a implements InterfaceC2706l {

        final c f2176a;

        a(c cVar) {
            this.f2176a = cVar;
        }

        @Override
        public void a(C2704j c2704j) {
            b bVar;
            String strA = c2704j.a();
            l.g("rbx.purchaseflow", "Verify Purchase callback. response code " + c2704j.b() + " responseBody = " + strA + ".");
            int iB = c2704j.b();
            if (iB == 200) {
                l.g("rbx.purchaseflow", "Verification success");
                bVar = b.OK;
                i.this.f2175b.J();
            } else if (iB == 500) {
                l.d("rbx.purchaseflow", "Server error");
                bVar = b.UNKNOWN;
                i.this.f2175b.M();
            } else if (iB == 400) {
                l.d("rbx.purchaseflow", "Service was unable to validate receiptId.");
                bVar = b.ERROR;
                i.this.f2175b.K();
            } else if (iB != 401) {
                l.d("rbx.purchaseflow", "Unknown");
                bVar = b.UNKNOWN;
                i.this.f2175b.N();
            } else {
                l.d("rbx.purchaseflow", "Unauthorized to make request.");
                bVar = b.BOGUS;
                i.this.f2175b.L();
            }
            PurchaseVerificationResponse purchaseVerificationResponseA = O6.a.a(strA);
            c cVar = this.f2176a;
            if (cVar != null) {
                cVar.a(bVar, purchaseVerificationResponseA);
            }
        }

        @Override
        public void b(C2704j c2704j) {
        }
    }

    public enum b {
        OK,
        ERROR,
        BOGUS,
        EMPTY_RESPONSE,
        UNKNOWN
    }

    public interface c {
        void a(b bVar, PurchaseVerificationResponse purchaseVerificationResponse);
    }

    public i(InterfaceC2700f interfaceC2700f) {
        this.f2174a = interfaceC2700f;
    }

    public void b(String str, InterfaceC2737a interfaceC2737a, c cVar) {
        this.f2174a.a(str, interfaceC2737a, null, new a(cVar)).b();
        this.f2175b.I();
    }
}
