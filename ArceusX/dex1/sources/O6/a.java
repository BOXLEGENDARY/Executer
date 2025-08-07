package O6;

import com.github.luben.zstd.BuildConfig;
import com.google.gson.f;
import com.google.gson.t;
import com.roblox.client.purchase.model.PurchaseVerificationResponse;
import h7.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {BuildConfig.FLAVOR, "Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;", "a", "(Ljava/lang/String;)Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;", "Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;", "EMPTY_PURCHASE_VERIFICATION_RESPONSE", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {

    private static final PurchaseVerificationResponse f3704a = new PurchaseVerificationResponse(null, 1, null);

    public static final PurchaseVerificationResponse a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            PurchaseVerificationResponse purchaseVerificationResponse = (PurchaseVerificationResponse) new f().l(str, PurchaseVerificationResponse.class);
            return purchaseVerificationResponse == null ? f3704a : purchaseVerificationResponse;
        } catch (t unused) {
            l.d("rbx.purchaseflow", "Unable to parse response " + str);
            return f3704a;
        }
    }
}
