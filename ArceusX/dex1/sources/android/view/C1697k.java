package android.view;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/lifecycle/k;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "a", "(Landroid/content/Context;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C1697k {

    public static final C1697k f11403a = new C1697k();

    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/k$a;", "Landroidx/lifecycle/e;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", BuildConfig.FLAVOR, "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends C1691e {
        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentC1668B.INSTANCE.c(activity);
        }
    }

    private C1697k() {
    }

    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (initialized.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
