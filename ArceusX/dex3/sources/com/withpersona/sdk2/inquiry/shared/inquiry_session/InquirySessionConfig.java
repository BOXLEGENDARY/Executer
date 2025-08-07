package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\"¨\u0006&"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;", "gpsCollectionRequirement", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;", "gpsPrecisionRequirement", "<init>", "(Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;", "b", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;", "e", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;", "c", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;", "()Z", "isGpsRequired", "i", "a", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class InquirySessionConfig implements Parcelable {

    @NotNull
    private final GpsCollectionRequirement gpsCollectionRequirement;

    @NotNull
    private final GpsPrecisionRequirement gpsPrecisionRequirement;

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InquirySessionConfig> CREATOR = new b();

    @NotNull
    private static final InquirySessionConfig v = new InquirySessionConfig(GpsCollectionRequirement.i, GpsPrecisionRequirement.e);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "Default", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InquirySessionConfig a() {
            return InquirySessionConfig.v;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<InquirySessionConfig> {
        @Override
        @NotNull
        public final InquirySessionConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InquirySessionConfig(GpsCollectionRequirement.CREATOR.createFromParcel(parcel), GpsPrecisionRequirement.CREATOR.createFromParcel(parcel));
        }

        @Override
        @NotNull
        public final InquirySessionConfig[] newArray(int i) {
            return new InquirySessionConfig[i];
        }
    }

    public InquirySessionConfig(@NotNull GpsCollectionRequirement gpsCollectionRequirement, @NotNull GpsPrecisionRequirement gpsPrecisionRequirement) {
        Intrinsics.checkNotNullParameter(gpsCollectionRequirement, "gpsCollectionRequirement");
        Intrinsics.checkNotNullParameter(gpsPrecisionRequirement, "gpsPrecisionRequirement");
        this.gpsCollectionRequirement = gpsCollectionRequirement;
        this.gpsPrecisionRequirement = gpsPrecisionRequirement;
    }

    @NotNull
    public final GpsCollectionRequirement getGpsCollectionRequirement() {
        return this.gpsCollectionRequirement;
    }

    @NotNull
    public final GpsPrecisionRequirement getGpsPrecisionRequirement() {
        return this.gpsPrecisionRequirement;
    }

    public final boolean d() {
        return this.gpsCollectionRequirement == GpsCollectionRequirement.d;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InquirySessionConfig)) {
            return false;
        }
        InquirySessionConfig inquirySessionConfig = (InquirySessionConfig) other;
        return this.gpsCollectionRequirement == inquirySessionConfig.gpsCollectionRequirement && this.gpsPrecisionRequirement == inquirySessionConfig.gpsPrecisionRequirement;
    }

    public int hashCode() {
        return (this.gpsCollectionRequirement.hashCode() * 31) + this.gpsPrecisionRequirement.hashCode();
    }

    @NotNull
    public String toString() {
        return "InquirySessionConfig(gpsCollectionRequirement=" + this.gpsCollectionRequirement + ", gpsPrecisionRequirement=" + this.gpsPrecisionRequirement + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.gpsCollectionRequirement.writeToParcel(parcel, flags);
        this.gpsPrecisionRequirement.writeToParcel(parcel, flags);
    }
}
