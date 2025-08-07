package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;

public enum AttestationConveyancePreference implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");

    public static final Parcelable.Creator<AttestationConveyancePreference> CREATOR = new Parcelable.Creator() {
        @Override
        public final Object createFromParcel(Parcel parcel) {
            try {
                return AttestationConveyancePreference.c(parcel.readString());
            } catch (AttestationConveyancePreference.a e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override
        public final Object[] newArray(int i7) {
            return new AttestationConveyancePreference[i7];
        }
    };

    private final String f14458d;

    public static class a extends Exception {
        public a(String str) {
            super(String.format("Attestation conveyance preference %s not supported", str));
        }
    }

    AttestationConveyancePreference(String str) {
        this.f14458d = str;
    }

    public static AttestationConveyancePreference c(String str) throws a {
        for (AttestationConveyancePreference attestationConveyancePreference : values()) {
            if (str.equals(attestationConveyancePreference.f14458d)) {
                return attestationConveyancePreference;
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
        return this.f14458d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f14458d);
    }
}
