package com.appsflyer.internal;

import K0.wJ.BtcVLuo;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1ySDK;
import com.github.luben.zstd.BuildConfig;
import java.util.HashMap;

public final class AFi1dSDK extends AFi1fSDK {
    private final AFi1hSDK getMediationNetwork;
    private final AFc1fSDK getRevenue;

    public AFi1dSDK(Runnable runnable, AFc1fSDK aFc1fSDK, AFi1hSDK aFi1hSDK) {
        super("store", "huawei", aFc1fSDK.getRevenue(), runnable);
        this.getRevenue = aFc1fSDK;
        this.getMediationNetwork = aFi1hSDK;
    }

    public void getMediationNetwork(Context context) {
        this.areAllFieldsValid = System.currentTimeMillis();
        this.component1 = AFj1ySDK.AFa1vSDK.STARTED;
        addObserver(new AFj1ySDK.AnonymousClass2());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.AFAdRevenueData.put(BtcVLuo.qqHbMIHv, Long.valueOf(AFj1nSDK.AFAdRevenueData(context, str)));
        this.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, str));
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursorQuery == null) {
                this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
            } else if (cursorQuery.moveToFirst()) {
                this.AFAdRevenueData.put("response", "OK");
                this.AFAdRevenueData.put("referrer", cursorQuery.getString(0));
                this.AFAdRevenueData.put("click_ts", Long.valueOf(cursorQuery.getLong(1)));
                this.AFAdRevenueData.put("install_end_ts", Long.valueOf(cursorQuery.getLong(2)));
                if (cursorQuery.getColumnCount() > 3) {
                    this.AFAdRevenueData.put("install_begin_ts", Long.valueOf(cursorQuery.getLong(3)));
                    HashMap map = new HashMap();
                    String string = cursorQuery.getString(4);
                    if (string != null) {
                        map.put("track_id", string);
                    }
                    map.put("referrer_ex", cursorQuery.getString(5));
                    this.AFAdRevenueData.put("huawei_custom", map);
                }
            } else {
                this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
            }
        } catch (Throwable th) {
            try {
                this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFh1zSDK.REFERRER, th.getMessage() != null ? th.getMessage() : BuildConfig.FLAVOR, th, false, true);
                if (0 != 0) {
                }
            } finally {
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
        }
        getMonetizationNetwork();
    }

    private boolean getMonetizationNetwork(Context context) {
        if (!getRevenue()) {
            AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getMediationNetwork.getMediationNetwork(context)) {
            AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getMediationNetwork.AFAdRevenueData(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }

    @Override
    public final void getRevenue(final Context context) {
        if (getMonetizationNetwork(context)) {
            this.getRevenue.AFAdRevenueData().execute(new Runnable() {
                @Override
                public final void run() {
                    this.f13610d.getMediationNetwork(context);
                }
            });
        }
    }
}
