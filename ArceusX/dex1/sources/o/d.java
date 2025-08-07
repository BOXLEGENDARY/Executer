package O;

import M.C;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z.C3043d0;
import z.C3070z;

public final class d {

    public static final int[] f2677a = {12344};

    public static final int[] f2678b = {12445, 13632, 12344};

    public static final String f2679c;

    public static final String f2680d;

    private static final C f2681e;

    private static final C f2682f;

    private static final C f2683g;

    public static final float[] f2684h;

    public static final FloatBuffer f2685i;

    public static final float[] f2686j;

    public static final FloatBuffer f2687k;

    public static final O.g f2688l;

    class a implements C {
        a() {
        }

        @Override
        public String a(String str, String str2) {
            return String.format(Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", str2, str, str, str2);
        }
    }

    class b implements C {
        b() {
        }

        @Override
        public String a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    class c implements C {
        c() {
        }

        @Override
        public String a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    public static class C0042d extends f {
        public C0042d() {
            super("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
        }
    }

    public enum e {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    public static abstract class f {

        protected int f2693a;

        protected int f2694b = -1;

        protected int f2695c = -1;

        protected int f2696d = -1;

        protected f(java.lang.String r7, java.lang.String r8) throws java.lang.Throwable {
            throw new UnsupportedOperationException("Method not decompiled: O.d.f.<init>(java.lang.String, java.lang.String):void");
        }

        public void c() {
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f2693a, "aPosition");
            this.f2696d = iGlGetAttribLocation;
            d.j(iGlGetAttribLocation, "aPosition");
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f2693a, "uTransMatrix");
            this.f2694b = iGlGetUniformLocation;
            d.j(iGlGetUniformLocation, "uTransMatrix");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f2693a, "uAlphaScale");
            this.f2695c = iGlGetUniformLocation2;
            d.j(iGlGetUniformLocation2, "uAlphaScale");
        }

        public void b() {
            GLES20.glDeleteProgram(this.f2693a);
        }

        public void d(float f7) {
            GLES20.glUniform1f(this.f2695c, f7);
            d.g("glUniform1f");
        }

        public void e(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f2694b, 1, false, fArr, 0);
            d.g("glUniformMatrix4fv");
        }

        public void f() {
            GLES20.glUseProgram(this.f2693a);
            d.g("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.f2696d);
            d.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f2696d, 2, 5126, false, 0, (Buffer) d.f2685i);
            d.g("glVertexAttribPointer");
            e(d.l());
            d(1.0f);
        }
    }

    public static class g extends f {

        private int f2697e;

        private int f2698f;

        private int f2699g;

        public g(C3070z c3070z, e eVar) {
            this(c3070z, g(c3070z, eVar));
        }

        private void c() {
            c();
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f2693a, "sTexture");
            this.f2697e = iGlGetUniformLocation;
            d.j(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f2693a, "aTextureCoord");
            this.f2699g = iGlGetAttribLocation;
            d.j(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f2693a, "uTexMatrix");
            this.f2698f = iGlGetUniformLocation2;
            d.j(iGlGetUniformLocation2, "uTexMatrix");
        }

        private static C g(C3070z c3070z, e eVar) {
            if (!c3070z.d()) {
                return d.f2681e;
            }
            x0.g.b(eVar != e.UNKNOWN, "No default sampler shader available for" + eVar);
            return eVar == e.YUV ? d.f2683g : d.f2682f;
        }

        @Override
        public void f() {
            super.f();
            GLES20.glUniform1i(this.f2697e, 0);
            GLES20.glEnableVertexAttribArray(this.f2699g);
            d.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f2699g, 2, 5126, false, 0, (Buffer) d.f2687k);
            d.g("glVertexAttribPointer");
        }

        public void h(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f2698f, 1, false, fArr, 0);
            d.g("glUniformMatrix4fv");
        }

        public g(C3070z c3070z, C c2) {
            super(c3070z.d() ? d.f2680d : d.f2679c, d.v(c2));
            this.f2697e = -1;
            this.f2698f = -1;
            this.f2699g = -1;
            c();
        }
    }

    static {
        Locale locale = Locale.US;
        f2679c = String.format(locale, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f2680d = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f2681e = new a();
        f2682f = new b();
        f2683g = new c();
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f2684h = fArr;
        f2685i = m(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f2686j = fArr2;
        f2687k = m(fArr2);
        f2688l = O.g.d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void e(String str) {
        try {
            f(str);
        } catch (IllegalStateException e7) {
            C3043d0.d("GLUtils", e7.toString(), e7);
        }
    }

    public static void f(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    public static void g(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(iGlGetError));
    }

    public static void h(Thread thread) {
        x0.g.j(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static void i(AtomicBoolean atomicBoolean, boolean z7) {
        x0.g.j(z7 == atomicBoolean.get(), z7 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    public static void j(int i7, String str) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    public static int[] k(String str, C3070z c3070z) {
        int[] iArr = f2677a;
        if (c3070z.b() != 3) {
            return iArr;
        }
        if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
            return f2678b;
        }
        C3043d0.l("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        return iArr;
    }

    public static float[] l() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static FloatBuffer m(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static EGLSurface n(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i7, int i8) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i7, 12374, i8, 12344}, 0);
        f("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static Map<e, f> o(C3070z c3070z, Map<e, C> map) {
        Object gVar;
        e eVar;
        HashMap map2 = new HashMap();
        e[] eVarArrValues = e.values();
        int length = eVarArrValues.length;
        for (int i7 = 0; i7 < length; i7++) {
            e eVar2 = eVarArrValues[i7];
            C c2 = map.get(eVar2);
            if (c2 != null) {
                gVar = new g(c3070z, c2);
            } else if (eVar2 == e.YUV || eVar2 == (eVar = e.DEFAULT)) {
                gVar = new g(c3070z, eVar2);
            } else {
                x0.g.j(eVar2 == e.UNKNOWN, "Unhandled input format: " + eVar2);
                if (c3070z.d()) {
                    gVar = new C0042d();
                } else {
                    C c3 = map.get(eVar);
                    gVar = c3 != null ? new g(c3070z, c3) : new g(c3070z, eVar);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + eVar2 + " created: " + gVar);
            map2.put(eVar2, gVar);
        }
        return map2;
    }

    public static int p() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g("glGenTextures");
        int i7 = iArr[0];
        GLES20.glBindTexture(36197, i7);
        g("glBindTexture " + i7);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        g("glTexParameter");
        return i7;
    }

    public static EGLSurface q(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        f("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static void r(int i7) {
        GLES20.glDeleteFramebuffers(1, new int[]{i7}, 0);
        g("glDeleteFramebuffers");
    }

    public static void s(int i7) {
        GLES20.glDeleteTextures(1, new int[]{i7}, 0);
        g("glDeleteTextures");
    }

    public static int t() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        g("glGenFramebuffers");
        return iArr[0];
    }

    public static int u() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g("glGenTextures");
        return iArr[0];
    }

    public static String v(C c2) {
        try {
            String strA = c2.a("sTexture", "vTextureCoord");
            if (strA != null && strA.contains("vTextureCoord") && strA.contains("sTexture")) {
                return strA;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
        }
    }

    public static String w() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        return ((String) x0.g.g(matcher.group(1))) + "." + ((String) x0.g.g(matcher.group(2)));
    }

    public static Size x(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        return new Size(z(eGLDisplay, eGLSurface, 12375), z(eGLDisplay, eGLSurface, 12374));
    }

    public static int y(int i7, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i7);
        g("glCreateShader type=" + i7);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        C3043d0.l("GLUtils", "Could not compile shader: " + str);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i7 + ":" + GLES20.glGetShaderInfoLog(iGlCreateShader));
    }

    public static int z(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i7) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i7, iArr, 0);
        return iArr[0];
    }
}
