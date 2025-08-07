package C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class C0347q {

    public static final class a extends AbstractC0345p {

        private final List<AbstractC0345p> f688a = new ArrayList();

        a(List<AbstractC0345p> list) {
            for (AbstractC0345p abstractC0345p : list) {
                if (!(abstractC0345p instanceof b)) {
                    this.f688a.add(abstractC0345p);
                }
            }
        }

        @Override
        public void a(int i7) {
            Iterator<AbstractC0345p> it = this.f688a.iterator();
            while (it.hasNext()) {
                it.next().a(i7);
            }
        }

        @Override
        public void b(int i7, InterfaceC0364z interfaceC0364z) {
            Iterator<AbstractC0345p> it = this.f688a.iterator();
            while (it.hasNext()) {
                it.next().b(i7, interfaceC0364z);
            }
        }

        @Override
        public void c(int i7, r rVar) {
            Iterator<AbstractC0345p> it = this.f688a.iterator();
            while (it.hasNext()) {
                it.next().c(i7, rVar);
            }
        }

        @Override
        public void d(int i7) {
            Iterator<AbstractC0345p> it = this.f688a.iterator();
            while (it.hasNext()) {
                it.next().d(i7);
            }
        }

        public List<AbstractC0345p> e() {
            return this.f688a;
        }
    }

    static final class b extends AbstractC0345p {
        b() {
        }

        @Override
        public void b(int i7, InterfaceC0364z interfaceC0364z) {
        }

        @Override
        public void c(int i7, r rVar) {
        }

        @Override
        public void d(int i7) {
        }
    }

    static AbstractC0345p a(List<AbstractC0345p> list) {
        return list.isEmpty() ? c() : list.size() == 1 ? list.get(0) : new a(list);
    }

    public static AbstractC0345p b(AbstractC0345p... abstractC0345pArr) {
        return a(Arrays.asList(abstractC0345pArr));
    }

    public static AbstractC0345p c() {
        return new b();
    }
}
