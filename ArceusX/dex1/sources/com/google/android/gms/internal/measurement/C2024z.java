package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class C2024z {

    final Map<String, AbstractC2016y> f15379a = new HashMap();

    final M f15380b = new M();

    public C2024z() {
        b(new C2008x());
        b(new A());
        b(new B());
        b(new F());
        b(new K());
        b(new L());
        b(new N());
    }

    public final r a(T1 t1, r rVar) {
        C1987u2.c(t1);
        if (!(rVar instanceof C1968s)) {
            return rVar;
        }
        C1968s c1968s = (C1968s) rVar;
        ArrayList<r> arrayListB = c1968s.b();
        String strA = c1968s.a();
        return (this.f15379a.containsKey(strA) ? this.f15379a.get(strA) : this.f15380b).a(strA, t1, arrayListB);
    }

    final void b(AbstractC2016y abstractC2016y) {
        Iterator<O> it = abstractC2016y.f15378a.iterator();
        while (it.hasNext()) {
            this.f15379a.put(it.next().e().toString(), abstractC2016y);
        }
    }
}
