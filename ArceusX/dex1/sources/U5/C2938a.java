package u5;

import Q3.G5;
import Q3.I5;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import n3.C2651i;
import o5.InterfaceC2691h;
import v5.C2948c;

public class C2938a implements InterfaceC2691h {

    private volatile Bitmap f24035a;

    private volatile ByteBuffer f24036b;

    private volatile C2939b f24037c;

    private final int f24038d;

    private final int f24039e;

    private final int f24040f;

    private final int f24041g;

    private final Matrix f24042h;

    private C2938a(Bitmap bitmap, int i7) {
        this.f24035a = (Bitmap) C2651i.l(bitmap);
        this.f24038d = bitmap.getWidth();
        this.f24039e = bitmap.getHeight();
        n(i7);
        this.f24040f = i7;
        this.f24041g = -1;
        this.f24042h = null;
    }

    public static C2938a a(Bitmap bitmap, int i7) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C2938a c2938a = new C2938a(bitmap, i7);
        p(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i7);
        return c2938a;
    }

    public static C2938a b(ByteBuffer byteBuffer, int i7, int i8, int i9, int i10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C2938a c2938a = new C2938a(byteBuffer, i7, i8, i9, i10);
        p(i10, 3, jElapsedRealtime, i8, i7, byteBuffer.limit(), i9);
        return c2938a;
    }

    public static C2938a c(Image image, int i7) {
        return o(image, i7, null);
    }

    public static C2938a d(Image image, int i7, Matrix matrix) {
        C2651i.b(image.getFormat() == 35, "Only YUV_420_888 is supported now");
        return o(image, i7, matrix);
    }

    private static int n(int i7) {
        boolean z7 = true;
        if (i7 != 0 && i7 != 90 && i7 != 180) {
            if (i7 == 270) {
                i7 = 270;
            } else {
                z7 = false;
            }
        }
        C2651i.b(z7, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i7;
    }

    private static C2938a o(Image image, int i7, Matrix matrix) {
        C2938a c2938a;
        int iLimit;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C2651i.m(image, "Please provide a valid image");
        n(i7);
        boolean z7 = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z7 = false;
        }
        C2651i.b(z7, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            c2938a = new C2938a(C2948c.f().c(image, i7), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            c2938a = new C2938a(image, image.getWidth(), image.getHeight(), i7, matrix);
            iLimit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int i8 = iLimit;
        C2938a c2938a2 = c2938a;
        p(image.getFormat(), 5, jElapsedRealtime, image.getHeight(), image.getWidth(), i8, i7);
        return c2938a2;
    }

    private static void p(int i7, int i8, long j7, int i9, int i10, int i11, int i12) {
        I5.a(G5.b("vision-common"), i7, i8, j7, i9, i10, i11, i12);
    }

    public Bitmap e() {
        return this.f24035a;
    }

    public ByteBuffer f() {
        return this.f24036b;
    }

    public Matrix g() {
        return this.f24042h;
    }

    public int h() {
        return this.f24041g;
    }

    public int i() {
        return this.f24039e;
    }

    public Image j() {
        if (this.f24037c == null) {
            return null;
        }
        return this.f24037c.a();
    }

    public Image.Plane[] k() {
        if (this.f24037c == null) {
            return null;
        }
        return this.f24037c.b();
    }

    public int l() {
        return this.f24040f;
    }

    public int m() {
        return this.f24038d;
    }

    private C2938a(Image image, int i7, int i8, int i9, Matrix matrix) {
        C2651i.l(image);
        this.f24037c = new C2939b(image);
        this.f24038d = i7;
        this.f24039e = i8;
        n(i9);
        this.f24040f = i9;
        this.f24041g = 35;
        this.f24042h = matrix;
    }

    private C2938a(ByteBuffer byteBuffer, int i7, int i8, int i9, int i10) {
        boolean z7;
        if (i10 == 842094169) {
            z7 = true;
        } else if (i10 == 17) {
            i10 = 17;
            z7 = true;
        } else {
            z7 = false;
        }
        C2651i.a(z7);
        this.f24036b = (ByteBuffer) C2651i.l(byteBuffer);
        C2651i.b(byteBuffer.limit() > i7 * i8, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer.rewind();
        this.f24038d = i7;
        this.f24039e = i8;
        n(i9);
        this.f24040f = i9;
        this.f24041g = i10;
        this.f24042h = null;
    }
}
