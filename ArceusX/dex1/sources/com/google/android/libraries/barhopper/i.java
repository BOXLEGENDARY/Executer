package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

final class i implements Parcelable.Creator<Barcode.GeoPoint> {
    i() {
    }

    @Override
    public final Barcode.GeoPoint createFromParcel(Parcel parcel) {
        return new Barcode.GeoPoint(parcel, null);
    }

    @Override
    public final Barcode.GeoPoint[] newArray(int i7) {
        return new Barcode.GeoPoint[i7];
    }
}
