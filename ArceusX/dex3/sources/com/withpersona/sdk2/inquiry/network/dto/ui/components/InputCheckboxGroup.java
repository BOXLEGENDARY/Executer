package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class InputCheckboxGroup implements UiComponentConfig {

    @NotNull
    public static final String type = "input_checkbox_group";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final InputCheckbox.InputCheckboxComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InputCheckboxGroup> CREATOR = new Creator();

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final JsonLogicBoolean disabled;
        private final JsonLogicBoolean hidden;
        private final String label;

        @NotNull
        private final List<OptionWithDescription> options;
        private final List<String> prefill;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(OptionWithDescription.CREATOR.createFromParcel(parcel));
                }
                return new Attributes(arrayListCreateStringArrayList, string, arrayList, parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(List<String> list, String str, @NotNull List<OptionWithDescription> list2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
            this.prefill = list;
            this.label = str;
            this.options = list2;
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

        public final List<String> getPrefill() {
            return this.prefill;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeStringList(this.prefill);
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
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<InputCheckboxGroup> {
        @Override
        @NotNull
        public final InputCheckboxGroup createFromParcel(@NotNull Parcel parcel) {
            return new InputCheckboxGroup(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputCheckbox.InputCheckboxComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final InputCheckboxGroup[] newArray(int i) {
            return new InputCheckboxGroup[i];
        }
    }

    @i(generateAdapter = true)
    public static final class InputCheckboxComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputCheckboxComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.InputCheckboxFontFamilyStyle fontFamily;
        private final AttributeStyles.InputCheckboxFontSizeStyle fontSize;
        private final AttributeStyles.InputCheckboxFontWeightStyle fontWeight;
        private final AttributeStyles.InputCheckboxLetterSpacingStyle letterSpacing;
        private final AttributeStyles.InputCheckboxLineHeightStyle lineHeight;
        private final AttributeStyles.InputCheckboxTextColorStyle textColor;
        private final AttributeStyles.TextBasedTextColorStyle textColorHighlight;

        public static final class Creator implements Parcelable.Creator<InputCheckboxComponentStyle> {
            @Override
            @NotNull
            public final InputCheckboxComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputCheckboxComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.TextBasedTextColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputCheckboxComponentStyle[] newArray(int i) {
                return new InputCheckboxComponentStyle[i];
            }
        }

        public InputCheckboxComponentStyle(AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle, AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle, AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle, AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle, AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle, AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle, AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle) {
            this.fontFamily = inputCheckboxFontFamilyStyle;
            this.fontSize = inputCheckboxFontSizeStyle;
            this.fontWeight = inputCheckboxFontWeightStyle;
            this.letterSpacing = inputCheckboxLetterSpacingStyle;
            this.lineHeight = inputCheckboxLineHeightStyle;
            this.textColor = inputCheckboxTextColorStyle;
            this.textColorHighlight = textBasedTextColorStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final TextBasedComponentStyle getDescriptionTextStyle() {
            AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputCheckboxFontFamilyStyle != null ? inputCheckboxFontFamilyStyle.getDescription() : null);
            AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputCheckboxFontSizeStyle != null ? inputCheckboxFontSizeStyle.getDescription() : null);
            AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputCheckboxFontWeightStyle != null ? inputCheckboxFontWeightStyle.getDescription() : null);
            AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputCheckboxLetterSpacingStyle != null ? inputCheckboxLetterSpacingStyle.getDescription() : null);
            AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputCheckboxLineHeightStyle != null ? inputCheckboxLineHeightStyle.getDescription() : null);
            AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputCheckboxTextColorStyle != null ? inputCheckboxTextColorStyle.getDescription() : null), null);
        }

        @NotNull
        public final TextBasedComponentStyle getErrorTextStyle() {
            AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputCheckboxFontFamilyStyle != null ? inputCheckboxFontFamilyStyle.getError() : null);
            AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputCheckboxFontSizeStyle != null ? inputCheckboxFontSizeStyle.getError() : null);
            AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputCheckboxFontWeightStyle != null ? inputCheckboxFontWeightStyle.getError() : null);
            AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputCheckboxLetterSpacingStyle != null ? inputCheckboxLetterSpacingStyle.getError() : null);
            AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputCheckboxLineHeightStyle != null ? inputCheckboxLineHeightStyle.getError() : null);
            AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputCheckboxTextColorStyle != null ? inputCheckboxTextColorStyle.getError() : null), null);
        }

        public final AttributeStyles.InputCheckboxFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        public final AttributeStyles.InputCheckboxFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        public final AttributeStyles.InputCheckboxFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        public final AttributeStyles.InputCheckboxLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        public final AttributeStyles.InputCheckboxLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        @NotNull
        public final TextBasedComponentStyle getTextBasedStyle() {
            AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputCheckboxFontFamilyStyle != null ? inputCheckboxFontFamilyStyle.getBase() : null);
            AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputCheckboxFontSizeStyle != null ? inputCheckboxFontSizeStyle.getBase() : null);
            AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputCheckboxFontWeightStyle != null ? inputCheckboxFontWeightStyle.getBase() : null);
            AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputCheckboxLetterSpacingStyle != null ? inputCheckboxLetterSpacingStyle.getBase() : null);
            AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputCheckboxLineHeightStyle != null ? inputCheckboxLineHeightStyle.getBase() : null);
            AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputCheckboxTextColorStyle != null ? inputCheckboxTextColorStyle.getBase() : null), this.textColorHighlight);
        }

        public final AttributeStyles.InputCheckboxTextColorStyle getTextColor() {
            return this.textColor;
        }

        public final AttributeStyles.TextBasedTextColorStyle getTextColorHighlight() {
            return this.textColorHighlight;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
            if (inputCheckboxFontFamilyStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputCheckboxFontFamilyStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
            if (inputCheckboxFontSizeStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputCheckboxFontSizeStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
            if (inputCheckboxFontWeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputCheckboxFontWeightStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
            if (inputCheckboxLetterSpacingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputCheckboxLetterSpacingStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
            if (inputCheckboxLineHeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputCheckboxLineHeightStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
            if (inputCheckboxTextColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputCheckboxTextColorStyle.writeToParcel(parcel, i);
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

    public InputCheckboxGroup(@NotNull String str, Attributes attributes, InputCheckbox.InputCheckboxComponentStyle inputCheckboxComponentStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = inputCheckboxComponentStyle;
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

    public final InputCheckbox.InputCheckboxComponentStyle getStyles() {
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
        InputCheckbox.InputCheckboxComponentStyle inputCheckboxComponentStyle = this.styles;
        if (inputCheckboxComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputCheckboxComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public Attributes getAttributes() {
        return this.attributes;
    }

    public InputCheckboxGroup(String str, Attributes attributes, InputCheckbox.InputCheckboxComponentStyle inputCheckboxComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i & 4) != 0 ? null : inputCheckboxComponentStyle);
    }
}
