package androidx.fragment.app;

import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/fragment/app/Fragment;", BuildConfig.FLAVOR, "requestKey", "Landroid/os/Bundle;", "result", BuildConfig.FLAVOR, "a", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V", "fragment-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class n {
    public static final void a(Fragment fragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(str, "requestKey");
        Intrinsics.checkNotNullParameter(bundle, "result");
        fragment.getParentFragmentManager().t1(str, bundle);
    }
}
