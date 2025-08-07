package v5;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import com.github.luben.zstd.BuildConfig;
import java.nio.ByteBuffer;
import k5.C2518a;
import n3.C2645c;
import n3.C2651i;
import u5.C2938a;
import y3.BinderC3024b;
import y3.InterfaceC3023a;

public class C2949d {

    private static final C2645c f24169a = new C2645c("MLKitImageUtils", BuildConfig.FLAVOR);

    private static final C2949d f24170b = new C2949d();

    private C2949d() {
    }

    public static C2949d b() {
        return f24170b;
    }

    public InterfaceC3023a a(C2938a c2938a) throws C2518a {
        int iH = c2938a.h();
        if (iH == -1) {
            return BinderC3024b.h3((Bitmap) C2651i.l(c2938a.e()));
        }
        if (iH != 17) {
            if (iH == 35) {
                return BinderC3024b.h3(c2938a.j());
            }
            if (iH != 842094169) {
                throw new C2518a("Unsupported image format: " + c2938a.h(), 3);
            }
        }
        return BinderC3024b.h3((ByteBuffer) C2651i.l(c2938a.f()));
    }

    public int c(C2938a c2938a) {
        return c2938a.h();
    }

    public int d(C2938a c2938a) {
        if (c2938a.h() == -1) {
            return ((Bitmap) C2651i.l(c2938a.e())).getAllocationByteCount();
        }
        if (c2938a.h() == 17 || c2938a.h() == 842094169) {
            return ((ByteBuffer) C2651i.l(c2938a.f())).limit();
        }
        if (c2938a.h() != 35) {
            return 0;
        }
        return (((Image.Plane[]) C2651i.l(c2938a.k()))[0].getBuffer().limit() * 3) / 2;
    }

    public Matrix e(int i7, int i8, int i9) {
        if (i9 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i7) / 2.0f, (-i8) / 2.0f);
        matrix.postRotate(i9 * 90);
        int i10 = i9 % 2;
        int i11 = i10 != 0 ? i8 : i7;
        if (i10 == 0) {
            i7 = i8;
        }
        matrix.postTranslate(i11 / 2.0f, i7 / 2.0f);
        return matrix;
    }
}
