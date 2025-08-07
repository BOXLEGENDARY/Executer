package n3;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C1822g;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import java.util.Locale;
import k3.C2516b;
import x3.C2989c;

public final class C2662t {

    private static final g0.k f22291a = new g0.k();

    private static Locale f22292b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C2989c.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i7) {
        Resources resources = context.getResources();
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? resources.getString(R.string.ok) : resources.getString(C2516b.f21297a) : resources.getString(C2516b.f21306j) : resources.getString(C2516b.f21300d);
    }

    public static String c(Context context, int i7) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i7 == 1) {
            return resources.getString(C2516b.f21301e, strA);
        }
        if (i7 == 2) {
            return v3.i.g(context) ? resources.getString(C2516b.f21310n) : resources.getString(C2516b.f21307k, strA);
        }
        if (i7 == 3) {
            return resources.getString(C2516b.f21298b, strA);
        }
        if (i7 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i7 == 7) {
            return g(context, "common_google_play_services_network_error_text", strA);
        }
        if (i7 == 9) {
            return resources.getString(C2516b.f21305i, strA);
        }
        if (i7 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i7) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(C2516b.f21309m, strA);
            default:
                return resources.getString(com.google.android.gms.common.j.f14354a, strA);
        }
    }

    public static String d(Context context, int i7) {
        return (i7 == 6 || i7 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i7);
    }

    public static String e(Context context, int i7) {
        String strH = i7 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i7);
        return strH == null ? context.getResources().getString(C2516b.f21304h) : strH;
    }

    public static String f(Context context, int i7) {
        Resources resources = context.getResources();
        switch (i7) {
            case 1:
                return resources.getString(C2516b.f21302f);
            case 2:
                return resources.getString(C2516b.f21308l);
            case 3:
                return resources.getString(C2516b.f21299c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", JmBUOGMwkkxg.fjSbE);
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i7);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String g(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(com.google.android.gms.common.j.f14354a);
        }
        return String.format(resources.getConfiguration().locale, strH, str2);
    }

    private static String h(Context context, String str) {
        g0.k kVar = f22291a;
        synchronized (kVar) {
            try {
                Locale localeC = u0.f.a(context.getResources().getConfiguration()).c(0);
                if (!localeC.equals(f22292b)) {
                    kVar.clear();
                    f22292b = localeC;
                }
                String str2 = (String) kVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources resourcesD = C1822g.d(context);
                if (resourcesD == null) {
                    return null;
                }
                int identifier = resourcesD.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = resourcesD.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    kVar.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
