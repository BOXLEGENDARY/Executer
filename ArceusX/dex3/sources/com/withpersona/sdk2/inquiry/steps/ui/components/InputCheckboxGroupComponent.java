package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.g;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ka.C0730g;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.L;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n9.InterfaceC0684l;
import n9.InterfaceC0689q;
import n9.o0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R&\u00101\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b,\u0010.R(\u0010:\u001a\u0002028\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b3\u00104\u0012\u0004\b9\u00100\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u0010>\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0016\u0010@\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=¨\u0006A"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ln9/l;", "Ln9/q;", "Ln9/o0;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;", "config", "", "", "value", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;Ljava/util/Set;)V", "newValue", "k", "(Ljava/util/Set;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;Ljava/util/Set;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;", "e", "Ljava/util/Set;", "g", "()Ljava/util/Set;", "", "Lu9/a;", "i", "Ljava/util/List;", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lo9/g;", "v", "Lo9/g;", "b", "()Lo9/g;", "h", "(Lo9/g;)V", "getStringSetController$annotations", "stringSetController", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "getDisabled", "disabled", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class InputCheckboxGroupComponent implements UiComponent, InterfaceC0684l, InterfaceC0689q, o0<InputCheckboxGroupComponent> {

    @NotNull
    public static final Parcelable.Creator<InputCheckboxGroupComponent> CREATOR = new a();

    @NotNull
    private final InputCheckboxGroup config;

    @NotNull
    private final Set<String> value;

    @NotNull
    private final List<u9.a> associatedViews;

    @NotNull
    private C0730g stringSetController;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputCheckboxGroupComponent> {
        @Override
        @NotNull
        public final InputCheckboxGroupComponent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            InputCheckboxGroup inputCheckboxGroup = (InputCheckboxGroup) parcel.readParcelable(InputCheckboxGroupComponent.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(parcel.readString());
            }
            return new InputCheckboxGroupComponent(inputCheckboxGroup, linkedHashSet);
        }

        @Override
        @NotNull
        public final InputCheckboxGroupComponent[] newArray(int i) {
            return new InputCheckboxGroupComponent[i];
        }
    }

    public InputCheckboxGroupComponent(@NotNull InputCheckboxGroup inputCheckboxGroup, @NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(inputCheckboxGroup, "config");
        Intrinsics.checkNotNullParameter(set, "value");
        this.config = inputCheckboxGroup;
        this.value = set;
        this.associatedViews = new ArrayList();
        this.stringSetController = new C0730g(set);
    }

    public static InputCheckboxGroupComponent d(InputCheckboxGroupComponent inputCheckboxGroupComponent, InputCheckboxGroup inputCheckboxGroup, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            inputCheckboxGroup = inputCheckboxGroupComponent.config;
        }
        if ((i & 2) != 0) {
            set = inputCheckboxGroupComponent.value;
        }
        return inputCheckboxGroupComponent.c(inputCheckboxGroup, set);
    }

    @g(ignore = true)
    public static void getStringSetController$annotations() {
    }

    @Override
    @NotNull
    public C0730g getStringSetController() {
        return this.stringSetController;
    }

    @NotNull
    public final InputCheckboxGroupComponent c(@NotNull InputCheckboxGroup config, @NotNull Set<String> value) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(value, "value");
        return new InputCheckboxGroupComponent(config, value);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputCheckboxGroupComponent)) {
            return false;
        }
        InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) other;
        return Intrinsics.b(this.config, inputCheckboxGroupComponent.config) && Intrinsics.b(this.value, inputCheckboxGroupComponent.value);
    }

    @Override
    @NotNull
    public InputCheckboxGroup e() {
        return this.config;
    }

    @NotNull
    public final Set<String> g() {
        return this.value;
    }

    @Override
    public JsonLogicBoolean getDisabled() {
        InputCheckboxGroup.Attributes attributes = e().getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override
    public JsonLogicBoolean getHidden() {
        InputCheckboxGroup.Attributes attributes = e().getAttributes();
        if (attributes != null) {
            return attributes.getHidden();
        }
        return null;
    }

    @Override
    @NotNull
    public String getName() {
        return UiComponent.a.a(this);
    }

    public void h(@NotNull C0730g c0730g) {
        Intrinsics.checkNotNullParameter(c0730g, "<set-?>");
        this.stringSetController = c0730g;
    }

    public int hashCode() {
        return (this.config.hashCode() * 31) + this.value.hashCode();
    }

    @Override
    @NotNull
    public List<u9.a> i() {
        return this.associatedViews;
    }

    @Override
    @NotNull
    public InputCheckboxGroupComponent a(@NotNull Set<String> newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        InputCheckboxGroupComponent inputCheckboxGroupComponentD = d(this, null, newValue, 1, null);
        inputCheckboxGroupComponentD.h(getStringSetController());
        return inputCheckboxGroupComponentD;
    }

    @NotNull
    public String toString() {
        return "InputCheckboxGroupComponent(config=" + this.config + ", value=" + this.value + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.config, flags);
        Set<String> set = this.value;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
    }

    public InputCheckboxGroupComponent(InputCheckboxGroup inputCheckboxGroup, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        InputCheckboxGroup.Attributes attributes;
        List<String> prefill;
        if ((i & 2) != 0 && ((attributes = inputCheckboxGroup.getAttributes()) == null || (prefill = attributes.getPrefill()) == null || (set = CollectionsKt.v0(prefill)) == null)) {
            set = L.d();
        }
        this(inputCheckboxGroup, set);
    }
}
