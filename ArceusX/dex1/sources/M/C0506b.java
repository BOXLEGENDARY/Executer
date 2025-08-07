package M;

import C.InterfaceC0364z;
import H3.QdLC.QcdySgfdST;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

final class C0506b<T> extends B<T> {

    private final T f2261a;

    private final E.f f2262b;

    private final int f2263c;

    private final Size f2264d;

    private final Rect f2265e;

    private final int f2266f;

    private final Matrix f2267g;

    private final InterfaceC0364z f2268h;

    C0506b(T t7, E.f fVar, int i7, Size size, Rect rect, int i8, Matrix matrix, InterfaceC0364z interfaceC0364z) {
        if (t7 == null) {
            throw new NullPointerException("Null data");
        }
        this.f2261a = t7;
        this.f2262b = fVar;
        this.f2263c = i7;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f2264d = size;
        if (rect == null) {
            throw new NullPointerException(QcdySgfdST.JENScOxq);
        }
        this.f2265e = rect;
        this.f2266f = i8;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f2267g = matrix;
        if (interfaceC0364z == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f2268h = interfaceC0364z;
    }

    @Override
    public InterfaceC0364z a() {
        return this.f2268h;
    }

    @Override
    public Rect b() {
        return this.f2265e;
    }

    @Override
    public T c() {
        return this.f2261a;
    }

    @Override
    public E.f d() {
        return this.f2262b;
    }

    @Override
    public int e() {
        return this.f2263c;
    }

    public boolean equals(Object obj) {
        E.f fVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b2 = (B) obj;
        return this.f2261a.equals(b2.c()) && ((fVar = this.f2262b) != null ? fVar.equals(b2.d()) : b2.d() == null) && this.f2263c == b2.e() && this.f2264d.equals(b2.h()) && this.f2265e.equals(b2.b()) && this.f2266f == b2.f() && this.f2267g.equals(b2.g()) && this.f2268h.equals(b2.a());
    }

    @Override
    public int f() {
        return this.f2266f;
    }

    @Override
    public Matrix g() {
        return this.f2267g;
    }

    @Override
    public Size h() {
        return this.f2264d;
    }

    public int hashCode() {
        int iHashCode = (this.f2261a.hashCode() ^ 1000003) * 1000003;
        E.f fVar = this.f2262b;
        return ((((((((((((iHashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003) ^ this.f2263c) * 1000003) ^ this.f2264d.hashCode()) * 1000003) ^ this.f2265e.hashCode()) * 1000003) ^ this.f2266f) * 1000003) ^ this.f2267g.hashCode()) * 1000003) ^ this.f2268h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f2261a + ", exif=" + this.f2262b + ", format=" + this.f2263c + ", size=" + this.f2264d + ", cropRect=" + this.f2265e + ", rotationDegrees=" + this.f2266f + ", sensorToBufferTransform=" + this.f2267g + ", cameraCaptureResult=" + this.f2268h + "}";
    }
}
