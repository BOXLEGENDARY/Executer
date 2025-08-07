package B;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

class C0273i implements M.A<b, M.B<byte[]>> {

    private static class a {
        static boolean a(Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    static abstract class b {
        b() {
        }

        static b c(M.B<Bitmap> b2, int i7) {
            return new C0265a(b2, i7);
        }

        abstract int a();

        abstract M.B<Bitmap> b();
    }

    C0273i() {
    }

    private static int b(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 34 || !a.a(bitmap)) ? 256 : 4101;
    }

    @Override
    public M.B<byte[]> apply(b bVar) throws z.U {
        M.B<Bitmap> b2 = bVar.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b2.c().compress(Bitmap.CompressFormat.JPEG, bVar.a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        E.f fVarD = b2.d();
        Objects.requireNonNull(fVarD);
        return M.B.m(byteArray, fVarD, b(b2.c()), b2.h(), b2.b(), b2.f(), b2.g(), b2.a());
    }
}
