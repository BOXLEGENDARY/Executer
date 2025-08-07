package j5;

import S4.C1529d;
import S4.q;
import java.util.Iterator;
import java.util.Set;

public class c implements i {

    private final String f21147a;

    private final d f21148b;

    c(Set<f> set, d dVar) {
        this.f21147a = e(set);
        this.f21148b = dVar;
    }

    public static C1529d<i> c() {
        return C1529d.c(i.class).b(q.j(f.class)).f(new S4.h() {
            @Override
            public final Object a(S4.e eVar) {
                return c.d(eVar);
            }
        }).d();
    }

    public static i d(S4.e eVar) {
        return new c(eVar.d(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override
    public String a() {
        if (this.f21148b.b().isEmpty()) {
            return this.f21147a;
        }
        return this.f21147a + ' ' + e(this.f21148b.b());
    }
}
