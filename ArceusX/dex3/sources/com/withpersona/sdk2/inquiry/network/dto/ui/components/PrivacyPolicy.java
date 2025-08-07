package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class PrivacyPolicy implements UiComponentConfig {

    @NotNull
    public static final String type = "privacy_policy";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final TextBasedComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<PrivacyPolicy> CREATOR = new Creator();

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();

        @NotNull
        private final String text;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                return new Attributes(parcel.readString());
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(@NotNull String str) {
            this.text = str;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.text);
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<PrivacyPolicy> {
        @Override
        @NotNull
        public final PrivacyPolicy createFromParcel(@NotNull Parcel parcel) {
            return new PrivacyPolicy(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TextBasedComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final PrivacyPolicy[] newArray(int i) {
            return new PrivacyPolicy[i];
        }
    }

    public PrivacyPolicy(@NotNull String str, Attributes attributes, TextBasedComponentStyle textBasedComponentStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = textBasedComponentStyle;
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

    public final TextBasedComponentStyle getStyles() {
        return this.styles;
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
        TextBasedComponentStyle textBasedComponentStyle = this.styles;
        if (textBasedComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textBasedComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public Attributes getAttributes() {
        return this.attributes;
    }
}
