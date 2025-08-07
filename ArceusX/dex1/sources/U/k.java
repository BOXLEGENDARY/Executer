package u;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

public final class k {

    private final a f23855a;

    interface a {
        Surface a();

        void b(long j7);

        void c(Surface surface);

        void d(long j7);

        String e();

        void f();

        void g(String str);

        void h(int i7);

        Object i();
    }

    public k(int i7, Surface surface) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            this.f23855a = new o(i7, surface);
        } else if (i8 >= 28) {
            this.f23855a = new n(i7, surface);
        } else {
            this.f23855a = new m(i7, surface);
        }
    }

    public static k j(Object obj) {
        if (obj == null) {
            return null;
        }
        int i7 = Build.VERSION.SDK_INT;
        a aVarM = i7 >= 33 ? o.m((OutputConfiguration) obj) : i7 >= 28 ? n.l((OutputConfiguration) obj) : m.k((OutputConfiguration) obj);
        if (aVarM == null) {
            return null;
        }
        return new k(aVarM);
    }

    public void a(Surface surface) {
        this.f23855a.c(surface);
    }

    public void b() {
        this.f23855a.f();
    }

    public String c() {
        return this.f23855a.e();
    }

    public Surface d() {
        return this.f23855a.a();
    }

    public void e(long j7) {
        this.f23855a.d(j7);
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f23855a.equals(((k) obj).f23855a);
        }
        return false;
    }

    public void f(int i7) {
        this.f23855a.h(i7);
    }

    public void g(String str) {
        this.f23855a.g(str);
    }

    public void h(long j7) {
        this.f23855a.b(j7);
    }

    public int hashCode() {
        return this.f23855a.hashCode();
    }

    public Object i() {
        return this.f23855a.i();
    }

    public k(OutputConfiguration outputConfiguration) {
        this.f23855a = o.m(outputConfiguration);
    }

    private k(a aVar) {
        this.f23855a = aVar;
    }
}
