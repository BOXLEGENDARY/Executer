package X4;

import java.io.IOException;

class i implements U4.g {

    private boolean f7951a = false;

    private boolean f7952b = false;

    private U4.c f7953c;

    private final f f7954d;

    i(f fVar) {
        this.f7954d = fVar;
    }

    private void a() {
        if (this.f7951a) {
            throw new U4.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f7951a = true;
    }

    void b(U4.c cVar, boolean z7) {
        this.f7951a = false;
        this.f7953c = cVar;
        this.f7952b = z7;
    }

    @Override
    public U4.g c(String str) throws IOException {
        a();
        this.f7954d.f(this.f7953c, str, this.f7952b);
        return this;
    }

    @Override
    public U4.g d(boolean z7) throws IOException {
        a();
        this.f7954d.k(this.f7953c, z7, this.f7952b);
        return this;
    }
}
