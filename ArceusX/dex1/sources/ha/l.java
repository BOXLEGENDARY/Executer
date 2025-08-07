package ha;

import android.os.AsyncTask;
import com.roblox.engine.jni.NativeReportingInterface;

public class l {

    private static boolean f2148a;

    private static boolean f2149b;

    class a implements Runnable {
        a() {
        }

        @Override
        public void run() {
            NativeReportingInterface.reportStopwatchAllStats();
        }
    }

    public static void a(String str) {
        if (c()) {
            NativeReportingInterface.addStopwatchCheckpoint(str);
        }
    }

    public static void b() {
        if (f2149b) {
            return;
        }
        f2148a = true;
        NativeReportingInterface.initStopwatch();
    }

    private static boolean c() {
        return f2148a && !f2149b;
    }

    public static void d() {
        if (c()) {
            f2149b = true;
            AsyncTask.execute(new a());
        }
    }
}
