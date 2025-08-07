package androidx.credentials.playservices.controllers.GetSignInIntent;

import C0.m;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CredentialProviderGetSignInIntentController$handleResponse$4 extends l implements Function0<Unit> {
    final y<m> $exception;
    final CredentialProviderGetSignInIntentController this$0;

    CredentialProviderGetSignInIntentController$handleResponse$4(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, y<m> yVar) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$exception = yVar;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, y yVar) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentController, "this$0");
        Intrinsics.checkNotNullParameter(yVar, "$exception");
        credentialProviderGetSignInIntentController.getCallback().a(yVar.d);
    }

    public Object invoke() {
        m37invoke();
        return Unit.a;
    }

    public final void m37invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        final y<m> yVar = this.$exception;
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$4.invoke$lambda$0(credentialProviderGetSignInIntentController, yVar);
            }
        });
    }
}
