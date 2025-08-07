package C;

import z.r0;

public final class i1 implements z.r0 {

    private final long f609d;

    private final z.r0 f610e;

    public i1(long j7, z.r0 r0Var) {
        x0.g.b(j7 >= 0, "Timeout must be non-negative.");
        this.f609d = j7;
        this.f610e = r0Var;
    }

    @Override
    public long b() {
        return this.f609d;
    }

    @Override
    public r0.c f(r0.b bVar) {
        r0.c cVarF = this.f610e.f(bVar);
        return (b() <= 0 || bVar.b() < b() - cVarF.b()) ? cVarF : r0.c.f24703d;
    }
}
