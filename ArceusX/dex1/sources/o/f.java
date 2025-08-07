package O;

import E.q;
import M.N;
import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

public abstract class f {
    public static f h(int i7, int i8, Rect rect, Size size, int i9, boolean z7) {
        return i(i7, i8, rect, size, i9, z7, false);
    }

    public static f i(int i7, int i8, Rect rect, Size size, int i9, boolean z7, boolean z8) {
        return new b(UUID.randomUUID(), i7, i8, rect, size, i9, z7, z8);
    }

    public static f j(N n7) {
        return h(n7.t(), n7.p(), n7.n(), q.f(n7.n(), n7.q()), n7.q(), n7.w());
    }

    public abstract Rect a();

    public abstract int b();

    public abstract int c();

    public abstract Size d();

    public abstract int e();

    abstract UUID f();

    public abstract boolean g();

    public abstract boolean k();
}
