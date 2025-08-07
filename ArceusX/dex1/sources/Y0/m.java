package Y0;

import android.view.LiveData;
import com.github.luben.zstd.BuildConfig;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LY0/m;", BuildConfig.FLAVOR, "LY0/s;", "database", "<init>", "(LY0/s;)V", "a", "LY0/s;", BuildConfig.FLAVOR, "Landroidx/lifecycle/LiveData;", "b", "Ljava/util/Set;", "getLiveDataSet$room_runtime_release", "()Ljava/util/Set;", "liveDataSet", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m {

    private final s database;

    private final Set<LiveData<?>> liveDataSet;

    public m(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "database");
        this.database = sVar;
        Set<LiveData<?>> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.liveDataSet = setNewSetFromMap;
    }
}
