package com.roblox.client.realtime;

import E6.k;
import Wa.j;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.roblox.client.q0;
import g1.kQwt.YGBtcyQ;
import g6.C2469e;
import g6.C2470f;
import g6.C2471g;
import h7.l;
import org.greenrobot.eventbus.ThreadMode;

public class RealtimeService extends Service {

    private volatile Looper f20243y;

    private volatile c f20244z;

    private final int f20238d = 10;

    private final int f20239e = 20;

    private final int f20240i = 24;

    private final int f20241v = 25;

    private final int f20242w = 30;

    private final IBinder f20236A = new b();

    private BroadcastReceiver f20237B = new a();

    private static class a extends BroadcastReceiver {

        private boolean f20245a;

        private boolean f20246b;

        @Override
        public void onReceive(Context context, Intent intent) {
            boolean zL = q0.l(context);
            if (this.f20246b) {
                this.f20245a = zL;
                this.f20246b = false;
            } else if (zL != this.f20245a) {
                this.f20245a = zL;
                Wa.c.d().j(new C2469e(zL));
            }
        }

        private a() {
            this.f20245a = false;
            this.f20246b = true;
        }
    }

    public class b extends Binder {
        public b() {
        }
    }

    private final class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override
        public void handleMessage(Message message) {
            int i7 = message.arg1;
            if (i7 == 10) {
                RealtimeService.this.k();
                return;
            }
            if (i7 == 20) {
                RealtimeService.this.l();
                return;
            }
            if (i7 == 24) {
                RealtimeService.this.k();
                return;
            }
            if (i7 == 25) {
                RealtimeService.this.m();
            } else if (i7 == 30) {
                RealtimeService.this.l();
                getLooper().quit();
            }
        }
    }

    public static long d() {
        return W6.a.a();
    }

    public static boolean e() {
        return W6.a.b();
    }

    private void f(long j7) {
        if (k.e().g() != -1) {
            Message messageObtainMessage = this.f20244z.obtainMessage();
            messageObtainMessage.arg1 = 10;
            this.f20244z.sendMessageDelayed(messageObtainMessage, j7);
        }
    }

    private void g() {
        Message messageObtainMessage = this.f20244z.obtainMessage();
        messageObtainMessage.arg1 = 20;
        this.f20244z.sendMessage(messageObtainMessage);
    }

    private void h() {
        Message messageObtainMessage = this.f20244z.obtainMessage();
        messageObtainMessage.arg1 = 24;
        this.f20244z.sendMessage(messageObtainMessage);
    }

    private void i() {
        Message messageObtainMessage = this.f20244z.obtainMessage();
        messageObtainMessage.arg1 = 25;
        this.f20244z.sendMessage(messageObtainMessage);
    }

    private void j() {
        Message messageObtainMessage = this.f20244z.obtainMessage();
        messageObtainMessage.arg1 = 30;
        this.f20244z.sendMessage(messageObtainMessage);
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        registerReceiver(this.f20237B, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        Wa.c.d().n(this);
        f(0L);
        return this.f20236A;
    }

    @j(threadMode = ThreadMode.POSTING)
    public void onConnectivityChangeEvent(C2469e c2469e) {
        l.i("RealtimeService", "RealtimeService.onConnectivityChangeEvent() " + c2469e.a());
        if (c2469e.a()) {
            f(0L);
        } else {
            g();
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        T7.a.c(this);
        HandlerThread handlerThread = new HandlerThread("RealtimeService");
        handlerThread.start();
        this.f20243y = handlerThread.getLooper();
        this.f20244z = new c(this.f20243y);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @j(threadMode = ThreadMode.POSTING)
    public void onLoginEvent(C2470f c2470f) {
        l.g("RealtimeService", "RealtimeService.onLoginEvent()");
        h();
    }

    @j(threadMode = ThreadMode.POSTING)
    public void onLogoutEvent(C2471g c2471g) {
        l.g(YGBtcyQ.tcfiVVPNVJV, "RealtimeService.onLogoutEvent()");
        i();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Wa.c.d().p(this);
        unregisterReceiver(this.f20237B);
        j();
        return super.onUnbind(intent);
    }
}
