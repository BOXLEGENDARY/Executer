package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class InputInternationalDb implements UiComponentConfig {

    @NotNull
    public static final String type = "input_international_db";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final InputInternationalDbComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InputInternationalDb> CREATOR = new Creator();

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();

        @NotNull
        private final List<IdType> allowedIdTypes;
        private final JsonLogicBoolean disabled;
        private final String errorIdbCountry;
        private final String errorIdbType;
        private final String errorIdbValue;
        private final JsonLogicBoolean hidden;
        private final Boolean hideCountryIfPrefilled;
        private final Boolean hideCountryIfSingleChoice;
        private final Boolean hideTypeIfPrefilled;
        private final Boolean hideTypeIfSingleChoice;
        private final String label;
        private final String labelIdbCountry;
        private final String labelIdbType;
        private final String labelIdbValue;
        private final String placeholderIdbCountry;
        private final String placeholderIdbType;
        private final String placeholderIdbValue;
        private final String prefillIdbCountry;
        private final String prefillIdbType;
        private final String prefillIdbValue;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean boolValueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(IdType.CREATOR.createFromParcel(parcel));
                }
                return new Attributes(string, string2, string3, string4, string5, string6, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, @NotNull List<IdType> list, String str7, String str8, String str9, String str10, String str11, String str12, String str13, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
            this.prefillIdbCountry = str;
            this.prefillIdbType = str2;
            this.prefillIdbValue = str3;
            this.errorIdbCountry = str4;
            this.errorIdbType = str5;
            this.errorIdbValue = str6;
            this.hideCountryIfPrefilled = bool;
            this.hideTypeIfPrefilled = bool2;
            this.hideCountryIfSingleChoice = bool3;
            this.hideTypeIfSingleChoice = bool4;
            this.allowedIdTypes = list;
            this.label = str7;
            this.labelIdbCountry = str8;
            this.labelIdbType = str9;
            this.labelIdbValue = str10;
            this.placeholderIdbCountry = str11;
            this.placeholderIdbType = str12;
            this.placeholderIdbValue = str13;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final List<IdType> getAllowedIdTypes() {
            return this.allowedIdTypes;
        }

        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        public final String getErrorIdbCountry() {
            return this.errorIdbCountry;
        }

        public final String getErrorIdbType() {
            return this.errorIdbType;
        }

        public final String getErrorIdbValue() {
            return this.errorIdbValue;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final Boolean getHideCountryIfPrefilled() {
            return this.hideCountryIfPrefilled;
        }

        public final Boolean getHideCountryIfSingleChoice() {
            return this.hideCountryIfSingleChoice;
        }

        public final Boolean getHideTypeIfPrefilled() {
            return this.hideTypeIfPrefilled;
        }

        public final Boolean getHideTypeIfSingleChoice() {
            return this.hideTypeIfSingleChoice;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getLabelIdbCountry() {
            return this.labelIdbCountry;
        }

        public final String getLabelIdbType() {
            return this.labelIdbType;
        }

        public final String getLabelIdbValue() {
            return this.labelIdbValue;
        }

        public final String getPlaceholderIdbCountry() {
            return this.placeholderIdbCountry;
        }

        public final String getPlaceholderIdbType() {
            return this.placeholderIdbType;
        }

        public final String getPlaceholderIdbValue() {
            return this.placeholderIdbValue;
        }

        public final String getPrefillIdbCountry() {
            return this.prefillIdbCountry;
        }

        public final String getPrefillIdbType() {
            return this.prefillIdbType;
        }

        public final String getPrefillIdbValue() {
            return this.prefillIdbValue;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.prefillIdbCountry);
            parcel.writeString(this.prefillIdbType);
            parcel.writeString(this.prefillIdbValue);
            parcel.writeString(this.errorIdbCountry);
            parcel.writeString(this.errorIdbType);
            parcel.writeString(this.errorIdbValue);
            Boolean bool = this.hideCountryIfPrefilled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.hideTypeIfPrefilled;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            Boolean bool3 = this.hideCountryIfSingleChoice;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool3.booleanValue() ? 1 : 0);
            }
            Boolean bool4 = this.hideTypeIfSingleChoice;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool4.booleanValue() ? 1 : 0);
            }
            List<IdType> list = this.allowedIdTypes;
            parcel.writeInt(list.size());
            Iterator<IdType> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
            parcel.writeString(this.label);
            parcel.writeString(this.labelIdbCountry);
            parcel.writeString(this.labelIdbType);
            parcel.writeString(this.labelIdbValue);
            parcel.writeString(this.placeholderIdbCountry);
            parcel.writeString(this.placeholderIdbType);
            parcel.writeString(this.placeholderIdbValue);
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

    public static final class Creator implements Parcelable.Creator<InputInternationalDb> {
        @Override
        @NotNull
        public final InputInternationalDb createFromParcel(@NotNull Parcel parcel) {
            return new InputInternationalDb(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputInternationalDbComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final InputInternationalDb[] newArray(int i) {
            return new InputInternationalDb[i];
        }
    }

    @i(generateAdapter = true)
    public static final class IdType implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<IdType> CREATOR = new Creator();
        private final String countryCode;
        private final String countryName;
        private final String description;
        private final String idType;
        private final String mask;
        private final String name;
        private final String placeholder;
        private final Boolean secure;

        public static final class Creator implements Parcelable.Creator<IdType> {
            @Override
            @NotNull
            public final IdType createFromParcel(@NotNull Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new IdType(string, string2, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override
            @NotNull
            public final IdType[] newArray(int i) {
                return new IdType[i];
            }
        }

        public IdType(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7) {
            this.mask = str;
            this.placeholder = str2;
            this.secure = bool;
            this.countryName = str3;
            this.countryCode = str4;
            this.idType = str5;
            this.name = str6;
            this.description = str7;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final String getCountryName() {
            return this.countryName;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getIdType() {
            return this.idType;
        }

        public final String getMask() {
            return this.mask;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final Boolean getSecure() {
            return this.secure;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            int iBooleanValue;
            parcel.writeString(this.mask);
            parcel.writeString(this.placeholder);
            Boolean bool = this.secure;
            if (bool == null) {
                iBooleanValue = 0;
            } else {
                parcel.writeInt(1);
                iBooleanValue = bool.booleanValue();
            }
            parcel.writeInt(iBooleanValue);
            parcel.writeString(this.countryName);
            parcel.writeString(this.countryCode);
            parcel.writeString(this.idType);
            parcel.writeString(this.name);
            parcel.writeString(this.description);
        }
    }

    @i(generateAdapter = true)
    public static final class InputInternationalDbComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputInternationalDbComponentStyle> CREATOR = new Creator();
        private final InputSelectComponentStyle inputSelectStyle;
        private final InputTextBasedComponentStyle inputTextStyle;
        private final TextBasedComponentStyle textStyle;

        public static final class Creator implements Parcelable.Creator<InputInternationalDbComponentStyle> {
            @Override
            @NotNull
            public final InputInternationalDbComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new InputInternationalDbComponentStyle(parcel.readInt() == 0 ? null : InputSelectComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InputTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TextBasedComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final InputInternationalDbComponentStyle[] newArray(int i) {
                return new InputInternationalDbComponentStyle[i];
            }
        }

        public InputInternationalDbComponentStyle(InputSelectComponentStyle inputSelectComponentStyle, InputTextBasedComponentStyle inputTextBasedComponentStyle, TextBasedComponentStyle textBasedComponentStyle) {
            this.inputSelectStyle = inputSelectComponentStyle;
            this.inputTextStyle = inputTextBasedComponentStyle;
            this.textStyle = textBasedComponentStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final InputSelectComponentStyle getInputSelectStyle() {
            return this.inputSelectStyle;
        }

        public final InputTextBasedComponentStyle getInputTextStyle() {
            return this.inputTextStyle;
        }

        public final TextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            InputSelectComponentStyle inputSelectComponentStyle = this.inputSelectStyle;
            if (inputSelectComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectComponentStyle.writeToParcel(parcel, i);
            }
            InputTextBasedComponentStyle inputTextBasedComponentStyle = this.inputTextStyle;
            if (inputTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputTextBasedComponentStyle.writeToParcel(parcel, i);
            }
            TextBasedComponentStyle textBasedComponentStyle = this.textStyle;
            if (textBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                textBasedComponentStyle.writeToParcel(parcel, i);
            }
        }
    }

    public InputInternationalDb(@NotNull String str, Attributes attributes, InputInternationalDbComponentStyle inputInternationalDbComponentStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = inputInternationalDbComponentStyle;
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

    public final InputInternationalDbComponentStyle getStyles() {
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
        InputInternationalDbComponentStyle inputInternationalDbComponentStyle = this.styles;
        if (inputInternationalDbComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputInternationalDbComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public Attributes getAttributes() {
        return this.attributes;
    }
}
