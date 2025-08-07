package B;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import java.io.IOException;
import java.util.Objects;

final class C0289z implements M.A<M.B<byte[]>, M.B<Bitmap>> {
    C0289z() {
    }

    private Bitmap b(byte[] bArr, Rect rect) throws z.U, IOException {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e7) {
            throw new z.U(1, GObvYfBKohxpYX.tgiIQDyuuVZl, e7);
        }
    }

    @Override
    public M.B<Bitmap> apply(M.B<byte[]> b2) throws z.U, IOException {
        Rect rectB = b2.b();
        Bitmap bitmapB = b(b2.c(), rectB);
        E.f fVarD = b2.d();
        Objects.requireNonNull(fVarD);
        return M.B.j(bitmapB, fVarD, new Rect(0, 0, bitmapB.getWidth(), bitmapB.getHeight()), b2.f(), E.q.v(b2.g(), rectB), b2.a());
    }
}
