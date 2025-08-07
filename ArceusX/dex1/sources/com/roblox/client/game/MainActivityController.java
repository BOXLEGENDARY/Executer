package com.roblox.client.game;

import Q6.o;
import Z.tNT.PexNRiLSd;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.AbstractC1694h;
import android.view.InterfaceC1698l;
import android.view.InterfaceC1701o;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.roblox.client.C2374w;
import com.roblox.client.RobloxApplication;
import com.roblox.client.S;
import com.roblox.client.game.a;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.util.AssertDialogUtil;
import h7.l;
import java.lang.ref.WeakReference;
import k7.c;
import m6.EnumC2597N;
import t2.Dbl.hgESaf;

public class MainActivityController implements InterfaceC1698l, a.f, c.f, SurfaceHolder.Callback {

    private P5.a f20011i;

    private final WeakReference<S> f20013w;

    private final k7.c f20014y;

    private final SurfaceView f20015z;

    public EnumC2597N f20009d = EnumC2597N.APP;

    private final String f20010e = "MainScreenController";

    private Boolean f20012v = Boolean.FALSE;

    private boolean f20008A = false;

    static class a {

        static final int[] f20016a;

        static {
            int[] iArr = new int[AbstractC1694h.a.values().length];
            f20016a = iArr;
            try {
                iArr[AbstractC1694h.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20016a[AbstractC1694h.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20016a[AbstractC1694h.a.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20016a[AbstractC1694h.a.ON_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20016a[AbstractC1694h.a.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MainActivityController(S s7, SurfaceView surfaceView) {
        this.f20013w = new WeakReference<>(s7);
        this.f20015z = surfaceView;
        k7.c cVar = new k7.c(s7, surfaceView, this);
        this.f20014y = cVar;
        surfaceView.setOnTouchListener(cVar);
        surfaceView.getHolder().addCallback(this);
        f(s7.getResources().getConfiguration());
    }

    private boolean c(int i7) {
        return (!this.f20008A || i7 == 4 || i7 == 25 || i7 == 24) ? false : true;
    }

    private void f(Configuration configuration) {
        if (configuration.keyboard == 2 && configuration.hardKeyboardHidden == 1) {
            this.f20008A = true;
        } else {
            this.f20008A = false;
        }
    }

    private void g() {
        l.g(PexNRiLSd.JxpRinPvB, "Disposing RTC audio manager.");
        P5.a aVar = this.f20011i;
        if (aVar != null) {
            aVar.c();
            this.f20011i = null;
        }
    }

    private void i(androidx.appcompat.app.d dVar) {
        l.g("MainScreenController", "Initializing RTC audio manager.");
        P5.a aVarC = C2374w.h().c(dVar.getApplicationContext());
        this.f20011i = aVarC;
        if (aVarC != null) {
            aVarC.d(dVar);
        }
    }

    @Override
    public void I() {
    }

    @Override
    public boolean a() {
        return this.f20012v.booleanValue();
    }

    @Override
    public void b(boolean z7) {
        this.f20014y.K(z7);
    }

    public boolean h() {
        return this.f20008A;
    }

    @Override
    public void j(InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar) {
        l.a("MainScreenController", "onStateChanged: event: " + aVar);
        int i7 = a.f20016a[aVar.ordinal()];
        if (i7 == 1) {
            i((androidx.appcompat.app.d) interfaceC1701o);
            if (!j6.d.a().E1() || E6.c.m()) {
                return;
            }
            this.f20013w.get().getWindow().setFlags(8192, 8192);
            return;
        }
        if (i7 == 2) {
            this.f20014y.K(false);
            C2374w.h().k().k("POST_NOTIFICATIONS", o.f());
            C2374w.h().k().k("MEDIA_PICKER", F6.a.e());
            if (j6.d.a().W1() && AssertDialogUtil.a()) {
                AssertDialogUtil.b(this.f20013w.get());
                return;
            }
            return;
        }
        if (i7 == 3) {
            this.f20014y.L();
            return;
        }
        if (i7 != 4) {
            if (i7 != 5) {
                return;
            }
            g();
        } else {
            C2374w.h().k().W("POST_NOTIFICATIONS");
            C2374w.h().k().W("MEDIA_PICKER");
            if (j6.d.a().W1() && AssertDialogUtil.a()) {
                AssertDialogUtil.b((Activity) null);
            }
        }
    }

    public void k(Configuration configuration) {
        f(configuration);
    }

    @Override
    public void l() {
        this.f20014y.L();
    }

    public boolean o(KeyEvent keyEvent) {
        if (!c(keyEvent.getKeyCode())) {
            return false;
        }
        NativeGLInterface.nativePassKeyEvent(true, keyEvent.getScanCode(), keyEvent.getKeyCode(), keyEvent.getRepeatCount() > 0);
        return true;
    }

    public boolean p(KeyEvent keyEvent) {
        if (!c(keyEvent.getKeyCode())) {
            return false;
        }
        NativeGLInterface.nativePassKeyEvent(false, keyEvent.getScanCode(), keyEvent.getKeyCode(), keyEvent.getRepeatCount() > 0);
        return true;
    }

    public void q(int i7) {
        if (this.f20009d == EnumC2597N.EXPERIENCE) {
            l.g("MainScreenController", "Handling onTrimMemory level: " + i7);
            if (i7 == 15) {
                l.k("MainScreenController", "TRIM_MEMORY_RUNNING_CRITICAL: notify the engine...");
                NativeGLInterface.nativeAppBridgeV2OnLowMemory();
            }
        }
        RobloxApplication.b("MainScreenController", this.f20009d, i7);
        NativeGLInterface.nativeAppBridgeV2OnLowMemoryForRenderView(this.f20009d.ordinal(), i7);
    }

    public void r() {
        this.f20014y.H();
    }

    public void s(EnumC2597N enumC2597N) {
        l.g(hgESaf.VCJdezp, "Roblox has entered " + enumC2597N.name() + " mode.");
        this.f20009d = enumC2597N;
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        l.g("MainScreenController", "surfaceChanged");
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        l.g("MainScreenController", "surfaceCreated");
        this.f20012v = Boolean.TRUE;
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        l.g("MainScreenController", "surfaceDestroyed");
        this.f20012v = Boolean.FALSE;
    }
}
