package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

final class m implements Parcelable.Creator<Barcode.UrlBookmark> {
    m() {
    }

    @Override
    public final Barcode.UrlBookmark createFromParcel(Parcel parcel) {
        return new Barcode.UrlBookmark(parcel, null);
    }

    @Override
    public final Barcode.UrlBookmark[] newArray(int i7) {
        return new Barcode.UrlBookmark[i7];
    }
}
