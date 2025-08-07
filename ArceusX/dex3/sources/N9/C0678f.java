package n9;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent;
import ha.C0458f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l9.ComponentView;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Ln9/s0;", "uiComponentHelper", "", "Ll9/a;", "componentViews", "Landroid/view/View;", "children", "Landroidx/constraintlayout/widget/ConstraintLayout;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;Ln9/s0;Ljava/util/List;Ljava/util/List;)Landroidx/constraintlayout/widget/ConstraintLayout;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0678f {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final q9.e d;
        final ClickableStack.ClickableStackComponentStyle e;

        a(q9.e eVar, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
            super(0);
            this.d = eVar;
            this.e = clickableStackComponentStyle;
        }

        public Object invoke() {
            m669invoke();
            return Unit.a;
        }

        public final void m669invoke() {
            ConstraintLayout constraintLayoutA = this.d.a();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
            s9.h.b(constraintLayoutA, this.e);
        }
    }

    @NotNull
    public static final ConstraintLayout a(@NotNull ClickableStackComponent clickableStackComponent, @NotNull s0 s0Var, @NotNull List<ComponentView> list, @NotNull List<? extends View> list2) {
        StyleElements.Axis axisValue;
        StyleElements.Size gapValue;
        Double dp;
        Intrinsics.checkNotNullParameter(clickableStackComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(list, "componentViews");
        Intrinsics.checkNotNullParameter(list2, "children");
        q9.e eVarD = q9.e.d(s0Var.getLayoutInflater());
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(eVarD.a());
        List<? extends View> list3 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(list3, 10));
        for (View view : list3) {
            view.setId(View.generateViewId());
            view.setSaveEnabled(false);
            eVarD.a().addView(view);
            arrayList.add(Integer.valueOf(view.getId()));
        }
        ClickableStack.ClickableStackComponentStyle styles = clickableStackComponent.e().getStyles();
        int iA = (int) C0458f.a((styles == null || (gapValue = styles.getGapValue()) == null || (dp = gapValue.getDp()) == null) ? 16.0d : dp.doubleValue());
        if (styles == null || (axisValue = styles.getAxisValue()) == null) {
            axisValue = StyleElements.Axis.HORIZONTAL;
        }
        if (axisValue == StyleElements.Axis.HORIZONTAL) {
            ConstraintLayout constraintLayoutA = eVarD.a();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
            n0.a(constraintLayoutA, dVar, list, arrayList, styles != null ? styles.getChildSizesValue() : null, styles != null ? styles.getAlignmentValue() : null, iA);
        } else {
            ConstraintLayout constraintLayoutA2 = eVarD.a();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutA2, "getRoot(...)");
            n0.b(constraintLayoutA2, dVar, list, arrayList, styles != null ? styles.getAlignmentValue() : null, iA);
        }
        if (styles != null) {
            s0Var.d(new a(eVarD, styles));
        }
        dVar.c(eVarD.a());
        ConstraintLayout constraintLayoutA3 = eVarD.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA3, "getRoot(...)");
        return constraintLayoutA3;
    }
}
