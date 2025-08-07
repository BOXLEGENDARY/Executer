package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0729f;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n9.InterfaceC0684l;
import n9.InterfaceC0689q;
import n9.S;
import n9.c0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \\2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001PB)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R&\u00106\u001a\b\u0012\u0004\u0012\u000202018\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b3\u0010.\u0012\u0004\b4\u00105\u001a\u0004\b-\u00100R \u0010<\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u00105\u001a\u0004\b9\u0010:R\"\u0010A\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\b@\u00105\u001a\u0004\b?\u0010\u0015R \u0010E\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bB\u0010>\u0012\u0004\bD\u00105\u001a\u0004\bC\u0010\u0015R\"\u0010I\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bF\u0010>\u0012\u0004\bH\u00105\u001a\u0004\bG\u0010\u0015R&\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bJ\u0010.\u0012\u0004\bK\u00105\u001a\u0004\b%\u00100R(\u0010U\u001a\u00020M8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bN\u0010O\u0012\u0004\bT\u00105\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0016\u0010Y\u001a\u0004\u0018\u00010V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0016\u0010[\u001a\u0004\u0018\u00010V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010X¨\u0006]"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ln9/c0;", "Ln9/S;", "Ln9/l;", "Ln9/q;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "styles", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "selectedOptions", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;Ljava/util/List;)V", "p", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;", "l", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "n", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "i", "Ljava/util/List;", "b", "()Ljava/util/List;", "", "Lu9/a;", "v", "getAssociatedViews$annotations", "()V", "associatedViews", "w", "Z", "f", "()Z", "getCanSelectMultipleValues$annotations", "canSelectMultipleValues", "y", "Ljava/lang/String;", "c", "getLabel$annotations", "label", "z", "getName", "getName$annotations", "name", "A", "getPlaceholder", "getPlaceholder$annotations", "placeholder", "B", "getOptions$annotations", "options", "Lo9/f;", "C", "Lo9/f;", "a", "()Lo9/f;", "o", "(Lo9/f;)V", "getSelectedOptionsController$annotations", "selectedOptionsController", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "getDisabled", "disabled", "D", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class InputSelectComponent implements UiComponent, c0<InputSelectComponent>, S, InterfaceC0684l, InterfaceC0689q {

    private final String placeholder;

    @NotNull
    private final List<Option> options;

    @NotNull
    private C0729f selectedOptionsController;

    @NotNull
    private final InputSelect config;

    private final InputSelectComponentStyle styles;

    @NotNull
    private final List<Option> selectedOptions;

    @NotNull
    private final List<u9.a> associatedViews;

    private final boolean canSelectMultipleValues;

    private final String label;

    @NotNull
    private final String name;

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InputSelectComponent> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;", "config", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InputSelectComponent a(@NotNull InputSelect config) {
            List listJ;
            Intrinsics.checkNotNullParameter(config, "config");
            InputSelect.Attributes attributes = config.getAttributes();
            List<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> options = attributes != null ? attributes.getOptions() : null;
            if (options != null) {
                ArrayList<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> arrayList = new ArrayList();
                for (Object obj : options) {
                    String value = ((com.withpersona.sdk2.inquiry.network.dto.ui.components.Option) obj).getValue();
                    InputSelect.Attributes attributes2 = config.getAttributes();
                    if (Intrinsics.b(value, attributes2 != null ? attributes2.getPrefill() : null)) {
                        arrayList.add(obj);
                    }
                }
                listJ = new ArrayList(CollectionsKt.t(arrayList, 10));
                for (com.withpersona.sdk2.inquiry.network.dto.ui.components.Option option : arrayList) {
                    listJ.add(new Option(option.getText(), option.getValue()));
                }
            } else {
                listJ = CollectionsKt.j();
            }
            return new InputSelectComponent(config, config.getStyles(), listJ);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<InputSelectComponent> {
        @Override
        @NotNull
        public final InputSelectComponent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            InputSelect inputSelect = (InputSelect) parcel.readParcelable(InputSelectComponent.class.getClassLoader());
            InputSelectComponentStyle inputSelectComponentStyle = (InputSelectComponentStyle) parcel.readParcelable(InputSelectComponent.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Option.CREATOR.createFromParcel(parcel));
            }
            return new InputSelectComponent(inputSelect, inputSelectComponentStyle, arrayList);
        }

        @Override
        @NotNull
        public final InputSelectComponent[] newArray(int i) {
            return new InputSelectComponent[i];
        }
    }

    public InputSelectComponent(@NotNull InputSelect inputSelect, InputSelectComponentStyle inputSelectComponentStyle, @NotNull List<Option> list) {
        List<Option> listJ;
        List<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> options;
        Intrinsics.checkNotNullParameter(inputSelect, "config");
        Intrinsics.checkNotNullParameter(list, "selectedOptions");
        this.config = inputSelect;
        this.styles = inputSelectComponentStyle;
        this.selectedOptions = list;
        this.associatedViews = new ArrayList();
        InputSelect.Attributes attributes = e().getAttributes();
        this.label = attributes != null ? attributes.getLabel() : null;
        this.name = e().getName();
        InputSelect.Attributes attributes2 = e().getAttributes();
        this.placeholder = attributes2 != null ? attributes2.getPlaceholder() : null;
        InputSelect.Attributes attributes3 = e().getAttributes();
        if (attributes3 == null || (options = attributes3.getOptions()) == null) {
            listJ = CollectionsKt.j();
        } else {
            List<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> list2 = options;
            listJ = new ArrayList<>(CollectionsKt.t(list2, 10));
            for (com.withpersona.sdk2.inquiry.network.dto.ui.components.Option option : list2) {
                listJ.add(new Option(option.getText(), option.getValue()));
            }
        }
        this.options = listJ;
        this.selectedOptionsController = new C0729f(b());
    }

    public static InputSelectComponent k(InputSelectComponent inputSelectComponent, InputSelect inputSelect, InputSelectComponentStyle inputSelectComponentStyle, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            inputSelect = inputSelectComponent.config;
        }
        if ((i & 2) != 0) {
            inputSelectComponentStyle = inputSelectComponent.styles;
        }
        if ((i & 4) != 0) {
            list = inputSelectComponent.selectedOptions;
        }
        return inputSelectComponent.h(inputSelect, inputSelectComponentStyle, list);
    }

    @Override
    @NotNull
    public C0729f getSelectedOptionsController() {
        return this.selectedOptionsController;
    }

    @Override
    @NotNull
    public List<Option> b() {
        return this.selectedOptions;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    @NotNull
    public List<Option> d() {
        return this.options;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputSelectComponent)) {
            return false;
        }
        InputSelectComponent inputSelectComponent = (InputSelectComponent) other;
        return Intrinsics.b(this.config, inputSelectComponent.config) && Intrinsics.b(this.styles, inputSelectComponent.styles) && Intrinsics.b(this.selectedOptions, inputSelectComponent.selectedOptions);
    }

    @Override
    public boolean getCanSelectMultipleValues() {
        return this.canSelectMultipleValues;
    }

    @Override
    public JsonLogicBoolean getDisabled() {
        InputSelect.Attributes attributes = e().getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override
    public JsonLogicBoolean getHidden() {
        InputSelect.Attributes attributes = e().getAttributes();
        if (attributes != null) {
            return attributes.getHidden();
        }
        return null;
    }

    @Override
    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public final InputSelectComponent h(@NotNull InputSelect config, InputSelectComponentStyle styles, @NotNull List<Option> selectedOptions) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        return new InputSelectComponent(config, styles, selectedOptions);
    }

    public int hashCode() {
        int iHashCode = this.config.hashCode() * 31;
        InputSelectComponentStyle inputSelectComponentStyle = this.styles;
        return ((iHashCode + (inputSelectComponentStyle == null ? 0 : inputSelectComponentStyle.hashCode())) * 31) + this.selectedOptions.hashCode();
    }

    @Override
    @NotNull
    public List<u9.a> i() {
        return this.associatedViews;
    }

    @Override
    @NotNull
    public InputSelect e() {
        return this.config;
    }

    @Override
    public InputSelectComponentStyle getStyles() {
        return this.styles;
    }

    public void o(@NotNull C0729f c0729f) {
        Intrinsics.checkNotNullParameter(c0729f, "<set-?>");
        this.selectedOptionsController = c0729f;
    }

    @Override
    @NotNull
    public InputSelectComponent g(@NotNull List<Option> selectedOptions) {
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        InputSelectComponent inputSelectComponentK = k(this, null, null, CollectionsKt.n0(selectedOptions, 1), 3, null);
        inputSelectComponentK.o(getSelectedOptionsController());
        return inputSelectComponentK;
    }

    @NotNull
    public String toString() {
        return "InputSelectComponent(config=" + this.config + ", styles=" + this.styles + ", selectedOptions=" + this.selectedOptions + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.config, flags);
        parcel.writeParcelable(this.styles, flags);
        List<Option> list = this.selectedOptions;
        parcel.writeInt(list.size());
        Iterator<Option> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }
}
