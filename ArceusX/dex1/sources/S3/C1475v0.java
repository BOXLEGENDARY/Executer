package S3;

final class C1475v0 implements A0 {

    private final int f7158a;

    private final EnumC1517z0 f7159b;

    C1475v0(int i7, EnumC1517z0 enumC1517z0) {
        this.f7158a = i7;
        this.f7159b = enumC1517z0;
    }

    @Override
    public final Class annotationType() {
        return A0.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        return this.f7158a == a02.zza() && this.f7159b.equals(a02.zzb());
    }

    @Override
    public final int hashCode() {
        return (this.f7158a ^ 14552422) + (this.f7159b.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f7158a + "intEncoding=" + this.f7159b + ')';
    }

    @Override
    public final int zza() {
        return this.f7158a;
    }

    @Override
    public final EnumC1517z0 zzb() {
        return this.f7159b;
    }
}
