package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class TextBasedComponentStyle implements TextViewStyle, Parcelable {

    @NotNull
    public static final Parcelable.Creator<TextBasedComponentStyle> CREATOR = new Creator();
    private final AttributeStyles.TextBasedFontFamilyStyle fontFamily;
    private final AttributeStyles.TextBasedFontSizeStyle fontSize;
    private final AttributeStyles.TextBasedFontWeightStyle fontWeight;
    private final AttributeStyles.TextBasedJustifyStyle justify;
    private final AttributeStyles.TextBasedLetterSpacingStyle letterSpacing;
    private final AttributeStyles.TextBasedLineHeightStyle lineHeight;
    private final AttributeStyles.TextBasedMarginStyle margin;
    private final AttributeStyles.TextBasedTextColorStyle textColor;
    private final AttributeStyles.TextBasedTextColorStyle textColorHighlight;

    public static final class Creator implements Parcelable.Creator<TextBasedComponentStyle> {
        @Override
        @NotNull
        public final TextBasedComponentStyle createFromParcel(@NotNull Parcel parcel) {
            return new TextBasedComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.TextBasedMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.TextBasedTextColorStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final TextBasedComponentStyle[] newArray(int i) {
            return new TextBasedComponentStyle[i];
        }
    }

    public TextBasedComponentStyle(AttributeStyles.TextBasedMarginStyle textBasedMarginStyle, AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle, AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle, AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle, AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle, AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle, AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle, AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle, AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle2) {
        this.margin = textBasedMarginStyle;
        this.justify = textBasedJustifyStyle;
        this.fontFamily = textBasedFontFamilyStyle;
        this.fontSize = textBasedFontSizeStyle;
        this.fontWeight = textBasedFontWeightStyle;
        this.letterSpacing = textBasedLetterSpacingStyle;
        this.lineHeight = textBasedLineHeightStyle;
        this.textColor = textBasedTextColorStyle;
        this.textColorHighlight = textBasedTextColorStyle2;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public final AttributeStyles.TextBasedFontFamilyStyle getFontFamily() {
        return this.fontFamily;
    }

    @Override
    public String getFontNameValue() {
        StyleElements.FontName base;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = this.fontFamily;
        if (textBasedFontFamilyStyle == null || (base = textBasedFontFamilyStyle.getBase()) == null) {
            return null;
        }
        return base.getFontName();
    }

    public final AttributeStyles.TextBasedFontSizeStyle getFontSize() {
        return this.fontSize;
    }

    @Override
    public Double getFontSizeValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = this.fontSize;
        if (textBasedFontSizeStyle == null || (base = textBasedFontSizeStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.TextBasedFontWeightStyle getFontWeight() {
        return this.fontWeight;
    }

    @Override
    public StyleElements.FontWeight getFontWeightValue() {
        StyleElements.FontWeightContainer base;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = this.fontWeight;
        if (textBasedFontWeightStyle == null || (base = textBasedFontWeightStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override
    public StyleElements.PositionType getJustificationValue() {
        StyleElements.Position base;
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
        if (textBasedJustifyStyle == null || (base = textBasedJustifyStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.TextBasedJustifyStyle getJustify() {
        return this.justify;
    }

    public final AttributeStyles.TextBasedLetterSpacingStyle getLetterSpacing() {
        return this.letterSpacing;
    }

    @Override
    public Double getLetterSpacingValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = this.letterSpacing;
        if (textBasedLetterSpacingStyle == null || (base = textBasedLetterSpacingStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.TextBasedLineHeightStyle getLineHeight() {
        return this.lineHeight;
    }

    @Override
    public Double getLineHeightValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = this.lineHeight;
        if (textBasedLineHeightStyle == null || (base = textBasedLineHeightStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.TextBasedMarginStyle getMargin() {
        return this.margin;
    }

    @Override
    public StyleElements.SizeSet getMarginValue() {
        StyleElements.MeasurementSet base;
        AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = this.margin;
        if (textBasedMarginStyle == null || (base = textBasedMarginStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.TextBasedTextColorStyle getTextColor() {
        return this.textColor;
    }

    public final AttributeStyles.TextBasedTextColorStyle getTextColorHighlight() {
        return this.textColorHighlight;
    }

    @Override
    public Integer getTextColorHighlightValue() {
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColorHighlight;
        if (textBasedTextColorStyle == null || (base = textBasedTextColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    @Override
    public Integer getTextColorValue() {
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColor;
        if (textBasedTextColorStyle == null || (base = textBasedTextColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = this.margin;
        if (textBasedMarginStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textBasedMarginStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
        if (textBasedJustifyStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textBasedJustifyStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = this.fontFamily;
        if (textBasedFontFamilyStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textBasedFontFamilyStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = this.fontSize;
        if (textBasedFontSizeStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textBasedFontSizeStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = this.fontWeight;
        if (textBasedFontWeightStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textBasedFontWeightStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = this.letterSpacing;
        if (textBasedLetterSpacingStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textBasedLetterSpacingStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = this.lineHeight;
        if (textBasedLineHeightStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textBasedLineHeightStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColor;
        if (textBasedTextColorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textBasedTextColorStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle2 = this.textColorHighlight;
        if (textBasedTextColorStyle2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textBasedTextColorStyle2.writeToParcel(parcel, i);
        }
    }
}
