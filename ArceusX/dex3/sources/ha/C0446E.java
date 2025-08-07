package ha;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001aM\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroid/view/View;", "snackbarContainer", "", "error", "Lkotlin/Function0;", "", "onDismissed", "anchorView", "", "maxLines", "duration", "a", "(Landroid/view/View;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroid/view/View;II)V", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0446E {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"a9/E$a", "Lcom/google/android/material/snackbar/Snackbar$a;", "Lcom/google/android/material/snackbar/Snackbar;", "transientBottomBar", "", "event", "", "d", "(Lcom/google/android/material/snackbar/Snackbar;I)V", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a extends Snackbar.a {
        final Function0<Unit> a;

        a(Function0<Unit> function0) {
            this.a = function0;
        }

        public void a(Snackbar transientBottomBar, int event) {
            this.a.invoke();
        }
    }

    public static final void a(@NotNull View view, String str, @NotNull Function0<Unit> function0, View view2, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "snackbarContainer");
        Intrinsics.checkNotNullParameter(function0, "onDismissed");
        if (str == null) {
            return;
        }
        Snackbar snackbarL0 = Snackbar.l0(view, str, i2);
        Intrinsics.checkNotNullExpressionValue(snackbarL0, "make(...)");
        snackbarL0.o0(i);
        if (view2 != null) {
            snackbarL0.U(view2);
        }
        snackbarL0.u(new a(function0)).Z();
    }

    public static void b(View view, String str, Function0 function0, View view2, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            view2 = null;
        }
        View view3 = view2;
        if ((i3 & 16) != 0) {
            i = 2;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = 0;
        }
        a(view, str, function0, view3, i4, i2);
    }
}
