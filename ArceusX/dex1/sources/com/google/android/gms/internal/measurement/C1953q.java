package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class C1953q extends AbstractC1905k implements InterfaceC1929n {

    protected final List<String> f15270i;

    protected final List<r> f15271v;

    protected T1 f15272w;

    private C1953q(C1953q c1953q) {
        super(c1953q.f15197d);
        ArrayList arrayList = new ArrayList(c1953q.f15270i.size());
        this.f15270i = arrayList;
        arrayList.addAll(c1953q.f15270i);
        ArrayList arrayList2 = new ArrayList(c1953q.f15271v.size());
        this.f15271v = arrayList2;
        arrayList2.addAll(c1953q.f15271v);
        this.f15272w = c1953q.f15272w;
    }

    @Override
    public final r a(T1 t1, List<r> list) {
        T1 t1A = this.f15272w.a();
        for (int i7 = 0; i7 < this.f15270i.size(); i7++) {
            if (i7 < list.size()) {
                t1A.e(this.f15270i.get(i7), t1.b(list.get(i7)));
            } else {
                t1A.e(this.f15270i.get(i7), r.f15282g);
            }
        }
        for (r rVar : this.f15271v) {
            r rVarB = t1A.b(rVar);
            if (rVarB instanceof C1968s) {
                rVarB = t1A.b(rVar);
            }
            if (rVarB instanceof C1881h) {
                return ((C1881h) rVarB).a();
            }
        }
        return r.f15282g;
    }

    @Override
    public final r d() {
        return new C1953q(this);
    }

    public C1953q(String str, List<r> list, List<r> list2, T1 t1) {
        super(str);
        this.f15270i = new ArrayList();
        this.f15272w = t1;
        if (!list.isEmpty()) {
            Iterator<r> it = list.iterator();
            while (it.hasNext()) {
                this.f15270i.add(it.next().e());
            }
        }
        this.f15271v = new ArrayList(list2);
    }
}
