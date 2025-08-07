package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

final class l implements Parcelable.Creator<Barcode.Sms> {
    l() {
    }

    @Override
    public final Barcode.Sms createFromParcel(Parcel parcel) {
        return new Barcode.Sms(parcel, null);
    }

    @Override
    public final Barcode.Sms[] newArray(int i7) {
        return new Barcode.Sms[i7];
    }
}
