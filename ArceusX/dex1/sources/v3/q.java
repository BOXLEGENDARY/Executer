package v3;

import android.content.Context;
import android.content.SharedPreferences;

public class q {
    @Deprecated
    public static void a(Context context, SharedPreferences.Editor editor, String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
