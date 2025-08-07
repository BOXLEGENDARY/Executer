package androidx.room;

import K0.wJ.BtcVLuo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.a;
import androidx.room.b;
import androidx.room.c;
import androidx.room.d;
import com.github.luben.zstd.BuildConfig;
import e2.vb.oyfFwvPUKctyaG;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n \u001a*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\"\u0010\"\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f\"\u0004\b \u0010!R\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&\"\u0004\b'\u0010(R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0017\u00106\u001a\u0002028\u0006¢\u0006\f\n\u0004\b-\u00103\u001a\u0004\b4\u00105R\u0017\u0010<\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010A\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b:\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010F\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b8\u0010ER\u0017\u0010G\u001a\u00020B8\u0006¢\u0006\f\n\u0004\b'\u0010D\u001a\u0004\b+\u0010E¨\u0006H"}, d2 = {"Landroidx/room/d;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "name", "Landroid/content/Intent;", "serviceIntent", "Landroidx/room/c;", "invalidationTracker", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroidx/room/c;Ljava/util/concurrent/Executor;)V", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Landroidx/room/c;", "e", "()Landroidx/room/c;", "c", "Ljava/util/concurrent/Executor;", "d", "()Ljava/util/concurrent/Executor;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "appContext", BuildConfig.FLAVOR, "I", "()I", "setClientId", "(I)V", "clientId", "Landroidx/room/c$c;", "f", "Landroidx/room/c$c;", "()Landroidx/room/c$c;", "l", "(Landroidx/room/c$c;)V", "observer", "Landroidx/room/b;", "g", "Landroidx/room/b;", "h", "()Landroidx/room/b;", "m", "(Landroidx/room/b;)V", "service", "Landroidx/room/a;", "Landroidx/room/a;", "getCallback", "()Landroidx/room/a;", "callback", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "getServiceConnection", "()Landroid/content/ServiceConnection;", "serviceConnection", "Ljava/lang/Runnable;", "k", "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", "setUpRunnable", "removeObserverRunnable", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    private final String name;

    private final androidx.room.c invalidationTracker;

    private final Executor executor;

    private final Context appContext;

    private int clientId;

    public c.AbstractC0117c observer;

    private androidx.room.b service;

    private final androidx.room.a callback;

    private final AtomicBoolean stopped;

    private final ServiceConnection serviceConnection;

    private final Runnable setUpRunnable;

    private final Runnable removeObserverRunnable;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/room/d$a", "Landroidx/room/c$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "tables", BuildConfig.FLAVOR, "c", "(Ljava/util/Set;)V", BuildConfig.FLAVOR, "b", "()Z", "isRemote", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends c.AbstractC0117c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override
        public boolean b() {
            return true;
        }

        @Override
        public void c(Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            if (d.this.getStopped().get()) {
                return;
            }
            try {
                androidx.room.b service = d.this.getService();
                if (service != null) {
                    service.n6(d.this.getClientId(), (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e7) {
                Log.w("ROOM", "Cannot broadcast invalidation", e7);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/d$b", "Landroidx/room/a$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "tables", BuildConfig.FLAVOR, "P1", "([Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends a.AbstractBinderC0114a {
        b() {
        }

        public static final void V0(d dVar, String[] strArr) {
            Intrinsics.checkNotNullParameter(dVar, "this$0");
            Intrinsics.checkNotNullParameter(strArr, "$tables");
            dVar.getInvalidationTracker().k((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Override
        public void P1(final String[] tables) {
            Intrinsics.checkNotNullParameter(tables, oyfFwvPUKctyaG.QxFnhJcDeiNoA);
            Executor executor = d.this.getExecutor();
            final d dVar = d.this;
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    d.b.V0(dVar, tables);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/room/d$c", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", BuildConfig.FLAVOR, "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements ServiceConnection {
        c() {
        }

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            d.this.m(b.a.E0(service));
            d.this.getExecutor().execute(d.this.getSetUpRunnable());
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            d.this.getExecutor().execute(d.this.getRemoveObserverRunnable());
            d.this.m(null);
        }
    }

    public d(Context context, String str, Intent intent, androidx.room.c cVar, Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(intent, "serviceIntent");
        Intrinsics.checkNotNullParameter(cVar, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.name = str;
        this.invalidationTracker = cVar;
        this.executor = executor;
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        this.callback = new b();
        this.stopped = new AtomicBoolean(false);
        c cVar2 = new c();
        this.serviceConnection = cVar2;
        this.setUpRunnable = new Runnable() {
            @Override
            public final void run() {
                androidx.room.d.n(this.f8084d);
            }
        };
        this.removeObserverRunnable = new Runnable() {
            @Override
            public final void run() {
                androidx.room.d.k(this.f8085d);
            }
        };
        l(new a((String[]) cVar.i().keySet().toArray(new String[0])));
        applicationContext.bindService(intent, cVar2, 1);
    }

    public static final void k(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "this$0");
        dVar.invalidationTracker.n(dVar.f());
    }

    public static final void n(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "this$0");
        try {
            androidx.room.b bVar = dVar.service;
            if (bVar != null) {
                dVar.clientId = bVar.C2(dVar.callback, dVar.name);
                dVar.invalidationTracker.c(dVar.f());
            }
        } catch (RemoteException e7) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e7);
        }
    }

    public final int getClientId() {
        return this.clientId;
    }

    public final Executor getExecutor() {
        return this.executor;
    }

    public final androidx.room.c getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public final c.AbstractC0117c f() {
        c.AbstractC0117c abstractC0117c = this.observer;
        if (abstractC0117c != null) {
            return abstractC0117c;
        }
        Intrinsics.v(BtcVLuo.egNTKRwVm);
        return null;
    }

    public final Runnable getRemoveObserverRunnable() {
        return this.removeObserverRunnable;
    }

    public final androidx.room.b getService() {
        return this.service;
    }

    public final Runnable getSetUpRunnable() {
        return this.setUpRunnable;
    }

    public final AtomicBoolean getStopped() {
        return this.stopped;
    }

    public final void l(c.AbstractC0117c abstractC0117c) {
        Intrinsics.checkNotNullParameter(abstractC0117c, "<set-?>");
        this.observer = abstractC0117c;
    }

    public final void m(androidx.room.b bVar) {
        this.service = bVar;
    }
}
