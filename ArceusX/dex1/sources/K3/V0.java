package K3;

public final class V0 {

    private final byte f1819a;

    private final byte f1820b;

    V0(int i7) {
        this.f1819a = (byte) (i7 & 224);
        this.f1820b = (byte) (i7 & 31);
    }

    public final byte a() {
        return this.f1820b;
    }

    public final byte b() {
        return this.f1819a;
    }

    public final int c() {
        return (this.f1819a >> 5) & 7;
    }
}
