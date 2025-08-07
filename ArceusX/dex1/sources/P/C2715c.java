package p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import b.InterfaceC1737a;
import b.InterfaceC1738b;

public class C2715c {

    private final InterfaceC1738b f22576a;

    private final ComponentName f22577b;

    private final Context f22578c;

    class a extends InterfaceC1737a.AbstractBinderC0126a {

        private Handler f22579d = new Handler(Looper.getMainLooper());

        final C2714b f22580e;

        class RunnableC0214a implements Runnable {

            final int f22582d;

            final Bundle f22583e;

            RunnableC0214a(int i7, Bundle bundle) {
                this.f22582d = i7;
                this.f22583e = bundle;
            }

            @Override
            public void run() {
                a.this.f22580e.d(this.f22582d, this.f22583e);
            }
        }

        class b implements Runnable {

            final String f22585d;

            final Bundle f22586e;

            b(String str, Bundle bundle) {
                this.f22585d = str;
                this.f22586e = bundle;
            }

            @Override
            public void run() {
                a.this.f22580e.a(this.f22585d, this.f22586e);
            }
        }

        class RunnableC0215c implements Runnable {

            final Bundle f22588d;

            RunnableC0215c(Bundle bundle) {
                this.f22588d = bundle;
            }

            @Override
            public void run() {
                a.this.f22580e.c(this.f22588d);
            }
        }

        class d implements Runnable {

            final String f22590d;

            final Bundle f22591e;

            d(String str, Bundle bundle) {
                this.f22590d = str;
                this.f22591e = bundle;
            }

            @Override
            public void run() {
                a.this.f22580e.e(this.f22590d, this.f22591e);
            }
        }

        class e implements Runnable {

            final int f22593d;

            final Uri f22594e;

            final boolean f22595i;

            final Bundle f22596v;

            e(int i7, Uri uri, boolean z7, Bundle bundle) {
                this.f22593d = i7;
                this.f22594e = uri;
                this.f22595i = z7;
                this.f22596v = bundle;
            }

            @Override
            public void run() {
                a.this.f22580e.f(this.f22593d, this.f22594e, this.f22595i, this.f22596v);
            }
        }

        a(C2714b c2714b) {
            this.f22580e = c2714b;
        }

        @Override
        public Bundle M2(String str, Bundle bundle) throws RemoteException {
            C2714b c2714b = this.f22580e;
            if (c2714b == null) {
                return null;
            }
            return c2714b.b(str, bundle);
        }

        @Override
        public void N4(String str, Bundle bundle) throws RemoteException {
            if (this.f22580e == null) {
                return;
            }
            this.f22579d.post(new b(str, bundle));
        }

        @Override
        public void h6(String str, Bundle bundle) throws RemoteException {
            if (this.f22580e == null) {
                return;
            }
            this.f22579d.post(new d(str, bundle));
        }

        @Override
        public void q6(Bundle bundle) throws RemoteException {
            if (this.f22580e == null) {
                return;
            }
            this.f22579d.post(new RunnableC0215c(bundle));
        }

        @Override
        public void r5(int i7, Bundle bundle) {
            if (this.f22580e == null) {
                return;
            }
            this.f22579d.post(new RunnableC0214a(i7, bundle));
        }

        @Override
        public void z6(int i7, Uri uri, boolean z7, Bundle bundle) throws RemoteException {
            if (this.f22580e == null) {
                return;
            }
            this.f22579d.post(new e(i7, uri, z7, bundle));
        }
    }

    C2715c(InterfaceC1738b interfaceC1738b, ComponentName componentName, Context context) {
        this.f22576a = interfaceC1738b;
        this.f22577b = componentName;
        this.f22578c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    private InterfaceC1737a.AbstractBinderC0126a b(C2714b c2714b) {
        return new a(c2714b);
    }

    private f d(C2714b c2714b, PendingIntent pendingIntent) {
        boolean zH3;
        InterfaceC1737a.AbstractBinderC0126a abstractBinderC0126aB = b(c2714b);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zH3 = this.f22576a.U4(abstractBinderC0126aB, bundle);
            } else {
                zH3 = this.f22576a.H3(abstractBinderC0126aB);
            }
            if (zH3) {
                return new f(this.f22576a, abstractBinderC0126aB, this.f22577b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f c(C2714b c2714b) {
        return d(c2714b, null);
    }

    public boolean e(long j7) {
        try {
            return this.f22576a.p3(j7);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
