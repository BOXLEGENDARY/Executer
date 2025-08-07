package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.g;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.ArrayList;
import java.util.List;
import ka.C0731h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n9.InterfaceC0684l;
import n9.InterfaceC0689q;
import n9.j0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R&\u00100\u001a\b\u0012\u0004\u0012\u00020*0)8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b+\u0010-R(\u00109\u001a\u0002018\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b2\u00103\u0012\u0004\b8\u0010/\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u0010=\u001a\u0004\u0018\u00010:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010?\u001a\u0004\u0018\u00010:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<¨\u0006@"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ln9/j0;", "Ln9/l;", "Ln9/q;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;", "config", "", "value", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;Z)V", "newValue", "h", "(Z)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;Z)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;", "e", "Z", "getValue", "()Z", "", "Lu9/a;", "i", "Ljava/util/List;", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lo9/h;", "v", "Lo9/h;", "b", "()Lo9/h;", "g", "(Lo9/h;)V", "getTwoStateViewController$annotations", "twoStateViewController", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "getDisabled", "disabled", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class InputCheckboxComponent implements UiComponent, j0<InputCheckboxComponent>, InterfaceC0684l, InterfaceC0689q {

    @NotNull
    public static final Parcelable.Creator<InputCheckboxComponent> CREATOR = new a();

    @NotNull
    private final InputCheckbox config;

    private final boolean value;

    @NotNull
    private final List<u9.a> associatedViews;

    @NotNull
    private C0731h twoStateViewController;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputCheckboxComponent> {
        @Override
        @NotNull
        public final InputCheckboxComponent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputCheckboxComponent((InputCheckbox) parcel.readParcelable(InputCheckboxComponent.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override
        @NotNull
        public final InputCheckboxComponent[] newArray(int i) {
            return new InputCheckboxComponent[i];
        }
    }

    public InputCheckboxComponent(@NotNull InputCheckbox inputCheckbox, boolean z) {
        Intrinsics.checkNotNullParameter(inputCheckbox, "config");
        this.config = inputCheckbox;
        this.value = z;
        this.associatedViews = new ArrayList();
        this.twoStateViewController = new C0731h(z);
    }

    public static InputCheckboxComponent d(InputCheckboxComponent inputCheckboxComponent, InputCheckbox inputCheckbox, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            inputCheckbox = inputCheckboxComponent.config;
        }
        if ((i & 2) != 0) {
            z = inputCheckboxComponent.value;
        }
        return inputCheckboxComponent.c(inputCheckbox, z);
    }

    @g(ignore = true)
    public static void getTwoStateViewController$annotations() {
    }

    @Override
    @NotNull
    public C0731h getTwoStateViewController() {
        return this.twoStateViewController;
    }

    @NotNull
    public final InputCheckboxComponent c(@NotNull InputCheckbox config, boolean value) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new InputCheckboxComponent(config, value);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputCheckboxComponent)) {
            return false;
        }
        InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) other;
        return Intrinsics.b(this.config, inputCheckboxComponent.config) && this.value == inputCheckboxComponent.value;
    }

    @Override
    @NotNull
    public InputCheckbox e() {
        return this.config;
    }

    public void g(@NotNull C0731h c0731h) {
        Intrinsics.checkNotNullParameter(c0731h, "<set-?>");
        this.twoStateViewController = c0731h;
    }

    @Override
    public JsonLogicBoolean getDisabled() {
        InputCheckbox.Attributes attributes = e().getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override
    public JsonLogicBoolean getHidden() {
        InputCheckbox.Attributes attributes = e().getAttributes();
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

    @Override
    @NotNull
    public InputCheckboxComponent a(boolean newValue) {
        InputCheckboxComponent inputCheckboxComponentD = d(this, null, newValue, 1, null);
        inputCheckboxComponentD.g(getTwoStateViewController());
        return inputCheckboxComponentD;
    }

    public int hashCode() {
        return (this.config.hashCode() * 31) + Boolean.hashCode(this.value);
    }

    @Override
    @NotNull
    public List<u9.a> i() {
        return this.associatedViews;
    }

    @NotNull
    public String toString() {
        return "InputCheckboxComponent(config=" + this.config + ", value=" + this.value + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.config, flags);
        parcel.writeInt(this.value ? 1 : 0);
    }

    public InputCheckboxComponent(InputCheckbox inputCheckbox, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean prefill;
        if ((i & 2) != 0) {
            InputCheckbox.Attributes attributes = inputCheckbox.getAttributes();
            z = (attributes == null || (prefill = attributes.getPrefill()) == null) ? false : prefill.booleanValue();
        }
        this(inputCheckbox, z);
    }
}
