package a5;

import Y3.qE.KpBmp;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import n3.C2651i;
import u3.C2928b;

final class p implements ServiceConnection {

    int f8372d;

    final Messenger f8373e;

    C1584g f8374i;

    final Queue<i<?>> f8375v;

    final SparseArray<i<?>> f8376w;

    final o f8377y;

    private p(o oVar) {
        this.f8377y = oVar;
        this.f8372d = 0;
        this.f8373e = new Messenger(new L3.e(Looper.getMainLooper(), new Handler.Callback(this) {

            private final p f8379d;

            {
                this.f8379d = this;
            }

            @Override
            public final boolean handleMessage(Message message) {
                return this.f8379d.e(message);
            }
        }));
        this.f8375v = new ArrayDeque();
        this.f8376w = new SparseArray<>();
    }

    final void a() {
        this.f8377y.f8369b.execute(new Runnable(this) {

            private final p f8346d;

            {
                this.f8346d = this;
            }

            @Override
            public final void run() {
                final i<?> iVarPoll;
                final p pVar = this.f8346d;
                while (true) {
                    synchronized (pVar) {
                        try {
                            if (pVar.f8372d != 2) {
                                return;
                            }
                            if (pVar.f8375v.isEmpty()) {
                                pVar.f();
                                return;
                            } else {
                                iVarPoll = pVar.f8375v.poll();
                                pVar.f8376w.put(iVarPoll.f8355a, iVarPoll);
                                pVar.f8377y.f8369b.schedule(new Runnable(pVar, iVarPoll) {

                                    private final p f8349d;

                                    private final i f8350e;

                                    {
                                        this.f8349d = pVar;
                                        this.f8350e = iVarPoll;
                                    }

                                    @Override
                                    public final void run() {
                                        this.f8349d.b(this.f8350e.f8355a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String strValueOf = String.valueOf(iVarPoll);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(strValueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context context = pVar.f8377y.f8368a;
                    Messenger messenger = pVar.f8373e;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = iVarPoll.f8357c;
                    messageObtain.arg1 = iVarPoll.f8355a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", iVarPoll.d());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", iVarPoll.f8358d);
                    messageObtain.setData(bundle);
                    try {
                        pVar.f8374i.a(messageObtain);
                    } catch (RemoteException e7) {
                        pVar.c(2, e7.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void b(int i7) {
        i<?> iVar = this.f8376w.get(i7);
        if (iVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i7);
            Log.w("MessengerIpcClient", sb.toString());
            this.f8376w.remove(i7);
            iVar.a(new h(3, "Timed out waiting for response"));
            f();
        }
    }

    final synchronized void c(int i7, String str) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
            }
            int i8 = this.f8372d;
            if (i8 == 0) {
                throw new IllegalStateException();
            }
            if (i8 != 1 && i8 != 2) {
                if (i8 == 3) {
                    this.f8372d = 4;
                    return;
                } else {
                    if (i8 == 4) {
                        return;
                    }
                    int i9 = this.f8372d;
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("Unknown state: ");
                    sb.append(i9);
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f8372d = 4;
            C2928b.b().c(this.f8377y.f8368a, this);
            h hVar = new h(i7, str);
            Iterator<i<?>> it = this.f8375v.iterator();
            while (it.hasNext()) {
                it.next().a(hVar);
            }
            this.f8375v.clear();
            for (int i10 = 0; i10 < this.f8376w.size(); i10++) {
                this.f8376w.valueAt(i10).a(hVar);
            }
            this.f8376w.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized boolean d(i<?> iVar) {
        int i7 = this.f8372d;
        if (i7 == 0) {
            this.f8375v.add(iVar);
            C2651i.p(this.f8372d == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f8372d = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (C2928b.b().a(this.f8377y.f8368a, intent, this, 1)) {
                this.f8377y.f8369b.schedule(new Runnable(this) {

                    private final p f8378d;

                    {
                        this.f8378d = this;
                    }

                    @Override
                    public final void run() {
                        this.f8378d.g();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                c(0, "Unable to bind to service");
            }
            return true;
        }
        if (i7 == 1) {
            this.f8375v.add(iVar);
            return true;
        }
        if (i7 == 2) {
            this.f8375v.add(iVar);
            a();
            return true;
        }
        if (i7 != 3 && i7 != 4) {
            int i8 = this.f8372d;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i8);
            throw new IllegalStateException(sb.toString());
        }
        return false;
    }

    final boolean e(Message message) {
        int i7 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str = KpBmp.husTfZqwOKGAZ;
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i7);
            Log.d(str, sb.toString());
        }
        synchronized (this) {
            try {
                i<?> iVar = this.f8376w.get(i7);
                if (iVar == null) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i7);
                    Log.w("MessengerIpcClient", sb2.toString());
                    return true;
                }
                this.f8376w.remove(i7);
                f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    iVar.a(new h(4, "Not supported by GmsCore"));
                } else {
                    iVar.b(data);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final synchronized void f() {
        try {
            if (this.f8372d == 2 && this.f8375v.isEmpty() && this.f8376w.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f8372d = 3;
                C2928b.b().c(this.f8377y.f8368a, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void g() {
        if (this.f8372d == 1) {
            c(1, "Timed out while binding");
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f8377y.f8369b.execute(new Runnable(this, iBinder) {

            private final p f8347d;

            private final IBinder f8348e;

            {
                this.f8347d = this;
                this.f8348e = iBinder;
            }

            @Override
            public final void run() {
                p pVar = this.f8347d;
                IBinder iBinder2 = this.f8348e;
                synchronized (pVar) {
                    if (iBinder2 == null) {
                        pVar.c(0, "Null service connection");
                        return;
                    }
                    try {
                        pVar.f8374i = new C1584g(iBinder2);
                        pVar.f8372d = 2;
                        pVar.a();
                    } catch (RemoteException e7) {
                        pVar.c(0, e7.getMessage());
                    }
                }
            }
        });
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f8377y.f8369b.execute(new Runnable(this) {

            private final p f8351d;

            {
                this.f8351d = this;
            }

            @Override
            public final void run() {
                this.f8351d.c(2, "Service disconnected");
            }
        });
    }
}
