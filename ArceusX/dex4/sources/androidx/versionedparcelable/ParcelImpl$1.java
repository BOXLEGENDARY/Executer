package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

class ParcelImpl$1 implements Parcelable.Creator<ParcelImpl> {
    ParcelImpl$1() {
    }

    @Override
    public ParcelImpl createFromParcel(Parcel in) {
        return new ParcelImpl(in);
    }

    @Override
    public ParcelImpl[] newArray(int size) {
        return new ParcelImpl[size];
    }
}
