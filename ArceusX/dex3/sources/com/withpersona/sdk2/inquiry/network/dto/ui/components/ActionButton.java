package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonActionComponentStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class ActionButton implements Button {

    @NotNull
    public static final String type = "button_action";
    private final BasicButtonAttributes attributes;

    @NotNull
    private final String name;
    private final ButtonActionComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ActionButton> CREATOR = new Creator();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<ActionButton> {
        @Override
        @NotNull
        public final ActionButton createFromParcel(@NotNull Parcel parcel) {
            return new ActionButton(parcel.readString(), parcel.readInt() == 0 ? null : BasicButtonAttributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonActionComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final ActionButton[] newArray(int i) {
            return new ActionButton[i];
        }
    }

    public ActionButton(@NotNull String str, BasicButtonAttributes basicButtonAttributes, ButtonActionComponentStyle buttonActionComponentStyle) {
        this.name = str;
        this.attributes = basicButtonAttributes;
        this.styles = buttonActionComponentStyle;
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
        ButtonActionComponentStyle buttonActionComponentStyle = this.styles;
        if (buttonActionComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonActionComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public ButtonActionComponentStyle getStyles() {
        return this.styles;
    }

    @Override
    public BasicButtonAttributes getAttributes() {
        return this.attributes;
    }
}
