package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import f6.ck.ZJZXBWla;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

public final class AFb1qSDK {
    public final String[] getRevenue;

    public AFb1qSDK(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.getRevenue = null;
            return;
        }
        Pattern patternCompile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !patternCompile.matcher(str).matches()) {
                AFLogger.afWarnLog(ZJZXBWla.ZdpWjsCJDDHYrq.concat(String.valueOf(str)));
            } else {
                arrayList.add(str.toLowerCase(Locale.getDefault()));
            }
        }
        if (arrayList.contains("all")) {
            this.getRevenue = new String[]{"all"};
        } else if (arrayList.isEmpty()) {
            this.getRevenue = null;
        } else {
            this.getRevenue = (String[]) arrayList.toArray(new String[0]);
        }
    }
}
