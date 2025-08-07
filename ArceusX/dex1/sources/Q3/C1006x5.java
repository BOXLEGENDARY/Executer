package Q3;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import n3.C2648f;
import o5.C2686c;
import o5.C2690g;

public final class C1006x5 {

    private static N5 f4796k;

    private static final P5 f4797l = P5.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    private final String f4798a;

    private final String f4799b;

    private final InterfaceC0958q5 f4800c;

    private final o5.n f4801d;

    private final Task f4802e;

    private final Task f4803f;

    private final String f4804g;

    private final int f4805h;

    private final Map f4806i = new HashMap();

    private final Map f4807j = new HashMap();

    public C1006x5(Context context, final o5.n nVar, InterfaceC0958q5 interfaceC0958q5, String str) {
        this.f4798a = context.getPackageName();
        this.f4799b = C2686c.a(context);
        this.f4801d = nVar;
        this.f4800c = interfaceC0958q5;
        K5.a();
        this.f4804g = str;
        this.f4802e = C2690g.a().b(new Callable() {
            @Override
            public final Object call() {
                return this.f4720d.a();
            }
        });
        C2690g c2690gA = C2690g.a();
        nVar.getClass();
        this.f4803f = c2690gA.b(new Callable() {
            @Override
            public final Object call() {
                return nVar.a();
            }
        });
        P5 p52 = f4797l;
        this.f4805h = p52.containsKey(str) ? DynamiteModule.c(context, (String) p52.get(str)) : -1;
    }

    private static synchronized N5 d() {
        try {
            N5 n52 = f4796k;
            if (n52 != null) {
                return n52;
            }
            u0.i iVarA = u0.f.a(Resources.getSystem().getConfiguration());
            C0937n5 c0937n5 = new C0937n5();
            for (int i7 = 0; i7 < iVarA.f(); i7++) {
                c0937n5.c(C2686c.b(iVarA.c(i7)));
            }
            N5 n5D = c0937n5.d();
            f4796k = n5D;
            return n5D;
        } catch (Throwable th) {
            throw th;
        }
    }

    final String a() throws Exception {
        return C2648f.a().b(this.f4804g);
    }

    final void b(InterfaceC0951p5 interfaceC0951p5, F3 f32, String str) {
        interfaceC0951p5.c(f32);
        String strA = interfaceC0951p5.a();
        K4 k42 = new K4();
        k42.b(this.f4798a);
        k42.c(this.f4799b);
        k42.h(d());
        k42.g(Boolean.TRUE);
        k42.l(strA);
        k42.j(str);
        k42.i(this.f4803f.o() ? (String) this.f4803f.k() : this.f4801d.a());
        k42.d(10);
        k42.k(Integer.valueOf(this.f4805h));
        interfaceC0951p5.b(k42);
        this.f4800c.a(interfaceC0951p5);
    }

    public final void c(H5 h52, final F3 f32) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f4806i.get(f32) != null && jElapsedRealtime - ((Long) this.f4806i.get(f32)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.f4806i.put(f32, Long.valueOf(jElapsedRealtime));
        int i7 = h52.f4045a;
        int i8 = h52.f4046b;
        int i9 = h52.f4047c;
        int i10 = h52.f4048d;
        int i11 = h52.f4049e;
        long j7 = h52.f4050f;
        int i12 = h52.f4051g;
        C1004x3 c1004x3 = new C1004x3();
        c1004x3.d(i7 != -1 ? i7 != 35 ? i7 != 842094169 ? i7 != 16 ? i7 != 17 ? EnumC0969s3.UNKNOWN_FORMAT : EnumC0969s3.NV21 : EnumC0969s3.NV16 : EnumC0969s3.YV12 : EnumC0969s3.YUV_420_888 : EnumC0969s3.f4593A);
        c1004x3.f(i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? EnumC1011y3.ANDROID_MEDIA_IMAGE : EnumC1011y3.FILEPATH : EnumC1011y3.BYTEBUFFER : EnumC1011y3.BYTEARRAY : EnumC1011y3.BITMAP);
        c1004x3.c(Integer.valueOf(i9));
        c1004x3.e(Integer.valueOf(i10));
        c1004x3.g(Integer.valueOf(i11));
        c1004x3.b(Long.valueOf(j7));
        c1004x3.h(Integer.valueOf(i12));
        A3 a3J = c1004x3.j();
        G3 g32 = new G3();
        g32.d(a3J);
        final InterfaceC0951p5 interfaceC0951p5E = y5.e(g32);
        final String strB = this.f4802e.o() ? (String) this.f4802e.k() : C2648f.a().b(this.f4804g);
        C2690g.d().execute(new Runnable() {
            @Override
            public final void run() {
                this.f4761d.b(interfaceC0951p5E, f32, strB);
            }
        });
    }
}
