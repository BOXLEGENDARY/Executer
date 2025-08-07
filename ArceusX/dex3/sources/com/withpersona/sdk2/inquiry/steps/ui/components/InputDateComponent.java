package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.g;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.ArrayList;
import java.util.List;
import ka.C0725b;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n9.InterfaceC0682j;
import n9.InterfaceC0684l;
import n9.InterfaceC0689q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011R&\u0010/\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b*\u0010,R(\u00108\u001a\u0002008\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b7\u0010.\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0016\u0010<\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010>\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;¨\u0006?"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ln9/j;", "Ln9/l;", "Ln9/q;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;", "config", "", "value", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;Ljava/lang/String;)V", "newDate", "h", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;", "e", "Ljava/lang/String;", "getValue", "", "Lu9/a;", "i", "Ljava/util/List;", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lo9/b;", "v", "Lo9/b;", "b", "()Lo9/b;", "g", "(Lo9/b;)V", "getDateController$annotations", "dateController", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "getDisabled", "disabled", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class InputDateComponent implements UiComponent, InterfaceC0682j<InputDateComponent>, InterfaceC0684l, InterfaceC0689q {

    @NotNull
    public static final Parcelable.Creator<InputDateComponent> CREATOR = new a();

    @NotNull
    private final InputDate config;

    private final String value;

    @NotNull
    private final List<u9.a> associatedViews;

    @NotNull
    private C0725b dateController;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputDateComponent> {
        @Override
        @NotNull
        public final InputDateComponent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputDateComponent((InputDate) parcel.readParcelable(InputDateComponent.class.getClassLoader()), parcel.readString());
        }

        @Override
        @NotNull
        public final InputDateComponent[] newArray(int i) {
            return new InputDateComponent[i];
        }
    }

    public InputDateComponent(@NotNull InputDate inputDate, String str) {
        List<String> textMonths;
        Intrinsics.checkNotNullParameter(inputDate, "config");
        this.config = inputDate;
        this.value = str;
        this.associatedViews = new ArrayList();
        InputDate.Attributes attributes = e().getAttributes();
        String placeholderMonth = attributes != null ? attributes.getPlaceholderMonth() : null;
        InputDate.Attributes attributes2 = e().getAttributes();
        this.dateController = new C0725b(str, placeholderMonth, (attributes2 == null || (textMonths = attributes2.getTextMonths()) == null) ? CollectionsKt.j() : textMonths);
    }

    public static InputDateComponent d(InputDateComponent inputDateComponent, InputDate inputDate, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            inputDate = inputDateComponent.config;
        }
        if ((i & 2) != 0) {
            str = inputDateComponent.value;
        }
        return inputDateComponent.c(inputDate, str);
    }

    @g(ignore = true)
    public static void getDateController$annotations() {
    }

    @Override
    @NotNull
    public C0725b getDateController() {
        return this.dateController;
    }

    @NotNull
    public final InputDateComponent c(@NotNull InputDate config, String value) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new InputDateComponent(config, value);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputDateComponent)) {
            return false;
        }
        InputDateComponent inputDateComponent = (InputDateComponent) other;
        return Intrinsics.b(this.config, inputDateComponent.config) && Intrinsics.b(this.value, inputDateComponent.value);
    }

    @Override
    @NotNull
    public InputDate e() {
        return this.config;
    }

    public void g(@NotNull C0725b c0725b) {
        Intrinsics.checkNotNullParameter(c0725b, "<set-?>");
        this.dateController = c0725b;
    }

    @Override
    public JsonLogicBoolean getDisabled() {
        InputDate.Attributes attributes = e().getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override
    public JsonLogicBoolean getHidden() {
        InputDate.Attributes attributes = e().getAttributes();
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
    public InputDateComponent a(String newDate) {
        InputDateComponent inputDateComponentD = d(this, null, newDate, 1, null);
        inputDateComponentD.g(getDateController());
        return inputDateComponentD;
    }

    public int hashCode() {
        int iHashCode = this.config.hashCode() * 31;
        String str = this.value;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override
    @NotNull
    public List<u9.a> i() {
        return this.associatedViews;
    }

    @NotNull
    public String toString() {
        return "InputDateComponent(config=" + this.config + ", value=" + this.value + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.config, flags);
        parcel.writeString(this.value);
    }

    public InputDateComponent(InputDate inputDate, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            InputDate.Attributes attributes = inputDate.getAttributes();
            str = attributes != null ? attributes.getPrefill() : null;
        }
        this(inputDate, str);
    }
}
