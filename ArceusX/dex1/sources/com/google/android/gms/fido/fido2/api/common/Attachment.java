package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;

public enum Attachment implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<Attachment> CREATOR = new Parcelable.Creator() {
        @Override
        public final Object createFromParcel(Parcel parcel) {
            try {
                return Attachment.c(parcel.readString());
            } catch (Attachment.a e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override
        public final Object[] newArray(int i7) {
            return new Attachment[i7];
        }
    };

    private final String f14453d;

    public static class a extends Exception {
        public a(String str) {
            super(String.format("Attachment %s not supported", str));
        }
    }

    Attachment(String str) {
        this.f14453d = str;
    }

    public static Attachment c(String str) throws a {
        for (Attachment attachment : values()) {
            if (str.equals(attachment.f14453d)) {
                return attachment;
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
        return this.f14453d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f14453d);
    }
}
