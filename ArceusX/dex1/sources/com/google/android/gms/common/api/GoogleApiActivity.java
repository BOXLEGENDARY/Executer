package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C1818c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C1803c;
import n3.C2651i;

public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    protected int f14051d = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i7, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i7);
        intent.putExtra("notify_manager", z7);
        return intent;
    }

    private final void b() throws Resources.NotFoundException, IntentSender.SendIntentException {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            C1818c.n().o(this, ((Integer) C2651i.l(num)).intValue(), 2, this);
            this.f14051d = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.f14051d = 1;
        } catch (ActivityNotFoundException e7) {
            if (extras.getBoolean("notify_manager", true)) {
                C1803c.v(this).H(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String strConcat = "Activity not found while launching " + pendingIntent.toString() + ".";
                if (Build.FINGERPRINT.contains("generic")) {
                    strConcat = strConcat.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e("GoogleApiActivity", strConcat, e7);
            }
            this.f14051d = 1;
            finish();
        } catch (IntentSender.SendIntentException e8) {
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e8);
            finish();
        }
    }

    @Override
    protected final void onActivityResult(int i7, int i8, Intent intent) throws Resources.NotFoundException {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f14051d = 0;
            setResult(i8, intent);
            if (booleanExtra) {
                C1803c c1803cV = C1803c.v(this);
                if (i8 == -1) {
                    c1803cV.I();
                } else if (i8 == 0) {
                    c1803cV.H(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i7 == 2) {
            this.f14051d = 0;
            setResult(i8, intent);
        }
        finish();
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        this.f14051d = 0;
        setResult(0);
        finish();
    }

    @Override
    protected final void onCreate(Bundle bundle) throws Resources.NotFoundException, IntentSender.SendIntentException {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f14051d = bundle.getInt("resolution");
        }
        if (this.f14051d != 1) {
            b();
        }
    }

    @Override
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f14051d);
        super.onSaveInstanceState(bundle);
    }
}
