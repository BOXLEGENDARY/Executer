package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "Landroid/os/Parcelable;", "AutoClassifyConfig", "IdCaptureConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface CaptureConfig extends Parcelable {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "config", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class AutoClassifyConfig implements CaptureConfig {

        @NotNull
        public static final Parcelable.Creator<AutoClassifyConfig> CREATOR = new a();

        @NotNull
        private final AutoClassificationConfig config;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AutoClassifyConfig> {
            @Override
            @NotNull
            public final AutoClassifyConfig createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoClassifyConfig(AutoClassificationConfig.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final AutoClassifyConfig[] newArray(int i) {
                return new AutoClassifyConfig[i];
            }
        }

        public AutoClassifyConfig(@NotNull AutoClassificationConfig autoClassificationConfig) {
            Intrinsics.checkNotNullParameter(autoClassificationConfig, "config");
            this.config = autoClassificationConfig;
        }

        @NotNull
        public final AutoClassificationConfig getConfig() {
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
            return (other instanceof AutoClassifyConfig) && Intrinsics.b(this.config, ((AutoClassifyConfig) other).config);
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        @NotNull
        public String toString() {
            return "AutoClassifyConfig(config=" + this.config + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.config.writeToParcel(parcel, flags);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$IdCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "id", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class IdCaptureConfig implements CaptureConfig {

        @NotNull
        public static final Parcelable.Creator<IdCaptureConfig> CREATOR = new a();

        @NotNull
        private final IdConfig id;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IdCaptureConfig> {
            @Override
            @NotNull
            public final IdCaptureConfig createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IdCaptureConfig(IdConfig.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final IdCaptureConfig[] newArray(int i) {
                return new IdCaptureConfig[i];
            }
        }

        public IdCaptureConfig(@NotNull IdConfig idConfig) {
            Intrinsics.checkNotNullParameter(idConfig, "id");
            this.id = idConfig;
        }

        @NotNull
        public final IdConfig getId() {
            return this.id;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IdCaptureConfig) && Intrinsics.b(this.id, ((IdCaptureConfig) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return "IdCaptureConfig(id=" + this.id + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.id.writeToParcel(parcel, flags);
        }
    }
}
