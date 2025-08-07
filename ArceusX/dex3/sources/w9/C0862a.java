package w9;

import bb.InterfaceC0875b;
import d9.InterfaceC0550a;
import ha.C0378a;

public final class C0862a {
    private final C9.h<InterfaceC0875b> a;
    private final C9.h<InterfaceC0550a> b;
    private final C9.h<e.c<C0378a>> c;

    public C0862a(C9.h<InterfaceC0875b> hVar, C9.h<InterfaceC0550a> hVar2, C9.h<e.c<C0378a>> hVar3) {
        this.a = hVar;
        this.b = hVar2;
        this.c = hVar3;
    }

    public static C0862a a(C9.h<InterfaceC0875b> hVar, C9.h<InterfaceC0550a> hVar2, C9.h<e.c<C0378a>> hVar3) {
        return new C0862a(hVar, hVar2, hVar3);
    }

    public static com.withpersona.sdk2.inquiry.ui.b c(InterfaceC0875b interfaceC0875b, InterfaceC0550a interfaceC0550a, e.c<C0378a> cVar, String str, String str2, String str3, String str4) {
        return new com.withpersona.sdk2.inquiry.ui.b(interfaceC0875b, interfaceC0550a, cVar, str, str2, str3, str4);
    }

    public com.withpersona.sdk2.inquiry.ui.b b(String str, String str2, String str3, String str4) {
        return c((InterfaceC0875b) this.a.get(), (InterfaceC0550a) this.b.get(), (e.c) this.c.get(), str, str2, str3, str4);
    }
}
