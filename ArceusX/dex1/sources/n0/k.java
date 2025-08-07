package N0;

import androidx.fragment.app.Fragment;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\n¨\u0006\u000b"}, d2 = {"LN0/k;", "LN0/m;", "Landroidx/fragment/app/Fragment;", "fragment", BuildConfig.FLAVOR, "isVisibleToUser", "<init>", "(Landroidx/fragment/app/Fragment;Z)V", "e", "Z", "()Z", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class k extends m {

    private final boolean isVisibleToUser;

    public k(Fragment fragment, boolean z7) {
        super(fragment, "Attempting to set user visible hint to " + z7 + " for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.isVisibleToUser = z7;
    }
}
