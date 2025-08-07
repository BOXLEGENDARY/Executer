package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

final class g implements Parcelable.Creator<Barcode.Email> {
    g() {
    }

    @Override
    public final Barcode.Email createFromParcel(Parcel parcel) {
        return new Barcode.Email(parcel, null);
    }

    @Override
    public final Barcode.Email[] newArray(int i7) {
        return new Barcode.Email[i7];
    }
}
