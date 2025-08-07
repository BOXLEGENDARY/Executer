package android.view;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "Landroidx/activity/D;", "fullyDrawnReporterOwner", BuildConfig.FLAVOR, "a", "(Landroid/view/View;Landroidx/activity/D;)V", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class View {
    public static final void a(android.view.View view, D d7) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(d7, "fullyDrawnReporterOwner");
        view.setTag(H.f8408a, d7);
    }
}
