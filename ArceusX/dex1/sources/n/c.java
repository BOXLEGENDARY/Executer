package N;

import M.C;
import M.C0529z;
import O.d;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Map;
import z.C3041c0;
import z.C3043d0;
import z.C3070z;
import z.u0;

public final class c extends C0529z {

    private int f2499n = -1;

    private int f2500o = -1;

    private final C3041c0 f2501p;

    private final C3041c0 f2502q;

    public c(C3041c0 c3041c0, C3041c0 c3041c02) {
        this.f2501p = c3041c0;
        this.f2502q = c3041c02;
    }

    private static float[] u(Size size, Size size2, C3041c0 c3041c0) {
        float[] fArrL = O.d.l();
        float[] fArrL2 = O.d.l();
        float[] fArrL3 = O.d.l();
        Matrix.scaleM(fArrL, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArrL2, 0, c3041c0.c() / c3041c0.e(), c3041c0.d() / c3041c0.b(), 0.0f);
        Matrix.multiplyMM(fArrL3, 0, fArrL, 0, fArrL2, 0);
        return fArrL3;
    }

    private void w(O.g gVar, u0 u0Var, SurfaceTexture surfaceTexture, C3041c0 c3041c0, int i7, boolean z7) {
        s(i7);
        GLES20.glViewport(0, 0, gVar.c(), gVar.b());
        GLES20.glScissor(0, 0, gVar.c(), gVar.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        u0Var.C(fArr2, fArr, z7);
        d.f fVar = (d.f) x0.g.g(this.f2335k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr2);
        }
        fVar.e(u(new Size((int) (gVar.c() * c3041c0.e()), (int) (gVar.b() * c3041c0.b())), new Size(gVar.c(), gVar.b()), c3041c0));
        fVar.d(c3041c0.a());
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        O.d.g("glDrawArrays");
        GLES20.glDisable(3042);
    }

    @Override
    public O.e h(C3070z c3070z, Map<d.e, C> map) throws Throwable {
        O.e eVarH = super.h(c3070z, map);
        this.f2499n = O.d.p();
        this.f2500o = O.d.p();
        return eVarH;
    }

    @Override
    public void k() {
        super.k();
        this.f2499n = -1;
        this.f2500o = -1;
    }

    public int t(boolean z7) {
        O.d.i(this.f2325a, true);
        O.d.h(this.f2327c);
        return z7 ? this.f2499n : this.f2500o;
    }

    public void v(long j7, Surface surface, u0 u0Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        O.d.i(this.f2325a, true);
        O.d.h(this.f2327c);
        O.g gVarF = f(surface);
        if (gVarF == O.d.f2688l) {
            gVarF = c(surface);
            if (gVarF == null) {
                return;
            } else {
                this.f2326b.put(surface, gVarF);
            }
        }
        if (surface != this.f2333i) {
            i(gVarF.a());
            this.f2333i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        O.g gVar = gVarF;
        w(gVar, u0Var, surfaceTexture, this.f2501p, this.f2499n, true);
        w(gVar, u0Var, surfaceTexture2, this.f2502q, this.f2500o, true);
        EGLExt.eglPresentationTimeANDROID(this.f2328d, gVarF.a(), j7);
        if (EGL14.eglSwapBuffers(this.f2328d, gVarF.a())) {
            return;
        }
        C3043d0.l("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }
}
