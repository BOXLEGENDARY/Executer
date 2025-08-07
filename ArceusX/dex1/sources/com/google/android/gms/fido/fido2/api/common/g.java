package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;

final class g implements Parcelable.Creator {
    g() {
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        try {
            return TokenBinding.TokenBindingStatus.c(parcel.readString());
        } catch (TokenBinding.a e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public final Object[] newArray(int i7) {
        return new TokenBinding.TokenBindingStatus[i7];
    }
}
