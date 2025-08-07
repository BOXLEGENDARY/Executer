package v3;

import android.content.Context;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import n3.C2651i;

public final class g {

    private static final String[] f24138a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @ResultIgnorabilityUnspecified
    public static boolean a(Context context, Throwable th) {
        try {
            C2651i.l(context);
            C2651i.l(th);
            return false;
        } catch (Exception e7) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e7);
            return false;
        }
    }
}
