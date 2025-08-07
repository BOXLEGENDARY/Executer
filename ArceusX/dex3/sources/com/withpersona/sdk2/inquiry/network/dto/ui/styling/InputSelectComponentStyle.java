package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class InputSelectComponentStyle implements Parcelable, InputSelectBoxComponentStyle {

    @NotNull
    public static final Parcelable.Creator<InputSelectComponentStyle> CREATOR = new Creator();
    private final AttributeStyles.InputSelectBackgroundColorStyle backgroundColor;
    private final AttributeStyles.InputSelectBorderColorStyle borderColor;
    private final AttributeStyles.InputSelectBorderRadiusStyle borderRadius;
    private final AttributeStyles.InputSelectBorderWidthStyle borderWidth;
    private final AttributeStyles.InputSelectTextFontFamilyStyle fontFamily;
    private final AttributeStyles.InputSelectTextFontSizeStyle fontSize;
    private final AttributeStyles.InputSelectTextFontWeightStyle fontWeight;
    private final AttributeStyles.TextBasedJustifyStyle justify;
    private final AttributeStyles.InputSelectTextLetterSpacingStyle letterSpacing;
    private final AttributeStyles.InputSelectTextLineHeightStyle lineHeight;
    private final AttributeStyles.InputMarginStyle margin;
    private final AttributeStyles.InputSelectStrokeColorStyle strokeColor;
    private final AttributeStyles.InputSelectTextColorStyle textColor;

    public static final class Creator implements Parcelable.Creator<InputSelectComponentStyle> {
        @Override
        @NotNull
        public final InputSelectComponentStyle createFromParcel(@NotNull Parcel parcel) {
            return new InputSelectComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.InputMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.InputSelectStrokeColorStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final InputSelectComponentStyle[] newArray(int i) {
            return new InputSelectComponentStyle[i];
        }
    }

    public InputSelectComponentStyle(AttributeStyles.InputMarginStyle inputMarginStyle, AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle, AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle, AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle, AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle, AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle, AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle, AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle, AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle, AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle, AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle, AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle, AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle) {
        this.margin = inputMarginStyle;
        this.justify = textBasedJustifyStyle;
        this.fontFamily = inputSelectTextFontFamilyStyle;
        this.fontSize = inputSelectTextFontSizeStyle;
        this.fontWeight = inputSelectTextFontWeightStyle;
        this.letterSpacing = inputSelectTextLetterSpacingStyle;
        this.lineHeight = inputSelectTextLineHeightStyle;
        this.textColor = inputSelectTextColorStyle;
        this.borderRadius = inputSelectBorderRadiusStyle;
        this.borderWidth = inputSelectBorderWidthStyle;
        this.backgroundColor = inputSelectBackgroundColorStyle;
        this.borderColor = inputSelectBorderColorStyle;
        this.strokeColor = inputSelectStrokeColorStyle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public final AttributeStyles.InputSelectBackgroundColorStyle getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override
    public Integer getBaseBackgroundColorValue() {
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = this.backgroundColor;
        if (inputSelectBackgroundColorStyle == null || (base = inputSelectBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    @Override
    public Integer getBaseBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = this.borderColor;
        if (inputSelectBorderColorStyle == null || (base = inputSelectBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override
    public Integer getBaseTextColor() {
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (base = inputSelectTextColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    public final AttributeStyles.InputSelectBorderColorStyle getBorderColor() {
        return this.borderColor;
    }

    public final AttributeStyles.InputSelectBorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    public final Double getBorderRadiusValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle = this.borderRadius;
        if (inputSelectBorderRadiusStyle == null || (base = inputSelectBorderRadiusStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.InputSelectBorderWidthStyle getBorderWidth() {
        return this.borderWidth;
    }

    public final Double getBottomBorderWidthValue() {
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        StyleElements.Size bottom;
        AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = this.borderWidth;
        if (inputSelectBorderWidthStyle == null || (base = inputSelectBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (bottom = base2.getBottom()) == null) {
            return null;
        }
        return bottom.getDp();
    }

    public final Integer getChevronColor() {
        StyleElements.SimpleElementColor chevron;
        StyleElements.SimpleElementColorValue base;
        AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle = this.strokeColor;
        if (inputSelectStrokeColorStyle == null || (chevron = inputSelectStrokeColorStyle.getChevron()) == null || (base = chevron.getBase()) == null) {
            return null;
        }
        return base.getValue();
    }

    @Override
    @NotNull
    public TextBasedComponentStyle getErrorTextStyle() {
        AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = this.fontFamily;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputSelectTextFontFamilyStyle != null ? inputSelectTextFontFamilyStyle.getError() : null);
        AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputSelectTextFontSizeStyle != null ? inputSelectTextFontSizeStyle.getError() : null);
        AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputSelectTextFontWeightStyle != null ? inputSelectTextFontWeightStyle.getError() : null);
        AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputSelectTextLetterSpacingStyle != null ? inputSelectTextLetterSpacingStyle.getError() : null);
        AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputSelectTextLineHeightStyle != null ? inputSelectTextLineHeightStyle.getError() : null);
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputSelectTextColorStyle != null ? inputSelectTextColorStyle.getError() : null), null);
    }

    @Override
    public Integer getFocusedBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer focused;
        AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = this.borderColor;
        return (inputSelectBorderColorStyle == null || (base = inputSelectBorderColorStyle.getBase()) == null || (focused = base.getFocused()) == null) ? getBaseBackgroundColorValue() : focused;
    }

    public final AttributeStyles.InputSelectTextFontFamilyStyle getFontFamily() {
        return this.fontFamily;
    }

    public final AttributeStyles.InputSelectTextFontSizeStyle getFontSize() {
        return this.fontSize;
    }

    public final AttributeStyles.InputSelectTextFontWeightStyle getFontWeight() {
        return this.fontWeight;
    }

    @Override
    public Integer getHeaderCancelButtonColor() {
        StyleElements.SimpleElementColor headerCancelButton;
        StyleElements.SimpleElementColorValue base;
        AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle = this.strokeColor;
        if (inputSelectStrokeColorStyle == null || (headerCancelButton = inputSelectStrokeColorStyle.getHeaderCancelButton()) == null || (base = headerCancelButton.getBase()) == null) {
            return null;
        }
        return base.getValue();
    }

    public final StyleElements.SizeSet getInputSelectBoxMargins() {
        StyleElements.MeasurementSet base;
        AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
        if (inputMarginStyle == null || (base = inputMarginStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.TextBasedJustifyStyle getJustify() {
        return this.justify;
    }

    @NotNull
    public final TextBasedComponentStyle getLabelStyle() {
        StyleElements.FontName base;
        StyleElements.Measurement base2;
        StyleElements.SimpleElementColor label;
        AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = this.fontFamily;
        StyleElements.SimpleElementColor base3 = null;
        if (inputSelectTextFontFamilyStyle == null || (base = inputSelectTextFontFamilyStyle.getLabel()) == null) {
            AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle2 = this.fontFamily;
            base = inputSelectTextFontFamilyStyle2 != null ? inputSelectTextFontFamilyStyle2.getBase() : null;
        }
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(base);
        AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputSelectTextFontSizeStyle != null ? inputSelectTextFontSizeStyle.getLabel() : null);
        AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputSelectTextFontWeightStyle != null ? inputSelectTextFontWeightStyle.getLabel() : null);
        AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = this.letterSpacing;
        if (inputSelectTextLetterSpacingStyle == null || (base2 = inputSelectTextLetterSpacingStyle.getLabel()) == null) {
            AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle2 = this.letterSpacing;
            base2 = inputSelectTextLetterSpacingStyle2 != null ? inputSelectTextLetterSpacingStyle2.getBase() : null;
        }
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(base2);
        AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputSelectTextLineHeightStyle != null ? inputSelectTextLineHeightStyle.getLabel() : null);
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (label = inputSelectTextColorStyle.getLabel()) == null) {
            AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle2 = this.textColor;
            if (inputSelectTextColorStyle2 != null) {
                base3 = inputSelectTextColorStyle2.getBase();
            }
        } else {
            base3 = label;
        }
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(base3), null);
    }

    public final AttributeStyles.InputSelectTextLetterSpacingStyle getLetterSpacing() {
        return this.letterSpacing;
    }

    public final AttributeStyles.InputSelectTextLineHeightStyle getLineHeight() {
        return this.lineHeight;
    }

    public final AttributeStyles.InputMarginStyle getMargin() {
        return this.margin;
    }

    public final AttributeStyles.InputSelectStrokeColorStyle getStrokeColor() {
        return this.strokeColor;
    }

    @Override
    @NotNull
    public TextBasedComponentStyle getTextBasedStyle() {
        AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
        AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = new AttributeStyles.TextBasedMarginStyle(inputMarginStyle != null ? inputMarginStyle.getOption() : null);
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
        AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = this.fontFamily;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputSelectTextFontFamilyStyle != null ? inputSelectTextFontFamilyStyle.getBase() : null);
        AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputSelectTextFontSizeStyle != null ? inputSelectTextFontSizeStyle.getBase() : null);
        AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputSelectTextFontWeightStyle != null ? inputSelectTextFontWeightStyle.getBase() : null);
        AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputSelectTextLetterSpacingStyle != null ? inputSelectTextLetterSpacingStyle.getBase() : null);
        AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputSelectTextLineHeightStyle != null ? inputSelectTextLineHeightStyle.getBase() : null);
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        return new TextBasedComponentStyle(textBasedMarginStyle, textBasedJustifyStyle, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputSelectTextColorStyle != null ? inputSelectTextColorStyle.getBase() : null), null);
    }

    public final AttributeStyles.InputSelectTextColorStyle getTextColor() {
        return this.textColor;
    }

    public final Double getTopBorderWidthValue() {
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        StyleElements.Size top;
        AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = this.borderWidth;
        if (inputSelectBorderWidthStyle == null || (base = inputSelectBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (top = base2.getTop()) == null) {
            return null;
        }
        return top.getDp();
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
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
        if (textBasedJustifyStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textBasedJustifyStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = this.fontFamily;
        if (inputSelectTextFontFamilyStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputSelectTextFontFamilyStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = this.fontSize;
        if (inputSelectTextFontSizeStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputSelectTextFontSizeStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = this.fontWeight;
        if (inputSelectTextFontWeightStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputSelectTextFontWeightStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = this.letterSpacing;
        if (inputSelectTextLetterSpacingStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputSelectTextLetterSpacingStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = this.lineHeight;
        if (inputSelectTextLineHeightStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputSelectTextLineHeightStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputSelectTextColorStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle = this.borderRadius;
        if (inputSelectBorderRadiusStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputSelectBorderRadiusStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = this.borderWidth;
        if (inputSelectBorderWidthStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputSelectBorderWidthStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = this.backgroundColor;
        if (inputSelectBackgroundColorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputSelectBackgroundColorStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = this.borderColor;
        if (inputSelectBorderColorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputSelectBorderColorStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle = this.strokeColor;
        if (inputSelectStrokeColorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputSelectStrokeColorStyle.writeToParcel(parcel, i);
        }
    }
}
