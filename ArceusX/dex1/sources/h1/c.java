package h1;

import android.os.Trace;

final class c {
    public static boolean a() {
        return Trace.isEnabled();
    }

    public static void b(String str, int i7) {
        Trace.setCounter(str, i7);
    }
}
