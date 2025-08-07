package u9;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import ha.C0458f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n9.t0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0003*\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000b\u001a%\u0010\u0013\u001a\u00020\u0003*\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroid/view/View;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "margins", "", "c", "(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;)V", "padding", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "width", "b", "(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;)V", "height", "a", "Lcom/google/android/material/textfield/TextInputLayout;", "", "errorMessage", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "errorTextStyle", "d", "(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class d {
    public static final void a(@NotNull View view, StyleElements.Size size) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ConstraintLayout.b layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (size instanceof StyleElements.DPSize) {
            Double dp = ((StyleElements.DPSize) size).getDp();
            if (dp == null) {
                return;
            } else {
                ((ViewGroup.LayoutParams) layoutParams).height = (int) C0458f.a(dp.doubleValue());
            }
        } else if (size instanceof StyleElements.Size.PercentSize) {
            Object parent = view.getParent();
            if (layoutParams instanceof ConstraintLayout.b) {
                layoutParams.P = (float) ((StyleElements.Size.PercentSize) size).getPercent();
            } else if (parent instanceof View) {
                ((ViewGroup.LayoutParams) layoutParams).height = (int) (((StyleElements.Size.PercentSize) size).getPercent() * ((View) parent).getHeight());
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public static final void b(@NotNull View view, StyleElements.Size size) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ConstraintLayout.b layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (size instanceof StyleElements.DPSize) {
            Double dp = ((StyleElements.DPSize) size).getDp();
            if (dp == null) {
                return;
            }
            int iA = (int) C0458f.a(dp.doubleValue());
            ViewGroup.LayoutParams layoutParams2 = view2 != null ? view2.getLayoutParams() : null;
            int width = Integer.MAX_VALUE;
            if ((layoutParams2 == null || layoutParams2.width != -2) && view2 != null) {
                width = view2.getWidth();
            }
            ((ViewGroup.LayoutParams) layoutParams).width = kotlin.ranges.b.f(iA, width);
        } else if (size instanceof StyleElements.Size.PercentSize) {
            if (layoutParams instanceof ConstraintLayout.b) {
                layoutParams.O = (float) ((StyleElements.Size.PercentSize) size).getPercent();
            } else if (view2 != null) {
                ((ViewGroup.LayoutParams) layoutParams).width = (int) (((StyleElements.Size.PercentSize) size).getPercent() * view2.getWidth());
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public static final void c(@NotNull View view, @NotNull StyleElements.SizeSet sizeSet) {
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(sizeSet, "margins");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            StyleElements.Size left = sizeSet.getLeft();
            marginLayoutParams.leftMargin = (left == null || (dp4 = left.getDp()) == null) ? marginLayoutParams.leftMargin : (int) C0458f.a(dp4.doubleValue());
            StyleElements.Size right = sizeSet.getRight();
            marginLayoutParams.rightMargin = (right == null || (dp3 = right.getDp()) == null) ? marginLayoutParams.rightMargin : (int) C0458f.a(dp3.doubleValue());
            StyleElements.Size top = sizeSet.getTop();
            marginLayoutParams.topMargin = (top == null || (dp2 = top.getDp()) == null) ? marginLayoutParams.topMargin : (int) C0458f.a(dp2.doubleValue());
            StyleElements.Size bottom = sizeSet.getBottom();
            marginLayoutParams.bottomMargin = (bottom == null || (dp = bottom.getDp()) == null) ? marginLayoutParams.bottomMargin : (int) C0458f.a(dp.doubleValue());
        }
        view.setLayoutParams(layoutParams);
    }

    public static final void d(@NotNull TextInputLayout textInputLayout, String str, TextBasedComponentStyle textBasedComponentStyle) {
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        if (str == null || StringsKt.Y(str)) {
            textInputLayout.setErrorEnabled(false);
            return;
        }
        textInputLayout.setError(str);
        if (textBasedComponentStyle != null) {
            SpannableString spannableString = new SpannableString(textInputLayout.getError());
            String fontNameValue = textBasedComponentStyle.getFontNameValue();
            if (fontNameValue != null) {
                Context context = textInputLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Typeface typefaceA = t0.a(context, fontNameValue);
                if (typefaceA != null) {
                    spannableString.setSpan(new c(typefaceA), 0, spannableString.length(), 33);
                }
            }
            Double fontSizeValue = textBasedComponentStyle.getFontSizeValue();
            if (fontSizeValue != null) {
                spannableString.setSpan(new AbsoluteSizeSpan((int) C0458f.a(fontSizeValue.doubleValue())), 0, spannableString.length(), 33);
            }
            textInputLayout.setError(spannableString);
        }
    }

    public static final void e(@NotNull View view, @NotNull StyleElements.SizeSet sizeSet) {
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(sizeSet, "padding");
        StyleElements.Size left = sizeSet.getLeft();
        int paddingLeft = (left == null || (dp4 = left.getDp()) == null) ? view.getPaddingLeft() : (int) C0458f.a(dp4.doubleValue());
        StyleElements.Size top = sizeSet.getTop();
        int paddingTop = (top == null || (dp3 = top.getDp()) == null) ? view.getPaddingTop() : (int) C0458f.a(dp3.doubleValue());
        StyleElements.Size right = sizeSet.getRight();
        int paddingRight = (right == null || (dp2 = right.getDp()) == null) ? view.getPaddingRight() : (int) C0458f.a(dp2.doubleValue());
        StyleElements.Size bottom = sizeSet.getBottom();
        view.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp = bottom.getDp()) == null) ? view.getPaddingBottom() : (int) C0458f.a(dp.doubleValue()));
    }
}
