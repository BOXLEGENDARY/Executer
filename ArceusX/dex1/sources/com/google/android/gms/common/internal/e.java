package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

public interface e extends IInterface {

    public static abstract class a extends J3.b implements e {
        public static e O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new x(iBinder);
        }
    }

    Account zzb() throws RemoteException;
}
