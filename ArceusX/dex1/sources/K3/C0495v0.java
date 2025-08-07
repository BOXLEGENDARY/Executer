package K3;

final class C0495v0 extends C0501y0 {

    private final int f1899y;

    private final int f1900z;

    C0495v0(byte[] bArr, int i7, int i8) {
        super(bArr);
        B0.o(i7, i7 + i8, bArr.length);
        this.f1899y = i7;
        this.f1900z = i8;
    }

    @Override
    public final byte d(int i7) {
        int i8 = this.f1900z;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return this.f1904w[this.f1899y + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + i8);
    }

    @Override
    final byte e(int i7) {
        return this.f1904w[this.f1899y + i7];
    }

    @Override
    public final int g() {
        return this.f1900z;
    }

    @Override
    protected final void j(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.f1904w, this.f1899y, bArr, 0, i9);
    }

    @Override
    protected final int s() {
        return this.f1899y;
    }
}
