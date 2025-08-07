package z;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import x0.InterfaceC2984a;

public interface u0 extends Closeable {

    public static abstract class a {
        public static a f(Size size, Rect rect, C.J j7, int i7, boolean z7) {
            return new C3044e(size, rect, j7, i7, z7);
        }

        public abstract C.J a();

        public abstract Rect b();

        public abstract Size c();

        public abstract boolean d();

        public abstract int e();
    }

    public static abstract class b {
        b() {
        }

        public static b c(int i7, u0 u0Var) {
            return new C3046f(i7, u0Var);
        }

        public abstract int a();

        public abstract u0 b();
    }

    default void C(float[] fArr, float[] fArr2, boolean z7) {
    }

    void D(float[] fArr, float[] fArr2);

    @Override
    void close();

    Size h();

    default int i() {
        return 34;
    }

    Surface o(Executor executor, InterfaceC2984a<b> interfaceC2984a);
}
