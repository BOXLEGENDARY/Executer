package p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import b.InterfaceC1737a;
import b.InterfaceC1738b;

public final class f {

    private final Object f22611a = new Object();

    private final InterfaceC1738b f22612b;

    private final InterfaceC1737a f22613c;

    private final ComponentName f22614d;

    private final PendingIntent f22615e;

    f(InterfaceC1738b interfaceC1738b, InterfaceC1737a interfaceC1737a, ComponentName componentName, PendingIntent pendingIntent) {
        this.f22612b = interfaceC1738b;
        this.f22613c = interfaceC1737a;
        this.f22614d = componentName;
        this.f22615e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f22615e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    IBinder c() {
        return this.f22613c.asBinder();
    }

    ComponentName d() {
        return this.f22614d;
    }

    PendingIntent e() {
        return this.f22615e;
    }

    public int f(String str, Bundle bundle) {
        int iH1;
        Bundle bundleB = b(bundle);
        synchronized (this.f22611a) {
            try {
                try {
                    iH1 = this.f22612b.H1(this.f22613c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iH1;
    }

    public boolean g(Uri uri) {
        try {
            return this.f22615e != null ? this.f22612b.s1(this.f22613c, uri, b(null)) : this.f22612b.c4(this.f22613c, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
