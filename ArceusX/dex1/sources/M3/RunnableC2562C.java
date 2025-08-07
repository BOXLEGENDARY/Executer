package m3;

import com.google.android.gms.signin.internal.zak;

final class RunnableC2562C implements Runnable {

    final zak f21991d;

    final BinderC2564E f21992e;

    RunnableC2562C(BinderC2564E binderC2564E, zak zakVar) {
        this.f21992e = binderC2564E;
        this.f21991d = zakVar;
    }

    @Override
    public final void run() {
        BinderC2564E.S5(this.f21992e, this.f21991d);
    }
}
