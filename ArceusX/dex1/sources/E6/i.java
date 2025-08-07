package E6;

import android.content.Context;
import android.util.Log;
import com.appsflyer.R;
import com.birbit.android.jobqueue.log.CustomLogger;
import h2.a;

public class i {

    public static boolean f1211a;

    private static com.birbit.android.jobqueue.g f1212b;

    private static class a implements CustomLogger {
        @Override
        public void d(String str, Object... objArr) {
            Log.d("JobManager", String.format(str, objArr));
        }

        @Override
        public void e(Throwable th, String str, Object... objArr) {
            Log.e("JobManager", String.format(str, objArr), th);
        }

        @Override
        public boolean isDebugEnabled() {
            return i.f1211a;
        }

        @Override
        public void v(String str, Object... objArr) {
            Log.v("JobManager", String.format(str, objArr));
        }

        private a() {
        }

        @Override
        public void e(String str, Object... objArr) {
            Log.e("JobManager", String.format(str, objArr));
        }
    }

    public static void a(Context context, String str) {
        if (f1212b == null) {
            a.b bVarB = new a.b(context).g(1).f(3).e(3).b(R.styleable.AppCompatTheme_windowFixedHeightMajor);
            if (f1211a) {
                bVarB.c(new a());
            }
            if (str != null) {
                bVarB.d(str);
            }
            f1212b = new com.birbit.android.jobqueue.g(bVarB.a());
        }
    }

    public static com.birbit.android.jobqueue.g b() {
        return f1212b;
    }
}
