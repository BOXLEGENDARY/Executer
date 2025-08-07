package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import B0.InterfaceC0300k;
import C0.e;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$4 extends l implements Function0<Unit> {
    final e $exception;
    final CredentialProviderCreatePublicKeyCredentialController this$0;

    CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, e eVar) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$exception = eVar;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, e eVar) {
        Intrinsics.checkNotNullParameter(credentialProviderCreatePublicKeyCredentialController, "this$0");
        InterfaceC0300k interfaceC0300k = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC0300k == null) {
            Intrinsics.v("callback");
            interfaceC0300k = null;
        }
        interfaceC0300k.a(eVar);
    }

    public Object invoke() {
        m23invoke();
        return Unit.a;
    }

    public final void m23invoke() {
        Executor executor = this.this$0.executor;
        if (executor == null) {
            Intrinsics.v("executor");
            executor = null;
        }
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        final e eVar = this.$exception;
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$4.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, eVar);
            }
        });
    }
}
