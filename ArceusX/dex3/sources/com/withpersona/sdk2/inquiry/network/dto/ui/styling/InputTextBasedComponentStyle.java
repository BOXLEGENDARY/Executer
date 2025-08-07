package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class InputTextBasedComponentStyle implements Parcelable, InputSelectBoxComponentStyle {

    @NotNull
    public static final Parcelable.Creator<InputTextBasedComponentStyle> CREATOR = new Creator();
    private final AttributeStyles.InputTextBackgroundColorStyle backgroundColor;
    private final AttributeStyles.InputTextBorderColorStyle borderColor;
    private final AttributeStyles.InputTextBorderRadiusStyle borderRadius;
    private final AttributeStyles.InputTextBorderWidthStyle borderWidth;
    private final AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily;
    private final AttributeStyles.ComplexTextBasedFontSizeStyle fontSize;
    private final AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight;
    private final AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing;
    private final AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight;
    private final AttributeStyles.InputMarginStyle margin;
    private final AttributeStyles.InputTextStrokeColorStyle strokeColor;
    private final AttributeStyles.ComplexTextBasedTextColorStyle textColor;

    public static final class Creator implements Parcelable.Creator<InputTextBasedComponentStyle> {
        @Override
        @NotNull
        public final InputTextBasedComponentStyle createFromParcel(@NotNull Parcel parcel) {
            return new InputTextBasedComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.InputMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.InputTextStrokeColorStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final InputTextBasedComponentStyle[] newArray(int i) {
            return new InputTextBasedComponentStyle[i];
        }
    }

    public InputTextBasedComponentStyle(AttributeStyles.InputMarginStyle inputMarginStyle, AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle, AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle, AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle, AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle, AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle, AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle, AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle, AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle, AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle, AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle, AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle) {
        this.margin = inputMarginStyle;
        this.fontFamily = complexTextBasedFontFamilyStyle;
        this.fontSize = complexTextBasedFontSizeStyle;
        this.fontWeight = complexTextBasedFontWeightStyle;
        this.letterSpacing = complexTextBasedLetterSpacingStyle;
        this.lineHeight = complexTextBasedLineHeightStyle;
        this.textColor = complexTextBasedTextColorStyle;
        this.borderRadius = inputTextBorderRadiusStyle;
        this.borderWidth = inputTextBorderWidthStyle;
        this.backgroundColor = inputTextBackgroundColorStyle;
        this.borderColor = inputTextBorderColorStyle;
        this.strokeColor = inputTextStrokeColorStyle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public final AttributeStyles.InputTextBackgroundColorStyle getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override
    public Integer getBaseBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
        if (inputTextBackgroundColorStyle == null || (base = inputTextBackgroundColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override
    public Integer getBaseBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
        if (inputTextBorderColorStyle == null || (base = inputTextBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final String getBaseFontFamilyValue() {
        StyleElements.FontName base;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null || (base = complexTextBasedFontFamilyStyle.getBase()) == null) {
            return null;
        }
        return base.getFontName();
    }

    public final Double getBaseLetterSpacingValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        if (complexTextBasedLetterSpacingStyle == null || (base = complexTextBasedLetterSpacingStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final Integer getBaseMaskToggleColor() {
        StyleElements.ComplexElementColor maskToggle;
        AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = this.strokeColor;
        if (inputTextStrokeColorStyle == null || (maskToggle = inputTextStrokeColorStyle.getMaskToggle()) == null) {
            return null;
        }
        return maskToggle.getBase();
    }

    @Override
    public Integer getBaseTextColor() {
        StyleElements.ComplexElementColor value;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (value = complexTextBasedTextColorStyle.getValue()) == null) {
            return null;
        }
        return value.getBase();
    }

    public final AttributeStyles.InputTextBorderColorStyle getBorderColor() {
        return this.borderColor;
    }

    public final AttributeStyles.InputTextBorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    public final Double getBorderRadiusValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = this.borderRadius;
        if (inputTextBorderRadiusStyle == null || (base = inputTextBorderRadiusStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.InputTextBorderWidthStyle getBorderWidth() {
        return this.borderWidth;
    }

    public final Double getBorderWidthValue() {
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        StyleElements.Size top;
        AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = this.borderWidth;
        if (inputTextBorderWidthStyle == null || (base = inputTextBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (top = base2.getTop()) == null) {
            return null;
        }
        return top.getDp();
    }

    public final Integer getDisabledBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer disabled;
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
        return (inputTextBackgroundColorStyle == null || (base = inputTextBackgroundColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseBackgroundColorValue() : disabled;
    }

    public final Integer getDisabledBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
        if (inputTextBorderColorStyle == null || (base = inputTextBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getDisabled();
    }

    public final Integer getDisabledMaskToggleColor() {
        StyleElements.ComplexElementColor maskToggle;
        AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = this.strokeColor;
        if (inputTextStrokeColorStyle == null || (maskToggle = inputTextStrokeColorStyle.getMaskToggle()) == null) {
            return null;
        }
        return maskToggle.getDisabled();
    }

    public final Integer getErrorBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer errored;
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
        return (inputTextBackgroundColorStyle == null || (base = inputTextBackgroundColorStyle.getBase()) == null || (errored = base.getErrored()) == null) ? getBaseBackgroundColorValue() : errored;
    }

    public final Integer getErrorBaseTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (error = complexTextBasedTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getBase();
    }

    public final Integer getErrorBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
        if (inputTextBorderColorStyle == null || (base = inputTextBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getErrored();
    }

    public final Integer getErrorDisabledTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (error = complexTextBasedTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getDisabled();
    }

    public final Integer getErrorErrorTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (error = complexTextBasedTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getErrored();
    }

    public final Integer getErrorFocusedTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (error = complexTextBasedTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getFocused();
    }

    public final String getErrorFontFamilyValue() {
        StyleElements.FontName error;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null || (error = complexTextBasedFontFamilyStyle.getError()) == null) {
            return null;
        }
        return error.getFontName();
    }

    public final Double getErrorFontSizeValue() {
        StyleElements.Measurement error;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        if (complexTextBasedFontSizeStyle == null || (error = complexTextBasedFontSizeStyle.getError()) == null || (base = error.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    public final StyleElements.FontWeight getErrorFontWeightValue() {
        StyleElements.FontWeightContainer error;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        if (complexTextBasedFontWeightStyle == null || (error = complexTextBasedFontWeightStyle.getError()) == null) {
            return null;
        }
        return error.getBase();
    }

    public final Double getErrorLetterSpacingValue() {
        StyleElements.Measurement error;
        StyleElements.Size base;
        Double dp;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        return (complexTextBasedLetterSpacingStyle == null || (error = complexTextBasedLetterSpacingStyle.getError()) == null || (base = error.getBase()) == null || (dp = base.getDp()) == null) ? getBaseLetterSpacingValue() : dp;
    }

    public final Double getErrorLineHeightValue() {
        StyleElements.Measurement error;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        if (complexTextBasedLineHeightStyle == null || (error = complexTextBasedLineHeightStyle.getError()) == null || (base = error.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    @Override
    @NotNull
    public TextBasedComponentStyle getErrorTextStyle() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        Integer base = null;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getError() : null);
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getError() : null);
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getError() : null);
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getError() : null);
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getError() : null);
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle != null && (error = complexTextBasedTextColorStyle.getError()) != null) {
            base = error.getBase();
        }
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
    }

    @Override
    public Integer getFocusedBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer focused;
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
        return (inputTextBackgroundColorStyle == null || (base = inputTextBackgroundColorStyle.getBase()) == null || (focused = base.getFocused()) == null) ? getBaseBackgroundColorValue() : focused;
    }

    public final Integer getFocusedBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
        if (inputTextBorderColorStyle == null || (base = inputTextBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getFocused();
    }

    public final Integer getFocusedMaskToggleColor() {
        StyleElements.ComplexElementColor maskToggle;
        AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = this.strokeColor;
        if (inputTextStrokeColorStyle == null || (maskToggle = inputTextStrokeColorStyle.getMaskToggle()) == null) {
            return null;
        }
        return maskToggle.getFocused();
    }

    @NotNull
    public final TextBasedComponentStyle getFocusedTextBasedStyle() {
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getValue() : null), new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(getValueFocusedTextColor()))), null);
    }

    public final AttributeStyles.ComplexTextBasedFontFamilyStyle getFontFamily() {
        return this.fontFamily;
    }

    public final AttributeStyles.ComplexTextBasedFontSizeStyle getFontSize() {
        return this.fontSize;
    }

    public final AttributeStyles.ComplexTextBasedFontWeightStyle getFontWeight() {
        return this.fontWeight;
    }

    @Override
    public Integer getHeaderCancelButtonColor() {
        return getBaseTextColor();
    }

    public final StyleElements.SizeSet getInputTextBoxMargins() {
        StyleElements.MeasurementSet base;
        AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
        if (inputMarginStyle == null || (base = inputMarginStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final Integer getLabelBaseTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getBase();
    }

    public final Integer getLabelDisabledTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getDisabled();
    }

    public final Integer getLabelErrorTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getErrored();
    }

    public final Integer getLabelFocusedTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getFocused();
    }

    public final String getLabelFontFamilyValue() {
        StyleElements.FontName label;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null || (label = complexTextBasedFontFamilyStyle.getLabel()) == null) {
            return null;
        }
        return label.getFontName();
    }

    public final Double getLabelFontSizeValue() {
        StyleElements.Measurement label;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        if (complexTextBasedFontSizeStyle == null || (label = complexTextBasedFontSizeStyle.getLabel()) == null || (base = label.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    public final StyleElements.FontWeight getLabelFontWeightValue() {
        StyleElements.FontWeightContainer label;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        if (complexTextBasedFontWeightStyle == null || (label = complexTextBasedFontWeightStyle.getLabel()) == null) {
            return null;
        }
        return label.getBase();
    }

    public final Double getLabelLetterSpacingValue() {
        StyleElements.Measurement label;
        StyleElements.Size base;
        Double dp;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        return (complexTextBasedLetterSpacingStyle == null || (label = complexTextBasedLetterSpacingStyle.getLabel()) == null || (base = label.getBase()) == null || (dp = base.getDp()) == null) ? getBaseLetterSpacingValue() : dp;
    }

    public final Double getLabelLineHeightValue() {
        StyleElements.Measurement label;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        if (complexTextBasedLineHeightStyle == null || (label = complexTextBasedLineHeightStyle.getLabel()) == null || (base = label.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    @NotNull
    public final TextBasedComponentStyle getLabelTextBasedStyle() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        Integer base = null;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getLabel() : null);
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getLabel() : null);
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getLabel() : null);
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getLabel() : null);
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getLabel() : null);
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle != null && (label = complexTextBasedTextColorStyle.getLabel()) != null) {
            base = label.getBase();
        }
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
    }

    public final AttributeStyles.ComplexTextBasedLetterSpacingStyle getLetterSpacing() {
        return this.letterSpacing;
    }

    public final AttributeStyles.ComplexTextBasedLineHeightStyle getLineHeight() {
        return this.lineHeight;
    }

    public final AttributeStyles.InputMarginStyle getMargin() {
        return this.margin;
    }

    public final Integer getPlaceholderBaseTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getBase();
    }

    public final Integer getPlaceholderDisabledTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getDisabled();
    }

    public final Integer getPlaceholderErrorTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getErrored();
    }

    public final Integer getPlaceholderFocusedTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getFocused();
    }

    public final String getPlaceholderFontFamilyValue() {
        StyleElements.FontName placeholder;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null || (placeholder = complexTextBasedFontFamilyStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getFontName();
    }

    public final Double getPlaceholderFontSizeValue() {
        StyleElements.Measurement placeholder;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        if (complexTextBasedFontSizeStyle == null || (placeholder = complexTextBasedFontSizeStyle.getPlaceholder()) == null || (base = placeholder.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    public final StyleElements.FontWeight getPlaceholderFontWeightValue() {
        StyleElements.FontWeightContainer placeholder;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        if (complexTextBasedFontWeightStyle == null || (placeholder = complexTextBasedFontWeightStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getBase();
    }

    public final Double getPlaceholderLetterSpacingValue() {
        StyleElements.Measurement placeholder;
        StyleElements.Size base;
        Double dp;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        return (complexTextBasedLetterSpacingStyle == null || (placeholder = complexTextBasedLetterSpacingStyle.getPlaceholder()) == null || (base = placeholder.getBase()) == null || (dp = base.getDp()) == null) ? getBaseLetterSpacingValue() : dp;
    }

    public final Double getPlaceholderLineHeightValue() {
        StyleElements.Measurement placeholder;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        if (complexTextBasedLineHeightStyle == null || (placeholder = complexTextBasedLineHeightStyle.getPlaceholder()) == null || (base = placeholder.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    @NotNull
    public final TextBasedComponentStyle getPlaceholderTextBasedStyle() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        Integer base = null;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getPlaceholder() : null);
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getPlaceholder() : null);
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getPlaceholder() : null);
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getPlaceholder() : null);
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getPlaceholder() : null);
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle != null && (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) != null) {
            base = placeholder.getBase();
        }
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
    }

    public final AttributeStyles.InputTextStrokeColorStyle getStrokeColor() {
        return this.strokeColor;
    }

    @Override
    @NotNull
    public TextBasedComponentStyle getTextBasedStyle() {
        StyleElements.ComplexElementColor value;
        AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
        Integer base = null;
        AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = new AttributeStyles.TextBasedMarginStyle(inputMarginStyle != null ? inputMarginStyle.getOption() : null);
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getBase() : null);
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getBase() : null);
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle != null && (value = complexTextBasedTextColorStyle.getValue()) != null) {
            base = value.getBase();
        }
        return new TextBasedComponentStyle(textBasedMarginStyle, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
    }

    public final AttributeStyles.ComplexTextBasedTextColorStyle getTextColor() {
        return this.textColor;
    }

    public final Integer getValueDisabledTextColor() {
        StyleElements.ComplexElementColor value;
        Integer disabled;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        return (complexTextBasedTextColorStyle == null || (value = complexTextBasedTextColorStyle.getValue()) == null || (disabled = value.getDisabled()) == null) ? getBaseTextColor() : disabled;
    }

    public final Integer getValueErrorTextColor() {
        StyleElements.ComplexElementColor value;
        Integer errored;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        return (complexTextBasedTextColorStyle == null || (value = complexTextBasedTextColorStyle.getValue()) == null || (errored = value.getErrored()) == null) ? getBaseTextColor() : errored;
    }

    public final Integer getValueFocusedTextColor() {
        StyleElements.ComplexElementColor value;
        Integer focused;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        return (complexTextBasedTextColorStyle == null || (value = complexTextBasedTextColorStyle.getValue()) == null || (focused = value.getFocused()) == null) ? getBaseTextColor() : focused;
    }

    public final String getValueFontFamilyValue() {
        StyleElements.FontName value;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null || (value = complexTextBasedFontFamilyStyle.getValue()) == null) {
            return null;
        }
        return value.getFontName();
    }

    public final Double getValueFontSizeValue() {
        StyleElements.Measurement value;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        if (complexTextBasedFontSizeStyle == null || (value = complexTextBasedFontSizeStyle.getValue()) == null || (base = value.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    public final StyleElements.FontWeight getValueFontWeightValue() {
        StyleElements.FontWeightContainer value;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        if (complexTextBasedFontWeightStyle == null || (value = complexTextBasedFontWeightStyle.getValue()) == null) {
            return null;
        }
        return value.getBase();
    }

    public final Double getValueLetterSpacingValue() {
        StyleElements.Measurement value;
        StyleElements.Size base;
        Double dp;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        return (complexTextBasedLetterSpacingStyle == null || (value = complexTextBasedLetterSpacingStyle.getValue()) == null || (base = value.getBase()) == null || (dp = base.getDp()) == null) ? getBaseLetterSpacingValue() : dp;
    }

    public final Double getValueLineHeightValue() {
        StyleElements.Measurement value;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        if (complexTextBasedLineHeightStyle == null || (value = complexTextBasedLineHeightStyle.getValue()) == null || (base = value.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
        if (inputMarginStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputMarginStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            complexTextBasedFontFamilyStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        if (complexTextBasedFontSizeStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            complexTextBasedFontSizeStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        if (complexTextBasedFontWeightStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            complexTextBasedFontWeightStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        if (complexTextBasedLetterSpacingStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            complexTextBasedLetterSpacingStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        if (complexTextBasedLineHeightStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            complexTextBasedLineHeightStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            complexTextBasedTextColorStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = this.borderRadius;
        if (inputTextBorderRadiusStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputTextBorderRadiusStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = this.borderWidth;
        if (inputTextBorderWidthStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputTextBorderWidthStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
        if (inputTextBackgroundColorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputTextBackgroundColorStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
        if (inputTextBorderColorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputTextBorderColorStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = this.strokeColor;
        if (inputTextStrokeColorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputTextStrokeColorStyle.writeToParcel(parcel, i);
        }
    }
}
