package z;

import C.C0357v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class C3061p {

    public static final C3061p f24685c = new a().b(0).a();

    public static final C3061p f24686d = new a().b(1).a();

    private final LinkedHashSet<InterfaceC3059n> f24687a;

    private final String f24688b;

    public static final class a {

        private final LinkedHashSet<InterfaceC3059n> f24689a = new LinkedHashSet<>();

        private String f24690b;

        public C3061p a() {
            return new C3061p(this.f24689a, this.f24690b);
        }

        public a b(int i7) {
            x0.g.j(i7 != -1, "The specified lens facing is invalid.");
            this.f24689a.add(new C0357v0(i7));
            return this;
        }
    }

    C3061p(LinkedHashSet<InterfaceC3059n> linkedHashSet, String str) {
        this.f24687a = linkedHashSet;
        this.f24688b = str;
    }

    public LinkedHashSet<C.J> a(LinkedHashSet<C.J> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<C.J> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        List<InterfaceC3060o> listB = b(arrayList);
        LinkedHashSet<C.J> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<C.J> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            C.J next = it2.next();
            if (listB.contains(next.c())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    public List<InterfaceC3060o> b(List<InterfaceC3060o> list) {
        List<InterfaceC3060o> arrayList = new ArrayList<>(list);
        Iterator<InterfaceC3059n> it = this.f24687a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet<InterfaceC3059n> c() {
        return this.f24687a;
    }

    public Integer d() {
        Iterator<InterfaceC3059n> it = this.f24687a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC3059n next = it.next();
            if (next instanceof C0357v0) {
                Integer numValueOf = Integer.valueOf(((C0357v0) next).c());
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public C.J e(LinkedHashSet<C.J> linkedHashSet) {
        Iterator<C.J> it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
