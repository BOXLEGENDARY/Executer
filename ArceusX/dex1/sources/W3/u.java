package W3;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import n3.C2651i;

public final class u {
    public static String a(String str, String[] strArr, String[] strArr2) {
        C2651i.l(strArr);
        C2651i.l(strArr2);
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i7 = 0; i7 < iMin; i7++) {
            String str2 = strArr[i7];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i7];
            }
        }
        return null;
    }

    public static String b(Context context, String str, String str2) {
        C2651i.l(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = k.a(context);
        }
        return k.b("google_app_id", resources, str2);
    }
}
