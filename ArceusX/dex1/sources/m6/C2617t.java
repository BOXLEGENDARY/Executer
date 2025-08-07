package m6;

import H7.X;
import H7.Z;
import J7.g;
import Z.tNT.PexNRiLSd;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.FN.krlBPZZeK;
import androidx.fragment.app.ActivityC1663h;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.C2366n;
import com.roblox.client.C2373v;
import com.roblox.client.C2374w;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.RobloxApplication;
import com.roblox.client.a0;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.client.pushnotification.v2.RealtimeNotificationForegroundService;
import com.roblox.engine.jni.EngineExitJavaCallback2;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.engine.jni.RunOnMainEngineJavaCallback;
import e2.vb.oyfFwvPUKctyaG;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import m6.C2589F;
import w7.Jld.EZYiRMRTxKdo;
import z6.C3086b;

public class C2617t implements InterfaceC2598O, L6.a, C2589F.a, g.a, H7.c {

    private static boolean f22186V;

    private SurfaceHolderCallbackC2587D f22189C;

    private Handler f22191E;

    private IAPPurchaseManager f22192F;

    private C2374w f22193G;

    private int f22194H;

    private long f22195I;

    private S f22196J;

    private W f22198L;

    private C2606h f22199M;

    private ViewGroup f22200N;

    private ViewTreeObserver.OnGlobalLayoutListener f22201O;

    private long f22202P;

    private X f22205S;

    private ExecutorService f22206T;

    private Future<?> f22207U;

    protected Q f22208d;

    private boolean f22211v;

    private CountDownTimer f22212w;

    private d f22213y;

    private final Bundle f22214z;

    private final String f22209e = "ExperienceSession";

    private boolean f22210i = false;

    private final long f22187A = 30000;

    private final f f22188B = new f();

    private ViewTreeObserverOnGlobalLayoutListenerC2590G f22190D = null;

    private ServiceConnection f22197K = null;

    private boolean f22203Q = false;

    private boolean f22204R = false;

    class a implements Runnable {
        a() {
        }

        @Override
        public void run() {
            C2617t.this.e0();
        }
    }

    class b extends EngineExitJavaCallback2 {
        b() {
        }

        public void a() {
            h7.l.g(oyfFwvPUKctyaG.PbvIQuyswQ, "... (onCreate) gameDidLeave callback invoked.");
            C2617t.this.K();
            C2617t.this.b0(true);
        }
    }

    class c extends CountDownTimer {
        c(long j7, long j8) {
            super(j7, j8);
        }

        @Override
        public void onFinish() {
            h7.l.g("ExperienceSession", "CountDownTimer::onFinish -> onGameTimeoutInBackground()");
            C2617t.this.G();
        }

        @Override
        public void onTick(long j7) {
        }
    }

    public interface d extends com.roblox.client.D {
        void A();

        ActivityC1663h O();

        void n(Bundle bundle);
    }

    private class e extends S {
        @Override
        public void h(int i7) {
            h7.l.g("rbx.game.orientation", "setting orientation: " + i7);
            C2617t.this.L().setRequestedOrientation(i7);
        }

        private e() {
        }
    }

    public class f {
        public f() {
        }

        public l7.b a() {
            if (C2617t.this.L() == null) {
                return null;
            }
            return l7.b.a(C2617t.this.f22200N.getRootView(), C2617t.this.L().getWindowManager(), (View) null, ((com.roblox.client.S) C2617t.this.L()).f0().c());
        }
    }

    public C2617t(Bundle bundle) {
        this.f22214z = bundle;
    }

    private void F() {
        h7.l.g("ExperienceSession", EZYiRMRTxKdo.pPWzylo);
        CountDownTimer countDownTimer = this.f22212w;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f22212w = null;
        }
    }

    public void G() {
        if (L() != null) {
            h7.l.g("ExperienceSession", "endGameInBackground: call finish() on this GL activity.");
            H(true);
        }
        if (j6.d.a().W2()) {
            h7.l.g("ExperienceSession", "endGameInBackground: setAppSuspended(true)");
            NativeReportingInterface.setAppSuspended(true);
        }
        NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ES.endGameInBackground");
        b0(true);
    }

    private void I() {
        h7.l.g("ExperienceSession", "Entering immersive mode");
        h7.l.g("ExperienceSession", "System visibility " + this.f22194H);
        if (this.f22194H == 0) {
            this.f22194H = L().getWindow().getDecorView().getSystemUiVisibility();
        }
        L().getWindow().getDecorView().setSystemUiVisibility(5894);
        ((ActivityNativeMain) L()).v0().i(EnumC2597N.EXPERIENCE);
        ((ActivityNativeMain) L()).v0().b(0, 0, 0, 0);
    }

    private void J() {
        h7.l.g("ExperienceSession", "Exiting immersive mode");
        ((com.roblox.client.S) L()).v0().i(EnumC2597N.APP);
        L().getWindow().getDecorView().setSystemUiVisibility(this.f22194H);
    }

    public void K() {
        h7.l.g("ExperienceSession", "finishGame:");
        if (((ActivityC1663h) L()) != null) {
            g0();
            H(false);
        }
    }

    private H7.b O() {
        try {
            return (H7.b) Class.forName(PexNRiLSd.OeKbOhkEmRdFr).getConstructor(ActivityNativeMain.class).newInstance((ActivityNativeMain) L());
        } catch (ClassNotFoundException e7) {
            h7.l.e("ExperienceSession", "GmaSdkController class not found", e7);
            return new Z();
        } catch (IllegalAccessException e8) {
            e = e8;
            h7.l.e("ExperienceSession", "Failed to create GmaSdkController instance", e);
            return new Z();
        } catch (InstantiationException e9) {
            e = e9;
            h7.l.e("ExperienceSession", "Failed to create GmaSdkController instance", e);
            return new Z();
        } catch (NoSuchMethodException e10) {
            h7.l.e("ExperienceSession", "Constructor not found", e10);
            return new Z();
        } catch (InvocationTargetException e11) {
            e = e11;
            h7.l.e("ExperienceSession", "Failed to create GmaSdkController instance", e);
            return new Z();
        }
    }

    private void P() {
        K();
        b0(false);
    }

    private void Q() {
        final View viewFindViewById = L().findViewById(com.roblox.client.J.f19501N);
        if (viewFindViewById == null || viewFindViewById.getVisibility() == 8) {
            return;
        }
        viewFindViewById.post(new Runnable() {
            @Override
            public final void run() {
                viewFindViewById.setVisibility(8);
            }
        });
    }

    private void R(View view) {
        RbxKeyboard rbxKeyboard = (RbxKeyboard) view.findViewById(com.roblox.client.J.f19551z);
        rbxKeyboard.setBackgroundColor(0);
        V5.e.d(rbxKeyboard, N(), "SourceSansPro-Regular.ttf");
        this.f22190D = new ViewTreeObserverOnGlobalLayoutListenerC2590G(rbxKeyboard, this.f22189C, this.f22188B);
        RobloxApplication.a().registerComponentCallbacks(this.f22190D);
    }

    public void U() {
        L().getWindow().clearFlags(128);
        g0();
        L().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        J();
    }

    public void W(DialogInterface dialogInterface, int i7) {
        dialogInterface.dismiss();
        P();
    }

    public void X(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        P();
    }

    public void Y(int i7) {
        C3086b.f().u(N());
        new AlertDialog.Builder(N()).setMessage(i7).setNegativeButton(L().getString(com.roblox.client.M.f19621V), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f22184d.W(dialogInterface, i8);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                this.f22185d.X(dialogInterface);
            }
        }).create().show();
    }

    public void Z(int i7) {
        if (this.f22210i || (i7 & 4) != 0) {
            return;
        }
        I();
    }

    public void a0() {
        H7.b bVarO = O();
        if (j6.d.a().v3()) {
            this.f22205S = X.R(bVarO, new J5.a());
        } else {
            this.f22205S = new X(bVarO, this);
        }
    }

    private void g0() {
        if (this.f22201O != null) {
            h7.l.a("rbx.screen", "removing GlobalLayoutListener");
            this.f22200N.getViewTreeObserver().removeOnGlobalLayoutListener(this.f22201O);
            this.f22201O = null;
        }
    }

    private void h0() {
        if (this.f22195I > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f22195I;
            h7.l.g("ExperienceSession", "Game duration: " + jElapsedRealtime + "ms.");
            E6.h.b().k(N(), jElapsedRealtime);
        }
    }

    private void j0() {
        long jA = j6.d.a().d2() ? new P7.a(P7.b.i().d("Backgrounding.General"), 30000L).a() : 30000L;
        h7.l.g("ExperienceSession", "CountDownTimer constructed with delay:" + jA);
        this.f22212w = new c(jA, 1000L).start();
    }

    private synchronized void k0(boolean z7) {
        ViewTreeObserverOnGlobalLayoutListenerC2590G viewTreeObserverOnGlobalLayoutListenerC2590G;
        try {
            if (this.f22203Q) {
                return;
            }
            this.f22203Q = true;
            NativeReportingInterface.gameForegrounded();
            if (z7) {
                NativeGLInterface.nativeOnExperienceSessionResume();
            } else {
                NativeGLInterface.nativeOnFragmentStart();
            }
            R7.g.f().d();
            if (this.f22198L == null) {
                W w8 = new W(N());
                this.f22198L = w8;
                w8.a();
            }
            if (this.f22199M == null) {
                C2606h c2606h = new C2606h(N());
                this.f22199M = c2606h;
                c2606h.p();
            }
            if (j6.d.a().S0() && this.f22201O == null && this.f22190D != null) {
                h7.l.a("rbx.screen", "adding GlobalLayoutListener");
                this.f22201O = this.f22190D;
                this.f22200N.getViewTreeObserver().addOnGlobalLayoutListener(this.f22201O);
            }
            if (j6.d.a().R2() && (viewTreeObserverOnGlobalLayoutListenerC2590G = this.f22190D) != null) {
                viewTreeObserverOnGlobalLayoutListenerC2590G.w();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void l0(boolean z7) {
        ViewTreeObserverOnGlobalLayoutListenerC2590G viewTreeObserverOnGlobalLayoutListenerC2590G;
        try {
            if (this.f22203Q) {
                this.f22203Q = false;
                NativeReportingInterface.gameBackgrounded();
                if (z7) {
                    NativeGLInterface.nativeOnExperienceSessionPause();
                } else {
                    NativeGLInterface.nativeOnFragmentStop();
                }
                R7.g.f().e();
                W w8 = this.f22198L;
                if (w8 != null) {
                    w8.b();
                    this.f22198L = null;
                }
                C2606h c2606h = this.f22199M;
                if (c2606h != null) {
                    c2606h.r();
                    this.f22199M = null;
                }
                if (j6.d.a().R2() && (viewTreeObserverOnGlobalLayoutListenerC2590G = this.f22190D) != null) {
                    viewTreeObserverOnGlobalLayoutListenerC2590G.E();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void n0(long j7) {
        NativeGLJavaInterface.setImplementation(new RunOnMainEngineJavaCallback(this.f22191E, new C2589F(this, this.f22190D)));
        NativeGLJavaInterface.setExitImplementation(new b());
    }

    private void o0(long j7) {
        Window window;
        if (Build.VERSION.SDK_INT >= 28) {
            boolean zA = j6.d.a().T() ? new P7.c(P7.b.i().d("Engine.Interactivity.UICreation.NotchScreenSupport"), j7).a() : false;
            if (this.f22213y == null || (window = L().getWindow()) == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (!zA) {
                attributes.layoutInDisplayCutoutMode = 0;
                Y7.a.b().a(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            attributes.layoutInDisplayCutoutMode = 1;
            S().f0().d(window.getDecorView());
            if (this.f22208d == null) {
                this.f22208d = new Q(N());
            }
            this.f22208d.e(S(), S().f0().a());
        }
    }

    public void B(String str, boolean z7) {
    }

    @Override
    public Activity C() {
        return L();
    }

    public void H(boolean z7) {
        h7.l.g("ExperienceSession", "Ending game session with place ID " + this.f22202P);
        this.f22204R = false;
        J7.g.y().x(this);
        if (!z7) {
            NativeReportingInterface.applicationForegrounded();
        }
        l0(false);
        if (this.f22210i) {
            h7.l.k("ExperienceSession", "Trying to end the session but it has already ended.");
            return;
        }
        this.f22210i = true;
        h0();
        Bundle bundle = new Bundle();
        bundle.putInt("gameExitStatus", 102);
        if (j6.d.a().a1()) {
            bundle.putLong("placeId", this.f22214z.getLong("roblox_placeId"));
            bundle.putString("gameId", this.f22214z.getString("roblox_gameId"));
        }
        boolean zIsChangingConfigurations = L().isChangingConfigurations();
        StringBuilder sb = new StringBuilder();
        sb.append("onDestroy: shutdown = ");
        sb.append(!zIsChangingConfigurations);
        sb.append(", hasGameStarted = ");
        sb.append(this.f22211v);
        h7.l.g("ExperienceSession", sb.toString());
        if (!zIsChangingConfigurations && this.f22211v) {
            h7.l.g("ExperienceSession", "onDestroy: Call stopDataModel (SYNC) if the GL fragment is still there...");
            if (z7) {
                this.f22189C.j();
            } else {
                this.f22189C.D();
            }
        }
        L().runOnUiThread(new Runnable() {
            @Override
            public final void run() {
                this.f22178d.U();
            }
        });
        NativeGLJavaInterface.setExitImplementation((EngineExitJavaCallback2) null);
        this.f22213y.n(bundle);
        RobloxApplication.a().unregisterComponentCallbacks(this.f22190D);
        Future<?> future = this.f22207U;
        if (future != null && !future.isDone()) {
            this.f22207U.cancel(true);
        }
        ExecutorService executorService = this.f22206T;
        if (executorService != null) {
            executorService.shutdown();
        }
        X x7 = this.f22205S;
        if (x7 != null) {
            x7.Q();
            this.f22205S = null;
        }
    }

    public Activity L() {
        return this.f22213y.O();
    }

    public void M(String str) {
    }

    public Context N() {
        return this.f22213y.O();
    }

    @Override
    public com.roblox.client.V S() {
        return (com.roblox.client.S) L();
    }

    public boolean T() {
        d dVar = this.f22213y;
        if (dVar != null) {
            return dVar.a();
        }
        return false;
    }

    @Override
    public void a(long j7) {
        h7.l.g("ExperienceSession", krlBPZZeK.QMZAUJXvNs + j7);
        ViewTreeObserverOnGlobalLayoutListenerC2590G viewTreeObserverOnGlobalLayoutListenerC2590G = this.f22190D;
        if (viewTreeObserverOnGlobalLayoutListenerC2590G != null) {
            viewTreeObserverOnGlobalLayoutListenerC2590G.I(j7);
        }
        this.f22195I = SystemClock.elapsedRealtime();
    }

    @Override
    public void b(boolean z7) {
        this.f22213y.b(z7);
    }

    public void b0(boolean z7) {
        h7.l.g("ExperienceSession", "onGameEnded: success = " + z7 + ", hasGameStarted = " + this.f22211v);
        this.f22211v = false;
    }

    @Override
    public void c(long j7) {
        h7.l.g("ExperienceSession", "onGameStarting: placeId = " + j7);
        this.f22193G.p().b();
    }

    public void c0() {
        h7.l.a("ExperienceSession", "onSurfaceCreated: finished = " + this.f22210i);
        NativeGLInterface.setTaskSchedulerBackgroundMode(false, "ES.onSurfaceCreated");
    }

    @Override
    public void d(long j7, String str) {
        this.f22192F.n(j7, str);
    }

    public void d0() {
        h7.l.a("ExperienceSession", "onSurfaceDestroyed: finished = " + this.f22210i);
    }

    @Override
    public void e(int i7) {
        if (this.f22196J == null) {
            this.f22196J = new e();
        }
        this.f22196J.e(Integer.valueOf(i7));
    }

    public void e0() {
        if (j6.d.a().V2() && J7.g.y().i()) {
            h7.l.g("ExperienceSession", "Not pausing game session, user is in a call");
            this.f22204R = true;
            return;
        }
        h7.l.g("ExperienceSession", "Pause game session");
        this.f22193G.p().d();
        l0(true);
        j0();
        g0();
    }

    @Override
    public void f(long j7, String str, String str2) {
        this.f22192F.p(j7, str, str2);
    }

    public void f0(Runnable runnable) {
        this.f22191E.post(runnable);
    }

    @Override
    public void g(final int i7) {
        f0(new Runnable() {
            @Override
            public final void run() {
                this.f22182d.Y(i7);
            }
        });
    }

    @Override
    public void h(long j7) {
        d dVar;
        h7.l.g("ExperienceSession", "onGameStarted: placeId = " + j7);
        this.f22211v = true;
        this.f22193G.p().a();
        if (!j6.d.a().X1() || (dVar = this.f22213y) == null) {
            return;
        }
        dVar.A();
    }

    @Override
    public void i(String str, String str2, String str3) {
        C2366n.g(this.f22213y.O(), str, str2, str3);
    }

    public void i0() {
        h7.l.g("ExperienceSession", "Resume game session");
        this.f22204R = false;
        k0(true);
        F();
        this.f22193G.p().e();
    }

    @Override
    public void j() {
        h7.l.g("ExperienceSession", "onSettingsNotLoaded (detected from Game fragment)");
        if (L().isFinishing()) {
            return;
        }
        L().setResult(103);
        H(false);
    }

    public void k(String str) {
        ka.e.q(str);
    }

    public void l(String str) {
        if (j6.d.a().H0()) {
            ka.e.h(str);
        } else {
            ka.e.i(str);
        }
    }

    @Override
    public void m(long j7, String str, String str2) {
        this.f22192F.o(j7, str, str2);
    }

    public void m0(d dVar) {
        this.f22213y = dVar;
    }

    @Override
    public void o(int i7) {
        ((com.roblox.client.V) L()).o(i7);
    }

    public void p0() {
        h7.l.g("ExperienceSession", "Start game session");
        this.f22191E = new Handler(Looper.getMainLooper());
        this.f22192F = new IAPPurchaseManager(this, false);
        I();
        L().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public final void onSystemUiVisibilityChange(int i7) {
                this.f22179a.Z(i7);
            }
        });
        Q();
        Bundle bundle = this.f22214z;
        this.f22200N = (ViewGroup) L().findViewById(com.roblox.client.J.f19522e);
        o0(0L);
        if (!S.j()) {
            this.f22213y.I();
        }
        this.f22193G = C2374w.h();
        C2594K c2594k = new C2594K(bundle);
        this.f22202P = bundle.getLong("roblox_placeId", 0L);
        a0.Q0();
        if (!f22186V) {
            f22186V = true;
            NativeGLInterface.nativeGameGlobalInit();
        }
        a0.P0();
        SurfaceHolderCallbackC2587D surfaceHolderCallbackC2587D = new SurfaceHolderCallbackC2587D(this, c2594k);
        this.f22189C = surfaceHolderCallbackC2587D;
        surfaceHolderCallbackC2587D.A(null, null, null);
        R(this.f22200N);
        n0(this.f22202P);
        if (!j6.d.a().S0()) {
            this.f22201O = this.f22190D;
            this.f22200N.getViewTreeObserver().addOnGlobalLayoutListener(this.f22201O);
        }
        k0(false);
        NativeReportingInterface.applicationBackgrounded();
        L().getWindow().addFlags(128);
        J7.g.y().g(this);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f22206T = executorServiceNewSingleThreadExecutor;
        this.f22207U = C2373v.a(executorServiceNewSingleThreadExecutor, new Runnable() {
            @Override
            public final void run() {
                this.f22180d.a0();
            }
        });
    }

    public void q(String str) {
    }

    @Override
    public void r(String str) {
        ((com.roblox.client.V) L()).r(str);
    }

    public void u(String str, String str2, String str3, String str4, String str5, String str6) {
        if (this.f22203Q) {
            h7.l.g("ExperienceSession", "Call init, starting foreground service " + str2);
            if (Long.toString(g7.c.c().j()).equals(str3)) {
                str5 = str6;
            } else if (!Long.toString(g7.c.c().j()).equals(str4)) {
                h7.l.g("ExperienceSession", "Init call does not represent current user");
                return;
            }
            androidx.core.content.a.m(N(), RealtimeNotificationForegroundService.b(N(), str2, str5, str));
        }
    }

    public void v(String str, String str2, String str3, String str4, String str5, String str6) {
        if (this.f22203Q) {
            h7.l.g("ExperienceSession", "Call active, starting foreground service " + str2);
            if (Long.toString(g7.c.c().j()).equals(str3)) {
                str5 = str6;
            } else if (!Long.toString(g7.c.c().j()).equals(str4)) {
                h7.l.g("ExperienceSession", "Active call does not represent current user");
                return;
            }
            androidx.core.content.a.m(N(), RealtimeNotificationForegroundService.b(N(), str2, str5, str));
        }
    }

    public void x(String str, String str2) {
        if (this.f22204R) {
            this.f22191E.post(new a());
            this.f22204R = false;
        }
    }
}
