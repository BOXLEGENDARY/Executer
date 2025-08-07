package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class T extends P implements V {
    T(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override
    public final Bundle P(Bundle bundle) throws RemoteException {
        Parcel parcelE0 = E0();
        S.d(parcelE0, bundle);
        Parcel parcelO0 = O0(1, parcelE0);
        Bundle bundle2 = (Bundle) S.a(parcelO0, Bundle.CREATOR);
        parcelO0.recycle();
        return bundle2;
    }
}
