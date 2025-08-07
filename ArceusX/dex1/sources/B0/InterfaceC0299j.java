package B0;

import android.content.Context;
import android.os.CancellationSignal;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016JE\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\nH&¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"LB0/j;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "LB0/Y;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "LB0/k;", "LB0/Z;", "LC0/m;", "callback", BuildConfig.FLAVOR, "b", "(Landroid/content/Context;LB0/Y;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LB0/k;)V", "LB0/b;", "LB0/c;", "LC0/e;", "c", "(Landroid/content/Context;LB0/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LB0/k;)V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface InterfaceC0299j {

    public static final Companion INSTANCE = Companion.f338a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LB0/j$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "LB0/j;", "a", "(Landroid/content/Context;)LB0/j;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        static final Companion f338a = new Companion();

        private Companion() {
        }

        public final InterfaceC0299j a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C0301l(context);
        }
    }

    static InterfaceC0299j a(Context context) {
        return INSTANCE.a(context);
    }

    void b(Context context, Y request, CancellationSignal cancellationSignal, Executor executor, InterfaceC0300k<Z, C0.m> callback);

    void c(Context context, AbstractC0291b request, CancellationSignal cancellationSignal, Executor executor, InterfaceC0300k<AbstractC0292c, C0.e> callback);
}
