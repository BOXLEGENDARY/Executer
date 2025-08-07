package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n3.C2651i;

public class ServiceConnectionC1800a implements ServiceConnection {

    boolean f14049d = false;

    private final BlockingQueue f14050e = new LinkedBlockingQueue();

    @ResultIgnorabilityUnspecified
    public IBinder a(long j7, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C2651i.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f14049d) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f14049d = true;
        IBinder iBinder = (IBinder) this.f14050e.poll(j7, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f14050e.add(iBinder);
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
