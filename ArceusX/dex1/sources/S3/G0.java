package S3;

import java.io.IOException;

final class G0 implements U4.g {

    private boolean f6523a = false;

    private boolean f6524b = false;

    private U4.c f6525c;

    private final C0 f6526d;

    G0(C0 c02) {
        this.f6526d = c02;
    }

    private final void b() {
        if (this.f6523a) {
            throw new U4.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f6523a = true;
    }

    final void a(U4.c cVar, boolean z7) {
        this.f6523a = false;
        this.f6525c = cVar;
        this.f6524b = z7;
    }

    @Override
    public final U4.g c(String str) throws IOException {
        b();
        this.f6526d.e(this.f6525c, str, this.f6524b);
        return this;
    }

    @Override
    public final U4.g d(boolean z7) throws IOException {
        b();
        this.f6526d.f(this.f6525c, z7 ? 1 : 0, this.f6524b);
        return this;
    }
}
