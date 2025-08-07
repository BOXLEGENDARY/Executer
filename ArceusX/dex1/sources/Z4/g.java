package Z4;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

class g {

    private static g f8220c;

    private static final SimpleDateFormat f8221d = new SimpleDateFormat("dd/MM/yyyy z");

    private final SharedPreferences f8222a;

    private final SharedPreferences f8223b;

    private g(Context context) {
        this.f8222a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.f8223b = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    static synchronized g a(Context context) {
        try {
            if (f8220c == null) {
                f8220c = new g(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8220c;
    }

    static boolean b(long j7, long j8) {
        Date date = new Date(j7);
        Date date2 = new Date(j8);
        SimpleDateFormat simpleDateFormat = f8221d;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    synchronized boolean c(long j7) {
        return d("fire-global", j7);
    }

    synchronized boolean d(String str, long j7) {
        if (!this.f8222a.contains(str)) {
            this.f8222a.edit().putLong(str, j7).apply();
            return true;
        }
        if (!b(this.f8222a.getLong(str, -1L), j7)) {
            return false;
        }
        this.f8222a.edit().putLong(str, j7).apply();
        return true;
    }
}
