package S3;

public enum EnumC1383m6 implements InterfaceC1507y0 {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);


    private final int f7035d;

    EnumC1383m6(int i7) {
        this.f7035d = i7;
    }

    @Override
    public final int zza() {
        return this.f7035d;
    }
}
