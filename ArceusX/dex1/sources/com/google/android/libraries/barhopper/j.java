package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

final class j implements Parcelable.Creator<Barcode.PersonName> {
    j() {
    }

    @Override
    public final Barcode.PersonName createFromParcel(Parcel parcel) {
        return new Barcode.PersonName(parcel, null);
    }

    @Override
    public final Barcode.PersonName[] newArray(int i7) {
        return new Barcode.PersonName[i7];
    }
}
