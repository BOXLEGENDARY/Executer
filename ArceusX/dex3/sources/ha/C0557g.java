package ha;

import C9.d;
import C9.g;

public final class C0557g implements d<InterfaceC0555e> {
    private final C0556f a;

    public C0557g(C0556f c0556f) {
        this.a = c0556f;
    }

    public static C0557g a(C0556f c0556f) {
        return new C0557g(c0556f);
    }

    public static InterfaceC0555e b(C0556f c0556f) {
        return (InterfaceC0555e) g.d(c0556f.getExternalInquiryController());
    }

    public InterfaceC0555e get() {
        return b(this.a);
    }
}
