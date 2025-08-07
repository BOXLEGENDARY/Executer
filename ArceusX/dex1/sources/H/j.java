package H;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z.C3043d0;
import z.T;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\rB\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001c¨\u0006\u001e"}, d2 = {"LH/j;", "Lz/T$i;", "screenFlash", "<init>", "(Lz/T$i;)V", BuildConfig.FLAVOR, "e", "()V", "d", BuildConfig.FLAVOR, "expirationTimeMillis", "Lz/T$j;", "screenFlashListener", "a", "(JLz/T$j;)V", "clear", "h", "()Lz/T$i;", "f", "Lz/T$i;", "Ljava/lang/Object;", "b", "Ljava/lang/Object;", "lock", BuildConfig.FLAVOR, "c", "Z", "isClearScreenFlashPending", "Lz/T$j;", "pendingListener", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements T.i {

    public static final Companion INSTANCE = new Companion(null);

    private final T.i screenFlash;

    private final Object lock;

    private boolean isClearScreenFlashPending;

    private T.j pendingListener;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LH/j$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lz/T$i;", "screenFlash", "LH/j;", "a", "(Lz/T$i;)LH/j;", BuildConfig.FLAVOR, "TAG", "Ljava/lang/String;", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(T.i screenFlash) {
            return new j(screenFlash, null);
        }

        private Companion() {
        }
    }

    public j(T.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar);
    }

    public static final void c(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "this$0");
        synchronized (jVar.lock) {
            try {
                if (jVar.pendingListener == null) {
                    C3043d0.l("ScreenFlashWrapper", "apply: pendingListener is null!");
                }
                jVar.e();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        Unit unit;
        synchronized (this.lock) {
            try {
                if (this.isClearScreenFlashPending) {
                    T.i iVar = this.screenFlash;
                    if (iVar != null) {
                        iVar.clear();
                        unit = Unit.a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        C3043d0.c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    C3043d0.l("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.isClearScreenFlashPending = false;
                Unit unit2 = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e() {
        synchronized (this.lock) {
            try {
                T.j jVar = this.pendingListener;
                if (jVar != null) {
                    jVar.a();
                }
                this.pendingListener = null;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final j g(T.i iVar) {
        return INSTANCE.a(iVar);
    }

    @Override
    public void a(long expirationTimeMillis, T.j screenFlashListener) {
        Unit unit;
        Intrinsics.checkNotNullParameter(screenFlashListener, "screenFlashListener");
        synchronized (this.lock) {
            this.isClearScreenFlashPending = true;
            this.pendingListener = screenFlashListener;
            Unit unit2 = Unit.a;
        }
        T.i iVar = this.screenFlash;
        if (iVar != null) {
            iVar.a(expirationTimeMillis, new T.j() {
                @Override
                public final void a() {
                    j.c(this.f1508a);
                }
            });
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            C3043d0.c("ScreenFlashWrapper", "apply: screenFlash is null!");
            e();
        }
    }

    @Override
    public void clear() {
        d();
    }

    public final void f() {
        e();
        d();
    }

    public final T.i getScreenFlash() {
        return this.screenFlash;
    }

    private j(T.i iVar) {
        this.screenFlash = iVar;
        this.lock = new Object();
    }
}
