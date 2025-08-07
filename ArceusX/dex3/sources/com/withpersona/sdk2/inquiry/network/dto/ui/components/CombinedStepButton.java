package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCombinedStepComponentStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class CombinedStepButton implements Button {

    @NotNull
    public static final String type = "combined_step/button";
    private final BasicButtonAttributes attributes;

    @NotNull
    private final String name;
    private final ButtonCombinedStepComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<CombinedStepButton> CREATOR = new Creator();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<CombinedStepButton> {
        @Override
        @NotNull
        public final CombinedStepButton createFromParcel(@NotNull Parcel parcel) {
            return new CombinedStepButton(parcel.readString(), parcel.readInt() == 0 ? null : BasicButtonAttributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonCombinedStepComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final CombinedStepButton[] newArray(int i) {
            return new CombinedStepButton[i];
        }
    }

    public CombinedStepButton(@NotNull String str, BasicButtonAttributes basicButtonAttributes, ButtonCombinedStepComponentStyle buttonCombinedStepComponentStyle) {
        this.name = str;
        this.attributes = basicButtonAttributes;
        this.styles = buttonCombinedStepComponentStyle;
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
        ButtonCombinedStepComponentStyle buttonCombinedStepComponentStyle = this.styles;
        if (buttonCombinedStepComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonCombinedStepComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public ButtonCombinedStepComponentStyle getStyles() {
        return this.styles;
    }

    @Override
    public BasicButtonAttributes getAttributes() {
        return this.attributes;
    }

    public CombinedStepButton(String str, BasicButtonAttributes basicButtonAttributes, ButtonCombinedStepComponentStyle buttonCombinedStepComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, basicButtonAttributes, (i & 4) != 0 ? null : buttonCombinedStepComponentStyle);
    }
}
