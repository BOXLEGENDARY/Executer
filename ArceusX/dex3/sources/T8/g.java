package T8;

import okhttp3.Interceptor;

public final class g implements C9.d<Interceptor> {
    private final f a;
    private final C9.h<c> b;

    public g(f fVar, C9.h<c> hVar) {
        this.a = fVar;
        this.b = hVar;
    }

    public static g a(f fVar, C9.h<c> hVar) {
        return new g(fVar, hVar);
    }

    public static Interceptor c(f fVar, c cVar) {
        return (Interceptor) C9.g.d(fVar.b(cVar));
    }

    public Interceptor get() {
        return c(this.a, (c) this.b.get());
    }
}
