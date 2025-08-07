package androidx.credentials.playservices.controllers.CreatePassword;

import B0.InterfaceC0300k;
import C0.e;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LC0/e;", "e", BuildConfig.FLAVOR, "invoke", "(LC0/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CredentialProviderCreatePasswordController$handleResponse$2 extends l implements Function1<e, Unit> {
    final CredentialProviderCreatePasswordController this$0;

    CredentialProviderCreatePasswordController$handleResponse$2(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        super(1);
        this.this$0 = credentialProviderCreatePasswordController;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, e eVar) {
        Intrinsics.checkNotNullParameter(credentialProviderCreatePasswordController, "this$0");
        Intrinsics.checkNotNullParameter(eVar, "$e");
        InterfaceC0300k interfaceC0300k = credentialProviderCreatePasswordController.callback;
        if (interfaceC0300k == null) {
            Intrinsics.v("callback");
            interfaceC0300k = null;
        }
        interfaceC0300k.a(eVar);
    }

    public Object invoke(Object obj) {
        invoke((e) obj);
        return Unit.a;
    }

    public final void invoke(final e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "e");
        Executor executor = this.this$0.executor;
        if (executor == null) {
            Intrinsics.v("executor");
            executor = null;
        }
        final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                CredentialProviderCreatePasswordController$handleResponse$2.invoke$lambda$0(credentialProviderCreatePasswordController, eVar);
            }
        });
    }
}
