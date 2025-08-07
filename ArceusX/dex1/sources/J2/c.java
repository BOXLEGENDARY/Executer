package J2;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.C1823h;

public final class c {

    private SharedPreferences f1716a;

    public c(Context context) {
        try {
            Context contextC = C1823h.c(context);
            this.f1716a = contextC == null ? null : contextC.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f1716a = null;
        }
    }

    public final boolean a(String str, boolean z7) {
        try {
            SharedPreferences sharedPreferences = this.f1716a;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }

    final float b(String str, float f7) {
        try {
            SharedPreferences sharedPreferences = this.f1716a;
            if (sharedPreferences == null) {
                return 0.0f;
            }
            return sharedPreferences.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    final String c(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.f1716a;
            return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }
}
