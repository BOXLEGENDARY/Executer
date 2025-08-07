package com.google.android.gms.internal.play_billing;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

public final class C2068g {

    public static final int f16053a = 0;

    static {
        C2068g.class.getClassLoader();
    }

    private C2068g() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
