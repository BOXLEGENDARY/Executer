package android.view;

import android.view.View;
import android.view.Window;
import androidx.core.view.C1628l0;
import androidx.core.view.c1;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/activity/x;", "Landroidx/activity/u;", "<init>", "()V", "Landroidx/activity/I;", "statusBarStyle", "navigationBarStyle", "Landroid/view/Window;", "window", "Landroid/view/View;", "view", BuildConfig.FLAVOR, "statusBarIsDark", "navigationBarIsDark", BuildConfig.FLAVOR, "a", "(Landroidx/activity/I;Landroidx/activity/I;Landroid/view/Window;Landroid/view/View;ZZ)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
class x extends u {
    @Override
    public void a(I statusBarStyle, I navigationBarStyle, Window window, View view, boolean statusBarIsDark, boolean navigationBarIsDark) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        C1628l0.b(window, false);
        window.setStatusBarColor(statusBarStyle.e(statusBarIsDark));
        window.setNavigationBarColor(navigationBarStyle.e(navigationBarIsDark));
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(navigationBarStyle.getNightMode() == 0);
        c1 c1Var = new c1(window, view);
        c1Var.c(!statusBarIsDark);
        c1Var.b(true ^ navigationBarIsDark);
    }
}
