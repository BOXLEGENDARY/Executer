package z;

import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class C3032B {

    private final List<C3049g0> f24478a;

    private final List<C3049g0> f24479b;

    private final List<C3049g0> f24480c;

    private final long f24481d;

    C3032B(a aVar) {
        this.f24478a = Collections.unmodifiableList(aVar.f24482a);
        this.f24479b = Collections.unmodifiableList(aVar.f24483b);
        this.f24480c = Collections.unmodifiableList(aVar.f24484c);
        this.f24481d = aVar.f24485d;
    }

    public long a() {
        return this.f24481d;
    }

    public List<C3049g0> b() {
        return this.f24479b;
    }

    public List<C3049g0> c() {
        return this.f24478a;
    }

    public List<C3049g0> d() {
        return this.f24480c;
    }

    public boolean e() {
        return this.f24481d > 0;
    }

    public static class a {

        final List<C3049g0> f24482a;

        final List<C3049g0> f24483b;

        final List<C3049g0> f24484c;

        long f24485d;

        public a(C3049g0 c3049g0, int i7) {
            this.f24482a = new ArrayList();
            this.f24483b = new ArrayList();
            this.f24484c = new ArrayList();
            this.f24485d = 5000L;
            a(c3049g0, i7);
        }

        public a a(C3049g0 c3049g0, int i7) {
            boolean z7 = false;
            x0.g.b(c3049g0 != null, JmBUOGMwkkxg.cNjRyCZ);
            if (i7 >= 1 && i7 <= 7) {
                z7 = true;
            }
            x0.g.b(z7, "Invalid metering mode " + i7);
            if ((i7 & 1) != 0) {
                this.f24482a.add(c3049g0);
            }
            if ((i7 & 2) != 0) {
                this.f24483b.add(c3049g0);
            }
            if ((i7 & 4) != 0) {
                this.f24484c.add(c3049g0);
            }
            return this;
        }

        public C3032B b() {
            return new C3032B(this);
        }

        public a c(int i7) {
            if ((i7 & 1) != 0) {
                this.f24482a.clear();
            }
            if ((i7 & 2) != 0) {
                this.f24483b.clear();
            }
            if ((i7 & 4) != 0) {
                this.f24484c.clear();
            }
            return this;
        }

        public a(C3032B c3032b) {
            ArrayList arrayList = new ArrayList();
            this.f24482a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f24483b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f24484c = arrayList3;
            this.f24485d = 5000L;
            arrayList.addAll(c3032b.c());
            arrayList2.addAll(c3032b.b());
            arrayList3.addAll(c3032b.d());
            this.f24485d = c3032b.a();
        }
    }
}
