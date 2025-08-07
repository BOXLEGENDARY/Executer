package com.roblox.client;

import E6.f;
import Za.qhkq.dHkZSUxHu;
import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.AbstractC1694h;
import android.view.InterfaceC1700n;
import android.view.InterfaceC1711y;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.client.e0;
import com.roblox.engine.jni.NativeGLInterface;
import g6.C2468d;
import g6.C2472h;
import org.greenrobot.eventbus.ThreadMode;

public class RobloxWebActivity extends S implements f.e {

    protected int f19833H;

    protected int f19834I;

    protected Toolbar f19835J;

    private DataModelFocusLifecycleObserver f19836K = new DataModelFocusLifecycleObserver();

    public class DataModelFocusLifecycleObserver implements InterfaceC1700n {
        public DataModelFocusLifecycleObserver() {
        }

        @InterfaceC1711y(AbstractC1694h.a.ON_CREATE)
        public void onFragmentCreated() {
            h7.l.a(GObvYfBKohxpYX.rGtpooE, "onFragmentCreated");
            m7.a aVar = new m7.a(false);
            NativeGLInterface.nativeBroadcastEventWithNamespace(((m7.c) aVar).a, ((m7.c) aVar).b, ((m7.c) aVar).c);
        }

        @InterfaceC1711y(AbstractC1694h.a.ON_DESTROY)
        public void onFragmentDestroyed() {
            h7.l.a("RobloxActivity", "onFragmentDestroyed");
            m7.a aVar = new m7.a(true);
            NativeGLInterface.nativeBroadcastEventWithNamespace(((m7.c) aVar).a, ((m7.c) aVar).b, ((m7.c) aVar).c);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override
        public void onClick(View view) {
            RobloxWebActivity.this.finish();
            RobloxWebActivity robloxWebActivity = RobloxWebActivity.this;
            robloxWebActivity.overridePendingTransition(robloxWebActivity.f19833H, robloxWebActivity.f19834I);
        }
    }

    private void H0(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", str);
        intent.putExtra("PATH_EXTRA", str2);
        setResult(-1, intent);
        finish();
    }

    private void I0(String str) {
        Fragment fragmentK0 = getSupportFragmentManager().k0(e0.class.getName());
        if (fragmentK0 instanceof e0) {
            ((e0) fragmentK0).a0(str);
        }
    }

    private void K0() {
        Fragment fragmentK0 = getSupportFragmentManager().k0(e0.class.getName());
        if (fragmentK0 instanceof e0) {
            ((e0) fragmentK0).p();
        }
    }

    public void J0(long j7, long j8) {
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", "CHAT_TAG");
        if (j7 != -1) {
            intent.putExtra("CONVERSATION_ID_EXTRA", j7);
        }
        if (j8 != -1) {
            intent.putExtra("USER_ID_EXTRA", j8);
        }
        if (j8 != -1 || j7 != -1) {
            setResult(-1, intent);
        }
        finish();
    }

    @Override
    public void R(e7.f fVar) {
        ((RobloxToolbar) this.f19835J).R(fVar);
        super.R(fVar);
    }

    @Override
    public void i(int i7, Bundle bundle) {
        if (i7 == 2) {
            h7.l.g("RobloxActivity", "(RobloxWebActivity) handleNotification() Logout event...");
            Toast.makeText(this, M.f19668o, 0).show();
            if (Z6.c.a()) {
                E6.c.o();
            }
            w0(E6.c.f(bundle));
            return;
        }
        if (i7 != 101) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", "LAUNCH_GAME");
        intent.putExtra("game_init_params", bundle.getBundle("game_init_params"));
        setResult(-1, intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        e0 e0Var = (e0) getSupportFragmentManager().k0(e0.class.getName());
        if (e0Var == null || !e0Var.T()) {
            super.onBackPressed();
            overridePendingTransition(this.f19833H, this.f19834I);
        }
    }

    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onCloseOverlayEvent(C2468d c2468d) {
        finish();
    }

    @Override
    public void onCreate(Bundle bundle) {
        String stringExtra;
        boolean booleanExtra;
        boolean booleanExtra2;
        String string;
        Fragment e0Var;
        super.onCreate(bundle);
        setContentView(K.f19562h);
        Intent intent = getIntent();
        if (intent != null) {
            stringExtra = intent.getStringExtra("URL_EXTRA");
            string = intent.getStringExtra(dHkZSUxHu.zXgYIgZK);
            booleanExtra = intent.getBooleanExtra("SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA", false);
            booleanExtra2 = intent.getBooleanExtra("USE_GENERIC_WEB_FRAG_EXTRA", false);
        } else {
            stringExtra = null;
            booleanExtra = false;
            booleanExtra2 = false;
            string = null;
        }
        if (stringExtra == null) {
            finish();
            return;
        }
        this.f19835J = (Toolbar) findViewById(J.f19519c0);
        Bundle bundle2 = new Bundle();
        if (booleanExtra2) {
            e0Var = C2374w.h().b();
            bundle2.putString("TITLE_STRING", string);
            bundle2.putBoolean("HAS_PARENT", true);
            bundle2.putBoolean("HIDE_ACCESSORY_BUTTONS", intent.getBooleanExtra("HIDE_ACCESSORY_BUTTONS_EXTRA", false));
            bundle2.putString("SEARCH_PARAMS", intent.getStringExtra("SEARCH_PARAMS"));
            this.f19835J.setVisibility(8);
            this.f19833H = 0;
            this.f19834I = 0;
        } else {
            e0Var = new e0();
            Toolbar toolbar = this.f19835J;
            if (string == null) {
                string = getString(M.f19589E);
            }
            toolbar.setTitle(string);
            if (a0.l0()) {
                this.f19835J.setSubtitle(a0.d(this));
            }
            Toolbar toolbar2 = this.f19835J;
            if (toolbar2 instanceof RobloxToolbar) {
                ((RobloxToolbar) toolbar2).setIconDelegate(new RobloxToolbar.c());
            } else {
                toolbar2.setNavigationIcon(I.f19465h);
            }
            this.f19835J.setNavigationOnClickListener(new a());
            if (NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
                this.f19833H = 0;
                this.f19834I = 0;
            } else {
                this.f19833H = R.anim.fade_in;
                this.f19834I = E.f19430a;
            }
        }
        if (booleanExtra) {
            e0Var.getLifecycle().a(this.f19836K);
        }
        androidx.fragment.app.B bP = getSupportFragmentManager().p();
        bundle2.putString("DEFAULT_URL", stringExtra);
        bundle2.putBoolean("USING_LOGIN_WEB_URL", intent.getBooleanExtra("USING_LOGIN_WEB_URL", false));
        e0Var.setArguments(bundle2);
        bP.b(J.f19529h0, e0Var, e0.class.getName());
        bP.g();
    }

    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(C2472h c2472h) {
        h7.l.a("RobloxActivity", "RWF.onNavigateToConversationEvent() " + c2472h.f20999a + " " + c2472h.f21000b);
        J0(c2472h.f20999a, c2472h.f21000b);
    }

    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(g6.i iVar) {
        if ("ABUSE_REPORT_TAG".equals(iVar.f21001a)) {
            C2366n.d(this, iVar.f21002b, false);
        } else if ("FRIEND_FINDER_TAG".equals(iVar.f21001a) || "UNIVERSAL_FRIENDS_TAG".equals(iVar.f21001a)) {
            C2366n.g(this, a0.N(), getString(M.f19601K), "{\"searchType\":\"Players\"}");
        } else {
            H0(iVar.f21001a, iVar.f21002b);
        }
    }

    @Wa.j
    public void onNavigateToLuaEvent(e0.g gVar) {
        finish();
    }

    @Wa.j
    public void onPushNotificationRegistrationFailedEvent(g6.k kVar) {
        if (kVar.a().equals("PushNotificationRegistrationFailed")) {
            Toast.makeText(this, getString(M.f19610O0), 0).show();
            K0();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        E6.f.c().b(this);
        Wa.c.d().n(this);
    }

    @Override
    protected void onStop() {
        E6.f.c().g(this);
        Wa.c.d().p(this);
        super.onStop();
    }

    @Wa.j(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onWebSearchEvent(g6.p r3) {
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.RobloxWebActivity.onWebSearchEvent(g6.p):void");
    }
}
