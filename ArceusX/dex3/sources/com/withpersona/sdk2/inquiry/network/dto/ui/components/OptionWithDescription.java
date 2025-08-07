package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class OptionWithDescription implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OptionWithDescription> CREATOR = new Creator();
    private final String descriptionText;

    @NotNull
    private final String text;

    @NotNull
    private final String value;

    public static final class Creator implements Parcelable.Creator<OptionWithDescription> {
        @Override
        @NotNull
        public final OptionWithDescription createFromParcel(@NotNull Parcel parcel) {
            return new OptionWithDescription(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override
        @NotNull
        public final OptionWithDescription[] newArray(int i) {
            return new OptionWithDescription[i];
        }
    }

    public OptionWithDescription(@NotNull String str, @NotNull String str2, String str3) {
        this.text = str;
        this.value = str2;
        this.descriptionText = str3;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public final String getDescriptionText() {
        return this.descriptionText;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.value);
        parcel.writeString(this.descriptionText);
    }
}
