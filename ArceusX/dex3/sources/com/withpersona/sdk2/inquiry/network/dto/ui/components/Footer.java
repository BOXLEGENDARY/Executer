package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class Footer implements UiComponentConfig {

    @NotNull
    public static final String type = "footer";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final FooterComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Footer> CREATOR = new Creator();

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();

        @NotNull
        private final List<UiComponentConfig> children;
        private final Integer firstBelowTheFoldChildIndex;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Attributes.class.getClassLoader()));
                }
                return new Attributes(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final List<UiComponentConfig> getChildren() {
            return this.children;
        }

        public final Integer getFirstBelowTheFoldChildIndex() {
            return this.firstBelowTheFoldChildIndex;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            int iIntValue;
            List<UiComponentConfig> list = this.children;
            parcel.writeInt(list.size());
            Iterator<UiComponentConfig> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
            Integer num = this.firstBelowTheFoldChildIndex;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
        }

        public Attributes(@NotNull List<? extends UiComponentConfig> list, Integer num) {
            this.children = list;
            this.firstBelowTheFoldChildIndex = num;
        }

        public Attributes(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.j() : list, (i & 2) != 0 ? null : num);
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<Footer> {
        @Override
        @NotNull
        public final Footer createFromParcel(@NotNull Parcel parcel) {
            return new Footer(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FooterComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final Footer[] newArray(int i) {
            return new Footer[i];
        }
    }

    @i(generateAdapter = true)
    public static final class FooterComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FooterComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.FooterColorStyle backgroundColor;
        private final AttributeStyles.FooterBorderWidthStyle borderWidth;
        private final AttributeStyles.FooterPaddingStyle padding;

        public static final class Creator implements Parcelable.Creator<FooterComponentStyle> {
            @Override
            @NotNull
            public final FooterComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new FooterComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.FooterColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.FooterPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.FooterBorderWidthStyle.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final FooterComponentStyle[] newArray(int i) {
                return new FooterComponentStyle[i];
            }
        }

        public FooterComponentStyle(AttributeStyles.FooterColorStyle footerColorStyle, AttributeStyles.FooterPaddingStyle footerPaddingStyle, AttributeStyles.FooterBorderWidthStyle footerBorderWidthStyle) {
            this.backgroundColor = footerColorStyle;
            this.padding = footerPaddingStyle;
            this.borderWidth = footerBorderWidthStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.FooterColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final AttributeStyles.FooterBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final AttributeStyles.FooterPaddingStyle getPadding() {
            return this.padding;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            AttributeStyles.FooterColorStyle footerColorStyle = this.backgroundColor;
            if (footerColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                footerColorStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.FooterPaddingStyle footerPaddingStyle = this.padding;
            if (footerPaddingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                footerPaddingStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.FooterBorderWidthStyle footerBorderWidthStyle = this.borderWidth;
            if (footerBorderWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                footerBorderWidthStyle.writeToParcel(parcel, i);
            }
        }
    }

    public Footer(@NotNull String str, Attributes attributes, FooterComponentStyle footerComponentStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = footerComponentStyle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public final Integer getBackgroundColor() {
        AttributeStyles.FooterColorStyle backgroundColor;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        FooterComponentStyle footerComponentStyle = this.styles;
        if (footerComponentStyle == null || (backgroundColor = footerComponentStyle.getBackgroundColor()) == null || (base = backgroundColor.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    public final StyleElements.SizeSet getBorderWidth() {
        AttributeStyles.FooterBorderWidthStyle borderWidth;
        StyleElements.MeasurementSet base;
        FooterComponentStyle footerComponentStyle = this.styles;
        if (footerComponentStyle == null || (borderWidth = footerComponentStyle.getBorderWidth()) == null || (base = borderWidth.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final List<UiComponentConfig> getChildren() {
        Attributes attributes = getAttributes();
        if (attributes != null) {
            return attributes.getChildren();
        }
        return null;
    }

    @Override
    @NotNull
    public String getName() {
        return this.name;
    }

    public final StyleElements.SizeSet getPadding() {
        AttributeStyles.FooterPaddingStyle padding;
        StyleElements.MeasurementSet base;
        FooterComponentStyle footerComponentStyle = this.styles;
        if (footerComponentStyle == null || (padding = footerComponentStyle.getPadding()) == null || (base = padding.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final FooterComponentStyle getStyles() {
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
        FooterComponentStyle footerComponentStyle = this.styles;
        if (footerComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            footerComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public Attributes getAttributes() {
        return this.attributes;
    }

    public Footer(String str, Attributes attributes, FooterComponentStyle footerComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i & 4) != 0 ? null : footerComponentStyle);
    }
}
