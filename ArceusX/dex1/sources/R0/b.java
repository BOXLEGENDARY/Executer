package R0;

import android.view.AbstractC1678L;
import android.view.C1681O;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"LR0/b;", "Landroidx/lifecycle/O$b;", BuildConfig.FLAVOR, "LR0/f;", "initializers", "<init>", "([LR0/f;)V", "Landroidx/lifecycle/L;", "T", "Ljava/lang/Class;", "modelClass", "LR0/a;", "extras", "b", "(Ljava/lang/Class;LR0/a;)Landroidx/lifecycle/L;", "[LR0/f;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements C1681O.b {

    private final f<?>[] initializers;

    public b(f<?>... fVarArr) {
        Intrinsics.checkNotNullParameter(fVarArr, "initializers");
        this.initializers = fVarArr;
    }

    @Override
    public <T extends AbstractC1678L> T b(Class<T> modelClass, a extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        T t7 = null;
        for (f<?> fVar : this.initializers) {
            if (Intrinsics.b(fVar.a(), modelClass)) {
                Object objInvoke = fVar.b().invoke(extras);
                t7 = objInvoke instanceof AbstractC1678L ? (T) objInvoke : null;
            }
        }
        if (t7 != null) {
            return t7;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }
}
