package Y0;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H$¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LY0/k;", "T", "LY0/y;", "LY0/s;", "database", "<init>", "(LY0/s;)V", "Lc1/k;", "statement", "entity", BuildConfig.FLAVOR, "i", "(Lc1/k;Ljava/lang/Object;)V", "j", "(Ljava/lang/Object;)V", BuildConfig.FLAVOR, "entities", "k", "([Ljava/lang/Object;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class k<T> extends y {
    public k(s sVar) {
        super(sVar);
        Intrinsics.checkNotNullParameter(sVar, "database");
    }

    protected abstract void i(c1.k statement, T entity);

    public final void j(T entity) {
        c1.k kVarB = b();
        try {
            i(kVarB, entity);
            kVarB.t1();
        } finally {
            h(kVarB);
        }
    }

    public final void k(T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        c1.k kVarB = b();
        try {
            for (T t7 : entities) {
                i(kVarB, t7);
                kVarB.t1();
            }
        } finally {
            h(kVarB);
        }
    }
}
