package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

public abstract class U extends Q implements V {
    public static V O0(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return iInterfaceQueryLocalInterface instanceof V ? (V) iInterfaceQueryLocalInterface : new T(iBinder);
    }
}
