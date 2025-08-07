package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;

final class s implements Parcelable.Creator {
    s() {
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        try {
            return COSEAlgorithmIdentifier.a(parcel.readInt());
        } catch (COSEAlgorithmIdentifier.a e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public final Object[] newArray(int i7) {
        return new COSEAlgorithmIdentifier[i7];
    }
}
