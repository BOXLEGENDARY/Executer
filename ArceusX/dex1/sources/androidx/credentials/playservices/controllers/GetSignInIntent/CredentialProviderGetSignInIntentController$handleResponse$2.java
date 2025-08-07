package androidx.credentials.playservices.controllers.GetSignInIntent;

import C0.m;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LC0/m;", "e", BuildConfig.FLAVOR, "invoke", "(LC0/m;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CredentialProviderGetSignInIntentController$handleResponse$2 extends l implements Function1<m, Unit> {
    final CredentialProviderGetSignInIntentController this$0;

    CredentialProviderGetSignInIntentController$handleResponse$2(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        super(1);
        this.this$0 = credentialProviderGetSignInIntentController;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, m mVar) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentController, "this$0");
        Intrinsics.checkNotNullParameter(mVar, "$e");
        credentialProviderGetSignInIntentController.getCallback().a(mVar);
    }

    public Object invoke(Object obj) {
        invoke((m) obj);
        return Unit.a;
    }

    public final void invoke(final m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "e");
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$2.invoke$lambda$0(credentialProviderGetSignInIntentController, mVar);
            }
        });
    }
}
