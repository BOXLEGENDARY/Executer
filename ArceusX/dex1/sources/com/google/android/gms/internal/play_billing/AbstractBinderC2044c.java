package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;

public abstract class AbstractBinderC2044c extends BinderC2062f implements InterfaceC2050d {
    public static InterfaceC2050d O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2050d ? (InterfaceC2050d) iInterfaceQueryLocalInterface : new C2038b(iBinder);
    }
}
