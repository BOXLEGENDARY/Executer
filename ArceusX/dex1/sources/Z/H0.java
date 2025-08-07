package z;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class H0 {

    private final I0 f24544a;

    private final List<G0> f24545b;

    private final List<AbstractC3056k> f24546c;

    public static final class a {

        private static final List<Integer> f24547d = Arrays.asList(1, 2, 4, 3, 7);

        private I0 f24548a;

        private final List<G0> f24549b = new ArrayList();

        private final List<AbstractC3056k> f24550c = new ArrayList();

        private void d() {
            Iterator<AbstractC3056k> it = this.f24550c.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                int iG = it.next().g();
                M.a0.a(f24547d, iG);
                int i8 = i7 & iG;
                if (i8 > 0) {
                    throw new IllegalArgumentException(String.format(Locale.US, "More than one effects has targets %s.", M.a0.b(i8)));
                }
                i7 |= iG;
            }
        }

        public a a(AbstractC3056k abstractC3056k) {
            this.f24550c.add(abstractC3056k);
            return this;
        }

        public a b(G0 g02) {
            this.f24549b.add(g02);
            return this;
        }

        public H0 c() {
            x0.g.b(!this.f24549b.isEmpty(), "UseCase must not be empty.");
            d();
            return new H0(this.f24548a, this.f24549b, this.f24550c);
        }

        public a e(I0 i02) {
            this.f24548a = i02;
            return this;
        }
    }

    H0(I0 i02, List<G0> list, List<AbstractC3056k> list2) {
        this.f24544a = i02;
        this.f24545b = list;
        this.f24546c = list2;
    }

    public List<AbstractC3056k> a() {
        return this.f24546c;
    }

    public List<G0> b() {
        return this.f24545b;
    }

    public I0 c() {
        return this.f24544a;
    }
}
