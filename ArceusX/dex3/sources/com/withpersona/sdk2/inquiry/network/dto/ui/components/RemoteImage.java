package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import T9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.z;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class RemoteImage implements UiComponentConfig {

    @NotNull
    public static final String type = "image_remote";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final RemoteImageComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<RemoteImage> CREATOR = new Creator();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @i(generateAdapter = false)
    public static final class ContentType {
        private static final T9.a $ENTRIES;
        private static final ContentType[] $VALUES;

        @NotNull
        public static final Companion Companion;
        public static final ContentType JSON = new ContentType("JSON", 0);
        public static final ContentType SVG = new ContentType("SVG", 1);
        public static final ContentType Image = new ContentType("Image", 2);

        public static final class Companion extends h<ContentType> {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @z
            public void toJson(@NotNull t tVar, ContentType contentType) {
            }

            private Companion() {
            }

            @f
            @NotNull
            public ContentType m295fromJson(@NotNull m mVar) {
                Object objM0 = mVar.M0();
                return Intrinsics.b(objM0, "application/json") ? ContentType.JSON : Intrinsics.b(objM0, "image/svg+xml") ? ContentType.SVG : ContentType.Image;
            }
        }

        private static final ContentType[] $values() {
            return new ContentType[]{JSON, SVG, Image};
        }

        static {
            ContentType[] contentTypeArr$values = $values();
            $VALUES = contentTypeArr$values;
            $ENTRIES = b.a(contentTypeArr$values);
            Companion = new Companion(null);
        }

        private ContentType(String str, int i) {
        }

        @NotNull
        public static T9.a<ContentType> getEntries() {
            return $ENTRIES;
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }
    }

    public static final class Creator implements Parcelable.Creator<RemoteImage> {
        @Override
        @NotNull
        public final RemoteImage createFromParcel(@NotNull Parcel parcel) {
            return new RemoteImage(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImageComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final RemoteImage[] newArray(int i) {
            return new RemoteImage[i];
        }
    }

    @i(generateAdapter = true)
    public static final class RemoteImageComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RemoteImageComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.RemoteImageFillColorStyle fillColor;
        private final AttributeStyles.RemoteImageHeightStyle height;
        private final AttributeStyles.RemoteImageJustifyStyle justify;
        private final AttributeStyles.RemoteImageMarginStyle margin;
        private final AttributeStyles.RemoteImageStrokeColorStyle strokeColor;
        private final AttributeStyles.RemoteImageWidthStyle width;

        public static final class Creator implements Parcelable.Creator<RemoteImageComponentStyle> {
            @Override
            @NotNull
            public final RemoteImageComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new RemoteImageComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageStrokeColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.RemoteImageFillColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final RemoteImageComponentStyle[] newArray(int i) {
                return new RemoteImageComponentStyle[i];
            }
        }

        public RemoteImageComponentStyle(AttributeStyles.RemoteImageHeightStyle remoteImageHeightStyle, AttributeStyles.RemoteImageWidthStyle remoteImageWidthStyle, AttributeStyles.RemoteImageJustifyStyle remoteImageJustifyStyle, AttributeStyles.RemoteImageMarginStyle remoteImageMarginStyle, AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle, AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle) {
            this.height = remoteImageHeightStyle;
            this.width = remoteImageWidthStyle;
            this.justify = remoteImageJustifyStyle;
            this.margin = remoteImageMarginStyle;
            this.strokeColor = remoteImageStrokeColorStyle;
            this.fillColor = remoteImageFillColorStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.RemoteImageFillColorStyle getFillColor() {
            return this.fillColor;
        }

        public final AttributeStyles.RemoteImageHeightStyle getHeight() {
            return this.height;
        }

        public final AttributeStyles.RemoteImageJustifyStyle getJustify() {
            return this.justify;
        }

        public final AttributeStyles.RemoteImageMarginStyle getMargin() {
            return this.margin;
        }

        public final Integer getNewBackgroundColorValue() {
            StyleElements.SimpleElementColor background;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (background = remoteImageFillColorStyle.getBackground()) == null || (base = background.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getNewFillColorValue() {
            StyleElements.SimpleElementColor fill;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (fill = remoteImageFillColorStyle.getFill()) == null || (base = fill.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getNewHighlightColorValue() {
            StyleElements.SimpleElementColor highlight;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (highlight = remoteImageFillColorStyle.getHighlight()) == null || (base = highlight.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getNewStrokeColorValue() {
            StyleElements.SimpleElementColor stroke;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle = this.strokeColor;
            if (remoteImageStrokeColorStyle == null || (stroke = remoteImageStrokeColorStyle.getStroke()) == null || (base = stroke.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getOriginalBackgroundColorValue() {
            StyleElements.SimpleElementColor originalBackground;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (originalBackground = remoteImageFillColorStyle.getOriginalBackground()) == null || (base = originalBackground.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getOriginalFillColorValue() {
            StyleElements.SimpleElementColor originalFill;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (originalFill = remoteImageFillColorStyle.getOriginalFill()) == null || (base = originalFill.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getOriginalHighlightColorValue() {
            StyleElements.SimpleElementColor originalHighlight;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (originalHighlight = remoteImageFillColorStyle.getOriginalHighlight()) == null || (base = originalHighlight.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getOriginalStrokeColorValue() {
            StyleElements.SimpleElementColor originalStroke;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle = this.strokeColor;
            if (remoteImageStrokeColorStyle == null || (originalStroke = remoteImageStrokeColorStyle.getOriginalStroke()) == null || (base = originalStroke.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final AttributeStyles.RemoteImageStrokeColorStyle getStrokeColor() {
            return this.strokeColor;
        }

        public final AttributeStyles.RemoteImageWidthStyle getWidth() {
            return this.width;
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
            AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle = this.strokeColor;
            if (remoteImageStrokeColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                remoteImageStrokeColorStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                remoteImageFillColorStyle.writeToParcel(parcel, i);
            }
        }
    }

    public RemoteImage(@NotNull String str, Attributes attributes, RemoteImageComponentStyle remoteImageComponentStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = remoteImageComponentStyle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public final StyleElements.Size getHeight() {
        String height;
        String strZ;
        AttributeStyles.RemoteImageHeightStyle height2;
        StyleElements.Measurement base;
        StyleElements.Size base2;
        RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
        if (remoteImageComponentStyle != null && (height2 = remoteImageComponentStyle.getHeight()) != null && (base = height2.getBase()) != null && (base2 = base.getBase()) != null) {
            return base2;
        }
        Attributes attributes = getAttributes();
        if (attributes == null || (height = attributes.getHeight()) == null || (strZ = StringsKt.z(height, "px", "", false, 4, (Object) null)) == null) {
            return null;
        }
        return new StyleElements.DPSize(Double.valueOf(Double.parseDouble(strZ)));
    }

    public final StyleElements.PositionType getJustification() {
        AttributeStyles.RemoteImageJustifyStyle justify;
        StyleElements.Position base;
        RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
        if (remoteImageComponentStyle == null || (justify = remoteImageComponentStyle.getJustify()) == null || (base = justify.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final StyleElements.SizeSet getMargin() {
        AttributeStyles.RemoteImageMarginStyle margin;
        StyleElements.MeasurementSet base;
        RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
        if (remoteImageComponentStyle == null || (margin = remoteImageComponentStyle.getMargin()) == null || (base = margin.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override
    @NotNull
    public String getName() {
        return this.name;
    }

    public final RemoteImageComponentStyle getStyles() {
        return this.styles;
    }

    public final StyleElements.Size getWidth() {
        String width;
        String strZ;
        AttributeStyles.RemoteImageWidthStyle width2;
        StyleElements.Measurement base;
        StyleElements.Size base2;
        RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
        if (remoteImageComponentStyle != null && (width2 = remoteImageComponentStyle.getWidth()) != null && (base = width2.getBase()) != null && (base2 = base.getBase()) != null) {
            return base2;
        }
        Attributes attributes = getAttributes();
        if (attributes == null || (width = attributes.getWidth()) == null || (strZ = StringsKt.z(width, "px", "", false, 4, (Object) null)) == null) {
            return null;
        }
        return new StyleElements.DPSize(Double.valueOf(Double.parseDouble(strZ)));
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
        RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
        if (remoteImageComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            remoteImageComponentStyle.writeToParcel(parcel, i);
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

        @NotNull
        private final ContentType contentType;
        private final String height;
        private final JsonLogicBoolean hidden;
        private final ContentType localAssetContentType;
        private final String localAssetName;

        @NotNull
        private final String url;
        private final String width;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : ContentType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), ContentType.valueOf(parcel.readString()), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(String str, ContentType contentType, @NotNull String str2, String str3, String str4, @NotNull ContentType contentType2, JsonLogicBoolean jsonLogicBoolean) {
            this.localAssetName = str;
            this.localAssetContentType = contentType;
            this.url = str2;
            this.width = str3;
            this.height = str4;
            this.contentType = contentType2;
            this.hidden = jsonLogicBoolean;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final ContentType getContentType() {
            return this.contentType;
        }

        public final String getHeight() {
            return this.height;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final ContentType getLocalAssetContentType() {
            return this.localAssetContentType;
        }

        public final String getLocalAssetName() {
            return this.localAssetName;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final String getWidth() {
            return this.width;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.localAssetName);
            ContentType contentType = this.localAssetContentType;
            if (contentType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(contentType.name());
            }
            parcel.writeString(this.url);
            parcel.writeString(this.width);
            parcel.writeString(this.height);
            parcel.writeString(this.contentType.name());
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                jsonLogicBoolean.writeToParcel(parcel, i);
            }
        }

        public Attributes(String str, ContentType contentType, String str2, String str3, String str4, ContentType contentType2, JsonLogicBoolean jsonLogicBoolean, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : contentType, str2, str3, str4, (i & 32) != 0 ? ContentType.Image : contentType2, (i & 64) != 0 ? null : jsonLogicBoolean);
        }
    }
}
