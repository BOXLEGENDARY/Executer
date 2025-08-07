package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import B0.InterfaceC0300k;
import D0.B;
import E0.a;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$7 extends l implements Function0<Unit> {
    final Throwable $t;
    final CredentialProviderCreatePublicKeyCredentialController this$0;

    CredentialProviderCreatePublicKeyCredentialController$handleResponse$7(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$t = th;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        Intrinsics.checkNotNullParameter(credentialProviderCreatePublicKeyCredentialController, "this$0");
        Intrinsics.checkNotNullParameter(th, "$t");
        InterfaceC0300k interfaceC0300k = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC0300k == null) {
            Intrinsics.v("callback");
            interfaceC0300k = null;
        }
        interfaceC0300k.a(new a(new B(), th.getMessage()));
    }

    public Object invoke() {
        m26invoke();
        return Unit.a;
    }

    public final void m26invoke() {
        Executor executor = this.this$0.executor;
        if (executor == null) {
            Intrinsics.v("executor");
            executor = null;
        }
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        final Throwable th = this.$t;
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$7.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, th);
            }
        });
    }
}
