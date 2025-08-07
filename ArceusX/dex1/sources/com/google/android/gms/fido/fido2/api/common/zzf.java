package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import n3.C2649g;
import o3.C2679b;

public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C3.p();

    private final byte[] f14594d;

    private final byte[] f14595e;

    public zzf(byte[] bArr, byte[] bArr2) {
        this.f14594d = bArr;
        this.f14595e = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return Arrays.equals(this.f14594d, zzfVar.f14594d) && Arrays.equals(this.f14595e, zzfVar.f14595e);
    }

    public final int hashCode() {
        return C2649g.c(this.f14594d, this.f14595e);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.f(parcel, 1, this.f14594d, false);
        C2679b.f(parcel, 2, this.f14595e, false);
        C2679b.b(parcel, iA);
    }
}
