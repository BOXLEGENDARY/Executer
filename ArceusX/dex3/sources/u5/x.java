package u5;

import C9.d;
import C9.h;
import P9.o;

public final class x implements d<w> {
    private final h<ka.x<o<D>>> a;

    public x(h<ka.x<o<D>>> hVar) {
        this.a = hVar;
    }

    public static x a(h<ka.x<o<D>>> hVar) {
        return new x(hVar);
    }

    public static w c(ka.x<o<D>> xVar) {
        return new w(xVar);
    }

    public w get() {
        return c((ka.x) this.a.get());
    }
}
