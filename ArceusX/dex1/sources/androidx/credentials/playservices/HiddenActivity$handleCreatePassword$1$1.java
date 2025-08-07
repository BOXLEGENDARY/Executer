package androidx.credentials.playservices;

import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "it", "Lcom/google/android/gms/auth/api/identity/SavePasswordResult;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class HiddenActivity$handleCreatePassword$1$1 extends l implements Function1<SavePasswordResult, Unit> {
    final int $requestCode;
    final HiddenActivity this$0;

    HiddenActivity$handleCreatePassword$1$1(HiddenActivity hiddenActivity, int i7) {
        super(1);
        this.this$0 = hiddenActivity;
        this.$requestCode = i7;
    }

    public Object invoke(Object obj) throws IntentSender.SendIntentException {
        invoke((SavePasswordResult) obj);
        return Unit.a;
    }

    public final void invoke(SavePasswordResult savePasswordResult) throws IntentSender.SendIntentException {
        try {
            this.this$0.mWaitingForActivityResult = true;
            this.this$0.startIntentSenderForResult(savePasswordResult.l().getIntentSender(), this.$requestCode, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e7) {
            HiddenActivity hiddenActivity = this.this$0;
            ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
            Intrinsics.d(resultReceiver);
            hiddenActivity.setupFailure(resultReceiver, CredentialProviderBaseController.CREATE_UNKNOWN, "During save password, found UI intent sender failure: " + e7.getMessage());
        }
    }
}
