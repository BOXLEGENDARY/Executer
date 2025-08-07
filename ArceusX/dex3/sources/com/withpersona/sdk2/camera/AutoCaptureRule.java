package com.withpersona.sdk2.camera;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "Landroid/os/Parcelable;", "<init>", "()V", "BarcodePdf417Rule", "FrontOrBackRule", "FrontRule", "MrzRule", "TextExtractionRule", "Lcom/withpersona/sdk2/camera/AutoCaptureRule$BarcodePdf417Rule;", "Lcom/withpersona/sdk2/camera/AutoCaptureRule$FrontOrBackRule;", "Lcom/withpersona/sdk2/camera/AutoCaptureRule$FrontRule;", "Lcom/withpersona/sdk2/camera/AutoCaptureRule$MrzRule;", "Lcom/withpersona/sdk2/camera/AutoCaptureRule$TextExtractionRule;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class AutoCaptureRule implements Parcelable {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/camera/AutoCaptureRule$BarcodePdf417Rule;", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "", "isRequired", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Z", "()Z", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class BarcodePdf417Rule extends AutoCaptureRule {

        @NotNull
        public static final Parcelable.Creator<BarcodePdf417Rule> CREATOR = new a();

        private final boolean isRequired;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BarcodePdf417Rule> {
            @Override
            @NotNull
            public final BarcodePdf417Rule createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BarcodePdf417Rule(parcel.readInt() != 0);
            }

            @Override
            @NotNull
            public final BarcodePdf417Rule[] newArray(int i) {
                return new BarcodePdf417Rule[i];
            }
        }

        public BarcodePdf417Rule() {
            this(false, 1, null);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BarcodePdf417Rule) && this.isRequired == ((BarcodePdf417Rule) other).isRequired;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRequired);
        }

        @NotNull
        public String toString() {
            return "BarcodePdf417Rule(isRequired=" + this.isRequired + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.isRequired ? 1 : 0);
        }

        public BarcodePdf417Rule(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public BarcodePdf417Rule(boolean z) {
            super(null);
            this.isRequired = z;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/camera/AutoCaptureRule$FrontOrBackRule;", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "", "isRequired", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Z", "()Z", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class FrontOrBackRule extends AutoCaptureRule {

        @NotNull
        public static final Parcelable.Creator<FrontOrBackRule> CREATOR = new a();

        private final boolean isRequired;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FrontOrBackRule> {
            @Override
            @NotNull
            public final FrontOrBackRule createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FrontOrBackRule(parcel.readInt() != 0);
            }

            @Override
            @NotNull
            public final FrontOrBackRule[] newArray(int i) {
                return new FrontOrBackRule[i];
            }
        }

        public FrontOrBackRule() {
            this(false, 1, null);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FrontOrBackRule) && this.isRequired == ((FrontOrBackRule) other).isRequired;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRequired);
        }

        @NotNull
        public String toString() {
            return "FrontOrBackRule(isRequired=" + this.isRequired + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.isRequired ? 1 : 0);
        }

        public FrontOrBackRule(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public FrontOrBackRule(boolean z) {
            super(null);
            this.isRequired = z;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/camera/AutoCaptureRule$FrontRule;", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "", "isRequired", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Z", "()Z", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class FrontRule extends AutoCaptureRule {

        @NotNull
        public static final Parcelable.Creator<FrontRule> CREATOR = new a();

        private final boolean isRequired;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FrontRule> {
            @Override
            @NotNull
            public final FrontRule createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FrontRule(parcel.readInt() != 0);
            }

            @Override
            @NotNull
            public final FrontRule[] newArray(int i) {
                return new FrontRule[i];
            }
        }

        public FrontRule() {
            this(false, 1, null);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FrontRule) && this.isRequired == ((FrontRule) other).isRequired;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRequired);
        }

        @NotNull
        public String toString() {
            return "FrontRule(isRequired=" + this.isRequired + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.isRequired ? 1 : 0);
        }

        public FrontRule(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public FrontRule(boolean z) {
            super(null);
            this.isRequired = z;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/camera/AutoCaptureRule$MrzRule;", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "", "isRequired", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Z", "()Z", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class MrzRule extends AutoCaptureRule {

        @NotNull
        public static final Parcelable.Creator<MrzRule> CREATOR = new a();

        private final boolean isRequired;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MrzRule> {
            @Override
            @NotNull
            public final MrzRule createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MrzRule(parcel.readInt() != 0);
            }

            @Override
            @NotNull
            public final MrzRule[] newArray(int i) {
                return new MrzRule[i];
            }
        }

        public MrzRule() {
            this(false, 1, null);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MrzRule) && this.isRequired == ((MrzRule) other).isRequired;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRequired);
        }

        @NotNull
        public String toString() {
            return "MrzRule(isRequired=" + this.isRequired + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.isRequired ? 1 : 0);
        }

        public MrzRule(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public MrzRule(boolean z) {
            super(null);
            this.isRequired = z;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/camera/AutoCaptureRule$TextExtractionRule;", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "", "isRequired", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Z", "()Z", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class TextExtractionRule extends AutoCaptureRule {

        @NotNull
        public static final Parcelable.Creator<TextExtractionRule> CREATOR = new a();

        private final boolean isRequired;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TextExtractionRule> {
            @Override
            @NotNull
            public final TextExtractionRule createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TextExtractionRule(parcel.readInt() != 0);
            }

            @Override
            @NotNull
            public final TextExtractionRule[] newArray(int i) {
                return new TextExtractionRule[i];
            }
        }

        public TextExtractionRule() {
            this(false, 1, null);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextExtractionRule) && this.isRequired == ((TextExtractionRule) other).isRequired;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRequired);
        }

        @NotNull
        public String toString() {
            return "TextExtractionRule(isRequired=" + this.isRequired + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.isRequired ? 1 : 0);
        }

        public TextExtractionRule(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public TextExtractionRule(boolean z) {
            super(null);
            this.isRequired = z;
        }
    }

    public AutoCaptureRule(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AutoCaptureRule() {
    }
}
