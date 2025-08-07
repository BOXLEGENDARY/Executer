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
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class QRCode implements UiComponentConfig {

    @NotNull
    public static final String type = "qr_code";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final QRCodeComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<QRCode> CREATOR = new Creator();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<QRCode> {
        @Override
        @NotNull
        public final QRCode createFromParcel(@NotNull Parcel parcel) {
            return new QRCode(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? QRCodeComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final QRCode[] newArray(int i) {
            return new QRCode[i];
        }
    }

    @i(generateAdapter = true)
    public static final class QRCodeComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<QRCodeComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.QRCodeFillColorStyle fillColor;
        private final AttributeStyles.QRCodeJustifyStyle justify;
        private final AttributeStyles.QRCodeMarginStyle margin;
        private final AttributeStyles.QRCodeStrokeColorStyle strokeColor;
        private final AttributeStyles.QRCodeWidthStyle width;

        public static final class Creator implements Parcelable.Creator<QRCodeComponentStyle> {
            @Override
            @NotNull
            public final QRCodeComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new QRCodeComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.QRCodeWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.QRCodeJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.QRCodeMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.QRCodeStrokeColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.QRCodeFillColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final QRCodeComponentStyle[] newArray(int i) {
                return new QRCodeComponentStyle[i];
            }
        }

        public QRCodeComponentStyle(AttributeStyles.QRCodeWidthStyle qRCodeWidthStyle, AttributeStyles.QRCodeJustifyStyle qRCodeJustifyStyle, AttributeStyles.QRCodeMarginStyle qRCodeMarginStyle, AttributeStyles.QRCodeStrokeColorStyle qRCodeStrokeColorStyle, AttributeStyles.QRCodeFillColorStyle qRCodeFillColorStyle) {
            this.width = qRCodeWidthStyle;
            this.justify = qRCodeJustifyStyle;
            this.margin = qRCodeMarginStyle;
            this.strokeColor = qRCodeStrokeColorStyle;
            this.fillColor = qRCodeFillColorStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.QRCodeFillColorStyle getFillColor() {
            return this.fillColor;
        }

        public final AttributeStyles.QRCodeJustifyStyle getJustify() {
            return this.justify;
        }

        public final AttributeStyles.QRCodeMarginStyle getMargin() {
            return this.margin;
        }

        public final AttributeStyles.QRCodeStrokeColorStyle getStrokeColor() {
            return this.strokeColor;
        }

        public final AttributeStyles.QRCodeWidthStyle getWidth() {
            return this.width;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            AttributeStyles.QRCodeWidthStyle qRCodeWidthStyle = this.width;
            if (qRCodeWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                qRCodeWidthStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.QRCodeJustifyStyle qRCodeJustifyStyle = this.justify;
            if (qRCodeJustifyStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                qRCodeJustifyStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.QRCodeMarginStyle qRCodeMarginStyle = this.margin;
            if (qRCodeMarginStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                qRCodeMarginStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.QRCodeStrokeColorStyle qRCodeStrokeColorStyle = this.strokeColor;
            if (qRCodeStrokeColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                qRCodeStrokeColorStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.QRCodeFillColorStyle qRCodeFillColorStyle = this.fillColor;
            if (qRCodeFillColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                qRCodeFillColorStyle.writeToParcel(parcel, i);
            }
        }
    }

    public QRCode(@NotNull String str, Attributes attributes, QRCodeComponentStyle qRCodeComponentStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = qRCodeComponentStyle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public final Integer getFillColor() {
        AttributeStyles.QRCodeFillColorStyle fillColor;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        QRCodeComponentStyle qRCodeComponentStyle = this.styles;
        if (qRCodeComponentStyle == null || (fillColor = qRCodeComponentStyle.getFillColor()) == null || (base = fillColor.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    public final StyleElements.PositionType getJustification() {
        AttributeStyles.QRCodeJustifyStyle justify;
        StyleElements.Position base;
        QRCodeComponentStyle qRCodeComponentStyle = this.styles;
        if (qRCodeComponentStyle == null || (justify = qRCodeComponentStyle.getJustify()) == null || (base = justify.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final StyleElements.SizeSet getMargin() {
        AttributeStyles.QRCodeMarginStyle margin;
        StyleElements.MeasurementSet base;
        QRCodeComponentStyle qRCodeComponentStyle = this.styles;
        if (qRCodeComponentStyle == null || (margin = qRCodeComponentStyle.getMargin()) == null || (base = margin.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override
    @NotNull
    public String getName() {
        return this.name;
    }

    public final Integer getStrokeColor() {
        AttributeStyles.QRCodeStrokeColorStyle strokeColor;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        QRCodeComponentStyle qRCodeComponentStyle = this.styles;
        if (qRCodeComponentStyle == null || (strokeColor = qRCodeComponentStyle.getStrokeColor()) == null || (base = strokeColor.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    public final QRCodeComponentStyle getStyles() {
        return this.styles;
    }

    public final int getWidth() {
        Double dp;
        AttributeStyles.QRCodeWidthStyle width;
        StyleElements.Measurement base;
        QRCodeComponentStyle qRCodeComponentStyle = this.styles;
        StyleElements.Size base2 = (qRCodeComponentStyle == null || (width = qRCodeComponentStyle.getWidth()) == null || (base = width.getBase()) == null) ? null : base.getBase();
        StyleElements.DPSize dPSize = base2 instanceof StyleElements.DPSize ? (StyleElements.DPSize) base2 : null;
        return (int) ((dPSize == null || (dp = dPSize.getDp()) == null) ? C0458f.a(128.0d) : C0458f.a(dp.doubleValue()));
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
        QRCodeComponentStyle qRCodeComponentStyle = this.styles;
        if (qRCodeComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qRCodeComponentStyle.writeToParcel(parcel, i);
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
        private final JsonLogicBoolean hidden;
        private final String value;

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
            this.value = str;
            this.hidden = jsonLogicBoolean;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final String getValue() {
            return this.value;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.value);
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

    public QRCode(String str, Attributes attributes, QRCodeComponentStyle qRCodeComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i & 4) != 0 ? null : qRCodeComponentStyle);
    }
}
