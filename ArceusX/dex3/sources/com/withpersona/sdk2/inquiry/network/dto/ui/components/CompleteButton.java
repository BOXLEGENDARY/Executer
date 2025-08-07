package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCompleteComponentStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class CompleteButton implements Button {

    @NotNull
    public static final String type = "button_complete";
    private final BasicButtonAttributes attributes;

    @NotNull
    private final String name;
    private final ButtonCompleteComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<CompleteButton> CREATOR = new Creator();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<CompleteButton> {
        @Override
        @NotNull
        public final CompleteButton createFromParcel(@NotNull Parcel parcel) {
            return new CompleteButton(parcel.readString(), parcel.readInt() == 0 ? null : BasicButtonAttributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonCompleteComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final CompleteButton[] newArray(int i) {
            return new CompleteButton[i];
        }
    }

    public CompleteButton(@NotNull String str, BasicButtonAttributes basicButtonAttributes, ButtonCompleteComponentStyle buttonCompleteComponentStyle) {
        this.name = str;
        this.attributes = basicButtonAttributes;
        this.styles = buttonCompleteComponentStyle;
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
        ButtonCompleteComponentStyle buttonCompleteComponentStyle = this.styles;
        if (buttonCompleteComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonCompleteComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public ButtonCompleteComponentStyle getStyles() {
        return this.styles;
    }

    @Override
    public BasicButtonAttributes getAttributes() {
        return this.attributes;
    }

    public CompleteButton(String str, BasicButtonAttributes basicButtonAttributes, ButtonCompleteComponentStyle buttonCompleteComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, basicButtonAttributes, (i & 4) != 0 ? null : buttonCompleteComponentStyle);
    }
}
