package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class x extends J3.a implements e {
    x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override
    public final Account zzb() throws RemoteException {
        Parcel parcelE0 = E0(2, O0());
        Account account = (Account) J3.c.a(parcelE0, Account.CREATOR);
        parcelE0.recycle();
        return account;
    }
}
