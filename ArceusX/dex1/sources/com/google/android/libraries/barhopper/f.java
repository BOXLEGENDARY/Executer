package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

final class f implements Parcelable.Creator<Barcode.DriverLicense> {
    f() {
    }

    @Override
    public final Barcode.DriverLicense createFromParcel(Parcel parcel) {
        return new Barcode.DriverLicense(parcel, null);
    }

    @Override
    public final Barcode.DriverLicense[] newArray(int i7) {
        return new Barcode.DriverLicense[i7];
    }
}
