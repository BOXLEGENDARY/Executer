package androidx.credentials.playservices.controllers.BeginSignIn;

import C0.m;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CredentialProviderBeginSignInController$handleResponse$5 extends l implements Function0<Unit> {
    final m $e;
    final CredentialProviderBeginSignInController this$0;

    CredentialProviderBeginSignInController$handleResponse$5(CredentialProviderBeginSignInController credentialProviderBeginSignInController, m mVar) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$e = mVar;
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, m mVar) {
        Intrinsics.checkNotNullParameter(credentialProviderBeginSignInController, "this$0");
        Intrinsics.checkNotNullParameter(mVar, "$e");
        credentialProviderBeginSignInController.getCallback().a(mVar);
    }

    public Object invoke() {
        m17invoke();
        return Unit.a;
    }

    public final void m17invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        final m mVar = this.$e;
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$5.invoke$lambda$0(credentialProviderBeginSignInController, mVar);
            }
        });
    }
}
