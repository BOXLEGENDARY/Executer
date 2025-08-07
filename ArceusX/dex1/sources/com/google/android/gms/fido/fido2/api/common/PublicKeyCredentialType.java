package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;

public enum PublicKeyCredentialType implements Parcelable {
    PUBLIC_KEY("public-key");

    public static final Parcelable.Creator<PublicKeyCredentialType> CREATOR = new Parcelable.Creator() {
        @Override
        public final Object createFromParcel(Parcel parcel) {
            try {
                return PublicKeyCredentialType.c(parcel.readString());
            } catch (PublicKeyCredentialType.a e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override
        public final Object[] newArray(int i7) {
            return new PublicKeyCredentialType[i7];
        }
    };

    private final String f14561d = "public-key";

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    PublicKeyCredentialType(String str) {
    }

    public static PublicKeyCredentialType c(String str) throws a {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            if (str.equals(publicKeyCredentialType.f14561d)) {
                return publicKeyCredentialType;
            }
        }
        throw new a(String.format("PublicKeyCredentialType %s not supported", str));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        return this.f14561d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f14561d);
    }
}
