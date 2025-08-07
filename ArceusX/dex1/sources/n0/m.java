package N0;

import androidx.fragment.app.Fragment;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LN0/m;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/fragment/app/Fragment;", "fragment", BuildConfig.FLAVOR, "violationMessage", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "d", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class m extends RuntimeException {

    private final Fragment fragment;

    public m(Fragment fragment, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
    }

    public final Fragment getFragment() {
        return this.fragment;
    }
}
