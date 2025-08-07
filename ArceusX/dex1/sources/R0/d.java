package R0;

import R0.a;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J,\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LR0/d;", "LR0/a;", "initialExtras", "<init>", "(LR0/a;)V", "T", "LR0/a$b;", "key", "t", BuildConfig.FLAVOR, "c", "(LR0/a$b;Ljava/lang/Object;)V", "a", "(LR0/a$b;)Ljava/lang/Object;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends a {
    public d() {
        a aVar = null;
        this(aVar, 1, aVar);
    }

    @Override
    public <T> T a(a.b<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) b().get(key);
    }

    public final <T> void c(a.b<T> key, T t7) {
        Intrinsics.checkNotNullParameter(key, "key");
        b().put(key, t7);
    }

    public d(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    public d(a aVar, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? a.C0046a.f4920b : aVar);
    }
}
