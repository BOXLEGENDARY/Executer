package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import ha.C0458f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class Spacer implements UiComponentConfig {

    @NotNull
    public static final String type = "spacer";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final SpacerComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Spacer> CREATOR = new Creator();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<Spacer> {
        @Override
        @NotNull
        public final Spacer createFromParcel(@NotNull Parcel parcel) {
            return new Spacer(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SpacerComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final Spacer[] newArray(int i) {
            return new Spacer[i];
        }
    }

    @i(generateAdapter = true)
    public static final class SpacerComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SpacerComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.SpacerHeightStyle height;
        private final AttributeStyles.SpacerWidthStyle width;

        public static final class Creator implements Parcelable.Creator<SpacerComponentStyle> {
            @Override
            @NotNull
            public final SpacerComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new SpacerComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.SpacerHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.SpacerWidthStyle.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final SpacerComponentStyle[] newArray(int i) {
                return new SpacerComponentStyle[i];
            }
        }

        public SpacerComponentStyle(AttributeStyles.SpacerHeightStyle spacerHeightStyle, AttributeStyles.SpacerWidthStyle spacerWidthStyle) {
            this.height = spacerHeightStyle;
            this.width = spacerWidthStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.SpacerHeightStyle getHeight() {
            return this.height;
        }

        public final AttributeStyles.SpacerWidthStyle getWidth() {
            return this.width;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            AttributeStyles.SpacerHeightStyle spacerHeightStyle = this.height;
            if (spacerHeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                spacerHeightStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.SpacerWidthStyle spacerWidthStyle = this.width;
            if (spacerWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                spacerWidthStyle.writeToParcel(parcel, i);
            }
        }
    }

    public Spacer(@NotNull String str, Attributes attributes, SpacerComponentStyle spacerComponentStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = spacerComponentStyle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public final int getHeight() {
        String height;
        String strO0;
        Integer intOrNull;
        AttributeStyles.SpacerHeightStyle height2;
        StyleElements.Measurement base;
        StyleElements.Size base2;
        Double dp;
        SpacerComponentStyle spacerComponentStyle = this.styles;
        if (spacerComponentStyle != null && (height2 = spacerComponentStyle.getHeight()) != null && (base = height2.getBase()) != null && (base2 = base.getBase()) != null && (dp = base2.getDp()) != null) {
            return (int) C0458f.a(dp.doubleValue());
        }
        Attributes attributes = getAttributes();
        if (attributes == null || (height = attributes.getHeight()) == null || (strO0 = StringsKt.o0(height, "px")) == null || (intOrNull = StringsKt.toIntOrNull(strO0)) == null) {
            return 1;
        }
        return intOrNull.intValue();
    }

    @Override
    @NotNull
    public String getName() {
        return this.name;
    }

    public final SpacerComponentStyle getStyles() {
        return this.styles;
    }

    public final int getWidth() {
        AttributeStyles.SpacerWidthStyle width;
        StyleElements.Measurement base;
        StyleElements.Size base2;
        Double dp;
        SpacerComponentStyle spacerComponentStyle = this.styles;
        if (spacerComponentStyle == null || (width = spacerComponentStyle.getWidth()) == null || (base = width.getBase()) == null || (base2 = base.getBase()) == null || (dp = base2.getDp()) == null) {
            return 0;
        }
        return (int) C0458f.a(dp.doubleValue());
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
        SpacerComponentStyle spacerComponentStyle = this.styles;
        if (spacerComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spacerComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public Attributes getAttributes() {
        return this.attributes;
    }

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final String height;
        private final JsonLogicBoolean hidden;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(String str, JsonLogicBoolean jsonLogicBoolean) {
            this.height = str;
            this.hidden = jsonLogicBoolean;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final String getHeight() {
            return this.height;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.height);
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                jsonLogicBoolean.writeToParcel(parcel, i);
            }
        }

        public Attributes(String str, JsonLogicBoolean jsonLogicBoolean, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : jsonLogicBoolean);
        }
    }

    public Spacer(String str, Attributes attributes, SpacerComponentStyle spacerComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i & 4) != 0 ? null : spacerComponentStyle);
    }
}
