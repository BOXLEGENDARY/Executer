package Y0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u000eR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010,\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u001dR\u0014\u0010.\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010/R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010:\u001a\u0002048\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010@\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b;\u0010/\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010D\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b \u0010A\u001a\u0004\b;\u0010\u0016\"\u0004\bB\u0010CR\u0016\u0010G\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010FR\u0014\u0010H\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u0014\u0010I\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(¨\u0006J"}, d2 = {"LY0/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "autoCloseTimeoutAmount", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Ljava/util/concurrent/Executor;", "autoCloseExecutor", "<init>", "(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/Executor;)V", "Lc1/h;", "delegateOpenHelper", BuildConfig.FLAVOR, "k", "(Lc1/h;)V", "V", "Lkotlin/Function1;", "Lc1/g;", "block", "g", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "j", "()Lc1/g;", "e", "()V", "d", "Ljava/lang/Runnable;", "onAutoClose", "l", "(Ljava/lang/Runnable;)V", "a", "Lc1/h;", "i", "()Lc1/h;", "m", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "handler", "c", "Ljava/lang/Runnable;", "getOnAutoCloseCallback$room_runtime_release", "()Ljava/lang/Runnable;", "setOnAutoCloseCallback$room_runtime_release", "onAutoCloseCallback", "Ljava/lang/Object;", "lock", "J", "autoCloseTimeoutInMs", "f", "Ljava/util/concurrent/Executor;", "executor", BuildConfig.FLAVOR, "I", "getRefCount$room_runtime_release", "()I", "setRefCount$room_runtime_release", "(I)V", "refCount", "h", "getLastDecrementRefCountTimeStamp$room_runtime_release", "()J", "setLastDecrementRefCountTimeStamp$room_runtime_release", "(J)V", "lastDecrementRefCountTimeStamp", "Lc1/g;", "setDelegateDatabase$room_runtime_release", "(Lc1/g;)V", "delegateDatabase", BuildConfig.FLAVOR, "Z", "manuallyClosed", "executeAutoCloser", "autoCloser", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    public c1.h delegateOpenHelper;

    private final Handler handler;

    private Runnable onAutoCloseCallback;

    private final Object lock;

    private long autoCloseTimeoutInMs;

    private final Executor executor;

    private int refCount;

    private long lastDecrementRefCountTimeStamp;

    private c1.g delegateDatabase;

    private boolean manuallyClosed;

    private final Runnable executeAutoCloser;

    private final Runnable autoCloser;

    public c(long j7, TimeUnit timeUnit, Executor executor) {
        Intrinsics.checkNotNullParameter(timeUnit, "autoCloseTimeUnit");
        Intrinsics.checkNotNullParameter(executor, "autoCloseExecutor");
        this.handler = new Handler(Looper.getMainLooper());
        this.lock = new Object();
        this.autoCloseTimeoutInMs = timeUnit.toMillis(j7);
        this.executor = executor;
        this.lastDecrementRefCountTimeStamp = SystemClock.uptimeMillis();
        this.executeAutoCloser = new Runnable() {
            @Override
            public final void run() {
                c.f(this.f8013d);
            }
        };
        this.autoCloser = new Runnable() {
            @Override
            public final void run() {
                c.c(this.f8014d);
            }
        };
    }

    public static final void c(c cVar) {
        Unit unit;
        Intrinsics.checkNotNullParameter(cVar, "this$0");
        synchronized (cVar.lock) {
            try {
                if (SystemClock.uptimeMillis() - cVar.lastDecrementRefCountTimeStamp < cVar.autoCloseTimeoutInMs) {
                    return;
                }
                if (cVar.refCount != 0) {
                    return;
                }
                Runnable runnable = cVar.onAutoCloseCallback;
                if (runnable != null) {
                    runnable.run();
                    unit = Unit.a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                c1.g gVar = cVar.delegateDatabase;
                if (gVar != null && gVar.isOpen()) {
                    gVar.close();
                }
                cVar.delegateDatabase = null;
                Unit unit2 = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void f(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "this$0");
        cVar.executor.execute(cVar.autoCloser);
    }

    public final void d() throws IOException {
        synchronized (this.lock) {
            try {
                this.manuallyClosed = true;
                c1.g gVar = this.delegateDatabase;
                if (gVar != null) {
                    gVar.close();
                }
                this.delegateDatabase = null;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.lock) {
            try {
                int i7 = this.refCount;
                if (i7 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i8 = i7 - 1;
                this.refCount = i8;
                if (i8 == 0) {
                    if (this.delegateDatabase == null) {
                        return;
                    } else {
                        this.handler.postDelayed(this.executeAutoCloser, this.autoCloseTimeoutInMs);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <V> V g(Function1<? super c1.g, ? extends V> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return (V) block.invoke(j());
        } finally {
            e();
        }
    }

    public final c1.g getDelegateDatabase() {
        return this.delegateDatabase;
    }

    public final c1.h i() {
        c1.h hVar = this.delegateOpenHelper;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.v("delegateOpenHelper");
        return null;
    }

    public final c1.g j() {
        synchronized (this.lock) {
            this.handler.removeCallbacks(this.executeAutoCloser);
            this.refCount++;
            if (this.manuallyClosed) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            c1.g gVar = this.delegateDatabase;
            if (gVar != null && gVar.isOpen()) {
                return gVar;
            }
            c1.g gVarO0 = i().o0();
            this.delegateDatabase = gVarO0;
            return gVarO0;
        }
    }

    public final void k(c1.h delegateOpenHelper) {
        Intrinsics.checkNotNullParameter(delegateOpenHelper, "delegateOpenHelper");
        m(delegateOpenHelper);
    }

    public final void l(Runnable onAutoClose) {
        Intrinsics.checkNotNullParameter(onAutoClose, "onAutoClose");
        this.onAutoCloseCallback = onAutoClose;
    }

    public final void m(c1.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.delegateOpenHelper = hVar;
    }
}
