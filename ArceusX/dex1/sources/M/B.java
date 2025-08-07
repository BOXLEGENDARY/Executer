package M;

import C.InterfaceC0364z;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

public abstract class B<T> {
    public static B<Bitmap> j(Bitmap bitmap, E.f fVar, Rect rect, int i7, Matrix matrix, InterfaceC0364z interfaceC0364z) {
        return new C0506b(bitmap, fVar, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i7, matrix, interfaceC0364z);
    }

    public static B<androidx.camera.core.n> k(androidx.camera.core.n nVar, E.f fVar, Rect rect, int i7, Matrix matrix, InterfaceC0364z interfaceC0364z) {
        return l(nVar, fVar, new Size(nVar.getWidth(), nVar.getHeight()), rect, i7, matrix, interfaceC0364z);
    }

    public static B<androidx.camera.core.n> l(androidx.camera.core.n nVar, E.f fVar, Size size, Rect rect, int i7, Matrix matrix, InterfaceC0364z interfaceC0364z) {
        if (L.b.j(nVar.i())) {
            x0.g.h(fVar, "JPEG image must have Exif.");
        }
        return new C0506b(nVar, fVar, nVar.i(), size, rect, i7, matrix, interfaceC0364z);
    }

    public static B<byte[]> m(byte[] bArr, E.f fVar, int i7, Size size, Rect rect, int i8, Matrix matrix, InterfaceC0364z interfaceC0364z) {
        return new C0506b(bArr, fVar, i7, size, rect, i8, matrix, interfaceC0364z);
    }

    public abstract InterfaceC0364z a();

    public abstract Rect b();

    public abstract T c();

    public abstract E.f d();

    public abstract int e();

    public abstract int f();

    public abstract Matrix g();

    public abstract Size h();

    public boolean i() {
        return E.q.h(b(), h());
    }
}
