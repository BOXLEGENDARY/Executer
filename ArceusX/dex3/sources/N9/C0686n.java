package n9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.FooterComponent;
import ha.C0458f;
import ha.C0468m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l9.ComponentView;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "Ln9/s0;", "uiComponentHelper", "", "Ll9/a;", "componentViews", "Landroid/view/View;", "children", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;Ln9/s0;Ljava/util/List;Ljava/util/List;)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0686n {
    @NotNull
    public static final View a(@NotNull FooterComponent footerComponent, @NotNull s0 s0Var, @NotNull List<ComponentView> list, @NotNull List<? extends View> list2) {
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Intrinsics.checkNotNullParameter(footerComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(list, "componentViews");
        Intrinsics.checkNotNullParameter(list2, "children");
        Context context = s0Var.getContext();
        q9.g gVarD = q9.g.d(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(gVarD, "inflate(...)");
        Integer backgroundColor = footerComponent.e().getBackgroundColor();
        if (backgroundColor != null) {
            gVarD.c.setBackgroundColor(backgroundColor.intValue());
        }
        StyleElements.SizeSet padding = footerComponent.e().getPadding();
        if (padding != null) {
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C0468m.b);
            StyleElements.Size left = padding.getLeft();
            int iC = kotlin.ranges.b.c((left == null || (dp5 = left.getDp()) == null) ? 0 : (int) C0458f.a(dp5.doubleValue()), dimensionPixelOffset);
            StyleElements.Size right = padding.getRight();
            int iC2 = kotlin.ranges.b.c((right == null || (dp4 = right.getDp()) == null) ? 0 : (int) C0458f.a(dp4.doubleValue()), dimensionPixelOffset);
            ConstraintLayout constraintLayout = gVarD.d;
            StyleElements.Size top = padding.getTop();
            int iA = (top == null || (dp3 = top.getDp()) == null) ? 0 : (int) C0458f.a(dp3.doubleValue());
            StyleElements.Size bottom = padding.getBottom();
            constraintLayout.setPadding(iC, iA, iC2, (bottom == null || (dp2 = bottom.getDp()) == null) ? 0 : (int) C0458f.a(dp2.doubleValue()));
        }
        StyleElements.SizeSet borderWidth = footerComponent.e().getBorderWidth();
        if (borderWidth != null) {
            View view = gVarD.f;
            Intrinsics.checkNotNullExpressionValue(view, "hairline");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            StyleElements.Size top2 = borderWidth.getTop();
            layoutParams.height = (top2 == null || (dp = top2.getDp()) == null) ? 0 : (int) C0458f.a(dp.doubleValue());
            view.setLayoutParams(layoutParams);
        } else {
            View view2 = gVarD.f;
            Intrinsics.checkNotNullExpressionValue(view2, "hairline");
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = (int) C0458f.a(1.0d);
            view2.setLayoutParams(layoutParams2);
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(gVarD.d);
        ConstraintLayout constraintLayout2 = gVarD.d;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "footerContainerInner");
        List<? extends View> list3 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(list3, 10));
        for (View view3 : list3) {
            view3.setId(View.generateViewId());
            view3.setSaveEnabled(false);
            constraintLayout2.addView(view3);
            arrayList.add(Integer.valueOf(view3.getId()));
        }
        n0.b(constraintLayout2, dVar, list, arrayList, StyleElements.PositionType.CENTER, 0);
        dVar.c(gVarD.d);
        LinearLayout linearLayoutA = gVarD.a();
        Intrinsics.checkNotNullExpressionValue(linearLayoutA, "getRoot(...)");
        return linearLayoutA;
    }
}
