package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import com.github.luben.zstd.BuildConfig;
import java.io.IOException;

public abstract class AFe1kSDK<Result> extends AFe1tSDK<AFd1cSDK<Result>> {
    protected final AFd1lSDK areAllFieldsValid;
    private AFc1tSDK component1;
    public AFd1cSDK<Result> component2;
    protected final AFd1sSDK component3;
    public final AFf1iSDK component4;
    private String hashCode;

    private AFe1kSDK(AFe1uSDK aFe1uSDK, AFe1uSDK[] aFe1uSDKArr, AFd1lSDK aFd1lSDK, AFf1iSDK aFf1iSDK, AFd1sSDK aFd1sSDK, AFc1tSDK aFc1tSDK, String str) {
        super(aFe1uSDK, aFe1uSDKArr, str);
        this.areAllFieldsValid = aFd1lSDK;
        this.component4 = aFf1iSDK;
        this.component3 = aFd1sSDK;
        this.component1 = aFc1tSDK;
    }

    @Override
    public AFe1rSDK AFAdRevenueData() throws Exception {
        if (a_() && this.component4.getMediationNetwork()) {
            AppsFlyerRequestListener appsFlyerRequestListenerComponent2 = component2();
            if (appsFlyerRequestListenerComponent2 != null) {
                appsFlyerRequestListenerComponent2.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFe1oSDK();
        }
        String revenue = this.component4.getRevenue();
        if (revenue == null || revenue.trim().isEmpty()) {
            AppsFlyerRequestListener appsFlyerRequestListenerComponent22 = component2();
            if (appsFlyerRequestListenerComponent22 != null) {
                appsFlyerRequestListenerComponent22.onError(41, "No dev key");
            }
            throw new AFe1nSDK();
        }
        AFd1mSDK<Result> mediationNetwork = getMediationNetwork(revenue);
        if (mediationNetwork == null) {
            AFLogger.INSTANCE.e(AFh1zSDK.HTTP_CLIENT, "Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"), false, false);
            return AFe1rSDK.FAILURE;
        }
        if (copydefault()) {
            AFAdRevenueData(mediationNetwork.getMediationNetwork);
        }
        AFd1cSDK<Result> monetizationNetwork = mediationNetwork.getMonetizationNetwork();
        this.component2 = monetizationNetwork;
        this.component3.getMonetizationNetwork(mediationNetwork.getMediationNetwork.getCurrencyIso4217Code, monetizationNetwork.getStatusCode(), monetizationNetwork.getBody().toString());
        AppsFlyerRequestListener appsFlyerRequestListenerComponent23 = component2();
        if (appsFlyerRequestListenerComponent23 != null) {
            if (monetizationNetwork.isSuccessful()) {
                appsFlyerRequestListenerComponent23.onSuccess();
            } else {
                StringBuilder sb = new StringBuilder("Status code failure ");
                sb.append(monetizationNetwork.getStatusCode());
                appsFlyerRequestListenerComponent23.onError(50, sb.toString());
            }
        }
        return monetizationNetwork.isSuccessful() ? AFe1rSDK.SUCCESS : AFe1rSDK.FAILURE;
    }

    protected boolean a_() {
        return true;
    }

    protected abstract AppsFlyerRequestListener component2();

    protected abstract boolean copydefault();

    @Override
    public void getCurrencyIso4217Code() {
        String str;
        if (this.getMediationNetwork == AFe1rSDK.SUCCESS) {
            String str2 = this.hashCode;
            if (str2 != null) {
                this.component1.getRevenue(str2);
                return;
            }
            return;
        }
        if (getMonetizationNetwork() || (str = this.hashCode) == null) {
            return;
        }
        this.component1.getRevenue(str);
    }

    protected abstract AFd1mSDK<Result> getMediationNetwork(String str);

    @Override
    public final void getMediationNetwork() {
        String revenue;
        super.getMediationNetwork();
        if (!copydefault() || (revenue = this.component4.getRevenue()) == null || revenue.trim().isEmpty()) {
            return;
        }
        AFd1mSDK<Result> mediationNetwork = getMediationNetwork(revenue);
        if (mediationNetwork != null) {
            AFAdRevenueData(mediationNetwork.getMediationNetwork);
        } else {
            AFLogger.INSTANCE.e(AFh1zSDK.HTTP_CLIENT, "Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"), false, false);
        }
    }

    @Override
    public boolean getMonetizationNetwork() {
        if (component3() instanceof AFe1oSDK) {
            return false;
        }
        if (this.getMediationNetwork == AFe1rSDK.TIMEOUT) {
            return true;
        }
        Throwable thComponent3 = component3();
        return (thComponent3 instanceof IOException) && !(thComponent3 instanceof ParsingException);
    }

    @Override
    public long getRevenue() {
        return 60000L;
    }

    public AFe1kSDK(AFe1uSDK aFe1uSDK, AFe1uSDK[] aFe1uSDKArr, AFc1fSDK aFc1fSDK, String str) {
        this(aFe1uSDK, aFe1uSDKArr, aFc1fSDK.getMediationNetwork(), aFc1fSDK.AFKeystoreWrapper(), aFc1fSDK.copy(), aFc1fSDK.registerClient(), str);
    }

    @Override
    public final void getMonetizationNetwork(Throwable th) {
        boolean z7 = !(th instanceof HttpException);
        if (th instanceof AFe1oSDK) {
            AFLogger.INSTANCE.e(AFh1zSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th, true, false);
        } else {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1zSDK aFh1zSDK = AFh1zSDK.HTTP_CLIENT;
            aFLogger.e(aFh1zSDK, "Error while sending request to server: ".concat(String.valueOf(th)), th, false, false, z7);
            aFLogger.w(aFh1zSDK, "Error while sending request to server: ".concat(String.valueOf(th)));
        }
        AppsFlyerRequestListener appsFlyerRequestListenerComponent2 = component2();
        if (appsFlyerRequestListenerComponent2 != null) {
            String message = th.getMessage();
            if (message == null) {
                message = BuildConfig.FLAVOR;
            }
            appsFlyerRequestListenerComponent2.onError(40, message);
        }
    }

    public AFe1kSDK(AFe1uSDK aFe1uSDK, AFe1uSDK[] aFe1uSDKArr, AFc1fSDK aFc1fSDK, String str, String str2) {
        this(aFe1uSDK, aFe1uSDKArr, aFc1fSDK.getMediationNetwork(), aFc1fSDK.AFKeystoreWrapper(), aFc1fSDK.copy(), aFc1fSDK.registerClient(), str);
        this.hashCode = str2;
    }

    private void AFAdRevenueData(AFd1aSDK aFd1aSDK) {
        String str = this.hashCode;
        this.hashCode = this.component1.getCurrencyIso4217Code(new AFc1uSDK(aFd1aSDK.getCurrencyIso4217Code, aFd1aSDK.getRevenue(), "6.16.2", this.getMonetizationNetwork));
        if (str != null) {
            this.component1.getRevenue(str);
        }
    }
}
