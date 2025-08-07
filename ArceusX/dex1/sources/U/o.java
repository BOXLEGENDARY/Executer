package u;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

public class o extends n {
    o(int i7, Surface surface) {
        this(new OutputConfiguration(i7, surface));
    }

    static o m(OutputConfiguration outputConfiguration) {
        return new o(outputConfiguration);
    }

    @Override
    public Surface a() {
        return super.a();
    }

    @Override
    public void b(long j7) {
        if (j7 == -1) {
            return;
        }
        ((OutputConfiguration) i()).setStreamUseCase(j7);
    }

    @Override
    public void c(Surface surface) {
        super.c(surface);
    }

    @Override
    public void d(long j7) {
        ((OutputConfiguration) i()).setDynamicRangeProfile(j7);
    }

    @Override
    public String e() {
        return super.e();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void f() {
        super.f();
    }

    @Override
    public void g(String str) {
        super.g(str);
    }

    @Override
    public void h(int i7) {
        ((OutputConfiguration) i()).setMirrorMode(i7);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public Object i() {
        x0.g.a(this.f23861a instanceof OutputConfiguration);
        return this.f23861a;
    }

    o(Object obj) {
        super(obj);
    }
}
