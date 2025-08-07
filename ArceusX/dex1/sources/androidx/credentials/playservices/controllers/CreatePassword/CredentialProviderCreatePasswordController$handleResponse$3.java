package androidx.credentials.playservices.controllers.CreatePassword;

import B0.AbstractC0292c;
import B0.InterfaceC0300k;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CredentialProviderCreatePasswordController$handleResponse$3 extends l implements Function0<Unit> {
    final AbstractC0292c $response;
    final CredentialProviderCreatePasswordController this$0;

    CredentialProviderCreatePasswordController$handleResponse$3(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, AbstractC0292c abstractC0292c) {
        super(0);
        this.this$0 = credentialProviderCreatePasswordController;
        this.$response = abstractC0292c;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, AbstractC0292c abstractC0292c) {
        Intrinsics.checkNotNullParameter(credentialProviderCreatePasswordController, "this$0");
        Intrinsics.checkNotNullParameter(abstractC0292c, "$response");
        InterfaceC0300k interfaceC0300k = credentialProviderCreatePasswordController.callback;
        if (interfaceC0300k == null) {
            Intrinsics.v("callback");
            interfaceC0300k = null;
        }
        interfaceC0300k.onResult(abstractC0292c);
    }

    public Object invoke() {
        m20invoke();
        return Unit.a;
    }

    public final void m20invoke() {
        Executor executor = this.this$0.executor;
        if (executor == null) {
            Intrinsics.v("executor");
            executor = null;
        }
        final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        final AbstractC0292c abstractC0292c = this.$response;
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                CredentialProviderCreatePasswordController$handleResponse$3.invoke$lambda$0(credentialProviderCreatePasswordController, abstractC0292c);
            }
        });
    }
}
