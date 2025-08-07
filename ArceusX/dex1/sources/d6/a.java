package D6;

import M6.i;
import Q6.m;
import V5.d;
import android.content.Context;
import android.os.Build;
import androidx.core.app.p;
import e7.b;
import e7.f;
import h7.n;

public class a extends V5.d {

    private Context f989d;

    private long f990e;

    private String f991f;

    private d f992g;

    class C0007a implements d.a {

        class C0008a implements b.b {
            C0008a() {
            }

            public void a(f fVar) {
                a.this.d("UserSelectedTheme");
            }
        }

        C0007a() {
        }

        @Override
        public void start() {
            new e7.b().b(new C0008a());
        }
    }

    class b implements d.a {

        String f995a;

        long f996b;

        public b(String str, long j7) {
            this.f995a = str;
            this.f996b = j7;
        }

        @Override
        public void start() {
            if (a.this.f989d != null) {
                if (n.e()) {
                    i iVarN0 = i.n0(a.this.f989d);
                    if (iVarN0 != null) {
                        iVarN0.i0(this.f996b, this.f995a, true);
                    }
                } else if (n.h()) {
                    P6.a.a(a.this.f989d);
                }
            }
            a.this.d("GrantPendingPurchases");
        }
    }

    private class c implements d.a {
        @Override
        public void start() {
            if (a.this.f989d != null) {
                if (!p.b(a.this.f989d).a() && Build.VERSION.SDK_INT >= 33) {
                    a.this.d("PushNotificationRegistration");
                    return;
                } else if (p.b(a.this.f989d).a()) {
                    m.c().n(a.this.f989d, true);
                }
            }
            a.this.d("PushNotificationRegistration");
        }

        private c() {
        }
    }

    public interface d {
        void a();
    }

    public a(Context context, String str, long j7, String str2) {
        super(str);
        this.f989d = context;
        this.f990e = j7;
        this.f991f = str2;
        a(new c());
        a(new C0007a());
        a(new b(this.f991f, this.f990e));
    }

    @Override
    public void b() {
        d dVar = this.f992g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void g(d dVar) {
        this.f992g = dVar;
    }
}
