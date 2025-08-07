package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.github.luben.zstd.BuildConfig;
import java.util.Map;

public final class D2 {

    private final Map<String, Map<String, String>> f14693a;

    D2(Map<String, Map<String, String>> map) {
        this.f14693a = map;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        Map<String, String> map = this.f14693a.get(uri.toString());
        if (map == null) {
            return null;
        }
        String strValueOf = String.valueOf(str3);
        return map.get(strValueOf.length() != 0 ? BuildConfig.FLAVOR.concat(strValueOf) : new String(BuildConfig.FLAVOR));
    }
}
