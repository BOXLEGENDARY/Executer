package ha;

import C9.d;
import C9.g;
import e.c;

public final class C0382e implements d<c<C0378a>> {
    private final C0379b a;

    public C0382e(C0379b c0379b) {
        this.a = c0379b;
    }

    public static C0382e a(C0379b c0379b) {
        return new C0382e(c0379b);
    }

    public static c<C0378a> b(C0379b c0379b) {
        return (c) g.d(c0379b.a());
    }

    public c<C0378a> get() {
        return b(this.a);
    }
}
