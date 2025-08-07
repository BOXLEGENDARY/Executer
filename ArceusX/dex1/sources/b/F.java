package B;

import B.O;
import C.InterfaceC0364z;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.io.IOException;
import t2.Dbl.hgESaf;

final class F implements M.A<O.b, M.B<androidx.camera.core.n>> {
    F() {
    }

    private static M.B<androidx.camera.core.n> b(P p7, E.f fVar, androidx.camera.core.n nVar) {
        return M.B.k(nVar, fVar, p7.b(), p7.f(), p7.g(), d(nVar));
    }

    private static M.B<androidx.camera.core.n> c(P p7, E.f fVar, androidx.camera.core.n nVar) {
        Size size = new Size(nVar.getWidth(), nVar.getHeight());
        int iF = p7.f() - fVar.s();
        Size sizeE = e(iF, size);
        Matrix matrixD = E.q.d(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, sizeE.getWidth(), sizeE.getHeight()), iF);
        return M.B.l(nVar, fVar, sizeE, f(p7.b(), matrixD), fVar.s(), g(p7.g(), matrixD), d(nVar));
    }

    private static InterfaceC0364z d(androidx.camera.core.n nVar) {
        return nVar.D0() instanceof H.c ? ((H.c) nVar.D0()).f() : InterfaceC0364z.a.c();
    }

    private static Size e(int i7, Size size) {
        return E.q.i(E.q.w(i7)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    private static Rect f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private static Matrix g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override
    public M.B<androidx.camera.core.n> apply(O.b bVar) throws z.U {
        E.f fVarJ;
        androidx.camera.core.n nVarA = bVar.a();
        P pB = bVar.b();
        if (L.b.j(nVarA.i())) {
            try {
                fVarJ = E.f.j(nVarA);
                nVarA.s()[0].c().rewind();
            } catch (IOException e7) {
                throw new z.U(1, hgESaf.ZfyltRm, e7);
            }
        } else {
            fVarJ = null;
        }
        if (!C0288y.f268g.b(nVarA)) {
            return b(pB, fVarJ, nVarA);
        }
        x0.g.h(fVarJ, "JPEG image must have exif.");
        return c(pB, fVarJ, nVarA);
    }
}
