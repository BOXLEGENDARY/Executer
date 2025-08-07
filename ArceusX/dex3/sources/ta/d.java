package Ta;

import Pa.h;
import Pa.m;
import Pa.n;
import Sa.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class d {
    private final List<Ua.e> a;
    private final List<Va.a> b;
    private final c c;
    private final List<e> d;

    public static class b {
        private final List<Ua.e> a = new ArrayList();
        private final List<Va.a> b = new ArrayList();
        private final List<e> c = new ArrayList();
        private Set<Class<? extends Sa.a>> d = h.t();
        private c e;

        class a implements c {
            a() {
            }

            @Override
            public Ta.a a(Ta.b bVar) {
                return new n(bVar);
            }
        }

        public c g() {
            c cVar = this.e;
            return cVar != null ? cVar : new a();
        }

        public d f() {
            return new d(this);
        }
    }

    private h a() {
        return new h(this.a, this.c, this.b);
    }

    private r c(r rVar) {
        Iterator<e> it = this.d.iterator();
        while (it.hasNext()) {
            rVar = it.next().a(rVar);
        }
        return rVar;
    }

    public r b(String str) {
        if (str != null) {
            return c(a().v(str));
        }
        throw new NullPointerException("input must not be null");
    }

    private d(b bVar) {
        this.a = h.m(bVar.a, bVar.d);
        c cVarG = bVar.g();
        this.c = cVarG;
        this.d = bVar.c;
        List<Va.a> list = bVar.b;
        this.b = list;
        cVarG.a(new m(list, Collections.emptyMap()));
    }
}
