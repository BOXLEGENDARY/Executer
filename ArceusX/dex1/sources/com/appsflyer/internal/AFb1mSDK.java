package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Executor;

public final class AFb1mSDK extends AFb1uSDK<String> {
    public AFb1mSDK(Context context, Executor executor) {
        super(context, executor, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    @Override
    public String getRevenue() throws Throwable {
        Cursor cursorQuery;
        Throwable th;
        try {
            ContentResolver contentResolver = this.getMonetizationNetwork.getContentResolver();
            StringBuilder sb = new StringBuilder("content://");
            sb.append(this.AFAdRevenueData);
            cursorQuery = contentResolver.query(Uri.parse(sb.toString()), new String[]{"aid"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("aid"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            cursorQuery = null;
            th = th3;
        }
    }

    @Override
    public final String AFAdRevenueData() {
        this.getRevenue.execute(this.getCurrencyIso4217Code);
        return (String) super.AFAdRevenueData();
    }

    public final String getCurrencyIso4217Code() {
        this.getRevenue.execute(this.getCurrencyIso4217Code);
        return (String) super.AFAdRevenueData();
    }
}
