package C;

import android.util.Size;
import java.util.Map;

public abstract class f1 {
    f1() {
    }

    public static f1 a(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        return new C0343o(size, map, size2, map2, size3, map3, map4);
    }

    public abstract Size b();

    public Size c(int i7) {
        return d().get(Integer.valueOf(i7));
    }

    public abstract Map<Integer, Size> d();

    public abstract Size e();

    public abstract Size f();

    public Size g(int i7) {
        return h().get(Integer.valueOf(i7));
    }

    public abstract Map<Integer, Size> h();

    public Size i(int i7) {
        return j().get(Integer.valueOf(i7));
    }

    public abstract Map<Integer, Size> j();

    public Size k(int i7) {
        return l().get(Integer.valueOf(i7));
    }

    public abstract Map<Integer, Size> l();
}
