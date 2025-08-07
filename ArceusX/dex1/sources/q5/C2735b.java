package q5;

import java.util.concurrent.Executor;
import n3.C2649g;

public class C2735b {

    private final int f22715a;

    private final boolean f22716b;

    private final Executor f22717c;

    public static class a {

        private int f22718a = 0;

        private boolean f22719b;

        private Executor f22720c;

        public C2735b a() {
            return new C2735b(this.f22718a, this.f22719b, this.f22720c, null, null);
        }

        public a b(int i7, int... iArr) {
            this.f22718a = i7;
            if (iArr != null) {
                for (int i8 : iArr) {
                    this.f22718a = i8 | this.f22718a;
                }
            }
            return this;
        }
    }

    C2735b(int i7, boolean z7, Executor executor, d dVar, e eVar) {
        this.f22715a = i7;
        this.f22716b = z7;
        this.f22717c = executor;
    }

    public final int a() {
        return this.f22715a;
    }

    public final d b() {
        return null;
    }

    public final Executor c() {
        return this.f22717c;
    }

    public final boolean d() {
        return this.f22716b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2735b)) {
            return false;
        }
        C2735b c2735b = (C2735b) obj;
        return this.f22715a == c2735b.f22715a && this.f22716b == c2735b.f22716b && C2649g.b(this.f22717c, c2735b.f22717c) && C2649g.b(null, null);
    }

    public int hashCode() {
        return C2649g.c(Integer.valueOf(this.f22715a), Boolean.valueOf(this.f22716b), this.f22717c, null);
    }
}
