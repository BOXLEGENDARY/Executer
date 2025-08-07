package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import w7.Jld.EZYiRMRTxKdo;

public enum zzay implements Parcelable {
    USER_VERIFICATION_REQUIRED(EZYiRMRTxKdo.gUFqWfaHKVCRqX),
    f14590i("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<zzay> CREATOR = new Parcelable.Creator() {
        @Override
        public final Object createFromParcel(Parcel parcel) {
            try {
                return zzay.c(parcel.readString());
            } catch (C3.n e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override
        public final Object[] newArray(int i7) {
            return new zzay[i7];
        }
    };

    private final String f14593d;

    zzay(String str) {
        this.f14593d = str;
    }

    public static zzay c(String str) throws C3.n {
        for (zzay zzayVar : values()) {
            if (str.equals(zzayVar.f14593d)) {
                return zzayVar;
            }
        }
        throw new C3.n(str);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f14593d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f14593d);
    }
}
