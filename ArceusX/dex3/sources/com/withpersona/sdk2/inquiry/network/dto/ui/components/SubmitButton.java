package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class SubmitButton implements Button {

    @NotNull
    public static final String type = "button_submit";
    private final BasicButtonAttributes attributes;

    @NotNull
    private final String name;
    private final ButtonSubmitComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<SubmitButton> CREATOR = new Creator();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<SubmitButton> {
        @Override
        @NotNull
        public final SubmitButton createFromParcel(@NotNull Parcel parcel) {
            return new SubmitButton(parcel.readString(), parcel.readInt() == 0 ? null : BasicButtonAttributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonSubmitComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final SubmitButton[] newArray(int i) {
            return new SubmitButton[i];
        }
    }

    public SubmitButton(@NotNull String str, BasicButtonAttributes basicButtonAttributes, ButtonSubmitComponentStyle buttonSubmitComponentStyle) {
        this.name = str;
        this.attributes = basicButtonAttributes;
        this.styles = buttonSubmitComponentStyle;
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
        BasicButtonAttributes basicButtonAttributes = this.attributes;
        if (basicButtonAttributes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basicButtonAttributes.writeToParcel(parcel, i);
        }
        ButtonSubmitComponentStyle buttonSubmitComponentStyle = this.styles;
        if (buttonSubmitComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonSubmitComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public ButtonSubmitComponentStyle getStyles() {
        return this.styles;
    }

    @Override
    public BasicButtonAttributes getAttributes() {
        return this.attributes;
    }

    public SubmitButton(String str, BasicButtonAttributes basicButtonAttributes, ButtonSubmitComponentStyle buttonSubmitComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, basicButtonAttributes, (i & 4) != 0 ? null : buttonSubmitComponentStyle);
    }
}
