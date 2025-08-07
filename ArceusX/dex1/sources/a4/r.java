package a4;

import java.util.concurrent.ExecutionException;

final class r<T> implements q<T> {

    private final Object f8321a = new Object();

    private final int f8322b;

    private final M f8323c;

    private int f8324d;

    private int f8325e;

    private int f8326f;

    private Exception f8327g;

    private boolean f8328h;

    public r(int i7, M m7) {
        this.f8322b = i7;
        this.f8323c = m7;
    }

    private final void b() {
        if (this.f8324d + this.f8325e + this.f8326f == this.f8322b) {
            if (this.f8327g == null) {
                if (this.f8328h) {
                    this.f8323c.t();
                    return;
                } else {
                    this.f8323c.s(null);
                    return;
                }
            }
            this.f8323c.r(new ExecutionException(this.f8325e + " out of " + this.f8322b + " underlying tasks failed", this.f8327g));
        }
    }

    @Override
    public final void a() {
        synchronized (this.f8321a) {
            this.f8326f++;
            this.f8328h = true;
            b();
        }
    }

    @Override
    public final void onFailure(Exception exc) {
        synchronized (this.f8321a) {
            this.f8325e++;
            this.f8327g = exc;
            b();
        }
    }

    @Override
    public final void onSuccess(T t7) {
        synchronized (this.f8321a) {
            this.f8324d++;
            b();
        }
    }
}
