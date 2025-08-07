package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class C2179y3 implements F3 {

    private final InterfaceC2155u3 f16192a;

    private final S3 f16193b;

    private final boolean f16194c;

    private final D2 f16195d;

    private C2179y3(S3 s32, D2 d22, InterfaceC2155u3 interfaceC2155u3) {
        this.f16193b = s32;
        this.f16194c = interfaceC2155u3 instanceof O2;
        this.f16195d = d22;
        this.f16192a = interfaceC2155u3;
    }

    static C2179y3 j(S3 s32, D2 d22, InterfaceC2155u3 interfaceC2155u3) {
        return new C2179y3(s32, d22, interfaceC2155u3);
    }

    @Override
    public final int a(Object obj) {
        int iB = ((R2) obj).zzc.b();
        return this.f16194c ? iB + ((O2) obj).zzb.c() : iB;
    }

    @Override
    public final Object b() {
        InterfaceC2155u3 interfaceC2155u3 = this.f16192a;
        return interfaceC2155u3 instanceof R2 ? ((R2) interfaceC2155u3).r() : interfaceC2155u3.F().f();
    }

    @Override
    public final int c(Object obj) {
        int iHashCode = ((R2) obj).zzc.hashCode();
        return this.f16194c ? (iHashCode * 53) + ((O2) obj).zzb.f15820a.hashCode() : iHashCode;
    }

    @Override
    public final void d(Object obj) {
        this.f16193b.a(obj);
        this.f16195d.a(obj);
    }

    @Override
    public final void e(Object obj, Object obj2) {
        H3.u(this.f16193b, obj, obj2);
        if (this.f16194c) {
            H3.t(this.f16195d, obj, obj2);
        }
    }

    @Override
    public final void f(Object obj, byte[] bArr, int i7, int i8, C2059e2 c2059e2) throws IOException {
        R2 r22 = (R2) obj;
        if (r22.zzc == T3.c()) {
            r22.zzc = T3.f();
        }
        throw null;
    }

    @Override
    public final boolean g(Object obj) {
        return ((O2) obj).zzb.h();
    }

    @Override
    public final void h(Object obj, InterfaceC2067f4 interfaceC2067f4) throws IOException {
        Iterator itE = ((O2) obj).zzb.e();
        while (itE.hasNext()) {
            Map.Entry entry = (Map.Entry) itE.next();
            H2 h22 = (H2) entry.getKey();
            if (h22.a() != EnumC2061e4.MESSAGE || h22.b() || h22.d()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C2036a3) {
                interfaceC2067f4.z(h22.zza(), ((C2036a3) entry).a().b());
            } else {
                interfaceC2067f4.z(h22.zza(), entry.getValue());
            }
        }
        ((R2) obj).zzc.k(interfaceC2067f4);
    }

    @Override
    public final boolean i(Object obj, Object obj2) {
        if (!((R2) obj).zzc.equals(((R2) obj2).zzc)) {
            return false;
        }
        if (this.f16194c) {
            return ((O2) obj).zzb.equals(((O2) obj2).zzb);
        }
        return true;
    }
}
