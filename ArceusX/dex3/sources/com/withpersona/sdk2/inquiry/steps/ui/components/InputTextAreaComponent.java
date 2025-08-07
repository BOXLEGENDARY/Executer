package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.g;
import com.squareup.workflow1.ui.r;
import com.squareup.workflow1.ui.u;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n9.InterfaceC0684l;
import n9.InterfaceC0689q;
import n9.l0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011R&\u0010/\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b*\u0010,R(\u00108\u001a\u0002008\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b7\u0010.\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0016\u0010<\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010>\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;¨\u0006?"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ln9/l0;", "Ln9/l;", "Ln9/q;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;", "config", "", "value", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;Ljava/lang/String;)V", "newString", "h", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;", "e", "Ljava/lang/String;", "getValue", "", "Lu9/a;", "i", "Ljava/util/List;", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lcom/squareup/workflow1/ui/r;", "v", "Lcom/squareup/workflow1/ui/r;", "b", "()Lcom/squareup/workflow1/ui/r;", "g", "(Lcom/squareup/workflow1/ui/r;)V", "getTextController$annotations", "textController", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "getDisabled", "disabled", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class InputTextAreaComponent implements UiComponent, l0<InputTextAreaComponent>, InterfaceC0684l, InterfaceC0689q {

    @NotNull
    public static final Parcelable.Creator<InputTextAreaComponent> CREATOR = new a();

    @NotNull
    private final InputTextArea config;

    @NotNull
    private final String value;

    @NotNull
    private final List<u9.a> associatedViews;

    @NotNull
    private r textController;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputTextAreaComponent> {
        @Override
        @NotNull
        public final InputTextAreaComponent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputTextAreaComponent((InputTextArea) parcel.readParcelable(InputTextAreaComponent.class.getClassLoader()), parcel.readString());
        }

        @Override
        @NotNull
        public final InputTextAreaComponent[] newArray(int i) {
            return new InputTextAreaComponent[i];
        }
    }

    public InputTextAreaComponent(@NotNull InputTextArea inputTextArea, @NotNull String str) {
        Intrinsics.checkNotNullParameter(inputTextArea, "config");
        Intrinsics.checkNotNullParameter(str, "value");
        this.config = inputTextArea;
        this.value = str;
        this.associatedViews = new ArrayList();
        this.textController = u.a(str);
    }

    public static InputTextAreaComponent d(InputTextAreaComponent inputTextAreaComponent, InputTextArea inputTextArea, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            inputTextArea = inputTextAreaComponent.config;
        }
        if ((i & 2) != 0) {
            str = inputTextAreaComponent.value;
        }
        return inputTextAreaComponent.c(inputTextArea, str);
    }

    @g(ignore = true)
    public static void getTextController$annotations() {
    }

    @Override
    @NotNull
    public r getTextController() {
        return this.textController;
    }

    @NotNull
    public final InputTextAreaComponent c(@NotNull InputTextArea config, @NotNull String value) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(value, "value");
        return new InputTextAreaComponent(config, value);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputTextAreaComponent)) {
            return false;
        }
        InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) other;
        return Intrinsics.b(this.config, inputTextAreaComponent.config) && Intrinsics.b(this.value, inputTextAreaComponent.value);
    }

    @Override
    @NotNull
    public InputTextArea e() {
        return this.config;
    }

    public void g(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.textController = rVar;
    }

    @Override
    public JsonLogicBoolean getDisabled() {
        InputTextArea.Attributes attributes = e().getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override
    public JsonLogicBoolean getHidden() {
        InputTextArea.Attributes attributes = e().getAttributes();
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
    public InputTextAreaComponent a(@NotNull String newString) {
        Intrinsics.checkNotNullParameter(newString, "newString");
        InputTextAreaComponent inputTextAreaComponentD = d(this, null, newString, 1, null);
        inputTextAreaComponentD.g(getTextController());
        return inputTextAreaComponentD;
    }

    public int hashCode() {
        return (this.config.hashCode() * 31) + this.value.hashCode();
    }

    @Override
    @NotNull
    public List<u9.a> i() {
        return this.associatedViews;
    }

    @NotNull
    public String toString() {
        return "InputTextAreaComponent(config=" + this.config + ", value=" + this.value + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.config, flags);
        parcel.writeString(this.value);
    }

    public InputTextAreaComponent(InputTextArea inputTextArea, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        InputTextArea.Attributes attributes;
        if ((i & 2) != 0 && ((attributes = inputTextArea.getAttributes()) == null || (str = attributes.getPrefill()) == null)) {
            str = "";
        }
        this(inputTextArea, str);
    }
}
