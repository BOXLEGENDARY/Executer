package com.birbit.android.jobqueue.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.PowerManager;
import com.birbit.android.jobqueue.network.NetworkEventProvider;

public class a implements NetworkUtil, NetworkEventProvider {

    private NetworkEventProvider.Listener f13793a;

    class C0149a extends ConnectivityManager.NetworkCallback {

        final Context f13794a;

        C0149a(Context context) {
            this.f13794a = context;
        }

        @Override
        public void onAvailable(Network network) {
            a.this.a(this.f13794a);
        }
    }

    class b extends BroadcastReceiver {
        b() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            a.this.a(context);
        }
    }

    public a(Context context) {
        Context applicationContext = context.getApplicationContext();
        c(applicationContext);
        d(applicationContext);
    }

    private static boolean b(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager.isDeviceIdleMode() && !powerManager.isIgnoringBatteryOptimizations(context.getPackageName());
    }

    private void c(Context context) {
        context.registerReceiver(new b(), new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
    }

    private void d(Context context) {
        ((ConnectivityManager) context.getSystemService("connectivity")).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addCapability(13).build(), new C0149a(context));
    }

    public void a(Context context) {
        NetworkEventProvider.Listener listener = this.f13793a;
        if (listener == null) {
            return;
        }
        listener.onNetworkChange(getNetworkStatus(context));
    }

    @Override
    public int getNetworkStatus(Context context) {
        NetworkInfo activeNetworkInfo;
        if (b(context) || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
            return 0;
        }
        return (activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 9) ? 2 : 1;
    }

    @Override
    public void setListener(NetworkEventProvider.Listener listener) {
        this.f13793a = listener;
    }
}
