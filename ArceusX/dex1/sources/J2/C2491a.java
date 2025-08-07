package j2;

import android.util.Log;
import com.birbit.android.jobqueue.log.CustomLogger;

public class C2491a {

    private static CustomLogger f21125a;

    static class C0202a implements CustomLogger {
        C0202a() {
        }

        @Override
        public void d(String str, Object... objArr) {
        }

        @Override
        public void e(Throwable th, String str, Object... objArr) {
        }

        @Override
        public boolean isDebugEnabled() {
            return false;
        }

        @Override
        public void v(String str, Object... objArr) {
        }

        @Override
        public void e(String str, Object... objArr) {
        }
    }

    public static class b implements CustomLogger {
        @Override
        public void d(String str, Object... objArr) {
        }

        @Override
        public void e(Throwable th, String str, Object... objArr) {
            Log.e("JobManager", String.format(str, objArr), th);
        }

        @Override
        public boolean isDebugEnabled() {
            return false;
        }

        @Override
        public void v(String str, Object... objArr) {
        }

        @Override
        public void e(String str, Object... objArr) {
            Log.e("JobManager", String.format(str, objArr));
        }
    }

    static {
        a();
    }

    public static void a() {
        f(new C0202a());
    }

    public static void b(String str, Object... objArr) {
        f21125a.d(str, objArr);
    }

    public static void c(String str, Object... objArr) {
        f21125a.e(str, objArr);
    }

    public static void d(Throwable th, String str, Object... objArr) {
        f21125a.e(th, str, objArr);
    }

    public static boolean e() {
        return f21125a.isDebugEnabled();
    }

    public static void f(CustomLogger customLogger) {
        f21125a = customLogger;
    }

    public static void g(String str, Object... objArr) {
        f21125a.v(str, objArr);
    }
}
