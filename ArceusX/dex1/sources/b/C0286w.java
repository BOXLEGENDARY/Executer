package B;

import C.R0;
import L.b;
import android.graphics.Rect;
import android.util.Size;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;

final class C0286w implements M.A<a, M.B<byte[]>> {

    private final K.d f266a;

    static abstract class a {
        a() {
        }

        static a c(M.B<androidx.camera.core.n> b2, int i7) {
            return new C0267c(b2, i7);
        }

        abstract int a();

        abstract M.B<androidx.camera.core.n> b();
    }

    C0286w(R0 r02) {
        this.f266a = new K.d(r02);
    }

    private static E.f b(byte[] bArr) throws z.U {
        try {
            return E.f.k(new ByteArrayInputStream(bArr));
        } catch (IOException e7) {
            throw new z.U(0, "Failed to extract Exif from YUV-generated JPEG", e7);
        }
    }

    private M.B<byte[]> c(a aVar, int i7) {
        M.B<androidx.camera.core.n> b2 = aVar.b();
        byte[] bArrA = this.f266a.a(b2.c());
        E.f fVarD = b2.d();
        Objects.requireNonNull(fVarD);
        return M.B.m(bArrA, fVarD, i7, b2.h(), b2.b(), b2.f(), b2.g(), b2.a());
    }

    private M.B<byte[]> d(a aVar) throws z.U {
        M.B<androidx.camera.core.n> b2 = aVar.b();
        androidx.camera.core.n nVarC = b2.c();
        Rect rectB = b2.b();
        try {
            byte[] bArrM = L.b.m(nVarC, rectB, aVar.a(), b2.f());
            return M.B.m(bArrM, b(bArrM), 256, new Size(rectB.width(), rectB.height()), new Rect(0, 0, rectB.width(), rectB.height()), b2.f(), E.q.v(b2.g(), rectB), b2.a());
        } catch (b.a e7) {
            throw new z.U(1, "Failed to encode the image to JPEG.", e7);
        }
    }

    @Override
    public M.B<byte[]> apply(a aVar) throws z.U {
        M.B<byte[]> bD;
        try {
            int iE = aVar.b().e();
            if (iE != 35) {
                if (iE != 256 && iE != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + iE);
                }
                bD = c(aVar, iE);
            } else {
                bD = d(aVar);
            }
            aVar.b().c().close();
            return bD;
        } catch (Throwable th) {
            aVar.b().c().close();
            throw th;
        }
    }
}
