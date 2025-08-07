package A2;

public final class N implements u2.b<M> {

    private final O9.a<C2.a> f28a;

    private final O9.a<C2.a> f29b;

    private final O9.a<AbstractC0248e> f30c;

    private final O9.a<U> f31d;

    private final O9.a<String> f32e;

    public N(O9.a<C2.a> aVar, O9.a<C2.a> aVar2, O9.a<AbstractC0248e> aVar3, O9.a<U> aVar4, O9.a<String> aVar5) {
        this.f28a = aVar;
        this.f29b = aVar2;
        this.f30c = aVar3;
        this.f31d = aVar4;
        this.f32e = aVar5;
    }

    public static N a(O9.a<C2.a> aVar, O9.a<C2.a> aVar2, O9.a<AbstractC0248e> aVar3, O9.a<U> aVar4, O9.a<String> aVar5) {
        return new N(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static M c(C2.a aVar, C2.a aVar2, Object obj, Object obj2, O9.a<String> aVar3) {
        return new M(aVar, aVar2, (AbstractC0248e) obj, (U) obj2, aVar3);
    }

    public M get() {
        return c((C2.a) this.f28a.get(), (C2.a) this.f29b.get(), this.f30c.get(), this.f31d.get(), this.f32e);
    }
}
