package androidx.credentials.playservices;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "result", "Landroid/app/PendingIntent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class HiddenActivity$handleCreatePublicKeyCredential$1$1 extends l implements Function1<PendingIntent, Unit> {
    final int $requestCode;
    final HiddenActivity this$0;

    HiddenActivity$handleCreatePublicKeyCredential$1$1(HiddenActivity hiddenActivity, int i7) {
        super(1);
        this.this$0 = hiddenActivity;
        this.$requestCode = i7;
    }

    public Object invoke(Object obj) throws IntentSender.SendIntentException {
        invoke((PendingIntent) obj);
        return Unit.a;
    }

    public final void invoke(PendingIntent pendingIntent) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(pendingIntent, "result");
        try {
            this.this$0.mWaitingForActivityResult = true;
            this.this$0.startIntentSenderForResult(pendingIntent.getIntentSender(), this.$requestCode, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e7) {
            HiddenActivity hiddenActivity = this.this$0;
            ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
            Intrinsics.d(resultReceiver);
            hiddenActivity.setupFailure(resultReceiver, CredentialProviderBaseController.CREATE_UNKNOWN, "During public key credential, found IntentSender failure on public key creation: " + e7.getMessage());
        }
    }
}
