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
public final class ClickableStack implements UiComponentConfig {

    @NotNull
    public static final String TYPE = "clickable_stack";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final ClickableStackComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ClickableStack> CREATOR = new Creator();

    @i(generateAdapter = true)
    public static final class ClickableStackComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ClickableStackComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.ClickableStackAlignmentStyle alignment;
        private final AttributeStyles.ClickableStackAxisStyle axis;
        private final AttributeStyles.ClickableStackBackgroundColorStyle backgroundColor;
        private final AttributeStyles.ClickableStackBorderColorStyle borderColor;
        private final AttributeStyles.ClickableStackBorderRadiusStyle borderRadius;
        private final AttributeStyles.ClickableStackBorderWidthStyle borderWidth;
        private final AttributeStyles.ClickableStackChildSizesStyle childSizes;
        private final AttributeStyles.ClickableStackGapStyle gap;
        private final AttributeStyles.ClickableStackMarginStyle margin;
        private final AttributeStyles.ClickableStackPaddingStyle padding;
        private final AttributeStyles.ClickableStackWidthStyle width;

        public static final class Creator implements Parcelable.Creator<ClickableStackComponentStyle> {
            @Override
            @NotNull
            public final ClickableStackComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new ClickableStackComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackAxisStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackChildSizesStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackAlignmentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackGapStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.ClickableStackWidthStyle.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final ClickableStackComponentStyle[] newArray(int i) {
                return new ClickableStackComponentStyle[i];
            }
        }

        public ClickableStackComponentStyle(AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle, AttributeStyles.ClickableStackBorderWidthStyle clickableStackBorderWidthStyle, AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle, AttributeStyles.ClickableStackBorderRadiusStyle clickableStackBorderRadiusStyle, AttributeStyles.ClickableStackPaddingStyle clickableStackPaddingStyle, AttributeStyles.ClickableStackMarginStyle clickableStackMarginStyle, AttributeStyles.ClickableStackAxisStyle clickableStackAxisStyle, AttributeStyles.ClickableStackChildSizesStyle clickableStackChildSizesStyle, AttributeStyles.ClickableStackAlignmentStyle clickableStackAlignmentStyle, AttributeStyles.ClickableStackGapStyle clickableStackGapStyle, AttributeStyles.ClickableStackWidthStyle clickableStackWidthStyle) {
            this.backgroundColor = clickableStackBackgroundColorStyle;
            this.borderWidth = clickableStackBorderWidthStyle;
            this.borderColor = clickableStackBorderColorStyle;
            this.borderRadius = clickableStackBorderRadiusStyle;
            this.padding = clickableStackPaddingStyle;
            this.margin = clickableStackMarginStyle;
            this.axis = clickableStackAxisStyle;
            this.childSizes = clickableStackChildSizesStyle;
            this.alignment = clickableStackAlignmentStyle;
            this.gap = clickableStackGapStyle;
            this.width = clickableStackWidthStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final Integer getActiveBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = this.backgroundColor;
            if (clickableStackBackgroundColorStyle == null || (base = clickableStackBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getActive();
        }

        public final Integer getActiveBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = this.borderColor;
            if (clickableStackBorderColorStyle == null || (base = clickableStackBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getActive();
        }

        public final AttributeStyles.ClickableStackAlignmentStyle getAlignment() {
            return this.alignment;
        }

        public final StyleElements.PositionType getAlignmentValue() {
            StyleElements.Position base;
            AttributeStyles.ClickableStackAlignmentStyle clickableStackAlignmentStyle = this.alignment;
            if (clickableStackAlignmentStyle == null || (base = clickableStackAlignmentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackAxisStyle getAxis() {
            return this.axis;
        }

        @NotNull
        public final StyleElements.Axis getAxisValue() {
            StyleElements.AxisContainer base;
            StyleElements.Axis base2;
            AttributeStyles.ClickableStackAxisStyle clickableStackAxisStyle = this.axis;
            return (clickableStackAxisStyle == null || (base = clickableStackAxisStyle.getBase()) == null || (base2 = base.getBase()) == null) ? StyleElements.Axis.HORIZONTAL : base2;
        }

        public final AttributeStyles.ClickableStackBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Integer getBaseBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = this.backgroundColor;
            if (clickableStackBackgroundColorStyle == null || (base = clickableStackBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final Integer getBaseBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = this.borderColor;
            if (clickableStackBorderColorStyle == null || (base = clickableStackBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.ClickableStackBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final StyleElements.Size getBorderRadiusValue() {
            StyleElements.Measurement base;
            AttributeStyles.ClickableStackBorderRadiusStyle clickableStackBorderRadiusStyle = this.borderRadius;
            if (clickableStackBorderRadiusStyle == null || (base = clickableStackBorderRadiusStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final StyleElements.SizeSet getBorderWidthValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.ClickableStackBorderWidthStyle clickableStackBorderWidthStyle = this.borderWidth;
            if (clickableStackBorderWidthStyle == null || (base = clickableStackBorderWidthStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackChildSizesStyle getChildSizes() {
            return this.childSizes;
        }

        public final int[] getChildSizesValue() {
            StyleElements.ChildSizes base;
            AttributeStyles.ClickableStackChildSizesStyle clickableStackChildSizesStyle = this.childSizes;
            if (clickableStackChildSizesStyle == null || (base = clickableStackChildSizesStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final Integer getDisabledBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = this.backgroundColor;
            if (clickableStackBackgroundColorStyle == null || (base = clickableStackBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getDisabled();
        }

        public final Integer getDisabledBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = this.borderColor;
            if (clickableStackBorderColorStyle == null || (base = clickableStackBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getDisabled();
        }

        public final AttributeStyles.ClickableStackGapStyle getGap() {
            return this.gap;
        }

        public final StyleElements.Size getGapValue() {
            StyleElements.Measurement base;
            AttributeStyles.ClickableStackGapStyle clickableStackGapStyle = this.gap;
            if (clickableStackGapStyle == null || (base = clickableStackGapStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackMarginStyle getMargin() {
            return this.margin;
        }

        public final StyleElements.SizeSet getMarginValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.ClickableStackMarginStyle clickableStackMarginStyle = this.margin;
            if (clickableStackMarginStyle == null || (base = clickableStackMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackPaddingStyle getPadding() {
            return this.padding;
        }

        public final StyleElements.SizeSet getPaddingValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.ClickableStackPaddingStyle clickableStackPaddingStyle = this.padding;
            if (clickableStackPaddingStyle == null || (base = clickableStackPaddingStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackWidthStyle getWidth() {
            return this.width;
        }

        public final Double getWidthValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ClickableStackWidthStyle clickableStackWidthStyle = this.width;
            if (clickableStackWidthStyle == null || (base = clickableStackWidthStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = this.backgroundColor;
            if (clickableStackBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackBackgroundColorStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.ClickableStackBorderWidthStyle clickableStackBorderWidthStyle = this.borderWidth;
            if (clickableStackBorderWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackBorderWidthStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = this.borderColor;
            if (clickableStackBorderColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackBorderColorStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.ClickableStackBorderRadiusStyle clickableStackBorderRadiusStyle = this.borderRadius;
            if (clickableStackBorderRadiusStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackBorderRadiusStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.ClickableStackPaddingStyle clickableStackPaddingStyle = this.padding;
            if (clickableStackPaddingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackPaddingStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.ClickableStackMarginStyle clickableStackMarginStyle = this.margin;
            if (clickableStackMarginStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackMarginStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.ClickableStackAxisStyle clickableStackAxisStyle = this.axis;
            if (clickableStackAxisStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackAxisStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.ClickableStackChildSizesStyle clickableStackChildSizesStyle = this.childSizes;
            if (clickableStackChildSizesStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackChildSizesStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.ClickableStackAlignmentStyle clickableStackAlignmentStyle = this.alignment;
            if (clickableStackAlignmentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackAlignmentStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.ClickableStackGapStyle clickableStackGapStyle = this.gap;
            if (clickableStackGapStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackGapStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.ClickableStackWidthStyle clickableStackWidthStyle = this.width;
            if (clickableStackWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clickableStackWidthStyle.writeToParcel(parcel, i);
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

    public static final class Creator implements Parcelable.Creator<ClickableStack> {
        @Override
        @NotNull
        public final ClickableStack createFromParcel(@NotNull Parcel parcel) {
            return new ClickableStack(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ClickableStackComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final ClickableStack[] newArray(int i) {
            return new ClickableStack[i];
        }
    }

    public ClickableStack(@NotNull String str, Attributes attributes, ClickableStackComponentStyle clickableStackComponentStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = clickableStackComponentStyle;
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

    public final ClickableStackComponentStyle getStyles() {
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
        ClickableStackComponentStyle clickableStackComponentStyle = this.styles;
        if (clickableStackComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clickableStackComponentStyle.writeToParcel(parcel, i);
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
        private final JsonLogicBoolean disabled;
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
                return new Attributes(arrayList, parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(List<? extends UiComponentConfig> list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
            this.children = list;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final List<UiComponentConfig> getChildren() {
            return this.children;
        }

        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
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
            JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
            if (jsonLogicBoolean2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                jsonLogicBoolean2.writeToParcel(parcel, i);
            }
        }

        public Attributes(List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : jsonLogicBoolean, (i & 4) != 0 ? null : jsonLogicBoolean2);
        }
    }

    public ClickableStack(String str, Attributes attributes, ClickableStackComponentStyle clickableStackComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i & 4) != 0 ? null : clickableStackComponentStyle);
    }
}
