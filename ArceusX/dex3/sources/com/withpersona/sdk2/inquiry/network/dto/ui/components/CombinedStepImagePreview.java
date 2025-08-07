package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class CombinedStepImagePreview implements UiComponentConfig {

    @NotNull
    public static final String type = "combined_step/image_preview";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final CombinedStepImagePreviewComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<CombinedStepImagePreview> CREATOR = new Creator();

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                parcel.readInt();
                return new Attributes();
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    @i(generateAdapter = true)
    public static final class CombinedStepImagePreviewComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CombinedStepImagePreviewComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.RemoteImageHeightStyle height;
        private final AttributeStyles.RemoteImageJustifyStyle justify;
        private final AttributeStyles.RemoteImageMarginStyle margin;
        private final AttributeStyles.RemoteImageWidthStyle width;

        public static final class Creator implements Parcelable.Creator<CombinedStepImagePreviewComponentStyle> {
            @Override
            @NotNull
            public final CombinedStepImagePreviewComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new CombinedStepImagePreviewComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.RemoteImageMarginStyle.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final CombinedStepImagePreviewComponentStyle[] newArray(int i) {
                return new CombinedStepImagePreviewComponentStyle[i];
            }
        }

        public CombinedStepImagePreviewComponentStyle(AttributeStyles.RemoteImageHeightStyle remoteImageHeightStyle, AttributeStyles.RemoteImageWidthStyle remoteImageWidthStyle, AttributeStyles.RemoteImageJustifyStyle remoteImageJustifyStyle, AttributeStyles.RemoteImageMarginStyle remoteImageMarginStyle) {
            this.height = remoteImageHeightStyle;
            this.width = remoteImageWidthStyle;
            this.justify = remoteImageJustifyStyle;
            this.margin = remoteImageMarginStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.RemoteImageHeightStyle getHeight() {
            return this.height;
        }

        public final StyleElements.Size getHeightValue() {
            StyleElements.Measurement base;
            AttributeStyles.RemoteImageHeightStyle remoteImageHeightStyle = this.height;
            if (remoteImageHeightStyle == null || (base = remoteImageHeightStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.RemoteImageJustifyStyle getJustify() {
            return this.justify;
        }

        public final AttributeStyles.RemoteImageMarginStyle getMargin() {
            return this.margin;
        }

        public final StyleElements.SizeSet getMarginValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.RemoteImageMarginStyle remoteImageMarginStyle = this.margin;
            if (remoteImageMarginStyle == null || (base = remoteImageMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.RemoteImageWidthStyle getWidth() {
            return this.width;
        }

        public final StyleElements.Size getWidthValue() {
            StyleElements.Measurement base;
            AttributeStyles.RemoteImageWidthStyle remoteImageWidthStyle = this.width;
            if (remoteImageWidthStyle == null || (base = remoteImageWidthStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            AttributeStyles.RemoteImageHeightStyle remoteImageHeightStyle = this.height;
            if (remoteImageHeightStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                remoteImageHeightStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.RemoteImageWidthStyle remoteImageWidthStyle = this.width;
            if (remoteImageWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                remoteImageWidthStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.RemoteImageJustifyStyle remoteImageJustifyStyle = this.justify;
            if (remoteImageJustifyStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                remoteImageJustifyStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.RemoteImageMarginStyle remoteImageMarginStyle = this.margin;
            if (remoteImageMarginStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                remoteImageMarginStyle.writeToParcel(parcel, i);
            }
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<CombinedStepImagePreview> {
        @Override
        @NotNull
        public final CombinedStepImagePreview createFromParcel(@NotNull Parcel parcel) {
            return new CombinedStepImagePreview(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CombinedStepImagePreviewComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final CombinedStepImagePreview[] newArray(int i) {
            return new CombinedStepImagePreview[i];
        }
    }

    public CombinedStepImagePreview(@NotNull String str, Attributes attributes, CombinedStepImagePreviewComponentStyle combinedStepImagePreviewComponentStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = combinedStepImagePreviewComponentStyle;
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

    public final CombinedStepImagePreviewComponentStyle getStyles() {
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
        CombinedStepImagePreviewComponentStyle combinedStepImagePreviewComponentStyle = this.styles;
        if (combinedStepImagePreviewComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            combinedStepImagePreviewComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public Attributes getAttributes() {
        return this.attributes;
    }

    public CombinedStepImagePreview(String str, Attributes attributes, CombinedStepImagePreviewComponentStyle combinedStepImagePreviewComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i & 4) != 0 ? null : combinedStepImagePreviewComponentStyle);
    }
}
