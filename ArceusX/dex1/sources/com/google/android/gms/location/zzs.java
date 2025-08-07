package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import o3.C2679b;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new g();

    boolean f16230d;

    long f16231e;

    float f16232i;

    long f16233v;

    int f16234w;

    public zzs() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        return this.f16230d == zzsVar.f16230d && this.f16231e == zzsVar.f16231e && Float.compare(this.f16232i, zzsVar.f16232i) == 0 && this.f16233v == zzsVar.f16233v && this.f16234w == zzsVar.f16234w;
    }

    public final int hashCode() {
        return C2649g.c(Boolean.valueOf(this.f16230d), Long.valueOf(this.f16231e), Float.valueOf(this.f16232i), Long.valueOf(this.f16233v), Integer.valueOf(this.f16234w));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f16230d);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f16231e);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f16232i);
        long j7 = this.f16233v;
        if (j7 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j7 - jElapsedRealtime);
            sb.append("ms");
        }
        if (this.f16234w != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f16234w);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.c(parcel, 1, this.f16230d);
        C2679b.q(parcel, 2, this.f16231e);
        C2679b.j(parcel, 3, this.f16232i);
        C2679b.q(parcel, 4, this.f16233v);
        C2679b.m(parcel, 5, this.f16234w);
        C2679b.b(parcel, iA);
    }

    zzs(boolean z7, long j7, float f7, long j8, int i7) {
        this.f16230d = z7;
        this.f16231e = j7;
        this.f16232i = f7;
        this.f16233v = j8;
        this.f16234w = i7;
    }
}
