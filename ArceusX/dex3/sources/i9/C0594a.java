package i9;

import android.graphics.Color;
import android.view.Window;
import androidx.core.view.c1;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Li9/a;", "", "Landroid/view/Window;", "window", "", "controlNavigationBar", "controlStatusBar", "<init>", "(Landroid/view/Window;ZZ)V", "", "backgroundColor", "", "b", "(Landroid/view/Window;I)V", "a", "(I)V", "Landroid/view/Window;", "Z", "c", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0594a {

    @NotNull
    private final Window window;

    private final boolean controlNavigationBar;

    private final boolean controlStatusBar;

    public C0594a(@NotNull Window window, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(window, "window");
        this.window = window;
        this.controlNavigationBar = z;
        this.controlStatusBar = z2;
    }

    private final void b(Window window, int i) {
        int iRgb = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
        double d = androidx.core.graphics.a.d(-1, iRgb);
        double d2 = androidx.core.graphics.a.d(-16777216, iRgb);
        c1 c1Var = new c1(window, window.getDecorView());
        if (this.controlNavigationBar) {
            c1Var.b(d < d2);
        }
        if (this.controlStatusBar) {
            c1Var.c(d < d2);
        }
    }

    public final void a(int backgroundColor) {
        b(this.window, backgroundColor);
    }
}
