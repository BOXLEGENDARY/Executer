package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new C3.h();

    private final byte[][] f14588d;

    public zzai(byte[][] bArr) {
        C2651i.a(bArr != null);
        C2651i.a(1 == ((bArr.length & 1) ^ 1));
        int i7 = 0;
        while (i7 < bArr.length) {
            C2651i.a(i7 == 0 || bArr[i7] != null);
            int i8 = i7 + 1;
            C2651i.a(bArr[i8] != null);
            int length = bArr[i8].length;
            C2651i.a(length == 32 || length == 64);
            i7 += 2;
        }
        this.f14588d = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzai) {
            return Arrays.deepEquals(this.f14588d, ((zzai) obj).f14588d);
        }
        return false;
    }

    public final int hashCode() {
        int iC = 0;
        for (byte[] bArr : this.f14588d) {
            iC ^= C2649g.c(bArr);
        }
        return iC;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.g(parcel, 1, this.f14588d, false);
        C2679b.b(parcel, iA);
    }
}
