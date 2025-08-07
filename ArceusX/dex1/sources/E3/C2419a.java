package e3;

import G3.u;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import h3.InterfaceC2477a;
import i3.InterfaceC2483a;
import j3.C2497f;
import l3.C2526a;

public final class C2419a {

    @Deprecated
    public static final C2526a<C2421c> f20405a;

    public static final C2526a<GoogleSignInOptions> f20406b;

    @Deprecated
    public static final InterfaceC2477a f20407c;

    public static final InterfaceC2483a f20408d;

    public static final C2526a.g f20409e;

    public static final C2526a.g f20410f;

    private static final C2526a.AbstractC0203a f20411g;

    private static final C2526a.AbstractC0203a f20412h;

    public static final C2526a f20413i;

    public static final u f20414j;

    static {
        C2526a.g gVar = new C2526a.g();
        f20409e = gVar;
        C2526a.g gVar2 = new C2526a.g();
        f20410f = gVar2;
        C2422d c2422d = new C2422d();
        f20411g = c2422d;
        C2423e c2423e = new C2423e();
        f20412h = c2423e;
        f20405a = C2420b.f20415a;
        f20413i = new C2526a("Auth.CREDENTIALS_API", c2422d, gVar);
        f20406b = new C2526a<>("Auth.GOOGLE_SIGN_IN_API", c2423e, gVar2);
        f20407c = C2420b.f20416b;
        f20414j = new u();
        f20408d = new C2497f();
    }
}
