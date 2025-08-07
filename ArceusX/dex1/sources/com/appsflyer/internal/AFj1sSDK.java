package com.appsflyer.internal;

import S9.Gvmm.CAqKeu;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1ySDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;

public final class AFj1sSDK extends AFi1fSDK {
    public AFj1sSDK(AFc1kSDK aFc1kSDK, Runnable runnable) {
        super("store", "xiaomi", aFc1kSDK, runnable);
    }

    private boolean getCurrencyIso4217Code() {
        if (!getRevenue()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1zSDK aFh1zSDK = AFh1zSDK.REFERRER;
            StringBuilder sb = new StringBuilder("Class ");
            sb.append("com.miui.referrer.api.GetAppsReferrerClient");
            sb.append(" not found");
            aFLogger.v(aFh1zSDK, sb.toString());
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1zSDK.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th);
            return false;
        }
    }

    @Override
    public final void getRevenue(final Context context) {
        if (getCurrencyIso4217Code()) {
            this.areAllFieldsValid = System.currentTimeMillis();
            this.component1 = AFj1ySDK.AFa1vSDK.STARTED;
            addObserver(new AFj1ySDK.AnonymousClass2());
            final GetAppsReferrerClient getAppsReferrerClientBuild = GetAppsReferrerClient.Companion.newBuilder(context).build();
            getAppsReferrerClientBuild.startConnection(new GetAppsReferrerStateListener() {
                public final void onGetAppsReferrerSetupFinished(int i7) {
                    AFj1sSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, "com.xiaomi.mipicks")));
                    AFj1sSDK.this.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, "com.xiaomi.mipicks"));
                    if (i7 == -1) {
                        AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
                        AFj1sSDK.this.AFAdRevenueData.put("response", CAqKeu.qwTTyDXJtLmt);
                    } else if (i7 == 0) {
                        AFj1sSDK aFj1sSDK = AFj1sSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = getAppsReferrerClientBuild;
                        aFj1sSDK.AFAdRevenueData.put("response", "OK");
                        try {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFh1zSDK aFh1zSDK = AFh1zSDK.REFERRER;
                            aFLogger.d(aFh1zSDK, "XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFj1sSDK.AFAdRevenueData.put("referrer", installReferrer2);
                                }
                                aFj1sSDK.AFAdRevenueData.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFj1sSDK.AFAdRevenueData.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap map = new HashMap();
                                map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                map.put("install_version", installReferrer.getInstallVersion());
                                aFj1sSDK.AFAdRevenueData.put("xiaomi_custom", map);
                            } else {
                                aFLogger.w(aFh1zSDK, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th) {
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            AFh1zSDK aFh1zSDK2 = AFh1zSDK.REFERRER;
                            StringBuilder sb = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb.append(th.getMessage());
                            aFLogger2.w(aFh1zSDK2, sb.toString());
                        }
                    } else if (i7 == 1) {
                        AFj1sSDK.this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
                        AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "XiaomiInstallReferrer not supported");
                    } else if (i7 == 2) {
                        AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                        AFj1sSDK.this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                    } else if (i7 == 3) {
                        AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1sSDK.this.AFAdRevenueData.put("response", "DEVELOPER_ERROR");
                    } else if (i7 != 4) {
                        AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "responseCode not found.");
                    } else {
                        AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1sSDK.this.AFAdRevenueData.put("response", "PERMISSION_ERROR");
                    }
                    AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Xiaomi Install Referrer collected locally");
                    AFj1sSDK.this.getMonetizationNetwork();
                    getAppsReferrerClientBuild.endConnection();
                }

                public final void onGetAppsServiceDisconnected() {
                }
            });
        }
    }
}
