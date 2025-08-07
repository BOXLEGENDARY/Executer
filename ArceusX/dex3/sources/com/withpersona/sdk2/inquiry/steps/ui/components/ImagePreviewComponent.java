package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ImagePreviewComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;", "config", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class ImagePreviewComponent implements UiComponent {

    @NotNull
    public static final Parcelable.Creator<ImagePreviewComponent> CREATOR = new a();

    @NotNull
    private final CombinedStepImagePreview config;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImagePreviewComponent> {
        @Override
        @NotNull
        public final ImagePreviewComponent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ImagePreviewComponent((CombinedStepImagePreview) parcel.readParcelable(ImagePreviewComponent.class.getClassLoader()));
        }

        @Override
        @NotNull
        public final ImagePreviewComponent[] newArray(int i) {
            return new ImagePreviewComponent[i];
        }
    }

    public ImagePreviewComponent(@NotNull CombinedStepImagePreview combinedStepImagePreview) {
        Intrinsics.checkNotNullParameter(combinedStepImagePreview, "config");
        this.config = combinedStepImagePreview;
    }

    @Override
    @NotNull
    public CombinedStepImagePreview e() {
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
        return (other instanceof ImagePreviewComponent) && Intrinsics.b(this.config, ((ImagePreviewComponent) other).config);
    }

    @Override
    @NotNull
    public String getName() {
        return UiComponent.a.a(this);
    }

    public int hashCode() {
        return this.config.hashCode();
    }

    @NotNull
    public String toString() {
        return "ImagePreviewComponent(config=" + this.config + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.config, flags);
    }
}
