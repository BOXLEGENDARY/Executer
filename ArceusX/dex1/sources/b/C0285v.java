package B;

import android.graphics.Bitmap;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;

public class C0285v implements M.A<M.B<androidx.camera.core.n>, Bitmap> {
    @Override
    public Bitmap apply(M.B<androidx.camera.core.n> b2) throws Throwable {
        androidx.camera.core.q qVar;
        Bitmap bitmapL;
        androidx.camera.core.q qVar2 = null;
        try {
            try {
                if (b2.e() == 35) {
                    androidx.camera.core.n nVarC = b2.c();
                    boolean z7 = b2.f() % 180 != 0;
                    qVar = new androidx.camera.core.q(androidx.camera.core.o.a(z7 ? nVarC.getHeight() : nVarC.getWidth(), z7 ? nVarC.getWidth() : nVarC.getHeight(), 1, 2));
                    try {
                        androidx.camera.core.n nVarG = ImageProcessingUtil.g(nVarC, qVar, ByteBuffer.allocateDirect(nVarC.getWidth() * nVarC.getHeight() * 4), b2.f(), false);
                        nVarC.close();
                        if (nVarG == null) {
                            throw new z.U(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapL = L.b.b(nVarG);
                        nVarG.close();
                    } catch (UnsupportedOperationException e7) {
                        e = e7;
                        throw new z.U(0, "Can't convert " + (b2.e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th) {
                        th = th;
                        qVar2 = qVar;
                        if (qVar2 != null) {
                            qVar2.close();
                        }
                        throw th;
                    }
                } else {
                    if (b2.e() != 256) {
                        throw new IllegalArgumentException("Invalid postview image format : " + b2.e());
                    }
                    androidx.camera.core.n nVarC2 = b2.c();
                    Bitmap bitmapB = L.b.b(nVarC2);
                    nVarC2.close();
                    qVar = null;
                    bitmapL = L.b.l(bitmapB, b2.f());
                }
                if (qVar != null) {
                    qVar.close();
                }
                return bitmapL;
            } catch (UnsupportedOperationException e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
