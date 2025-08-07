package G5;

public enum a {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final a[] y;
    private final int d;

    static {
        a aVar = L;
        a aVar2 = M;
        a aVar3 = Q;
        y = new a[]{aVar2, aVar, H, aVar3};
    }

    a(int i) {
        this.d = i;
    }

    public int c() {
        return this.d;
    }
}
