package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

final class d implements Parcelable.Creator<Barcode.CalendarEvent> {
    d() {
    }

    @Override
    public final Barcode.CalendarEvent createFromParcel(Parcel parcel) {
        return new Barcode.CalendarEvent(parcel, null);
    }

    @Override
    public final Barcode.CalendarEvent[] newArray(int i7) {
        return new Barcode.CalendarEvent[i7];
    }
}
