package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class InputRadioGroup implements UiComponentConfig {

    @NotNull
    public static final String type = "input_radio_group";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final InputRadioGroupComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InputRadioGroup> CREATOR = new Creator();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<InputRadioGroup> {
        @Override
        @NotNull
        public final InputRadioGroup createFromParcel(@NotNull Parcel parcel) {
            return new InputRadioGroup(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputRadioGroupComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final InputRadioGroup[] newArray(int i) {
            return new InputRadioGroup[i];
        }
    }

    @i(generateAdapter = true)
    public static final class InputRadioGroupComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputRadioGroupComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.InputRadioGroupFontFamilyStyle fontFamily;
        private final AttributeStyles.InputRadioGroupFontSizeStyle fontSize;
        private final AttributeStyles.InputRadioGroupFontWeightStyle fontWeight;
        private final AttributeStyles.InputRadioGroupLetterSpacingStyle letterSpacing;
        private final AttributeStyles.InputRadioGroupLineHeightStyle lineHeight;
        private final AttributeStyles.TextBasedMarginStyle margin;
        private final AttributeStyles.InputRadioGroupTextColorStyle textColor;
        private final AttributeStyles.TextBasedTextColorStyle textColorHighlight;

        public static final class Creator implements Parcelable.Creator<InputRadioGroupComponentStyle> {
            @Override
            @NotNull
            public final InputRadioGroupComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputRadioGroupComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.TextBasedMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.TextBasedTextColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputRadioGroupComponentStyle[] newArray(int i) {
                return new InputRadioGroupComponentStyle[i];
            }
        }

        public InputRadioGroupComponentStyle(AttributeStyles.TextBasedMarginStyle textBasedMarginStyle, AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle, AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle, AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle, AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle, AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle, AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle, AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle) {
            this.margin = textBasedMarginStyle;
            this.fontFamily = inputRadioGroupFontFamilyStyle;
            this.fontSize = inputRadioGroupFontSizeStyle;
            this.fontWeight = inputRadioGroupFontWeightStyle;
            this.letterSpacing = inputRadioGroupLetterSpacingStyle;
            this.lineHeight = inputRadioGroupLineHeightStyle;
            this.textColor = inputRadioGroupTextColorStyle;
            this.textColorHighlight = textBasedTextColorStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final TextBasedComponentStyle getDescriptionTextStyle() {
            AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputRadioGroupFontFamilyStyle != null ? inputRadioGroupFontFamilyStyle.getDescription() : null);
            AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputRadioGroupFontSizeStyle != null ? inputRadioGroupFontSizeStyle.getDescription() : null);
            AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputRadioGroupFontWeightStyle != null ? inputRadioGroupFontWeightStyle.getDescription() : null);
            AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputRadioGroupLetterSpacingStyle != null ? inputRadioGroupLetterSpacingStyle.getDescription() : null);
            AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputRadioGroupLineHeightStyle != null ? inputRadioGroupLineHeightStyle.getDescription() : null);
            AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputRadioGroupTextColorStyle != null ? inputRadioGroupTextColorStyle.getDescription() : null), null);
        }

        @NotNull
        public final TextBasedComponentStyle getErrorTextStyle() {
            AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputRadioGroupFontFamilyStyle != null ? inputRadioGroupFontFamilyStyle.getError() : null);
            AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputRadioGroupFontSizeStyle != null ? inputRadioGroupFontSizeStyle.getError() : null);
            AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputRadioGroupFontWeightStyle != null ? inputRadioGroupFontWeightStyle.getError() : null);
            AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputRadioGroupLetterSpacingStyle != null ? inputRadioGroupLetterSpacingStyle.getError() : null);
            AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputRadioGroupLineHeightStyle != null ? inputRadioGroupLineHeightStyle.getError() : null);
            AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputRadioGroupTextColorStyle != null ? inputRadioGroupTextColorStyle.getError() : null), null);
        }

        public final AttributeStyles.InputRadioGroupFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        public final AttributeStyles.InputRadioGroupFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        public final AttributeStyles.InputRadioGroupFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        public final AttributeStyles.InputRadioGroupLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        public final AttributeStyles.InputRadioGroupLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        public final AttributeStyles.TextBasedMarginStyle getMargin() {
            return this.margin;
        }

        public final StyleElements.SizeSet getMargins() {
            StyleElements.MeasurementSet base;
            AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = this.margin;
            if (textBasedMarginStyle == null || (base = textBasedMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @NotNull
        public final TextBasedComponentStyle getTextBasedStyle() {
            AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputRadioGroupFontFamilyStyle != null ? inputRadioGroupFontFamilyStyle.getBase() : null);
            AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputRadioGroupFontSizeStyle != null ? inputRadioGroupFontSizeStyle.getBase() : null);
            AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputRadioGroupFontWeightStyle != null ? inputRadioGroupFontWeightStyle.getBase() : null);
            AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputRadioGroupLetterSpacingStyle != null ? inputRadioGroupLetterSpacingStyle.getBase() : null);
            AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputRadioGroupLineHeightStyle != null ? inputRadioGroupLineHeightStyle.getBase() : null);
            AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputRadioGroupTextColorStyle != null ? inputRadioGroupTextColorStyle.getBase() : null), this.textColorHighlight);
        }

        public final AttributeStyles.InputRadioGroupTextColorStyle getTextColor() {
            return this.textColor;
        }

        public final AttributeStyles.TextBasedTextColorStyle getTextColorHighlight() {
            return this.textColorHighlight;
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
            AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = this.fontFamily;
            if (inputRadioGroupFontFamilyStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputRadioGroupFontFamilyStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = this.fontSize;
            if (inputRadioGroupFontSizeStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputRadioGroupFontSizeStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = this.fontWeight;
            if (inputRadioGroupFontWeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputRadioGroupFontWeightStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = this.letterSpacing;
            if (inputRadioGroupLetterSpacingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputRadioGroupLetterSpacingStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = this.lineHeight;
            if (inputRadioGroupLineHeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputRadioGroupLineHeightStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = this.textColor;
            if (inputRadioGroupTextColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputRadioGroupTextColorStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColorHighlight;
            if (textBasedTextColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                textBasedTextColorStyle.writeToParcel(parcel, i);
            }
        }
    }

    public InputRadioGroup(@NotNull String str, Attributes attributes, InputRadioGroupComponentStyle inputRadioGroupComponentStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = inputRadioGroupComponentStyle;
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

    public final InputRadioGroupComponentStyle getStyles() {
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
        InputRadioGroupComponentStyle inputRadioGroupComponentStyle = this.styles;
        if (inputRadioGroupComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputRadioGroupComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public Attributes getAttributes() {
        return this.attributes;
    }

    public InputRadioGroup(String str, Attributes attributes, InputRadioGroupComponentStyle inputRadioGroupComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i & 4) != 0 ? null : inputRadioGroupComponentStyle);
    }

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final JsonLogicBoolean disabled;
        private final JsonLogicBoolean hidden;
        private final String label;

        @NotNull
        private final List<OptionWithDescription> options;
        private final String prefill;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(OptionWithDescription.CREATOR.createFromParcel(parcel));
                }
                return new Attributes(string, string2, arrayList, parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(String str, String str2, @NotNull List<OptionWithDescription> list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
            this.prefill = str;
            this.label = str2;
            this.options = list;
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

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final List<OptionWithDescription> getOptions() {
            return this.options;
        }

        public final String getPrefill() {
            return this.prefill;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.prefill);
            parcel.writeString(this.label);
            List<OptionWithDescription> list = this.options;
            parcel.writeInt(list.size());
            Iterator<OptionWithDescription> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
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

        public Attributes(String str, String str2, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, list, (i & 8) != 0 ? null : jsonLogicBoolean, (i & 16) != 0 ? null : jsonLogicBoolean2);
        }
    }
}
