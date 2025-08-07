package S;

import S.C1220b;
import android.util.Range;

public abstract class AbstractC1219a {

    public static final Range<Integer> f6254a = new Range<>(0, Integer.MAX_VALUE);

    public static final Range<Integer> f6255b = new Range<>(0, Integer.MAX_VALUE);

    public static final AbstractC1219a f6256c = a().c(0).a();

    public static abstract class AbstractC0048a {
        AbstractC0048a() {
        }

        public abstract AbstractC1219a a();

        public abstract AbstractC0048a b(Range<Integer> range);

        public abstract AbstractC0048a c(int i7);

        public abstract AbstractC0048a d(Range<Integer> range);

        public abstract AbstractC0048a e(int i7);
    }

    AbstractC1219a() {
    }

    public static AbstractC0048a a() {
        return new C1220b.C0049b().f(-1).e(-1).c(-1).b(f6254a).d(f6255b);
    }

    public abstract Range<Integer> b();

    public abstract int c();

    public abstract Range<Integer> d();

    public abstract int e();

    public abstract int f();
}
