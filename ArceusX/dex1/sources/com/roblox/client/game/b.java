package com.roblox.client.game;

import Y3.qE.KpBmp;
import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.view.Surface;
import c7.M0;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.t;
import com.roblox.client.C2374w;
import com.roblox.client.RobloxApplication;
import com.roblox.client.a0;
import com.roblox.client.game.b;
import com.roblox.engine.jni.EngineJavaCallback2;
import com.roblox.engine.jni.EngineJavaCallbackWrapper;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.autovalue.InitParams;
import com.roblox.engine.jni.autovalue.StartAppParams;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.JavaHeapInfo;
import com.roblox.engine.jni.model.PlatformParams;
import com.roblox.universalapp.logging.LoggingProtocol;
import d6.C2400b;
import f6.AsyncTaskC2446a;
import h7.l;
import j0.tkB.pkcpMQSgx;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m6.T;
import org.fmod.FMOD;
import t7.g;
import y0.xyyu.hkVlaTTCDY;

public class b implements g.c {

    private static ScheduledExecutorService f20037k;

    private static Runtime f20038l;

    private d f20045g;

    private f f20046h;

    private e f20048j;

    public final String f20039a = hkVlaTTCDY.DXXUEBwyA;

    private boolean f20040b = false;

    private boolean f20041c = false;

    private boolean f20042d = false;

    private boolean f20043e = false;

    private boolean f20044f = false;

    private Vector<m7.b> f20047i = new Vector<>();

    class a implements h {

        final h f20049a;

        a(h hVar) {
            this.f20049a = hVar;
        }

        @Override
        public void a(int i7) {
            LoggingProtocol.h().c("update_setting_to_app_bridge_end");
            if (i7 == 0) {
                this.f20049a.a(0);
            } else {
                this.f20049a.a(1);
            }
        }
    }

    class C0178b implements h {

        final h f20051a;

        C0178b(h hVar) {
            this.f20051a = hVar;
        }

        @Override
        public void a(int i7) {
            if (i7 == 0) {
                b.this.f20041c = true;
            }
            h hVar = this.f20051a;
            if (hVar != null) {
                hVar.a(i7);
            }
        }
    }

    class c implements Runnable {

        final d f20053d;

        c(d dVar) {
            this.f20053d = dVar;
        }

        @Override
        public void run() {
            NativeGLInterface.initMaquettesSDK(this.f20053d.f20055a);
        }
    }

    public static class d {

        Activity f20055a;

        PlatformParams f20056b;

        DeviceParams f20057c;

        String f20058d;

        String f20059e;

        long f20060f;

        boolean f20061g;

        String f20062h;

        int f20063i;

        String f20064j;

        public DeviceParams a() {
            return this.f20057c;
        }

        public PlatformParams b() {
            return this.f20056b;
        }
    }

    public class e extends EngineJavaCallbackWrapper {
        public e(EngineJavaCallback2 engineJavaCallback2) {
            super(engineJavaCallback2);
        }

        public void f(String str, String str2) {
            if (str.equals("APP_READY")) {
                b.this.t(str2);
            }
            super.f(str, str2);
        }
    }

    public static class f extends AsyncTask<Void, Void, Integer> {

        private h f20066a;

        public final String f20067b = "rbx.appshell";

        public f(h hVar) {
            this.f20066a = hVar;
        }

        public static void c() {
            NativeGLInterface.nativeFetchLmkdProperties(T.a());
        }

        @Override
        public Integer doInBackground(Void... voidArr) {
            String strF;
            String strT = com.roblox.client.startup.a.t();
            if (strT == null || strT.isEmpty()) {
                return 1;
            }
            if (C2400b.a()) {
                strF = new Z6.a(RobloxApplication.a()).f();
                StringBuilder sb = new StringBuilder();
                sb.append("overridePayload = ");
                sb.append(strF);
                l.a("rbx.appshell", sb.toString() != null ? strF : "no overrides");
            } else {
                strF = null;
            }
            return Integer.valueOf(NativeGLInterface.nativeInitClientSettings(strT, strF, a0.I()));
        }

        @Override
        public void onPostExecute(Integer num) {
            if (num.intValue() == 0) {
                if (j6.d.a().L1()) {
                    ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    executorServiceNewSingleThreadExecutor.execute(new Runnable() {
                        @Override
                        public final void run() {
                            b.f.c();
                        }
                    });
                    executorServiceNewSingleThreadExecutor.shutdown();
                }
                b.J();
                if (j6.d.a().Q()) {
                    NativeGLInterface.nativePostClientSettingsLoadedInitialization3(M0.a(RobloxApplication.a()));
                } else {
                    NativeGLInterface.nativePostClientSettingsLoadedInitialization3(com.roblox.client.startup.d.s(RobloxApplication.a()).q());
                }
                l.g("rbx.appshell", "GetClientSettingsTask onPostExecute initialized TaskScheduler");
            }
            h hVar = this.f20066a;
            if (hVar != null) {
                hVar.a(num.intValue());
            }
        }
    }

    private static class g {

        static final b f20068a = new b();
    }

    public interface h {
        void a(int i7);
    }

    public static void J() {
        if (j6.d.a().m1()) {
            if (f20038l == null) {
                f20038l = Runtime.getRuntime();
            }
            if (f20037k == null) {
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                f20037k = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new Runnable() {
                    @Override
                    public final void run() {
                        com.roblox.client.game.b.q();
                    }
                }, 0L, j6.d.a().p2(), TimeUnit.SECONDS);
            }
        }
    }

    private void h() {
        if (this.f20042d) {
            l.g("rbx.appshell", "ASMA.destroy() ....");
            NativeGLInterface.nativeAppBridgeV2DestroyApp();
        }
        y();
    }

    private void i() {
        e eVar = this.f20048j;
        if (eVar != null) {
            NativeGLJavaInterface.setImplementation(eVar);
        }
    }

    public static b k() {
        return g.f20068a;
    }

    public static void o(t tVar, int i7) {
        LoggingProtocol.h().c("asset_unpack_end");
        tVar.D("asset finish");
    }

    public String p(Context context, h hVar) throws Exception {
        v(context, hVar, true);
        return "load setting finish";
    }

    public static void q() {
        try {
            long j7 = f20038l.totalMemory();
            long jFreeMemory = f20038l.freeMemory();
            long jMaxMemory = f20038l.maxMemory();
            JavaHeapInfo javaHeapInfo = new JavaHeapInfo();
            javaHeapInfo.mTotalMem = j7;
            javaHeapInfo.mFreeMem = jFreeMemory;
            javaHeapInfo.mMaxMem = jMaxMemory;
            javaHeapInfo.mUsedMem = j7 - jFreeMemory;
            NativeGLInterface.nativePassJavaHeapInfo(javaHeapInfo);
        } catch (Exception e7) {
            l.d("startFetchingJavaHeapInfo", "Error monitoring heap: " + e7.getMessage());
        }
    }

    private void v(Context context, h hVar, boolean z7) {
        if (!z7) {
            hVar.a(1);
            return;
        }
        H(context);
        LoggingProtocol.h().c("update_setting_to_app_bridge_start");
        s(new a(hVar));
    }

    private void x(Vector<m7.b> vector) {
        while (!vector.isEmpty()) {
            m7.b bVarRemove = vector.remove(0);
            l.a("rbx.appshell", "publishPendingReadyEvents() " + ((m7.c) bVarRemove).a + ", " + ((m7.c) bVarRemove).b + ", " + ((m7.c) bVarRemove).c + ", " + bVarRemove.d);
            NativeGLInterface.nativeAppBridgeV2SendAppEventOnAppReady(((m7.c) bVarRemove).a, ((m7.c) bVarRemove).b, ((m7.c) bVarRemove).c, bVarRemove.d);
        }
    }

    private void z() {
        f fVar = this.f20046h;
        if (fVar != null && !fVar.isCancelled()) {
            l.g(sMlEMqrxoGI.naQXILr, "ASMA.resetTask: Cancel the current (running) task...");
            fVar.cancel(true);
        }
        this.f20046h = null;
    }

    public void A(Context context, Surface surface) {
        B(context, surface, null);
    }

    public void B(Context context, Surface surface, Activity activity) {
        l.g(pkcpMQSgx.oLYTKqlg, "ASMA.restart");
        g();
        l(a0.C0() ? com.roblox.client.game.d.b(context, activity) : com.roblox.client.game.d.a(context));
        I(surface);
    }

    public void C() {
        i();
        NativeGLInterface.setTaskSchedulerBackgroundMode(false, "ASMA.start");
    }

    public void D(m7.c cVar) {
        if (this.f20040b) {
            NativeGLInterface.nativeAppBridgeV2SendAppEventOnGameLoaded(cVar.a, cVar.b, cVar.c);
        } else {
            l.k("rbx.appshell", "ASMA.sendAppEventOnGameLoaded: The manager is not yet setup. Ignore.");
        }
    }

    public void E(boolean z7) {
        D(new m7.a(z7));
    }

    public void F(m7.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f20047i.add(bVar);
        if (m()) {
            x(this.f20047i);
        }
    }

    public void G(EngineJavaCallback2 engineJavaCallback2) {
        e eVar = new e(engineJavaCallback2);
        this.f20048j = eVar;
        NativeGLJavaInterface.setImplementation(eVar);
    }

    public void H(Context context) {
        l.a("rbx.appshell", "ASMA.setup() " + this.f20040b);
        if (this.f20040b) {
            a0.O0();
            return;
        }
        this.f20040b = true;
        a0.Q0();
        FMOD.init(context);
        NativeGLInterface.nativeGameGlobalInit();
        a0.P0();
        NativeGLInterface.nativeUpdateAdapterInit();
    }

    public void I(Surface surface) {
        if (this.f20042d) {
            this.f20044f = true;
            C();
            d dVarJ = j();
            StartAppParams.Builder selectedTheme = StartAppParams.builder().setSurface(surface).setPlatformParams(dVarJ.f20056b).setAppStarterPlace(dVarJ.f20058d).setAppStarterScript(dVarJ.f20059e).setAppUserId(dVarJ.f20060f).setIsUnder13(dVarJ.f20061g).setUsername(dVarJ.f20062h).setMembershipType(dVarJ.f20063i).setSelectedTheme(dVarJ.f20064j);
            if (a0.C0()) {
                selectedTheme.setVrContext(dVarJ.f20055a);
            }
            NativeGLInterface.nativeAppBridgeV2StartAppWithParams(selectedTheme.build());
            if (a0.C0()) {
                Executors.newSingleThreadExecutor().execute(new c(dVarJ));
            }
        }
    }

    public void K() {
        String str = KpBmp.XLBmmjjtyAIw;
        l.a("rbx.appshell", str);
        if (this.f20042d && this.f20044f) {
            this.f20044f = false;
            NativeGLInterface.nativeAppBridgeV2PauseApp();
            if (C2374w.h().f().i()) {
                return;
            }
            NativeGLInterface.setTaskSchedulerBackgroundMode(true, str);
        }
    }

    public void L(Surface surface, float f7) {
        l.a("rbx.appshell", "ASMA.updateWindowHandle");
        if (this.f20042d) {
            NativeGLInterface.nativeAppBridgeV2UpdateSurfaceApp(surface, f7);
        }
    }

    public void M(Surface surface, float f7, int i7, int i8) {
        l.a("rbx.appshell", "ASMA.updateWindowHandleNew");
        if (this.f20042d) {
            PlatformParams platformParams = new PlatformParams();
            platformParams.dpiScale = f7;
            platformParams.viewportWidthMm = i7;
            platformParams.viewportHeightMm = i8;
            NativeGLInterface.nativeAppBridgeV2UpdateSurfaceAppWithPlatformParams(surface, platformParams);
        }
    }

    public void a() {
        l.g("rbx.appshell", "onCookieChanged.");
        a0.O0();
    }

    public void g() {
        synchronized (this) {
            h();
        }
    }

    public d j() {
        return this.f20045g;
    }

    public void l(d dVar) {
        l.g("rbx.appshell", "ASMA.initializeDataModel: mHasSettings:" + this.f20041c + ", mIsInitialized:" + this.f20042d);
        if (!this.f20041c || this.f20042d) {
            return;
        }
        i();
        l.a("rbx.appshell", "ASMA.initializeDataModel()");
        this.f20045g = dVar;
        this.f20042d = true;
        String strI = a0.i();
        InitParams.Builder isTablet = InitParams.builder().setPlatformParams(dVar.f20056b).setDeviceParams(dVar.f20057c).setBaseURL(strI).setUserAgent(a0.T0()).setIsTablet(a0.m0());
        if (j6.d.a().x2()) {
            isTablet.setBuildVariant(h7.h.a());
        }
        isTablet.setIsVrDevice(a0.k0());
        if (j6.d.a().C()) {
            if (k7.h.j().c) {
                E6.h.b().p("obb_fingerprint_missing");
            }
            if (k7.h.j().d) {
                E6.h.b().p("obb_unzip_failure");
            }
        }
        if (dVar.f20056b.assetFolderPath == null) {
            l.d("rbx.appshell", "Asset folder path is null");
        } else {
            l.g("rbx.appshell", "Asset folder path: " + dVar.f20056b.assetFolderPath);
        }
        if (j6.d.a().F0() && dVar.f20056b.assetFolderPath == null) {
            throw new RuntimeException("Asset folder path is null");
        }
        NativeGLInterface.nativeAppBridgeV2InitWithParams(isTablet.build());
    }

    public boolean m() {
        return this.f20043e;
    }

    public boolean n() {
        return this.f20042d;
    }

    public void r(final Context context, final h hVar) {
        l.g("rbx.appshell", "ASMA.loadAllAppSettings()");
        final t tVarH = t.H();
        LoggingProtocol.h().c("asset_unpack_begin");
        if (k7.h.k()) {
            tVarH.D("asset finish");
            LoggingProtocol.h().c("asset_unpack_end");
        } else {
            AsyncTaskC2446a.b(new AsyncTaskC2446a.InterfaceC0189a() {
                @Override
                public final void a(int i7) {
                    com.roblox.client.game.b.o(tVarH, i7);
                }
            }).a();
        }
        com.google.common.util.concurrent.l.c(com.roblox.client.startup.a.g(context), tVarH).a(new Callable() {
            @Override
            public final Object call() {
                return this.f22165d.p(context, hVar);
            }
        }, q.a());
    }

    public void s(h hVar) {
        l.a("rbx.appshell", "ASMA.loadSettings() " + this.f20041c);
        if (this.f20041c) {
            l.a("rbx.appshell", "ASMA.loadSettings() ... skipping because Init already does it!");
            if (hVar != null) {
                hVar.a(0);
                return;
            }
            return;
        }
        z();
        f fVar = new f(new C0178b(hVar));
        this.f20046h = fVar;
        fVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void t(String str) {
        l.a("rbx.appshell", "ASMA.onAppReady() " + str);
        this.f20043e = true;
        x(this.f20047i);
    }

    public void u() {
        NativeGLInterface.nativeHandleBackPressed();
    }

    public void w() {
        l.a("rbx.appshell", "ASMA.pause");
        if (this.f20042d) {
            l.g("rbx.appshell", "ASMA.pause(): Do nothing in AppBridge refactor!");
            if (C2374w.h().f().i()) {
                return;
            }
            NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ASMA.pause");
        }
    }

    public void y() {
        l.a("rbx.appshell", "ASMA.reset()");
        this.f20040b = false;
        this.f20042d = false;
        this.f20043e = false;
        this.f20045g = null;
        NativeGLJavaInterface.replaceImplementation(e.class, new EngineJavaCallback2());
        z();
        O7.a.a().c();
        if (j6.d.a().z1()) {
            return;
        }
        U7.e.n().p();
    }
}
