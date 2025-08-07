package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

public class PlayCoreDialogWrapperActivity extends Activity {

    private ResultReceiver f18776d;

    private final void a() {
        ResultReceiver resultReceiver = this.f18776d;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    @Override
    protected final void onActivityResult(int i7, int i8, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i7, i8, intent);
        if (i7 == 0 && (resultReceiver = this.f18776d) != null) {
            if (i8 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i8 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override
    protected final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            Intent intent2 = new Intent();
            intent2.putExtra("window_flags", intExtra);
            intent = intent2;
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle != null) {
            this.f18776d = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.f18776d = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle extras = getIntent().getExtras();
        PendingIntent pendingIntent = extras != null ? (PendingIntent) extras.get("confirmation_intent") : null;
        if (extras == null || pendingIntent == null) {
            a();
            finish();
        } else {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 0, intent, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                a();
                finish();
            }
        }
    }

    @Override
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f18776d);
    }
}
