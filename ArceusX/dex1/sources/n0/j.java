package N0;

import androidx.fragment.app.Fragment;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LN0/j;", "LN0/l;", "Landroidx/fragment/app/Fragment;", "fragment", "targetFragment", BuildConfig.FLAVOR, "requestCode", "<init>", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", "e", "Landroidx/fragment/app/Fragment;", "getTargetFragment", "()Landroidx/fragment/app/Fragment;", "i", "I", "getRequestCode", "()I", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class j extends l {

    private final Fragment targetFragment;

    private final int requestCode;

    public j(Fragment fragment, Fragment fragment2, int i7) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i7 + " for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(fragment2, "targetFragment");
        this.targetFragment = fragment2;
        this.requestCode = i7;
    }
}
