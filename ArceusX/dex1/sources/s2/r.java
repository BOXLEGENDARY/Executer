package s2;

final class r<T> implements q2.f<T> {

    private final o f23645a;

    private final String f23646b;

    private final q2.b f23647c;

    private final q2.e<T, byte[]> f23648d;

    private final s f23649e;

    r(o oVar, String str, q2.b bVar, q2.e<T, byte[]> eVar, s sVar) {
        this.f23645a = oVar;
        this.f23646b = str;
        this.f23647c = bVar;
        this.f23648d = eVar;
        this.f23649e = sVar;
    }

    public static void c(Exception exc) {
    }

    @Override
    public void a(q2.c<T> cVar) {
        d(cVar, new q2.h() {
            @Override
            public final void a(Exception exc) {
                r.c(exc);
            }
        });
    }

    public void d(q2.c<T> cVar, q2.h hVar) {
        this.f23649e.a(n.a().e(this.f23645a).c(cVar).f(this.f23646b).d(this.f23648d).b(this.f23647c).a(), hVar);
    }
}
