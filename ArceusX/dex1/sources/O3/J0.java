package O3;

import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;

final class J0 implements O0 {

    private final int f2894a;

    private final N0 f2895b;

    J0(int i7, N0 n02) {
        this.f2894a = i7;
        this.f2895b = n02;
    }

    @Override
    public final Class annotationType() {
        return O0.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        O0 o02 = (O0) obj;
        return this.f2894a == o02.zza() && this.f2895b.equals(o02.zzb());
    }

    @Override
    public final int hashCode() {
        return (this.f2894a ^ 14552422) + (this.f2895b.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f2894a + sMlEMqrxoGI.QxZ + this.f2895b + ')';
    }

    @Override
    public final int zza() {
        return this.f2894a;
    }

    @Override
    public final N0 zzb() {
        return this.f2895b;
    }
}
