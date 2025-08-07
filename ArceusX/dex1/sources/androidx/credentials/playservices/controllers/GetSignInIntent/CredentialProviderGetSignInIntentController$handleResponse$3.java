package androidx.credentials.playservices.controllers.GetSignInIntent;

import B0.Z;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import ya.HnSi.PLHvHoayk;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CredentialProviderGetSignInIntentController$handleResponse$3 extends l implements Function0<Unit> {
    final Z $response;
    final CredentialProviderGetSignInIntentController this$0;

    CredentialProviderGetSignInIntentController$handleResponse$3(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Z z7) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$response = z7;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Z z7) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentController, "this$0");
        Intrinsics.checkNotNullParameter(z7, PLHvHoayk.FfLVwF);
        credentialProviderGetSignInIntentController.getCallback().onResult(z7);
    }

    public Object invoke() {
        m35invoke();
        return Unit.a;
    }

    public final void m35invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        final Z z7 = this.$response;
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$3.invoke$lambda$0(credentialProviderGetSignInIntentController, z7);
            }
        });
    }
}
