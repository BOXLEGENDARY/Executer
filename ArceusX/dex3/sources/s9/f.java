package s9;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import ha.C0458f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "styles", "", "b", "(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;)V", "", "bottomBorderWidth", "a", "(Lcom/google/android/material/textfield/TextInputLayout;I)V", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class f {
    private static final void a(TextInputLayout textInputLayout, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(i, textInputLayout.getBoxStrokeColor());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        int i2 = -i;
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        layerDrawable.setLayerInset(0, i2, i2, i2, marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        textInputLayout.setBackground(layerDrawable);
    }

    public static final void b(@NotNull TextInputLayout textInputLayout, @NotNull InputSelectComponentStyle inputSelectComponentStyle) {
        StyleElements.ComplexElementColor base;
        Integer disabled;
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        Intrinsics.checkNotNullParameter(inputSelectComponentStyle, "styles");
        Integer baseBackgroundColorValue = inputSelectComponentStyle.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            textInputLayout.setBoxBackgroundColor(baseBackgroundColorValue.intValue());
        }
        Integer baseBorderColorValue = inputSelectComponentStyle.getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            int iIntValue = baseBorderColorValue.intValue();
            int[][] iArr = {new int[]{-16842910}, new int[0]};
            AttributeStyles.InputSelectBorderColorStyle borderColor = inputSelectComponentStyle.getBorderColor();
            textInputLayout.setBoxStrokeColorStateList(new ColorStateList(iArr, new int[]{(borderColor == null || (base = borderColor.getBase()) == null || (disabled = base.getDisabled()) == null) ? iIntValue : disabled.intValue(), iIntValue}));
        }
        Double topBorderWidthValue = inputSelectComponentStyle.getTopBorderWidthValue();
        if (topBorderWidthValue != null) {
            double dDoubleValue = topBorderWidthValue.doubleValue();
            textInputLayout.setBoxStrokeWidth((int) Math.ceil(C0458f.a(dDoubleValue)));
            textInputLayout.setBoxStrokeWidthFocused((int) Math.ceil(C0458f.a(dDoubleValue)));
        }
        if (textInputLayout.getBoxStrokeWidth() == 0) {
            Double bottomBorderWidthValue = inputSelectComponentStyle.getBottomBorderWidthValue();
            if ((bottomBorderWidthValue != null ? bottomBorderWidthValue.doubleValue() : 0.0d) > 0.0d) {
                Double bottomBorderWidthValue2 = inputSelectComponentStyle.getBottomBorderWidthValue();
                a(textInputLayout, (int) Math.ceil(bottomBorderWidthValue2 != null ? C0458f.a(bottomBorderWidthValue2.doubleValue()) : 0.0d));
            }
        }
        Integer chevronColor = inputSelectComponentStyle.getChevronColor();
        if (chevronColor != null) {
            int iIntValue2 = chevronColor.intValue();
            textInputLayout.setEndIconTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_active}, new int[]{android.R.attr.state_focused}, new int[]{-16842908}, new int[]{android.R.attr.state_hovered}, new int[]{android.R.attr.state_enabled}, new int[]{-16842910}}, new int[]{iIntValue2, iIntValue2, iIntValue2, iIntValue2, iIntValue2, iIntValue2}));
        }
        Double borderRadiusValue = inputSelectComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            double dDoubleValue2 = borderRadiusValue.doubleValue();
            textInputLayout.b0((float) C0458f.a(dDoubleValue2), (float) C0458f.a(dDoubleValue2), (float) C0458f.a(dDoubleValue2), (float) C0458f.a(dDoubleValue2));
        }
        StyleElements.SizeSet inputSelectBoxMargins = inputSelectComponentStyle.getInputSelectBoxMargins();
        if (inputSelectBoxMargins != null) {
            u9.d.c(textInputLayout, inputSelectBoxMargins);
        }
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            v.e(editText, inputSelectComponentStyle.getTextBasedStyle());
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            u9.d.c(editText2, new StyleElements.SizeSet(new StyleElements.DPSize(Double.valueOf(0.0d)), new StyleElements.DPSize(Double.valueOf(0.0d)), new StyleElements.DPSize(Double.valueOf(0.0d)), new StyleElements.DPSize(Double.valueOf(0.0d))));
        }
    }
}
