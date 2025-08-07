package j3;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import l3.AbstractC2532g;
import m3.InterfaceC2579j;

public final class C2496e extends S0.a implements InterfaceC2579j {

    private final Semaphore f21134o;

    private final Set f21135p;

    public C2496e(Context context, Set set) {
        super(context);
        this.f21134o = new Semaphore(0);
        this.f21135p = set;
    }

    @Override
    public final Object C() throws InterruptedException {
        Iterator it = this.f21135p.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (((AbstractC2532g) it.next()).d(this)) {
                i7++;
            }
        }
        try {
            this.f21134o.tryAcquire(i7, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e7) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e7);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override
    protected final void p() {
        this.f21134o.drainPermits();
        h();
    }
}
