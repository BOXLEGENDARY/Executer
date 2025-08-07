package ha;

import android.graphics.Color;
import android.view.View;
import android.view.Window;
import androidx.core.graphics.a;
import androidx.core.view.c1;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/Window;", "", "backgroundColor", "", "a", "(Landroid/view/Window;I)V", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0452K {
    public static final void a(@NotNull Window window, int i) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        int iRgb = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
        double d = a.d(-1, iRgb);
        double d2 = a.d(-16777216, iRgb);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        c1 c1Var = new c1(window, decorView);
        c1Var.c(d < d2);
        c1Var.b(d < d2);
    }
}
