package u5;

import C9.d;
import C9.h;
import P9.o;
import ka.x;

public final class I implements d<H> {
    private final h<K> a;
    private final h<x<o<J>>> b;

    public I(h<K> hVar, h<x<o<J>>> hVar2) {
        this.a = hVar;
        this.b = hVar2;
    }

    public static I a(h<K> hVar, h<x<o<J>>> hVar2) {
        return new I(hVar, hVar2);
    }

    public static H c(K k, x<o<J>> xVar) {
        return new H(k, xVar);
    }

    public H get() {
        return c((K) this.a.get(), (x) this.b.get());
    }
}
