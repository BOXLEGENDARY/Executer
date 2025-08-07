package o5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.github.luben.zstd.BuildConfig;
import java.util.Locale;
import n3.C2645c;

public class C2686c {

    private static final C2645c f22435a = new C2645c("CommonUtils", BuildConfig.FLAVOR);

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e7) {
            f22435a.c("CommonUtils", "Exception thrown when trying to get app version ".concat(e7.toString()));
            return BuildConfig.FLAVOR;
        }
    }

    public static String b(Locale locale) {
        if (v3.m.f()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb.append("-");
            sb.append(locale.getVariant());
        }
        return sb.toString();
    }
}
