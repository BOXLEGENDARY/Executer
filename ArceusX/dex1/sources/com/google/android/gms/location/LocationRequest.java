package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import o3.C2679b;

public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new b();

    long f16205A;

    boolean f16206B;

    int f16207d;

    long f16208e;

    long f16209i;

    boolean f16210v;

    long f16211w;

    int f16212y;

    float f16213z;

    @Deprecated
    public LocationRequest() {
        this.f16207d = 102;
        this.f16208e = 3600000L;
        this.f16209i = 600000L;
        this.f16210v = false;
        this.f16211w = Long.MAX_VALUE;
        this.f16212y = Integer.MAX_VALUE;
        this.f16213z = 0.0f;
        this.f16205A = 0L;
        this.f16206B = false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f16207d == locationRequest.f16207d && this.f16208e == locationRequest.f16208e && this.f16209i == locationRequest.f16209i && this.f16210v == locationRequest.f16210v && this.f16211w == locationRequest.f16211w && this.f16212y == locationRequest.f16212y && this.f16213z == locationRequest.f16213z && l() == locationRequest.l() && this.f16206B == locationRequest.f16206B) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C2649g.c(Integer.valueOf(this.f16207d), Long.valueOf(this.f16208e), Float.valueOf(this.f16213z), Long.valueOf(this.f16205A));
    }

    public long l() {
        long j7 = this.f16205A;
        long j8 = this.f16208e;
        return j7 < j8 ? j8 : j7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i7 = this.f16207d;
        sb.append(i7 != 100 ? i7 != 102 ? i7 != 104 ? i7 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f16207d != 105) {
            sb.append(" requested=");
            sb.append(this.f16208e);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f16209i);
        sb.append("ms");
        if (this.f16205A > this.f16208e) {
            sb.append(" maxWait=");
            sb.append(this.f16205A);
            sb.append("ms");
        }
        if (this.f16213z > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f16213z);
            sb.append("m");
        }
        long j7 = this.f16211w;
        if (j7 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j7 - jElapsedRealtime);
            sb.append("ms");
        }
        if (this.f16212y != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f16212y);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f16207d);
        C2679b.q(parcel, 2, this.f16208e);
        C2679b.q(parcel, 3, this.f16209i);
        C2679b.c(parcel, 4, this.f16210v);
        C2679b.q(parcel, 5, this.f16211w);
        C2679b.m(parcel, 6, this.f16212y);
        C2679b.j(parcel, 7, this.f16213z);
        C2679b.q(parcel, 8, this.f16205A);
        C2679b.c(parcel, 9, this.f16206B);
        C2679b.b(parcel, iA);
    }

    LocationRequest(int i7, long j7, long j8, boolean z7, long j9, int i8, float f7, long j10, boolean z8) {
        this.f16207d = i7;
        this.f16208e = j7;
        this.f16209i = j8;
        this.f16210v = z7;
        this.f16211w = j9;
        this.f16212y = i8;
        this.f16213z = f7;
        this.f16205A = j10;
        this.f16206B = z8;
    }
}
