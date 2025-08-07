package H8;

import android.content.Context;
import com.roblox.client.personasdk.R;
import java.lang.Thread;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\bR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, d2 = {"LH8/b;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "d", "()V", "", "e", "c", "(Ljava/lang/Throwable;)V", "f", "b", "", "a", "Z", "isExceptionHandlerRegistered", "isErrorHandlerEnabled", "Lt8/a;", "Lt8/a;", "exceptionLogger", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b {

    private boolean isExceptionHandlerRegistered;

    private boolean isErrorHandlerEnabled;

    @NotNull
    private final t8.a exceptionLogger;

    public b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.isErrorHandlerEnabled = true;
        this.exceptionLogger = new t8.a(context);
    }

    public static final void e(b bVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        Intrinsics.checkNotNullParameter(bVar, "this$0");
        Intrinsics.d(th);
        bVar.c(th);
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            System.exit(1);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    public final void b() {
        this.exceptionLogger.a();
    }

    public final void c(@NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (this.isErrorHandlerEnabled) {
            try {
                this.exceptionLogger.g(e);
            } catch (Exception unused) {
            }
        }
    }

    public final synchronized void d() {
        if (this.isExceptionHandlerRegistered) {
            return;
        }
        this.isExceptionHandlerRegistered = true;
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public final void uncaughtException(Thread thread, Throwable th) {
                b.e(this.a, defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    public final synchronized void f() {
        if (this.isExceptionHandlerRegistered) {
            this.isErrorHandlerEnabled = false;
        }
    }
}
