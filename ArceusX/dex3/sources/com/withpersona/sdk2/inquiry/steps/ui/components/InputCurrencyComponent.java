package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.g;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.ArrayList;
import java.util.List;
import ka.C0728e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n9.InterfaceC0684l;
import n9.InterfaceC0689q;
import n9.k0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R&\u00101\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b,\u0010.R(\u0010:\u001a\u0002028\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b3\u00104\u0012\u0004\b9\u00100\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u0010>\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0016\u0010@\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=¨\u0006A"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ln9/k0;", "Ln9/l;", "Ln9/q;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;", "config", "", "value", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;Ljava/lang/Number;)V", "newValue", "k", "(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;", "e", "Ljava/lang/Number;", "g", "()Ljava/lang/Number;", "", "Lu9/a;", "i", "Ljava/util/List;", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lo9/e;", "v", "Lo9/e;", "a", "()Lo9/e;", "h", "(Lo9/e;)V", "getNumberController$annotations", "numberController", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "getDisabled", "disabled", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class InputCurrencyComponent implements UiComponent, k0<InputCurrencyComponent>, InterfaceC0684l, InterfaceC0689q {

    @NotNull
    public static final Parcelable.Creator<InputCurrencyComponent> CREATOR = new a();

    @NotNull
    private final InputCurrency config;

    private final Number value;

    @NotNull
    private final List<u9.a> associatedViews;

    @NotNull
    private C0728e numberController;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputCurrencyComponent> {
        @Override
        @NotNull
        public final InputCurrencyComponent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputCurrencyComponent((InputCurrency) parcel.readParcelable(InputCurrencyComponent.class.getClassLoader()), (Number) parcel.readSerializable());
        }

        @Override
        @NotNull
        public final InputCurrencyComponent[] newArray(int i) {
            return new InputCurrencyComponent[i];
        }
    }

    public InputCurrencyComponent(@NotNull InputCurrency inputCurrency, Number number) {
        Intrinsics.checkNotNullParameter(inputCurrency, "config");
        this.config = inputCurrency;
        this.value = number;
        this.associatedViews = new ArrayList();
        this.numberController = new C0728e(number);
    }

    public static InputCurrencyComponent d(InputCurrencyComponent inputCurrencyComponent, InputCurrency inputCurrency, Number number, int i, Object obj) {
        if ((i & 1) != 0) {
            inputCurrency = inputCurrencyComponent.config;
        }
        if ((i & 2) != 0) {
            number = inputCurrencyComponent.value;
        }
        return inputCurrencyComponent.c(inputCurrency, number);
    }

    @g(ignore = true)
    public static void getNumberController$annotations() {
    }

    @Override
    @NotNull
    public C0728e getNumberController() {
        return this.numberController;
    }

    @NotNull
    public final InputCurrencyComponent c(@NotNull InputCurrency config, Number value) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new InputCurrencyComponent(config, value);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputCurrencyComponent)) {
            return false;
        }
        InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) other;
        return Intrinsics.b(this.config, inputCurrencyComponent.config) && Intrinsics.b(this.value, inputCurrencyComponent.value);
    }

    @Override
    @NotNull
    public InputCurrency e() {
        return this.config;
    }

    public final Number getValue() {
        return this.value;
    }

    @Override
    public JsonLogicBoolean getDisabled() {
        InputCurrency.Attributes attributes = e().getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override
    public JsonLogicBoolean getHidden() {
        InputCurrency.Attributes attributes = e().getAttributes();
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

    public void h(@NotNull C0728e c0728e) {
        Intrinsics.checkNotNullParameter(c0728e, "<set-?>");
        this.numberController = c0728e;
    }

    public int hashCode() {
        int iHashCode = this.config.hashCode() * 31;
        Number number = this.value;
        return iHashCode + (number == null ? 0 : number.hashCode());
    }

    @Override
    @NotNull
    public List<u9.a> i() {
        return this.associatedViews;
    }

    @Override
    @NotNull
    public InputCurrencyComponent b(Number newValue) {
        InputCurrencyComponent inputCurrencyComponentD = d(this, null, newValue, 1, null);
        inputCurrencyComponentD.h(getNumberController());
        return inputCurrencyComponentD;
    }

    @NotNull
    public String toString() {
        return "InputCurrencyComponent(config=" + this.config + ", value=" + this.value + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.config, flags);
        parcel.writeSerializable(this.value);
    }

    public InputCurrencyComponent(InputCurrency inputCurrency, Number number, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            InputCurrency.Attributes attributes = inputCurrency.getAttributes();
            number = attributes != null ? attributes.getPrefill() : null;
        }
        this(inputCurrency, number);
    }
}
