package com.google.android.gms.internal.play_billing;

final class C2108m3 implements G3 {

    private static final InterfaceC2143s3 f16091b = new C2096k3();

    private final InterfaceC2143s3 f16092a;

    public C2108m3() {
        M2 m2C = M2.c();
        int i7 = C3.f15781d;
        C2102l3 c2102l3 = new C2102l3(m2C, f16091b);
        byte[] bArr = W2.f15951b;
        this.f16092a = c2102l3;
    }

    @Override
    public final F3 a(Class cls) {
        int i7 = H3.f15816b;
        if (!R2.class.isAssignableFrom(cls)) {
            int i8 = C3.f15781d;
        }
        InterfaceC2137r3 interfaceC2137r3A = this.f16092a.a(cls);
        if (interfaceC2137r3A.zzb()) {
            int i9 = C3.f15781d;
            return C2179y3.j(H3.r(), F2.a(), interfaceC2137r3A.zza());
        }
        int i10 = C3.f15781d;
        return C2173x3.A(cls, interfaceC2137r3A, A3.a(), C2084i3.a(), H3.r(), interfaceC2137r3A.a() + (-1) != 1 ? F2.a() : null, C2132q3.a());
    }
}
