package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class InputMultiSelect implements UiComponentConfig {

    @NotNull
    public static final String type = "input_multi_select";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final InputSelectComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InputMultiSelect> CREATOR = new Creator();

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final JsonLogicBoolean disabled;
        private final JsonLogicBoolean hidden;
        private final String label;

        @NotNull
        private final List<Option> options;
        private final String placeholder;
        private final List<String> prefill;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Option.CREATOR.createFromParcel(parcel));
                }
                return new Attributes(arrayListCreateStringArrayList, string, string2, arrayList, parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(List<String> list, String str, String str2, @NotNull List<Option> list2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
            this.prefill = list;
            this.label = str;
            this.placeholder = str2;
            this.options = list2;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final List<Option> getOptions() {
            return this.options;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final List<String> getPrefill() {
            return this.prefill;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeStringList(this.prefill);
            parcel.writeString(this.label);
            parcel.writeString(this.placeholder);
            List<Option> list = this.options;
            parcel.writeInt(list.size());
            Iterator<Option> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
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
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<InputMultiSelect> {
        @Override
        @NotNull
        public final InputMultiSelect createFromParcel(@NotNull Parcel parcel) {
            return new InputMultiSelect(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputSelectComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final InputMultiSelect[] newArray(int i) {
            return new InputMultiSelect[i];
        }
    }

    public InputMultiSelect(@NotNull String str, Attributes attributes, InputSelectComponentStyle inputSelectComponentStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = inputSelectComponentStyle;
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

    public final InputSelectComponentStyle getStyles() {
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
        InputSelectComponentStyle inputSelectComponentStyle = this.styles;
        if (inputSelectComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputSelectComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public Attributes getAttributes() {
        return this.attributes;
    }
}
