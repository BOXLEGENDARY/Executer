package B;

import androidx.camera.core.ImageProcessingUtil;
import java.util.Objects;

public class B implements M.A<M.B<byte[]>, M.B<androidx.camera.core.n>> {
    @Override
    public M.B<androidx.camera.core.n> apply(M.B<byte[]> b2) throws z.U {
        androidx.camera.core.q qVar = new androidx.camera.core.q(androidx.camera.core.o.a(b2.h().getWidth(), b2.h().getHeight(), 256, 2));
        androidx.camera.core.n nVarE = ImageProcessingUtil.e(qVar, b2.c());
        qVar.m();
        Objects.requireNonNull(nVarE);
        E.f fVarD = b2.d();
        Objects.requireNonNull(fVarD);
        return M.B.k(nVarE, fVarD, b2.b(), b2.f(), b2.g(), b2.a());
    }
}
