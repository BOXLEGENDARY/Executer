package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import T9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.z;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class InputText implements UiComponentConfig {

    @NotNull
    public static final String type = "input_text";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final InputTextBasedComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InputText> CREATOR = new Creator();

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final AutofillHint autofillHint;
        private final JsonLogicBoolean disabled;
        private final JsonLogicBoolean hidden;

        @NotNull
        private final InputType inputType;
        private final String label;
        private final String placeholder;
        private final String prefill;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                return new Attributes(parcel.readString(), parcel.readString(), parcel.readString(), InputType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : AutofillHint.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(String str, String str2, String str3, @NotNull InputType inputType, AutofillHint autofillHint, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
            this.prefill = str;
            this.label = str2;
            this.placeholder = str3;
            this.inputType = inputType;
            this.autofillHint = autofillHint;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final AutofillHint getAutofillHint() {
            return this.autofillHint;
        }

        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        @NotNull
        public final InputType getInputType() {
            return this.inputType;
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

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.prefill);
            parcel.writeString(this.label);
            parcel.writeString(this.placeholder);
            parcel.writeString(this.inputType.name());
            AutofillHint autofillHint = this.autofillHint;
            if (autofillHint == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(autofillHint.name());
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

    @i(generateAdapter = false)
    public static final class AutofillHint {
        private static final T9.a $ENTRIES;
        private static final AutofillHint[] $VALUES;

        @NotNull
        public static final Companion Companion;
        public static final AutofillHint NAME = new AutofillHint("NAME", 0);
        public static final AutofillHint NAME_FIRST = new AutofillHint("NAME_FIRST", 1);
        public static final AutofillHint NAME_MIDDLE = new AutofillHint("NAME_MIDDLE", 2);
        public static final AutofillHint NAME_LAST = new AutofillHint("NAME_LAST", 3);
        public static final AutofillHint EMAIL = new AutofillHint("EMAIL", 4);
        public static final AutofillHint ADDRESS_LINE_1 = new AutofillHint("ADDRESS_LINE_1", 5);
        public static final AutofillHint ADDRESS_LINE_2 = new AutofillHint("ADDRESS_LINE_2", 6);
        public static final AutofillHint CITY = new AutofillHint("CITY", 7);
        public static final AutofillHint COUNTRY = new AutofillHint("COUNTRY", 8);
        public static final AutofillHint POSTAL_CODE = new AutofillHint("POSTAL_CODE", 9);

        public static final class Companion extends h<AutofillHint> {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @z
            public void toJson(@NotNull t tVar, AutofillHint autofillHint) {
            }

            private Companion() {
            }

            @f
            public AutofillHint m280fromJson(@NotNull m mVar) {
                Object objM0 = mVar.M0();
                if (Intrinsics.b(objM0, "name")) {
                    return AutofillHint.NAME;
                }
                if (Intrinsics.b(objM0, "name_first")) {
                    return AutofillHint.NAME_FIRST;
                }
                if (Intrinsics.b(objM0, "name_middle")) {
                    return AutofillHint.NAME_MIDDLE;
                }
                if (Intrinsics.b(objM0, "name_last")) {
                    return AutofillHint.NAME_LAST;
                }
                if (Intrinsics.b(objM0, "email")) {
                    return AutofillHint.EMAIL;
                }
                if (Intrinsics.b(objM0, "address_line_1")) {
                    return AutofillHint.ADDRESS_LINE_1;
                }
                if (Intrinsics.b(objM0, "address_line_2")) {
                    return AutofillHint.ADDRESS_LINE_2;
                }
                if (Intrinsics.b(objM0, "city")) {
                    return AutofillHint.CITY;
                }
                if (Intrinsics.b(objM0, "country")) {
                    return AutofillHint.COUNTRY;
                }
                if (Intrinsics.b(objM0, "postal_code")) {
                    return AutofillHint.POSTAL_CODE;
                }
                return null;
            }
        }

        private static final AutofillHint[] $values() {
            return new AutofillHint[]{NAME, NAME_FIRST, NAME_MIDDLE, NAME_LAST, EMAIL, ADDRESS_LINE_1, ADDRESS_LINE_2, CITY, COUNTRY, POSTAL_CODE};
        }

        static {
            AutofillHint[] autofillHintArr$values = $values();
            $VALUES = autofillHintArr$values;
            $ENTRIES = b.a(autofillHintArr$values);
            Companion = new Companion(null);
        }

        private AutofillHint(String str, int i) {
        }

        @NotNull
        public static T9.a<AutofillHint> getEntries() {
            return $ENTRIES;
        }

        public static AutofillHint valueOf(String str) {
            return (AutofillHint) Enum.valueOf(AutofillHint.class, str);
        }

        public static AutofillHint[] values() {
            return (AutofillHint[]) $VALUES.clone();
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<InputText> {
        @Override
        @NotNull
        public final InputText createFromParcel(@NotNull Parcel parcel) {
            return new InputText(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputTextBasedComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final InputText[] newArray(int i) {
            return new InputText[i];
        }
    }

    @i(generateAdapter = false)
    public static final class InputType {
        private static final T9.a $ENTRIES;
        private static final InputType[] $VALUES;

        @NotNull
        public static final Companion Companion;
        public static final InputType TEXT = new InputType("TEXT", 0);
        public static final InputType EMAIL = new InputType("EMAIL", 1);
        public static final InputType NUMBER_PAD = new InputType("NUMBER_PAD", 2);

        public static final class Companion extends h<InputType> {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @z
            public void toJson(@NotNull t tVar, InputType inputType) {
            }

            private Companion() {
            }

            @f
            @NotNull
            public InputType m281fromJson(@NotNull m mVar) {
                Object objM0 = mVar.M0();
                return Intrinsics.b(objM0, Text.type) ? InputType.TEXT : Intrinsics.b(objM0, "email") ? InputType.EMAIL : Intrinsics.b(objM0, "number_pad") ? InputType.NUMBER_PAD : InputType.TEXT;
            }
        }

        private static final InputType[] $values() {
            return new InputType[]{TEXT, EMAIL, NUMBER_PAD};
        }

        static {
            InputType[] inputTypeArr$values = $values();
            $VALUES = inputTypeArr$values;
            $ENTRIES = b.a(inputTypeArr$values);
            Companion = new Companion(null);
        }

        private InputType(String str, int i) {
        }

        @NotNull
        public static T9.a<InputType> getEntries() {
            return $ENTRIES;
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    public InputText(@NotNull String str, Attributes attributes, InputTextBasedComponentStyle inputTextBasedComponentStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = inputTextBasedComponentStyle;
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

    public final InputTextBasedComponentStyle getStyles() {
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
        InputTextBasedComponentStyle inputTextBasedComponentStyle = this.styles;
        if (inputTextBasedComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputTextBasedComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public Attributes getAttributes() {
        return this.attributes;
    }
}
