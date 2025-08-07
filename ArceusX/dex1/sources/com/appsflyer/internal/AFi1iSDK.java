package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1ySDK;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class AFi1iSDK extends AFi1fSDK {
    final ExecutorService getCurrencyIso4217Code;
    public final Map<String, Object> getMediationNetwork;

    final class AnonymousClass1 implements InstallReferrerStateListener {
        final Context val$context;
        final InstallReferrerClient val$referrerClient;

        AnonymousClass1(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        public void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i7) {
            AFi1iSDK.this.getMonetizationNetwork(installReferrerClient, context, i7);
        }

        @Override
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Install Referrer service disconnected");
        }

        @Override
        public final void onInstallReferrerSetupFinished(final int i7) {
            ExecutorService executorService = AFi1iSDK.this.getCurrencyIso4217Code;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f13612d.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i7);
                }
            });
        }
    }

    public AFi1iSDK(Runnable runnable, ExecutorService executorService, AFc1kSDK aFc1kSDK) {
        super("store", "google", aFc1kSDK, runnable);
        this.getMediationNetwork = new HashMap();
        this.getCurrencyIso4217Code = executorService;
    }

    private boolean getMonetizationNetwork(Context context) {
        if (!getRevenue()) {
            return false;
        }
        try {
            if (AFj1nSDK.getMediationNetwork(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e7) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e7);
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1zSDK aFh1zSDK = AFh1zSDK.REFERRER;
            StringBuilder sb = new StringBuilder("Class ");
            sb.append("com.android.installreferrer.api.InstallReferrerClient");
            sb.append(" not found");
            aFLogger.v(aFh1zSDK, sb.toString());
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1zSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    @Override
    public final void getRevenue(Context context) {
        if (getMonetizationNetwork(context)) {
            this.areAllFieldsValid = System.currentTimeMillis();
            this.component1 = AFj1ySDK.AFa1vSDK.STARTED;
            addObserver(new AFj1ySDK.AnonymousClass2());
            try {
                InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
                AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Connecting to Install Referrer Library...");
                installReferrerClientBuild.startConnection(new AnonymousClass1(installReferrerClientBuild, context));
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1zSDK.REFERRER, "referrerClient -> startConnection", th);
            }
        }
    }

    protected final void getMonetizationNetwork(InstallReferrerClient installReferrerClient, Context context, int i7) {
        this.getMediationNetwork.put("code", String.valueOf(i7));
        this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, "com.android.vending")));
        this.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, "com.android.vending"));
        if (i7 == -1) {
            AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.AFAdRevenueData.put("response", "SERVICE_DISCONNECTED");
        } else if (i7 == 0) {
            this.AFAdRevenueData.put("response", "OK");
            try {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1zSDK aFh1zSDK = AFh1zSDK.REFERRER;
                aFLogger.d(aFh1zSDK, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.getMediationNetwork.put("val", installReferrer2);
                        this.AFAdRevenueData.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.getMediationNetwork.put("clk", Long.toString(referrerClickTimestampSeconds));
                    this.AFAdRevenueData.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.getMediationNetwork.put("install", Long.toString(installBeginTimestampSeconds));
                    this.AFAdRevenueData.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap map = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.getMediationNetwork.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        map.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e7) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e7);
                    }
                    try {
                        map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        map.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e8) {
                        AFLogger.INSTANCE.e(AFh1zSDK.REFERRER, "some method not exist", e8, false, false);
                    }
                    if (!map.isEmpty()) {
                        this.AFAdRevenueData.put("google_custom", map);
                    }
                    installReferrerClient.endConnection();
                } else {
                    aFLogger.w(aFh1zSDK, "ReferrerClient: InstallReferrer is not ready");
                    this.getMediationNetwork.put("err", "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFh1zSDK aFh1zSDK2 = AFh1zSDK.REFERRER;
                StringBuilder sb = new StringBuilder("Failed to get install referrer: ");
                sb.append(th.getMessage());
                aFLogger2.w(aFh1zSDK2, sb.toString());
                this.getMediationNetwork.put("err", th.getMessage());
                aFLogger2.e(aFh1zSDK2, "Failed to get install referrer", th, false, false);
            }
        } else if (i7 == 1) {
            this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "InstallReferrer not supported");
        } else if (i7 == 2) {
            AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
        } else if (i7 != 3) {
            AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "responseCode not found.");
        } else {
            AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.AFAdRevenueData.put("response", "DEVELOPER_ERROR");
        }
        AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Install Referrer collected locally");
        getMonetizationNetwork();
    }
}
