package com.google.android.gms.internal.play_billing;

import W0.JWp.kNUgEaOjcPdX;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.C1761e;
import com.android.billingclient.api.Purchase;
import com.github.luben.zstd.BuildConfig;
import j0.tkB.pkcpMQSgx;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

public final class C2046c1 {

    public static final int f15998a = Runtime.getRuntime().availableProcessors();

    public static int a(Intent intent, String str) {
        if (intent != null) {
            return n(intent.getExtras(), "ProxyBillingActivity");
        }
        j("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int b(Bundle bundle, String str) {
        if (bundle == null) {
            j(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            i(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        j(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle c(Bundle bundle, String str, long j7) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j7);
        return bundle;
    }

    public static Bundle d(boolean z7, boolean z8, boolean z9, boolean z10, String str, long j7) {
        Bundle bundle = new Bundle();
        c(bundle, str, j7);
        if (z7 && z9) {
            bundle.putBoolean(pkcpMQSgx.AXBklnhqiVo, true);
        }
        if (z8 && z10) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static C1761e e(Intent intent, String str) {
        if (intent != null) {
            C1761e.a aVarC = C1761e.c();
            aVarC.c(b(intent.getExtras(), str));
            aVarC.b(f(intent.getExtras(), str));
            return aVarC.a();
        }
        j("BillingHelper", "Got null intent!");
        C1761e.a aVarC2 = C1761e.c();
        aVarC2.c(6);
        aVarC2.b("An internal error occurred.");
        return aVarC2.a();
    }

    public static String f(Bundle bundle, String str) {
        if (bundle == null) {
            j(str, "Unexpected null bundle received!");
            return BuildConfig.FLAVOR;
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            i(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return BuildConfig.FLAVOR;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        j(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return BuildConfig.FLAVOR;
    }

    public static String g(int i7) {
        return EnumC2129q0.c(i7).toString();
    }

    public static List h(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseO = o(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString(pkcpMQSgx.jimKDwKZ));
            if (purchaseO == null) {
                i("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseO);
        } else {
            i("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i7 = 0; i7 < stringArrayList.size() && i7 < stringArrayList2.size(); i7++) {
                Purchase purchaseO2 = o(stringArrayList.get(i7), stringArrayList2.get(i7));
                if (purchaseO2 != null) {
                    arrayList.add(purchaseO2);
                }
            }
        }
        return arrayList;
    }

    public static void i(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i7 = 40000;
            while (!str2.isEmpty() && i7 > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i7));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i7 -= iMin;
            }
        }
    }

    public static void j(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void k(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Bundle l(C1761e c1761e, int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", c1761e.b());
        bundle.putString("DEBUG_MESSAGE", c1761e.a());
        bundle.putInt("LOG_REASON", i7 - 1);
        return bundle;
    }

    public static Bundle m(C1761e c1761e, int i7, String str) {
        Bundle bundleL = l(c1761e, 5);
        if (str != null) {
            bundleL.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return bundleL;
    }

    private static int n(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt(kNUgEaOjcPdX.kcMbWLYABJGgAaY, 0);
        }
        j(str, "Unexpected null bundle received!");
        return 0;
    }

    private static Purchase o(String str, String str2) {
        if (str == null || str2 == null) {
            i("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e7) {
            j("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e7.toString()));
            return null;
        }
    }
}
