package N3;

final class C0533d extends a0 {

    private final AbstractC0535f f2603i;

    C0533d(AbstractC0535f abstractC0535f, int i7) {
        super(abstractC0535f.size(), i7);
        this.f2603i = abstractC0535f;
    }

    @Override
    protected final Object a(int i7) {
        return this.f2603i.get(i7);
    }
}
