package x0;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lx0/f;", BuildConfig.FLAVOR, "T", "Lx0/e;", BuildConfig.FLAVOR, "maxPoolSize", "<init>", "(I)V", "b", "()Ljava/lang/Object;", "instance", BuildConfig.FLAVOR, "a", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/Object;", "lock", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class f<T> extends e<T> {

    private final Object lock;

    public f(int i7) {
        super(i7);
        this.lock = new Object();
    }

    @Override
    public boolean a(T instance) {
        boolean zA;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.lock) {
            zA = super.a(instance);
        }
        return zA;
    }

    @Override
    public T b() {
        T t7;
        synchronized (this.lock) {
            t7 = (T) super.b();
        }
        return t7;
    }
}
