package C;

import android.view.C1709w;
import android.view.LiveData;

public class V0 extends C0342n0 {

    private final I f460b;

    private final Z0 f461c;

    private boolean f462d;

    private boolean f463e;

    private final B f464f;

    public V0(I i7, B b2) {
        super(i7);
        this.f462d = false;
        this.f463e = false;
        this.f460b = i7;
        this.f464f = b2;
        this.f461c = b2.P(null);
        t(b2.z());
        s(b2.O());
    }

    @Override
    public LiveData<Integer> e() {
        return !E.o.b(this.f461c, 6) ? new C1709w(0) : this.f460b.e();
    }

    @Override
    public I f() {
        return this.f460b;
    }

    @Override
    public LiveData<z.J0> q() {
        return !E.o.b(this.f461c, 0) ? new C1709w(H.g.e(1.0f, 1.0f, 1.0f, 0.0f)) : this.f460b.q();
    }

    public B r() {
        return this.f464f;
    }

    public void s(boolean z7) {
        this.f463e = z7;
    }

    public void t(boolean z7) {
        this.f462d = z7;
    }
}
