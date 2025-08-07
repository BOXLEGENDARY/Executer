package com.withpersona.sdk2.inquiry.governmentid.autoClassification;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "Landroid/os/Parcelable;", "", "isEnabled", "extractTextFromImage", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "idSideConfig", "<init>", "(ZZLcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Z", "c", "()Z", "e", "a", "i", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "b", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "v", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class AutoClassificationConfig implements Parcelable {

    private final boolean isEnabled;

    private final boolean extractTextFromImage;

    @NotNull
    private final IdConfig.IdSideConfig idSideConfig;

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<AutoClassificationConfig> CREATOR = new b();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "", "isEnabled", "extractTextFromImage", "idSideConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "b", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;)Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final IdConfig.IdSideConfig a() {
            return new IdConfig.IdSideConfig("unknown", IdConfig.b.v, Screen.Overlay.CornersOnly.d, new IdConfig.AutoCaptureConfig(null, 1, null), new IdConfig.ManualCaptureConfig(true, 0L));
        }

        @NotNull
        public final AutoClassificationConfig b(Boolean isEnabled, Boolean extractTextFromImage, IdConfig.IdSideConfig idSideConfig) {
            boolean zBooleanValue = isEnabled != null ? isEnabled.booleanValue() : false;
            boolean zBooleanValue2 = extractTextFromImage != null ? extractTextFromImage.booleanValue() : true;
            if (idSideConfig == null) {
                idSideConfig = a();
            }
            return new AutoClassificationConfig(zBooleanValue, zBooleanValue2, idSideConfig);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AutoClassificationConfig> {
        @Override
        @NotNull
        public final AutoClassificationConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoClassificationConfig(parcel.readInt() != 0, parcel.readInt() != 0, IdConfig.IdSideConfig.CREATOR.createFromParcel(parcel));
        }

        @Override
        @NotNull
        public final AutoClassificationConfig[] newArray(int i) {
            return new AutoClassificationConfig[i];
        }
    }

    public AutoClassificationConfig(boolean z, boolean z2, @NotNull IdConfig.IdSideConfig idSideConfig) {
        Intrinsics.checkNotNullParameter(idSideConfig, "idSideConfig");
        this.isEnabled = z;
        this.extractTextFromImage = z2;
        this.idSideConfig = idSideConfig;
    }

    public final boolean getExtractTextFromImage() {
        return this.extractTextFromImage;
    }

    @NotNull
    public final IdConfig.IdSideConfig getIdSideConfig() {
        return this.idSideConfig;
    }

    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeInt(this.extractTextFromImage ? 1 : 0);
        this.idSideConfig.writeToParcel(parcel, flags);
    }
}
