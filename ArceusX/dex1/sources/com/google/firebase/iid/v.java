package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

final class v implements Parcelable.Creator<zzf> {
    v() {
    }

    @Override
    public final zzf createFromParcel(Parcel parcel) {
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder != null) {
            return new zzf(strongBinder);
        }
        return null;
    }

    @Override
    public final zzf[] newArray(int i7) {
        return new zzf[i7];
    }
}
