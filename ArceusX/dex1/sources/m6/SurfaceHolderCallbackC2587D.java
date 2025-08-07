package m6;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.a0;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.StartGameParams;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.PlatformParams;
import f6.AsyncTaskC2446a;
import j0.tkB.pkcpMQSgx;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SurfaceHolderCallbackC2587D implements SurfaceHolder.Callback {

    private FrameLayout f22062A;

    public L6.c f22064C;

    private ExecutorService f22065D;

    private InterfaceC2598O f22066E;

    private C2617t f22067F;

    private C2594K f22068d;

    private FrameLayout f22070i;

    private SurfaceView f22074z;

    private final String f22069e = "rbx.game";

    private long f22071v = 0;

    private String f22072w = BuildConfig.FLAVOR;

    private boolean f22073y = false;

    private int f22063B = -1;

    private class a implements AsyncTaskC2446a.InterfaceC0189a {
        @Override
        public void a(int i7) {
            SurfaceHolderCallbackC2587D.this.f22074z.setVisibility(0);
        }

        private a() {
        }
    }

    public SurfaceHolderCallbackC2587D(C2617t c2617t, C2594K c2594k) {
        this.f22067F = c2617t;
        this.f22066E = c2617t;
        this.f22068d = c2594k;
    }

    private void B(final Runnable runnable) {
        o().execute(new Runnable() {
            @Override
            public final void run() {
                runnable.run();
            }
        });
    }

    private void C(C2594K c2594k) {
        h7.l.g("rbx.game", "startGame");
        Surface surface = this.f22074z.getHolder().getSurface();
        com.roblox.engine.jni.model.a aVar = new com.roblox.engine.jni.model.a(p());
        aVar.isTablet = a0.m0();
        this.f22066E.c(c2594k.f22137c);
        StartGameParams.Builder referredByPlayerId = StartGameParams.builder().setSurface(surface).setPlatformParams(aVar).setDeviceParams((DeviceParams) null).setPlaceId(c2594k.f22137c).setUserId(c2594k.f22136b).setAccessCode(c2594k.f22138d).setLinkCode(c2594k.f22139e).setGameId(c2594k.f22140f).setIsUnder13(g7.c.c().m()).setUsername(g7.c.c().k()).setConversationId(c2594k.f22141g).setReservedServerAccessCode(c2594k.f22142h).setCallId(c2594k.f22143i).setJoinRequestType(c2594k.f22135a).setReferralPage(c2594k.f22144j).setLaunchData(c2594k.f22145k).setJoinAttemptId(c2594k.f22148n).setJoinAttemptOrigin(c2594k.f22149o).setIsoContext(c2594k.f22150p).setReferredByPlayerId(c2594k.f22151q);
        if (a0.C0()) {
            referredByPlayerId.setVrContext(q());
        }
        referredByPlayerId.setGameJoinContext(c2594k.f22146l);
        referredByPlayerId.setEventId(c2594k.f22147m);
        q().runOnUiThread(new Runnable() {
            @Override
            public final void run() {
                this.f22060d.v();
            }
        });
        NativeGLInterface.nativeAppBridgeV2StartGameWithParam(referredByPlayerId.build());
        q().runOnUiThread(new Runnable() {
            @Override
            public final void run() {
                this.f22061d.w();
            }
        });
        this.f22066E.h(c2594k.f22137c);
    }

    public void x() {
        h7.l.g("rbx.game", "stopDataModel: dataModel = GAME, surfaceState = " + this.f22063B + ", graphicsStarted = " + this.f22073y);
        this.f22074z.getHolder().removeCallback(this);
        this.f22063B = -1;
    }

    private void F() {
        h7.l.g("rbx.game", "surfaceDestroyed: surfaceState = " + this.f22063B + ", graphicsStarted = " + this.f22073y);
        if (this.f22063B != 2) {
            return;
        }
        if (this.f22073y) {
            this.f22073y = false;
            NativeGLInterface.nativeAppBridgeV2PauseGame();
        }
        com.roblox.client.S sQ = q();
        if (sQ == null || sQ.isFinishing()) {
            return;
        }
        h7.l.g("rbx.game", "surfaceDestroyed() activity finishing ignore task scheduler");
        this.f22067F.d0();
    }

    public void G() {
        h7.l.g("rbx.game", "updateSurface() surfaceState = " + this.f22063B);
        com.roblox.client.S sQ = q();
        if (sQ == null || sQ.isFinishing() || sQ.isDestroyed()) {
            h7.l.g("rbx.game", "updateSurface() activity finishing ignore update");
            return;
        }
        int i7 = this.f22063B;
        if (i7 == 0) {
            this.f22063B = 2;
            this.f22073y = true;
            C(this.f22068d);
            return;
        }
        if (i7 == 2) {
            Surface surface = this.f22074z.getHolder().getSurface();
            PlatformParams platformParams = new PlatformParams();
            if (j6.d.a().X()) {
                float fM = m();
                Point pointG = B7.a.g(n().N());
                platformParams.dpiScale = fM;
                platformParams.viewportWidthMm = pointG.x;
                platformParams.viewportHeightMm = pointG.y;
            }
            if (this.f22073y) {
                h7.l.g("rbx.game", "updateSurface: nativeUpdateGraphics");
                if (j6.d.a().X()) {
                    NativeGLInterface.nativeAppBridgeV2UpdateSurfaceGameWithPlatformParams(surface, platformParams, a0.k0() ? q() : null);
                    return;
                } else {
                    NativeGLInterface.nativeAppBridgeV2UpdateSurfaceGameNew(surface, m(), a0.k0() ? q() : null);
                    return;
                }
            }
            h7.l.g("rbx.game", "updateSurface: nativeStartUpGraphics");
            this.f22073y = true;
            if (j6.d.a().X()) {
                NativeGLInterface.nativeAppBridgeV2ResumeGameWithPlatformParams(surface, platformParams, a0.k0() ? q() : null);
            } else {
                NativeGLInterface.nativeAppBridgeV2ResumeGameNew(surface, m(), a0.k0() ? q() : null);
            }
        }
    }

    private ExecutorService o() {
        if (this.f22065D == null) {
            this.f22065D = Executors.newSingleThreadExecutor();
        }
        return this.f22065D;
    }

    private PlatformParams p() {
        String strH = k7.h.h();
        if (TextUtils.isEmpty(strH)) {
            strH = k7.h.j().s(l());
        }
        h7.l.a("rbx.game", "getPlatformParams: assetFolderPath = " + strH);
        PlatformParams platformParams = new PlatformParams();
        platformParams.assetFolderPath = strH;
        platformParams.isTouchDevice = q().getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        platformParams.isMouseDevice = q().getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.isKeyboardDevice = q().getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.dpiScale = m();
        if (j6.d.a().X()) {
            Point pointG = B7.a.g(n().N());
            platformParams.viewportWidthMm = pointG.x;
            platformParams.viewportHeightMm = pointG.y;
        }
        return platformParams;
    }

    private void s(View view) {
        h7.l.a("rbx.game", pkcpMQSgx.echaZNuMnFsgR);
        SurfaceView surfaceView = (SurfaceView) q().findViewById(com.roblox.client.J.f19511X);
        this.f22074z = surfaceView;
        surfaceView.setFocusable(true);
        this.f22074z.setFocusableInTouchMode(true);
        this.f22074z.getHolder().addCallback(this);
        if (n().T()) {
            surfaceCreated(null);
            surfaceChanged(null, 0, 0, 0);
        }
    }

    public void t() {
        x();
        NativeGLInterface.nativeAppBridgeV2LeaveGame();
    }

    public void v() {
        this.f22070i.setVisibility(0);
    }

    public void w() {
        if (q().isDestroyed()) {
            return;
        }
        this.f22070i.setVisibility(8);
    }

    public void y() {
        this.f22067F.c0();
    }

    public void z() {
        if (q() == null) {
            return;
        }
        F();
    }

    public View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h7.l.a("rbx.game", "onCreateView: savedInstanceState = " + bundle + ", surfaceState = " + this.f22063B);
        if (!com.roblox.client.startup.a.k() && bundle != null) {
            h7.l.k("rbx.game", "onCreateView: No Settings with non-null savedInstanceState. No need to create view.");
            this.f22066E.j();
            return null;
        }
        this.f22064C = M6.i.n0(l());
        this.f22062A = (FrameLayout) q().findViewById(com.roblox.client.J.f19522e);
        if (a0.g0() && bundle != null && this.f22063B == 2) {
            h7.l.g("rbx.game", "onCreateView: The game is being recreated. Keep the current surface state.");
        } else {
            this.f22063B = 0;
        }
        this.f22070i = (FrameLayout) this.f22062A.findViewById(com.roblox.client.J.f19499L);
        s(null);
        AsyncTaskC2446a.b(new a()).a();
        return null;
    }

    public void D() {
        B(new Runnable() {
            @Override
            public final void run() {
                this.f22223d.x();
            }
        });
    }

    public void j() {
        B(new Runnable() {
            @Override
            public final void run() {
                this.f22220d.t();
            }
        });
    }

    public FrameLayout k() {
        return this.f22062A;
    }

    public Context l() {
        return n().N();
    }

    public float m() {
        return B7.a.c(n().N());
    }

    public C2617t n() {
        return this.f22067F;
    }

    public com.roblox.client.S q() {
        return (com.roblox.client.S) this.f22067F.L();
    }

    public SurfaceView r() {
        return this.f22074z;
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        h7.l.g("rbx.game", "surfaceChanged: ...");
        B(new Runnable() {
            @Override
            public final void run() {
                this.f22224d.G();
            }
        });
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        h7.l.g("rbx.game", "surfaceCreated: ...");
        B(new Runnable() {
            @Override
            public final void run() {
                this.f22221d.y();
            }
        });
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) throws ExecutionException, InterruptedException {
        try {
            this.f22065D.submit(new Runnable() {
                @Override
                public final void run() {
                    this.f22222d.z();
                }
            }).get();
        } catch (Exception unused) {
            h7.l.g("rbx.game", "game thread times out");
        }
    }
}
