package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Spacer;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n9.InterfaceC0689q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0016\u0010)\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ln9/q;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Spacer;", "config", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Spacer;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Spacer;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Spacer;", "", "Lu9/a;", "e", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class SpacerComponent implements UiComponent, InterfaceC0689q {

    @NotNull
    public static final Parcelable.Creator<SpacerComponent> CREATOR = new a();

    @NotNull
    private final Spacer config;

    @NotNull
    private final List<u9.a> associatedViews;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SpacerComponent> {
        @Override
        @NotNull
        public final SpacerComponent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpacerComponent((Spacer) parcel.readParcelable(SpacerComponent.class.getClassLoader()));
        }

        @Override
        @NotNull
        public final SpacerComponent[] newArray(int i) {
            return new SpacerComponent[i];
        }
    }

    public SpacerComponent(@NotNull Spacer spacer) {
        Intrinsics.checkNotNullParameter(spacer, "config");
        this.config = spacer;
        this.associatedViews = new ArrayList();
    }

    @Override
    @NotNull
    public Spacer e() {
        return this.config;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SpacerComponent) && Intrinsics.b(this.config, ((SpacerComponent) other).config);
    }

    @Override
    public JsonLogicBoolean getHidden() {
        Spacer.Attributes attributes = e().getAttributes();
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

    public int hashCode() {
        return this.config.hashCode();
    }

    @Override
    @NotNull
    public List<u9.a> i() {
        return this.associatedViews;
    }

    @NotNull
    public String toString() {
        return "SpacerComponent(config=" + this.config + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.config, flags);
    }
}
