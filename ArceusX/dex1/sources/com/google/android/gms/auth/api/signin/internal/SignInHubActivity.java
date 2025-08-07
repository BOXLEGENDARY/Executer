package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.ActivityC1663h;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import j3.n;

public class SignInHubActivity extends ActivityC1663h {

    private static boolean f14020y;

    private boolean f14021d = false;

    private SignInConfiguration f14022e;

    private boolean f14023i;

    private int f14024v;

    private Intent f14025w;

    private final void f0() {
        getSupportLoaderManager().c(0, null, new b(this, null));
        f14020y = false;
    }

    private final void g0(int i7) {
        Status status = new Status(i7);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f14020y = false;
    }

    private final void h0(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f14022e);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f14021d = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            g0(17);
        }
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override
    protected final void onActivityResult(int i7, int i8, Intent intent) {
        if (this.f14021d) {
            return;
        }
        setResult(0);
        if (i7 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.l() != null) {
                GoogleSignInAccount googleSignInAccountL = signInAccount.l();
                if (googleSignInAccountL == null) {
                    Log.e("AuthSignInClient", "Google account is null");
                    g0(12500);
                    return;
                }
                n.a(this).c(this.f14022e.l(), googleSignInAccountL);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccountL);
                this.f14023i = true;
                this.f14024v = i8;
                this.f14025w = intent;
                f0();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                g0(intExtra);
                return;
            }
        }
        g0(8);
    }

    @Override
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            g0(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            g0(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f14022e = signInConfiguration;
        if (bundle == null) {
            if (f14020y) {
                setResult(0);
                g0(12502);
                return;
            } else {
                f14020y = true;
                h0(action);
                return;
            }
        }
        boolean z7 = bundle.getBoolean("signingInGoogleApiClients");
        this.f14023i = z7;
        if (z7) {
            this.f14024v = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            if (intent2 != null) {
                this.f14025w = intent2;
                f0();
            } else {
                Log.e("AuthSignInClient", "Sign in result data cannot be null");
                setResult(0);
                finish();
            }
        }
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        f14020y = false;
    }

    @Override
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f14023i);
        if (this.f14023i) {
            bundle.putInt("signInResultCode", this.f14024v);
            bundle.putParcelable("signInResultData", this.f14025w);
        }
    }
}
