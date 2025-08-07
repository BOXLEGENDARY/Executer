package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class ButtonVerifyPersonaComponentStyle implements Parcelable, BaseButtonComponentStyle {

    @NotNull
    public static final Parcelable.Creator<ButtonVerifyPersonaComponentStyle> CREATOR = new Creator();
    private final AttributeStyles.ButtonBasedBackgroundColorStyle backgroundColor;
    private final AttributeStyles.ButtonBasedBorderColorStyle borderColor;
    private final AttributeStyles.ButtonBasedBorderRadiusStyle borderRadius;
    private final AttributeStyles.ButtonBasedBorderWidthStyle borderWidth;
    private final AttributeStyles.ButtonBasedFontFamilyStyle fontFamily;
    private final AttributeStyles.ButtonBasedFontSizeStyle fontSize;
    private final AttributeStyles.ButtonBasedFontWeightStyle fontWeight;
    private final AttributeStyles.ButtonBasedHeightStyle height;
    private final AttributeStyles.ButtonBasedJustifyStyle justify;
    private final AttributeStyles.ButtonBasedLetterSpacingStyle letterSpacing;
    private final AttributeStyles.ButtonBasedLineHeightStyle lineHeight;
    private final AttributeStyles.ButtonBasedMarginStyle margin;
    private final AttributeStyles.ButtonBasedPaddingStyle padding;
    private final AttributeStyles.ButtonBasedTextColorStyle textColor;
    private final AttributeStyles.ButtonBasedWidthStyle width;

    public static final class Creator implements Parcelable.Creator<ButtonVerifyPersonaComponentStyle> {
        @Override
        @NotNull
        public final ButtonVerifyPersonaComponentStyle createFromParcel(@NotNull Parcel parcel) {
            return new ButtonVerifyPersonaComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.ButtonBasedBorderWidthStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final ButtonVerifyPersonaComponentStyle[] newArray(int i) {
            return new ButtonVerifyPersonaComponentStyle[i];
        }
    }

    public ButtonVerifyPersonaComponentStyle(AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle, AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle, AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle, AttributeStyles.ButtonBasedFontFamilyStyle buttonBasedFontFamilyStyle, AttributeStyles.ButtonBasedFontSizeStyle buttonBasedFontSizeStyle, AttributeStyles.ButtonBasedFontWeightStyle buttonBasedFontWeightStyle, AttributeStyles.ButtonBasedLetterSpacingStyle buttonBasedLetterSpacingStyle, AttributeStyles.ButtonBasedLineHeightStyle buttonBasedLineHeightStyle, AttributeStyles.ButtonBasedTextColorStyle buttonBasedTextColorStyle, AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle, AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle, AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle, AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle, AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle, AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle) {
        this.padding = buttonBasedPaddingStyle;
        this.margin = buttonBasedMarginStyle;
        this.justify = buttonBasedJustifyStyle;
        this.fontFamily = buttonBasedFontFamilyStyle;
        this.fontSize = buttonBasedFontSizeStyle;
        this.fontWeight = buttonBasedFontWeightStyle;
        this.letterSpacing = buttonBasedLetterSpacingStyle;
        this.lineHeight = buttonBasedLineHeightStyle;
        this.textColor = buttonBasedTextColorStyle;
        this.height = buttonBasedHeightStyle;
        this.width = buttonBasedWidthStyle;
        this.backgroundColor = buttonBasedBackgroundColorStyle;
        this.borderColor = buttonBasedBorderColorStyle;
        this.borderRadius = buttonBasedBorderRadiusStyle;
        this.borderWidth = buttonBasedBorderWidthStyle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    @NotNull
    public Integer getActiveBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer active;
        AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
        return Integer.valueOf((buttonBasedBackgroundColorStyle == null || (base = buttonBasedBackgroundColorStyle.getBase()) == null || (active = base.getActive()) == null) ? ButtonComponentStylingKt.defaultLoadingColor : active.intValue());
    }

    @Override
    public Integer getActiveBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
        if (buttonBasedBorderColorStyle == null || (base = buttonBasedBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getActive();
    }

    @Override
    public Integer getActiveTextColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.ButtonBasedTextColorStyle buttonBasedTextColorStyle = this.textColor;
        if (buttonBasedTextColorStyle == null || (base = buttonBasedTextColorStyle.getBase()) == null) {
            return null;
        }
        return base.getActive();
    }

    public final AttributeStyles.ButtonBasedBackgroundColorStyle getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override
    public Integer getBaseBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
        if (buttonBasedBackgroundColorStyle == null || (base = buttonBasedBackgroundColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override
    public Integer getBaseBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
        if (buttonBasedBorderColorStyle == null || (base = buttonBasedBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override
    public Integer getBaseTextColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.ButtonBasedTextColorStyle buttonBasedTextColorStyle = this.textColor;
        if (buttonBasedTextColorStyle == null || (base = buttonBasedTextColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.ButtonBasedBorderColorStyle getBorderColor() {
        return this.borderColor;
    }

    public final AttributeStyles.ButtonBasedBorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    @Override
    public Double getBorderRadiusValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle = this.borderRadius;
        if (buttonBasedBorderRadiusStyle == null || (base = buttonBasedBorderRadiusStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.ButtonBasedBorderWidthStyle getBorderWidth() {
        return this.borderWidth;
    }

    @Override
    public Double getBorderWidthValue() {
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        StyleElements.Size top;
        AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle = this.borderWidth;
        if (buttonBasedBorderWidthStyle == null || (base = buttonBasedBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (top = base2.getTop()) == null) {
            return null;
        }
        return top.getDp();
    }

    @Override
    public Integer getDisabledBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer disabled;
        AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
        return (buttonBasedBackgroundColorStyle == null || (base = buttonBasedBackgroundColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseBackgroundColorValue() : disabled;
    }

    @Override
    public Integer getDisabledBorderColorValue() {
        StyleElements.ComplexElementColor base;
        Integer disabled;
        AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
        return (buttonBasedBorderColorStyle == null || (base = buttonBasedBorderColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseBorderColorValue() : disabled;
    }

    @Override
    public Integer getDisabledTextColorValue() {
        StyleElements.ComplexElementColor base;
        Integer disabled;
        AttributeStyles.ButtonBasedTextColorStyle buttonBasedTextColorStyle = this.textColor;
        return (buttonBasedTextColorStyle == null || (base = buttonBasedTextColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseTextColorValue() : disabled;
    }

    public final AttributeStyles.ButtonBasedFontFamilyStyle getFontFamily() {
        return this.fontFamily;
    }

    @Override
    public String getFontNameValue() {
        StyleElements.FontName base;
        AttributeStyles.ButtonBasedFontFamilyStyle buttonBasedFontFamilyStyle = this.fontFamily;
        if (buttonBasedFontFamilyStyle == null || (base = buttonBasedFontFamilyStyle.getBase()) == null) {
            return null;
        }
        return base.getFontName();
    }

    public final AttributeStyles.ButtonBasedFontSizeStyle getFontSize() {
        return this.fontSize;
    }

    @Override
    public Double getFontSizeValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedFontSizeStyle buttonBasedFontSizeStyle = this.fontSize;
        if (buttonBasedFontSizeStyle == null || (base = buttonBasedFontSizeStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.ButtonBasedFontWeightStyle getFontWeight() {
        return this.fontWeight;
    }

    @Override
    public StyleElements.FontWeight getFontWeightValue() {
        StyleElements.FontWeightContainer base;
        AttributeStyles.ButtonBasedFontWeightStyle buttonBasedFontWeightStyle = this.fontWeight;
        if (buttonBasedFontWeightStyle == null || (base = buttonBasedFontWeightStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.ButtonBasedHeightStyle getHeight() {
        return this.height;
    }

    @Override
    public Double getHeightValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle = this.height;
        if (buttonBasedHeightStyle == null || (base = buttonBasedHeightStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    @Override
    public StyleElements.PositionType getJustificationValue() {
        StyleElements.Position base;
        AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle = this.justify;
        if (buttonBasedJustifyStyle == null || (base = buttonBasedJustifyStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.ButtonBasedJustifyStyle getJustify() {
        return this.justify;
    }

    public final AttributeStyles.ButtonBasedLetterSpacingStyle getLetterSpacing() {
        return this.letterSpacing;
    }

    @Override
    public Double getLetterSpacingValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedLetterSpacingStyle buttonBasedLetterSpacingStyle = this.letterSpacing;
        if (buttonBasedLetterSpacingStyle == null || (base = buttonBasedLetterSpacingStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.ButtonBasedLineHeightStyle getLineHeight() {
        return this.lineHeight;
    }

    @Override
    public Double getLineHeightValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedLineHeightStyle buttonBasedLineHeightStyle = this.lineHeight;
        if (buttonBasedLineHeightStyle == null || (base = buttonBasedLineHeightStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.ButtonBasedMarginStyle getMargin() {
        return this.margin;
    }

    @Override
    public StyleElements.SizeSet getMarginValue() {
        StyleElements.MeasurementSet base;
        AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle = this.margin;
        if (buttonBasedMarginStyle == null || (base = buttonBasedMarginStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.ButtonBasedPaddingStyle getPadding() {
        return this.padding;
    }

    @Override
    public StyleElements.SizeSet getPaddingValue() {
        StyleElements.MeasurementSet base;
        AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle = this.padding;
        if (buttonBasedPaddingStyle == null || (base = buttonBasedPaddingStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.ButtonBasedTextColorStyle getTextColor() {
        return this.textColor;
    }

    public final AttributeStyles.ButtonBasedWidthStyle getWidth() {
        return this.width;
    }

    @Override
    public Double getWidthValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle = this.width;
        if (buttonBasedWidthStyle == null || (base = buttonBasedWidthStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle = this.padding;
        if (buttonBasedPaddingStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBasedPaddingStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle = this.margin;
        if (buttonBasedMarginStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBasedMarginStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle = this.justify;
        if (buttonBasedJustifyStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBasedJustifyStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ButtonBasedFontFamilyStyle buttonBasedFontFamilyStyle = this.fontFamily;
        if (buttonBasedFontFamilyStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBasedFontFamilyStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ButtonBasedFontSizeStyle buttonBasedFontSizeStyle = this.fontSize;
        if (buttonBasedFontSizeStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBasedFontSizeStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ButtonBasedFontWeightStyle buttonBasedFontWeightStyle = this.fontWeight;
        if (buttonBasedFontWeightStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBasedFontWeightStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ButtonBasedLetterSpacingStyle buttonBasedLetterSpacingStyle = this.letterSpacing;
        if (buttonBasedLetterSpacingStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBasedLetterSpacingStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ButtonBasedLineHeightStyle buttonBasedLineHeightStyle = this.lineHeight;
        if (buttonBasedLineHeightStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBasedLineHeightStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ButtonBasedTextColorStyle buttonBasedTextColorStyle = this.textColor;
        if (buttonBasedTextColorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBasedTextColorStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle = this.height;
        if (buttonBasedHeightStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBasedHeightStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle = this.width;
        if (buttonBasedWidthStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBasedWidthStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
        if (buttonBasedBackgroundColorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBasedBackgroundColorStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
        if (buttonBasedBorderColorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBasedBorderColorStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle = this.borderRadius;
        if (buttonBasedBorderRadiusStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBasedBorderRadiusStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle = this.borderWidth;
        if (buttonBasedBorderWidthStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBasedBorderWidthStyle.writeToParcel(parcel, i);
        }
    }
}
