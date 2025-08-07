package s9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.e0;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import ha.C0458f;
import ha.C0476u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/view/ViewGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Landroid/view/View;", "innerView", "Landroid/graphics/Rect;", "viewBuiltInPadding", "", "a", "(Landroid/view/ViewGroup;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Landroid/view/View;Landroid/graphics/Rect;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "cornerRadius", "Landroid/graphics/drawable/GradientDrawable;", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;)Landroid/graphics/drawable/GradientDrawable;", "Landroid/graphics/drawable/Drawable;", "backgroundImage", "d", "(Landroid/view/ViewGroup;Landroid/graphics/drawable/Drawable;)V", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function1<View, Boolean> {
        public static final a d = new a();

        a() {
            super(1);
        }

        @NotNull
        public final Boolean invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            return Boolean.valueOf(view instanceof s9.a);
        }
    }

    public static final void a(@NotNull ViewGroup viewGroup, StepStyle stepStyle, @NotNull View view, Rect rect) {
        int iD;
        StyleElements.SizeSet modalPaddingValue;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        Integer backgroundColorValue;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(view, "innerView");
        if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iD = C0476u.d(context, c4.b.n, null, false, 6, null);
        } else {
            iD = backgroundColorValue.intValue();
        }
        viewGroup.setBackgroundTintList(ColorStateList.valueOf(iD));
        if (stepStyle != null) {
            Context context2 = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableBackgroundImageDrawable = stepStyle.backgroundImageDrawable(context2);
            if (drawableBackgroundImageDrawable != null) {
                d(viewGroup, drawableBackgroundImageDrawable);
            }
        }
        if (stepStyle != null && (modalPaddingValue = stepStyle.getModalPaddingValue()) != null) {
            StyleElements.Size left = modalPaddingValue.getLeft();
            if (left == null || (dp4 = left.getDp()) == null) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(((int) C0458f.a(dp4.doubleValue())) - (rect != null ? rect.left : 0));
            }
            StyleElements.Size top = modalPaddingValue.getTop();
            if (top == null || (dp3 = top.getDp()) == null) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(((int) C0458f.a(dp3.doubleValue())) - (rect != null ? rect.top : 0));
            }
            StyleElements.Size right = modalPaddingValue.getRight();
            if (right == null || (dp2 = right.getDp()) == null) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(((int) C0458f.a(dp2.doubleValue())) - (rect != null ? rect.right : 0));
            }
            StyleElements.Size bottom = modalPaddingValue.getBottom();
            if (bottom == null || (dp = bottom.getDp()) == null) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(((int) C0458f.a(dp.doubleValue())) - (rect != null ? rect.bottom : 0));
            }
            view.setPadding(numValueOf != null ? numValueOf.intValue() : viewGroup.getPaddingLeft(), numValueOf2 != null ? numValueOf2.intValue() : viewGroup.getPaddingTop(), numValueOf3 != null ? numValueOf3.intValue() : viewGroup.getPaddingRight(), numValueOf4 != null ? numValueOf4.intValue() : viewGroup.getPaddingBottom());
        }
        viewGroup.setBackground(c(stepStyle != null ? stepStyle.getModalBorderRadiusValue() : null));
    }

    public static void b(ViewGroup viewGroup, StepStyle stepStyle, View view, Rect rect, int i, Object obj) {
        if ((i & 2) != 0) {
            view = viewGroup;
        }
        if ((i & 4) != 0) {
            rect = null;
        }
        a(viewGroup, stepStyle, view, rect);
    }

    private static final GradientDrawable c(StyleElements.Size size) {
        Double dp;
        GradientDrawable gradientDrawable = new GradientDrawable();
        float fA = (float) C0458f.a((size == null || (dp = size.getDp()) == null) ? 12.0d : dp.doubleValue());
        gradientDrawable.setCornerRadii(new float[]{fA, fA, fA, fA, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(ColorStateList.valueOf(-1));
        return gradientDrawable;
    }

    private static final void d(ViewGroup viewGroup, Drawable drawable) {
        Sequence sequenceI = kotlin.sequences.g.i(e0.a(viewGroup), a.d);
        if (kotlin.sequences.g.f(sequenceI)) {
            ((View) kotlin.sequences.g.l(sequenceI)).setBackground(drawable);
            return;
        }
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View aVar = new s9.a(context);
        aVar.setBackground(drawable);
        viewGroup.addView(aVar, 0);
        ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
        bVar.q = viewGroup.getId();
        bVar.s = viewGroup.getId();
        bVar.h = viewGroup.getId();
        bVar.k = viewGroup.getId();
        aVar.setLayoutParams(bVar);
    }
}
