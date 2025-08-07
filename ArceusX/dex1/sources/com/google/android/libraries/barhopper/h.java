package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

final class h implements Parcelable.Creator<Barcode.FlightSegment> {
    h() {
    }

    @Override
    public final Barcode.FlightSegment createFromParcel(Parcel parcel) {
        return new Barcode.FlightSegment(parcel, null);
    }

    @Override
    public final Barcode.FlightSegment[] newArray(int i7) {
        return new Barcode.FlightSegment[i7];
    }
}
