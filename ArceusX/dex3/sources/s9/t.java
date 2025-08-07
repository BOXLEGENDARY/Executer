package s9;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import ha.C0458f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "styles", "", "j", "(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V", "", "color", "i", "(Lcom/google/android/material/textfield/TextInputLayout;I)V", "", "hasFocus", "baseBackgroundColor", "focusedColor", "disabledColor", "h", "(Lcom/google/android/material/textfield/TextInputLayout;ZIII)V", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class t {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasFocus", "", "a", "(Z)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function1<Boolean, Unit> {
        final TextInputLayout d;
        final int e;
        final int i;
        final int v;

        a(TextInputLayout textInputLayout, int i, int i2, int i3) {
            super(1);
            this.d = textInputLayout;
            this.e = i;
            this.i = i2;
            this.v = i3;
        }

        public final void a(boolean z) {
            CharSequence error = this.d.getError();
            if (error == null || !StringsKt.U0(error)) {
                t.h(this.d, z, this.e, this.i, this.v);
            }
        }

        public Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.a;
        }
    }

    public static final void h(TextInputLayout textInputLayout, boolean z, int i, int i2, int i3) {
        if (z) {
            textInputLayout.setBoxBackgroundColor(i2);
        } else if (textInputLayout.isEnabled()) {
            textInputLayout.setBoxBackgroundColor(i);
        } else {
            textInputLayout.setBoxBackgroundColor(i3);
        }
    }

    private static final void i(TextInputLayout textInputLayout, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            EditText editText = textInputLayout.getEditText();
            Drawable textCursorDrawable = editText != null ? editText.getTextCursorDrawable() : null;
            if (textCursorDrawable == null) {
                return;
            }
            j.a();
            textCursorDrawable.setColorFilter(i.a(i, BlendMode.SRC_ATOP));
        }
    }

    public static final void j(@NotNull final TextInputLayout textInputLayout, @NotNull InputTextBasedComponentStyle inputTextBasedComponentStyle) {
        Integer focusedBackgroundColorValue;
        Double valueLineHeightValue;
        EditText editText;
        EditText editText2;
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        Intrinsics.checkNotNullParameter(inputTextBasedComponentStyle, "styles");
        Integer baseBorderColorValue = inputTextBasedComponentStyle.getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            int iIntValue = baseBorderColorValue.intValue();
            Integer focusedBorderColorValue = inputTextBasedComponentStyle.getFocusedBorderColorValue();
            int iIntValue2 = focusedBorderColorValue != null ? focusedBorderColorValue.intValue() : iIntValue;
            Integer disabledBorderColorValue = inputTextBasedComponentStyle.getDisabledBorderColorValue();
            textInputLayout.setBoxStrokeColorStateList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_active}, new int[]{android.R.attr.state_focused}, new int[]{-16842910}}, new int[]{iIntValue, iIntValue2, disabledBorderColorValue != null ? disabledBorderColorValue.intValue() : iIntValue}));
            Integer errorBorderColorValue = inputTextBasedComponentStyle.getErrorBorderColorValue();
            if (errorBorderColorValue != null) {
                iIntValue = errorBorderColorValue.intValue();
            }
            textInputLayout.setBoxStrokeErrorColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_active}, new int[]{android.R.attr.state_focused}, new int[]{-16842910}}, new int[]{iIntValue, iIntValue, iIntValue}));
        }
        final y yVar = new y();
        Integer baseBackgroundColorValue = inputTextBasedComponentStyle.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            final int iIntValue3 = baseBackgroundColorValue.intValue();
            Integer focusedBackgroundColorValue2 = inputTextBasedComponentStyle.getFocusedBackgroundColorValue();
            final int iIntValue4 = focusedBackgroundColorValue2 != null ? focusedBackgroundColorValue2.intValue() : iIntValue3;
            Integer disabledBackgroundColorValue = inputTextBasedComponentStyle.getDisabledBackgroundColorValue();
            final int iIntValue5 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : iIntValue3;
            Integer errorBackgroundColorValue = inputTextBasedComponentStyle.getErrorBackgroundColorValue();
            final int iIntValue6 = errorBackgroundColorValue != null ? errorBackgroundColorValue.intValue() : iIntValue3;
            textInputLayout.setBoxBackgroundMode(2);
            h(textInputLayout, textInputLayout.hasFocus(), iIntValue3, iIntValue4, iIntValue5);
            yVar.d = new a(textInputLayout, iIntValue3, iIntValue4, iIntValue5);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i10) {
                    t.m(textInputLayout, iIntValue6, iIntValue3, iIntValue4, iIntValue5, view, i, i2, i3, i4, i5, i6, i7, i10);
                }
            });
        }
        Double borderWidthValue = inputTextBasedComponentStyle.getBorderWidthValue();
        if (borderWidthValue != null) {
            double dDoubleValue = borderWidthValue.doubleValue();
            textInputLayout.setBoxStrokeWidth((int) Math.ceil(C0458f.a(dDoubleValue)));
            textInputLayout.setBoxStrokeWidthFocused((int) Math.ceil(C0458f.a(dDoubleValue)));
        }
        Double borderRadiusValue = inputTextBasedComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            double dDoubleValue2 = borderRadiusValue.doubleValue();
            textInputLayout.b0((float) C0458f.a(dDoubleValue2), (float) C0458f.a(dDoubleValue2), (float) C0458f.a(dDoubleValue2), (float) C0458f.a(dDoubleValue2));
        }
        Double valueFontSizeValue = inputTextBasedComponentStyle.getValueFontSizeValue();
        if (valueFontSizeValue != null) {
            double dDoubleValue3 = valueFontSizeValue.doubleValue();
            EditText editText3 = textInputLayout.getEditText();
            if (editText3 != null) {
                editText3.setTextSize((float) dDoubleValue3);
            }
        }
        Double valueLetterSpacingValue = inputTextBasedComponentStyle.getValueLetterSpacingValue();
        if (valueLetterSpacingValue != null) {
            double dDoubleValue4 = valueLetterSpacingValue.doubleValue() / (textInputLayout.getEditText() != null ? r2.getTextSize() : 12.0f);
            EditText editText4 = textInputLayout.getEditText();
            if (editText4 != null) {
                editText4.setLetterSpacing((float) dDoubleValue4);
            }
        }
        String baseFontFamilyValue = inputTextBasedComponentStyle.getBaseFontFamilyValue();
        if (baseFontFamilyValue != null) {
            EditText editText5 = textInputLayout.getEditText();
            if (editText5 != null) {
                Intrinsics.d(editText5);
                v.d(editText5, baseFontFamilyValue);
            }
            EditText editText6 = textInputLayout.getEditText();
            textInputLayout.setTypeface(editText6 != null ? editText6.getTypeface() : null);
        }
        String valueFontFamilyValue = inputTextBasedComponentStyle.getValueFontFamilyValue();
        if (valueFontFamilyValue != null && (editText2 = textInputLayout.getEditText()) != null) {
            Intrinsics.d(editText2);
            v.d(editText2, valueFontFamilyValue);
        }
        StyleElements.FontWeight valueFontWeightValue = inputTextBasedComponentStyle.getValueFontWeightValue();
        if (valueFontWeightValue != null && Build.VERSION.SDK_INT >= 29 && (editText = textInputLayout.getEditText()) != null) {
            Intrinsics.d(editText);
            v.b(editText, valueFontWeightValue);
        }
        if (Build.VERSION.SDK_INT >= 28 && (valueLineHeightValue = inputTextBasedComponentStyle.getValueLineHeightValue()) != null) {
            double dDoubleValue5 = valueLineHeightValue.doubleValue();
            EditText editText7 = textInputLayout.getEditText();
            if (editText7 != null) {
                editText7.setLineHeight((int) C0458f.a(dDoubleValue5));
            }
        }
        Integer baseTextColor = inputTextBasedComponentStyle.getBaseTextColor();
        if (baseTextColor != null) {
            int iIntValue7 = baseTextColor.intValue();
            Integer valueFocusedTextColor = inputTextBasedComponentStyle.getValueFocusedTextColor();
            final int iIntValue8 = valueFocusedTextColor != null ? valueFocusedTextColor.intValue() : iIntValue7;
            Integer valueDisabledTextColor = inputTextBasedComponentStyle.getValueDisabledTextColor();
            int iIntValue9 = valueDisabledTextColor != null ? valueDisabledTextColor.intValue() : iIntValue7;
            Integer valueErrorTextColor = inputTextBasedComponentStyle.getValueErrorTextColor();
            final int iIntValue10 = valueErrorTextColor != null ? valueErrorTextColor.intValue() : iIntValue7;
            final ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_active}, new int[]{android.R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue7, iIntValue8, iIntValue9, iIntValue7});
            EditText editText8 = textInputLayout.getEditText();
            if (editText8 != null) {
                editText8.setTextColor(colorStateList);
            }
            i(textInputLayout, iIntValue8);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i10) {
                    t.k(textInputLayout, iIntValue10, colorStateList, iIntValue8, view, i, i2, i3, i4, i5, i6, i7, i10);
                }
            });
        }
        Integer errorBaseTextColor = inputTextBasedComponentStyle.getErrorBaseTextColor();
        if (errorBaseTextColor != null) {
            int iIntValue11 = errorBaseTextColor.intValue();
            Integer errorErrorTextColor = inputTextBasedComponentStyle.getErrorErrorTextColor();
            int iIntValue12 = errorErrorTextColor != null ? errorErrorTextColor.intValue() : iIntValue11;
            Integer errorFocusedTextColor = inputTextBasedComponentStyle.getErrorFocusedTextColor();
            int iIntValue13 = errorFocusedTextColor != null ? errorFocusedTextColor.intValue() : iIntValue11;
            Integer errorDisabledTextColor = inputTextBasedComponentStyle.getErrorDisabledTextColor();
            if (errorDisabledTextColor != null) {
                iIntValue11 = errorDisabledTextColor.intValue();
            }
            textInputLayout.setErrorTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_active}, new int[]{android.R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue12, iIntValue13, iIntValue11, iIntValue12}));
        }
        Integer labelBaseTextColor = inputTextBasedComponentStyle.getLabelBaseTextColor();
        if (labelBaseTextColor != null) {
            int iIntValue14 = labelBaseTextColor.intValue();
            Integer labelFocusedTextColor = inputTextBasedComponentStyle.getLabelFocusedTextColor();
            int iIntValue15 = labelFocusedTextColor != null ? labelFocusedTextColor.intValue() : iIntValue14;
            Integer labelDisabledTextColor = inputTextBasedComponentStyle.getLabelDisabledTextColor();
            int iIntValue16 = labelDisabledTextColor != null ? labelDisabledTextColor.intValue() : iIntValue14;
            Integer labelErrorTextColor = inputTextBasedComponentStyle.getLabelErrorTextColor();
            int iIntValue17 = labelErrorTextColor != null ? labelErrorTextColor.intValue() : iIntValue14;
            final ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{android.R.attr.state_active}, new int[]{android.R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue14, iIntValue15, iIntValue16, iIntValue14});
            final ColorStateList colorStateList3 = new ColorStateList(new int[][]{new int[]{android.R.attr.state_active}, new int[]{android.R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue17, iIntValue17, iIntValue17, iIntValue17});
            textInputLayout.setDefaultHintTextColor(colorStateList2);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i10) {
                    t.l(textInputLayout, colorStateList3, colorStateList2, view, i, i2, i3, i4, i5, i6, i7, i10);
                }
            });
        }
        MaterialAutoCompleteTextView editText9 = textInputLayout.getEditText();
        MaterialAutoCompleteTextView materialAutoCompleteTextView = editText9 instanceof MaterialAutoCompleteTextView ? editText9 : null;
        if (materialAutoCompleteTextView != null && (focusedBackgroundColorValue = inputTextBasedComponentStyle.getFocusedBackgroundColorValue()) != null) {
            materialAutoCompleteTextView.setDropDownBackgroundDrawable(new ColorDrawable(focusedBackgroundColorValue.intValue()));
        }
        StyleElements.SizeSet inputTextBoxMargins = inputTextBasedComponentStyle.getInputTextBoxMargins();
        if (inputTextBoxMargins != null) {
            u9.d.c(textInputLayout, inputTextBoxMargins);
        }
        Integer placeholderBaseTextColor = inputTextBasedComponentStyle.getPlaceholderBaseTextColor();
        if (placeholderBaseTextColor != null) {
            int iIntValue18 = placeholderBaseTextColor.intValue();
            Integer placeholderFocusedTextColor = inputTextBasedComponentStyle.getPlaceholderFocusedTextColor();
            int iIntValue19 = placeholderFocusedTextColor != null ? placeholderFocusedTextColor.intValue() : iIntValue18;
            Integer placeholderErrorTextColor = inputTextBasedComponentStyle.getPlaceholderErrorTextColor();
            int iIntValue20 = placeholderErrorTextColor != null ? placeholderErrorTextColor.intValue() : iIntValue18;
            Integer placeholderDisabledTextColor = inputTextBasedComponentStyle.getPlaceholderDisabledTextColor();
            final ColorStateList colorStateList4 = new ColorStateList(new int[][]{new int[]{android.R.attr.state_active}, new int[]{android.R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue18, iIntValue19, placeholderDisabledTextColor != null ? placeholderDisabledTextColor.intValue() : iIntValue18, iIntValue18});
            final ColorStateList colorStateList5 = new ColorStateList(new int[][]{new int[]{android.R.attr.state_active}, new int[]{android.R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue20, iIntValue20, iIntValue20, iIntValue20});
            textInputLayout.setPlaceholderTextColor(colorStateList4);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i10) {
                    t.n(textInputLayout, colorStateList5, colorStateList4, view, i, i2, i3, i4, i5, i6, i7, i10);
                }
            });
        }
        EditText editText10 = textInputLayout.getEditText();
        if (editText10 != null) {
            editText10.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public final void onFocusChange(View view, boolean z) {
                    t.o(textInputLayout, yVar, view, z);
                }
            });
        }
        Integer baseMaskToggleColor = inputTextBasedComponentStyle.getBaseMaskToggleColor();
        if (baseMaskToggleColor != null) {
            int iIntValue21 = baseMaskToggleColor.intValue();
            Integer focusedMaskToggleColor = inputTextBasedComponentStyle.getFocusedMaskToggleColor();
            int iIntValue22 = focusedMaskToggleColor != null ? focusedMaskToggleColor.intValue() : iIntValue21;
            Integer disabledMaskToggleColor = inputTextBasedComponentStyle.getDisabledMaskToggleColor();
            textInputLayout.setEndIconTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_active}, new int[]{android.R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue21, iIntValue22, disabledMaskToggleColor != null ? disabledMaskToggleColor.intValue() : iIntValue21, iIntValue21}));
        }
    }

    public static final void k(TextInputLayout textInputLayout, int i, ColorStateList colorStateList, int i2, View view, int i3, int i4, int i5, int i6, int i7, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(textInputLayout, "$this_style");
        Intrinsics.checkNotNullParameter(colorStateList, "$colorState");
        CharSequence error = textInputLayout.getError();
        if (error == null || !StringsKt.U0(error)) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                editText.setTextColor(colorStateList);
            }
            i(textInputLayout, i2);
            return;
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            editText2.setTextColor(i);
        }
        i(textInputLayout, i);
    }

    public static final void l(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i10) {
        Intrinsics.checkNotNullParameter(textInputLayout, "$this_style");
        Intrinsics.checkNotNullParameter(colorStateList, "$errorColorState");
        Intrinsics.checkNotNullParameter(colorStateList2, "$colorState");
        CharSequence error = textInputLayout.getError();
        if (error == null || !StringsKt.U0(error)) {
            textInputLayout.setDefaultHintTextColor(colorStateList2);
        } else {
            textInputLayout.setDefaultHintTextColor(colorStateList);
        }
    }

    public static final void m(TextInputLayout textInputLayout, int i, int i2, int i3, int i4, View view, int i5, int i6, int i7, int i10, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(textInputLayout, "$this_style");
        CharSequence error = textInputLayout.getError();
        if (error == null || !StringsKt.U0(error)) {
            h(textInputLayout, textInputLayout.hasFocus(), i2, i3, i4);
        } else {
            textInputLayout.setBoxBackgroundColor(i);
        }
    }

    public static final void n(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i10) {
        Intrinsics.checkNotNullParameter(textInputLayout, "$this_style");
        Intrinsics.checkNotNullParameter(colorStateList, "$errorColorState");
        Intrinsics.checkNotNullParameter(colorStateList2, "$colorState");
        CharSequence error = textInputLayout.getError();
        if (error == null || !StringsKt.U0(error)) {
            textInputLayout.setPlaceholderTextColor(colorStateList2);
        } else {
            textInputLayout.setPlaceholderTextColor(colorStateList);
        }
    }

    public static final void o(TextInputLayout textInputLayout, final y yVar, View view, final boolean z) {
        Intrinsics.checkNotNullParameter(textInputLayout, "$this_style");
        Intrinsics.checkNotNullParameter(yVar, "$onFocusBackgroundChange");
        textInputLayout.post(new Runnable() {
            @Override
            public final void run() {
                t.p(yVar, z);
            }
        });
    }

    public static final void p(y yVar, boolean z) {
        Intrinsics.checkNotNullParameter(yVar, "$onFocusBackgroundChange");
        Function1 function1 = (Function1) yVar.d;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }
}
