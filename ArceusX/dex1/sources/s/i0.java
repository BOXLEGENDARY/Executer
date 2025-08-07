package S;

import S.C1226h;
import android.util.Range;
import java.util.Arrays;

public abstract class i0 {

    public static final Range<Integer> f6332a = new Range<>(0, Integer.MAX_VALUE);

    public static final Range<Integer> f6333b = new Range<>(0, Integer.MAX_VALUE);

    public static final C1233o f6334c;

    public static abstract class a {
        a() {
        }

        public abstract i0 a();

        abstract a b(int i7);

        public abstract a c(Range<Integer> range);

        public abstract a d(Range<Integer> range);

        public abstract a e(C1233o c1233o);
    }

    static {
        C1230l c1230l = C1230l.f6338c;
        f6334c = C1233o.c(Arrays.asList(c1230l, C1230l.f6337b, C1230l.f6336a), C1228j.a(c1230l));
    }

    i0() {
    }

    public static a a() {
        return new C1226h.b().e(f6334c).d(f6332a).c(f6333b).b(-1);
    }

    abstract int b();

    public abstract Range<Integer> c();

    public abstract Range<Integer> d();

    public abstract C1233o e();

    public abstract a f();
}
