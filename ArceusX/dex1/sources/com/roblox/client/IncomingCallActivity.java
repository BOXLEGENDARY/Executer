package com.roblox.client;

import J7.g;
import android.R;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.C1628l0;
import androidx.core.view.WindowInsetsCompat;
import g6.C2466b;
import org.greenrobot.eventbus.ThreadMode;

public class IncomingCallActivity extends androidx.appcompat.app.d implements androidx.core.view.I, g.a {

    private long f19484d;

    private String f19485e;

    private ImageView f19486i;

    private TextView f19487v;

    public static Intent f0(Context context, Intent intent, Intent intent2, long j7, String str) {
        return new Intent(context, (Class<?>) IncomingCallActivity.class).putExtra("EXTRA_ACCEPT_INTENT", intent).putExtra("EXTRA_DECLINE_INTENT", intent2).putExtra("EXTRA_CALLER_ID", j7).putExtra("EXTRA_CALLER_COMBINED_NAME", str);
    }

    public void g0(Intent intent, View view) {
        startService(intent);
        finish();
    }

    public void h0(Intent intent, View view) {
        startActivity(intent);
        ((KeyguardManager) getSystemService("keyguard")).requestDismissKeyguard(this, null);
        finish();
    }

    public void B(String str, boolean z7) {
    }

    @Override
    public WindowInsetsCompat K(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars() | WindowInsetsCompat.Type.statusBars());
        view.setPadding(0, insets.top, 0, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    public void M(String str) {
    }

    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onAvatarHeadshotsRetrievedEvent(C2466b c2466b) {
        if (c2466b.a().contains(Long.valueOf(this.f19484d))) {
            d8.t.p(this).k(U5.b.b().d(this.f19484d).a()).c(this.f19486i);
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (j6.d.a().Z0()) {
            android.view.r.a(this, android.view.I.a(0, 0), android.view.I.a(0, 0));
            setContentView(K.f19558d);
        } else {
            setContentView(K.f19559e);
            C1628l0.b(getWindow(), false);
            getWindow().setStatusBarColor(getResources().getColor(R.color.transparent));
            getWindow().setNavigationBarColor(getResources().getColor(R.color.transparent));
        }
        this.f19484d = getIntent().getLongExtra("EXTRA_CALLER_ID", 0L);
        this.f19485e = getIntent().getStringExtra("EXTRA_CALLER_COMBINED_NAME");
        final Intent intent = (Intent) getIntent().getParcelableExtra("EXTRA_ACCEPT_INTENT");
        final Intent intent2 = (Intent) getIntent().getParcelableExtra("EXTRA_DECLINE_INTENT");
        findViewById(J.f19492E).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f20265d.g0(intent2, view);
            }
        });
        findViewById(J.f19490C).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f19377d.h0(intent, view);
            }
        });
        if (!j6.d.a().Z0()) {
            androidx.core.view.Z.B0(findViewById(J.f19491D), this);
        }
        ImageView imageView = (ImageView) findViewById(J.f19493F);
        this.f19486i = imageView;
        imageView.setClipToOutline(true);
        this.f19487v = (TextView) findViewById(J.f19494G);
        if (j6.d.a().U()) {
            this.f19487v.setText(this.f19485e);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
        } else {
            getWindow().addFlags(6815873);
        }
        Wa.c.d().n(this);
        J7.g.y().g(this);
        if (this.f19484d > 0) {
            U5.a aVarD = U5.b.b().d(this.f19484d);
            if (aVarD == null) {
                E6.i.b().c(new y6.e(this.f19484d));
                return;
            }
            if (!j6.d.a().U()) {
                this.f19487v.setText(aVarD.d());
            }
            if (aVarD.a() == null) {
                E6.i.b().c(new y6.c(this.f19484d));
            } else {
                d8.t.p(this).k(aVarD.a()).c(this.f19486i);
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(false);
            setTurnScreenOn(false);
        } else {
            getWindow().clearFlags(6815873);
        }
        this.f19486i = null;
        this.f19487v = null;
        Wa.c.d().p(this);
        J7.g.y().x(this);
    }

    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onUserRetrievedEvent(g6.n nVar) {
        if (this.f19484d != nVar.a() || j6.d.a().U()) {
            return;
        }
        this.f19487v.setText(U5.b.b().d(this.f19484d).d());
    }

    public void q(String str) {
        finish();
    }

    public void u(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    public void v(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    public void x(String str, String str2) {
        finish();
    }
}
