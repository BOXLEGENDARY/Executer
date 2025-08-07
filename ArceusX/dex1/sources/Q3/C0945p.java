package Q3;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

final class C0945p implements U4.g {

    private boolean f4538a = false;

    private boolean f4539b = false;

    private U4.c f4540c;

    private final C0917l f4541d;

    C0945p(C0917l c0917l) {
        this.f4541d = c0917l;
    }

    private final void b() {
        if (this.f4538a) {
            throw new U4.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f4538a = true;
    }

    final void a(U4.c cVar, boolean z7) {
        this.f4538a = false;
        this.f4540c = cVar;
        this.f4539b = z7;
    }

    @Override
    public final U4.g c(String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        b();
        this.f4541d.e(this.f4540c, str, this.f4539b);
        return this;
    }

    @Override
    public final U4.g d(boolean z7) throws IOException {
        b();
        this.f4541d.f(this.f4540c, z7 ? 1 : 0, this.f4539b);
        return this;
    }
}
