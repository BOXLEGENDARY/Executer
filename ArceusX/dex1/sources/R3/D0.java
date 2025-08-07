package R3;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

final class D0 implements U4.g {

    private boolean f5154a = false;

    private boolean f5155b = false;

    private U4.c f5156c;

    private final C1213z0 f5157d;

    D0(C1213z0 c1213z0) {
        this.f5157d = c1213z0;
    }

    private final void b() {
        if (this.f5154a) {
            throw new U4.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f5154a = true;
    }

    final void a(U4.c cVar, boolean z7) {
        this.f5154a = false;
        this.f5156c = cVar;
        this.f5155b = z7;
    }

    @Override
    public final U4.g c(String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        b();
        this.f5157d.e(this.f5156c, str, this.f5155b);
        return this;
    }

    @Override
    public final U4.g d(boolean z7) throws IOException {
        b();
        this.f5157d.f(this.f5156c, z7 ? 1 : 0, this.f5155b);
        return this;
    }
}
