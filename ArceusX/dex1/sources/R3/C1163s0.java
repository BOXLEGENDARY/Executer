package R3;

final class C1163s0 implements InterfaceC1199x0 {

    private final int f5830a;

    private final EnumC1192w0 f5831b;

    C1163s0(int i7, EnumC1192w0 enumC1192w0) {
        this.f5830a = i7;
        this.f5831b = enumC1192w0;
    }

    @Override
    public final Class annotationType() {
        return InterfaceC1199x0.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC1199x0)) {
            return false;
        }
        InterfaceC1199x0 interfaceC1199x0 = (InterfaceC1199x0) obj;
        return this.f5830a == interfaceC1199x0.zza() && this.f5831b.equals(interfaceC1199x0.zzb());
    }

    @Override
    public final int hashCode() {
        return (this.f5830a ^ 14552422) + (this.f5831b.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f5830a + "intEncoding=" + this.f5831b + ')';
    }

    @Override
    public final int zza() {
        return this.f5830a;
    }

    @Override
    public final EnumC1192w0 zzb() {
        return this.f5831b;
    }
}
