package H;

import C.InterfaceC0364z;
import C.g1;
import E.h;
import android.graphics.Matrix;
import z.V;

public final class c implements V {

    private final InterfaceC0364z f1481a;

    public c(InterfaceC0364z interfaceC0364z) {
        this.f1481a = interfaceC0364z;
    }

    @Override
    public void a(h.b bVar) {
        this.f1481a.a(bVar);
    }

    @Override
    public g1 b() {
        return this.f1481a.b();
    }

    @Override
    public int c() {
        return 0;
    }

    @Override
    public long d() {
        return this.f1481a.d();
    }

    @Override
    public Matrix e() {
        return new Matrix();
    }

    public InterfaceC0364z f() {
        return this.f1481a;
    }
}
