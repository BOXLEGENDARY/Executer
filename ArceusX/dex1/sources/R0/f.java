package R0;

import android.view.AbstractC1678L;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"LR0/f;", "Landroidx/lifecycle/L;", "T", BuildConfig.FLAVOR, "Ljava/lang/Class;", "clazz", "Lkotlin/Function1;", "LR0/a;", "initializer", "<init>", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V", "a", "Ljava/lang/Class;", "()Ljava/lang/Class;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f<T extends AbstractC1678L> {

    private final Class<T> clazz;

    private final Function1<a, T> initializer;

    public f(Class<T> cls, Function1<? super a, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(cls, "clazz");
        Intrinsics.checkNotNullParameter(function1, "initializer");
        this.clazz = cls;
        this.initializer = function1;
    }

    public final Class<T> a() {
        return this.clazz;
    }

    public final Function1<a, T> b() {
        return this.initializer;
    }
}
