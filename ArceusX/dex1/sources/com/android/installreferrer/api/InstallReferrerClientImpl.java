package com.android.installreferrer.api;

import E2.a;
import U.Gw.oeVkjmfPcLbWm;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import ka.oik.UJEa;
import ya.HnSi.PLHvHoayk;

class InstallReferrerClientImpl extends InstallReferrerClient {

    private int f13574a = 0;

    private final Context f13575b;

    private E2.a f13576c;

    private ServiceConnection f13577d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    private final class b implements ServiceConnection {

        private final InstallReferrerStateListener f13578d;

        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
            InstallReferrerClientImpl.this.f13576c = a.AbstractBinderC0012a.E0(iBinder);
            InstallReferrerClientImpl.this.f13574a = 2;
            this.f13578d.onInstallReferrerSetupFinished(0);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn(oeVkjmfPcLbWm.QdzAsZpzCeU, "Install Referrer service disconnected.");
            InstallReferrerClientImpl.this.f13576c = null;
            InstallReferrerClientImpl.this.f13574a = 0;
            this.f13578d.onInstallReferrerServiceDisconnected();
        }

        private b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f13578d = installReferrerStateListener;
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.f13575b = context.getApplicationContext();
    }

    private boolean c() {
        return this.f13575b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
    }

    @Override
    public void endConnection() {
        this.f13574a = 3;
        if (this.f13577d != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.f13575b.unbindService(this.f13577d);
            this.f13577d = null;
        }
        this.f13576c = null;
    }

    @Override
    public ReferrerDetails getInstallReferrer() throws RemoteException {
        if (!isReady()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f13575b.getPackageName());
        try {
            return new ReferrerDetails(this.f13576c.n0(bundle));
        } catch (RemoteException e7) {
            InstallReferrerCommons.logWarn(PLHvHoayk.TyBeUaUZ, "RemoteException getting install referrer information");
            this.f13574a = 0;
            throw e7;
        }
    }

    @Override
    public boolean isReady() {
        return (this.f13574a != 2 || this.f13576c == null || this.f13577d == null) ? false : true;
    }

    @Override
    public void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", jUbDmI.MczDoHc);
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i7 = this.f13574a;
        if (i7 == 1) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i7 == 3) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", UJEa.VcdXygOTHLSt));
        List<ResolveInfo> listQueryIntentServices = this.f13575b.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f13574a = 0;
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!"com.android.vending".equals(str) || str2 == null || !c()) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.f13574a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        Intent intent2 = new Intent(intent);
        b bVar = new b(installReferrerStateListener);
        this.f13577d = bVar;
        if (this.f13575b.bindService(intent2, bVar, 1)) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
            return;
        }
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
        this.f13574a = 0;
        installReferrerStateListener.onInstallReferrerSetupFinished(1);
    }
}
