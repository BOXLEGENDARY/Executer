package B;

import C.g1;
import E.h;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.n;
import java.nio.ByteBuffer;
import java.util.Objects;

public final class U implements androidx.camera.core.n {

    private final Object f174d;

    private final int f175e;

    private final int f176i;

    private final Rect f177v;

    n.a[] f178w;

    private final z.V f179y;

    class a implements n.a {

        final int f180a;

        final int f181b;

        final ByteBuffer f182c;

        a(int i7, int i8, ByteBuffer byteBuffer) {
            this.f180a = i7;
            this.f181b = i8;
            this.f182c = byteBuffer;
        }

        @Override
        public ByteBuffer c() {
            return this.f182c;
        }

        @Override
        public int d() {
            return this.f180a;
        }

        @Override
        public int e() {
            return this.f181b;
        }
    }

    class b implements z.V {

        final long f183a;

        final int f184b;

        final Matrix f185c;

        b(long j7, int i7, Matrix matrix) {
            this.f183a = j7;
            this.f184b = i7;
            this.f185c = matrix;
        }

        @Override
        public void a(h.b bVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override
        public g1 b() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override
        public int c() {
            return this.f184b;
        }

        @Override
        public long d() {
            return this.f183a;
        }

        @Override
        public Matrix e() {
            return new Matrix(this.f185c);
        }
    }

    public U(M.B<Bitmap> b2) {
        this(b2.c(), b2.b(), b2.f(), b2.g(), b2.a().d());
    }

    private void b() {
        synchronized (this.f174d) {
            x0.g.j(this.f178w != null, "The image is closed.");
        }
    }

    private static z.V e(long j7, int i7, Matrix matrix) {
        return new b(j7, i7, matrix);
    }

    private static n.a f(ByteBuffer byteBuffer, int i7, int i8) {
        return new a(i7, i8, byteBuffer);
    }

    @Override
    public void B0(Rect rect) {
        synchronized (this.f174d) {
            try {
                b();
                if (rect != null) {
                    this.f177v.set(rect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public z.V D0() {
        z.V v7;
        synchronized (this.f174d) {
            b();
            v7 = this.f179y;
        }
        return v7;
    }

    @Override
    public void close() {
        synchronized (this.f174d) {
            b();
            this.f178w = null;
        }
    }

    @Override
    public int getHeight() {
        int i7;
        synchronized (this.f174d) {
            b();
            i7 = this.f176i;
        }
        return i7;
    }

    @Override
    public int getWidth() {
        int i7;
        synchronized (this.f174d) {
            b();
            i7 = this.f175e;
        }
        return i7;
    }

    @Override
    public int i() {
        synchronized (this.f174d) {
            b();
        }
        return 1;
    }

    @Override
    public Image l() {
        synchronized (this.f174d) {
            b();
        }
        return null;
    }

    @Override
    public n.a[] s() {
        n.a[] aVarArr;
        synchronized (this.f174d) {
            b();
            n.a[] aVarArr2 = this.f178w;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    public U(Bitmap bitmap, Rect rect, int i7, Matrix matrix, long j7) {
        this(L.b.f(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i7, matrix, j7);
    }

    public U(ByteBuffer byteBuffer, int i7, int i8, int i9, Rect rect, int i10, Matrix matrix, long j7) {
        this.f174d = new Object();
        this.f175e = i8;
        this.f176i = i9;
        this.f177v = rect;
        this.f179y = e(j7, i10, matrix);
        byteBuffer.rewind();
        this.f178w = new n.a[]{f(byteBuffer, i8 * i7, i7)};
    }
}
