package B;

import M.C0525v;
import M.C0528y;
import android.graphics.Bitmap;
import java.util.Objects;

public class C0274j implements M.A<M.B<Bitmap>, M.B<Bitmap>> {

    private final C0528y f242a;

    C0274j(C0528y c0528y) {
        this.f242a = c0528y;
    }

    @Override
    public M.B<Bitmap> apply(M.B<Bitmap> b2) throws z.U {
        androidx.camera.core.n nVarA = this.f242a.e(new C0525v(new U(b2), 1)).a();
        Objects.requireNonNull(nVarA);
        Bitmap bitmapD = L.b.d(nVarA.s(), nVarA.getWidth(), nVarA.getHeight());
        E.f fVarD = b2.d();
        Objects.requireNonNull(fVarD);
        return M.B.j(bitmapD, fVarD, b2.b(), b2.f(), b2.g(), b2.a());
    }
}
