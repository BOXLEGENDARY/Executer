package X;

import android.util.Range;

public interface k0 extends Y {
    default boolean a(int i7, int i8) {
        return i(i7, i8) || (d() && i(i8, i7));
    }

    int b();

    Range<Integer> c();

    boolean d();

    Range<Integer> e(int i7);

    Range<Integer> f(int i7);

    int g();

    Range<Integer> h();

    boolean i(int i7, int i8);

    Range<Integer> j();
}
