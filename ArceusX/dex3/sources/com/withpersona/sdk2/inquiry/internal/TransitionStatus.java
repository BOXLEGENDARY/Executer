package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import ha.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "Landroid/os/Parcelable;", "()V", "CheckingForNextState", "Transitioning", "TransitioningBack", "UpdateGpsLocation", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$CheckingForNextState;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$Transitioning;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$TransitioningBack;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$UpdateGpsLocation;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class TransitionStatus implements Parcelable {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$CheckingForNextState;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "LF8/u;", "pollingMode", "<init>", "(LF8/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "LF8/u;", "a", "()LF8/u;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class CheckingForNextState extends TransitionStatus {

        @NotNull
        public static final Parcelable.Creator<CheckingForNextState> CREATOR = new a();

        @NotNull
        private final u pollingMode;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CheckingForNextState> {
            @Override
            @NotNull
            public final CheckingForNextState createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CheckingForNextState(u.valueOf(parcel.readString()));
            }

            @Override
            @NotNull
            public final CheckingForNextState[] newArray(int i) {
                return new CheckingForNextState[i];
            }
        }

        public CheckingForNextState() {
            u uVar = null;
            this(uVar, 1, uVar);
        }

        @NotNull
        public final u getPollingMode() {
            return this.pollingMode;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckingForNextState) && this.pollingMode == ((CheckingForNextState) other).pollingMode;
        }

        public int hashCode() {
            return this.pollingMode.hashCode();
        }

        @NotNull
        public String toString() {
            return "CheckingForNextState(pollingMode=" + this.pollingMode + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.pollingMode.name());
        }

        public CheckingForNextState(u uVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? u.e : uVar);
        }

        public CheckingForNextState(@NotNull u uVar) {
            super(null);
            Intrinsics.checkNotNullParameter(uVar, "pollingMode");
            this.pollingMode = uVar;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$Transitioning;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "transitionData", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "a", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Transitioning extends TransitionStatus {

        @NotNull
        public static final Parcelable.Creator<Transitioning> CREATOR = new a();

        @NotNull
        private final TransitionWorker.TransitionData transitionData;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Transitioning> {
            @Override
            @NotNull
            public final Transitioning createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transitioning(TransitionWorker.TransitionData.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final Transitioning[] newArray(int i) {
                return new Transitioning[i];
            }
        }

        public Transitioning(@NotNull TransitionWorker.TransitionData transitionData) {
            super(null);
            Intrinsics.checkNotNullParameter(transitionData, "transitionData");
            this.transitionData = transitionData;
        }

        @NotNull
        public final TransitionWorker.TransitionData getTransitionData() {
            return this.transitionData;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Transitioning) && Intrinsics.b(this.transitionData, ((Transitioning) other).transitionData);
        }

        public int hashCode() {
            return this.transitionData.hashCode();
        }

        @NotNull
        public String toString() {
            return "Transitioning(transitionData=" + this.transitionData + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.transitionData.writeToParcel(parcel, flags);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$TransitioningBack;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class TransitioningBack extends TransitionStatus {

        @NotNull
        public static final TransitioningBack d = new TransitioningBack();

        @NotNull
        public static final Parcelable.Creator<TransitioningBack> CREATOR = new a();

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TransitioningBack> {
            @Override
            @NotNull
            public final TransitioningBack createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransitioningBack.d;
            }

            @Override
            @NotNull
            public final TransitioningBack[] newArray(int i) {
                return new TransitioningBack[i];
            }
        }

        private TransitioningBack() {
            super(null);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TransitioningBack);
        }

        public int hashCode() {
            return -593165066;
        }

        @NotNull
        public String toString() {
            return "TransitioningBack";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$UpdateGpsLocation;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "nextStep", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "a", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class UpdateGpsLocation extends TransitionStatus {

        @NotNull
        public static final Parcelable.Creator<UpdateGpsLocation> CREATOR = new a();

        private final InquiryState nextStep;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UpdateGpsLocation> {
            @Override
            @NotNull
            public final UpdateGpsLocation createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateGpsLocation((InquiryState) parcel.readParcelable(UpdateGpsLocation.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final UpdateGpsLocation[] newArray(int i) {
                return new UpdateGpsLocation[i];
            }
        }

        public UpdateGpsLocation(InquiryState inquiryState) {
            super(null);
            this.nextStep = inquiryState;
        }

        public final InquiryState getNextStep() {
            return this.nextStep;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateGpsLocation) && Intrinsics.b(this.nextStep, ((UpdateGpsLocation) other).nextStep);
        }

        public int hashCode() {
            InquiryState inquiryState = this.nextStep;
            if (inquiryState == null) {
                return 0;
            }
            return inquiryState.hashCode();
        }

        @NotNull
        public String toString() {
            return "UpdateGpsLocation(nextStep=" + this.nextStep + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(this.nextStep, flags);
        }
    }

    public TransitionStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TransitionStatus() {
    }
}
