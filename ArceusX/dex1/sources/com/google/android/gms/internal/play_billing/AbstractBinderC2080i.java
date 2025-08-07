package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;

public abstract class AbstractBinderC2080i extends BinderC2062f implements InterfaceC2086j {
    public static InterfaceC2086j O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2086j ? (InterfaceC2086j) iInterfaceQueryLocalInterface : new C2074h(iBinder);
    }
}
