package Q3;

final class C0868e implements InterfaceC0903j {

    private final int f4339a;

    private final EnumC0896i f4340b;

    C0868e(int i7, EnumC0896i enumC0896i) {
        this.f4339a = i7;
        this.f4340b = enumC0896i;
    }

    @Override
    public final Class annotationType() {
        return InterfaceC0903j.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC0903j)) {
            return false;
        }
        InterfaceC0903j interfaceC0903j = (InterfaceC0903j) obj;
        return this.f4339a == interfaceC0903j.zza() && this.f4340b.equals(interfaceC0903j.zzb());
    }

    @Override
    public final int hashCode() {
        return (this.f4339a ^ 14552422) + (this.f4340b.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f4339a + "intEncoding=" + this.f4340b + ')';
    }

    @Override
    public final int zza() {
        return this.f4339a;
    }

    @Override
    public final EnumC0896i zzb() {
        return this.f4340b;
    }
}
