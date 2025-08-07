package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

final class c implements Parcelable.Creator<Barcode.CalendarDateTime> {
    c() {
    }

    @Override
    public final Barcode.CalendarDateTime createFromParcel(Parcel parcel) {
        return new Barcode.CalendarDateTime(parcel, null);
    }

    @Override
    public final Barcode.CalendarDateTime[] newArray(int i7) {
        return new Barcode.CalendarDateTime[i7];
    }
}
