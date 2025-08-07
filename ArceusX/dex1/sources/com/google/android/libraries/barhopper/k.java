package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

final class k implements Parcelable.Creator<Barcode.Phone> {
    k() {
    }

    @Override
    public final Barcode.Phone createFromParcel(Parcel parcel) {
        return new Barcode.Phone(parcel, null);
    }

    @Override
    public final Barcode.Phone[] newArray(int i7) {
        return new Barcode.Phone[i7];
    }
}
