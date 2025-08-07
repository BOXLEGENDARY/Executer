package Q3;

final class L5 extends I2 {

    private final N5 f4113i;

    L5(N5 n52, int i7) {
        super(n52.size(), i7);
        this.f4113i = n52;
    }

    @Override
    protected final Object a(int i7) {
        return this.f4113i.get(i7);
    }
}
