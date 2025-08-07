package Y0;

import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"LY0/y;", BuildConfig.FLAVOR, "LY0/s;", "database", "<init>", "(LY0/s;)V", "Lc1/k;", "d", "()Lc1/k;", BuildConfig.FLAVOR, "canUseCached", "g", "(Z)Lc1/k;", BuildConfig.FLAVOR, "e", "()Ljava/lang/String;", BuildConfig.FLAVOR, "c", "()V", "b", "statement", "h", "(Lc1/k;)V", "a", "LY0/s;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "LP9/h;", "f", "stmt", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class y {

    private final s database;

    private final AtomicBoolean lock;

    private final P9.h stmt;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc1/k;", "a", "()Lc1/k;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.l implements Function0<c1.k> {
        a() {
            super(0);
        }

        public final c1.k invoke() {
            return y.this.d();
        }
    }

    public y(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "database");
        this.database = sVar;
        this.lock = new AtomicBoolean(false);
        this.stmt = P9.i.b(new a());
    }

    public final c1.k d() {
        return this.database.f(e());
    }

    private final c1.k f() {
        return (c1.k) this.stmt.getValue();
    }

    private final c1.k g(boolean canUseCached) {
        return canUseCached ? f() : d();
    }

    public c1.k b() {
        c();
        return g(this.lock.compareAndSet(false, true));
    }

    protected void c() {
        this.database.c();
    }

    protected abstract String e();

    public void h(c1.k statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == f()) {
            this.lock.set(false);
        }
    }
}
