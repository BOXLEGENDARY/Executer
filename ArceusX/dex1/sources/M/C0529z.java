package M;

import O.d;
import O.e;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import com.github.luben.zstd.BuildConfig;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import x0.C2986c;
import z.C3043d0;
import z.C3070z;

public class C0529z {

    protected Thread f2327c;

    protected EGLConfig f2331g;

    protected Surface f2333i;

    protected final AtomicBoolean f2325a = new AtomicBoolean(false);

    protected final Map<Surface, O.g> f2326b = new HashMap();

    protected EGLDisplay f2328d = EGL14.EGL_NO_DISPLAY;

    protected EGLContext f2329e = EGL14.EGL_NO_CONTEXT;

    protected int[] f2330f = O.d.f2677a;

    protected EGLSurface f2332h = EGL14.EGL_NO_SURFACE;

    protected Map<d.e, d.f> f2334j = Collections.emptyMap();

    protected d.f f2335k = null;

    protected d.e f2336l = d.e.UNKNOWN;

    private int f2337m = -1;

    private void a(int i7) {
        GLES20.glActiveTexture(33984);
        O.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, i7);
        O.d.g("glBindTexture");
    }

    private void b(C3070z c3070z, e.a aVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f2328d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f2328d, iArr, 0, iArr, 1)) {
            this.f2328d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (aVar != null) {
            aVar.c(iArr[0] + "." + iArr[1]);
        }
        int i7 = c3070z.d() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f2328d, new int[]{12324, i7, 12323, i7, 12322, i7, 12321, c3070z.d() ? 2 : 8, 12325, 0, 12326, 0, 12352, c3070z.d() ? 64 : 4, 12610, c3070z.d() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f2328d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, c3070z.d() ? 3 : 2, 12344}, 0);
        O.d.f("eglCreateContext");
        this.f2331g = eGLConfig;
        this.f2329e = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f2328d, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    private void d() {
        EGLDisplay eGLDisplay = this.f2328d;
        EGLConfig eGLConfig = this.f2331g;
        Objects.requireNonNull(eGLConfig);
        this.f2332h = O.d.n(eGLDisplay, eGLConfig, 1, 1);
    }

    private C2986c<String, String> e(C3070z c3070z) {
        O.d.i(this.f2325a, false);
        try {
            b(c3070z, null);
            d();
            i(this.f2332h);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.f2328d, 12373);
            if (strGlGetString == null) {
                strGlGetString = BuildConfig.FLAVOR;
            }
            if (strEglQueryString == null) {
                strEglQueryString = BuildConfig.FLAVOR;
            }
            return new C2986c<>(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e7) {
            C3043d0.m("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e7.getMessage(), e7);
            return new C2986c<>(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
        } finally {
            l();
        }
    }

    private void l() {
        Iterator<d.f> it = this.f2334j.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f2334j = Collections.emptyMap();
        this.f2335k = null;
        if (!Objects.equals(this.f2328d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f2328d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (O.g gVar : this.f2326b.values()) {
                if (!Objects.equals(gVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f2328d, gVar.a())) {
                    O.d.e("eglDestroySurface");
                }
            }
            this.f2326b.clear();
            if (!Objects.equals(this.f2332h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f2328d, this.f2332h);
                this.f2332h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f2329e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f2328d, this.f2329e);
                this.f2329e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f2328d);
            this.f2328d = EGL14.EGL_NO_DISPLAY;
        }
        this.f2331g = null;
        this.f2337m = -1;
        this.f2336l = d.e.UNKNOWN;
        this.f2333i = null;
        this.f2327c = null;
    }

    private void q(ByteBuffer byteBuffer, Size size, float[] fArr) {
        x0.g.b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        x0.g.b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int iU = O.d.u();
        GLES20.glActiveTexture(33985);
        O.d.g("glActiveTexture");
        GLES20.glBindTexture(3553, iU);
        O.d.g("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        O.d.g("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int iT = O.d.t();
        GLES20.glBindFramebuffer(36160, iT);
        O.d.g("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iU, 0);
        O.d.g("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        O.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, this.f2337m);
        O.d.g("glBindTexture");
        this.f2333i = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        d.f fVar = (d.f) x0.g.g(this.f2335k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        O.d.g("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        O.d.g("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        O.d.s(iU);
        O.d.r(iT);
        a(this.f2337m);
    }

    protected O.g c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f2328d;
            EGLConfig eGLConfig = this.f2331g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceQ = O.d.q(eGLDisplay, eGLConfig, surface, this.f2330f);
            Size sizeX = O.d.x(this.f2328d, eGLSurfaceQ);
            return O.g.d(eGLSurfaceQ, sizeX.getWidth(), sizeX.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e7) {
            C3043d0.m("OpenGlRenderer", "Failed to create EGL surface: " + e7.getMessage(), e7);
            return null;
        }
    }

    protected O.g f(Surface surface) {
        x0.g.j(this.f2326b.containsKey(surface), "The surface is not registered.");
        O.g gVar = this.f2326b.get(surface);
        Objects.requireNonNull(gVar);
        return gVar;
    }

    public int g() {
        O.d.i(this.f2325a, true);
        O.d.h(this.f2327c);
        return this.f2337m;
    }

    public O.e h(C3070z c3070z, Map<d.e, C> map) throws Throwable {
        O.d.i(this.f2325a, false);
        e.a aVarA = O.e.a();
        try {
            if (c3070z.d()) {
                C2986c<String, String> c2986cE = e(c3070z);
                String str = (String) x0.g.g(c2986cE.f24317a);
                String str2 = (String) x0.g.g(c2986cE.f24318b);
                if (!str.contains("GL_EXT_YUV_target")) {
                    C3043d0.l("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    c3070z = C3070z.f24773d;
                }
                this.f2330f = O.d.k(str2, c3070z);
                aVarA.d(str);
                aVarA.b(str2);
            }
            b(c3070z, aVarA);
            d();
            i(this.f2332h);
            aVarA.e(O.d.w());
            this.f2334j = O.d.o(c3070z, map);
            int iP = O.d.p();
            this.f2337m = iP;
            s(iP);
            this.f2327c = Thread.currentThread();
            this.f2325a.set(true);
            return aVarA.a();
        } catch (IllegalArgumentException e7) {
            e = e7;
            l();
            throw e;
        } catch (IllegalStateException e8) {
            e = e8;
            l();
            throw e;
        }
    }

    protected void i(EGLSurface eGLSurface) {
        x0.g.g(this.f2328d);
        x0.g.g(this.f2329e);
        if (!EGL14.eglMakeCurrent(this.f2328d, eGLSurface, eGLSurface, this.f2329e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void j(Surface surface) {
        O.d.i(this.f2325a, true);
        O.d.h(this.f2327c);
        if (this.f2326b.containsKey(surface)) {
            return;
        }
        this.f2326b.put(surface, O.d.f2688l);
    }

    public void k() {
        if (this.f2325a.getAndSet(false)) {
            O.d.h(this.f2327c);
            l();
        }
    }

    protected void m(Surface surface, boolean z7) {
        if (this.f2333i == surface) {
            this.f2333i = null;
            i(this.f2332h);
        }
        O.g gVarRemove = z7 ? this.f2326b.remove(surface) : this.f2326b.put(surface, O.d.f2688l);
        if (gVarRemove == null || gVarRemove == O.d.f2688l) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f2328d, gVarRemove.a());
        } catch (RuntimeException e7) {
            C3043d0.m("OpenGlRenderer", "Failed to destroy EGL surface: " + e7.getMessage(), e7);
        }
    }

    public void n(long j7, float[] fArr, Surface surface) {
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
            GLES20.glViewport(0, 0, gVarF.c(), gVarF.b());
            GLES20.glScissor(0, 0, gVarF.c(), gVarF.b());
        }
        d.f fVar = (d.f) x0.g.g(this.f2335k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        O.d.g("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f2328d, gVarF.a(), j7);
        if (EGL14.eglSwapBuffers(this.f2328d, gVarF.a())) {
            return;
        }
        C3043d0.l("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }

    public void o(d.e eVar) {
        O.d.i(this.f2325a, true);
        O.d.h(this.f2327c);
        if (this.f2336l != eVar) {
            this.f2336l = eVar;
            s(this.f2337m);
        }
    }

    public Bitmap p(Size size, float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        q(byteBufferAllocateDirect, size, fArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, byteBufferAllocateDirect, size.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public void r(Surface surface) {
        O.d.i(this.f2325a, true);
        O.d.h(this.f2327c);
        m(surface, true);
    }

    protected void s(int i7) {
        d.f fVar = this.f2334j.get(this.f2336l);
        if (fVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f2336l);
        }
        if (this.f2335k != fVar) {
            this.f2335k = fVar;
            fVar.f();
            Log.d("OpenGlRenderer", "Using program for input format " + this.f2336l + ": " + this.f2335k);
        }
        a(i7);
    }
}
