package com.withpersona.sdk2.inquiry.network.dto.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class BasicButtonAttributes implements BaseButtonAttributes {

    @NotNull
    public static final Parcelable.Creator<BasicButtonAttributes> CREATOR = new Creator();
    private final String autoSubmitCountdownText;
    private final Integer autoSubmitIntervalSeconds;
    private final Button.ButtonType buttonType;
    private final JsonLogicBoolean disabled;
    private final JsonLogicBoolean hidden;

    @NotNull
    private final String text;

    public static final class Creator implements Parcelable.Creator<BasicButtonAttributes> {
        @Override
        @NotNull
        public final BasicButtonAttributes createFromParcel(@NotNull Parcel parcel) {
            return new BasicButtonAttributes(parcel.readString(), parcel.readInt() == 0 ? null : Button.ButtonType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final BasicButtonAttributes[] newArray(int i) {
            return new BasicButtonAttributes[i];
        }
    }

    public BasicButtonAttributes(@NotNull String str, Button.ButtonType buttonType, String str2, Integer num, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        this.text = str;
        this.buttonType = buttonType;
        this.autoSubmitCountdownText = str2;
        this.autoSubmitIntervalSeconds = num;
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

    public BasicButtonAttributes(String str, Button.ButtonType buttonType, String str2, Integer num, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, buttonType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : jsonLogicBoolean, (i & 32) != 0 ? null : jsonLogicBoolean2);
    }
}
