package ha;

import C9.d;
import C9.g;
import android.net.Uri;
import e.c;

public final class C0391n implements d<c<Uri>> {
    private final C0384g a;

    public C0391n(C0384g c0384g) {
        this.a = c0384g;
    }

    public static C0391n a(C0384g c0384g) {
        return new C0391n(c0384g);
    }

    public static c<Uri> c(C0384g c0384g) {
        return (c) g.d(c0384g.c());
    }

    public c<Uri> get() {
        return c(this.a);
    }
}
