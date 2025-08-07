package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import org.jetbrains.annotations.NotNull;

public final class UnknownComponentConfig implements UiComponentConfig {
    private static final UiComponentAttributes attributes = null;

    @NotNull
    public static final UnknownComponentConfig INSTANCE = new UnknownComponentConfig();

    @NotNull
    private static final String name = "unknown";

    @NotNull
    public static final Parcelable.Creator<UnknownComponentConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UnknownComponentConfig> {
        @Override
        @NotNull
        public final UnknownComponentConfig createFromParcel(@NotNull Parcel parcel) {
            parcel.readInt();
            return UnknownComponentConfig.INSTANCE;
        }

        @Override
        @NotNull
        public final UnknownComponentConfig[] newArray(int i) {
            return new UnknownComponentConfig[i];
        }
    }

    private UnknownComponentConfig() {
    }

    public static void getAttributes$annotations() {
    }

    public static void getName$annotations() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof UnknownComponentConfig);
    }

    @Override
    public UiComponentAttributes getAttributes() {
        return attributes;
    }

    @Override
    @NotNull
    public String getName() {
        return name;
    }

    public int hashCode() {
        return -83559478;
    }

    @NotNull
    public String toString() {
        return "UnknownComponentConfig";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
