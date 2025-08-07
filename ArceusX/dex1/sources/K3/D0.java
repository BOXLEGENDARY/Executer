package K3;

final class D0 extends F0 {

    private final byte[] f1771b;

    private int f1772c;

    private int f1773d;

    private int f1774e;

    D0(byte[] bArr, int i7, int i8, boolean z7, C0 c02) {
        super(null);
        this.f1774e = Integer.MAX_VALUE;
        this.f1771b = bArr;
        this.f1772c = 0;
    }

    public final int a(int i7) throws H0 {
        int i8 = this.f1774e;
        this.f1774e = 0;
        int i9 = this.f1772c + this.f1773d;
        this.f1772c = i9;
        if (i9 > 0) {
            this.f1773d = i9;
            this.f1772c = 0;
        } else {
            this.f1773d = 0;
        }
        return i8;
    }
}
