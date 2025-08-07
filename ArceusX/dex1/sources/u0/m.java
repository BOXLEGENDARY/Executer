package u0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
public final class m {

    private static long f23894a;

    private static Method f23895b;

    private static Method f23896c;

    private static Method f23897d;

    private static Method f23898e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f23894a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f23895b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f23896c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f23897d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f23898e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e7) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e7);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
