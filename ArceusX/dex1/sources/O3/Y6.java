package O3;

public enum Y6 implements M0 {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    f3355v(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(256),
    FORMAT_UPC_A(512),
    f3349F(1024),
    FORMAT_PDF417(2048),
    FORMAT_AZTEC(4096);


    private final int f3359d;

    Y6(int i7) {
        this.f3359d = i7;
    }

    @Override
    public final int zza() {
        return this.f3359d;
    }
}
