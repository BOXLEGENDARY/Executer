package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class Option implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Option> CREATOR = new Creator();

    @NotNull
    private final String text;

    @NotNull
    private final String value;

    public static final class Creator implements Parcelable.Creator<Option> {
        @Override
        @NotNull
        public final Option createFromParcel(@NotNull Parcel parcel) {
            return new Option(parcel.readString(), parcel.readString());
        }

        @Override
        @NotNull
        public final Option[] newArray(int i) {
            return new Option[i];
        }
    }

    public Option(@NotNull String str, @NotNull String str2) {
        this.text = str;
        this.value = str2;
    }

    @Override
    public int describeContents() {
        return 0;
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
    }
}
