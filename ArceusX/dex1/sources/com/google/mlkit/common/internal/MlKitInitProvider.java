package com.google.mlkit.common.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import n3.C2651i;
import o5.C2692i;

public class MlKitInitProvider extends ContentProvider {
    @Override
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        C2651i.q(!providerInfo.authority.equals("com.google.mlkit.common.mlkitinitprovider"), "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        super.attachInfo(context, providerInfo);
    }

    @Override
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override
    public final String getType(Uri uri) {
        return null;
    }

    @Override
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            Log.i("MlKitInitProvider", "No context available. Manually call MlKit.initialize(), otherwise ML Kit will not be functional.");
            return false;
        }
        C2692i.d(context);
        return false;
    }

    @Override
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
