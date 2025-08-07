package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public final class AFf1uSDK extends AFe1tSDK<AFf1qSDK> {
    public AFh1cSDK areAllFieldsValid;
    public AFf1qSDK component1;
    private final AFc1kSDK component2;
    public final AFf1sSDK component3;
    private final AFf1oSDK component4;
    private final AFf1pSDK copy;
    private final String copydefault;
    private final AFd1lSDK equals;
    private final AFf1iSDK hashCode;
    private final AFf1nSDK toString;

    public AFf1uSDK(AFf1oSDK aFf1oSDK, AFc1kSDK aFc1kSDK, AFf1iSDK aFf1iSDK, AFf1nSDK aFf1nSDK, AFd1lSDK aFd1lSDK, AFf1pSDK aFf1pSDK, String str, AFf1sSDK aFf1sSDK) {
        super(AFe1uSDK.RC_CDN, new AFe1uSDK[0], "UpdateRemoteConfiguration");
        this.component1 = null;
        this.component4 = aFf1oSDK;
        this.component2 = aFc1kSDK;
        this.hashCode = aFf1iSDK;
        this.toString = aFf1nSDK;
        this.equals = aFd1lSDK;
        this.copy = aFf1pSDK;
        this.copydefault = str;
        this.component3 = aFf1sSDK;
    }

    private com.appsflyer.internal.AFf1qSDK component1() throws java.lang.InterruptedException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.io.InterruptedIOException {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1uSDK.component1():com.appsflyer.internal.AFf1qSDK");
    }

    private void getMediationNetwork(String str, long j7, AFd1cSDK<?> aFd1cSDK, AFi1zSDK aFi1zSDK, AFh1dSDK aFh1dSDK, String str2, Throwable th) {
        long j8;
        int statusCode;
        Throwable cause;
        long j9;
        if (aFd1cSDK != null) {
            j8 = aFd1cSDK.getCurrencyIso4217Code.getMonetizationNetwork;
            statusCode = aFd1cSDK.getStatusCode();
        } else {
            j8 = 0;
            statusCode = 0;
        }
        int i7 = statusCode;
        if (th instanceof HttpException) {
            cause = th.getCause();
            j9 = ((HttpException) th).getMetrics().getMonetizationNetwork;
        } else {
            cause = th;
            j9 = j8;
        }
        this.areAllFieldsValid = new AFh1cSDK(aFi1zSDK != null ? aFi1zSDK.AFAdRevenueData : null, str, j9, System.currentTimeMillis() - j7, i7, aFh1dSDK, str2, cause);
    }

    @Override
    public final AFe1rSDK AFAdRevenueData() throws Exception {
        try {
            AFf1qSDK aFf1qSDKComponent1 = component1();
            this.component1 = aFf1qSDKComponent1;
            return aFf1qSDKComponent1 == AFf1qSDK.FAILURE ? AFe1rSDK.FAILURE : AFe1rSDK.SUCCESS;
        } catch (InterruptedIOException e7) {
            e = e7;
            AFLogger.INSTANCE.e(AFh1zSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component1 = AFf1qSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        } catch (InterruptedException e8) {
            e = e8;
            AFLogger.INSTANCE.e(AFh1zSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component1 = AFf1qSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component1 = AFf1qSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        }
    }

    @Override
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override
    public final long getRevenue() {
        return 1500L;
    }

    private void getMonetizationNetwork(String str, long j7, AFh1dSDK aFh1dSDK, String str2, AFd1cSDK<AFi1zSDK> aFd1cSDK) {
        getMediationNetwork(str, j7, aFd1cSDK, aFd1cSDK != null ? aFd1cSDK.getBody() : null, aFh1dSDK, str2 != null ? str2 : null, null);
    }
}
