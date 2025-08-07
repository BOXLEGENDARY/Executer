package S3;

final class K extends W9 {

    private final M f6788i;

    K(M m7, int i7) {
        super(m7.size(), i7);
        this.f6788i = m7;
    }

    @Override
    protected final Object a(int i7) {
        return this.f6788i.get(i7);
    }
}
