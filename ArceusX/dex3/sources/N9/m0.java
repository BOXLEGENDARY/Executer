package n9;

import android.view.View;
import android.view.ViewGroup;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.steps.ui.components.SpacerComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;", "Ln9/s0;", "uiComponentHelper", "Landroid/view/View;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;Ln9/s0;)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class m0 {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final View d;
        final SpacerComponent e;

        a(View view, SpacerComponent spacerComponent) {
            super(0);
            this.d = view;
            this.e = spacerComponent;
        }

        public Object invoke() {
            m677invoke();
            return Unit.a;
        }

        public final void m677invoke() {
            ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
            SpacerComponent spacerComponent = this.e;
            View view = this.d;
            layoutParams.height = kotlin.ranges.b.c(spacerComponent.e().getHeight(), 1);
            view.setLayoutParams(layoutParams);
        }
    }

    @NotNull
    public static final View a(@NotNull SpacerComponent spacerComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(spacerComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        View view = new View(s0Var.getContext());
        s0Var.d(new a(view, spacerComponent));
        return view;
    }
}
