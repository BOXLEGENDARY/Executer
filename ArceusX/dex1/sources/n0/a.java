package N0;

import androidx.fragment.app.Fragment;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LN0/a;", "LN0/m;", "Landroidx/fragment/app/Fragment;", "fragment", BuildConfig.FLAVOR, "previousFragmentId", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "e", "Ljava/lang/String;", "getPreviousFragmentId", "()Ljava/lang/String;", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class a extends m {

    private final String previousFragmentId;

    public a(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(str, "previousFragmentId");
        this.previousFragmentId = str;
    }
}
