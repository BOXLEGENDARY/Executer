package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public abstract class AFe1mSDK extends AFe1gSDK {
    private final PurchaseHandler.PurchaseValidationCallback component1;

    public AFe1mSDK(AFe1uSDK aFe1uSDK, AFe1uSDK[] aFe1uSDKArr, AFc1fSDK aFc1fSDK, Map<String, ? extends Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFe1uSDK, aFe1uSDKArr, aFc1fSDK, null, map);
        Intrinsics.checkNotNullParameter(aFe1uSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFe1uSDKArr, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1fSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        this.component1 = purchaseValidationCallback;
    }

    @Override
    protected final boolean component1() {
        return true;
    }

    @Override
    public final void getCurrencyIso4217Code() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.getCurrencyIso4217Code();
        Throwable thComponent3 = component3();
        if (thComponent3 != null && (purchaseValidationCallback2 = this.component1) != null) {
            purchaseValidationCallback2.onFailure(thComponent3);
        }
        ResponseNetwork<String> responseNetwork = ((AFe1kSDK) this).component2;
        if (responseNetwork == null || (purchaseValidationCallback = this.component1) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    @Override
    protected final String getMonetizationNetwork(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        if (map.containsKey("billing_library_version")) {
            Object objRemove = map.remove("billing_library_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }

    @Override
    public boolean getMonetizationNetwork() {
        ResponseNetwork responseNetwork = ((AFe1kSDK) this).component2;
        if (responseNetwork != null) {
            Intrinsics.d(responseNetwork);
            if (responseNetwork.getStatusCode() == 503) {
                return true;
            }
        }
        return super.getMonetizationNetwork();
    }

    @Override
    protected final String getCurrencyIso4217Code(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        if (map.containsKey("connector_version")) {
            Object objRemove = map.remove("connector_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }
}
