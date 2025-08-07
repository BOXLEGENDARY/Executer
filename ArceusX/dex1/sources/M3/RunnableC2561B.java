package m3;

import com.google.android.gms.common.ConnectionResult;

final class RunnableC2561B implements Runnable {

    final BinderC2564E f21990d;

    RunnableC2561B(BinderC2564E binderC2564E) {
        this.f21990d = binderC2564E;
    }

    @Override
    public final void run() {
        this.f21990d.f22000z.b(new ConnectionResult(4));
    }
}
