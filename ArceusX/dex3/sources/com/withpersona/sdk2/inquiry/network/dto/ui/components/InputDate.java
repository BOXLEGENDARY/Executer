package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class InputDate implements UiComponentConfig {

    @NotNull
    public static final String type = "input_date";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final InputDateComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InputDate> CREATOR = new Creator();

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final JsonLogicBoolean disabled;
        private final JsonLogicBoolean hidden;
        private final String label;
        private final String placeholderDay;
        private final String placeholderMonth;
        private final String placeholderYear;
        private final String prefill;
        private final List<String> textMonths;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                return new Attributes(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getPlaceholderDay() {
            return this.placeholderDay;
        }

        public final String getPlaceholderMonth() {
            return this.placeholderMonth;
        }

        public final String getPlaceholderYear() {
            return this.placeholderYear;
        }

        public final String getPrefill() {
            return this.prefill;
        }

        public final List<String> getTextMonths() {
            return this.textMonths;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.prefill);
            parcel.writeString(this.label);
            parcel.writeString(this.placeholderMonth);
            parcel.writeString(this.placeholderDay);
            parcel.writeString(this.placeholderYear);
            parcel.writeStringList(this.textMonths);
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                jsonLogicBoolean.writeToParcel(parcel, i);
            }
            JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
            if (jsonLogicBoolean2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                jsonLogicBoolean2.writeToParcel(parcel, i);
            }
        }

        public Attributes(String str, String str2, String str3, String str4, String str5, List<String> list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
            this.prefill = str;
            this.label = str2;
            this.placeholderMonth = str3;
            this.placeholderDay = str4;
            this.placeholderYear = str5;
            this.textMonths = list;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
        }

        public Attributes(String str, String str2, String str3, String str4, String str5, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : jsonLogicBoolean, (i & 128) == 0 ? jsonLogicBoolean2 : null);
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<InputDate> {
        @Override
        @NotNull
        public final InputDate createFromParcel(@NotNull Parcel parcel) {
            return new InputDate(parcel.readString(), parcel.readInt() == 0 ? null : InputDateComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Attributes.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final InputDate[] newArray(int i) {
            return new InputDate[i];
        }
    }

    @i(generateAdapter = true)
    public static final class InputDateComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputDateComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.DateSelectBackgroundColorStyle backgroundColor;
        private final AttributeStyles.DateSelectBorderColorStyle borderColor;
        private final AttributeStyles.DateSelectBorderRadiusStyle borderRadius;
        private final AttributeStyles.DateSelectBorderWidthStyle borderWidth;
        private final AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily;
        private final AttributeStyles.ComplexTextBasedFontSizeStyle fontSize;
        private final AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight;
        private final AttributeStyles.TextBasedJustifyStyle justify;
        private final AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing;
        private final AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight;
        private final AttributeStyles.InputMarginStyle margin;
        private final AttributeStyles.DateSelectStrokeColorStyle strokeColor;
        private final AttributeStyles.DateSelectTextColorStyle textColor;

        public static final class Creator implements Parcelable.Creator<InputDateComponentStyle> {
            @Override
            @NotNull
            public final InputDateComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputDateComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.DateSelectTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.DateSelectBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.DateSelectBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.DateSelectBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.DateSelectBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.DateSelectStrokeColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputDateComponentStyle[] newArray(int i) {
                return new InputDateComponentStyle[i];
            }
        }

        public InputDateComponentStyle(AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle, AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle, AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle, AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle, AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle, AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle, AttributeStyles.DateSelectBorderRadiusStyle dateSelectBorderRadiusStyle, AttributeStyles.DateSelectBorderWidthStyle dateSelectBorderWidthStyle, AttributeStyles.DateSelectBackgroundColorStyle dateSelectBackgroundColorStyle, AttributeStyles.DateSelectBorderColorStyle dateSelectBorderColorStyle, AttributeStyles.InputMarginStyle inputMarginStyle, AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle, AttributeStyles.DateSelectStrokeColorStyle dateSelectStrokeColorStyle) {
            this.fontFamily = complexTextBasedFontFamilyStyle;
            this.fontSize = complexTextBasedFontSizeStyle;
            this.fontWeight = complexTextBasedFontWeightStyle;
            this.letterSpacing = complexTextBasedLetterSpacingStyle;
            this.lineHeight = complexTextBasedLineHeightStyle;
            this.textColor = dateSelectTextColorStyle;
            this.borderRadius = dateSelectBorderRadiusStyle;
            this.borderWidth = dateSelectBorderWidthStyle;
            this.backgroundColor = dateSelectBackgroundColorStyle;
            this.borderColor = dateSelectBorderColorStyle;
            this.margin = inputMarginStyle;
            this.justify = textBasedJustifyStyle;
            this.strokeColor = dateSelectStrokeColorStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.DateSelectBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final AttributeStyles.DateSelectBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.DateSelectBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final AttributeStyles.DateSelectBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
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

        @NotNull
        public final InputSelectComponentStyle getInputSelectStyle() {
            Integer value;
            StyleElements.SimpleElementColor inputSelect;
            StyleElements.SimpleElementColorValue base;
            StyleElements.SimpleElementColor simpleElementColor;
            StyleElements.SimpleElementColor chevron;
            StyleElements.ComplexElementColor error;
            StyleElements.ComplexElementColor label;
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            StyleElements.FontName base2 = complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getBase() : null;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle2 = this.fontFamily;
            StyleElements.FontName label2 = complexTextBasedFontFamilyStyle2 != null ? complexTextBasedFontFamilyStyle2.getLabel() : null;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle3 = this.fontFamily;
            AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = new AttributeStyles.InputSelectTextFontFamilyStyle(base2, label2, complexTextBasedFontFamilyStyle3 != null ? complexTextBasedFontFamilyStyle3.getError() : null);
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            StyleElements.Measurement value2 = complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getValue() : null;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle2 = this.fontSize;
            StyleElements.Measurement label3 = complexTextBasedFontSizeStyle2 != null ? complexTextBasedFontSizeStyle2.getLabel() : null;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle3 = this.fontSize;
            AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = new AttributeStyles.InputSelectTextFontSizeStyle(value2, label3, complexTextBasedFontSizeStyle3 != null ? complexTextBasedFontSizeStyle3.getError() : null);
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            StyleElements.FontWeightContainer value3 = complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getValue() : null;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle2 = this.fontWeight;
            StyleElements.FontWeightContainer label4 = complexTextBasedFontWeightStyle2 != null ? complexTextBasedFontWeightStyle2.getLabel() : null;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle3 = this.fontWeight;
            AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = new AttributeStyles.InputSelectTextFontWeightStyle(value3, label4, complexTextBasedFontWeightStyle3 != null ? complexTextBasedFontWeightStyle3.getError() : null);
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            StyleElements.Measurement base3 = complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getBase() : null;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle2 = this.letterSpacing;
            StyleElements.Measurement label5 = complexTextBasedLetterSpacingStyle2 != null ? complexTextBasedLetterSpacingStyle2.getLabel() : null;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle3 = this.letterSpacing;
            AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = new AttributeStyles.InputSelectTextLetterSpacingStyle(base3, label5, complexTextBasedLetterSpacingStyle3 != null ? complexTextBasedLetterSpacingStyle3.getError() : null);
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            StyleElements.Measurement value4 = complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getValue() : null;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle2 = this.lineHeight;
            StyleElements.Measurement label6 = complexTextBasedLineHeightStyle2 != null ? complexTextBasedLineHeightStyle2.getLabel() : null;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle3 = this.lineHeight;
            AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = new AttributeStyles.InputSelectTextLineHeightStyle(value4, label6, complexTextBasedLineHeightStyle3 != null ? complexTextBasedLineHeightStyle3.getError() : null);
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle = this.textColor;
            StyleElements.SimpleElementColor inputSelect2 = dateSelectTextColorStyle != null ? dateSelectTextColorStyle.getInputSelect() : null;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle2 = this.textColor;
            if (dateSelectTextColorStyle2 == null || (label = dateSelectTextColorStyle2.getLabel()) == null || (value = label.getBase()) == null) {
                AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle3 = this.textColor;
                value = (dateSelectTextColorStyle3 == null || (inputSelect = dateSelectTextColorStyle3.getInputSelect()) == null || (base = inputSelect.getBase()) == null) ? null : base.getValue();
            }
            StyleElements.SimpleElementColor simpleElementColor2 = new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(value));
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle4 = this.textColor;
            AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = new AttributeStyles.InputSelectTextColorStyle(inputSelect2, simpleElementColor2, new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue((dateSelectTextColorStyle4 == null || (error = dateSelectTextColorStyle4.getError()) == null) ? null : error.getErrored())));
            AttributeStyles.DateSelectBorderRadiusStyle dateSelectBorderRadiusStyle = this.borderRadius;
            AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle = new AttributeStyles.InputSelectBorderRadiusStyle(dateSelectBorderRadiusStyle != null ? dateSelectBorderRadiusStyle.getBase() : null);
            AttributeStyles.DateSelectBorderWidthStyle dateSelectBorderWidthStyle = this.borderWidth;
            AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = new AttributeStyles.InputSelectBorderWidthStyle(dateSelectBorderWidthStyle != null ? dateSelectBorderWidthStyle.getBase() : null);
            AttributeStyles.DateSelectBackgroundColorStyle dateSelectBackgroundColorStyle = this.backgroundColor;
            AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = new AttributeStyles.InputSelectBackgroundColorStyle(dateSelectBackgroundColorStyle != null ? dateSelectBackgroundColorStyle.getInputSelect() : null);
            AttributeStyles.DateSelectBorderColorStyle dateSelectBorderColorStyle = this.borderColor;
            AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = new AttributeStyles.InputSelectBorderColorStyle(dateSelectBorderColorStyle != null ? dateSelectBorderColorStyle.getBase() : null);
            AttributeStyles.DateSelectStrokeColorStyle dateSelectStrokeColorStyle = this.strokeColor;
            if (dateSelectStrokeColorStyle != null) {
                chevron = dateSelectStrokeColorStyle.getChevron();
                simpleElementColor = null;
            } else {
                simpleElementColor = null;
                chevron = null;
            }
            return new InputSelectComponentStyle(inputMarginStyle, textBasedJustifyStyle, inputSelectTextFontFamilyStyle, inputSelectTextFontSizeStyle, inputSelectTextFontWeightStyle, inputSelectTextLetterSpacingStyle, inputSelectTextLineHeightStyle, inputSelectTextColorStyle, inputSelectBorderRadiusStyle, inputSelectBorderWidthStyle, inputSelectBackgroundColorStyle, inputSelectBorderColorStyle, new AttributeStyles.InputSelectStrokeColorStyle(chevron, simpleElementColor));
        }

        @NotNull
        public final InputTextBasedComponentStyle getInputTextStyle() {
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle = this.textColor;
            StyleElements.ComplexElementColor value = dateSelectTextColorStyle != null ? dateSelectTextColorStyle.getValue() : null;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle2 = this.textColor;
            StyleElements.ComplexElementColor placeholder = dateSelectTextColorStyle2 != null ? dateSelectTextColorStyle2.getPlaceholder() : null;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle3 = this.textColor;
            StyleElements.ComplexElementColor label = dateSelectTextColorStyle3 != null ? dateSelectTextColorStyle3.getLabel() : null;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle4 = this.textColor;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = new AttributeStyles.ComplexTextBasedTextColorStyle(value, placeholder, label, dateSelectTextColorStyle4 != null ? dateSelectTextColorStyle4.getError() : null);
            AttributeStyles.DateSelectBorderRadiusStyle dateSelectBorderRadiusStyle = this.borderRadius;
            AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = new AttributeStyles.InputTextBorderRadiusStyle(dateSelectBorderRadiusStyle != null ? dateSelectBorderRadiusStyle.getBase() : null);
            AttributeStyles.DateSelectBorderWidthStyle dateSelectBorderWidthStyle = this.borderWidth;
            AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = new AttributeStyles.InputTextBorderWidthStyle(dateSelectBorderWidthStyle != null ? dateSelectBorderWidthStyle.getBase() : null);
            AttributeStyles.DateSelectBackgroundColorStyle dateSelectBackgroundColorStyle = this.backgroundColor;
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = new AttributeStyles.InputTextBackgroundColorStyle(dateSelectBackgroundColorStyle != null ? dateSelectBackgroundColorStyle.getBase() : null);
            AttributeStyles.DateSelectBorderColorStyle dateSelectBorderColorStyle = this.borderColor;
            return new InputTextBasedComponentStyle(null, complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, complexTextBasedTextColorStyle, inputTextBorderRadiusStyle, inputTextBorderWidthStyle, inputTextBackgroundColorStyle, new AttributeStyles.InputTextBorderColorStyle(dateSelectBorderColorStyle != null ? dateSelectBorderColorStyle.getBase() : null), null);
        }

        public final AttributeStyles.TextBasedJustifyStyle getJustify() {
            return this.justify;
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

        public final AttributeStyles.DateSelectStrokeColorStyle getStrokeColor() {
            return this.strokeColor;
        }

        public final AttributeStyles.DateSelectTextColorStyle getTextColor() {
            return this.textColor;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
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
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle = this.textColor;
            if (dateSelectTextColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dateSelectTextColorStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.DateSelectBorderRadiusStyle dateSelectBorderRadiusStyle = this.borderRadius;
            if (dateSelectBorderRadiusStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dateSelectBorderRadiusStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.DateSelectBorderWidthStyle dateSelectBorderWidthStyle = this.borderWidth;
            if (dateSelectBorderWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dateSelectBorderWidthStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.DateSelectBackgroundColorStyle dateSelectBackgroundColorStyle = this.backgroundColor;
            if (dateSelectBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dateSelectBackgroundColorStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.DateSelectBorderColorStyle dateSelectBorderColorStyle = this.borderColor;
            if (dateSelectBorderColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dateSelectBorderColorStyle.writeToParcel(parcel, i);
            }
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
            AttributeStyles.DateSelectStrokeColorStyle dateSelectStrokeColorStyle = this.strokeColor;
            if (dateSelectStrokeColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dateSelectStrokeColorStyle.writeToParcel(parcel, i);
            }
        }
    }

    public InputDate(@NotNull String str, InputDateComponentStyle inputDateComponentStyle, Attributes attributes) {
        this.name = str;
        this.styles = inputDateComponentStyle;
        this.attributes = attributes;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    @NotNull
    public String getName() {
        return this.name;
    }

    public final InputDateComponentStyle getStyles() {
        return this.styles;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.writeString(this.name);
        InputDateComponentStyle inputDateComponentStyle = this.styles;
        if (inputDateComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputDateComponentStyle.writeToParcel(parcel, i);
        }
        Attributes attributes = this.attributes;
        if (attributes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            attributes.writeToParcel(parcel, i);
        }
    }

    @Override
    public Attributes getAttributes() {
        return this.attributes;
    }
}
