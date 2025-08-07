package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class ESignature implements UiComponentConfig {

    @NotNull
    public static final String type = "input_e_signature";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final ESignatureComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ESignature> CREATOR = new Creator();

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final String clearButtonText;
        private final String dialogText;
        private final String dialogTitle;
        private final JsonLogicBoolean disabled;
        private final JsonLogicBoolean hidden;
        private final String label;
        private final String placeholder;
        private final String prefill;
        private final String saveButtonText;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.label = str;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
            this.placeholder = str2;
            this.saveButtonText = str3;
            this.clearButtonText = str4;
            this.dialogTitle = str5;
            this.dialogText = str6;
            this.prefill = str7;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final String getClearButtonText() {
            return this.clearButtonText;
        }

        public final String getDialogText() {
            return this.dialogText;
        }

        public final String getDialogTitle() {
            return this.dialogTitle;
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

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final String getPrefill() {
            return this.prefill;
        }

        public final String getSaveButtonText() {
            return this.saveButtonText;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.label);
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
            parcel.writeString(this.placeholder);
            parcel.writeString(this.saveButtonText);
            parcel.writeString(this.clearButtonText);
            parcel.writeString(this.dialogTitle);
            parcel.writeString(this.dialogText);
            parcel.writeString(this.prefill);
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<ESignature> {
        @Override
        @NotNull
        public final ESignature createFromParcel(@NotNull Parcel parcel) {
            return new ESignature(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ESignatureComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final ESignature[] newArray(int i) {
            return new ESignature[i];
        }
    }

    @i(generateAdapter = true)
    public static final class ESignatureComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ESignatureComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.ESignatureBackgroundColorStyle backgroundColor;
        private final AttributeStyles.ESignatureBorderColorStyle borderColor;
        private final AttributeStyles.ESignatureBorderRadiusStyle borderRadius;
        private final AttributeStyles.ESignatureBorderWidthStyle borderWidth;
        private final AttributeStyles.ESignaturePrimaryButtonStyles buttonPrimaryStyle;
        private final AttributeStyles.ESignatureSecondaryButtonStyles buttonSecondaryStyle;
        private final AttributeStyles.ESignatureFillColorStyle fillColor;
        private final AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily;
        private final AttributeStyles.ComplexTextBasedFontSizeStyle fontSize;
        private final AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight;
        private final AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing;
        private final AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight;
        private final AttributeStyles.InputMarginStyle margin;
        private final AttributeStyles.ESignatureTextColorStyle textColor;
        private final AttributeStyles.ESignatureTextStylesContainer textStyle;
        private final AttributeStyles.ESignatureTitleStylesContainer titleStyle;

        public static final class Creator implements Parcelable.Creator<ESignatureComponentStyle> {
            @Override
            @NotNull
            public final ESignatureComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new ESignatureComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.ESignaturePrimaryButtonStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureSecondaryButtonStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureTitleStylesContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureTextStylesContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureFillColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ESignatureBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputMarginStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ESignatureComponentStyle[] newArray(int i) {
                return new ESignatureComponentStyle[i];
            }
        }

        public ESignatureComponentStyle(AttributeStyles.ESignaturePrimaryButtonStyles eSignaturePrimaryButtonStyles, AttributeStyles.ESignatureSecondaryButtonStyles eSignatureSecondaryButtonStyles, AttributeStyles.ESignatureTitleStylesContainer eSignatureTitleStylesContainer, AttributeStyles.ESignatureTextStylesContainer eSignatureTextStylesContainer, AttributeStyles.ESignatureFillColorStyle eSignatureFillColorStyle, AttributeStyles.ESignatureBackgroundColorStyle eSignatureBackgroundColorStyle, AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle, AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle, AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle, AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle, AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle, AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle, AttributeStyles.ESignatureBorderRadiusStyle eSignatureBorderRadiusStyle, AttributeStyles.ESignatureBorderWidthStyle eSignatureBorderWidthStyle, AttributeStyles.ESignatureBorderColorStyle eSignatureBorderColorStyle, AttributeStyles.InputMarginStyle inputMarginStyle) {
            this.buttonPrimaryStyle = eSignaturePrimaryButtonStyles;
            this.buttonSecondaryStyle = eSignatureSecondaryButtonStyles;
            this.titleStyle = eSignatureTitleStylesContainer;
            this.textStyle = eSignatureTextStylesContainer;
            this.fillColor = eSignatureFillColorStyle;
            this.backgroundColor = eSignatureBackgroundColorStyle;
            this.fontFamily = complexTextBasedFontFamilyStyle;
            this.fontSize = complexTextBasedFontSizeStyle;
            this.fontWeight = complexTextBasedFontWeightStyle;
            this.letterSpacing = complexTextBasedLetterSpacingStyle;
            this.lineHeight = complexTextBasedLineHeightStyle;
            this.textColor = eSignatureTextColorStyle;
            this.borderRadius = eSignatureBorderRadiusStyle;
            this.borderWidth = eSignatureBorderWidthStyle;
            this.borderColor = eSignatureBorderColorStyle;
            this.margin = inputMarginStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.ESignatureBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final AttributeStyles.ESignatureBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.ESignatureBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final AttributeStyles.ESignatureBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final AttributeStyles.ESignaturePrimaryButtonStyles getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        public final AttributeStyles.ESignatureSecondaryButtonStyles getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        public final ButtonCancelComponentStyle getClearSignatureButtonStyle() {
            AttributeStyles.ESignatureSecondaryButtonStylesContainer clearSignatureButton;
            AttributeStyles.ESignatureSecondaryButtonStyles eSignatureSecondaryButtonStyles = this.buttonSecondaryStyle;
            if (eSignatureSecondaryButtonStyles == null || (clearSignatureButton = eSignatureSecondaryButtonStyles.getClearSignatureButton()) == null) {
                return null;
            }
            return clearSignatureButton.getBase();
        }

        public final TextBasedComponentStyle getDialogTextStyle() {
            AttributeStyles.ESignatureBaseTextStyle dialogText;
            AttributeStyles.ESignatureTextStylesContainer eSignatureTextStylesContainer = this.textStyle;
            if (eSignatureTextStylesContainer == null || (dialogText = eSignatureTextStylesContainer.getDialogText()) == null) {
                return null;
            }
            return dialogText.getBase();
        }

        public final TextBasedComponentStyle getDialogTitleStyle() {
            AttributeStyles.ESignatureBaseTextStyle dialogTitle;
            AttributeStyles.ESignatureTitleStylesContainer eSignatureTitleStylesContainer = this.titleStyle;
            if (eSignatureTitleStylesContainer == null || (dialogTitle = eSignatureTitleStylesContainer.getDialogTitle()) == null) {
                return null;
            }
            return dialogTitle.getBase();
        }

        public final AttributeStyles.ESignatureFillColorStyle getFillColor() {
            return this.fillColor;
        }

        public final Integer getFillColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            AttributeStyles.ESignatureFillColorStyle eSignatureFillColorStyle = this.fillColor;
            if (eSignatureFillColorStyle == null || (base = eSignatureFillColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
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
            AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle = this.textColor;
            StyleElements.ComplexElementColor value = eSignatureTextColorStyle != null ? eSignatureTextColorStyle.getValue() : null;
            AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle2 = this.textColor;
            StyleElements.ComplexElementColor placeholder = eSignatureTextColorStyle2 != null ? eSignatureTextColorStyle2.getPlaceholder() : null;
            AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle3 = this.textColor;
            StyleElements.ComplexElementColor label = eSignatureTextColorStyle3 != null ? eSignatureTextColorStyle3.getLabel() : null;
            AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle4 = this.textColor;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = new AttributeStyles.ComplexTextBasedTextColorStyle(value, placeholder, label, eSignatureTextColorStyle4 != null ? eSignatureTextColorStyle4.getError() : null);
            AttributeStyles.ESignatureBorderRadiusStyle eSignatureBorderRadiusStyle = this.borderRadius;
            AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = new AttributeStyles.InputTextBorderRadiusStyle(eSignatureBorderRadiusStyle != null ? eSignatureBorderRadiusStyle.getBase() : null);
            AttributeStyles.ESignatureBorderWidthStyle eSignatureBorderWidthStyle = this.borderWidth;
            AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = new AttributeStyles.InputTextBorderWidthStyle(eSignatureBorderWidthStyle != null ? eSignatureBorderWidthStyle.getBase() : null);
            AttributeStyles.ESignatureBackgroundColorStyle eSignatureBackgroundColorStyle = this.backgroundColor;
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = new AttributeStyles.InputTextBackgroundColorStyle(eSignatureBackgroundColorStyle != null ? eSignatureBackgroundColorStyle.getBase() : null);
            AttributeStyles.ESignatureBorderColorStyle eSignatureBorderColorStyle = this.borderColor;
            return new InputTextBasedComponentStyle(inputMarginStyle, complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, complexTextBasedTextColorStyle, inputTextBorderRadiusStyle, inputTextBorderWidthStyle, inputTextBackgroundColorStyle, new AttributeStyles.InputTextBorderColorStyle(eSignatureBorderColorStyle != null ? eSignatureBorderColorStyle.getBase() : null), null);
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

        public final StyleElements.SizeSet getMargins() {
            StyleElements.MeasurementSet base;
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            if (inputMarginStyle == null || (base = inputMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final Integer getSignaturePreviewBackgroundColor() {
            StyleElements.SimpleElementColor signaturePreview;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.ESignatureBackgroundColorStyle eSignatureBackgroundColorStyle = this.backgroundColor;
            if (eSignatureBackgroundColorStyle == null || (signaturePreview = eSignatureBackgroundColorStyle.getSignaturePreview()) == null || (base = signaturePreview.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final ButtonSubmitComponentStyle getSubmitButtonStyle() {
            AttributeStyles.ESignaturePrimaryButtonStylesContainer saveSignatureButton;
            AttributeStyles.ESignaturePrimaryButtonStyles eSignaturePrimaryButtonStyles = this.buttonPrimaryStyle;
            if (eSignaturePrimaryButtonStyles == null || (saveSignatureButton = eSignaturePrimaryButtonStyles.getSaveSignatureButton()) == null) {
                return null;
            }
            return saveSignatureButton.getBase();
        }

        public final AttributeStyles.ESignatureTextColorStyle getTextColor() {
            return this.textColor;
        }

        public final AttributeStyles.ESignatureTextStylesContainer getTextStyle() {
            return this.textStyle;
        }

        public final AttributeStyles.ESignatureTitleStylesContainer getTitleStyle() {
            return this.titleStyle;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            AttributeStyles.ESignaturePrimaryButtonStyles eSignaturePrimaryButtonStyles = this.buttonPrimaryStyle;
            if (eSignaturePrimaryButtonStyles == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignaturePrimaryButtonStyles.writeToParcel(parcel, i);
            }
            AttributeStyles.ESignatureSecondaryButtonStyles eSignatureSecondaryButtonStyles = this.buttonSecondaryStyle;
            if (eSignatureSecondaryButtonStyles == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureSecondaryButtonStyles.writeToParcel(parcel, i);
            }
            AttributeStyles.ESignatureTitleStylesContainer eSignatureTitleStylesContainer = this.titleStyle;
            if (eSignatureTitleStylesContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureTitleStylesContainer.writeToParcel(parcel, i);
            }
            AttributeStyles.ESignatureTextStylesContainer eSignatureTextStylesContainer = this.textStyle;
            if (eSignatureTextStylesContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureTextStylesContainer.writeToParcel(parcel, i);
            }
            AttributeStyles.ESignatureFillColorStyle eSignatureFillColorStyle = this.fillColor;
            if (eSignatureFillColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureFillColorStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.ESignatureBackgroundColorStyle eSignatureBackgroundColorStyle = this.backgroundColor;
            if (eSignatureBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureBackgroundColorStyle.writeToParcel(parcel, i);
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
            AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle = this.textColor;
            if (eSignatureTextColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureTextColorStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.ESignatureBorderRadiusStyle eSignatureBorderRadiusStyle = this.borderRadius;
            if (eSignatureBorderRadiusStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureBorderRadiusStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.ESignatureBorderWidthStyle eSignatureBorderWidthStyle = this.borderWidth;
            if (eSignatureBorderWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureBorderWidthStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.ESignatureBorderColorStyle eSignatureBorderColorStyle = this.borderColor;
            if (eSignatureBorderColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureBorderColorStyle.writeToParcel(parcel, i);
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

    public ESignature(@NotNull String str, Attributes attributes, ESignatureComponentStyle eSignatureComponentStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = eSignatureComponentStyle;
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

    public final ESignatureComponentStyle getStyles() {
        return this.styles;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.writeString(this.name);
        Attributes attributes = this.attributes;
        if (attributes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            attributes.writeToParcel(parcel, i);
        }
        ESignatureComponentStyle eSignatureComponentStyle = this.styles;
        if (eSignatureComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eSignatureComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public Attributes getAttributes() {
        return this.attributes;
    }
}
