package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

final class b implements Parcelable.Creator<Barcode.BoardingPass> {
    b() {
    }

    @Override
    public final Barcode.BoardingPass createFromParcel(Parcel parcel) {
        return new Barcode.BoardingPass(parcel, null);
    }

    @Override
    public final Barcode.BoardingPass[] newArray(int i7) {
        return new Barcode.BoardingPass[i7];
    }
}
