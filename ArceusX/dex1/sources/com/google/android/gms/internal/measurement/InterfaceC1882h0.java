package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;
import y3.InterfaceC3023a;

public interface InterfaceC1882h0 extends IInterface {
    void beginAdUnitExposure(String str, long j7) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j7) throws RemoteException;

    void endAdUnitExposure(String str, long j7) throws RemoteException;

    void generateEventId(InterfaceC1906k0 interfaceC1906k0) throws RemoteException;

    void getAppInstanceId(InterfaceC1906k0 interfaceC1906k0) throws RemoteException;

    void getCachedAppInstanceId(InterfaceC1906k0 interfaceC1906k0) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, InterfaceC1906k0 interfaceC1906k0) throws RemoteException;

    void getCurrentScreenClass(InterfaceC1906k0 interfaceC1906k0) throws RemoteException;

    void getCurrentScreenName(InterfaceC1906k0 interfaceC1906k0) throws RemoteException;

    void getGmpAppId(InterfaceC1906k0 interfaceC1906k0) throws RemoteException;

    void getMaxUserProperties(String str, InterfaceC1906k0 interfaceC1906k0) throws RemoteException;

    void getTestFlag(InterfaceC1906k0 interfaceC1906k0, int i7) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z7, InterfaceC1906k0 interfaceC1906k0) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(InterfaceC3023a interfaceC3023a, zzcl zzclVar, long j7) throws RemoteException;

    void isDataCollectionEnabled(InterfaceC1906k0 interfaceC1906k0) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC1906k0 interfaceC1906k0, long j7) throws RemoteException;

    void logHealthData(int i7, String str, InterfaceC3023a interfaceC3023a, InterfaceC3023a interfaceC3023a2, InterfaceC3023a interfaceC3023a3) throws RemoteException;

    void onActivityCreated(InterfaceC3023a interfaceC3023a, Bundle bundle, long j7) throws RemoteException;

    void onActivityDestroyed(InterfaceC3023a interfaceC3023a, long j7) throws RemoteException;

    void onActivityPaused(InterfaceC3023a interfaceC3023a, long j7) throws RemoteException;

    void onActivityResumed(InterfaceC3023a interfaceC3023a, long j7) throws RemoteException;

    void onActivitySaveInstanceState(InterfaceC3023a interfaceC3023a, InterfaceC1906k0 interfaceC1906k0, long j7) throws RemoteException;

    void onActivityStarted(InterfaceC3023a interfaceC3023a, long j7) throws RemoteException;

    void onActivityStopped(InterfaceC3023a interfaceC3023a, long j7) throws RemoteException;

    void performAction(Bundle bundle, InterfaceC1906k0 interfaceC1906k0, long j7) throws RemoteException;

    void registerOnMeasurementEventListener(InterfaceC1922m0 interfaceC1922m0) throws RemoteException;

    void resetAnalyticsData(long j7) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j7) throws RemoteException;

    void setConsent(Bundle bundle, long j7) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j7) throws RemoteException;

    void setCurrentScreen(InterfaceC3023a interfaceC3023a, String str, String str2, long j7) throws RemoteException;

    void setDataCollectionEnabled(boolean z7) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(InterfaceC1922m0 interfaceC1922m0) throws RemoteException;

    void setInstanceIdProvider(InterfaceC1938o0 interfaceC1938o0) throws RemoteException;

    void setMeasurementEnabled(boolean z7, long j7) throws RemoteException;

    void setMinimumSessionDuration(long j7) throws RemoteException;

    void setSessionTimeoutDuration(long j7) throws RemoteException;

    void setUserId(String str, long j7) throws RemoteException;

    void setUserProperty(String str, String str2, InterfaceC3023a interfaceC3023a, boolean z7, long j7) throws RemoteException;

    void unregisterOnMeasurementEventListener(InterfaceC1922m0 interfaceC1922m0) throws RemoteException;
}
