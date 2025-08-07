package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import T9.a;
import T9.b;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.f;
import com.squareup.moshi.g;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.z;
import com.withpersona.sdk2.inquiry.network.dto.RgbaHexColor;
import ha.C0458f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class StyleElements {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @i(generateAdapter = false)
    public static final class Axis {
        private static final a $ENTRIES;
        private static final Axis[] $VALUES;

        @NotNull
        public static final Companion Companion;
        public static final Axis HORIZONTAL = new Axis("HORIZONTAL", 0);
        public static final Axis VERTICAL = new Axis("VERTICAL", 1);

        public static final class Companion extends h<Axis> {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @z
            public void toJson(@NotNull t tVar, Axis axis) {
            }

            private Companion() {
            }

            @f
            @NotNull
            public Axis m503fromJson(@NotNull m mVar) {
                Object objM0 = mVar.M0();
                return Intrinsics.b(objM0, "horizontal") ? Axis.HORIZONTAL : Intrinsics.b(objM0, "vertical") ? Axis.VERTICAL : Axis.HORIZONTAL;
            }
        }

        private static final Axis[] $values() {
            return new Axis[]{HORIZONTAL, VERTICAL};
        }

        static {
            Axis[] axisArr$values = $values();
            $VALUES = axisArr$values;
            $ENTRIES = b.a(axisArr$values);
            Companion = new Companion(null);
        }

        private Axis(String str, int i) {
        }

        @NotNull
        public static a<Axis> getEntries() {
            return $ENTRIES;
        }

        public static Axis valueOf(String str) {
            return (Axis) Enum.valueOf(Axis.class, str);
        }

        public static Axis[] values() {
            return (Axis[]) $VALUES.clone();
        }
    }

    @i(generateAdapter = true)
    public static final class AxisContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AxisContainer> CREATOR = new Creator();
        private final Axis base;

        public static final class Creator implements Parcelable.Creator<AxisContainer> {
            @Override
            @NotNull
            public final AxisContainer createFromParcel(@NotNull Parcel parcel) {
                return new AxisContainer(parcel.readInt() == 0 ? null : Axis.valueOf(parcel.readString()));
            }

            @Override
            @NotNull
            public final AxisContainer[] newArray(int i) {
                return new AxisContainer[i];
            }
        }

        public AxisContainer(Axis axis) {
            this.base = axis;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final Axis getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            Axis axis = this.base;
            if (axis == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(axis.name());
            }
        }
    }

    @i(generateAdapter = true)
    public static final class ChildSizes implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ChildSizes> CREATOR = new Creator();
        private final int[] base;

        public static final class Creator implements Parcelable.Creator<ChildSizes> {
            @Override
            @NotNull
            public final ChildSizes createFromParcel(@NotNull Parcel parcel) {
                return new ChildSizes(parcel.createIntArray());
            }

            @Override
            @NotNull
            public final ChildSizes[] newArray(int i) {
                return new ChildSizes[i];
            }
        }

        public ChildSizes(int[] iArr) {
            this.base = iArr;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final int[] getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeIntArray(this.base);
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Double getDoubleFromJsonReader(m mVar) {
            if (mVar.H0() != m.c.B) {
                return Double.valueOf(mVar.K());
            }
            mVar.f1();
            return null;
        }

        public final String getStringFromJsonReader(m mVar) {
            if (mVar.H0() != m.c.B) {
                return mVar.n0();
            }
            mVar.f1();
            return null;
        }

        private Companion() {
        }
    }

    @i(generateAdapter = true)
    public static final class ComplexElementColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ComplexElementColor> CREATOR = new Creator();
        private final SimpleElementColorValue _active;
        private final SimpleElementColorValue _base;
        private final SimpleElementColorValue _disabled;
        private final SimpleElementColorValue _errored;
        private final SimpleElementColorValue _focused;

        public static final class Creator implements Parcelable.Creator<ComplexElementColor> {
            @Override
            @NotNull
            public final ComplexElementColor createFromParcel(@NotNull Parcel parcel) {
                return new ComplexElementColor(parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SimpleElementColorValue.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final ComplexElementColor[] newArray(int i) {
                return new ComplexElementColor[i];
            }
        }

        public ComplexElementColor(@g(name = "base") SimpleElementColorValue simpleElementColorValue, @g(name = "focused") SimpleElementColorValue simpleElementColorValue2, @g(name = "active") SimpleElementColorValue simpleElementColorValue3, @g(name = "disabled") SimpleElementColorValue simpleElementColorValue4, @g(name = "errored") SimpleElementColorValue simpleElementColorValue5) {
            this._base = simpleElementColorValue;
            this._focused = simpleElementColorValue2;
            this._active = simpleElementColorValue3;
            this._disabled = simpleElementColorValue4;
            this._errored = simpleElementColorValue5;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final Integer getActive() {
            SimpleElementColorValue simpleElementColorValue = this._active;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        public final Integer getBase() {
            SimpleElementColorValue simpleElementColorValue = this._base;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        public final Integer getDisabled() {
            SimpleElementColorValue simpleElementColorValue = this._disabled;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        public final Integer getErrored() {
            SimpleElementColorValue simpleElementColorValue = this._errored;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        public final Integer getFocused() {
            SimpleElementColorValue simpleElementColorValue = this._focused;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        public final SimpleElementColorValue get_active() {
            return this._active;
        }

        public final SimpleElementColorValue get_base() {
            return this._base;
        }

        public final SimpleElementColorValue get_disabled() {
            return this._disabled;
        }

        public final SimpleElementColorValue get_errored() {
            return this._errored;
        }

        public final SimpleElementColorValue get_focused() {
            return this._focused;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            SimpleElementColorValue simpleElementColorValue = this._base;
            if (simpleElementColorValue == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColorValue.writeToParcel(parcel, i);
            }
            SimpleElementColorValue simpleElementColorValue2 = this._focused;
            if (simpleElementColorValue2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColorValue2.writeToParcel(parcel, i);
            }
            SimpleElementColorValue simpleElementColorValue3 = this._active;
            if (simpleElementColorValue3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColorValue3.writeToParcel(parcel, i);
            }
            SimpleElementColorValue simpleElementColorValue4 = this._disabled;
            if (simpleElementColorValue4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColorValue4.writeToParcel(parcel, i);
            }
            SimpleElementColorValue simpleElementColorValue5 = this._errored;
            if (simpleElementColorValue5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColorValue5.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = false)
    public static final class DPSize implements Parcelable, Size {
        private final Double dp;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<DPSize> CREATOR = new Creator();

        public static final class Companion extends h<DPSize> {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @z
            public void toJson(@NotNull t tVar, DPSize dPSize) {
            }

            private Companion() {
            }

            @f
            @NotNull
            public DPSize m504fromJson(@NotNull m mVar) {
                Double d;
                Object doubleFromJsonReader = null;
                if (mVar.H0() == m.c.i) {
                    mVar.e();
                    String stringFromJsonReader = null;
                    while (mVar.u()) {
                        String strZ = mVar.Z();
                        if (Intrinsics.b(strZ, "unit")) {
                            stringFromJsonReader = StyleElements.Companion.getStringFromJsonReader(mVar);
                        } else if (Intrinsics.b(strZ, "value")) {
                            doubleFromJsonReader = StyleElements.Companion.getDoubleFromJsonReader(mVar);
                        } else {
                            mVar.f1();
                        }
                    }
                    mVar.j();
                    d = doubleFromJsonReader;
                    doubleFromJsonReader = stringFromJsonReader;
                } else {
                    mVar.f1();
                    d = 0;
                }
                Double dValueOf = d;
                dValueOf = d;
                if (Intrinsics.b(doubleFromJsonReader, "%") && d != 0) {
                    dValueOf = Double.valueOf(C0458f.c(Resources.getSystem().getDisplayMetrics().widthPixels) * (d.doubleValue() / 100.0d));
                }
                return new DPSize(dValueOf);
            }
        }

        public static final class Creator implements Parcelable.Creator<DPSize> {
            @Override
            @NotNull
            public final DPSize createFromParcel(@NotNull Parcel parcel) {
                return new DPSize(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            }

            @Override
            @NotNull
            public final DPSize[] newArray(int i) {
                return new DPSize[i];
            }
        }

        public DPSize(Double d) {
            this.dp = d;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public Double getDp() {
            return this.dp;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            Double d = this.dp;
            if (d == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeDouble(d.doubleValue());
            }
        }
    }

    @i(generateAdapter = false)
    public static final class FontName implements Parcelable {
        private final String fontName;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<FontName> CREATOR = new Creator();

        public static final class Companion extends h<FontName> {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @z
            public void toJson(@NotNull t tVar, FontName fontName) {
            }

            private Companion() {
            }

            @f
            @NotNull
            public FontName m505fromJson(@NotNull m mVar) {
                String stringFromJsonReader = null;
                if (mVar.H0() == m.c.i) {
                    mVar.e();
                    while (mVar.u()) {
                        if (Intrinsics.b(mVar.Z(), "base")) {
                            stringFromJsonReader = StyleElements.Companion.getStringFromJsonReader(mVar);
                        } else {
                            mVar.f1();
                        }
                    }
                    mVar.j();
                } else {
                    mVar.f1();
                }
                return new FontName(stringFromJsonReader);
            }
        }

        public static final class Creator implements Parcelable.Creator<FontName> {
            @Override
            @NotNull
            public final FontName createFromParcel(@NotNull Parcel parcel) {
                return new FontName(parcel.readString());
            }

            @Override
            @NotNull
            public final FontName[] newArray(int i) {
                return new FontName[i];
            }
        }

        public FontName() {
            String str = null;
            this(str, 1, str);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final String getFontName() {
            return this.fontName;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.fontName);
        }

        public FontName(String str) {
            this.fontName = str;
        }

        public FontName(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    @i(generateAdapter = false)
    public static final class FontWeight {
        private static final a $ENTRIES;
        private static final FontWeight[] $VALUES;

        @NotNull
        public static final Companion Companion;
        public static final FontWeight LIGHT = new FontWeight("LIGHT", 0);
        public static final FontWeight NORMAL = new FontWeight("NORMAL", 1);
        public static final FontWeight MEDIUM = new FontWeight("MEDIUM", 2);
        public static final FontWeight BOLD = new FontWeight("BOLD", 3);
        public static final FontWeight HEAVY = new FontWeight("HEAVY", 4);

        public static final class Companion extends h<FontWeight> {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @z
            public void toJson(@NotNull t tVar, FontWeight fontWeight) {
            }

            private Companion() {
            }

            @f
            @NotNull
            public FontWeight m506fromJson(@NotNull m mVar) {
                Object objM0 = mVar.M0();
                return Intrinsics.b(objM0, "light") ? FontWeight.LIGHT : Intrinsics.b(objM0, "normal") ? FontWeight.NORMAL : Intrinsics.b(objM0, "medium") ? FontWeight.MEDIUM : Intrinsics.b(objM0, "bold") ? FontWeight.BOLD : Intrinsics.b(objM0, "heavy") ? FontWeight.HEAVY : FontWeight.NORMAL;
            }
        }

        private static final FontWeight[] $values() {
            return new FontWeight[]{LIGHT, NORMAL, MEDIUM, BOLD, HEAVY};
        }

        static {
            FontWeight[] fontWeightArr$values = $values();
            $VALUES = fontWeightArr$values;
            $ENTRIES = b.a(fontWeightArr$values);
            Companion = new Companion(null);
        }

        private FontWeight(String str, int i) {
        }

        @NotNull
        public static a<FontWeight> getEntries() {
            return $ENTRIES;
        }

        public static FontWeight valueOf(String str) {
            return (FontWeight) Enum.valueOf(FontWeight.class, str);
        }

        public static FontWeight[] values() {
            return (FontWeight[]) $VALUES.clone();
        }
    }

    @i(generateAdapter = true)
    public static final class FontWeightContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FontWeightContainer> CREATOR = new Creator();
        private final FontWeight base;

        public static final class Creator implements Parcelable.Creator<FontWeightContainer> {
            @Override
            @NotNull
            public final FontWeightContainer createFromParcel(@NotNull Parcel parcel) {
                return new FontWeightContainer(parcel.readInt() == 0 ? null : FontWeight.valueOf(parcel.readString()));
            }

            @Override
            @NotNull
            public final FontWeightContainer[] newArray(int i) {
                return new FontWeightContainer[i];
            }
        }

        public FontWeightContainer(FontWeight fontWeight) {
            this.base = fontWeight;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final FontWeight getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            FontWeight fontWeight = this.base;
            if (fontWeight == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(fontWeight.name());
            }
        }
    }

    @i(generateAdapter = true)
    public static final class Measurement implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Measurement> CREATOR = new Creator();
        private final Size base;

        public static final class Creator implements Parcelable.Creator<Measurement> {
            @Override
            @NotNull
            public final Measurement createFromParcel(@NotNull Parcel parcel) {
                return new Measurement((Size) parcel.readParcelable(Measurement.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final Measurement[] newArray(int i) {
                return new Measurement[i];
            }
        }

        public Measurement(Size size) {
            this.base = size;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final Size getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeParcelable(this.base, i);
        }
    }

    @i(generateAdapter = true)
    public static final class MeasurementSet implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<MeasurementSet> CREATOR = new Creator();
        private final SizeSet base;

        public static final class Creator implements Parcelable.Creator<MeasurementSet> {
            @Override
            @NotNull
            public final MeasurementSet createFromParcel(@NotNull Parcel parcel) {
                return new MeasurementSet(parcel.readInt() == 0 ? null : SizeSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final MeasurementSet[] newArray(int i) {
                return new MeasurementSet[i];
            }
        }

        public MeasurementSet(SizeSet sizeSet) {
            this.base = sizeSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final SizeSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            SizeSet sizeSet = this.base;
            if (sizeSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                sizeSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class Position implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Position> CREATOR = new Creator();
        private final PositionType base;

        public static final class Creator implements Parcelable.Creator<Position> {
            @Override
            @NotNull
            public final Position createFromParcel(@NotNull Parcel parcel) {
                return new Position(parcel.readInt() == 0 ? null : PositionType.valueOf(parcel.readString()));
            }

            @Override
            @NotNull
            public final Position[] newArray(int i) {
                return new Position[i];
            }
        }

        public Position(PositionType positionType) {
            this.base = positionType;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final PositionType getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            PositionType positionType = this.base;
            if (positionType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(positionType.name());
            }
        }
    }

    @i(generateAdapter = false)
    public static final class PositionType {
        private static final a $ENTRIES;
        private static final PositionType[] $VALUES;

        @NotNull
        public static final Companion Companion;
        public static final PositionType START = new PositionType("START", 0);
        public static final PositionType CENTER = new PositionType("CENTER", 1);
        public static final PositionType END = new PositionType("END", 2);

        public static final class Companion extends h<PositionType> {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @z
            public void toJson(@NotNull t tVar, PositionType positionType) {
            }

            private Companion() {
            }

            @f
            public PositionType m507fromJson(@NotNull m mVar) {
                Object objM0 = mVar.M0();
                if (Intrinsics.b(objM0, "start")) {
                    return PositionType.START;
                }
                if (Intrinsics.b(objM0, "center")) {
                    return PositionType.CENTER;
                }
                if (Intrinsics.b(objM0, "end")) {
                    return PositionType.END;
                }
                return null;
            }
        }

        private static final PositionType[] $values() {
            return new PositionType[]{START, CENTER, END};
        }

        static {
            PositionType[] positionTypeArr$values = $values();
            $VALUES = positionTypeArr$values;
            $ENTRIES = b.a(positionTypeArr$values);
            Companion = new Companion(null);
        }

        private PositionType(String str, int i) {
        }

        @NotNull
        public static a<PositionType> getEntries() {
            return $ENTRIES;
        }

        public static PositionType valueOf(String str) {
            return (PositionType) Enum.valueOf(PositionType.class, str);
        }

        public static PositionType[] values() {
            return (PositionType[]) $VALUES.clone();
        }
    }

    @i(generateAdapter = true)
    public static final class SimpleElementColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SimpleElementColor> CREATOR = new Creator();
        private final SimpleElementColorValue base;

        public static final class Creator implements Parcelable.Creator<SimpleElementColor> {
            @Override
            @NotNull
            public final SimpleElementColor createFromParcel(@NotNull Parcel parcel) {
                return new SimpleElementColor(parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final SimpleElementColor[] newArray(int i) {
                return new SimpleElementColor[i];
            }
        }

        public SimpleElementColor(SimpleElementColorValue simpleElementColorValue) {
            this.base = simpleElementColorValue;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final SimpleElementColorValue getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            SimpleElementColorValue simpleElementColorValue = this.base;
            if (simpleElementColorValue == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColorValue.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class SimpleElementColorValue implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SimpleElementColorValue> CREATOR = new Creator();
        private final Integer value;

        public static final class Creator implements Parcelable.Creator<SimpleElementColorValue> {
            @Override
            @NotNull
            public final SimpleElementColorValue createFromParcel(@NotNull Parcel parcel) {
                return new SimpleElementColorValue(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override
            @NotNull
            public final SimpleElementColorValue[] newArray(int i) {
                return new SimpleElementColorValue[i];
            }
        }

        public SimpleElementColorValue(@RgbaHexColor Integer num) {
            this.value = num;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final Integer getValue() {
            return this.value;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            int iIntValue;
            Integer num = this.value;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
        }
    }

    public interface Size extends Parcelable {

        @NotNull
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion extends h<Size> {
            static final Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            @z
            public void toJson(@NotNull t tVar, Size size) {
            }

            @f
            @NotNull
            public Size m508fromJson(@NotNull m mVar) {
                Double d;
                Object doubleFromJsonReader = null;
                if (mVar.H0() == m.c.i) {
                    mVar.e();
                    String stringFromJsonReader = null;
                    while (mVar.u()) {
                        String strZ = mVar.Z();
                        if (Intrinsics.b(strZ, "unit")) {
                            stringFromJsonReader = StyleElements.Companion.getStringFromJsonReader(mVar);
                        } else if (Intrinsics.b(strZ, "value")) {
                            doubleFromJsonReader = StyleElements.Companion.getDoubleFromJsonReader(mVar);
                        } else {
                            mVar.f1();
                        }
                    }
                    mVar.j();
                    d = doubleFromJsonReader;
                    doubleFromJsonReader = stringFromJsonReader;
                } else {
                    mVar.f1();
                    d = 0;
                }
                return (!Intrinsics.b(doubleFromJsonReader, "%") || d == 0) ? new DPSize(d) : new PercentSize(d.doubleValue() / 100.0d);
            }
        }

        @i(generateAdapter = true)
        public static final class PercentSize implements Size {

            @NotNull
            public static final Parcelable.Creator<PercentSize> CREATOR = new Creator();
            private final double percent;

            public static final class Creator implements Parcelable.Creator<PercentSize> {
                @Override
                @NotNull
                public final PercentSize createFromParcel(@NotNull Parcel parcel) {
                    return new PercentSize(parcel.readDouble());
                }

                @Override
                @NotNull
                public final PercentSize[] newArray(int i) {
                    return new PercentSize[i];
                }
            }

            public PercentSize(double d) {
                this.percent = d;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public Double getDp() {
                return null;
            }

            public final double getPercent() {
                return this.percent;
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeDouble(this.percent);
            }
        }

        Double getDp();
    }

    @i(generateAdapter = true)
    public static final class SizeSet implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SizeSet> CREATOR = new Creator();
        private final Size bottom;
        private final Size left;
        private final Size right;
        private final Size top;

        public static final class Creator implements Parcelable.Creator<SizeSet> {
            @Override
            @NotNull
            public final SizeSet createFromParcel(@NotNull Parcel parcel) {
                return new SizeSet((Size) parcel.readParcelable(SizeSet.class.getClassLoader()), (Size) parcel.readParcelable(SizeSet.class.getClassLoader()), (Size) parcel.readParcelable(SizeSet.class.getClassLoader()), (Size) parcel.readParcelable(SizeSet.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final SizeSet[] newArray(int i) {
                return new SizeSet[i];
            }
        }

        public SizeSet(Size size, Size size2, Size size3, Size size4) {
            this.top = size;
            this.bottom = size2;
            this.left = size3;
            this.right = size4;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final Size getBottom() {
            return this.bottom;
        }

        public final Size getLeft() {
            return this.left;
        }

        public final Size getRight() {
            return this.right;
        }

        public final Size getTop() {
            return this.top;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeParcelable(this.top, i);
            parcel.writeParcelable(this.bottom, i);
            parcel.writeParcelable(this.left, i);
            parcel.writeParcelable(this.right, i);
        }
    }
}
