package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.BaseButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonVerifyPersonaComponentStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class VerifyPersonaButton implements Button {

    @NotNull
    public static final String type = "button_verify_with_persona";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final ButtonVerifyPersonaComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<VerifyPersonaButton> CREATOR = new Creator();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<VerifyPersonaButton> {
        @Override
        @NotNull
        public final VerifyPersonaButton createFromParcel(@NotNull Parcel parcel) {
            return new VerifyPersonaButton(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonVerifyPersonaComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final VerifyPersonaButton[] newArray(int i) {
            return new VerifyPersonaButton[i];
        }
    }

    public VerifyPersonaButton(@NotNull String str, Attributes attributes, ButtonVerifyPersonaComponentStyle buttonVerifyPersonaComponentStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = buttonVerifyPersonaComponentStyle;
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
        ButtonVerifyPersonaComponentStyle buttonVerifyPersonaComponentStyle = this.styles;
        if (buttonVerifyPersonaComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonVerifyPersonaComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public ButtonVerifyPersonaComponentStyle getStyles() {
        return this.styles;
    }

    @Override
    public Attributes getAttributes() {
        return this.attributes;
    }

    @i(generateAdapter = true)
    public static final class Attributes implements BaseButtonAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final String autoSubmitCountdownText;
        private final Integer autoSubmitIntervalSeconds;
        private final Button.ButtonType buttonType;
        private final JsonLogicBoolean disabled;
        private final JsonLogicBoolean hidden;

        @NotNull
        private final String text;
        private final String url;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : Button.ButtonType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(@NotNull String str, Button.ButtonType buttonType, String str2, Integer num, String str3, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
            this.text = str;
            this.buttonType = buttonType;
            this.autoSubmitCountdownText = str2;
            this.autoSubmitIntervalSeconds = num;
            this.url = str3;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public String getAutoSubmitCountdownText() {
            return this.autoSubmitCountdownText;
        }

        @Override
        public Integer getAutoSubmitIntervalSeconds() {
            return this.autoSubmitIntervalSeconds;
        }

        @Override
        public Button.ButtonType getButtonType() {
            return this.buttonType;
        }

        @Override
        public JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        @Override
        public JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        @Override
        @NotNull
        public String getText() {
            return this.text;
        }

        public final String getUrl() {
            return this.url;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.text);
            Button.ButtonType buttonType = this.buttonType;
            if (buttonType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(buttonType.name());
            }
            parcel.writeString(this.autoSubmitCountdownText);
            Integer num = this.autoSubmitIntervalSeconds;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.url);
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

        public Attributes(String str, Button.ButtonType buttonType, String str2, Integer num, String str3, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, buttonType, str2, num, str3, (i & 32) != 0 ? null : jsonLogicBoolean, (i & 64) != 0 ? null : jsonLogicBoolean2);
        }
    }
}
