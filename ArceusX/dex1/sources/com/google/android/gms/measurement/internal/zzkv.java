package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2651i;

public final class zzkv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkv> CREATOR = new f4();

    public final int f17146d;

    public final String f17147e;

    public final long f17148i;

    public final Long f17149v;

    public final String f17150w;

    public final String f17151y;

    public final Double f17152z;

    zzkv(int i7, String str, long j7, Long l7, Float f7, String str2, String str3, Double d7) {
        this.f17146d = i7;
        this.f17147e = str;
        this.f17148i = j7;
        this.f17149v = l7;
        if (i7 == 1) {
            this.f17152z = f7 != null ? Double.valueOf(f7.doubleValue()) : null;
        } else {
            this.f17152z = d7;
        }
        this.f17150w = str2;
        this.f17151y = str3;
    }

    public final Object l() {
        Long l7 = this.f17149v;
        if (l7 != null) {
            return l7;
        }
        Double d7 = this.f17152z;
        if (d7 != null) {
            return d7;
        }
        String str = this.f17150w;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        f4.a(this, parcel, i7);
    }

    zzkv(g4 g4Var) {
        this(g4Var.f16809c, g4Var.f16810d, g4Var.f16811e, g4Var.f16808b);
    }

    zzkv(String str, long j7, Object obj, String str2) {
        C2651i.f(str);
        this.f17146d = 2;
        this.f17147e = str;
        this.f17148i = j7;
        this.f17151y = str2;
        if (obj == null) {
            this.f17149v = null;
            this.f17152z = null;
            this.f17150w = null;
            return;
        }
        if (obj instanceof Long) {
            this.f17149v = (Long) obj;
            this.f17152z = null;
            this.f17150w = null;
        } else if (obj instanceof String) {
            this.f17149v = null;
            this.f17152z = null;
            this.f17150w = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f17149v = null;
                this.f17152z = (Double) obj;
                this.f17150w = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
