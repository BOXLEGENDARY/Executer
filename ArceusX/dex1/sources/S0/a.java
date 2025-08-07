package S0;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import u0.l;

public abstract class a<D> extends b<D> {

    private Executor f6365i;

    private volatile a<D>.RunnableC0050a f6366j;

    private volatile a<D>.RunnableC0050a f6367k;

    private long f6368l;

    private long f6369m;

    private Handler f6370n;

    final class RunnableC0050a extends c<D> implements Runnable {

        boolean f6371y;

        RunnableC0050a() {
        }

        @Override
        protected D b() {
            try {
                return (D) a.this.E();
            } catch (l e7) {
                if (f()) {
                    return null;
                }
                throw e7;
            }
        }

        @Override
        protected void g(D d7) {
            a.this.y(this, d7);
        }

        @Override
        protected void h(D d7) {
            a.this.z(this, d7);
        }

        @Override
        public void run() {
            this.f6371y = false;
            a.this.A();
        }
    }

    public a(Context context) {
        super(context);
        this.f6369m = -10000L;
    }

    void A() {
        if (this.f6367k != null || this.f6366j == null) {
            return;
        }
        if (this.f6366j.f6371y) {
            this.f6366j.f6371y = false;
            this.f6370n.removeCallbacks(this.f6366j);
        }
        if (this.f6368l > 0 && SystemClock.uptimeMillis() < this.f6369m + this.f6368l) {
            this.f6366j.f6371y = true;
            this.f6370n.postAtTime(this.f6366j, this.f6369m + this.f6368l);
        } else {
            if (this.f6365i == null) {
                this.f6365i = B();
            }
            this.f6366j.c(this.f6365i);
        }
    }

    protected Executor B() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public abstract D C();

    public void D(D d7) {
    }

    protected D E() {
        return C();
    }

    @Override
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f6366j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f6366j);
            printWriter.print(" waiting=");
            printWriter.println(this.f6366j.f6371y);
        }
        if (this.f6367k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f6367k);
            printWriter.print(" waiting=");
            printWriter.println(this.f6367k.f6371y);
        }
        if (this.f6368l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f6368l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f6369m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f6369m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override
    protected boolean l() {
        if (this.f6366j == null) {
            return false;
        }
        if (!j()) {
            m();
        }
        if (this.f6367k != null) {
            if (this.f6366j.f6371y) {
                this.f6366j.f6371y = false;
                this.f6370n.removeCallbacks(this.f6366j);
            }
            this.f6366j = null;
            return false;
        }
        if (this.f6366j.f6371y) {
            this.f6366j.f6371y = false;
            this.f6370n.removeCallbacks(this.f6366j);
            this.f6366j = null;
            return false;
        }
        boolean zA = this.f6366j.a(false);
        if (zA) {
            this.f6367k = this.f6366j;
            x();
        }
        this.f6366j = null;
        return zA;
    }

    @Override
    protected void n() {
        super.n();
        b();
        this.f6366j = new RunnableC0050a();
        A();
    }

    public void x() {
    }

    void y(a<D>.RunnableC0050a runnableC0050a, D d7) {
        D(d7);
        if (this.f6367k == runnableC0050a) {
            t();
            this.f6369m = SystemClock.uptimeMillis();
            this.f6367k = null;
            e();
            A();
        }
    }

    void z(a<D>.RunnableC0050a runnableC0050a, D d7) {
        if (this.f6366j != runnableC0050a) {
            y(runnableC0050a, d7);
            return;
        }
        if (i()) {
            D(d7);
            return;
        }
        c();
        this.f6369m = SystemClock.uptimeMillis();
        this.f6366j = null;
        f(d7);
    }
}
