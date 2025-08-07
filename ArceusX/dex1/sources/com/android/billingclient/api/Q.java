package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.C1761e;
import com.google.android.gms.internal.play_billing.C2046c1;
import java.util.ArrayList;

final class Q {
    static P a(Bundle bundle, String str, String str2) {
        C1761e c1761e = J.f13358k;
        if (bundle == null) {
            C2046c1.j("BillingClient", String.format("%s got null owned items list", str2));
            return new P(c1761e, 54);
        }
        int iB = C2046c1.b(bundle, "BillingClient");
        String strF = C2046c1.f(bundle, "BillingClient");
        C1761e.a aVarC = C1761e.c();
        aVarC.c(iB);
        aVarC.b(strF);
        C1761e c1761eA = aVarC.a();
        if (iB != 0) {
            C2046c1.j("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iB)));
            return new P(c1761eA, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            C2046c1.j("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new P(c1761e, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            C2046c1.j("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new P(c1761e, 56);
        }
        if (stringArrayList2 == null) {
            C2046c1.j("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new P(c1761e, 57);
        }
        if (stringArrayList3 != null) {
            return new P(J.f13359l, 1);
        }
        C2046c1.j("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new P(c1761e, 58);
    }
}
