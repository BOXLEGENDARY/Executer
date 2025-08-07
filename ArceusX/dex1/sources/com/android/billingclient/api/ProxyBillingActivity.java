package com.android.billingclient.api;

import H3.QdLC.QcdySgfdST;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.C2046c1;

public class ProxyBillingActivity extends Activity {

    private ResultReceiver f13382d;

    private ResultReceiver f13383e;

    private boolean f13384i;

    private boolean f13385v;

    private int f13386w;

    private Intent a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override
    protected void onActivityResult(int r8, int r9, android.content.Intent r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override
    protected void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            C2046c1.i("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f13384i = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f13382d = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f13383e = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f13385v = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f13386w = bundle.getInt("activity_code", 100);
            return;
        }
        C2046c1.i("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f13386w = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f13385v = true;
                this.f13386w = 110;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f13382d = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f13383e = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f13386w = 101;
        } else {
            pendingIntent = null;
        }
        try {
            this.f13384i = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f13386w, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e7) {
            C2046c1.k("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e7);
            ResultReceiver resultReceiver = this.f13382d;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f13383e;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentB = b();
                    if (this.f13385v) {
                        intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentB.putExtra(QcdySgfdST.xpzuuRfhut, 6);
                    intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentB);
                }
            }
            this.f13384i = false;
            finish();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f13384i) {
            Intent intentB = b();
            intentB.putExtra("RESPONSE_CODE", 1);
            intentB.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i7 = this.f13386w;
            if (i7 == 110 || i7 == 100) {
                intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(intentB);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f13382d;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f13383e;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f13384i);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f13385v);
        bundle.putInt("activity_code", this.f13386w);
    }
}
