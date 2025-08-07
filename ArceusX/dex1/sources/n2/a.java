package n2;

import com.birbit.android.jobqueue.timer.Timer;
import j2.C2491a;
import java.util.concurrent.TimeUnit;

public class a implements Timer {

    final long f22243a;

    final long f22244b;

    public a() {
        C2491a.b("creating system timer", new Object[0]);
        this.f22243a = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.f22244b = System.nanoTime();
    }

    @Override
    public long nanoTime() {
        return (System.nanoTime() - this.f22244b) + this.f22243a;
    }

    @Override
    public void notifyObject(Object obj) {
        obj.notifyAll();
    }

    @Override
    public void waitOnObject(Object obj) throws InterruptedException {
        obj.wait();
    }

    @Override
    public void waitOnObjectUntilNs(Object obj, long j7) throws InterruptedException {
        long jNanoTime = nanoTime();
        if (jNanoTime > j7) {
            obj.wait(1L);
        } else {
            TimeUnit.NANOSECONDS.timedWait(obj, j7 - jNanoTime);
        }
    }
}
