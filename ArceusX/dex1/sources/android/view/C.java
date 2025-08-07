package android.view;

import S5.Cg.XjqcfAbdbc;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u000e\u0010#¨\u0006%"}, d2 = {"Landroidx/activity/C;", BuildConfig.FLAVOR, "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", BuildConfig.FLAVOR, "reportFullyDrawn", "<init>", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)V", "b", "()V", "a", "Ljava/util/concurrent/Executor;", "Lkotlin/jvm/functions/Function0;", "c", "Ljava/lang/Object;", "lock", BuildConfig.FLAVOR, "d", "I", "reporterCount", BuildConfig.FLAVOR, "e", "Z", "reportPosted", "f", "reportedFullyDrawn", BuildConfig.FLAVOR, "g", "Ljava/util/List;", "onReportCallbacks", "Ljava/lang/Runnable;", "h", "Ljava/lang/Runnable;", "reportRunnable", "()Z", "isFullyDrawnReported", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C {

    private final Executor executor;

    private final Function0<Unit> reportFullyDrawn;

    private final Object lock;

    private int reporterCount;

    private boolean reportPosted;

    private boolean reportedFullyDrawn;

    private final List<Function0<Unit>> onReportCallbacks;

    private final Runnable reportRunnable;

    public C(Executor executor, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(function0, XjqcfAbdbc.UtRgG);
        this.executor = executor;
        this.reportFullyDrawn = function0;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new Runnable() {
            @Override
            public final void run() {
                C.d(this.f8382d);
            }
        };
    }

    public static final void d(C c2) {
        synchronized (c2.lock) {
            try {
                c2.reportPosted = false;
                if (c2.reporterCount == 0 && !c2.reportedFullyDrawn) {
                    c2.reportFullyDrawn.invoke();
                    c2.b();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.lock) {
            try {
                this.reportedFullyDrawn = true;
                Iterator<T> it = this.onReportCallbacks.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.onReportCallbacks.clear();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z7;
        synchronized (this.lock) {
            z7 = this.reportedFullyDrawn;
        }
        return z7;
    }
}
