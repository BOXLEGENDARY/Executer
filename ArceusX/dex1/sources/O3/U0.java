package O3;

import java.io.IOException;

final class U0 implements U4.g {

    private boolean f3296a = false;

    private boolean f3297b = false;

    private U4.c f3298c;

    private final Q0 f3299d;

    U0(Q0 q02) {
        this.f3299d = q02;
    }

    private final void b() {
        if (this.f3296a) {
            throw new U4.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f3296a = true;
    }

    final void a(U4.c cVar, boolean z7) {
        this.f3296a = false;
        this.f3298c = cVar;
        this.f3297b = z7;
    }

    @Override
    public final U4.g c(String str) throws IOException {
        b();
        this.f3299d.e(this.f3298c, str, this.f3297b);
        return this;
    }

    @Override
    public final U4.g d(boolean z7) throws IOException {
        b();
        this.f3299d.f(this.f3298c, z7 ? 1 : 0, this.f3297b);
        return this;
    }
}
