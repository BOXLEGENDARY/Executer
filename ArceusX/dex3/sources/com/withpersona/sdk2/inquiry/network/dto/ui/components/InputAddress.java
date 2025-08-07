package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class InputAddress implements UiComponentConfig {

    @NotNull
    public static final String type = "input_address";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final AddressComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InputAddress> CREATOR = new Creator();

    @i(generateAdapter = true)
    public static final class AddressComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AddressComponentStyle> CREATOR = new Creator();
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
        private final AttributeStyles.ComplexTextBasedTextColorStyle textColor;
        private final AttributeStyles.AddressTextStyle textStyle;

        public static final class Creator implements Parcelable.Creator<AddressComponentStyle> {
            @Override
            @NotNull
            public final AddressComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new AddressComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.AddressTextStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.InputMarginStyle.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final AddressComponentStyle[] newArray(int i) {
                return new AddressComponentStyle[i];
            }
        }

        public AddressComponentStyle(AttributeStyles.AddressTextStyle addressTextStyle, AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle, AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle, AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle, AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle, AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle, AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle, AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle, AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle, AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle, AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle, AttributeStyles.InputMarginStyle inputMarginStyle) {
            this.textStyle = addressTextStyle;
            this.backgroundColor = inputTextBackgroundColorStyle;
            this.fontFamily = complexTextBasedFontFamilyStyle;
            this.fontSize = complexTextBasedFontSizeStyle;
            this.fontWeight = complexTextBasedFontWeightStyle;
            this.letterSpacing = complexTextBasedLetterSpacingStyle;
            this.lineHeight = complexTextBasedLineHeightStyle;
            this.textColor = complexTextBasedTextColorStyle;
            this.borderRadius = inputTextBorderRadiusStyle;
            this.borderWidth = inputTextBorderWidthStyle;
            this.borderColor = inputTextBorderColorStyle;
            this.margin = inputMarginStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.InputTextBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final AttributeStyles.InputTextBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.InputTextBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final AttributeStyles.InputTextBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        @NotNull
        public final TextBasedComponentStyle getExpandComponentsButtonStyle() {
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle;
            AttributeStyles.AddressTextStyleContainer expandButton;
            TextBasedComponentStyle base;
            AttributeStyles.AddressTextStyleContainer expandButton2;
            TextBasedComponentStyle base2;
            AttributeStyles.AddressTextStyleContainer expandButton3;
            TextBasedComponentStyle base3;
            AttributeStyles.AddressTextStyleContainer expandButton4;
            TextBasedComponentStyle base4;
            AttributeStyles.AddressTextStyleContainer expandButton5;
            TextBasedComponentStyle base5;
            AttributeStyles.AddressTextStyleContainer expandButton6;
            TextBasedComponentStyle base6;
            AttributeStyles.AddressTextStyle addressTextStyle = this.textStyle;
            if (addressTextStyle == null || (expandButton6 = addressTextStyle.getExpandButton()) == null || (base6 = expandButton6.getBase()) == null || (textBasedFontFamilyStyle = base6.getFontFamily()) == null) {
                AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
                textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getLabel() : null);
            }
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle2 = textBasedFontFamilyStyle;
            AttributeStyles.AddressTextStyle addressTextStyle2 = this.textStyle;
            if (addressTextStyle2 == null || (expandButton5 = addressTextStyle2.getExpandButton()) == null || (base5 = expandButton5.getBase()) == null || (textBasedFontSizeStyle = base5.getFontSize()) == null) {
                AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
                textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getLabel() : null);
            }
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle2 = textBasedFontSizeStyle;
            AttributeStyles.AddressTextStyle addressTextStyle3 = this.textStyle;
            if (addressTextStyle3 == null || (expandButton4 = addressTextStyle3.getExpandButton()) == null || (base4 = expandButton4.getBase()) == null || (textBasedFontWeightStyle = base4.getFontWeight()) == null) {
                AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
                textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getLabel() : null);
            }
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle2 = textBasedFontWeightStyle;
            AttributeStyles.AddressTextStyle addressTextStyle4 = this.textStyle;
            if (addressTextStyle4 == null || (expandButton3 = addressTextStyle4.getExpandButton()) == null || (base3 = expandButton3.getBase()) == null || (textBasedLetterSpacingStyle = base3.getLetterSpacing()) == null) {
                AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
                textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getLabel() : null);
            }
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle2 = textBasedLetterSpacingStyle;
            AttributeStyles.AddressTextStyle addressTextStyle5 = this.textStyle;
            if (addressTextStyle5 == null || (expandButton2 = addressTextStyle5.getExpandButton()) == null || (base2 = expandButton2.getBase()) == null || (textBasedLineHeightStyle = base2.getLineHeight()) == null) {
                AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
                textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getLabel() : null);
            }
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle2 = textBasedLineHeightStyle;
            AttributeStyles.AddressTextStyle addressTextStyle6 = this.textStyle;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle2, textBasedFontSizeStyle2, textBasedFontWeightStyle2, textBasedLetterSpacingStyle2, textBasedLineHeightStyle2, (addressTextStyle6 == null || (expandButton = addressTextStyle6.getExpandButton()) == null || (base = expandButton.getBase()) == null) ? null : base.getTextColor(), null);
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
        public final InputTextBasedComponentStyle getInputTextStyle() {
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = this.borderRadius;
            AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle2 = new AttributeStyles.InputTextBorderRadiusStyle(inputTextBorderRadiusStyle != null ? inputTextBorderRadiusStyle.getBase() : null);
            AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = this.borderWidth;
            AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle2 = new AttributeStyles.InputTextBorderWidthStyle(inputTextBorderWidthStyle != null ? inputTextBorderWidthStyle.getBase() : null);
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle2 = new AttributeStyles.InputTextBackgroundColorStyle(inputTextBackgroundColorStyle != null ? inputTextBackgroundColorStyle.getBase() : null);
            AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
            return new InputTextBasedComponentStyle(inputMarginStyle, complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, complexTextBasedTextColorStyle, inputTextBorderRadiusStyle2, inputTextBorderWidthStyle2, inputTextBackgroundColorStyle2, new AttributeStyles.InputTextBorderColorStyle(inputTextBorderColorStyle != null ? inputTextBorderColorStyle.getBase() : null), null);
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

        public final AttributeStyles.ComplexTextBasedTextColorStyle getTextColor() {
            return this.textColor;
        }

        public final AttributeStyles.AddressTextStyle getTextStyle() {
            return this.textStyle;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            AttributeStyles.AddressTextStyle addressTextStyle = this.textStyle;
            if (addressTextStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                addressTextStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
            if (inputTextBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBackgroundColorStyle.writeToParcel(parcel, i);
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
            AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
            if (inputTextBorderColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBorderColorStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            if (inputMarginStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputMarginStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final JsonLogicBoolean disabled;
        private final String editAddressManuallyPrompt;
        private final String fieldKeyAddressCity;
        private final String fieldKeyAddressPostalCode;
        private final String fieldKeyAddressStreet1;
        private final String fieldKeyAddressStreet2;
        private final String fieldKeyAddressSubdivision;
        private final JsonLogicBoolean hidden;
        private final String label;
        private final String placeholderAddressCity;
        private final String placeholderAddressPostalCode;
        private final String placeholderAddressPostalCodeUs;
        private final String placeholderAddressStreet1;
        private final String placeholderAddressStreet2;
        private final String placeholderAddressSubdivision;
        private final String placeholderAddressSubdivisionUs;
        private final String placeholderAutocomplete;
        private final String prefillAddressCity;
        private final String prefillAddressPostalCode;
        private final String prefillAddressStreet1;
        private final String prefillAddressStreet2;
        private final String prefillAddressSubdivision;
        private final String selectedCountryCode;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                String str;
                JsonLogicBoolean jsonLogicBooleanCreateFromParcel;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                String string19 = parcel.readString();
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                if (parcel.readInt() == 0) {
                    str = string15;
                    jsonLogicBooleanCreateFromParcel = null;
                } else {
                    str = string15;
                    jsonLogicBooleanCreateFromParcel = JsonLogicBoolean.CREATOR.createFromParcel(parcel);
                }
                return new Attributes(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, str, string16, string17, string18, string19, string20, string21, jsonLogicBooleanCreateFromParcel, parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
            this.label = str;
            this.editAddressManuallyPrompt = str2;
            this.placeholderAutocomplete = str3;
            this.fieldKeyAddressStreet1 = str4;
            this.prefillAddressStreet1 = str5;
            this.placeholderAddressStreet1 = str6;
            this.fieldKeyAddressStreet2 = str7;
            this.prefillAddressStreet2 = str8;
            this.placeholderAddressStreet2 = str9;
            this.fieldKeyAddressCity = str10;
            this.prefillAddressCity = str11;
            this.placeholderAddressCity = str12;
            this.fieldKeyAddressSubdivision = str13;
            this.prefillAddressSubdivision = str14;
            this.placeholderAddressSubdivision = str15;
            this.placeholderAddressSubdivisionUs = str16;
            this.fieldKeyAddressPostalCode = str17;
            this.prefillAddressPostalCode = str18;
            this.placeholderAddressPostalCode = str19;
            this.placeholderAddressPostalCodeUs = str20;
            this.selectedCountryCode = str21;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        public final String getEditAddressManuallyPrompt() {
            return this.editAddressManuallyPrompt;
        }

        public final String getFieldKeyAddressCity() {
            return this.fieldKeyAddressCity;
        }

        public final String getFieldKeyAddressPostalCode() {
            return this.fieldKeyAddressPostalCode;
        }

        public final String getFieldKeyAddressStreet1() {
            return this.fieldKeyAddressStreet1;
        }

        public final String getFieldKeyAddressStreet2() {
            return this.fieldKeyAddressStreet2;
        }

        public final String getFieldKeyAddressSubdivision() {
            return this.fieldKeyAddressSubdivision;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getPlaceholderAddressCity() {
            return this.placeholderAddressCity;
        }

        public final String getPlaceholderAddressPostalCode() {
            return this.placeholderAddressPostalCode;
        }

        public final String getPlaceholderAddressPostalCodeUs() {
            return this.placeholderAddressPostalCodeUs;
        }

        public final String getPlaceholderAddressStreet1() {
            return this.placeholderAddressStreet1;
        }

        public final String getPlaceholderAddressStreet2() {
            return this.placeholderAddressStreet2;
        }

        public final String getPlaceholderAddressSubdivision() {
            return this.placeholderAddressSubdivision;
        }

        public final String getPlaceholderAddressSubdivisionUs() {
            return this.placeholderAddressSubdivisionUs;
        }

        public final String getPlaceholderAutocomplete() {
            return this.placeholderAutocomplete;
        }

        public final String getPrefillAddressCity() {
            return this.prefillAddressCity;
        }

        public final String getPrefillAddressPostalCode() {
            return this.prefillAddressPostalCode;
        }

        public final String getPrefillAddressStreet1() {
            return this.prefillAddressStreet1;
        }

        public final String getPrefillAddressStreet2() {
            return this.prefillAddressStreet2;
        }

        public final String getPrefillAddressSubdivision() {
            return this.prefillAddressSubdivision;
        }

        public final String getSelectedCountryCode() {
            return this.selectedCountryCode;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.label);
            parcel.writeString(this.editAddressManuallyPrompt);
            parcel.writeString(this.placeholderAutocomplete);
            parcel.writeString(this.fieldKeyAddressStreet1);
            parcel.writeString(this.prefillAddressStreet1);
            parcel.writeString(this.placeholderAddressStreet1);
            parcel.writeString(this.fieldKeyAddressStreet2);
            parcel.writeString(this.prefillAddressStreet2);
            parcel.writeString(this.placeholderAddressStreet2);
            parcel.writeString(this.fieldKeyAddressCity);
            parcel.writeString(this.prefillAddressCity);
            parcel.writeString(this.placeholderAddressCity);
            parcel.writeString(this.fieldKeyAddressSubdivision);
            parcel.writeString(this.prefillAddressSubdivision);
            parcel.writeString(this.placeholderAddressSubdivision);
            parcel.writeString(this.placeholderAddressSubdivisionUs);
            parcel.writeString(this.fieldKeyAddressPostalCode);
            parcel.writeString(this.prefillAddressPostalCode);
            parcel.writeString(this.placeholderAddressPostalCode);
            parcel.writeString(this.placeholderAddressPostalCodeUs);
            parcel.writeString(this.selectedCountryCode);
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
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<InputAddress> {
        @Override
        @NotNull
        public final InputAddress createFromParcel(@NotNull Parcel parcel) {
            return new InputAddress(parcel.readString(), parcel.readInt() == 0 ? null : AddressComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Attributes.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final InputAddress[] newArray(int i) {
            return new InputAddress[i];
        }
    }

    public InputAddress(@NotNull String str, AddressComponentStyle addressComponentStyle, Attributes attributes) {
        this.name = str;
        this.styles = addressComponentStyle;
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

    public final AddressComponentStyle getStyles() {
        return this.styles;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.writeString(this.name);
        AddressComponentStyle addressComponentStyle = this.styles;
        if (addressComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressComponentStyle.writeToParcel(parcel, i);
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
