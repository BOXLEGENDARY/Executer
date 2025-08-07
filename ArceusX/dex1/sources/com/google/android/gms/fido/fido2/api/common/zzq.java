package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new t();

    private final long f14598d;

    private final byte[] f14599e;

    private final byte[] f14600i;

    private final byte[] f14601v;

    zzq(long j7, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f14598d = j7;
        this.f14599e = (byte[]) C2651i.l(bArr);
        this.f14600i = (byte[]) C2651i.l(bArr2);
        this.f14601v = (byte[]) C2651i.l(bArr3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.f14598d == zzqVar.f14598d && Arrays.equals(this.f14599e, zzqVar.f14599e) && Arrays.equals(this.f14600i, zzqVar.f14600i) && Arrays.equals(this.f14601v, zzqVar.f14601v);
    }

    public final int hashCode() {
        return C2649g.c(Long.valueOf(this.f14598d), this.f14599e, this.f14600i, this.f14601v);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.q(parcel, 1, this.f14598d);
        C2679b.f(parcel, 2, this.f14599e, false);
        C2679b.f(parcel, 3, this.f14600i, false);
        C2679b.f(parcel, 4, this.f14601v, false);
        C2679b.b(parcel, iA);
    }
}
