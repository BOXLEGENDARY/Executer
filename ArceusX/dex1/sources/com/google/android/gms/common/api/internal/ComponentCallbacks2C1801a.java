package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ComponentCallbacks2C1801a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    private static final ComponentCallbacks2C1801a f14103w = new ComponentCallbacks2C1801a();

    private final AtomicBoolean f14104d = new AtomicBoolean();

    private final AtomicBoolean f14105e = new AtomicBoolean();

    private final ArrayList f14106i = new ArrayList();

    private boolean f14107v = false;

    public interface InterfaceC0151a {
        void a(boolean z7);
    }

    private ComponentCallbacks2C1801a() {
    }

    public static ComponentCallbacks2C1801a b() {
        return f14103w;
    }

    public static void c(Application application) {
        ComponentCallbacks2C1801a componentCallbacks2C1801a = f14103w;
        synchronized (componentCallbacks2C1801a) {
            try {
                if (!componentCallbacks2C1801a.f14107v) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C1801a);
                    application.registerComponentCallbacks(componentCallbacks2C1801a);
                    componentCallbacks2C1801a.f14107v = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(boolean z7) {
        synchronized (f14103w) {
            try {
                Iterator it = this.f14106i.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0151a) it.next()).a(z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(InterfaceC0151a interfaceC0151a) {
        synchronized (f14103w) {
            this.f14106i.add(interfaceC0151a);
        }
    }

    public boolean d() {
        return this.f14104d.get();
    }

    public boolean e(boolean z7) {
        if (!this.f14105e.get()) {
            if (!v3.m.b()) {
                return z7;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f14105e.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f14104d.set(true);
            }
        }
        return d();
    }

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f14105e;
        boolean zCompareAndSet = this.f14104d.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override
    public final void onActivityPaused(Activity activity) {
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f14105e;
        boolean zCompareAndSet = this.f14104d.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override
    public final void onActivityStarted(Activity activity) {
    }

    @Override
    public final void onActivityStopped(Activity activity) {
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override
    public final void onLowMemory() {
    }

    @Override
    public final void onTrimMemory(int i7) {
        if (i7 == 20 && this.f14104d.compareAndSet(false, true)) {
            this.f14105e.set(true);
            f(true);
        }
    }
}
