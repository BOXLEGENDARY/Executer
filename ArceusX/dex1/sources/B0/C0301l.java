package B0;

import android.content.Context;
import android.os.CancellationSignal;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018¨\u0006\u001a"}, d2 = {"LB0/l;", "LB0/j;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LB0/Y;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "LB0/k;", "LB0/Z;", "LC0/m;", "callback", BuildConfig.FLAVOR, "b", "(Landroid/content/Context;LB0/Y;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LB0/k;)V", "LB0/b;", "LB0/c;", "LC0/e;", "c", "(Landroid/content/Context;LB0/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LB0/k;)V", "Landroid/content/Context;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C0301l implements InterfaceC0299j {

    private final Context context;

    public C0301l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override
    public void b(Context context, Y request, CancellationSignal cancellationSignal, Executor executor, InterfaceC0300k<Z, C0.m> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC0303n interfaceC0303nC = C0304o.c(new C0304o(context), false, 1, null);
        if (interfaceC0303nC == null) {
            callback.a(new C0.o("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            interfaceC0303nC.onGetCredential(context, request, cancellationSignal, executor, callback);
        }
    }

    @Override
    public void c(Context context, AbstractC0291b request, CancellationSignal cancellationSignal, Executor executor, InterfaceC0300k<AbstractC0292c, C0.e> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC0303n interfaceC0303nC = C0304o.c(new C0304o(this.context), false, 1, null);
        if (interfaceC0303nC == null) {
            callback.a(new C0.h("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            interfaceC0303nC.onCreateCredential(context, request, cancellationSignal, executor, callback);
        }
    }
}
