package com.appsflyer.internal;

import android.database.Cursor;
import com.github.luben.zstd.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

public final class AFj1lSDK {
    public static final String N_(Cursor cursor, String str) {
        Intrinsics.checkNotNullParameter(cursor, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getString(columnIndex);
        }
        return null;
    }
}
