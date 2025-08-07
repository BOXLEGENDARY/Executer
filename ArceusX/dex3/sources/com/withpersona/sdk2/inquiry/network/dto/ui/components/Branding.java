package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class Branding implements UiComponentConfig {

    @NotNull
    public static final String type = "persona_branding";
    private final Attributes attributes;

    @NotNull
    private final String name;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Branding> CREATOR = new Creator();

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final Boolean hideLogo;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                Boolean boolValueOf;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Attributes(boolValueOf);
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(Boolean bool) {
            this.hideLogo = bool;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final Boolean getHideLogo() {
            return this.hideLogo;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            int iBooleanValue;
            Boolean bool = this.hideLogo;
            if (bool == null) {
                iBooleanValue = 0;
            } else {
                parcel.writeInt(1);
                iBooleanValue = bool.booleanValue();
            }
            parcel.writeInt(iBooleanValue);
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<Branding> {
        @Override
        @NotNull
        public final Branding createFromParcel(@NotNull Parcel parcel) {
            return new Branding(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel));
        }

        @Override
        @NotNull
        public final Branding[] newArray(int i) {
            return new Branding[i];
        }
    }

    public Branding(@NotNull String str, Attributes attributes) {
        this.name = str;
        this.attributes = attributes;
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
    }

    @Override
    public Attributes getAttributes() {
        return this.attributes;
    }
}
