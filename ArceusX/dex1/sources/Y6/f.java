package y6;

import android.os.Handler;
import android.os.Looper;
import com.birbit.android.jobqueue.i;

public abstract class f extends com.birbit.android.jobqueue.e {

    private static Handler f24472I;

    private final String f24473H;

    public class a {

        public int f24474a;

        public Throwable f24475b;

        public a(int i7, Throwable th) {
            this.f24474a = i7;
            this.f24475b = th;
        }
    }

    public f() {
        this(t());
    }

    public static i t() {
        return new i(1);
    }

    protected static Handler u() {
        if (f24472I == null) {
            synchronized (f.class) {
                try {
                    if (f24472I == null) {
                        f24472I = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f24472I;
    }

    @Override
    public void k() {
    }

    @Override
    protected void l(int i7, Throwable th) {
        v(new a(i7, th));
    }

    @Override
    protected f2.d r(Throwable th, int i7, int i8) {
        return f2.d.f20479f;
    }

    protected abstract void v(a aVar);

    protected f(i iVar) {
        super(iVar);
        this.f24473H = "RobloxJob";
    }
}
