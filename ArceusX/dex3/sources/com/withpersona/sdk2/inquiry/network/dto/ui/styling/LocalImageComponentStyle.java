package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class LocalImageComponentStyle implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LocalImageComponentStyle> CREATOR = new Creator();
    private final AttributeStyles.LocalImageFillColorStyle fillColor;
    private final AttributeStyles.LocalImageHeightStyle height;
    private final AttributeStyles.LocalImageJustifyStyle justify;
    private final AttributeStyles.LocalImageMarginStyle margin;
    private final AttributeStyles.LocalImageStrokeColorStyle strokeColor;
    private final AttributeStyles.LocalImageWidthStyle width;

    public static final class Creator implements Parcelable.Creator<LocalImageComponentStyle> {
        @Override
        @NotNull
        public final LocalImageComponentStyle createFromParcel(@NotNull Parcel parcel) {
            return new LocalImageComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.LocalImageStrokeColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.LocalImageFillColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.LocalImageHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.LocalImageWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.LocalImageJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.LocalImageMarginStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final LocalImageComponentStyle[] newArray(int i) {
            return new LocalImageComponentStyle[i];
        }
    }

    public LocalImageComponentStyle() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public final Integer getBackgroundColorValue() {
        StyleElements.SimpleElementColor background;
        StyleElements.SimpleElementColorValue base;
        AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle = this.fillColor;
        if (localImageFillColorStyle == null || (background = localImageFillColorStyle.getBackground()) == null || (base = background.getBase()) == null) {
            return null;
        }
        return base.getValue();
    }

    public final AttributeStyles.LocalImageFillColorStyle getFillColor() {
        return this.fillColor;
    }

    public final Integer getFillColorValue() {
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle = this.fillColor;
        if (localImageFillColorStyle == null || (base = localImageFillColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    public final AttributeStyles.LocalImageHeightStyle getHeight() {
        return this.height;
    }

    public final StyleElements.Size getHeightValue() {
        StyleElements.Measurement base;
        AttributeStyles.LocalImageHeightStyle localImageHeightStyle = this.height;
        if (localImageHeightStyle == null || (base = localImageHeightStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.LocalImageJustifyStyle getJustify() {
        return this.justify;
    }

    public final AttributeStyles.LocalImageMarginStyle getMargin() {
        return this.margin;
    }

    public final StyleElements.SizeSet getMarginValue() {
        StyleElements.MeasurementSet base;
        AttributeStyles.LocalImageMarginStyle localImageMarginStyle = this.margin;
        if (localImageMarginStyle == null || (base = localImageMarginStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.LocalImageStrokeColorStyle getStrokeColor() {
        return this.strokeColor;
    }

    public final Integer getStrokeColorValue() {
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle = this.strokeColor;
        if (localImageStrokeColorStyle == null || (base = localImageStrokeColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    public final AttributeStyles.LocalImageWidthStyle getWidth() {
        return this.width;
    }

    public final StyleElements.Size getWidthValue() {
        StyleElements.Measurement base;
        AttributeStyles.LocalImageWidthStyle localImageWidthStyle = this.width;
        if (localImageWidthStyle == null || (base = localImageWidthStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle = this.strokeColor;
        if (localImageStrokeColorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localImageStrokeColorStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle = this.fillColor;
        if (localImageFillColorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localImageFillColorStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.LocalImageHeightStyle localImageHeightStyle = this.height;
        if (localImageHeightStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localImageHeightStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.LocalImageWidthStyle localImageWidthStyle = this.width;
        if (localImageWidthStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localImageWidthStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.LocalImageJustifyStyle localImageJustifyStyle = this.justify;
        if (localImageJustifyStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localImageJustifyStyle.writeToParcel(parcel, i);
        }
        AttributeStyles.LocalImageMarginStyle localImageMarginStyle = this.margin;
        if (localImageMarginStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localImageMarginStyle.writeToParcel(parcel, i);
        }
    }

    public LocalImageComponentStyle(AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle, AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle, AttributeStyles.LocalImageHeightStyle localImageHeightStyle, AttributeStyles.LocalImageWidthStyle localImageWidthStyle, AttributeStyles.LocalImageJustifyStyle localImageJustifyStyle, AttributeStyles.LocalImageMarginStyle localImageMarginStyle) {
        this.strokeColor = localImageStrokeColorStyle;
        this.fillColor = localImageFillColorStyle;
        this.height = localImageHeightStyle;
        this.width = localImageWidthStyle;
        this.justify = localImageJustifyStyle;
        this.margin = localImageMarginStyle;
    }

    public LocalImageComponentStyle(AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle, AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle, AttributeStyles.LocalImageHeightStyle localImageHeightStyle, AttributeStyles.LocalImageWidthStyle localImageWidthStyle, AttributeStyles.LocalImageJustifyStyle localImageJustifyStyle, AttributeStyles.LocalImageMarginStyle localImageMarginStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : localImageStrokeColorStyle, (i & 2) != 0 ? null : localImageFillColorStyle, (i & 4) != 0 ? null : localImageHeightStyle, (i & 8) != 0 ? null : localImageWidthStyle, (i & 16) != 0 ? null : localImageJustifyStyle, (i & 32) != 0 ? null : localImageMarginStyle);
    }
}
