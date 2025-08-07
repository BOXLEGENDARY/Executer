package s9;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import ha.C0458f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\n\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;", "styles", "", "d", "(Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;)V", "Landroid/widget/Button;", "", "isLoading", "shouldStyleWidthAndHeight", "c", "(Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZZ)V", "isEnabled", "Landroid/graphics/drawable/GradientDrawable;", "b", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZZ)Landroid/graphics/drawable/GradientDrawable;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.l implements Function0<Unit> {
        final BaseButtonComponentStyle d;
        final Button e;
        final boolean i;
        final boolean v;

        b(BaseButtonComponentStyle baseButtonComponentStyle, Button button, boolean z, boolean z2) {
            super(0);
            this.d = baseButtonComponentStyle;
            this.e = button;
            this.i = z;
            this.v = z2;
        }

        public Object invoke() throws P9.m {
            m690invoke();
            return Unit.a;
        }

        public final void m690invoke() throws P9.m {
            d.e(this.d, this.e, this.i, this.v);
        }
    }

    private static final GradientDrawable b(BaseButtonComponentStyle baseButtonComponentStyle, boolean z, boolean z2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Double borderWidthValue = baseButtonComponentStyle.getBorderWidthValue();
        int iA = borderWidthValue != null ? (int) C0458f.a(borderWidthValue.doubleValue()) : 0;
        Integer baseBorderColorValue = baseButtonComponentStyle.getBaseBorderColorValue();
        int iIntValue = baseBorderColorValue != null ? baseBorderColorValue.intValue() : 0;
        Integer activeTextColorValue = baseButtonComponentStyle.getActiveTextColorValue();
        int iIntValue2 = activeTextColorValue != null ? activeTextColorValue.intValue() : iIntValue;
        Integer disabledTextColorValue = baseButtonComponentStyle.getDisabledTextColorValue();
        gradientDrawable.setStroke(iA, new ColorStateList(new int[][]{new int[]{android.R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue2, disabledTextColorValue != null ? disabledTextColorValue.intValue() : iIntValue, iIntValue}));
        Double borderRadiusValue = baseButtonComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            float fA = (float) C0458f.a(borderRadiusValue.doubleValue());
            Drawable drawableMutate = gradientDrawable.mutate();
            Intrinsics.e(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableMutate).setCornerRadii(new float[]{fA, fA, fA, fA, fA, fA, fA, fA});
        }
        Integer baseBackgroundColorValue = baseButtonComponentStyle.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            Integer activeBackgroundColorValue = baseButtonComponentStyle.getActiveBackgroundColorValue();
            int iIntValue3 = activeBackgroundColorValue != null ? activeBackgroundColorValue.intValue() : baseBackgroundColorValue.intValue();
            Integer disabledBackgroundColorValue = baseButtonComponentStyle.getDisabledBackgroundColorValue();
            int iIntValue4 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : baseBackgroundColorValue.intValue();
            new ColorStateList(new int[][]{new int[]{android.R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue3, iIntValue4, baseBackgroundColorValue.intValue()});
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue3, iIntValue4, baseBackgroundColorValue.intValue()}));
        }
        return gradientDrawable;
    }

    public static final void c(@NotNull Button button, @NotNull BaseButtonComponentStyle baseButtonComponentStyle, boolean z, boolean z2) throws P9.m {
        Intrinsics.checkNotNullParameter(button, "<this>");
        Intrinsics.checkNotNullParameter(baseButtonComponentStyle, "styles");
        if (button.isLaidOut()) {
            e(baseButtonComponentStyle, button, z, z2);
        } else {
            j9.o.b(button, new b(baseButtonComponentStyle, button, z, z2));
        }
    }

    public static final void d(@NotNull ButtonWithLoadingIndicator buttonWithLoadingIndicator, @NotNull BaseButtonComponentStyle baseButtonComponentStyle) throws P9.m {
        Intrinsics.checkNotNullParameter(buttonWithLoadingIndicator, "<this>");
        Intrinsics.checkNotNullParameter(baseButtonComponentStyle, "styles");
        f(buttonWithLoadingIndicator.getButton(), baseButtonComponentStyle, false, false, 6, null);
        Integer activeTextColorValue = baseButtonComponentStyle.getActiveTextColorValue();
        if (activeTextColorValue != null) {
            buttonWithLoadingIndicator.getProgressBar().setIndeterminateTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{activeTextColorValue.intValue()}));
        }
    }

    public static final void e(BaseButtonComponentStyle baseButtonComponentStyle, Button button, boolean z, boolean z2) throws P9.m {
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        Integer baseTextColorValue = baseButtonComponentStyle.getBaseTextColorValue();
        if (baseTextColorValue != null) {
            int iIntValue = baseTextColorValue.intValue();
            Integer activeTextColorValue = baseButtonComponentStyle.getActiveTextColorValue();
            int iIntValue2 = activeTextColorValue != null ? activeTextColorValue.intValue() : iIntValue;
            Integer disabledTextColorValue = baseButtonComponentStyle.getDisabledTextColorValue();
            button.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue2, disabledTextColorValue != null ? disabledTextColorValue.intValue() : iIntValue, iIntValue}));
        }
        Double fontSizeValue = baseButtonComponentStyle.getFontSizeValue();
        if (fontSizeValue != null) {
            button.setTextSize((float) fontSizeValue.doubleValue());
        }
        Double letterSpacingValue = baseButtonComponentStyle.getLetterSpacingValue();
        if (letterSpacingValue != null) {
            button.setLetterSpacing((float) (letterSpacingValue.doubleValue() / button.getTextSize()));
        }
        String fontNameValue = baseButtonComponentStyle.getFontNameValue();
        if (fontNameValue != null) {
            v.d(button, fontNameValue);
        }
        StyleElements.FontWeight fontWeightValue = baseButtonComponentStyle.getFontWeightValue();
        if (fontWeightValue != null && Build.VERSION.SDK_INT >= 29) {
            v.b(button, fontWeightValue);
        }
        Double lineHeightValue = baseButtonComponentStyle.getLineHeightValue();
        if (lineHeightValue != null) {
            double dDoubleValue = lineHeightValue.doubleValue();
            if (Build.VERSION.SDK_INT >= 28) {
                button.setLineHeight((int) C0458f.a(dDoubleValue));
            }
        }
        button.setBackground(b(baseButtonComponentStyle, button.isEnabled(), z));
        button.setBackgroundTintList(null);
        float f = 0.0f;
        button.setElevation(0.0f);
        button.setStateListAnimator(null);
        button.setAllCaps(false);
        Object parent = button.getParent();
        View view = parent instanceof ButtonWithLoadingIndicator ? (View) parent : button;
        StyleElements.SizeSet marginValue = baseButtonComponentStyle.getMarginValue();
        if (marginValue != null) {
            u9.d.c(button, marginValue);
            if (view instanceof ButtonWithLoadingIndicator) {
                ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) view;
                ProgressBar progressBar = buttonWithLoadingIndicator.getProgressBar();
                StyleElements.Size left = marginValue.getLeft();
                int paddingLeft = (left == null || (dp4 = left.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingLeft() : (int) C0458f.a(dp4.doubleValue());
                StyleElements.Size top = marginValue.getTop();
                int paddingTop = (top == null || (dp3 = top.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingTop() : (int) C0458f.a(dp3.doubleValue());
                StyleElements.Size right = marginValue.getRight();
                int paddingRight = (right == null || (dp2 = right.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingRight() : (int) C0458f.a(dp2.doubleValue());
                StyleElements.Size bottom = marginValue.getBottom();
                progressBar.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp = bottom.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingBottom() : (int) C0458f.a(dp.doubleValue()));
            }
        }
        StyleElements.SizeSet paddingValue = baseButtonComponentStyle.getPaddingValue();
        if (paddingValue != null) {
            u9.d.e(button, paddingValue);
        }
        int measuredWidth = view.getMeasuredWidth();
        ConstraintLayout.b layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Double widthValue = baseButtonComponentStyle.getWidthValue();
        if (widthValue != null) {
            double dDoubleValue2 = widthValue.doubleValue();
            if (z2) {
                ((ViewGroup.LayoutParams) layoutParams).width = kotlin.ranges.b.f((int) C0458f.a(dDoubleValue2), measuredWidth);
            }
        }
        Double heightValue = baseButtonComponentStyle.getHeightValue();
        if (heightValue != null) {
            double dDoubleValue3 = heightValue.doubleValue();
            if (z2) {
                ((ViewGroup.LayoutParams) layoutParams).height = (int) C0458f.a(dDoubleValue3);
            }
        }
        if (view instanceof ButtonWithLoadingIndicator) {
            int i = ((ViewGroup.LayoutParams) layoutParams).height;
            ViewGroup.LayoutParams layoutParams2 = button.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i2 = i + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            ViewGroup.LayoutParams layoutParams3 = button.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            ((ViewGroup.LayoutParams) layoutParams).height = i2 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
        }
        StyleElements.PositionType justificationValue = baseButtonComponentStyle.getJustificationValue();
        if (justificationValue != null && (layoutParams instanceof ConstraintLayout.b)) {
            ConstraintLayout.b bVar = layoutParams;
            int i3 = a.a[justificationValue.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    f = 0.5f;
                } else {
                    if (i3 != 3) {
                        throw new P9.m();
                    }
                    f = 1.0f;
                }
            }
            bVar.z = f;
        }
        view.setLayoutParams(layoutParams);
    }

    public static void f(Button button, BaseButtonComponentStyle baseButtonComponentStyle, boolean z, boolean z2, int i, Object obj) throws P9.m {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        c(button, baseButtonComponentStyle, z, z2);
    }
}
