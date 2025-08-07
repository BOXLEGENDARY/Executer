package ha;

import C9.d;
import C9.g;
import C9.h;
import android.view.Window;
import i9.C0594a;

public final class C0445D implements d<C0594a> {
    private final C0479x a;
    private final h<Window> b;

    public C0445D(C0479x c0479x, h<Window> hVar) {
        this.a = c0479x;
        this.b = hVar;
    }

    public static C0445D a(C0479x c0479x, h<Window> hVar) {
        return new C0445D(c0479x, hVar);
    }

    public static C0594a c(C0479x c0479x, Window window) {
        return (C0594a) g.d(c0479x.f(window));
    }

    public C0594a get() {
        return c(this.a, (Window) this.b.get());
    }
}
