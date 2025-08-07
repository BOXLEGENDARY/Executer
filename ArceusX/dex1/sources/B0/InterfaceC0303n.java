package B0;

import android.content.Context;
import android.os.CancellationSignal;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JE\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\nH&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\nH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJE\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0017¢\u0006\u0004\b\u000f\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"LB0/n;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "LB0/Y;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "LB0/k;", "LB0/Z;", "LC0/m;", "callback", BuildConfig.FLAVOR, "onGetCredential", "(Landroid/content/Context;LB0/Y;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LB0/k;)V", "LB0/b;", "LB0/c;", "LC0/e;", "onCreateCredential", "(Landroid/content/Context;LB0/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LB0/k;)V", BuildConfig.FLAVOR, "isAvailableOnDevice", "()Z", "onPrepareCredential", "(LB0/Y;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LB0/k;)V", "LB0/e0;", "pendingGetCredentialHandle", "(Landroid/content/Context;LB0/e0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LB0/k;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface InterfaceC0303n {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, AbstractC0291b request, CancellationSignal cancellationSignal, Executor executor, InterfaceC0300k<AbstractC0292c, C0.e> callback);

    void onGetCredential(Context context, Y request, CancellationSignal cancellationSignal, Executor executor, InterfaceC0300k<Z, C0.m> callback);

    default void onGetCredential(Context context, e0 pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, InterfaceC0300k<Z, C0.m> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    default void onPrepareCredential(Y request, CancellationSignal cancellationSignal, Executor executor, InterfaceC0300k<Object, C0.m> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }
}
