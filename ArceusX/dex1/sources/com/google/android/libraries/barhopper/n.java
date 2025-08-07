package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

final class n implements Parcelable.Creator<Barcode.WiFi> {
    n() {
    }

    @Override
    public final Barcode.WiFi createFromParcel(Parcel parcel) {
        return new Barcode.WiFi(parcel, null);
    }

    @Override
    public final Barcode.WiFi[] newArray(int i7) {
        return new Barcode.WiFi[i7];
    }
}
