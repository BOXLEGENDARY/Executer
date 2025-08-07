package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class C2038b extends C2056e implements InterfaceC2050d {
    C2038b(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override
    public final Bundle G6(int i7, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeInt(9);
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        C2068g.c(parcelE0, bundle);
        Parcel parcelO0 = O0(902, parcelE0);
        Bundle bundle2 = (Bundle) C2068g.a(parcelO0, Bundle.CREATOR);
        parcelO0.recycle();
        return bundle2;
    }

    @Override
    public final Bundle L4(int i7, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeInt(i7);
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        parcelE0.writeString(str3);
        parcelE0.writeString(null);
        C2068g.c(parcelE0, bundle);
        Parcel parcelO0 = O0(8, parcelE0);
        Bundle bundle2 = (Bundle) C2068g.a(parcelO0, Bundle.CREATOR);
        parcelO0.recycle();
        return bundle2;
    }

    @Override
    public final int M1(int i7, String str, String str2) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeInt(i7);
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        Parcel parcelO0 = O0(1, parcelE0);
        int i8 = parcelO0.readInt();
        parcelO0.recycle();
        return i8;
    }

    @Override
    public final Bundle S1(int i7, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeInt(6);
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        parcelE0.writeString(str3);
        C2068g.c(parcelE0, bundle);
        Parcel parcelO0 = O0(9, parcelE0);
        Bundle bundle2 = (Bundle) C2068g.a(parcelO0, Bundle.CREATOR);
        parcelO0.recycle();
        return bundle2;
    }

    @Override
    public final int U5(int i7, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeInt(i7);
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        C2068g.c(parcelE0, bundle);
        Parcel parcelO0 = O0(10, parcelE0);
        int i8 = parcelO0.readInt();
        parcelO0.recycle();
        return i8;
    }

    @Override
    public final Bundle Z2(int i7, String str, String str2, String str3) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeInt(3);
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        parcelE0.writeString(str3);
        Parcel parcelO0 = O0(4, parcelE0);
        Bundle bundle = (Bundle) C2068g.a(parcelO0, Bundle.CREATOR);
        parcelO0.recycle();
        return bundle;
    }

    @Override
    public final Bundle i3(int i7, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeInt(3);
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        parcelE0.writeString(str3);
        parcelE0.writeString(null);
        Parcel parcelO0 = O0(3, parcelE0);
        Bundle bundle = (Bundle) C2068g.a(parcelO0, Bundle.CREATOR);
        parcelO0.recycle();
        return bundle;
    }

    @Override
    public final Bundle i6(int i7, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeInt(i7);
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        parcelE0.writeString(str3);
        C2068g.c(parcelE0, bundle);
        Parcel parcelO0 = O0(11, parcelE0);
        Bundle bundle2 = (Bundle) C2068g.a(parcelO0, Bundle.CREATOR);
        parcelO0.recycle();
        return bundle2;
    }

    @Override
    public final Bundle l1(int i7, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeInt(i7);
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        C2068g.c(parcelE0, bundle);
        C2068g.c(parcelE0, bundle2);
        Parcel parcelO0 = O0(901, parcelE0);
        Bundle bundle3 = (Bundle) C2068g.a(parcelO0, Bundle.CREATOR);
        parcelO0.recycle();
        return bundle3;
    }

    @Override
    public final int t1(int i7, String str, String str2) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeInt(3);
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        Parcel parcelO0 = O0(5, parcelE0);
        int i8 = parcelO0.readInt();
        parcelO0.recycle();
        return i8;
    }

    @Override
    public final Bundle z1(int i7, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeInt(9);
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        C2068g.c(parcelE0, bundle);
        Parcel parcelO0 = O0(12, parcelE0);
        Bundle bundle2 = (Bundle) C2068g.a(parcelO0, Bundle.CREATOR);
        parcelO0.recycle();
        return bundle2;
    }
}
