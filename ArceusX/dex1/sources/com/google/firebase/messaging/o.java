package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class o implements Parcelable.Creator<RemoteMessage> {
    @Override
    public final RemoteMessage createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            if (C2678a.m(iT) != 2) {
                C2678a.B(parcel, iT);
            } else {
                bundleA = C2678a.a(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new RemoteMessage(bundleA);
    }

    @Override
    public final RemoteMessage[] newArray(int i7) {
        return new RemoteMessage[i7];
    }
}
