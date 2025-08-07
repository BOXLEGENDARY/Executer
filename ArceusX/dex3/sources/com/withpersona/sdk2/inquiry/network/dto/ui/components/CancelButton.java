package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class CancelButton implements Button {

    @NotNull
    public static final String type = "button_cancel";
    private final BasicButtonAttributes attributes;

    @NotNull
    private final String name;
    private final ButtonCancelComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<CancelButton> CREATOR = new Creator();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<CancelButton> {
        @Override
        @NotNull
        public final CancelButton createFromParcel(@NotNull Parcel parcel) {
            return new CancelButton(parcel.readString(), parcel.readInt() == 0 ? null : BasicButtonAttributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonCancelComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final CancelButton[] newArray(int i) {
            return new CancelButton[i];
        }
    }

    public CancelButton(@NotNull String str, BasicButtonAttributes basicButtonAttributes, ButtonCancelComponentStyle buttonCancelComponentStyle) {
        this.name = str;
        this.attributes = basicButtonAttributes;
        this.styles = buttonCancelComponentStyle;
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
        ButtonCancelComponentStyle buttonCancelComponentStyle = this.styles;
        if (buttonCancelComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonCancelComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public ButtonCancelComponentStyle getStyles() {
        return this.styles;
    }

    @Override
    public BasicButtonAttributes getAttributes() {
        return this.attributes;
    }
}
