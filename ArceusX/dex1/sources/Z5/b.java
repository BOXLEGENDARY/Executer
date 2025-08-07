package Z5;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public abstract class b {

    private Handler f8226c;

    private c f8225b = c.IDLE;

    private Z5.a f8227d = new a();

    private Runnable f8228e = new RunnableC0062b();

    Queue<Z5.c> f8224a = new ArrayBlockingQueue(20);

    class a implements Z5.a {
        a() {
        }

        @Override
        public void a() {
            b.this.f8225b = c.IDLE;
            b.this.c();
        }
    }

    class RunnableC0062b implements Runnable {
        RunnableC0062b() {
        }

        @Override
        public void run() {
            b.this.c();
        }
    }

    private enum c {
        IDLE,
        PROCESSING
    }

    protected b() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f8226c = new Handler();
    }

    public void b(Z5.c cVar) {
        try {
            this.f8224a.add(cVar);
        } catch (IllegalStateException unused) {
            Log.e("RbxBlockingQueue", "Queue full! Cannot add more reports.");
        }
        c();
    }

    protected void c() {
        c cVar = this.f8225b;
        c cVar2 = c.IDLE;
        if (cVar == cVar2) {
            this.f8225b = c.PROCESSING;
            Z5.c cVarPeek = this.f8224a.peek();
            if (cVarPeek == null || !cVarPeek.b()) {
                this.f8225b = cVar2;
                this.f8226c.removeCallbacks(this.f8228e);
                if (this.f8224a.size() > 0) {
                    this.f8226c.postDelayed(this.f8228e, 10000L);
                    return;
                }
                return;
            }
            Z5.c cVarPoll = this.f8224a.poll();
            if (cVarPoll != null) {
                cVarPoll.a(this.f8227d);
            } else {
                this.f8225b = cVar2;
            }
        }
    }
}
