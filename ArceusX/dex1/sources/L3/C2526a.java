package l3;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import java.util.Set;
import l3.AbstractC2532g;
import l3.C2526a.d;
import m3.InterfaceC2572c;
import m3.InterfaceC2577h;
import n3.C2644b;
import n3.C2651i;

public final class C2526a<O extends d> {

    private final AbstractC0203a f21781a;

    private final g f21782b;

    private final String f21783c;

    public static abstract class AbstractC0203a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, C2644b c2644b, O o2, AbstractC2532g.a aVar, AbstractC2532g.b bVar) {
            return (T) b(context, looper, c2644b, o2, aVar, bVar);
        }

        public T b(Context context, Looper looper, C2644b c2644b, O o2, InterfaceC2572c interfaceC2572c, InterfaceC2577h interfaceC2577h) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        public static final c f21784x = new c(null);

        public interface InterfaceC0204a extends d {
            Account k();
        }

        public interface b extends d {
            GoogleSignInAccount g();
        }

        public static final class c implements d {
            private c() {
            }

            c(C2543r c2543r) {
            }
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        boolean a();

        Set<Scope> c();

        void d(com.google.android.gms.common.internal.e eVar, Set<Scope> set);

        void e(String str);

        boolean f();

        String g();

        void h(b.c cVar);

        void i();

        void j(b.e eVar);

        boolean k();

        int l();

        Feature[] m();

        String n();

        boolean o();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> C2526a(String str, AbstractC0203a<C, O> abstractC0203a, g<C> gVar) {
        C2651i.m(abstractC0203a, "Cannot construct an Api with a null ClientBuilder");
        C2651i.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f21783c = str;
        this.f21781a = abstractC0203a;
        this.f21782b = gVar;
    }

    public final AbstractC0203a a() {
        return this.f21781a;
    }

    public final c b() {
        return this.f21782b;
    }

    public final String c() {
        return this.f21783c;
    }
}
