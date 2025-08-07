package m6;

import H3.QdLC.QcdySgfdST;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.ActivityC1663h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.a0;
import com.roblox.client.n0;
import h6.C2479a;
import java.util.concurrent.Executors;
import m6.C2617t;

public class C2593J {

    private C2617t f22126b;

    private b f22125a = b.GAME_STATE_NONE;

    private long f22127c = 0;

    class a implements Runnable {

        final Activity f22128d;

        final C2591H f22129e;

        a(Activity activity, C2591H c2591h) {
            this.f22128d = activity;
            this.f22129e = c2591h;
        }

        @Override
        public void run() {
            FragmentManager supportFragmentManager = ((ActivityC1663h) this.f22128d).getSupportFragmentManager();
            Fragment fragmentK0 = ((ActivityC1663h) this.f22128d).getSupportFragmentManager().k0(C2479a.class.getName());
            if (fragmentK0 == null || supportFragmentManager.Q0()) {
                h7.l.d("GameManager", "Gaming protocol is trying to send launch request when game is running.");
            } else {
                androidx.fragment.app.B bP = supportFragmentManager.p();
                bP.m(fragmentK0);
                bP.g();
            }
            if (C2593J.this.f22126b != null || supportFragmentManager.Q0()) {
                h7.l.d("GameManager", "Gaming protocol is trying to send launch request when game is running.");
                return;
            }
            C2617t c2617tE = C2593J.this.e(this.f22128d, this.f22129e);
            C2593J.this.f22126b = c2617tE;
            c2617tE.m0((C2617t.d) this.f22128d);
            c2617tE.p0();
        }
    }

    enum b {
        GAME_STATE_NONE,
        GAME_STATE_STARTED,
        GAME_STATE_ENDED
    }

    public C2617t e(Context context, C2591H c2591h) {
        Bundle bundle = new Bundle();
        bundle.putLong("roblox_placeId", c2591h.o());
        bundle.putLong("roblox_userId", c2591h.t());
        bundle.putLong("roblox_conversationId", c2591h.f());
        bundle.putString("roblox_accessCode", c2591h.d());
        bundle.putString("roblox_linkCode", c2591h.n());
        bundle.putString("roblox_gameId", c2591h.h());
        bundle.putString("roblox_reservedServerAccessCode", c2591h.s());
        bundle.putString("roblox_callId", c2591h.e());
        bundle.putInt("roblox_joinRequestType", c2591h.r());
        bundle.putString("roblox_referralPage", c2591h.p());
        bundle.putString("roblox_launchData", c2591h.m());
        bundle.putString("roblox_joinAttemptId", c2591h.k());
        bundle.putString("roblox_joinAttemptOrigin", c2591h.l());
        bundle.putString("roblox_isoContext", c2591h.j());
        if (j6.d.a().s0()) {
            bundle.putLong("roblox_referredByPlayerId", c2591h.q());
        }
        bundle.putString("roblox_gameJoinContext", c2591h.i());
        bundle.putString("roblox_event_id", c2591h.g());
        return new C2617t(bundle);
    }

    public void j(Activity activity, C2591H c2591h) {
        if (c2591h == null) {
            h7.l.k("GameManager", "launchGameWithParams: game-params is null. Just close this activity!");
            return;
        }
        h7.l.g("GameManager", "launchGameWithParams: Start game activity for placeId = " + c2591h.o());
        a0.Q(activity).edit().remove("ROBLOXCrash").apply();
        activity.runOnUiThread(new a(activity, c2591h));
        this.f22127c = System.currentTimeMillis();
        m();
    }

    public boolean f() {
        if (!n0.e().f()) {
            return true;
        }
        h7.l.g("GameManager", "canStartGame = false: Upgrade required");
        return false;
    }

    public void g(boolean z7) {
        h7.l.a("GameManager", "endGameSession");
        C2617t c2617t = this.f22126b;
        if (c2617t != null) {
            c2617t.H(true);
        } else {
            h7.l.d("GameManager", "Error: Try to end but no game session exists.");
        }
    }

    public boolean h() {
        return this.f22125a == b.GAME_STATE_ENDED;
    }

    public boolean i() {
        return this.f22125a == b.GAME_STATE_STARTED;
    }

    public void l(Context context) {
        h7.l.a("GameManager", "onGameEnded:");
        this.f22125a = b.GAME_STATE_ENDED;
        this.f22126b = null;
        o();
    }

    public void m() {
        h7.l.a("GameManager", "onGameStarted:");
        this.f22127c = System.currentTimeMillis();
        this.f22125a = b.GAME_STATE_STARTED;
    }

    public void n() {
        h7.l.a("GameManager", "pauseGameSession");
        C2617t c2617t = this.f22126b;
        if (c2617t != null) {
            c2617t.e0();
        } else {
            h7.l.d("GameManager", "Error: Try to pause but no game session exists.");
        }
    }

    public void o() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f22127c;
        h7.l.g("GameManager", "Game duration: " + jCurrentTimeMillis + "ms.");
        N5.a.e().m(jCurrentTimeMillis);
    }

    public void p() {
        h7.l.a("GameManager", "resumeGameSession");
        C2617t c2617t = this.f22126b;
        if (c2617t != null) {
            c2617t.i0();
        } else {
            h7.l.d("GameManager", "Error: Try to resume but no game session exists.");
        }
    }

    public void q(final Activity activity, final C2591H c2591h, int i7) {
        if (!f()) {
            h7.l.g("GameManager", "Game launch halted - Can't start game.");
            return;
        }
        h7.l.a("GameManager", QcdySgfdST.xfQC + i7);
        ((ActivityNativeMain) activity).T1(EnumC2597N.EXPERIENCE);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Executors.newSingleThreadExecutor().submit(new Runnable() {
                @Override
                public final void run() {
                    this.f22122d.j(activity, c2591h);
                }
            });
        } else {
            j(activity, c2591h);
        }
    }
}
