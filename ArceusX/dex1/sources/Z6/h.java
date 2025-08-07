package z6;

import E6.k;
import android.content.Context;
import h7.l;
import z6.C3086b;

public class h {

    B6.a f24901a = new B6.a();

    C3086b f24902b = C3086b.f();

    class a implements g {

        final boolean f24903a;

        final Context f24904b;

        final c f24905c;

        a(boolean z7, Context context, c cVar) {
            this.f24903a = z7;
            this.f24904b = context;
            this.f24905c = cVar;
        }

        @Override
        public void a(f fVar, f fVar2, String str) {
            if (this.f24903a || k.e().i()) {
                h.this.f24902b.s(C3086b.EnumC0243b.LOCALE_MODE_GENERAL_EXPERIENCE);
                fVar = fVar2;
            } else {
                if (fVar != null) {
                    l.g("rbx.locale", "persisting loginSignUpLocale locale: " + fVar);
                    h.this.f24902b.o(fVar, this.f24904b);
                } else {
                    fVar = h.this.f24902b.d(this.f24904b);
                }
                h.this.f24902b.s(C3086b.EnumC0243b.LOCALE_MODE_LOGIN_SIGN_UP);
            }
            h.this.f24902b.t(this.f24904b, str);
            h.this.f24902b.r(fVar2);
            this.f24905c.a(h.this.f24902b.n(fVar, this.f24904b));
        }
    }

    class b implements g {

        final Context f24907a;

        final d f24908b;

        b(Context context, d dVar) {
            this.f24907a = context;
            this.f24908b = dVar;
        }

        @Override
        public void a(f fVar, f fVar2, String str) {
            if (k.e().i() || h.this.f24902b.g() == C3086b.EnumC0243b.LOCALE_MODE_GENERAL_EXPERIENCE) {
                fVar = fVar2;
            }
            h.this.f24902b.t(this.f24907a, str);
            this.f24908b.a(h.this.f24902b.n(fVar, this.f24907a));
        }
    }

    public interface c {
        void a(boolean z7);
    }

    public interface d {
        void a(boolean z7);
    }

    public void a(Context context, c cVar) {
        b(context, false, cVar);
    }

    public void b(Context context, boolean z7, c cVar) {
        this.f24901a.d(this.f24902b.e(), new a(z7, context, cVar));
    }

    public void c(Context context, d dVar) {
        this.f24901a.d(this.f24902b.e(), new b(context, dVar));
    }
}
