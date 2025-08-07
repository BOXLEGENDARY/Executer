package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class AFd1xSDK {
    public static final JSONArray AFAdRevenueData(List<ExceptionInfo> list) {
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        List<ExceptionInfo> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ExceptionInfo) it.next()).getMonetizationNetwork());
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final boolean getMediationNetwork(HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, BuildConfig.FLAVOR);
        return httpURLConnection.getResponseCode() / 100 == 2;
    }
}
