package ha;

import C9.d;
import C9.g;
import C9.h;
import d9.c;
import d9.j;

public final class C0480y implements d<c> {
    private final C0479x a;
    private final h<j> b;

    public C0480y(C0479x c0479x, h<j> hVar) {
        this.a = c0479x;
        this.b = hVar;
    }

    public static c a(C0479x c0479x, j jVar) {
        return (c) g.d(c0479x.a(jVar));
    }

    public static C0480y b(C0479x c0479x, h<j> hVar) {
        return new C0480y(c0479x, hVar);
    }

    public c get() {
        return a(this.a, (j) this.b.get());
    }
}
