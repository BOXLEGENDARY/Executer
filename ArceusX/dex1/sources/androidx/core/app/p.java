package androidx.core.app;

import H3.QdLC.QcdySgfdST;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import c.InterfaceC1743a;
import e2.vb.oyfFwvPUKctyaG;
import g1.kQwt.YGBtcyQ;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class p {

    private static String f10507d;

    private static d f10510g;

    private final Context f10511a;

    private final NotificationManager f10512b;

    private static final Object f10506c = new Object();

    private static Set<String> f10508e = new HashSet();

    private static final Object f10509f = new Object();

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    private static class b implements e {

        final String f10513a;

        final int f10514b;

        final String f10515c;

        final Notification f10516d;

        b(String str, int i7, String str2, Notification notification) {
            this.f10513a = str;
            this.f10514b = i7;
            this.f10515c = str2;
            this.f10516d = notification;
        }

        @Override
        public void a(InterfaceC1743a interfaceC1743a) throws RemoteException {
            interfaceC1743a.t6(this.f10513a, this.f10514b, this.f10515c, this.f10516d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f10513a + ", id:" + this.f10514b + ", tag:" + this.f10515c + "]";
        }
    }

    private static class c {

        final ComponentName f10517a;

        final IBinder f10518b;

        c(ComponentName componentName, IBinder iBinder) {
            this.f10517a = componentName;
            this.f10518b = iBinder;
        }
    }

    private static class d implements Handler.Callback, ServiceConnection {

        private final Context f10519d;

        private final HandlerThread f10520e;

        private final Handler f10521i;

        private final Map<ComponentName, a> f10522v = new HashMap();

        private Set<String> f10523w = new HashSet();

        private static class a {

            final ComponentName f10524a;

            InterfaceC1743a f10526c;

            boolean f10525b = false;

            ArrayDeque<e> f10527d = new ArrayDeque<>();

            int f10528e = 0;

            a(ComponentName componentName) {
                this.f10524a = componentName;
            }
        }

        d(Context context) {
            this.f10519d = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f10520e = handlerThread;
            handlerThread.start();
            this.f10521i = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f10525b) {
                return true;
            }
            boolean zBindService = this.f10519d.bindService(new Intent(oyfFwvPUKctyaG.QSActtM).setComponent(aVar.f10524a), this, 33);
            aVar.f10525b = zBindService;
            if (zBindService) {
                aVar.f10528e = 0;
            } else {
                Log.w("NotifManCompat", QcdySgfdST.XzsP + aVar.f10524a);
                this.f10519d.unbindService(this);
            }
            return aVar.f10525b;
        }

        private void b(a aVar) {
            if (aVar.f10525b) {
                this.f10519d.unbindService(this);
                aVar.f10525b = false;
            }
            aVar.f10526c = null;
        }

        private void c(e eVar) {
            j();
            for (a aVar : this.f10522v.values()) {
                aVar.f10527d.add(eVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f10522v.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f10522v.get(componentName);
            if (aVar != null) {
                aVar.f10526c = InterfaceC1743a.AbstractBinderC0139a.E0(iBinder);
                aVar.f10528e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f10522v.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f10524a + ", " + aVar.f10527d.size() + " queued tasks");
            }
            if (aVar.f10527d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f10526c == null) {
                i(aVar);
                return;
            }
            while (true) {
                e eVarPeek = aVar.f10527d.peek();
                if (eVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + eVarPeek);
                    }
                    eVarPeek.a(aVar.f10526c);
                    aVar.f10527d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f10524a);
                    }
                } catch (RemoteException e7) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f10524a, e7);
                }
            }
            if (aVar.f10527d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f10521i.hasMessages(3, aVar.f10524a)) {
                return;
            }
            int i7 = aVar.f10528e;
            int i8 = i7 + 1;
            aVar.f10528e = i8;
            if (i8 <= 6) {
                int i9 = (1 << i7) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i9 + " ms");
                }
                this.f10521i.sendMessageDelayed(this.f10521i.obtainMessage(3, aVar.f10524a), i9);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f10527d.size() + " tasks to " + aVar.f10524a + " after " + aVar.f10528e + " retries");
            aVar.f10527d.clear();
        }

        private void j() {
            Set<String> setC = p.c(this.f10519d);
            if (setC.equals(this.f10523w)) {
                return;
            }
            this.f10523w = setC;
            List<ResolveInfo> listQueryIntentServices = this.f10519d.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setC.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f10522v.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f10522v.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f10522v.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        public void h(e eVar) {
            this.f10521i.obtainMessage(0, eVar).sendToTarget();
        }

        @Override
        public boolean handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == 0) {
                c((e) message.obj);
                return true;
            }
            if (i7 == 1) {
                c cVar = (c) message.obj;
                e(cVar.f10517a, cVar.f10518b);
                return true;
            }
            if (i7 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i7 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", YGBtcyQ.BDFES + componentName);
            }
            this.f10521i.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f10521i.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface e {
        void a(InterfaceC1743a interfaceC1743a) throws RemoteException;
    }

    private p(Context context) {
        this.f10511a = context;
        this.f10512b = (NotificationManager) context.getSystemService("notification");
    }

    public static p b(Context context) {
        return new p(context);
    }

    public static Set<String> c(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f10506c) {
            if (string != null) {
                try {
                    if (!string.equals(f10507d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f10508e = hashSet;
                        f10507d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f10508e;
        }
        return set;
    }

    private void f(e eVar) {
        synchronized (f10509f) {
            try {
                if (f10510g == null) {
                    f10510g = new d(this.f10511a.getApplicationContext());
                }
                f10510g.h(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean g(Notification notification) {
        Bundle bundleA = l.a(notification);
        return bundleA != null && bundleA.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        return a.a(this.f10512b);
    }

    public void d(int i7, Notification notification) {
        e(null, i7, notification);
    }

    public void e(String str, int i7, Notification notification) {
        if (!g(notification)) {
            this.f10512b.notify(str, i7, notification);
        } else {
            f(new b(this.f10511a.getPackageName(), i7, str, notification));
            this.f10512b.cancel(str, i7);
        }
    }
}
