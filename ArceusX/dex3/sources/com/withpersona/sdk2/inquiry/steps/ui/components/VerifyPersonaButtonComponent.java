package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R(\u0010#\u001a\u00020\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u001d\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton;", "config", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton;", "", "Lu9/a;", "e", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "", "Z", "t0", "()Z", "m", "(Z)V", "getWasTapped$annotations", "wasTapped", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class VerifyPersonaButtonComponent implements ButtonComponent {

    @NotNull
    public static final Parcelable.Creator<VerifyPersonaButtonComponent> CREATOR = new a();

    @NotNull
    private final VerifyPersonaButton config;

    @NotNull
    private final List<u9.a> associatedViews;

    private boolean wasTapped;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerifyPersonaButtonComponent> {
        @Override
        @NotNull
        public final VerifyPersonaButtonComponent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VerifyPersonaButtonComponent((VerifyPersonaButton) parcel.readParcelable(VerifyPersonaButtonComponent.class.getClassLoader()));
        }

        @Override
        @NotNull
        public final VerifyPersonaButtonComponent[] newArray(int i) {
            return new VerifyPersonaButtonComponent[i];
        }
    }

    public VerifyPersonaButtonComponent(@NotNull VerifyPersonaButton verifyPersonaButton) {
        Intrinsics.checkNotNullParameter(verifyPersonaButton, "config");
        this.config = verifyPersonaButton;
        this.associatedViews = new ArrayList();
    }

    @Override
    @NotNull
    public VerifyPersonaButton e() {
        return this.config;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public String getAutoSubmitCountdownText() {
        return ButtonComponent.a.a(this);
    }

    @Override
    public Integer getAutoSubmitIntervalSeconds() {
        return ButtonComponent.a.b(this);
    }

    @Override
    public JsonLogicBoolean getDisabled() {
        return ButtonComponent.a.c(this);
    }

    @Override
    public JsonLogicBoolean getHidden() {
        return ButtonComponent.a.d(this);
    }

    @Override
    @NotNull
    public String getName() {
        return ButtonComponent.a.e(this);
    }

    @Override
    @NotNull
    public List<u9.a> i() {
        return this.associatedViews;
    }

    @Override
    public void m(boolean z) {
        this.wasTapped = z;
    }

    @Override
    public boolean getWasTapped() {
        return this.wasTapped;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.config, flags);
    }
}
