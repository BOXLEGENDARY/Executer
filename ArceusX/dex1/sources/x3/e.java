package X3;

import com.google.android.gms.common.api.Scope;
import l3.C2526a;

public final class e {

    public static final C2526a.g f7917a;

    public static final C2526a.g f7918b;

    public static final C2526a.AbstractC0203a f7919c;

    static final C2526a.AbstractC0203a f7920d;

    public static final Scope f7921e;

    public static final Scope f7922f;

    public static final C2526a f7923g;

    public static final C2526a f7924h;

    static {
        C2526a.g gVar = new C2526a.g();
        f7917a = gVar;
        C2526a.g gVar2 = new C2526a.g();
        f7918b = gVar2;
        b bVar = new b();
        f7919c = bVar;
        c cVar = new c();
        f7920d = cVar;
        f7921e = new Scope("profile");
        f7922f = new Scope("email");
        f7923g = new C2526a("SignIn.API", bVar, gVar);
        f7924h = new C2526a("SignIn.INTERNAL_API", cVar, gVar2);
    }
}
