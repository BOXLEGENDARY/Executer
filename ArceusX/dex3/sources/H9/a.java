package H9;

import G9.j;
import G9.l;
import G9.q;
import G9.s;
import H9.b;
import Sa.r;
import Sa.t;
import Sa.u;
import Sa.v;
import Sa.w;
import Sa.x;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a extends G9.a {
    private final List<p> a = new ArrayList(0);
    private boolean b;

    class C0024a implements l.c<x> {
        C0024a() {
        }

        @Override
        public void a(@NonNull G9.l lVar, @NonNull x xVar) {
            lVar.g(xVar);
            int length = lVar.length();
            lVar.n().append((char) 160);
            lVar.t(xVar, length);
            lVar.l(xVar);
        }
    }

    class b implements l.c<Sa.i> {
        b() {
        }

        @Override
        public void a(@NonNull G9.l lVar, @NonNull Sa.i iVar) {
            lVar.g(iVar);
            int length = lVar.length();
            lVar.u(iVar);
            H9.b.d.d(lVar.A(), Integer.valueOf(iVar.n()));
            lVar.t(iVar, length);
            lVar.l(iVar);
        }
    }

    class c implements l.c<u> {
        c() {
        }

        @Override
        public void a(@NonNull G9.l lVar, @NonNull u uVar) {
            lVar.n().append(' ');
        }
    }

    class d implements l.c<Sa.h> {
        d() {
        }

        @Override
        public void a(@NonNull G9.l lVar, @NonNull Sa.h hVar) {
            lVar.x();
        }
    }

    class e implements l.c<t> {
        e() {
        }

        @Override
        public void a(@NonNull G9.l lVar, @NonNull t tVar) {
            boolean zY = a.y(tVar);
            if (!zY) {
                lVar.g(tVar);
            }
            int length = lVar.length();
            lVar.u(tVar);
            H9.b.f.d(lVar.A(), Boolean.valueOf(zY));
            lVar.t(tVar, length);
            if (zY) {
                return;
            }
            lVar.l(tVar);
        }
    }

    class f implements l.c<Sa.n> {
        f() {
        }

        @Override
        public void a(@NonNull G9.l lVar, @NonNull Sa.n nVar) {
            int length = lVar.length();
            lVar.u(nVar);
            H9.b.e.d(lVar.A(), nVar.m());
            lVar.t(nVar, length);
        }
    }

    class g implements l.c<w> {
        g() {
        }

        @Override
        public void a(@NonNull G9.l lVar, @NonNull w wVar) {
            String strM = wVar.m();
            lVar.n().d(strM);
            if (a.this.a.isEmpty()) {
                return;
            }
            int length = lVar.length() - strM.length();
            Iterator it = a.this.a.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a(lVar, strM, length);
            }
        }
    }

    class h implements l.c<v> {
        h() {
        }

        @Override
        public void a(@NonNull G9.l lVar, @NonNull v vVar) {
            int length = lVar.length();
            lVar.u(vVar);
            lVar.t(vVar, length);
        }
    }

    class i implements l.c<Sa.f> {
        i() {
        }

        @Override
        public void a(@NonNull G9.l lVar, @NonNull Sa.f fVar) {
            int length = lVar.length();
            lVar.u(fVar);
            lVar.t(fVar, length);
        }
    }

    class j implements l.c<Sa.b> {
        j() {
        }

        @Override
        public void a(@NonNull G9.l lVar, @NonNull Sa.b bVar) {
            lVar.g(bVar);
            int length = lVar.length();
            lVar.u(bVar);
            lVar.t(bVar, length);
            lVar.l(bVar);
        }
    }

    class k implements l.c<Sa.d> {
        k() {
        }

        @Override
        public void a(@NonNull G9.l lVar, @NonNull Sa.d dVar) {
            int length = lVar.length();
            lVar.n().append((char) 160).d(dVar.m()).append((char) 160);
            lVar.t(dVar, length);
        }
    }

    class l implements l.c<Sa.g> {
        l() {
        }

        @Override
        public void a(@NonNull G9.l lVar, @NonNull Sa.g gVar) {
            a.I(lVar, gVar.q(), gVar.r(), gVar);
        }
    }

    class m implements l.c<Sa.m> {
        m() {
        }

        @Override
        public void a(@NonNull G9.l lVar, @NonNull Sa.m mVar) {
            a.I(lVar, null, mVar.n(), mVar);
        }
    }

    class n implements l.c<Sa.l> {
        n() {
        }

        @Override
        public void a(@NonNull G9.l lVar, @NonNull Sa.l lVar2) {
            s sVarA = lVar.q().c().a(Sa.l.class);
            if (sVarA == null) {
                lVar.u(lVar2);
                return;
            }
            int length = lVar.length();
            lVar.u(lVar2);
            if (length == lVar.length()) {
                lVar.n().append((char) 65532);
            }
            G9.g gVarQ = lVar.q();
            boolean z = lVar2.f() instanceof Sa.n;
            String strB = gVarQ.a().b(lVar2.m());
            q qVarA = lVar.A();
            K9.c.a.d(qVarA, strB);
            K9.c.b.d(qVarA, Boolean.valueOf(z));
            K9.c.c.d(qVarA, null);
            lVar.e(length, sVarA.a(gVarQ, qVarA));
        }
    }

    class o implements l.c<Sa.q> {
        o() {
        }

        @Override
        public void a(@NonNull G9.l lVar, @NonNull Sa.q qVar) {
            int length = lVar.length();
            lVar.u(qVar);
            Sa.a aVarF = qVar.f();
            if (aVarF instanceof Sa.s) {
                Sa.s sVar = (Sa.s) aVarF;
                int iQ = sVar.q();
                H9.b.a.d(lVar.A(), b.a.ORDERED);
                H9.b.c.d(lVar.A(), Integer.valueOf(iQ));
                sVar.s(sVar.q() + 1);
            } else {
                H9.b.a.d(lVar.A(), b.a.BULLET);
                H9.b.b.d(lVar.A(), Integer.valueOf(a.B(qVar)));
            }
            lVar.t(qVar, length);
            if (lVar.c(qVar)) {
                lVar.x();
            }
        }
    }

    public interface p {
        void a(@NonNull G9.l lVar, @NonNull String str, int i);
    }

    protected a() {
    }

    private static void A(@NonNull l.b bVar) {
        bVar.a(Sa.q.class, new o());
    }

    public static int B(@NonNull r rVar) {
        int i2 = 0;
        for (r rVarF = rVar.f(); rVarF != null; rVarF = rVarF.f()) {
            if (rVarF instanceof Sa.q) {
                i2++;
            }
        }
        return i2;
    }

    private static void C(@NonNull l.b bVar) {
        bVar.a(Sa.s.class, new H9.d());
    }

    private static void D(@NonNull l.b bVar) {
        bVar.a(t.class, new e());
    }

    private static void E(@NonNull l.b bVar) {
        bVar.a(u.class, new c());
    }

    private static void F(@NonNull l.b bVar) {
        bVar.a(v.class, new h());
    }

    private void G(@NonNull l.b bVar) {
        bVar.a(w.class, new g());
    }

    private static void H(@NonNull l.b bVar) {
        bVar.a(x.class, new C0024a());
    }

    static void I(@NonNull G9.l lVar, String str, @NonNull String str2, @NonNull r rVar) {
        lVar.g(rVar);
        int length = lVar.length();
        lVar.n().append((char) 160).append('\n').append(lVar.q().d().a(str, str2));
        lVar.x();
        lVar.n().append((char) 160);
        H9.b.g.d(lVar.A(), str);
        lVar.t(rVar, length);
        lVar.l(rVar);
    }

    private static void o(@NonNull l.b bVar) {
        bVar.a(Sa.b.class, new j());
    }

    private static void p(@NonNull l.b bVar) {
        bVar.a(Sa.c.class, new H9.d());
    }

    private static void q(@NonNull l.b bVar) {
        bVar.a(Sa.d.class, new k());
    }

    @NonNull
    public static a r() {
        return new a();
    }

    private static void s(@NonNull l.b bVar) {
        bVar.a(Sa.f.class, new i());
    }

    private static void t(@NonNull l.b bVar) {
        bVar.a(Sa.g.class, new l());
    }

    private static void u(@NonNull l.b bVar) {
        bVar.a(Sa.h.class, new d());
    }

    private static void v(@NonNull l.b bVar) {
        bVar.a(Sa.i.class, new b());
    }

    private static void w(l.b bVar) {
        bVar.a(Sa.l.class, new n());
    }

    private static void x(@NonNull l.b bVar) {
        bVar.a(Sa.m.class, new m());
    }

    public static boolean y(@NonNull t tVar) {
        Sa.a aVarF = tVar.f();
        if (aVarF == null) {
            return false;
        }
        r rVarF = aVarF.f();
        if (rVarF instanceof Sa.p) {
            return ((Sa.p) rVarF).n();
        }
        return false;
    }

    private static void z(@NonNull l.b bVar) {
        bVar.a(Sa.n.class, new f());
    }

    @Override
    public void d(@NonNull j.a aVar) {
        I9.b bVar = new I9.b();
        aVar.b(v.class, new I9.h()).b(Sa.f.class, new I9.d()).b(Sa.b.class, new I9.a()).b(Sa.d.class, new I9.c()).b(Sa.g.class, bVar).b(Sa.m.class, bVar).b(Sa.q.class, new I9.g()).b(Sa.i.class, new I9.e()).b(Sa.n.class, new I9.f()).b(x.class, new I9.i());
    }

    @Override
    public void g(@NonNull l.b bVar) {
        G(bVar);
        F(bVar);
        s(bVar);
        o(bVar);
        q(bVar);
        t(bVar);
        x(bVar);
        w(bVar);
        p(bVar);
        C(bVar);
        A(bVar);
        H(bVar);
        v(bVar);
        E(bVar);
        u(bVar);
        D(bVar);
        z(bVar);
    }

    @Override
    public void h(@NonNull TextView textView) {
        if (this.b || textView.getMovementMethod() != null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override
    public void i(@NonNull TextView textView, @NonNull Spanned spanned) {
        J9.h.a(textView, spanned);
        if (spanned instanceof Spannable) {
            J9.j.a((Spannable) spanned, textView);
        }
    }
}
