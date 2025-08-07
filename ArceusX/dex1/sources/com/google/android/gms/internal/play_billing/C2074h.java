package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class C2074h extends C2056e implements InterfaceC2086j {
    C2074h(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    @Override
    public final void m2(String str, String str2, InterfaceC2098l interfaceC2098l) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        int i7 = C2068g.f16053a;
        parcelE0.writeStrongBinder(interfaceC2098l);
        V0(1, parcelE0);
    }
}
