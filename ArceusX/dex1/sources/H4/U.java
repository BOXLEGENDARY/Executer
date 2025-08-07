package H4;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import e2.vb.oyfFwvPUKctyaG;
import java.util.IllegalFormatException;
import java.util.Locale;

public final class U {

    private final String f1582a;

    public U(String str) {
        this.f1582a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    private static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e7) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e7);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final int a(String str, Object... objArr) {
        String str2 = oyfFwvPUKctyaG.JofGBsVOwUib;
        if (Log.isLoggable(str2, 6)) {
            return Log.e(str2, e(this.f1582a, str, objArr));
        }
        return 0;
    }

    public final int b(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", e(this.f1582a, str, objArr), th);
        }
        return 0;
    }

    public final int c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", e(this.f1582a, str, objArr));
        }
        return 0;
    }

    public final int d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", e(this.f1582a, str, objArr));
        }
        return 0;
    }
}
