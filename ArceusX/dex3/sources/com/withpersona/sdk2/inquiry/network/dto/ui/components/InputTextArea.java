package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class InputTextArea implements UiComponentConfig {

    @NotNull
    public static final String type = "input_text_area";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final InputTextBasedComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InputTextArea> CREATOR = new Creator();

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final JsonLogicBoolean disabled;
        private final JsonLogicBoolean hidden;
        private final String label;
        private final String placeholder;
        private final String prefill;
        private final Integer rows;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                return new Attributes(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(String str, String str2, String str3, Integer num, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
            this.prefill = str;
            this.label = str2;
            this.placeholder = str3;
            this.rows = num;
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

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final String getPrefill() {
            return this.prefill;
        }

        public final Integer getRows() {
            return this.rows;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.prefill);
            parcel.writeString(this.label);
            parcel.writeString(this.placeholder);
            Integer num = this.rows;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
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

    public static final class Creator implements Parcelable.Creator<InputTextArea> {
        @Override
        @NotNull
        public final InputTextArea createFromParcel(@NotNull Parcel parcel) {
            return new InputTextArea(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputTextBasedComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final InputTextArea[] newArray(int i) {
            return new InputTextArea[i];
        }
    }

    public InputTextArea(@NotNull String str, Attributes attributes, InputTextBasedComponentStyle inputTextBasedComponentStyle) {
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
