package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class HorizontalStack implements UiComponentConfig {

    @NotNull
    public static final String type = "horizontal_stack";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final HorizontalStackComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<HorizontalStack> CREATOR = new Creator();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<HorizontalStack> {
        @Override
        @NotNull
        public final HorizontalStack createFromParcel(@NotNull Parcel parcel) {
            return new HorizontalStack(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HorizontalStackComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final HorizontalStack[] newArray(int i) {
            return new HorizontalStack[i];
        }
    }

    @i(generateAdapter = true)
    public static final class HorizontalStackComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HorizontalStackComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.HorizontalStackAlignmentStyle alignment;
        private final AttributeStyles.HorizontalStackAxisStyle axis;
        private final AttributeStyles.HorizontalStackBackgroundColorStyle backgroundColor;
        private final AttributeStyles.HorizontalStackBorderColorStyle borderColor;
        private final AttributeStyles.HorizontalStackBorderRadiusStyle borderRadius;
        private final AttributeStyles.HorizontalStackBorderWidthStyle borderWidth;
        private final AttributeStyles.HorizontalStackChildSizesStyle childSizes;
        private final AttributeStyles.HorizontalStackGapStyle gap;
        private final AttributeStyles.HorizontalStackMarginStyle margin;
        private final AttributeStyles.HorizontalStackPaddingStyle padding;
        private final AttributeStyles.HorizontalStackWidthStyle width;

        public static final class Creator implements Parcelable.Creator<HorizontalStackComponentStyle> {
            @Override
            @NotNull
            public final HorizontalStackComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new HorizontalStackComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackAxisStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackChildSizesStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackAlignmentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackGapStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.HorizontalStackWidthStyle.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final HorizontalStackComponentStyle[] newArray(int i) {
                return new HorizontalStackComponentStyle[i];
            }
        }

        public HorizontalStackComponentStyle(AttributeStyles.HorizontalStackBackgroundColorStyle horizontalStackBackgroundColorStyle, AttributeStyles.HorizontalStackBorderWidthStyle horizontalStackBorderWidthStyle, AttributeStyles.HorizontalStackBorderColorStyle horizontalStackBorderColorStyle, AttributeStyles.HorizontalStackBorderRadiusStyle horizontalStackBorderRadiusStyle, AttributeStyles.HorizontalStackPaddingStyle horizontalStackPaddingStyle, AttributeStyles.HorizontalStackMarginStyle horizontalStackMarginStyle, AttributeStyles.HorizontalStackAxisStyle horizontalStackAxisStyle, AttributeStyles.HorizontalStackChildSizesStyle horizontalStackChildSizesStyle, AttributeStyles.HorizontalStackAlignmentStyle horizontalStackAlignmentStyle, AttributeStyles.HorizontalStackGapStyle horizontalStackGapStyle, AttributeStyles.HorizontalStackWidthStyle horizontalStackWidthStyle) {
            this.backgroundColor = horizontalStackBackgroundColorStyle;
            this.borderWidth = horizontalStackBorderWidthStyle;
            this.borderColor = horizontalStackBorderColorStyle;
            this.borderRadius = horizontalStackBorderRadiusStyle;
            this.padding = horizontalStackPaddingStyle;
            this.margin = horizontalStackMarginStyle;
            this.axis = horizontalStackAxisStyle;
            this.childSizes = horizontalStackChildSizesStyle;
            this.alignment = horizontalStackAlignmentStyle;
            this.gap = horizontalStackGapStyle;
            this.width = horizontalStackWidthStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.HorizontalStackAlignmentStyle getAlignment() {
            return this.alignment;
        }

        public final StyleElements.PositionType getAlignmentValue() {
            StyleElements.Position base;
            AttributeStyles.HorizontalStackAlignmentStyle horizontalStackAlignmentStyle = this.alignment;
            if (horizontalStackAlignmentStyle == null || (base = horizontalStackAlignmentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.HorizontalStackAxisStyle getAxis() {
            return this.axis;
        }

        @NotNull
        public final StyleElements.Axis getAxisValue() {
            StyleElements.AxisContainer base;
            StyleElements.Axis base2;
            AttributeStyles.HorizontalStackAxisStyle horizontalStackAxisStyle = this.axis;
            return (horizontalStackAxisStyle == null || (base = horizontalStackAxisStyle.getBase()) == null || (base2 = base.getBase()) == null) ? StyleElements.Axis.HORIZONTAL : base2;
        }

        public final AttributeStyles.HorizontalStackBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Integer getBaseBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            AttributeStyles.HorizontalStackBackgroundColorStyle horizontalStackBackgroundColorStyle = this.backgroundColor;
            if (horizontalStackBackgroundColorStyle == null || (base = horizontalStackBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final Integer getBaseBorderColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            AttributeStyles.HorizontalStackBorderColorStyle horizontalStackBorderColorStyle = this.borderColor;
            if (horizontalStackBorderColorStyle == null || (base = horizontalStackBorderColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final AttributeStyles.HorizontalStackBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.HorizontalStackBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final StyleElements.Size getBorderRadiusValue() {
            StyleElements.Measurement base;
            AttributeStyles.HorizontalStackBorderRadiusStyle horizontalStackBorderRadiusStyle = this.borderRadius;
            if (horizontalStackBorderRadiusStyle == null || (base = horizontalStackBorderRadiusStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.HorizontalStackBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final StyleElements.SizeSet getBorderWidthValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.HorizontalStackBorderWidthStyle horizontalStackBorderWidthStyle = this.borderWidth;
            if (horizontalStackBorderWidthStyle == null || (base = horizontalStackBorderWidthStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.HorizontalStackChildSizesStyle getChildSizes() {
            return this.childSizes;
        }

        public final int[] getChildSizesValue() {
            StyleElements.ChildSizes base;
            AttributeStyles.HorizontalStackChildSizesStyle horizontalStackChildSizesStyle = this.childSizes;
            if (horizontalStackChildSizesStyle == null || (base = horizontalStackChildSizesStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.HorizontalStackGapStyle getGap() {
            return this.gap;
        }

        public final StyleElements.Size getGapValue() {
            StyleElements.Measurement base;
            AttributeStyles.HorizontalStackGapStyle horizontalStackGapStyle = this.gap;
            if (horizontalStackGapStyle == null || (base = horizontalStackGapStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.HorizontalStackMarginStyle getMargin() {
            return this.margin;
        }

        public final StyleElements.SizeSet getMarginValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.HorizontalStackMarginStyle horizontalStackMarginStyle = this.margin;
            if (horizontalStackMarginStyle == null || (base = horizontalStackMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.HorizontalStackPaddingStyle getPadding() {
            return this.padding;
        }

        public final StyleElements.SizeSet getPaddingValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.HorizontalStackPaddingStyle horizontalStackPaddingStyle = this.padding;
            if (horizontalStackPaddingStyle == null || (base = horizontalStackPaddingStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.HorizontalStackWidthStyle getWidth() {
            return this.width;
        }

        public final Double getWidthValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.HorizontalStackWidthStyle horizontalStackWidthStyle = this.width;
            if (horizontalStackWidthStyle == null || (base = horizontalStackWidthStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            AttributeStyles.HorizontalStackBackgroundColorStyle horizontalStackBackgroundColorStyle = this.backgroundColor;
            if (horizontalStackBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackBackgroundColorStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.HorizontalStackBorderWidthStyle horizontalStackBorderWidthStyle = this.borderWidth;
            if (horizontalStackBorderWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackBorderWidthStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.HorizontalStackBorderColorStyle horizontalStackBorderColorStyle = this.borderColor;
            if (horizontalStackBorderColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackBorderColorStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.HorizontalStackBorderRadiusStyle horizontalStackBorderRadiusStyle = this.borderRadius;
            if (horizontalStackBorderRadiusStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackBorderRadiusStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.HorizontalStackPaddingStyle horizontalStackPaddingStyle = this.padding;
            if (horizontalStackPaddingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackPaddingStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.HorizontalStackMarginStyle horizontalStackMarginStyle = this.margin;
            if (horizontalStackMarginStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackMarginStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.HorizontalStackAxisStyle horizontalStackAxisStyle = this.axis;
            if (horizontalStackAxisStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackAxisStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.HorizontalStackChildSizesStyle horizontalStackChildSizesStyle = this.childSizes;
            if (horizontalStackChildSizesStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackChildSizesStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.HorizontalStackAlignmentStyle horizontalStackAlignmentStyle = this.alignment;
            if (horizontalStackAlignmentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackAlignmentStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.HorizontalStackGapStyle horizontalStackGapStyle = this.gap;
            if (horizontalStackGapStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackGapStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.HorizontalStackWidthStyle horizontalStackWidthStyle = this.width;
            if (horizontalStackWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                horizontalStackWidthStyle.writeToParcel(parcel, i);
            }
        }
    }

    public HorizontalStack(@NotNull String str, Attributes attributes, HorizontalStackComponentStyle horizontalStackComponentStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = horizontalStackComponentStyle;
    }

    @Override
    public int describeContents() {
        return 0;
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

    public final HorizontalStackComponentStyle getStyles() {
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
        HorizontalStackComponentStyle horizontalStackComponentStyle = this.styles;
        if (horizontalStackComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            horizontalStackComponentStyle.writeToParcel(parcel, i);
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
        private final List<UiComponentConfig> children;
        private final JsonLogicBoolean hidden;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readParcelable(Attributes.class.getClassLoader()));
                    }
                }
                return new Attributes(arrayList, parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(List<? extends UiComponentConfig> list, JsonLogicBoolean jsonLogicBoolean) {
            this.children = list;
            this.hidden = jsonLogicBoolean;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final List<UiComponentConfig> getChildren() {
            return this.children;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            List<UiComponentConfig> list = this.children;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<UiComponentConfig> it = list.iterator();
                while (it.hasNext()) {
                    parcel.writeParcelable(it.next(), i);
                }
            }
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                jsonLogicBoolean.writeToParcel(parcel, i);
            }
        }

        public Attributes(List list, JsonLogicBoolean jsonLogicBoolean, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : jsonLogicBoolean);
        }
    }

    public HorizontalStack(String str, Attributes attributes, HorizontalStackComponentStyle horizontalStackComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i & 4) != 0 ? null : horizontalStackComponentStyle);
    }
}
