package U5;

import g0.h;

public class b {

    private static b f7515d;

    private int f7517b;

    private Object f7518c = new Object();

    private h<a> f7516a = new h<>();

    private b() {
    }

    public static b b() {
        if (f7515d == null) {
            synchronized (b.class) {
                try {
                    if (f7515d == null) {
                        f7515d = new b();
                    }
                } finally {
                }
            }
        }
        return f7515d;
    }

    public void a() {
        this.f7516a.a();
        this.f7517b = 0;
    }

    public int c() {
        return this.f7517b;
    }

    public a d(long j7) {
        return this.f7516a.d(j7);
    }

    public void e(a aVar) {
        synchronized (this.f7518c) {
            try {
                a aVarD = this.f7516a.d(aVar.b());
                if (aVarD != null) {
                    aVarD.i(aVar);
                } else {
                    this.f7516a.h(aVar.b(), aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
