package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;

public enum ResidentKeyRequirement implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<ResidentKeyRequirement> CREATOR = new Parcelable.Creator() {
        @Override
        public final Object createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            if (string == null) {
                string = BuildConfig.FLAVOR;
            }
            try {
                return ResidentKeyRequirement.c(string);
            } catch (ResidentKeyRequirement.a e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override
        public final Object[] newArray(int i7) {
            return new ResidentKeyRequirement[i7];
        }
    };

    private final String f14570d;

    public static class a extends Exception {
        public a(String str) {
            super(String.format("Resident key requirement %s not supported", str));
        }
    }

    ResidentKeyRequirement(String str) {
        this.f14570d = str;
    }

    public static ResidentKeyRequirement c(String str) throws a {
        for (ResidentKeyRequirement residentKeyRequirement : values()) {
            if (str.equals(residentKeyRequirement.f14570d)) {
                return residentKeyRequirement;
            }
        }
        throw new a(str);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        return this.f14570d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f14570d);
    }
}
