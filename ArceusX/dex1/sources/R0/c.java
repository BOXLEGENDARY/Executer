package R0;

import android.view.AbstractC1678L;
import android.view.C1681O;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"LR0/c;", BuildConfig.FLAVOR, "<init>", "()V", "Landroidx/lifecycle/L;", "T", "Lfa/c;", "clazz", "Lkotlin/Function1;", "LR0/a;", "initializer", BuildConfig.FLAVOR, "a", "(Lfa/c;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/O$b;", "b", "()Landroidx/lifecycle/O$b;", BuildConfig.FLAVOR, "LR0/f;", "Ljava/util/List;", "initializers", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    private final List<f<?>> initializers = new ArrayList();

    public final <T extends AbstractC1678L> void a(fa.c<T> clazz, Function1<? super a, ? extends T> initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializers.add(new f<>(Z9.a.a(clazz), initializer));
    }

    public final C1681O.b b() {
        f[] fVarArr = (f[]) this.initializers.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
