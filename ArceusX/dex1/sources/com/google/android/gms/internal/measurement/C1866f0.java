package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import y3.InterfaceC3023a;

public final class C1866f0 extends P implements InterfaceC1882h0 {
    C1866f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override
    public final void beginAdUnitExposure(String str, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(str);
        parcelE0.writeLong(j7);
        V0(23, parcelE0);
    }

    @Override
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        S.d(parcelE0, bundle);
        V0(9, parcelE0);
    }

    @Override
    public final void endAdUnitExposure(String str, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(str);
        parcelE0.writeLong(j7);
        V0(24, parcelE0);
    }

    @Override
    public final void generateEventId(InterfaceC1906k0 interfaceC1906k0) throws RemoteException {
        Parcel parcelE0 = E0();
        S.e(parcelE0, interfaceC1906k0);
        V0(22, parcelE0);
    }

    @Override
    public final void getCachedAppInstanceId(InterfaceC1906k0 interfaceC1906k0) throws RemoteException {
        Parcel parcelE0 = E0();
        S.e(parcelE0, interfaceC1906k0);
        V0(19, parcelE0);
    }

    @Override
    public final void getConditionalUserProperties(String str, String str2, InterfaceC1906k0 interfaceC1906k0) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        S.e(parcelE0, interfaceC1906k0);
        V0(10, parcelE0);
    }

    @Override
    public final void getCurrentScreenClass(InterfaceC1906k0 interfaceC1906k0) throws RemoteException {
        Parcel parcelE0 = E0();
        S.e(parcelE0, interfaceC1906k0);
        V0(17, parcelE0);
    }

    @Override
    public final void getCurrentScreenName(InterfaceC1906k0 interfaceC1906k0) throws RemoteException {
        Parcel parcelE0 = E0();
        S.e(parcelE0, interfaceC1906k0);
        V0(16, parcelE0);
    }

    @Override
    public final void getGmpAppId(InterfaceC1906k0 interfaceC1906k0) throws RemoteException {
        Parcel parcelE0 = E0();
        S.e(parcelE0, interfaceC1906k0);
        V0(21, parcelE0);
    }

    @Override
    public final void getMaxUserProperties(String str, InterfaceC1906k0 interfaceC1906k0) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(str);
        S.e(parcelE0, interfaceC1906k0);
        V0(6, parcelE0);
    }

    @Override
    public final void getUserProperties(String str, String str2, boolean z7, InterfaceC1906k0 interfaceC1906k0) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        S.c(parcelE0, z7);
        S.e(parcelE0, interfaceC1906k0);
        V0(5, parcelE0);
    }

    @Override
    public final void initialize(InterfaceC3023a interfaceC3023a, zzcl zzclVar, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        S.e(parcelE0, interfaceC3023a);
        S.d(parcelE0, zzclVar);
        parcelE0.writeLong(j7);
        V0(1, parcelE0);
    }

    @Override
    public final void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        S.d(parcelE0, bundle);
        S.c(parcelE0, z7);
        S.c(parcelE0, z8);
        parcelE0.writeLong(j7);
        V0(2, parcelE0);
    }

    @Override
    public final void logHealthData(int i7, String str, InterfaceC3023a interfaceC3023a, InterfaceC3023a interfaceC3023a2, InterfaceC3023a interfaceC3023a3) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeInt(5);
        parcelE0.writeString(str);
        S.e(parcelE0, interfaceC3023a);
        S.e(parcelE0, interfaceC3023a2);
        S.e(parcelE0, interfaceC3023a3);
        V0(33, parcelE0);
    }

    @Override
    public final void onActivityCreated(InterfaceC3023a interfaceC3023a, Bundle bundle, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        S.e(parcelE0, interfaceC3023a);
        S.d(parcelE0, bundle);
        parcelE0.writeLong(j7);
        V0(27, parcelE0);
    }

    @Override
    public final void onActivityDestroyed(InterfaceC3023a interfaceC3023a, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        S.e(parcelE0, interfaceC3023a);
        parcelE0.writeLong(j7);
        V0(28, parcelE0);
    }

    @Override
    public final void onActivityPaused(InterfaceC3023a interfaceC3023a, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        S.e(parcelE0, interfaceC3023a);
        parcelE0.writeLong(j7);
        V0(29, parcelE0);
    }

    @Override
    public final void onActivityResumed(InterfaceC3023a interfaceC3023a, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        S.e(parcelE0, interfaceC3023a);
        parcelE0.writeLong(j7);
        V0(30, parcelE0);
    }

    @Override
    public final void onActivitySaveInstanceState(InterfaceC3023a interfaceC3023a, InterfaceC1906k0 interfaceC1906k0, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        S.e(parcelE0, interfaceC3023a);
        S.e(parcelE0, interfaceC1906k0);
        parcelE0.writeLong(j7);
        V0(31, parcelE0);
    }

    @Override
    public final void onActivityStarted(InterfaceC3023a interfaceC3023a, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        S.e(parcelE0, interfaceC3023a);
        parcelE0.writeLong(j7);
        V0(25, parcelE0);
    }

    @Override
    public final void onActivityStopped(InterfaceC3023a interfaceC3023a, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        S.e(parcelE0, interfaceC3023a);
        parcelE0.writeLong(j7);
        V0(26, parcelE0);
    }

    @Override
    public final void performAction(Bundle bundle, InterfaceC1906k0 interfaceC1906k0, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        S.d(parcelE0, bundle);
        S.e(parcelE0, interfaceC1906k0);
        parcelE0.writeLong(j7);
        V0(32, parcelE0);
    }

    @Override
    public final void setConditionalUserProperty(Bundle bundle, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        S.d(parcelE0, bundle);
        parcelE0.writeLong(j7);
        V0(8, parcelE0);
    }

    @Override
    public final void setConsent(Bundle bundle, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        S.d(parcelE0, bundle);
        parcelE0.writeLong(j7);
        V0(44, parcelE0);
    }

    @Override
    public final void setCurrentScreen(InterfaceC3023a interfaceC3023a, String str, String str2, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        S.e(parcelE0, interfaceC3023a);
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        parcelE0.writeLong(j7);
        V0(15, parcelE0);
    }

    @Override
    public final void setDataCollectionEnabled(boolean z7) throws RemoteException {
        Parcel parcelE0 = E0();
        S.c(parcelE0, z7);
        V0(39, parcelE0);
    }

    @Override
    public final void setUserProperty(String str, String str2, InterfaceC3023a interfaceC3023a, boolean z7, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        S.e(parcelE0, interfaceC3023a);
        S.c(parcelE0, z7);
        parcelE0.writeLong(j7);
        V0(4, parcelE0);
    }
}
