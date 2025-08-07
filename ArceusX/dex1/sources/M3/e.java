package M3;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.location.m;
import l3.AbstractC2532g;
import n3.C2644b;

public final class e extends m {

    private final com.google.android.gms.internal.location.i f2356d0;

    public e(Context context, Looper looper, AbstractC2532g.a aVar, AbstractC2532g.b bVar, String str, C2644b c2644b) {
        super(context, looper, aVar, bVar, str, c2644b);
        this.f2356d0 = new com.google.android.gms.internal.location.i(context, this.f14618c0);
    }

    @Override
    public final boolean S() {
        return true;
    }

    @Override
    public final void i() {
        synchronized (this.f2356d0) {
            if (a()) {
                try {
                    this.f2356d0.b();
                    this.f2356d0.c();
                } catch (Exception e7) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e7);
                }
                super.i();
            } else {
                super.i();
            }
        }
    }
}
