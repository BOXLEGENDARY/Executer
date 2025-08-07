package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import y3.InterfaceC3023a;

public abstract class AbstractBinderC1874g0 extends Q implements InterfaceC1882h0 {
    public AbstractBinderC1874g0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC1882h0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1882h0 ? (InterfaceC1882h0) iInterfaceQueryLocalInterface : new C1866f0(iBinder);
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        InterfaceC1906k0 c1890i0;
        InterfaceC1906k0 c1890i02 = null;
        InterfaceC1906k0 c1890i03 = null;
        InterfaceC1906k0 c1890i04 = null;
        InterfaceC1922m0 c1914l0 = null;
        InterfaceC1922m0 c1914l02 = null;
        InterfaceC1922m0 c1914l03 = null;
        InterfaceC1906k0 c1890i05 = null;
        InterfaceC1906k0 c1890i06 = null;
        InterfaceC1906k0 c1890i07 = null;
        InterfaceC1906k0 c1890i08 = null;
        InterfaceC1906k0 c1890i09 = null;
        InterfaceC1906k0 c1890i010 = null;
        InterfaceC1938o0 c1930n0 = null;
        InterfaceC1906k0 c1890i011 = null;
        InterfaceC1906k0 c1890i012 = null;
        InterfaceC1906k0 c1890i013 = null;
        InterfaceC1906k0 c1890i014 = null;
        switch (i7) {
            case 1:
                initialize(InterfaceC3023a.AbstractBinderC0238a.O0(parcel.readStrongBinder()), (zzcl) S.a(parcel, zzcl.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) S.a(parcel, Bundle.CREATOR), S.f(parcel), S.f(parcel), parcel.readLong());
                break;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) S.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c1890i0 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1890i0 = iInterfaceQueryLocalInterface instanceof InterfaceC1906k0 ? (InterfaceC1906k0) iInterfaceQueryLocalInterface : new C1890i0(strongBinder);
                }
                logEventAndBundle(string, string2, bundle, c1890i0, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), InterfaceC3023a.AbstractBinderC0238a.O0(parcel.readStrongBinder()), S.f(parcel), parcel.readLong());
                break;
            case 5:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean zF = S.f(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1890i02 = iInterfaceQueryLocalInterface2 instanceof InterfaceC1906k0 ? (InterfaceC1906k0) iInterfaceQueryLocalInterface2 : new C1890i0(strongBinder2);
                }
                getUserProperties(string3, string4, zF, c1890i02);
                break;
            case 6:
                String string5 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1890i014 = iInterfaceQueryLocalInterface3 instanceof InterfaceC1906k0 ? (InterfaceC1906k0) iInterfaceQueryLocalInterface3 : new C1890i0(strongBinder3);
                }
                getMaxUserProperties(string5, c1890i014);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) S.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) S.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1890i013 = iInterfaceQueryLocalInterface4 instanceof InterfaceC1906k0 ? (InterfaceC1906k0) iInterfaceQueryLocalInterface4 : new C1890i0(strongBinder4);
                }
                getConditionalUserProperties(string6, string7, c1890i013);
                break;
            case 11:
                setMeasurementEnabled(S.f(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(InterfaceC3023a.AbstractBinderC0238a.O0(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1890i012 = iInterfaceQueryLocalInterface5 instanceof InterfaceC1906k0 ? (InterfaceC1906k0) iInterfaceQueryLocalInterface5 : new C1890i0(strongBinder5);
                }
                getCurrentScreenName(c1890i012);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1890i011 = iInterfaceQueryLocalInterface6 instanceof InterfaceC1906k0 ? (InterfaceC1906k0) iInterfaceQueryLocalInterface6 : new C1890i0(strongBinder6);
                }
                getCurrentScreenClass(c1890i011);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    c1930n0 = iInterfaceQueryLocalInterface7 instanceof InterfaceC1938o0 ? (InterfaceC1938o0) iInterfaceQueryLocalInterface7 : new C1930n0(strongBinder7);
                }
                setInstanceIdProvider(c1930n0);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1890i010 = iInterfaceQueryLocalInterface8 instanceof InterfaceC1906k0 ? (InterfaceC1906k0) iInterfaceQueryLocalInterface8 : new C1890i0(strongBinder8);
                }
                getCachedAppInstanceId(c1890i010);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1890i09 = iInterfaceQueryLocalInterface9 instanceof InterfaceC1906k0 ? (InterfaceC1906k0) iInterfaceQueryLocalInterface9 : new C1890i0(strongBinder9);
                }
                getAppInstanceId(c1890i09);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1890i08 = iInterfaceQueryLocalInterface10 instanceof InterfaceC1906k0 ? (InterfaceC1906k0) iInterfaceQueryLocalInterface10 : new C1890i0(strongBinder10);
                }
                getGmpAppId(c1890i08);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1890i07 = iInterfaceQueryLocalInterface11 instanceof InterfaceC1906k0 ? (InterfaceC1906k0) iInterfaceQueryLocalInterface11 : new C1890i0(strongBinder11);
                }
                generateEventId(c1890i07);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(InterfaceC3023a.AbstractBinderC0238a.O0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(InterfaceC3023a.AbstractBinderC0238a.O0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(InterfaceC3023a.AbstractBinderC0238a.O0(parcel.readStrongBinder()), (Bundle) S.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(InterfaceC3023a.AbstractBinderC0238a.O0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(InterfaceC3023a.AbstractBinderC0238a.O0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(InterfaceC3023a.AbstractBinderC0238a.O0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                InterfaceC3023a interfaceC3023aO0 = InterfaceC3023a.AbstractBinderC0238a.O0(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1890i06 = iInterfaceQueryLocalInterface12 instanceof InterfaceC1906k0 ? (InterfaceC1906k0) iInterfaceQueryLocalInterface12 : new C1890i0(strongBinder12);
                }
                onActivitySaveInstanceState(interfaceC3023aO0, c1890i06, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) S.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1890i05 = iInterfaceQueryLocalInterface13 instanceof InterfaceC1906k0 ? (InterfaceC1906k0) iInterfaceQueryLocalInterface13 : new C1890i0(strongBinder13);
                }
                performAction(bundle2, c1890i05, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), InterfaceC3023a.AbstractBinderC0238a.O0(parcel.readStrongBinder()), InterfaceC3023a.AbstractBinderC0238a.O0(parcel.readStrongBinder()), InterfaceC3023a.AbstractBinderC0238a.O0(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c1914l03 = iInterfaceQueryLocalInterface14 instanceof InterfaceC1922m0 ? (InterfaceC1922m0) iInterfaceQueryLocalInterface14 : new C1914l0(strongBinder14);
                }
                setEventInterceptor(c1914l03);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c1914l02 = iInterfaceQueryLocalInterface15 instanceof InterfaceC1922m0 ? (InterfaceC1922m0) iInterfaceQueryLocalInterface15 : new C1914l0(strongBinder15);
                }
                registerOnMeasurementEventListener(c1914l02);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c1914l0 = iInterfaceQueryLocalInterface16 instanceof InterfaceC1922m0 ? (InterfaceC1922m0) iInterfaceQueryLocalInterface16 : new C1914l0(strongBinder16);
                }
                unregisterOnMeasurementEventListener(c1914l0);
                break;
            case 37:
                initForTests(S.b(parcel));
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1890i04 = iInterfaceQueryLocalInterface17 instanceof InterfaceC1906k0 ? (InterfaceC1906k0) iInterfaceQueryLocalInterface17 : new C1890i0(strongBinder17);
                }
                getTestFlag(c1890i04, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(S.f(parcel));
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c1890i03 = iInterfaceQueryLocalInterface18 instanceof InterfaceC1906k0 ? (InterfaceC1906k0) iInterfaceQueryLocalInterface18 : new C1890i0(strongBinder18);
                }
                isDataCollectionEnabled(c1890i03);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) S.a(parcel, Bundle.CREATOR));
                break;
            case 43:
                clearMeasurementEnabled(parcel.readLong());
                break;
            case 44:
                setConsent((Bundle) S.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 45:
                setConsentThirdParty((Bundle) S.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
