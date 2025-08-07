package w9;

import bb.InterfaceC0875b;
import d9.InterfaceC0550a;
import ha.C0378a;

public final class A {
    private final C9.h<e.c<C0378a>> a;
    private final C9.h<InterfaceC0875b> b;
    private final C9.h<InterfaceC0550a> c;

    public A(C9.h<e.c<C0378a>> hVar, C9.h<InterfaceC0875b> hVar2, C9.h<InterfaceC0550a> hVar3) {
        this.a = hVar;
        this.b = hVar2;
        this.c = hVar3;
    }

    public static A a(C9.h<e.c<C0378a>> hVar, C9.h<InterfaceC0875b> hVar2, C9.h<InterfaceC0550a> hVar3) {
        return new A(hVar, hVar2, hVar3);
    }

    public static com.withpersona.sdk2.inquiry.ui.g c(e.c<C0378a> cVar, InterfaceC0875b interfaceC0875b, InterfaceC0550a interfaceC0550a, String str, String str2, String str3, String str4) {
        return new com.withpersona.sdk2.inquiry.ui.g(cVar, interfaceC0875b, interfaceC0550a, str, str2, str3, str4);
    }

    public com.withpersona.sdk2.inquiry.ui.g b(String str, String str2, String str3, String str4) {
        return c((e.c) this.a.get(), (InterfaceC0875b) this.b.get(), (InterfaceC0550a) this.c.get(), str, str2, str3, str4);
    }
}
