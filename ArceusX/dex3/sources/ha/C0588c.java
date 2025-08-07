package ha;

import android.view.View;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.C0493e;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "back", "cancel", "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/view/View;", "backPressHandler", "a", "(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/view/View;)V", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0588c {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends l implements Function0<Unit> {
        final NavigationState d;
        final Function0<Unit> e;
        final Function0<Unit> i;

        a(NavigationState navigationState, Function0<Unit> function0, Function0<Unit> function02) {
            super(0);
            this.d = navigationState;
            this.e = function0;
            this.i = function02;
        }

        public Object invoke() {
            m608invoke();
            return Unit.a;
        }

        public final void m608invoke() {
            if (this.d.getShowBackButton()) {
                this.e.invoke();
            } else {
                this.i.invoke();
            }
        }
    }

    public static final void a(@NotNull NavigationState navigationState, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Pi2NavigationBar pi2NavigationBar, @NotNull View view) {
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(function0, "back");
        Intrinsics.checkNotNullParameter(function02, "cancel");
        Intrinsics.checkNotNullParameter(pi2NavigationBar, "navigationBar");
        Intrinsics.checkNotNullParameter(view, "backPressHandler");
        pi2NavigationBar.f(navigationState, function0, function02);
        C0493e.c(view, new a(navigationState, function0, function02));
    }
}
