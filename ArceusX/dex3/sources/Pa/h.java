package Pa;

import Pa.c;
import Pa.i;
import Pa.j;
import Pa.k;
import Pa.l;
import Pa.p;
import Pa.t;
import Sa.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class h implements Ua.h {
    private static final Set<Class<? extends Sa.a>> p = new LinkedHashSet(Arrays.asList(Sa.b.class, Sa.i.class, Sa.g.class, Sa.j.class, x.class, Sa.p.class, Sa.m.class));
    private static final Map<Class<? extends Sa.a>, Ua.e> q;
    private CharSequence a;
    private boolean d;
    private boolean h;
    private final List<Ua.e> i;
    private final Ta.c j;
    private final List<Va.a> k;
    private final g l;
    private int b = 0;
    private int c = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private final Map<String, Sa.o> m = new LinkedHashMap();
    private List<Ua.d> n = new ArrayList();
    private Set<Ua.d> o = new LinkedHashSet();

    private static class a implements Ua.g {
        private final Ua.d a;

        public a(Ua.d dVar) {
            this.a = dVar;
        }

        @Override
        public Ua.d a() {
            return this.a;
        }

        @Override
        public CharSequence b() {
            Ua.d dVar = this.a;
            if (!(dVar instanceof r)) {
                return null;
            }
            CharSequence charSequenceI = ((r) dVar).i();
            if (charSequenceI.length() == 0) {
                return null;
            }
            return charSequenceI;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(Sa.b.class, new c.a());
        map.put(Sa.i.class, new j.a());
        map.put(Sa.g.class, new i.a());
        map.put(Sa.j.class, new k.b());
        map.put(x.class, new t.a());
        map.put(Sa.p.class, new p.a());
        map.put(Sa.m.class, new l.a());
        q = Collections.unmodifiableMap(map);
    }

    public h(List<Ua.e> list, Ta.c cVar, List<Va.a> list2) {
        this.i = list;
        this.j = cVar;
        this.k = list2;
        g gVar = new g();
        this.l = gVar;
        a(gVar);
    }

    private void a(Ua.d dVar) {
        this.n.add(dVar);
        this.o.add(dVar);
    }

    private <T extends Ua.d> T b(T t) {
        while (!j().d(t.g())) {
            o(j());
        }
        j().g().b(t.g());
        a(t);
        return t;
    }

    private void c(r rVar) {
        for (Sa.o oVar : rVar.j()) {
            rVar.g().i(oVar);
            String strN = oVar.n();
            if (!this.m.containsKey(strN)) {
                this.m.put(strN, oVar);
            }
        }
    }

    private void d() {
        CharSequence charSequenceSubSequence;
        if (this.d) {
            int i = this.b + 1;
            CharSequence charSequence = this.a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, charSequence.length());
            int iA = Ra.d.a(this.c);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + iA);
            for (int i2 = 0; i2 < iA; i2++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.a;
            charSequenceSubSequence = charSequence2.subSequence(this.b, charSequence2.length());
        }
        j().h(charSequenceSubSequence);
    }

    private void l() {
        if (this.a.charAt(this.b) != '\t') {
            this.b++;
            this.c++;
        } else {
            this.b++;
            int i = this.c;
            this.c = i + Ra.d.a(i);
        }
    }

    public static List<Ua.e> m(List<Ua.e> list, Set<Class<? extends Sa.a>> set) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator<Class<? extends Sa.a>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(q.get(it.next()));
        }
        return arrayList;
    }

    private void n() {
        this.n.remove(r0.size() - 1);
    }

    private void o(Ua.d dVar) {
        if (j() == dVar) {
            n();
        }
        if (dVar instanceof r) {
            c((r) dVar);
        }
        dVar.e();
    }

    private Sa.e p() {
        q(this.n);
        x();
        return this.l.g();
    }

    private void q(List<Ua.d> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            o(list.get(size));
        }
    }

    private d r(Ua.d dVar) {
        a aVar = new a(dVar);
        Iterator<Ua.e> it = this.i.iterator();
        while (it.hasNext()) {
            Ua.f fVarA = it.next().a(this, aVar);
            if (fVarA instanceof d) {
                return (d) fVarA;
            }
        }
        return null;
    }

    private void s() {
        int i = this.b;
        int i2 = this.c;
        this.h = true;
        int length = this.a.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = this.a.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.h = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.e = i;
        this.f = i2;
        this.g = i2 - this.c;
    }

    public static Set<Class<? extends Sa.a>> t() {
        return p;
    }

    private void u(java.lang.CharSequence r11) {
        throw new UnsupportedOperationException("Method not decompiled: Pa.h.u(java.lang.CharSequence):void");
    }

    private void w() {
        Ua.d dVarJ = j();
        n();
        this.o.remove(dVarJ);
        if (dVarJ instanceof r) {
            c((r) dVarJ);
        }
        dVarJ.g().l();
    }

    private void x() {
        Ta.a aVarA = this.j.a(new m(this.k, this.m));
        Iterator<Ua.d> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().a(aVarA);
        }
    }

    private void y(int i) {
        int i2;
        int i3 = this.f;
        if (i >= i3) {
            this.b = this.e;
            this.c = i3;
        }
        int length = this.a.length();
        while (true) {
            i2 = this.c;
            if (i2 >= i || this.b == length) {
                break;
            } else {
                l();
            }
        }
        if (i2 <= i) {
            this.d = false;
            return;
        }
        this.b--;
        this.c = i;
        this.d = true;
    }

    private void z(int i) {
        int i2 = this.e;
        if (i >= i2) {
            this.b = i2;
            this.c = this.f;
        }
        int length = this.a.length();
        while (true) {
            int i3 = this.b;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                l();
            }
        }
        this.d = false;
    }

    @Override
    public int e() {
        return this.b;
    }

    @Override
    public boolean f() {
        return this.h;
    }

    @Override
    public int g() {
        return this.g;
    }

    @Override
    public CharSequence h() {
        return this.a;
    }

    @Override
    public int i() {
        return this.e;
    }

    @Override
    public Ua.d j() {
        return this.n.get(r0.size() - 1);
    }

    @Override
    public int k() {
        return this.c;
    }

    public Sa.e v(String str) {
        int i = 0;
        while (true) {
            int iC = Ra.d.c(str, i);
            if (iC == -1) {
                break;
            }
            u(str.substring(i, iC));
            i = iC + 1;
            if (i < str.length() && str.charAt(iC) == '\r' && str.charAt(i) == '\n') {
                i = iC + 2;
            }
        }
        if (str.length() > 0 && (i == 0 || i < str.length())) {
            u(str.substring(i));
        }
        return p();
    }
}
