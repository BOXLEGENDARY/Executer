package M6;

import com.github.luben.zstd.BuildConfig;
import com.roblox.client.purchase.model.ProviderPayload;
import com.roblox.client.purchase.model.PurchaseVerificationResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LM6/n;", BuildConfig.FLAVOR, "a", "(LM6/n;)Ljava/lang/String;", "Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;", "b", "(Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)LM6/n;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class o {
    public static final String a(RobloxPurchaseInfo robloxPurchaseInfo) {
        Intrinsics.checkNotNullParameter(robloxPurchaseInfo, "<this>");
        String strT = new com.google.gson.f().t(robloxPurchaseInfo);
        Intrinsics.checkNotNullExpressionValue(strT, "toJson(...)");
        return strT;
    }

    public static final RobloxPurchaseInfo b(PurchaseVerificationResponse purchaseVerificationResponse) {
        String[] strArr;
        List<Long> granted_asset_ids;
        Intrinsics.checkNotNullParameter(purchaseVerificationResponse, "<this>");
        ProviderPayload providerPayload = purchaseVerificationResponse.getProviderPayload();
        if (providerPayload == null || (granted_asset_ids = providerPayload.getGranted_asset_ids()) == null) {
            strArr = null;
        } else {
            List<Long> list = granted_asset_ids;
            ArrayList arrayList = new ArrayList(CollectionsKt.t(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
        }
        return new RobloxPurchaseInfo(strArr, null);
    }
}
