package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles {

    @i(generateAdapter = true)
    public static final class AddressTextStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AddressTextStyle> CREATOR = new Creator();
        private final AddressTextStyleContainer expandButton;

        public static final class Creator implements Parcelable.Creator<AddressTextStyle> {
            @Override
            @NotNull
            public final AddressTextStyle createFromParcel(@NotNull Parcel parcel) {
                return new AddressTextStyle(parcel.readInt() == 0 ? null : AddressTextStyleContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final AddressTextStyle[] newArray(int i) {
                return new AddressTextStyle[i];
            }
        }

        public AddressTextStyle(AddressTextStyleContainer addressTextStyleContainer) {
            this.expandButton = addressTextStyleContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final AddressTextStyleContainer getExpandButton() {
            return this.expandButton;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            AddressTextStyleContainer addressTextStyleContainer = this.expandButton;
            if (addressTextStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                addressTextStyleContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class AddressTextStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AddressTextStyleContainer> CREATOR = new Creator();
        private final TextBasedComponentStyle base;

        public static final class Creator implements Parcelable.Creator<AddressTextStyleContainer> {
            @Override
            @NotNull
            public final AddressTextStyleContainer createFromParcel(@NotNull Parcel parcel) {
                return new AddressTextStyleContainer(parcel.readInt() == 0 ? null : TextBasedComponentStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final AddressTextStyleContainer[] newArray(int i) {
                return new AddressTextStyleContainer[i];
            }
        }

        public AddressTextStyleContainer(TextBasedComponentStyle textBasedComponentStyle) {
            this.base = textBasedComponentStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final TextBasedComponentStyle getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            TextBasedComponentStyle textBasedComponentStyle = this.base;
            if (textBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                textBasedComponentStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ButtonBasedBackgroundColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ButtonBasedBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public static final class Creator implements Parcelable.Creator<ButtonBasedBackgroundColorStyle> {
            @Override
            @NotNull
            public final ButtonBasedBackgroundColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new ButtonBasedBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ButtonBasedBackgroundColorStyle[] newArray(int i) {
                return new ButtonBasedBackgroundColorStyle[i];
            }
        }

        public ButtonBasedBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ButtonBasedBorderColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ButtonBasedBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public static final class Creator implements Parcelable.Creator<ButtonBasedBorderColorStyle> {
            @Override
            @NotNull
            public final ButtonBasedBorderColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new ButtonBasedBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ButtonBasedBorderColorStyle[] newArray(int i) {
                return new ButtonBasedBorderColorStyle[i];
            }
        }

        public ButtonBasedBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ButtonBasedBorderRadiusStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ButtonBasedBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<ButtonBasedBorderRadiusStyle> {
            @Override
            @NotNull
            public final ButtonBasedBorderRadiusStyle createFromParcel(@NotNull Parcel parcel) {
                return new ButtonBasedBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ButtonBasedBorderRadiusStyle[] newArray(int i) {
                return new ButtonBasedBorderRadiusStyle[i];
            }
        }

        public ButtonBasedBorderRadiusStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ButtonBasedBorderWidthStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ButtonBasedBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<ButtonBasedBorderWidthStyle> {
            @Override
            @NotNull
            public final ButtonBasedBorderWidthStyle createFromParcel(@NotNull Parcel parcel) {
                return new ButtonBasedBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ButtonBasedBorderWidthStyle[] newArray(int i) {
                return new ButtonBasedBorderWidthStyle[i];
            }
        }

        public ButtonBasedBorderWidthStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ButtonBasedFontFamilyStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ButtonBasedFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;

        public static final class Creator implements Parcelable.Creator<ButtonBasedFontFamilyStyle> {
            @Override
            @NotNull
            public final ButtonBasedFontFamilyStyle createFromParcel(@NotNull Parcel parcel) {
                return new ButtonBasedFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ButtonBasedFontFamilyStyle[] newArray(int i) {
                return new ButtonBasedFontFamilyStyle[i];
            }
        }

        public ButtonBasedFontFamilyStyle(StyleElements.FontName fontName) {
            this.base = fontName;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ButtonBasedFontSizeStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ButtonBasedFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<ButtonBasedFontSizeStyle> {
            @Override
            @NotNull
            public final ButtonBasedFontSizeStyle createFromParcel(@NotNull Parcel parcel) {
                return new ButtonBasedFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ButtonBasedFontSizeStyle[] newArray(int i) {
                return new ButtonBasedFontSizeStyle[i];
            }
        }

        public ButtonBasedFontSizeStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ButtonBasedFontWeightStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ButtonBasedFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer base;

        public static final class Creator implements Parcelable.Creator<ButtonBasedFontWeightStyle> {
            @Override
            @NotNull
            public final ButtonBasedFontWeightStyle createFromParcel(@NotNull Parcel parcel) {
                return new ButtonBasedFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ButtonBasedFontWeightStyle[] newArray(int i) {
                return new ButtonBasedFontWeightStyle[i];
            }
        }

        public ButtonBasedFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer) {
            this.base = fontWeightContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.FontWeightContainer fontWeightContainer = this.base;
            if (fontWeightContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ButtonBasedHeightStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ButtonBasedHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<ButtonBasedHeightStyle> {
            @Override
            @NotNull
            public final ButtonBasedHeightStyle createFromParcel(@NotNull Parcel parcel) {
                return new ButtonBasedHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ButtonBasedHeightStyle[] newArray(int i) {
                return new ButtonBasedHeightStyle[i];
            }
        }

        public ButtonBasedHeightStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ButtonBasedJustifyStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ButtonBasedJustifyStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        public static final class Creator implements Parcelable.Creator<ButtonBasedJustifyStyle> {
            @Override
            @NotNull
            public final ButtonBasedJustifyStyle createFromParcel(@NotNull Parcel parcel) {
                return new ButtonBasedJustifyStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ButtonBasedJustifyStyle[] newArray(int i) {
                return new ButtonBasedJustifyStyle[i];
            }
        }

        public ButtonBasedJustifyStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Position position = this.base;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ButtonBasedLetterSpacingStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ButtonBasedLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<ButtonBasedLetterSpacingStyle> {
            @Override
            @NotNull
            public final ButtonBasedLetterSpacingStyle createFromParcel(@NotNull Parcel parcel) {
                return new ButtonBasedLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ButtonBasedLetterSpacingStyle[] newArray(int i) {
                return new ButtonBasedLetterSpacingStyle[i];
            }
        }

        public ButtonBasedLetterSpacingStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ButtonBasedLineHeightStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ButtonBasedLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<ButtonBasedLineHeightStyle> {
            @Override
            @NotNull
            public final ButtonBasedLineHeightStyle createFromParcel(@NotNull Parcel parcel) {
                return new ButtonBasedLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ButtonBasedLineHeightStyle[] newArray(int i) {
                return new ButtonBasedLineHeightStyle[i];
            }
        }

        public ButtonBasedLineHeightStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ButtonBasedMarginStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ButtonBasedMarginStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<ButtonBasedMarginStyle> {
            @Override
            @NotNull
            public final ButtonBasedMarginStyle createFromParcel(@NotNull Parcel parcel) {
                return new ButtonBasedMarginStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ButtonBasedMarginStyle[] newArray(int i) {
                return new ButtonBasedMarginStyle[i];
            }
        }

        public ButtonBasedMarginStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ButtonBasedPaddingStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ButtonBasedPaddingStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<ButtonBasedPaddingStyle> {
            @Override
            @NotNull
            public final ButtonBasedPaddingStyle createFromParcel(@NotNull Parcel parcel) {
                return new ButtonBasedPaddingStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ButtonBasedPaddingStyle[] newArray(int i) {
                return new ButtonBasedPaddingStyle[i];
            }
        }

        public ButtonBasedPaddingStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ButtonBasedTextColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ButtonBasedTextColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public static final class Creator implements Parcelable.Creator<ButtonBasedTextColorStyle> {
            @Override
            @NotNull
            public final ButtonBasedTextColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new ButtonBasedTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ButtonBasedTextColorStyle[] newArray(int i) {
                return new ButtonBasedTextColorStyle[i];
            }
        }

        public ButtonBasedTextColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ButtonBasedWidthStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ButtonBasedWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<ButtonBasedWidthStyle> {
            @Override
            @NotNull
            public final ButtonBasedWidthStyle createFromParcel(@NotNull Parcel parcel) {
                return new ButtonBasedWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ButtonBasedWidthStyle[] newArray(int i) {
                return new ButtonBasedWidthStyle[i];
            }
        }

        public ButtonBasedWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ClickableStackAlignmentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ClickableStackAlignmentStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        public static final class Creator implements Parcelable.Creator<ClickableStackAlignmentStyle> {
            @Override
            @NotNull
            public final ClickableStackAlignmentStyle createFromParcel(@NotNull Parcel parcel) {
                return new ClickableStackAlignmentStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ClickableStackAlignmentStyle[] newArray(int i) {
                return new ClickableStackAlignmentStyle[i];
            }
        }

        public ClickableStackAlignmentStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Position position = this.base;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ClickableStackAxisStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ClickableStackAxisStyle> CREATOR = new Creator();
        private final StyleElements.AxisContainer base;

        public static final class Creator implements Parcelable.Creator<ClickableStackAxisStyle> {
            @Override
            @NotNull
            public final ClickableStackAxisStyle createFromParcel(@NotNull Parcel parcel) {
                return new ClickableStackAxisStyle(parcel.readInt() == 0 ? null : StyleElements.AxisContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ClickableStackAxisStyle[] newArray(int i) {
                return new ClickableStackAxisStyle[i];
            }
        }

        public ClickableStackAxisStyle(StyleElements.AxisContainer axisContainer) {
            this.base = axisContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.AxisContainer getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.AxisContainer axisContainer = this.base;
            if (axisContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                axisContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ClickableStackBackgroundColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ClickableStackBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public static final class Creator implements Parcelable.Creator<ClickableStackBackgroundColorStyle> {
            @Override
            @NotNull
            public final ClickableStackBackgroundColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new ClickableStackBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ClickableStackBackgroundColorStyle[] newArray(int i) {
                return new ClickableStackBackgroundColorStyle[i];
            }
        }

        public ClickableStackBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ClickableStackBorderColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ClickableStackBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public static final class Creator implements Parcelable.Creator<ClickableStackBorderColorStyle> {
            @Override
            @NotNull
            public final ClickableStackBorderColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new ClickableStackBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ClickableStackBorderColorStyle[] newArray(int i) {
                return new ClickableStackBorderColorStyle[i];
            }
        }

        public ClickableStackBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ClickableStackBorderRadiusStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ClickableStackBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<ClickableStackBorderRadiusStyle> {
            @Override
            @NotNull
            public final ClickableStackBorderRadiusStyle createFromParcel(@NotNull Parcel parcel) {
                return new ClickableStackBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ClickableStackBorderRadiusStyle[] newArray(int i) {
                return new ClickableStackBorderRadiusStyle[i];
            }
        }

        public ClickableStackBorderRadiusStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ClickableStackBorderWidthStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ClickableStackBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<ClickableStackBorderWidthStyle> {
            @Override
            @NotNull
            public final ClickableStackBorderWidthStyle createFromParcel(@NotNull Parcel parcel) {
                return new ClickableStackBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ClickableStackBorderWidthStyle[] newArray(int i) {
                return new ClickableStackBorderWidthStyle[i];
            }
        }

        public ClickableStackBorderWidthStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ClickableStackChildSizesStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ClickableStackChildSizesStyle> CREATOR = new Creator();
        private final StyleElements.ChildSizes base;

        public static final class Creator implements Parcelable.Creator<ClickableStackChildSizesStyle> {
            @Override
            @NotNull
            public final ClickableStackChildSizesStyle createFromParcel(@NotNull Parcel parcel) {
                return new ClickableStackChildSizesStyle(parcel.readInt() == 0 ? null : StyleElements.ChildSizes.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ClickableStackChildSizesStyle[] newArray(int i) {
                return new ClickableStackChildSizesStyle[i];
            }
        }

        public ClickableStackChildSizesStyle(StyleElements.ChildSizes childSizes) {
            this.base = childSizes;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ChildSizes getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ChildSizes childSizes = this.base;
            if (childSizes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                childSizes.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ClickableStackGapStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ClickableStackGapStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<ClickableStackGapStyle> {
            @Override
            @NotNull
            public final ClickableStackGapStyle createFromParcel(@NotNull Parcel parcel) {
                return new ClickableStackGapStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ClickableStackGapStyle[] newArray(int i) {
                return new ClickableStackGapStyle[i];
            }
        }

        public ClickableStackGapStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ClickableStackMarginStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ClickableStackMarginStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<ClickableStackMarginStyle> {
            @Override
            @NotNull
            public final ClickableStackMarginStyle createFromParcel(@NotNull Parcel parcel) {
                return new ClickableStackMarginStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ClickableStackMarginStyle[] newArray(int i) {
                return new ClickableStackMarginStyle[i];
            }
        }

        public ClickableStackMarginStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ClickableStackPaddingStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ClickableStackPaddingStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<ClickableStackPaddingStyle> {
            @Override
            @NotNull
            public final ClickableStackPaddingStyle createFromParcel(@NotNull Parcel parcel) {
                return new ClickableStackPaddingStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ClickableStackPaddingStyle[] newArray(int i) {
                return new ClickableStackPaddingStyle[i];
            }
        }

        public ClickableStackPaddingStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ClickableStackWidthStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ClickableStackWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<ClickableStackWidthStyle> {
            @Override
            @NotNull
            public final ClickableStackWidthStyle createFromParcel(@NotNull Parcel parcel) {
                return new ClickableStackWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ClickableStackWidthStyle[] newArray(int i) {
                return new ClickableStackWidthStyle[i];
            }
        }

        public ClickableStackWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ComplexTextBasedFontFamilyStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ComplexTextBasedFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;
        private final StyleElements.FontName error;
        private final StyleElements.FontName label;
        private final StyleElements.FontName placeholder;
        private final StyleElements.FontName value;

        public static final class Creator implements Parcelable.Creator<ComplexTextBasedFontFamilyStyle> {
            @Override
            @NotNull
            public final ComplexTextBasedFontFamilyStyle createFromParcel(@NotNull Parcel parcel) {
                return new ComplexTextBasedFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontName.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final ComplexTextBasedFontFamilyStyle[] newArray(int i) {
                return new ComplexTextBasedFontFamilyStyle[i];
            }
        }

        public ComplexTextBasedFontFamilyStyle(StyleElements.FontName fontName, StyleElements.FontName fontName2, StyleElements.FontName fontName3, StyleElements.FontName fontName4, StyleElements.FontName fontName5) {
            this.base = fontName;
            this.value = fontName2;
            this.placeholder = fontName3;
            this.label = fontName4;
            this.error = fontName5;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        public final StyleElements.FontName getError() {
            return this.error;
        }

        public final StyleElements.FontName getLabel() {
            return this.label;
        }

        public final StyleElements.FontName getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.FontName getValue() {
            return this.value;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName.writeToParcel(parcel, i);
            }
            StyleElements.FontName fontName2 = this.value;
            if (fontName2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName2.writeToParcel(parcel, i);
            }
            StyleElements.FontName fontName3 = this.placeholder;
            if (fontName3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName3.writeToParcel(parcel, i);
            }
            StyleElements.FontName fontName4 = this.label;
            if (fontName4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName4.writeToParcel(parcel, i);
            }
            StyleElements.FontName fontName5 = this.error;
            if (fontName5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName5.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ComplexTextBasedFontSizeStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ComplexTextBasedFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.Measurement error;
        private final StyleElements.Measurement label;
        private final StyleElements.Measurement placeholder;
        private final StyleElements.Measurement value;

        public static final class Creator implements Parcelable.Creator<ComplexTextBasedFontSizeStyle> {
            @Override
            @NotNull
            public final ComplexTextBasedFontSizeStyle createFromParcel(@NotNull Parcel parcel) {
                return new ComplexTextBasedFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final ComplexTextBasedFontSizeStyle[] newArray(int i) {
                return new ComplexTextBasedFontSizeStyle[i];
            }
        }

        public ComplexTextBasedFontSizeStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3, StyleElements.Measurement measurement4) {
            this.value = measurement;
            this.placeholder = measurement2;
            this.label = measurement3;
            this.error = measurement4;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        public final StyleElements.Measurement getLabel() {
            return this.label;
        }

        public final StyleElements.Measurement getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.Measurement getValue() {
            return this.value;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.value;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement2 = this.placeholder;
            if (measurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement2.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement3 = this.label;
            if (measurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement3.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement4 = this.error;
            if (measurement4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement4.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ComplexTextBasedFontWeightStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ComplexTextBasedFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer error;
        private final StyleElements.FontWeightContainer label;
        private final StyleElements.FontWeightContainer placeholder;
        private final StyleElements.FontWeightContainer value;

        public static final class Creator implements Parcelable.Creator<ComplexTextBasedFontWeightStyle> {
            @Override
            @NotNull
            public final ComplexTextBasedFontWeightStyle createFromParcel(@NotNull Parcel parcel) {
                return new ComplexTextBasedFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final ComplexTextBasedFontWeightStyle[] newArray(int i) {
                return new ComplexTextBasedFontWeightStyle[i];
            }
        }

        public ComplexTextBasedFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer, StyleElements.FontWeightContainer fontWeightContainer2, StyleElements.FontWeightContainer fontWeightContainer3, StyleElements.FontWeightContainer fontWeightContainer4) {
            this.value = fontWeightContainer;
            this.placeholder = fontWeightContainer2;
            this.label = fontWeightContainer3;
            this.error = fontWeightContainer4;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getError() {
            return this.error;
        }

        public final StyleElements.FontWeightContainer getLabel() {
            return this.label;
        }

        public final StyleElements.FontWeightContainer getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.FontWeightContainer getValue() {
            return this.value;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.FontWeightContainer fontWeightContainer = this.value;
            if (fontWeightContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer.writeToParcel(parcel, i);
            }
            StyleElements.FontWeightContainer fontWeightContainer2 = this.placeholder;
            if (fontWeightContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer2.writeToParcel(parcel, i);
            }
            StyleElements.FontWeightContainer fontWeightContainer3 = this.label;
            if (fontWeightContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer3.writeToParcel(parcel, i);
            }
            StyleElements.FontWeightContainer fontWeightContainer4 = this.error;
            if (fontWeightContainer4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer4.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ComplexTextBasedLetterSpacingStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ComplexTextBasedLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement error;
        private final StyleElements.Measurement label;
        private final StyleElements.Measurement placeholder;
        private final StyleElements.Measurement value;

        public static final class Creator implements Parcelable.Creator<ComplexTextBasedLetterSpacingStyle> {
            @Override
            @NotNull
            public final ComplexTextBasedLetterSpacingStyle createFromParcel(@NotNull Parcel parcel) {
                return new ComplexTextBasedLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final ComplexTextBasedLetterSpacingStyle[] newArray(int i) {
                return new ComplexTextBasedLetterSpacingStyle[i];
            }
        }

        public ComplexTextBasedLetterSpacingStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3, StyleElements.Measurement measurement4, StyleElements.Measurement measurement5) {
            this.base = measurement;
            this.value = measurement2;
            this.placeholder = measurement3;
            this.label = measurement4;
            this.error = measurement5;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        public final StyleElements.Measurement getLabel() {
            return this.label;
        }

        public final StyleElements.Measurement getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.Measurement getValue() {
            return this.value;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement2 = this.value;
            if (measurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement2.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement3 = this.placeholder;
            if (measurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement3.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement4 = this.label;
            if (measurement4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement4.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement5 = this.error;
            if (measurement5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement5.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ComplexTextBasedLineHeightStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ComplexTextBasedLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement error;
        private final StyleElements.Measurement label;
        private final StyleElements.Measurement placeholder;
        private final StyleElements.Measurement value;

        public static final class Creator implements Parcelable.Creator<ComplexTextBasedLineHeightStyle> {
            @Override
            @NotNull
            public final ComplexTextBasedLineHeightStyle createFromParcel(@NotNull Parcel parcel) {
                return new ComplexTextBasedLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final ComplexTextBasedLineHeightStyle[] newArray(int i) {
                return new ComplexTextBasedLineHeightStyle[i];
            }
        }

        public ComplexTextBasedLineHeightStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3, StyleElements.Measurement measurement4) {
            this.value = measurement;
            this.placeholder = measurement2;
            this.label = measurement3;
            this.error = measurement4;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        public final StyleElements.Measurement getLabel() {
            return this.label;
        }

        public final StyleElements.Measurement getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.Measurement getValue() {
            return this.value;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.value;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement2 = this.placeholder;
            if (measurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement2.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement3 = this.label;
            if (measurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement3.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement4 = this.error;
            if (measurement4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement4.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ComplexTextBasedTextColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ComplexTextBasedTextColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor error;
        private final StyleElements.ComplexElementColor label;
        private final StyleElements.ComplexElementColor placeholder;
        private final StyleElements.ComplexElementColor value;

        public static final class Creator implements Parcelable.Creator<ComplexTextBasedTextColorStyle> {
            @Override
            @NotNull
            public final ComplexTextBasedTextColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new ComplexTextBasedTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final ComplexTextBasedTextColorStyle[] newArray(int i) {
                return new ComplexTextBasedTextColorStyle[i];
            }
        }

        public ComplexTextBasedTextColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.ComplexElementColor complexElementColor2, StyleElements.ComplexElementColor complexElementColor3, StyleElements.ComplexElementColor complexElementColor4) {
            this.value = complexElementColor;
            this.placeholder = complexElementColor2;
            this.label = complexElementColor3;
            this.error = complexElementColor4;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getError() {
            return this.error;
        }

        public final StyleElements.ComplexElementColor getLabel() {
            return this.label;
        }

        public final StyleElements.ComplexElementColor getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.ComplexElementColor getValue() {
            return this.value;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ComplexElementColor complexElementColor = this.value;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
            StyleElements.ComplexElementColor complexElementColor2 = this.placeholder;
            if (complexElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor2.writeToParcel(parcel, i);
            }
            StyleElements.ComplexElementColor complexElementColor3 = this.label;
            if (complexElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor3.writeToParcel(parcel, i);
            }
            StyleElements.ComplexElementColor complexElementColor4 = this.error;
            if (complexElementColor4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor4.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class DateSelectBackgroundColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DateSelectBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;
        private final StyleElements.SimpleElementColor inputSelect;

        public static final class Creator implements Parcelable.Creator<DateSelectBackgroundColorStyle> {
            @Override
            @NotNull
            public final DateSelectBackgroundColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new DateSelectBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final DateSelectBackgroundColorStyle[] newArray(int i) {
                return new DateSelectBackgroundColorStyle[i];
            }
        }

        public DateSelectBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.SimpleElementColor simpleElementColor) {
            this.base = complexElementColor;
            this.inputSelect = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getInputSelect() {
            return this.inputSelect;
        }

        public final Integer getInputSelectBackgroundColor() {
            StyleElements.SimpleElementColorValue base;
            StyleElements.SimpleElementColor simpleElementColor = this.inputSelect;
            if (simpleElementColor == null || (base = simpleElementColor.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor = this.inputSelect;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class DateSelectBorderColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DateSelectBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public static final class Creator implements Parcelable.Creator<DateSelectBorderColorStyle> {
            @Override
            @NotNull
            public final DateSelectBorderColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new DateSelectBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final DateSelectBorderColorStyle[] newArray(int i) {
                return new DateSelectBorderColorStyle[i];
            }
        }

        public DateSelectBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class DateSelectBorderRadiusStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DateSelectBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<DateSelectBorderRadiusStyle> {
            @Override
            @NotNull
            public final DateSelectBorderRadiusStyle createFromParcel(@NotNull Parcel parcel) {
                return new DateSelectBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final DateSelectBorderRadiusStyle[] newArray(int i) {
                return new DateSelectBorderRadiusStyle[i];
            }
        }

        public DateSelectBorderRadiusStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class DateSelectBorderWidthStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DateSelectBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<DateSelectBorderWidthStyle> {
            @Override
            @NotNull
            public final DateSelectBorderWidthStyle createFromParcel(@NotNull Parcel parcel) {
                return new DateSelectBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final DateSelectBorderWidthStyle[] newArray(int i) {
                return new DateSelectBorderWidthStyle[i];
            }
        }

        public DateSelectBorderWidthStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class DateSelectStrokeColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DateSelectStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor chevron;

        public static final class Creator implements Parcelable.Creator<DateSelectStrokeColorStyle> {
            @Override
            @NotNull
            public final DateSelectStrokeColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new DateSelectStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final DateSelectStrokeColorStyle[] newArray(int i) {
                return new DateSelectStrokeColorStyle[i];
            }
        }

        public DateSelectStrokeColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.chevron = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getChevron() {
            return this.chevron;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.chevron;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class DateSelectTextColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DateSelectTextColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor error;
        private final StyleElements.SimpleElementColor inputSelect;
        private final StyleElements.ComplexElementColor label;
        private final StyleElements.ComplexElementColor placeholder;
        private final StyleElements.ComplexElementColor value;

        public static final class Creator implements Parcelable.Creator<DateSelectTextColorStyle> {
            @Override
            @NotNull
            public final DateSelectTextColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new DateSelectTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final DateSelectTextColorStyle[] newArray(int i) {
                return new DateSelectTextColorStyle[i];
            }
        }

        public DateSelectTextColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.ComplexElementColor complexElementColor2, StyleElements.ComplexElementColor complexElementColor3, StyleElements.ComplexElementColor complexElementColor4, StyleElements.SimpleElementColor simpleElementColor) {
            this.value = complexElementColor;
            this.placeholder = complexElementColor2;
            this.label = complexElementColor3;
            this.error = complexElementColor4;
            this.inputSelect = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getError() {
            return this.error;
        }

        public final StyleElements.SimpleElementColor getInputSelect() {
            return this.inputSelect;
        }

        public final StyleElements.ComplexElementColor getLabel() {
            return this.label;
        }

        public final StyleElements.ComplexElementColor getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.ComplexElementColor getValue() {
            return this.value;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ComplexElementColor complexElementColor = this.value;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
            StyleElements.ComplexElementColor complexElementColor2 = this.placeholder;
            if (complexElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor2.writeToParcel(parcel, i);
            }
            StyleElements.ComplexElementColor complexElementColor3 = this.label;
            if (complexElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor3.writeToParcel(parcel, i);
            }
            StyleElements.ComplexElementColor complexElementColor4 = this.error;
            if (complexElementColor4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor4.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor = this.inputSelect;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ESignatureBackgroundColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ESignatureBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;
        private final StyleElements.SimpleElementColor signaturePreview;

        public static final class Creator implements Parcelable.Creator<ESignatureBackgroundColorStyle> {
            @Override
            @NotNull
            public final ESignatureBackgroundColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new ESignatureBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final ESignatureBackgroundColorStyle[] newArray(int i) {
                return new ESignatureBackgroundColorStyle[i];
            }
        }

        public ESignatureBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.SimpleElementColor simpleElementColor) {
            this.base = complexElementColor;
            this.signaturePreview = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getSignaturePreview() {
            return this.signaturePreview;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor = this.signaturePreview;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ESignatureBaseTextStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ESignatureBaseTextStyle> CREATOR = new Creator();
        private final TextBasedComponentStyle base;

        public static final class Creator implements Parcelable.Creator<ESignatureBaseTextStyle> {
            @Override
            @NotNull
            public final ESignatureBaseTextStyle createFromParcel(@NotNull Parcel parcel) {
                return new ESignatureBaseTextStyle(parcel.readInt() == 0 ? null : TextBasedComponentStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ESignatureBaseTextStyle[] newArray(int i) {
                return new ESignatureBaseTextStyle[i];
            }
        }

        public ESignatureBaseTextStyle(TextBasedComponentStyle textBasedComponentStyle) {
            this.base = textBasedComponentStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final TextBasedComponentStyle getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            TextBasedComponentStyle textBasedComponentStyle = this.base;
            if (textBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                textBasedComponentStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ESignatureBorderColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ESignatureBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public static final class Creator implements Parcelable.Creator<ESignatureBorderColorStyle> {
            @Override
            @NotNull
            public final ESignatureBorderColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new ESignatureBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ESignatureBorderColorStyle[] newArray(int i) {
                return new ESignatureBorderColorStyle[i];
            }
        }

        public ESignatureBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ESignatureBorderRadiusStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ESignatureBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<ESignatureBorderRadiusStyle> {
            @Override
            @NotNull
            public final ESignatureBorderRadiusStyle createFromParcel(@NotNull Parcel parcel) {
                return new ESignatureBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ESignatureBorderRadiusStyle[] newArray(int i) {
                return new ESignatureBorderRadiusStyle[i];
            }
        }

        public ESignatureBorderRadiusStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ESignatureBorderWidthStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ESignatureBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<ESignatureBorderWidthStyle> {
            @Override
            @NotNull
            public final ESignatureBorderWidthStyle createFromParcel(@NotNull Parcel parcel) {
                return new ESignatureBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ESignatureBorderWidthStyle[] newArray(int i) {
                return new ESignatureBorderWidthStyle[i];
            }
        }

        public ESignatureBorderWidthStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ESignatureFillColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ESignatureFillColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public static final class Creator implements Parcelable.Creator<ESignatureFillColorStyle> {
            @Override
            @NotNull
            public final ESignatureFillColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new ESignatureFillColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ESignatureFillColorStyle[] newArray(int i) {
                return new ESignatureFillColorStyle[i];
            }
        }

        public ESignatureFillColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ESignaturePrimaryButtonStyles implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ESignaturePrimaryButtonStyles> CREATOR = new Creator();
        private final ESignaturePrimaryButtonStylesContainer saveSignatureButton;

        public static final class Creator implements Parcelable.Creator<ESignaturePrimaryButtonStyles> {
            @Override
            @NotNull
            public final ESignaturePrimaryButtonStyles createFromParcel(@NotNull Parcel parcel) {
                return new ESignaturePrimaryButtonStyles(parcel.readInt() == 0 ? null : ESignaturePrimaryButtonStylesContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ESignaturePrimaryButtonStyles[] newArray(int i) {
                return new ESignaturePrimaryButtonStyles[i];
            }
        }

        public ESignaturePrimaryButtonStyles(ESignaturePrimaryButtonStylesContainer eSignaturePrimaryButtonStylesContainer) {
            this.saveSignatureButton = eSignaturePrimaryButtonStylesContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final ESignaturePrimaryButtonStylesContainer getSaveSignatureButton() {
            return this.saveSignatureButton;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            ESignaturePrimaryButtonStylesContainer eSignaturePrimaryButtonStylesContainer = this.saveSignatureButton;
            if (eSignaturePrimaryButtonStylesContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignaturePrimaryButtonStylesContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ESignaturePrimaryButtonStylesContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ESignaturePrimaryButtonStylesContainer> CREATOR = new Creator();
        private final ButtonSubmitComponentStyle base;

        public static final class Creator implements Parcelable.Creator<ESignaturePrimaryButtonStylesContainer> {
            @Override
            @NotNull
            public final ESignaturePrimaryButtonStylesContainer createFromParcel(@NotNull Parcel parcel) {
                return new ESignaturePrimaryButtonStylesContainer(parcel.readInt() == 0 ? null : ButtonSubmitComponentStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ESignaturePrimaryButtonStylesContainer[] newArray(int i) {
                return new ESignaturePrimaryButtonStylesContainer[i];
            }
        }

        public ESignaturePrimaryButtonStylesContainer(ButtonSubmitComponentStyle buttonSubmitComponentStyle) {
            this.base = buttonSubmitComponentStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final ButtonSubmitComponentStyle getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            ButtonSubmitComponentStyle buttonSubmitComponentStyle = this.base;
            if (buttonSubmitComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonSubmitComponentStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ESignatureSecondaryButtonStyles implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ESignatureSecondaryButtonStyles> CREATOR = new Creator();
        private final ESignatureSecondaryButtonStylesContainer clearSignatureButton;

        public static final class Creator implements Parcelable.Creator<ESignatureSecondaryButtonStyles> {
            @Override
            @NotNull
            public final ESignatureSecondaryButtonStyles createFromParcel(@NotNull Parcel parcel) {
                return new ESignatureSecondaryButtonStyles(parcel.readInt() == 0 ? null : ESignatureSecondaryButtonStylesContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ESignatureSecondaryButtonStyles[] newArray(int i) {
                return new ESignatureSecondaryButtonStyles[i];
            }
        }

        public ESignatureSecondaryButtonStyles(ESignatureSecondaryButtonStylesContainer eSignatureSecondaryButtonStylesContainer) {
            this.clearSignatureButton = eSignatureSecondaryButtonStylesContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final ESignatureSecondaryButtonStylesContainer getClearSignatureButton() {
            return this.clearSignatureButton;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            ESignatureSecondaryButtonStylesContainer eSignatureSecondaryButtonStylesContainer = this.clearSignatureButton;
            if (eSignatureSecondaryButtonStylesContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureSecondaryButtonStylesContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ESignatureSecondaryButtonStylesContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ESignatureSecondaryButtonStylesContainer> CREATOR = new Creator();
        private final ButtonCancelComponentStyle base;

        public static final class Creator implements Parcelable.Creator<ESignatureSecondaryButtonStylesContainer> {
            @Override
            @NotNull
            public final ESignatureSecondaryButtonStylesContainer createFromParcel(@NotNull Parcel parcel) {
                return new ESignatureSecondaryButtonStylesContainer(parcel.readInt() == 0 ? null : ButtonCancelComponentStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ESignatureSecondaryButtonStylesContainer[] newArray(int i) {
                return new ESignatureSecondaryButtonStylesContainer[i];
            }
        }

        public ESignatureSecondaryButtonStylesContainer(ButtonCancelComponentStyle buttonCancelComponentStyle) {
            this.base = buttonCancelComponentStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final ButtonCancelComponentStyle getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            ButtonCancelComponentStyle buttonCancelComponentStyle = this.base;
            if (buttonCancelComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonCancelComponentStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ESignatureTextColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ESignatureTextColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor error;
        private final StyleElements.ComplexElementColor label;
        private final StyleElements.ComplexElementColor placeholder;
        private final StyleElements.ComplexElementColor value;

        public static final class Creator implements Parcelable.Creator<ESignatureTextColorStyle> {
            @Override
            @NotNull
            public final ESignatureTextColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new ESignatureTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final ESignatureTextColorStyle[] newArray(int i) {
                return new ESignatureTextColorStyle[i];
            }
        }

        public ESignatureTextColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.ComplexElementColor complexElementColor2, StyleElements.ComplexElementColor complexElementColor3, StyleElements.ComplexElementColor complexElementColor4) {
            this.value = complexElementColor;
            this.placeholder = complexElementColor2;
            this.label = complexElementColor3;
            this.error = complexElementColor4;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getError() {
            return this.error;
        }

        public final StyleElements.ComplexElementColor getLabel() {
            return this.label;
        }

        public final StyleElements.ComplexElementColor getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.ComplexElementColor getValue() {
            return this.value;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ComplexElementColor complexElementColor = this.value;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
            StyleElements.ComplexElementColor complexElementColor2 = this.placeholder;
            if (complexElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor2.writeToParcel(parcel, i);
            }
            StyleElements.ComplexElementColor complexElementColor3 = this.label;
            if (complexElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor3.writeToParcel(parcel, i);
            }
            StyleElements.ComplexElementColor complexElementColor4 = this.error;
            if (complexElementColor4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor4.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ESignatureTextStylesContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ESignatureTextStylesContainer> CREATOR = new Creator();
        private final ESignatureBaseTextStyle dialogText;

        public static final class Creator implements Parcelable.Creator<ESignatureTextStylesContainer> {
            @Override
            @NotNull
            public final ESignatureTextStylesContainer createFromParcel(@NotNull Parcel parcel) {
                return new ESignatureTextStylesContainer(parcel.readInt() == 0 ? null : ESignatureBaseTextStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ESignatureTextStylesContainer[] newArray(int i) {
                return new ESignatureTextStylesContainer[i];
            }
        }

        public ESignatureTextStylesContainer(ESignatureBaseTextStyle eSignatureBaseTextStyle) {
            this.dialogText = eSignatureBaseTextStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final ESignatureBaseTextStyle getDialogText() {
            return this.dialogText;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            ESignatureBaseTextStyle eSignatureBaseTextStyle = this.dialogText;
            if (eSignatureBaseTextStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureBaseTextStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ESignatureTitleStylesContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ESignatureTitleStylesContainer> CREATOR = new Creator();
        private final ESignatureBaseTextStyle dialogTitle;

        public static final class Creator implements Parcelable.Creator<ESignatureTitleStylesContainer> {
            @Override
            @NotNull
            public final ESignatureTitleStylesContainer createFromParcel(@NotNull Parcel parcel) {
                return new ESignatureTitleStylesContainer(parcel.readInt() == 0 ? null : ESignatureBaseTextStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ESignatureTitleStylesContainer[] newArray(int i) {
                return new ESignatureTitleStylesContainer[i];
            }
        }

        public ESignatureTitleStylesContainer(ESignatureBaseTextStyle eSignatureBaseTextStyle) {
            this.dialogTitle = eSignatureBaseTextStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final ESignatureBaseTextStyle getDialogTitle() {
            return this.dialogTitle;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            ESignatureBaseTextStyle eSignatureBaseTextStyle = this.dialogTitle;
            if (eSignatureBaseTextStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                eSignatureBaseTextStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class FooterBorderWidthStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FooterBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<FooterBorderWidthStyle> {
            @Override
            @NotNull
            public final FooterBorderWidthStyle createFromParcel(@NotNull Parcel parcel) {
                return new FooterBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final FooterBorderWidthStyle[] newArray(int i) {
                return new FooterBorderWidthStyle[i];
            }
        }

        public FooterBorderWidthStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class FooterColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FooterColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public static final class Creator implements Parcelable.Creator<FooterColorStyle> {
            @Override
            @NotNull
            public final FooterColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new FooterColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final FooterColorStyle[] newArray(int i) {
                return new FooterColorStyle[i];
            }
        }

        public FooterColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class FooterPaddingStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FooterPaddingStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<FooterPaddingStyle> {
            @Override
            @NotNull
            public final FooterPaddingStyle createFromParcel(@NotNull Parcel parcel) {
                return new FooterPaddingStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final FooterPaddingStyle[] newArray(int i) {
                return new FooterPaddingStyle[i];
            }
        }

        public FooterPaddingStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdNfcScanInputDateStyles implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdNfcScanInputDateStyles> CREATOR = new Creator();
        private final GovernmentIdNfcScanInputDateStylesContainer base;

        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanInputDateStyles> {
            @Override
            @NotNull
            public final GovernmentIdNfcScanInputDateStyles createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdNfcScanInputDateStyles(parcel.readInt() == 0 ? null : GovernmentIdNfcScanInputDateStylesContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final GovernmentIdNfcScanInputDateStyles[] newArray(int i) {
                return new GovernmentIdNfcScanInputDateStyles[i];
            }
        }

        public GovernmentIdNfcScanInputDateStyles(GovernmentIdNfcScanInputDateStylesContainer governmentIdNfcScanInputDateStylesContainer) {
            this.base = governmentIdNfcScanInputDateStylesContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final GovernmentIdNfcScanInputDateStylesContainer getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            GovernmentIdNfcScanInputDateStylesContainer governmentIdNfcScanInputDateStylesContainer = this.base;
            if (governmentIdNfcScanInputDateStylesContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdNfcScanInputDateStylesContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdNfcScanInputDateStylesContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdNfcScanInputDateStylesContainer> CREATOR = new Creator();
        private final InputDate.InputDateComponentStyle base;

        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanInputDateStylesContainer> {
            @Override
            @NotNull
            public final GovernmentIdNfcScanInputDateStylesContainer createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdNfcScanInputDateStylesContainer(parcel.readInt() == 0 ? null : InputDate.InputDateComponentStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final GovernmentIdNfcScanInputDateStylesContainer[] newArray(int i) {
                return new GovernmentIdNfcScanInputDateStylesContainer[i];
            }
        }

        public GovernmentIdNfcScanInputDateStylesContainer(InputDate.InputDateComponentStyle inputDateComponentStyle) {
            this.base = inputDateComponentStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final InputDate.InputDateComponentStyle getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            InputDate.InputDateComponentStyle inputDateComponentStyle = this.base;
            if (inputDateComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputDateComponentStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdNfcScanInputTextStyles implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdNfcScanInputTextStyles> CREATOR = new Creator();
        private final GovernmentIdNfcScanInputTextStylesContainer base;

        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanInputTextStyles> {
            @Override
            @NotNull
            public final GovernmentIdNfcScanInputTextStyles createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdNfcScanInputTextStyles(parcel.readInt() == 0 ? null : GovernmentIdNfcScanInputTextStylesContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final GovernmentIdNfcScanInputTextStyles[] newArray(int i) {
                return new GovernmentIdNfcScanInputTextStyles[i];
            }
        }

        public GovernmentIdNfcScanInputTextStyles(GovernmentIdNfcScanInputTextStylesContainer governmentIdNfcScanInputTextStylesContainer) {
            this.base = governmentIdNfcScanInputTextStylesContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final GovernmentIdNfcScanInputTextStylesContainer getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            GovernmentIdNfcScanInputTextStylesContainer governmentIdNfcScanInputTextStylesContainer = this.base;
            if (governmentIdNfcScanInputTextStylesContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdNfcScanInputTextStylesContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdNfcScanInputTextStylesContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdNfcScanInputTextStylesContainer> CREATOR = new Creator();
        private final InputTextBasedComponentStyle base;

        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanInputTextStylesContainer> {
            @Override
            @NotNull
            public final GovernmentIdNfcScanInputTextStylesContainer createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdNfcScanInputTextStylesContainer(parcel.readInt() == 0 ? null : InputTextBasedComponentStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final GovernmentIdNfcScanInputTextStylesContainer[] newArray(int i) {
                return new GovernmentIdNfcScanInputTextStylesContainer[i];
            }
        }

        public GovernmentIdNfcScanInputTextStylesContainer(InputTextBasedComponentStyle inputTextBasedComponentStyle) {
            this.base = inputTextBasedComponentStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final InputTextBasedComponentStyle getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            InputTextBasedComponentStyle inputTextBasedComponentStyle = this.base;
            if (inputTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBasedComponentStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdNfcScanPrimaryButtonStyles implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdNfcScanPrimaryButtonStyles> CREATOR = new Creator();
        private final GovernmentIdNfcScanPrimaryButtonStylesContainer base;

        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanPrimaryButtonStyles> {
            @Override
            @NotNull
            public final GovernmentIdNfcScanPrimaryButtonStyles createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdNfcScanPrimaryButtonStyles(parcel.readInt() == 0 ? null : GovernmentIdNfcScanPrimaryButtonStylesContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final GovernmentIdNfcScanPrimaryButtonStyles[] newArray(int i) {
                return new GovernmentIdNfcScanPrimaryButtonStyles[i];
            }
        }

        public GovernmentIdNfcScanPrimaryButtonStyles(GovernmentIdNfcScanPrimaryButtonStylesContainer governmentIdNfcScanPrimaryButtonStylesContainer) {
            this.base = governmentIdNfcScanPrimaryButtonStylesContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final GovernmentIdNfcScanPrimaryButtonStylesContainer getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            GovernmentIdNfcScanPrimaryButtonStylesContainer governmentIdNfcScanPrimaryButtonStylesContainer = this.base;
            if (governmentIdNfcScanPrimaryButtonStylesContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdNfcScanPrimaryButtonStylesContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdNfcScanPrimaryButtonStylesContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdNfcScanPrimaryButtonStylesContainer> CREATOR = new Creator();
        private final ButtonSubmitComponentStyle base;

        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanPrimaryButtonStylesContainer> {
            @Override
            @NotNull
            public final GovernmentIdNfcScanPrimaryButtonStylesContainer createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdNfcScanPrimaryButtonStylesContainer(parcel.readInt() == 0 ? null : ButtonSubmitComponentStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final GovernmentIdNfcScanPrimaryButtonStylesContainer[] newArray(int i) {
                return new GovernmentIdNfcScanPrimaryButtonStylesContainer[i];
            }
        }

        public GovernmentIdNfcScanPrimaryButtonStylesContainer(ButtonSubmitComponentStyle buttonSubmitComponentStyle) {
            this.base = buttonSubmitComponentStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final ButtonSubmitComponentStyle getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            ButtonSubmitComponentStyle buttonSubmitComponentStyle = this.base;
            if (buttonSubmitComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonSubmitComponentStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class HeaderButtonColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HeaderButtonColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor headerButton;

        public static final class Creator implements Parcelable.Creator<HeaderButtonColorStyle> {
            @Override
            @NotNull
            public final HeaderButtonColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new HeaderButtonColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final HeaderButtonColorStyle[] newArray(int i) {
                return new HeaderButtonColorStyle[i];
            }
        }

        public HeaderButtonColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.headerButton = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getHeaderButton() {
            return this.headerButton;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.headerButton;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class HorizontalStackAlignmentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HorizontalStackAlignmentStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        public static final class Creator implements Parcelable.Creator<HorizontalStackAlignmentStyle> {
            @Override
            @NotNull
            public final HorizontalStackAlignmentStyle createFromParcel(@NotNull Parcel parcel) {
                return new HorizontalStackAlignmentStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final HorizontalStackAlignmentStyle[] newArray(int i) {
                return new HorizontalStackAlignmentStyle[i];
            }
        }

        public HorizontalStackAlignmentStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Position position = this.base;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class HorizontalStackAxisStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HorizontalStackAxisStyle> CREATOR = new Creator();
        private final StyleElements.AxisContainer base;

        public static final class Creator implements Parcelable.Creator<HorizontalStackAxisStyle> {
            @Override
            @NotNull
            public final HorizontalStackAxisStyle createFromParcel(@NotNull Parcel parcel) {
                return new HorizontalStackAxisStyle(parcel.readInt() == 0 ? null : StyleElements.AxisContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final HorizontalStackAxisStyle[] newArray(int i) {
                return new HorizontalStackAxisStyle[i];
            }
        }

        public HorizontalStackAxisStyle(StyleElements.AxisContainer axisContainer) {
            this.base = axisContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.AxisContainer getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.AxisContainer axisContainer = this.base;
            if (axisContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                axisContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class HorizontalStackBackgroundColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HorizontalStackBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public static final class Creator implements Parcelable.Creator<HorizontalStackBackgroundColorStyle> {
            @Override
            @NotNull
            public final HorizontalStackBackgroundColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new HorizontalStackBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final HorizontalStackBackgroundColorStyle[] newArray(int i) {
                return new HorizontalStackBackgroundColorStyle[i];
            }
        }

        public HorizontalStackBackgroundColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class HorizontalStackBorderColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HorizontalStackBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public static final class Creator implements Parcelable.Creator<HorizontalStackBorderColorStyle> {
            @Override
            @NotNull
            public final HorizontalStackBorderColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new HorizontalStackBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final HorizontalStackBorderColorStyle[] newArray(int i) {
                return new HorizontalStackBorderColorStyle[i];
            }
        }

        public HorizontalStackBorderColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class HorizontalStackBorderRadiusStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HorizontalStackBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<HorizontalStackBorderRadiusStyle> {
            @Override
            @NotNull
            public final HorizontalStackBorderRadiusStyle createFromParcel(@NotNull Parcel parcel) {
                return new HorizontalStackBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final HorizontalStackBorderRadiusStyle[] newArray(int i) {
                return new HorizontalStackBorderRadiusStyle[i];
            }
        }

        public HorizontalStackBorderRadiusStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class HorizontalStackBorderWidthStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HorizontalStackBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<HorizontalStackBorderWidthStyle> {
            @Override
            @NotNull
            public final HorizontalStackBorderWidthStyle createFromParcel(@NotNull Parcel parcel) {
                return new HorizontalStackBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final HorizontalStackBorderWidthStyle[] newArray(int i) {
                return new HorizontalStackBorderWidthStyle[i];
            }
        }

        public HorizontalStackBorderWidthStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class HorizontalStackChildSizesStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HorizontalStackChildSizesStyle> CREATOR = new Creator();
        private final StyleElements.ChildSizes base;

        public static final class Creator implements Parcelable.Creator<HorizontalStackChildSizesStyle> {
            @Override
            @NotNull
            public final HorizontalStackChildSizesStyle createFromParcel(@NotNull Parcel parcel) {
                return new HorizontalStackChildSizesStyle(parcel.readInt() == 0 ? null : StyleElements.ChildSizes.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final HorizontalStackChildSizesStyle[] newArray(int i) {
                return new HorizontalStackChildSizesStyle[i];
            }
        }

        public HorizontalStackChildSizesStyle(StyleElements.ChildSizes childSizes) {
            this.base = childSizes;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ChildSizes getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ChildSizes childSizes = this.base;
            if (childSizes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                childSizes.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class HorizontalStackGapStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HorizontalStackGapStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<HorizontalStackGapStyle> {
            @Override
            @NotNull
            public final HorizontalStackGapStyle createFromParcel(@NotNull Parcel parcel) {
                return new HorizontalStackGapStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final HorizontalStackGapStyle[] newArray(int i) {
                return new HorizontalStackGapStyle[i];
            }
        }

        public HorizontalStackGapStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class HorizontalStackMarginStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HorizontalStackMarginStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<HorizontalStackMarginStyle> {
            @Override
            @NotNull
            public final HorizontalStackMarginStyle createFromParcel(@NotNull Parcel parcel) {
                return new HorizontalStackMarginStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final HorizontalStackMarginStyle[] newArray(int i) {
                return new HorizontalStackMarginStyle[i];
            }
        }

        public HorizontalStackMarginStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class HorizontalStackPaddingStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HorizontalStackPaddingStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<HorizontalStackPaddingStyle> {
            @Override
            @NotNull
            public final HorizontalStackPaddingStyle createFromParcel(@NotNull Parcel parcel) {
                return new HorizontalStackPaddingStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final HorizontalStackPaddingStyle[] newArray(int i) {
                return new HorizontalStackPaddingStyle[i];
            }
        }

        public HorizontalStackPaddingStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class HorizontalStackWidthStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HorizontalStackWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<HorizontalStackWidthStyle> {
            @Override
            @NotNull
            public final HorizontalStackWidthStyle createFromParcel(@NotNull Parcel parcel) {
                return new HorizontalStackWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final HorizontalStackWidthStyle[] newArray(int i) {
                return new HorizontalStackWidthStyle[i];
            }
        }

        public HorizontalStackWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputCheckboxFontFamilyStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputCheckboxFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;
        private final StyleElements.FontName description;
        private final StyleElements.FontName error;

        public static final class Creator implements Parcelable.Creator<InputCheckboxFontFamilyStyle> {
            @Override
            @NotNull
            public final InputCheckboxFontFamilyStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputCheckboxFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontName.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputCheckboxFontFamilyStyle[] newArray(int i) {
                return new InputCheckboxFontFamilyStyle[i];
            }
        }

        public InputCheckboxFontFamilyStyle(StyleElements.FontName fontName, StyleElements.FontName fontName2, StyleElements.FontName fontName3) {
            this.base = fontName;
            this.description = fontName2;
            this.error = fontName3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        public final StyleElements.FontName getDescription() {
            return this.description;
        }

        public final StyleElements.FontName getError() {
            return this.error;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName.writeToParcel(parcel, i);
            }
            StyleElements.FontName fontName2 = this.description;
            if (fontName2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName2.writeToParcel(parcel, i);
            }
            StyleElements.FontName fontName3 = this.error;
            if (fontName3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputCheckboxFontSizeStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputCheckboxFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement description;
        private final StyleElements.Measurement error;

        public static final class Creator implements Parcelable.Creator<InputCheckboxFontSizeStyle> {
            @Override
            @NotNull
            public final InputCheckboxFontSizeStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputCheckboxFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputCheckboxFontSizeStyle[] newArray(int i) {
                return new InputCheckboxFontSizeStyle[i];
            }
        }

        public InputCheckboxFontSizeStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.description = measurement2;
            this.error = measurement3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getDescription() {
            return this.description;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement2 = this.description;
            if (measurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement2.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputCheckboxFontWeightStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputCheckboxFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer base;
        private final StyleElements.FontWeightContainer description;
        private final StyleElements.FontWeightContainer error;

        public static final class Creator implements Parcelable.Creator<InputCheckboxFontWeightStyle> {
            @Override
            @NotNull
            public final InputCheckboxFontWeightStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputCheckboxFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputCheckboxFontWeightStyle[] newArray(int i) {
                return new InputCheckboxFontWeightStyle[i];
            }
        }

        public InputCheckboxFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer, StyleElements.FontWeightContainer fontWeightContainer2, StyleElements.FontWeightContainer fontWeightContainer3) {
            this.base = fontWeightContainer;
            this.description = fontWeightContainer2;
            this.error = fontWeightContainer3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getBase() {
            return this.base;
        }

        public final StyleElements.FontWeightContainer getDescription() {
            return this.description;
        }

        public final StyleElements.FontWeightContainer getError() {
            return this.error;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.FontWeightContainer fontWeightContainer = this.base;
            if (fontWeightContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer.writeToParcel(parcel, i);
            }
            StyleElements.FontWeightContainer fontWeightContainer2 = this.description;
            if (fontWeightContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer2.writeToParcel(parcel, i);
            }
            StyleElements.FontWeightContainer fontWeightContainer3 = this.error;
            if (fontWeightContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputCheckboxLetterSpacingStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputCheckboxLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement description;
        private final StyleElements.Measurement error;

        public static final class Creator implements Parcelable.Creator<InputCheckboxLetterSpacingStyle> {
            @Override
            @NotNull
            public final InputCheckboxLetterSpacingStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputCheckboxLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputCheckboxLetterSpacingStyle[] newArray(int i) {
                return new InputCheckboxLetterSpacingStyle[i];
            }
        }

        public InputCheckboxLetterSpacingStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.description = measurement2;
            this.error = measurement3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getDescription() {
            return this.description;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement2 = this.description;
            if (measurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement2.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputCheckboxLineHeightStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputCheckboxLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement description;
        private final StyleElements.Measurement error;

        public static final class Creator implements Parcelable.Creator<InputCheckboxLineHeightStyle> {
            @Override
            @NotNull
            public final InputCheckboxLineHeightStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputCheckboxLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputCheckboxLineHeightStyle[] newArray(int i) {
                return new InputCheckboxLineHeightStyle[i];
            }
        }

        public InputCheckboxLineHeightStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.description = measurement2;
            this.error = measurement3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getDescription() {
            return this.description;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement2 = this.description;
            if (measurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement2.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputCheckboxTextColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputCheckboxTextColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor description;
        private final StyleElements.SimpleElementColor error;

        public static final class Creator implements Parcelable.Creator<InputCheckboxTextColorStyle> {
            @Override
            @NotNull
            public final InputCheckboxTextColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputCheckboxTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputCheckboxTextColorStyle[] newArray(int i) {
                return new InputCheckboxTextColorStyle[i];
            }
        }

        public InputCheckboxTextColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.description = simpleElementColor2;
            this.error = simpleElementColor3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getDescription() {
            return this.description;
        }

        public final StyleElements.SimpleElementColor getError() {
            return this.error;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.description;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.error;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputMarginStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputMarginStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;
        private final StyleElements.MeasurementSet option;

        public static final class Creator implements Parcelable.Creator<InputMarginStyle> {
            @Override
            @NotNull
            public final InputMarginStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputMarginStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputMarginStyle[] newArray(int i) {
                return new InputMarginStyle[i];
            }
        }

        public InputMarginStyle(StyleElements.MeasurementSet measurementSet, StyleElements.MeasurementSet measurementSet2) {
            this.base = measurementSet;
            this.option = measurementSet2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        public final StyleElements.MeasurementSet getOption() {
            return this.option;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
            StyleElements.MeasurementSet measurementSet2 = this.option;
            if (measurementSet2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet2.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputRadioGroupFontFamilyStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputRadioGroupFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;
        private final StyleElements.FontName description;
        private final StyleElements.FontName error;

        public static final class Creator implements Parcelable.Creator<InputRadioGroupFontFamilyStyle> {
            @Override
            @NotNull
            public final InputRadioGroupFontFamilyStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputRadioGroupFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontName.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputRadioGroupFontFamilyStyle[] newArray(int i) {
                return new InputRadioGroupFontFamilyStyle[i];
            }
        }

        public InputRadioGroupFontFamilyStyle(StyleElements.FontName fontName, StyleElements.FontName fontName2, StyleElements.FontName fontName3) {
            this.base = fontName;
            this.description = fontName2;
            this.error = fontName3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        public final StyleElements.FontName getDescription() {
            return this.description;
        }

        public final StyleElements.FontName getError() {
            return this.error;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName.writeToParcel(parcel, i);
            }
            StyleElements.FontName fontName2 = this.description;
            if (fontName2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName2.writeToParcel(parcel, i);
            }
            StyleElements.FontName fontName3 = this.error;
            if (fontName3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputRadioGroupFontSizeStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputRadioGroupFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement description;
        private final StyleElements.Measurement error;

        public static final class Creator implements Parcelable.Creator<InputRadioGroupFontSizeStyle> {
            @Override
            @NotNull
            public final InputRadioGroupFontSizeStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputRadioGroupFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputRadioGroupFontSizeStyle[] newArray(int i) {
                return new InputRadioGroupFontSizeStyle[i];
            }
        }

        public InputRadioGroupFontSizeStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.description = measurement2;
            this.error = measurement3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getDescription() {
            return this.description;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement2 = this.description;
            if (measurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement2.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputRadioGroupFontWeightStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputRadioGroupFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer base;
        private final StyleElements.FontWeightContainer description;
        private final StyleElements.FontWeightContainer error;

        public static final class Creator implements Parcelable.Creator<InputRadioGroupFontWeightStyle> {
            @Override
            @NotNull
            public final InputRadioGroupFontWeightStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputRadioGroupFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputRadioGroupFontWeightStyle[] newArray(int i) {
                return new InputRadioGroupFontWeightStyle[i];
            }
        }

        public InputRadioGroupFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer, StyleElements.FontWeightContainer fontWeightContainer2, StyleElements.FontWeightContainer fontWeightContainer3) {
            this.base = fontWeightContainer;
            this.description = fontWeightContainer2;
            this.error = fontWeightContainer3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getBase() {
            return this.base;
        }

        public final StyleElements.FontWeightContainer getDescription() {
            return this.description;
        }

        public final StyleElements.FontWeightContainer getError() {
            return this.error;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.FontWeightContainer fontWeightContainer = this.base;
            if (fontWeightContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer.writeToParcel(parcel, i);
            }
            StyleElements.FontWeightContainer fontWeightContainer2 = this.description;
            if (fontWeightContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer2.writeToParcel(parcel, i);
            }
            StyleElements.FontWeightContainer fontWeightContainer3 = this.error;
            if (fontWeightContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputRadioGroupLetterSpacingStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputRadioGroupLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement description;
        private final StyleElements.Measurement error;

        public static final class Creator implements Parcelable.Creator<InputRadioGroupLetterSpacingStyle> {
            @Override
            @NotNull
            public final InputRadioGroupLetterSpacingStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputRadioGroupLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputRadioGroupLetterSpacingStyle[] newArray(int i) {
                return new InputRadioGroupLetterSpacingStyle[i];
            }
        }

        public InputRadioGroupLetterSpacingStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.description = measurement2;
            this.error = measurement3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getDescription() {
            return this.description;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement2 = this.description;
            if (measurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement2.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputRadioGroupLineHeightStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputRadioGroupLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement description;
        private final StyleElements.Measurement error;

        public static final class Creator implements Parcelable.Creator<InputRadioGroupLineHeightStyle> {
            @Override
            @NotNull
            public final InputRadioGroupLineHeightStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputRadioGroupLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputRadioGroupLineHeightStyle[] newArray(int i) {
                return new InputRadioGroupLineHeightStyle[i];
            }
        }

        public InputRadioGroupLineHeightStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.description = measurement2;
            this.error = measurement3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getDescription() {
            return this.description;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement2 = this.description;
            if (measurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement2.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputRadioGroupTextColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputRadioGroupTextColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor description;
        private final StyleElements.SimpleElementColor error;

        public static final class Creator implements Parcelable.Creator<InputRadioGroupTextColorStyle> {
            @Override
            @NotNull
            public final InputRadioGroupTextColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputRadioGroupTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputRadioGroupTextColorStyle[] newArray(int i) {
                return new InputRadioGroupTextColorStyle[i];
            }
        }

        public InputRadioGroupTextColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.description = simpleElementColor2;
            this.error = simpleElementColor3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getDescription() {
            return this.description;
        }

        public final StyleElements.SimpleElementColor getError() {
            return this.error;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.description;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.error;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputSelectBackgroundColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputSelectBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public static final class Creator implements Parcelable.Creator<InputSelectBackgroundColorStyle> {
            @Override
            @NotNull
            public final InputSelectBackgroundColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputSelectBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final InputSelectBackgroundColorStyle[] newArray(int i) {
                return new InputSelectBackgroundColorStyle[i];
            }
        }

        public InputSelectBackgroundColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputSelectBorderColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputSelectBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public static final class Creator implements Parcelable.Creator<InputSelectBorderColorStyle> {
            @Override
            @NotNull
            public final InputSelectBorderColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputSelectBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final InputSelectBorderColorStyle[] newArray(int i) {
                return new InputSelectBorderColorStyle[i];
            }
        }

        public InputSelectBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputSelectBorderRadiusStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputSelectBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<InputSelectBorderRadiusStyle> {
            @Override
            @NotNull
            public final InputSelectBorderRadiusStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputSelectBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final InputSelectBorderRadiusStyle[] newArray(int i) {
                return new InputSelectBorderRadiusStyle[i];
            }
        }

        public InputSelectBorderRadiusStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputSelectBorderWidthStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputSelectBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<InputSelectBorderWidthStyle> {
            @Override
            @NotNull
            public final InputSelectBorderWidthStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputSelectBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final InputSelectBorderWidthStyle[] newArray(int i) {
                return new InputSelectBorderWidthStyle[i];
            }
        }

        public InputSelectBorderWidthStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputSelectStrokeColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputSelectStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor chevron;
        private final StyleElements.SimpleElementColor headerCancelButton;

        public static final class Creator implements Parcelable.Creator<InputSelectStrokeColorStyle> {
            @Override
            @NotNull
            public final InputSelectStrokeColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputSelectStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputSelectStrokeColorStyle[] newArray(int i) {
                return new InputSelectStrokeColorStyle[i];
            }
        }

        public InputSelectStrokeColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2) {
            this.chevron = simpleElementColor;
            this.headerCancelButton = simpleElementColor2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getChevron() {
            return this.chevron;
        }

        public final StyleElements.SimpleElementColor getHeaderCancelButton() {
            return this.headerCancelButton;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.chevron;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.headerCancelButton;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputSelectTextColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputSelectTextColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor error;
        private final StyleElements.SimpleElementColor label;

        public static final class Creator implements Parcelable.Creator<InputSelectTextColorStyle> {
            @Override
            @NotNull
            public final InputSelectTextColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputSelectTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputSelectTextColorStyle[] newArray(int i) {
                return new InputSelectTextColorStyle[i];
            }
        }

        public InputSelectTextColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.label = simpleElementColor2;
            this.error = simpleElementColor3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getError() {
            return this.error;
        }

        public final StyleElements.SimpleElementColor getLabel() {
            return this.label;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.label;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.error;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputSelectTextFontFamilyStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputSelectTextFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;
        private final StyleElements.FontName error;
        private final StyleElements.FontName label;

        public static final class Creator implements Parcelable.Creator<InputSelectTextFontFamilyStyle> {
            @Override
            @NotNull
            public final InputSelectTextFontFamilyStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputSelectTextFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontName.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputSelectTextFontFamilyStyle[] newArray(int i) {
                return new InputSelectTextFontFamilyStyle[i];
            }
        }

        public InputSelectTextFontFamilyStyle(StyleElements.FontName fontName, StyleElements.FontName fontName2, StyleElements.FontName fontName3) {
            this.base = fontName;
            this.label = fontName2;
            this.error = fontName3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        public final StyleElements.FontName getError() {
            return this.error;
        }

        public final StyleElements.FontName getLabel() {
            return this.label;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName.writeToParcel(parcel, i);
            }
            StyleElements.FontName fontName2 = this.label;
            if (fontName2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName2.writeToParcel(parcel, i);
            }
            StyleElements.FontName fontName3 = this.error;
            if (fontName3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputSelectTextFontSizeStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputSelectTextFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement error;
        private final StyleElements.Measurement label;

        public static final class Creator implements Parcelable.Creator<InputSelectTextFontSizeStyle> {
            @Override
            @NotNull
            public final InputSelectTextFontSizeStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputSelectTextFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputSelectTextFontSizeStyle[] newArray(int i) {
                return new InputSelectTextFontSizeStyle[i];
            }
        }

        public InputSelectTextFontSizeStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.label = measurement2;
            this.error = measurement3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        public final StyleElements.Measurement getLabel() {
            return this.label;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement2 = this.label;
            if (measurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement2.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputSelectTextFontWeightStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputSelectTextFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer base;
        private final StyleElements.FontWeightContainer error;
        private final StyleElements.FontWeightContainer label;

        public static final class Creator implements Parcelable.Creator<InputSelectTextFontWeightStyle> {
            @Override
            @NotNull
            public final InputSelectTextFontWeightStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputSelectTextFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputSelectTextFontWeightStyle[] newArray(int i) {
                return new InputSelectTextFontWeightStyle[i];
            }
        }

        public InputSelectTextFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer, StyleElements.FontWeightContainer fontWeightContainer2, StyleElements.FontWeightContainer fontWeightContainer3) {
            this.base = fontWeightContainer;
            this.label = fontWeightContainer2;
            this.error = fontWeightContainer3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getBase() {
            return this.base;
        }

        public final StyleElements.FontWeightContainer getError() {
            return this.error;
        }

        public final StyleElements.FontWeightContainer getLabel() {
            return this.label;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.FontWeightContainer fontWeightContainer = this.base;
            if (fontWeightContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer.writeToParcel(parcel, i);
            }
            StyleElements.FontWeightContainer fontWeightContainer2 = this.label;
            if (fontWeightContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer2.writeToParcel(parcel, i);
            }
            StyleElements.FontWeightContainer fontWeightContainer3 = this.error;
            if (fontWeightContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputSelectTextLetterSpacingStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputSelectTextLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement error;
        private final StyleElements.Measurement label;

        public static final class Creator implements Parcelable.Creator<InputSelectTextLetterSpacingStyle> {
            @Override
            @NotNull
            public final InputSelectTextLetterSpacingStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputSelectTextLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputSelectTextLetterSpacingStyle[] newArray(int i) {
                return new InputSelectTextLetterSpacingStyle[i];
            }
        }

        public InputSelectTextLetterSpacingStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.label = measurement2;
            this.error = measurement3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        public final StyleElements.Measurement getLabel() {
            return this.label;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement2 = this.label;
            if (measurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement2.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputSelectTextLineHeightStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputSelectTextLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement error;
        private final StyleElements.Measurement label;

        public static final class Creator implements Parcelable.Creator<InputSelectTextLineHeightStyle> {
            @Override
            @NotNull
            public final InputSelectTextLineHeightStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputSelectTextLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputSelectTextLineHeightStyle[] newArray(int i) {
                return new InputSelectTextLineHeightStyle[i];
            }
        }

        public InputSelectTextLineHeightStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.label = measurement2;
            this.error = measurement3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        public final StyleElements.Measurement getLabel() {
            return this.label;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement2 = this.label;
            if (measurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement2.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputTextBackgroundColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputTextBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public static final class Creator implements Parcelable.Creator<InputTextBackgroundColorStyle> {
            @Override
            @NotNull
            public final InputTextBackgroundColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputTextBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final InputTextBackgroundColorStyle[] newArray(int i) {
                return new InputTextBackgroundColorStyle[i];
            }
        }

        public InputTextBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputTextBorderColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputTextBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public static final class Creator implements Parcelable.Creator<InputTextBorderColorStyle> {
            @Override
            @NotNull
            public final InputTextBorderColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputTextBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final InputTextBorderColorStyle[] newArray(int i) {
                return new InputTextBorderColorStyle[i];
            }
        }

        public InputTextBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputTextBorderRadiusStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputTextBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<InputTextBorderRadiusStyle> {
            @Override
            @NotNull
            public final InputTextBorderRadiusStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputTextBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final InputTextBorderRadiusStyle[] newArray(int i) {
                return new InputTextBorderRadiusStyle[i];
            }
        }

        public InputTextBorderRadiusStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputTextBorderWidthStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputTextBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<InputTextBorderWidthStyle> {
            @Override
            @NotNull
            public final InputTextBorderWidthStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputTextBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final InputTextBorderWidthStyle[] newArray(int i) {
                return new InputTextBorderWidthStyle[i];
            }
        }

        public InputTextBorderWidthStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputTextStrokeColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputTextStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor maskToggle;

        public static final class Creator implements Parcelable.Creator<InputTextStrokeColorStyle> {
            @Override
            @NotNull
            public final InputTextStrokeColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputTextStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final InputTextStrokeColorStyle[] newArray(int i) {
                return new InputTextStrokeColorStyle[i];
            }
        }

        public InputTextStrokeColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.maskToggle = complexElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getMaskToggle() {
            return this.maskToggle;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.ComplexElementColor complexElementColor = this.maskToggle;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class LocalImageFillColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<LocalImageFillColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor background;
        private final StyleElements.SimpleElementColor base;

        public static final class Creator implements Parcelable.Creator<LocalImageFillColorStyle> {
            @Override
            @NotNull
            public final LocalImageFillColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new LocalImageFillColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final LocalImageFillColorStyle[] newArray(int i) {
                return new LocalImageFillColorStyle[i];
            }
        }

        public LocalImageFillColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2) {
            this.base = simpleElementColor;
            this.background = simpleElementColor2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBackground() {
            return this.background;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.background;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class LocalImageHeightStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<LocalImageHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<LocalImageHeightStyle> {
            @Override
            @NotNull
            public final LocalImageHeightStyle createFromParcel(@NotNull Parcel parcel) {
                return new LocalImageHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final LocalImageHeightStyle[] newArray(int i) {
                return new LocalImageHeightStyle[i];
            }
        }

        public LocalImageHeightStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class LocalImageJustifyStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<LocalImageJustifyStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        public static final class Creator implements Parcelable.Creator<LocalImageJustifyStyle> {
            @Override
            @NotNull
            public final LocalImageJustifyStyle createFromParcel(@NotNull Parcel parcel) {
                return new LocalImageJustifyStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final LocalImageJustifyStyle[] newArray(int i) {
                return new LocalImageJustifyStyle[i];
            }
        }

        public LocalImageJustifyStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Position position = this.base;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class LocalImageMarginStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<LocalImageMarginStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<LocalImageMarginStyle> {
            @Override
            @NotNull
            public final LocalImageMarginStyle createFromParcel(@NotNull Parcel parcel) {
                return new LocalImageMarginStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final LocalImageMarginStyle[] newArray(int i) {
                return new LocalImageMarginStyle[i];
            }
        }

        public LocalImageMarginStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class LocalImageStrokeColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<LocalImageStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public static final class Creator implements Parcelable.Creator<LocalImageStrokeColorStyle> {
            @Override
            @NotNull
            public final LocalImageStrokeColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new LocalImageStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final LocalImageStrokeColorStyle[] newArray(int i) {
                return new LocalImageStrokeColorStyle[i];
            }
        }

        public LocalImageStrokeColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class LocalImageWidthStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<LocalImageWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<LocalImageWidthStyle> {
            @Override
            @NotNull
            public final LocalImageWidthStyle createFromParcel(@NotNull Parcel parcel) {
                return new LocalImageWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final LocalImageWidthStyle[] newArray(int i) {
                return new LocalImageWidthStyle[i];
            }
        }

        public LocalImageWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class QRCodeFillColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<QRCodeFillColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public static final class Creator implements Parcelable.Creator<QRCodeFillColorStyle> {
            @Override
            @NotNull
            public final QRCodeFillColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new QRCodeFillColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final QRCodeFillColorStyle[] newArray(int i) {
                return new QRCodeFillColorStyle[i];
            }
        }

        public QRCodeFillColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class QRCodeJustifyStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<QRCodeJustifyStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        public static final class Creator implements Parcelable.Creator<QRCodeJustifyStyle> {
            @Override
            @NotNull
            public final QRCodeJustifyStyle createFromParcel(@NotNull Parcel parcel) {
                return new QRCodeJustifyStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final QRCodeJustifyStyle[] newArray(int i) {
                return new QRCodeJustifyStyle[i];
            }
        }

        public QRCodeJustifyStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Position position = this.base;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class QRCodeMarginStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<QRCodeMarginStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<QRCodeMarginStyle> {
            @Override
            @NotNull
            public final QRCodeMarginStyle createFromParcel(@NotNull Parcel parcel) {
                return new QRCodeMarginStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final QRCodeMarginStyle[] newArray(int i) {
                return new QRCodeMarginStyle[i];
            }
        }

        public QRCodeMarginStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class QRCodeStrokeColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<QRCodeStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public static final class Creator implements Parcelable.Creator<QRCodeStrokeColorStyle> {
            @Override
            @NotNull
            public final QRCodeStrokeColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new QRCodeStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final QRCodeStrokeColorStyle[] newArray(int i) {
                return new QRCodeStrokeColorStyle[i];
            }
        }

        public QRCodeStrokeColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class QRCodeWidthStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<QRCodeWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<QRCodeWidthStyle> {
            @Override
            @NotNull
            public final QRCodeWidthStyle createFromParcel(@NotNull Parcel parcel) {
                return new QRCodeWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final QRCodeWidthStyle[] newArray(int i) {
                return new QRCodeWidthStyle[i];
            }
        }

        public QRCodeWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class RemoteImageFillColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RemoteImageFillColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor background;
        private final StyleElements.SimpleElementColor fill;
        private final StyleElements.SimpleElementColor highlight;
        private final StyleElements.SimpleElementColor originalBackground;
        private final StyleElements.SimpleElementColor originalFill;
        private final StyleElements.SimpleElementColor originalHighlight;

        public static final class Creator implements Parcelable.Creator<RemoteImageFillColorStyle> {
            @Override
            @NotNull
            public final RemoteImageFillColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new RemoteImageFillColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final RemoteImageFillColorStyle[] newArray(int i) {
                return new RemoteImageFillColorStyle[i];
            }
        }

        public RemoteImageFillColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3, StyleElements.SimpleElementColor simpleElementColor4, StyleElements.SimpleElementColor simpleElementColor5, StyleElements.SimpleElementColor simpleElementColor6) {
            this.fill = simpleElementColor;
            this.highlight = simpleElementColor2;
            this.background = simpleElementColor3;
            this.originalFill = simpleElementColor4;
            this.originalHighlight = simpleElementColor5;
            this.originalBackground = simpleElementColor6;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBackground() {
            return this.background;
        }

        public final StyleElements.SimpleElementColor getFill() {
            return this.fill;
        }

        public final StyleElements.SimpleElementColor getHighlight() {
            return this.highlight;
        }

        public final StyleElements.SimpleElementColor getOriginalBackground() {
            return this.originalBackground;
        }

        public final StyleElements.SimpleElementColor getOriginalFill() {
            return this.originalFill;
        }

        public final StyleElements.SimpleElementColor getOriginalHighlight() {
            return this.originalHighlight;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.fill;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.highlight;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.background;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor4 = this.originalFill;
            if (simpleElementColor4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor4.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor5 = this.originalHighlight;
            if (simpleElementColor5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor5.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor6 = this.originalBackground;
            if (simpleElementColor6 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor6.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class RemoteImageHeightStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RemoteImageHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<RemoteImageHeightStyle> {
            @Override
            @NotNull
            public final RemoteImageHeightStyle createFromParcel(@NotNull Parcel parcel) {
                return new RemoteImageHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final RemoteImageHeightStyle[] newArray(int i) {
                return new RemoteImageHeightStyle[i];
            }
        }

        public RemoteImageHeightStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class RemoteImageJustifyStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RemoteImageJustifyStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        public static final class Creator implements Parcelable.Creator<RemoteImageJustifyStyle> {
            @Override
            @NotNull
            public final RemoteImageJustifyStyle createFromParcel(@NotNull Parcel parcel) {
                return new RemoteImageJustifyStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final RemoteImageJustifyStyle[] newArray(int i) {
                return new RemoteImageJustifyStyle[i];
            }
        }

        public RemoteImageJustifyStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Position position = this.base;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class RemoteImageMarginStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RemoteImageMarginStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<RemoteImageMarginStyle> {
            @Override
            @NotNull
            public final RemoteImageMarginStyle createFromParcel(@NotNull Parcel parcel) {
                return new RemoteImageMarginStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final RemoteImageMarginStyle[] newArray(int i) {
                return new RemoteImageMarginStyle[i];
            }
        }

        public RemoteImageMarginStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class RemoteImageStrokeColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RemoteImageStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor originalStroke;
        private final StyleElements.SimpleElementColor stroke;

        public static final class Creator implements Parcelable.Creator<RemoteImageStrokeColorStyle> {
            @Override
            @NotNull
            public final RemoteImageStrokeColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new RemoteImageStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final RemoteImageStrokeColorStyle[] newArray(int i) {
                return new RemoteImageStrokeColorStyle[i];
            }
        }

        public RemoteImageStrokeColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2) {
            this.stroke = simpleElementColor;
            this.originalStroke = simpleElementColor2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getOriginalStroke() {
            return this.originalStroke;
        }

        public final StyleElements.SimpleElementColor getStroke() {
            return this.stroke;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.stroke;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.originalStroke;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class RemoteImageWidthStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RemoteImageWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<RemoteImageWidthStyle> {
            @Override
            @NotNull
            public final RemoteImageWidthStyle createFromParcel(@NotNull Parcel parcel) {
                return new RemoteImageWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final RemoteImageWidthStyle[] newArray(int i) {
                return new RemoteImageWidthStyle[i];
            }
        }

        public RemoteImageWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class SpacerHeightStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SpacerHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<SpacerHeightStyle> {
            @Override
            @NotNull
            public final SpacerHeightStyle createFromParcel(@NotNull Parcel parcel) {
                return new SpacerHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final SpacerHeightStyle[] newArray(int i) {
                return new SpacerHeightStyle[i];
            }
        }

        public SpacerHeightStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class SpacerWidthStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SpacerWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<SpacerWidthStyle> {
            @Override
            @NotNull
            public final SpacerWidthStyle createFromParcel(@NotNull Parcel parcel) {
                return new SpacerWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final SpacerWidthStyle[] newArray(int i) {
                return new SpacerWidthStyle[i];
            }
        }

        public SpacerWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class TextBasedFontFamilyStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TextBasedFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;

        public static final class Creator implements Parcelable.Creator<TextBasedFontFamilyStyle> {
            @Override
            @NotNull
            public final TextBasedFontFamilyStyle createFromParcel(@NotNull Parcel parcel) {
                return new TextBasedFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final TextBasedFontFamilyStyle[] newArray(int i) {
                return new TextBasedFontFamilyStyle[i];
            }
        }

        public TextBasedFontFamilyStyle(StyleElements.FontName fontName) {
            this.base = fontName;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontName.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class TextBasedFontSizeStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TextBasedFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<TextBasedFontSizeStyle> {
            @Override
            @NotNull
            public final TextBasedFontSizeStyle createFromParcel(@NotNull Parcel parcel) {
                return new TextBasedFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final TextBasedFontSizeStyle[] newArray(int i) {
                return new TextBasedFontSizeStyle[i];
            }
        }

        public TextBasedFontSizeStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class TextBasedFontWeightStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TextBasedFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer base;

        public static final class Creator implements Parcelable.Creator<TextBasedFontWeightStyle> {
            @Override
            @NotNull
            public final TextBasedFontWeightStyle createFromParcel(@NotNull Parcel parcel) {
                return new TextBasedFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final TextBasedFontWeightStyle[] newArray(int i) {
                return new TextBasedFontWeightStyle[i];
            }
        }

        public TextBasedFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer) {
            this.base = fontWeightContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.FontWeightContainer fontWeightContainer = this.base;
            if (fontWeightContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fontWeightContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class TextBasedJustifyStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TextBasedJustifyStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        public static final class Creator implements Parcelable.Creator<TextBasedJustifyStyle> {
            @Override
            @NotNull
            public final TextBasedJustifyStyle createFromParcel(@NotNull Parcel parcel) {
                return new TextBasedJustifyStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final TextBasedJustifyStyle[] newArray(int i) {
                return new TextBasedJustifyStyle[i];
            }
        }

        public TextBasedJustifyStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Position position = this.base;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class TextBasedLetterSpacingStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TextBasedLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<TextBasedLetterSpacingStyle> {
            @Override
            @NotNull
            public final TextBasedLetterSpacingStyle createFromParcel(@NotNull Parcel parcel) {
                return new TextBasedLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final TextBasedLetterSpacingStyle[] newArray(int i) {
                return new TextBasedLetterSpacingStyle[i];
            }
        }

        public TextBasedLetterSpacingStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class TextBasedLineHeightStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TextBasedLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public static final class Creator implements Parcelable.Creator<TextBasedLineHeightStyle> {
            @Override
            @NotNull
            public final TextBasedLineHeightStyle createFromParcel(@NotNull Parcel parcel) {
                return new TextBasedLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final TextBasedLineHeightStyle[] newArray(int i) {
                return new TextBasedLineHeightStyle[i];
            }
        }

        public TextBasedLineHeightStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class TextBasedMarginStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TextBasedMarginStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public static final class Creator implements Parcelable.Creator<TextBasedMarginStyle> {
            @Override
            @NotNull
            public final TextBasedMarginStyle createFromParcel(@NotNull Parcel parcel) {
                return new TextBasedMarginStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final TextBasedMarginStyle[] newArray(int i) {
                return new TextBasedMarginStyle[i];
            }
        }

        public TextBasedMarginStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class TextBasedTextColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TextBasedTextColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public static final class Creator implements Parcelable.Creator<TextBasedTextColorStyle> {
            @Override
            @NotNull
            public final TextBasedTextColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new TextBasedTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final TextBasedTextColorStyle[] newArray(int i) {
                return new TextBasedTextColorStyle[i];
            }
        }

        public TextBasedTextColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }
}
