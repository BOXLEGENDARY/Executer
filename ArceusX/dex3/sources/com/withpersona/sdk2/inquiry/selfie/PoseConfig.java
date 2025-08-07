package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001'B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "Landroid/os/Parcelable;", "", "allowReview", "manualCaptureEnabled", "", "manualCaptureDelayMs", "autoCaptureEnabled", "<init>", "(ZZJZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Z", "b", "()Z", "e", "f", "i", "J", "()J", "v", "c", "w", "a", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class PoseConfig implements Parcelable {

    private final boolean allowReview;

    private final boolean manualCaptureEnabled;

    private final long manualCaptureDelayMs;

    private final boolean autoCaptureEnabled;

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<PoseConfig> CREATOR = new b();

    @NotNull
    private static final PoseConfig y = new PoseConfig(false, false, 0, false, 15, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "Default", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PoseConfig a() {
            return PoseConfig.y;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PoseConfig> {
        @Override
        @NotNull
        public final PoseConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PoseConfig(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readInt() != 0);
        }

        @Override
        @NotNull
        public final PoseConfig[] newArray(int i) {
            return new PoseConfig[i];
        }
    }

    public PoseConfig() {
        this(false, false, 0L, false, 15, null);
    }

    public final boolean getAllowReview() {
        return this.allowReview;
    }

    public final boolean getAutoCaptureEnabled() {
        return this.autoCaptureEnabled;
    }

    public final long getManualCaptureDelayMs() {
        return this.manualCaptureDelayMs;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PoseConfig)) {
            return false;
        }
        PoseConfig poseConfig = (PoseConfig) other;
        return this.allowReview == poseConfig.allowReview && this.manualCaptureEnabled == poseConfig.manualCaptureEnabled && this.manualCaptureDelayMs == poseConfig.manualCaptureDelayMs && this.autoCaptureEnabled == poseConfig.autoCaptureEnabled;
    }

    public final boolean getManualCaptureEnabled() {
        return this.manualCaptureEnabled;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.allowReview) * 31) + Boolean.hashCode(this.manualCaptureEnabled)) * 31) + Long.hashCode(this.manualCaptureDelayMs)) * 31) + Boolean.hashCode(this.autoCaptureEnabled);
    }

    @NotNull
    public String toString() {
        return "PoseConfig(allowReview=" + this.allowReview + ", manualCaptureEnabled=" + this.manualCaptureEnabled + ", manualCaptureDelayMs=" + this.manualCaptureDelayMs + ", autoCaptureEnabled=" + this.autoCaptureEnabled + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.allowReview ? 1 : 0);
        parcel.writeInt(this.manualCaptureEnabled ? 1 : 0);
        parcel.writeLong(this.manualCaptureDelayMs);
        parcel.writeInt(this.autoCaptureEnabled ? 1 : 0);
    }

    public PoseConfig(boolean z, boolean z2, long j, boolean z3) {
        this.allowReview = z;
        this.manualCaptureEnabled = z2;
        this.manualCaptureDelayMs = j;
        this.autoCaptureEnabled = z3;
    }

    public PoseConfig(boolean z, boolean z2, long j, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? 8000L : j, (i & 8) == 0 ? z3 : true);
    }
}
