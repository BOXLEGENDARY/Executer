package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

final class a implements Parcelable.Creator<Barcode.Address> {
    a() {
    }

    @Override
    public final Barcode.Address createFromParcel(Parcel parcel) {
        return new Barcode.Address(parcel, null);
    }

    @Override
    public final Barcode.Address[] newArray(int i7) {
        return new Barcode.Address[i7];
    }
}
