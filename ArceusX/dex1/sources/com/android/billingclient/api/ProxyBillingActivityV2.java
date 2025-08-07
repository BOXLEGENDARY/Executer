package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.ComponentActivity;
import android.view.result.ActivityResult;
import android.view.result.IntentSenderRequest;
import com.google.android.gms.internal.play_billing.C2046c1;
import e.AbstractC2403c;
import e.InterfaceC2401a;

public class ProxyBillingActivityV2 extends ComponentActivity {

    private AbstractC2403c f13387d;

    private AbstractC2403c f13388e;

    private ResultReceiver f13389i;

    private ResultReceiver f13390v;

    final void Z(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int iB = C2046c1.e(data, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f13389i;
        if (resultReceiver != null) {
            resultReceiver.send(iB, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || iB != 0) {
            C2046c1.j("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + activityResult.getResultCode() + " and billing's responseCode: " + iB);
        }
        finish();
    }

    final void a0(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int iB = C2046c1.e(data, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f13390v;
        if (resultReceiver != null) {
            resultReceiver.send(iB, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || iB != 0) {
            C2046c1.j("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(activityResult.getResultCode()), Integer.valueOf(iB)));
        }
        finish();
    }

    @Override
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13387d = registerForActivityResult(new f.l(), new InterfaceC2401a() {
            @Override
            public final void a(Object obj) {
                this.f13378a.Z((ActivityResult) obj);
            }
        });
        this.f13388e = registerForActivityResult(new f.l(), new InterfaceC2401a() {
            @Override
            public final void a(Object obj) {
                this.f13379a.a0((ActivityResult) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f13389i = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f13390v = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        C2046c1.i("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f13389i = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f13387d.b(new IntentSenderRequest.a(pendingIntent).a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f13390v = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f13388e.b(new IntentSenderRequest.a(pendingIntent2).a());
        }
    }

    @Override
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f13389i;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f13390v;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
