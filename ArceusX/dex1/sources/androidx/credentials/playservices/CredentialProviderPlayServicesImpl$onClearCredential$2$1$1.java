package androidx.credentials.playservices;

import B0.InterfaceC0300k;
import C0.a;
import C0.b;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CredentialProviderPlayServicesImpl$onClearCredential$2$1$1 extends l implements Function0<Unit> {
    final InterfaceC0300k<Void, a> $callback;
    final Exception $e;
    final Executor $executor;

    CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(Exception exc, Executor executor, InterfaceC0300k<Void, a> interfaceC0300k) {
        super(0);
        this.$e = exc;
        this.$executor = executor;
        this.$callback = interfaceC0300k;
    }

    public static final void invoke$lambda$0(InterfaceC0300k interfaceC0300k, Exception exc) {
        Intrinsics.checkNotNullParameter(interfaceC0300k, "$callback");
        Intrinsics.checkNotNullParameter(exc, "$e");
        interfaceC0300k.a(new b(exc.getMessage()));
    }

    public Object invoke() {
        m10invoke();
        return Unit.a;
    }

    public final void m10invoke() {
        Log.w("PlayServicesImpl", "During clear credential sign out failed with " + this.$e);
        Executor executor = this.$executor;
        final InterfaceC0300k<Void, a> interfaceC0300k = this.$callback;
        final Exception exc = this.$e;
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                CredentialProviderPlayServicesImpl$onClearCredential$2$1$1.invoke$lambda$0(interfaceC0300k, exc);
            }
        });
    }
}
