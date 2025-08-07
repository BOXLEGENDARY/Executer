package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

final class e implements Parcelable.Creator<Barcode.ContactInfo> {
    e() {
    }

    @Override
    public final Barcode.ContactInfo createFromParcel(Parcel parcel) {
        return new Barcode.ContactInfo(parcel, null);
    }

    @Override
    public final Barcode.ContactInfo[] newArray(int i7) {
        return new Barcode.ContactInfo[i7];
    }
}
