package W3;

import android.content.Context;
import android.content.res.Resources;

public final class k {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(com.google.android.gms.common.j.f14354a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final String b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
