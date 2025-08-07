package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public final class Z0 extends com.google.android.gms.internal.measurement.P implements W3.d {
    Z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override
    public final void I1(zzp zzpVar) throws RemoteException {
        Parcel parcelE0 = E0();
        com.google.android.gms.internal.measurement.S.d(parcelE0, zzpVar);
        V0(18, parcelE0);
    }

    @Override
    public final void I5(zzkv zzkvVar, zzp zzpVar) throws RemoteException {
        Parcel parcelE0 = E0();
        com.google.android.gms.internal.measurement.S.d(parcelE0, zzkvVar);
        com.google.android.gms.internal.measurement.S.d(parcelE0, zzpVar);
        V0(2, parcelE0);
    }

    @Override
    public final byte[] N2(zzat zzatVar, String str) throws RemoteException {
        Parcel parcelE0 = E0();
        com.google.android.gms.internal.measurement.S.d(parcelE0, zzatVar);
        parcelE0.writeString(str);
        Parcel parcelO0 = O0(9, parcelE0);
        byte[] bArrCreateByteArray = parcelO0.createByteArray();
        parcelO0.recycle();
        return bArrCreateByteArray;
    }

    @Override
    public final String U1(zzp zzpVar) throws RemoteException {
        Parcel parcelE0 = E0();
        com.google.android.gms.internal.measurement.S.d(parcelE0, zzpVar);
        Parcel parcelO0 = O0(11, parcelE0);
        String string = parcelO0.readString();
        parcelO0.recycle();
        return string;
    }

    @Override
    public final void U3(zzat zzatVar, zzp zzpVar) throws RemoteException {
        Parcel parcelE0 = E0();
        com.google.android.gms.internal.measurement.S.d(parcelE0, zzatVar);
        com.google.android.gms.internal.measurement.S.d(parcelE0, zzpVar);
        V0(1, parcelE0);
    }

    @Override
    public final void a3(zzp zzpVar) throws RemoteException {
        Parcel parcelE0 = E0();
        com.google.android.gms.internal.measurement.S.d(parcelE0, zzpVar);
        V0(4, parcelE0);
    }

    @Override
    public final List<zzab> c3(String str, String str2, zzp zzpVar) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        com.google.android.gms.internal.measurement.S.d(parcelE0, zzpVar);
        Parcel parcelO0 = O0(16, parcelE0);
        ArrayList arrayListCreateTypedArrayList = parcelO0.createTypedArrayList(zzab.CREATOR);
        parcelO0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override
    public final void f4(zzp zzpVar) throws RemoteException {
        Parcel parcelE0 = E0();
        com.google.android.gms.internal.measurement.S.d(parcelE0, zzpVar);
        V0(20, parcelE0);
    }

    @Override
    public final void h1(Bundle bundle, zzp zzpVar) throws RemoteException {
        Parcel parcelE0 = E0();
        com.google.android.gms.internal.measurement.S.d(parcelE0, bundle);
        com.google.android.gms.internal.measurement.S.d(parcelE0, zzpVar);
        V0(19, parcelE0);
    }

    @Override
    public final void j4(long j7, String str, String str2, String str3) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeLong(j7);
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        parcelE0.writeString(str3);
        V0(10, parcelE0);
    }

    @Override
    public final void q1(zzab zzabVar, zzp zzpVar) throws RemoteException {
        Parcel parcelE0 = E0();
        com.google.android.gms.internal.measurement.S.d(parcelE0, zzabVar);
        com.google.android.gms.internal.measurement.S.d(parcelE0, zzpVar);
        V0(12, parcelE0);
    }

    @Override
    public final void r3(zzp zzpVar) throws RemoteException {
        Parcel parcelE0 = E0();
        com.google.android.gms.internal.measurement.S.d(parcelE0, zzpVar);
        V0(6, parcelE0);
    }

    @Override
    public final List<zzkv> r4(String str, String str2, boolean z7, zzp zzpVar) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        com.google.android.gms.internal.measurement.S.c(parcelE0, z7);
        com.google.android.gms.internal.measurement.S.d(parcelE0, zzpVar);
        Parcel parcelO0 = O0(14, parcelE0);
        ArrayList arrayListCreateTypedArrayList = parcelO0.createTypedArrayList(zzkv.CREATOR);
        parcelO0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override
    public final List<zzkv> y1(String str, String str2, String str3, boolean z7) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(null);
        parcelE0.writeString(str2);
        parcelE0.writeString(str3);
        com.google.android.gms.internal.measurement.S.c(parcelE0, z7);
        Parcel parcelO0 = O0(15, parcelE0);
        ArrayList arrayListCreateTypedArrayList = parcelO0.createTypedArrayList(zzkv.CREATOR);
        parcelO0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override
    public final List<zzab> z2(String str, String str2, String str3) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(null);
        parcelE0.writeString(str2);
        parcelE0.writeString(str3);
        Parcel parcelO0 = O0(17, parcelE0);
        ArrayList arrayListCreateTypedArrayList = parcelO0.createTypedArrayList(zzab.CREATOR);
        parcelO0.recycle();
        return arrayListCreateTypedArrayList;
    }
}
