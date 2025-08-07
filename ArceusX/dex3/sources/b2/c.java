package b2;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

public class c implements P1.h {
    private static final Set<String> a = new HashSet();

    @Override
    public void a(String str, Throwable th) {
        if (P1.c.a) {
            Log.d("LOTTIE", str, th);
        }
    }

    @Override
    public void b(String str) {
        e(str, null);
    }

    @Override
    public void c(String str, Throwable th) {
        Set<String> set = a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }

    @Override
    public void d(String str) {
        c(str, null);
    }

    public void e(String str, Throwable th) {
        if (P1.c.a) {
            Log.d("LOTTIE", str, th);
        }
    }
}
