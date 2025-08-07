package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.a;
import com.withpersona.sdk2.inquiry.selfie.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8 X \u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00008 X \u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0010$%&'()*+,-./0123¨\u00064"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Landroid/os/Parcelable;", "<init>", "()V", "", "d", "Z", "getDidGoBack$selfie_release", "()Z", "p", "(Z)V", "didGoBack", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "o", "()Ljava/util/List;", "selfies", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "backState", "Capture", "CaptureTransition", "CountdownToCapture", "CountdownToManualCapture", "FinalizeLocalVideoCapture", "FinalizeWebRtc", "RestartCamera", "ReviewCaptures", "ShowInstructions", "ShowPoseHint", "StartCapture", "StartCaptureFaceDetected", "Submit", "WaitForCameraFeed", "WaitForWebRtcSetup", "WebRtcFinished", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class SelfieState implements Parcelable {

    private boolean didGoBack;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8PX\u0090\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "nextState", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "completedPose", "backState", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "r", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "i", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "q", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "v", "n", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "o", "()Ljava/util/List;", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class CaptureTransition extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<CaptureTransition> CREATOR = new a();

        @NotNull
        private final SelfieState nextState;

        @NotNull
        private final Selfie.b completedPose;

        private final SelfieState backState;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CaptureTransition> {
            @Override
            @NotNull
            public final CaptureTransition createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CaptureTransition((SelfieState) parcel.readParcelable(CaptureTransition.class.getClassLoader()), Selfie.b.valueOf(parcel.readString()), (SelfieState) parcel.readParcelable(CaptureTransition.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final CaptureTransition[] newArray(int i) {
                return new CaptureTransition[i];
            }
        }

        public CaptureTransition(@NotNull SelfieState selfieState, @NotNull Selfie.b bVar, SelfieState selfieState2) {
            super(null);
            Intrinsics.checkNotNullParameter(selfieState, "nextState");
            Intrinsics.checkNotNullParameter(bVar, "completedPose");
            this.nextState = selfieState;
            this.completedPose = bVar;
            this.backState = selfieState2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public List<Selfie> o() {
            return this.nextState.o();
        }

        @NotNull
        public final Selfie.b getCompletedPose() {
            return this.completedPose;
        }

        @NotNull
        public final SelfieState getNextState() {
            return this.nextState;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(this.nextState, flags);
            parcel.writeString(this.completedPose.name());
            parcel.writeParcelable(this.backState, flags);
        }
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jj\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b:\u00103\u001a\u0004\b;\u00105R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR&\u0010I\u001a\b\u0012\u0004\u0012\u00020D0\u00078\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\bE\u0010/\u0012\u0004\bG\u0010H\u001a\u0004\bF\u00101¨\u0006J"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "", "countDown", "LV8/l;", "selfieError", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "posesNeeded", "", "startCaptureTimestamp", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "startSelfieTimestamp", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "<init>", "(ILV8/l;Ljava/util/List;JLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;)V", "q", "(ILV8/l;Ljava/util/List;JLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "I", "s", "i", "LV8/l;", "t", "()LV8/l;", "v", "Ljava/util/List;", "a", "()Ljava/util/List;", "w", "J", "d", "()J", "y", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "z", "l", "A", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "B", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "b", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "C", "o", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class CountdownToCapture extends SelfieState implements com.withpersona.sdk2.inquiry.selfie.a {

        @NotNull
        public static final Parcelable.Creator<CountdownToCapture> CREATOR = new a();

        private final SelfieState backState;

        @NotNull
        private final PoseConfigs poseConfigs;

        @NotNull
        private final List<Selfie> selfies;

        private final int countDown;

        private final V8.l selfieError;

        @NotNull
        private final List<Selfie.b> posesNeeded;

        private final long startCaptureTimestamp;

        @NotNull
        private final CameraProperties cameraProperties;

        private final long startSelfieTimestamp;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CountdownToCapture> {
            @Override
            @NotNull
            public final CountdownToCapture createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                V8.l lVarValueOf = parcel.readInt() == 0 ? null : V8.l.valueOf(parcel.readString());
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(Selfie.b.valueOf(parcel.readString()));
                }
                return new CountdownToCapture(i, lVarValueOf, arrayList, parcel.readLong(), (CameraProperties) parcel.readParcelable(CountdownToCapture.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(CountdownToCapture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final CountdownToCapture[] newArray(int i) {
                return new CountdownToCapture[i];
            }
        }

        public CountdownToCapture(int i, V8.l lVar, List list, long j, CameraProperties cameraProperties, long j2, SelfieState selfieState, PoseConfigs poseConfigs, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : lVar, list, j, cameraProperties, j2, selfieState, poseConfigs);
        }

        @Override
        @NotNull
        public List<Selfie.b> a() {
            return this.posesNeeded;
        }

        @Override
        @NotNull
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @NotNull
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        public final long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountdownToCapture)) {
                return false;
            }
            CountdownToCapture countdownToCapture = (CountdownToCapture) other;
            return this.countDown == countdownToCapture.countDown && this.selfieError == countdownToCapture.selfieError && Intrinsics.b(this.posesNeeded, countdownToCapture.posesNeeded) && this.startCaptureTimestamp == countdownToCapture.startCaptureTimestamp && Intrinsics.b(this.cameraProperties, countdownToCapture.cameraProperties) && this.startSelfieTimestamp == countdownToCapture.startSelfieTimestamp && Intrinsics.b(this.backState, countdownToCapture.backState) && Intrinsics.b(this.poseConfigs, countdownToCapture.poseConfigs);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.countDown) * 31;
            V8.l lVar = this.selfieError;
            int iHashCode2 = (((((((((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            return ((iHashCode2 + (selfieState != null ? selfieState.hashCode() : 0)) * 31) + this.poseConfigs.hashCode();
        }

        @Override
        @NotNull
        public PoseConfig i() {
            return a.C0155a.b(this);
        }

        @Override
        public Selfie.b k() {
            return a.C0155a.c(this);
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public List<Selfie> o() {
            return this.selfies;
        }

        @NotNull
        public final CountdownToCapture q(int countDown, V8.l selfieError, @NotNull List<? extends Selfie.b> posesNeeded, long startCaptureTimestamp, @NotNull CameraProperties cameraProperties, long startSelfieTimestamp, SelfieState backState, @NotNull PoseConfigs poseConfigs) {
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            return new CountdownToCapture(countDown, selfieError, posesNeeded, startCaptureTimestamp, cameraProperties, startSelfieTimestamp, backState, poseConfigs);
        }

        public final int getCountDown() {
            return this.countDown;
        }

        public final V8.l getSelfieError() {
            return this.selfieError;
        }

        @NotNull
        public String toString() {
            return "CountdownToCapture(countDown=" + this.countDown + ", selfieError=" + this.selfieError + ", posesNeeded=" + this.posesNeeded + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.countDown);
            V8.l lVar = this.selfieError;
            if (lVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(lVar.name());
            }
            List<Selfie.b> list = this.posesNeeded;
            parcel.writeInt(list.size());
            Iterator<Selfie.b> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().name());
            }
            parcel.writeLong(this.startCaptureTimestamp);
            parcel.writeParcelable(this.cameraProperties, flags);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(parcel, flags);
        }

        public CountdownToCapture(int i, V8.l lVar, @NotNull List<? extends Selfie.b> list, long j, @NotNull CameraProperties cameraProperties, long j2, SelfieState selfieState, @NotNull PoseConfigs poseConfigs) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            this.countDown = i;
            this.selfieError = lVar;
            this.posesNeeded = list;
            this.startCaptureTimestamp = j;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j2;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.selfies = CollectionsKt.j();
        }
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jt\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u00108\u001a\u0004\b@\u0010:R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR&\u0010N\u001a\b\u0012\u0004\u0012\u00020I0\t8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\bJ\u00104\u0012\u0004\bL\u0010M\u001a\u0004\bK\u00106¨\u0006O"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/b;", "", "countDown", "LV8/l;", "selfieError", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "posesNeeded", "", "startCaptureTimestamp", "", "autoCaptureSupported", "startSelfieTimestamp", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "<init>", "(ILV8/l;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;JZJLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;)V", "q", "(ILV8/l;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;JZJLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "I", "s", "i", "LV8/l;", "t", "()LV8/l;", "v", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "w", "Ljava/util/List;", "a", "()Ljava/util/List;", "y", "J", "d", "()J", "z", "Z", "f", "()Z", "A", "l", "B", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "C", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "b", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "D", "o", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class CountdownToManualCapture extends SelfieState implements b {

        @NotNull
        public static final Parcelable.Creator<CountdownToManualCapture> CREATOR = new a();

        private final long startSelfieTimestamp;

        private final SelfieState backState;

        @NotNull
        private final PoseConfigs poseConfigs;

        @NotNull
        private final List<Selfie> selfies;

        private final int countDown;

        private final V8.l selfieError;

        @NotNull
        private final CameraProperties cameraProperties;

        @NotNull
        private final List<Selfie.b> posesNeeded;

        private final long startCaptureTimestamp;

        private final boolean autoCaptureSupported;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CountdownToManualCapture> {
            @Override
            @NotNull
            public final CountdownToManualCapture createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                V8.l lVarValueOf = parcel.readInt() == 0 ? null : V8.l.valueOf(parcel.readString());
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(CountdownToManualCapture.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(Selfie.b.valueOf(parcel.readString()));
                }
                return new CountdownToManualCapture(i, lVarValueOf, cameraProperties, arrayList, parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), (SelfieState) parcel.readParcelable(CountdownToManualCapture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final CountdownToManualCapture[] newArray(int i) {
                return new CountdownToManualCapture[i];
            }
        }

        public CountdownToManualCapture(int i, V8.l lVar, CameraProperties cameraProperties, List list, long j, boolean z, long j2, SelfieState selfieState, PoseConfigs poseConfigs, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : lVar, cameraProperties, list, j, (i2 & 32) != 0 ? true : z, j2, selfieState, poseConfigs);
        }

        @Override
        @NotNull
        public List<Selfie.b> a() {
            return this.posesNeeded;
        }

        @Override
        @NotNull
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override
        @NotNull
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override
        public long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountdownToManualCapture)) {
                return false;
            }
            CountdownToManualCapture countdownToManualCapture = (CountdownToManualCapture) other;
            return this.countDown == countdownToManualCapture.countDown && this.selfieError == countdownToManualCapture.selfieError && Intrinsics.b(this.cameraProperties, countdownToManualCapture.cameraProperties) && Intrinsics.b(this.posesNeeded, countdownToManualCapture.posesNeeded) && this.startCaptureTimestamp == countdownToManualCapture.startCaptureTimestamp && this.autoCaptureSupported == countdownToManualCapture.autoCaptureSupported && this.startSelfieTimestamp == countdownToManualCapture.startSelfieTimestamp && Intrinsics.b(this.backState, countdownToManualCapture.backState) && Intrinsics.b(this.poseConfigs, countdownToManualCapture.poseConfigs);
        }

        @Override
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override
        public boolean g() {
            return b.a.d(this);
        }

        @Override
        @NotNull
        public Selfie.b h() {
            return b.a.a(this);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.countDown) * 31;
            V8.l lVar = this.selfieError;
            int iHashCode2 = (((((((((((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31) + this.posesNeeded.hashCode()) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            return ((iHashCode2 + (selfieState != null ? selfieState.hashCode() : 0)) * 31) + this.poseConfigs.hashCode();
        }

        @Override
        @NotNull
        public PoseConfig i() {
            return b.a.b(this);
        }

        @Override
        public Selfie.b k() {
            return b.a.c(this);
        }

        @Override
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public List<Selfie> o() {
            return this.selfies;
        }

        @NotNull
        public final CountdownToManualCapture q(int countDown, V8.l selfieError, @NotNull CameraProperties cameraProperties, @NotNull List<? extends Selfie.b> posesNeeded, long startCaptureTimestamp, boolean autoCaptureSupported, long startSelfieTimestamp, SelfieState backState, @NotNull PoseConfigs poseConfigs) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            return new CountdownToManualCapture(countDown, selfieError, cameraProperties, posesNeeded, startCaptureTimestamp, autoCaptureSupported, startSelfieTimestamp, backState, poseConfigs);
        }

        public final int getCountDown() {
            return this.countDown;
        }

        public final V8.l getSelfieError() {
            return this.selfieError;
        }

        @NotNull
        public String toString() {
            return "CountdownToManualCapture(countDown=" + this.countDown + ", selfieError=" + this.selfieError + ", cameraProperties=" + this.cameraProperties + ", posesNeeded=" + this.posesNeeded + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", autoCaptureSupported=" + this.autoCaptureSupported + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.countDown);
            V8.l lVar = this.selfieError;
            if (lVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(lVar.name());
            }
            parcel.writeParcelable(this.cameraProperties, flags);
            List<Selfie.b> list = this.posesNeeded;
            parcel.writeInt(list.size());
            Iterator<Selfie.b> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().name());
            }
            parcel.writeLong(this.startCaptureTimestamp);
            parcel.writeInt(this.autoCaptureSupported ? 1 : 0);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(parcel, flags);
        }

        public CountdownToManualCapture(int i, V8.l lVar, @NotNull CameraProperties cameraProperties, @NotNull List<? extends Selfie.b> list, long j, boolean z, long j2, SelfieState selfieState, @NotNull PoseConfigs poseConfigs) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(list, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            this.countDown = i;
            this.selfieError = lVar;
            this.cameraProperties = cameraProperties;
            this.posesNeeded = list;
            this.startCaptureTimestamp = j;
            this.autoCaptureSupported = z;
            this.startSelfieTimestamp = j2;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.selfies = CollectionsKt.j();
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ^\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b+\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "", "minDurationMs", "", "isDelayComplete", "isFinalizeComplete", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "startSelfieTimestamp", "backState", "<init>", "(Ljava/util/List;JZZLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V", "q", "(Ljava/util/List;JZZLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Ljava/util/List;", "o", "()Ljava/util/List;", "i", "J", "s", "()J", "v", "Z", "t", "()Z", "w", "y", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "z", "l", "A", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class FinalizeLocalVideoCapture extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<FinalizeLocalVideoCapture> CREATOR = new a();

        private final SelfieState backState;

        @NotNull
        private final List<Selfie> selfies;

        private final long minDurationMs;

        private final boolean isDelayComplete;

        private final boolean isFinalizeComplete;

        @NotNull
        private final CameraProperties cameraProperties;

        private final long startSelfieTimestamp;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FinalizeLocalVideoCapture> {
            @Override
            @NotNull
            public final FinalizeLocalVideoCapture createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()));
                }
                return new FinalizeLocalVideoCapture(arrayList, parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0, (CameraProperties) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final FinalizeLocalVideoCapture[] newArray(int i) {
                return new FinalizeLocalVideoCapture[i];
            }
        }

        public FinalizeLocalVideoCapture(List list, long j, boolean z, boolean z2, CameraProperties cameraProperties, long j2, SelfieState selfieState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, cameraProperties, j2, selfieState);
        }

        @NotNull
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinalizeLocalVideoCapture)) {
                return false;
            }
            FinalizeLocalVideoCapture finalizeLocalVideoCapture = (FinalizeLocalVideoCapture) other;
            return Intrinsics.b(this.selfies, finalizeLocalVideoCapture.selfies) && this.minDurationMs == finalizeLocalVideoCapture.minDurationMs && this.isDelayComplete == finalizeLocalVideoCapture.isDelayComplete && this.isFinalizeComplete == finalizeLocalVideoCapture.isFinalizeComplete && Intrinsics.b(this.cameraProperties, finalizeLocalVideoCapture.cameraProperties) && this.startSelfieTimestamp == finalizeLocalVideoCapture.startSelfieTimestamp && Intrinsics.b(this.backState, finalizeLocalVideoCapture.backState);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.selfies.hashCode() * 31) + Long.hashCode(this.minDurationMs)) * 31) + Boolean.hashCode(this.isDelayComplete)) * 31) + Boolean.hashCode(this.isFinalizeComplete)) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            return iHashCode + (selfieState == null ? 0 : selfieState.hashCode());
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public List<Selfie> o() {
            return this.selfies;
        }

        @NotNull
        public final FinalizeLocalVideoCapture q(@NotNull List<? extends Selfie> selfies, long minDurationMs, boolean isDelayComplete, boolean isFinalizeComplete, @NotNull CameraProperties cameraProperties, long startSelfieTimestamp, SelfieState backState) {
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            return new FinalizeLocalVideoCapture(selfies, minDurationMs, isDelayComplete, isFinalizeComplete, cameraProperties, startSelfieTimestamp, backState);
        }

        public final long getMinDurationMs() {
            return this.minDurationMs;
        }

        public final boolean getIsDelayComplete() {
            return this.isDelayComplete;
        }

        @NotNull
        public String toString() {
            return "FinalizeLocalVideoCapture(selfies=" + this.selfies + ", minDurationMs=" + this.minDurationMs + ", isDelayComplete=" + this.isDelayComplete + ", isFinalizeComplete=" + this.isFinalizeComplete + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ")";
        }

        public final boolean getIsFinalizeComplete() {
            return this.isFinalizeComplete;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            List<Selfie> list = this.selfies;
            parcel.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            parcel.writeLong(this.minDurationMs);
            parcel.writeInt(this.isDelayComplete ? 1 : 0);
            parcel.writeInt(this.isFinalizeComplete ? 1 : 0);
            parcel.writeParcelable(this.cameraProperties, flags);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, flags);
        }

        public FinalizeLocalVideoCapture(@NotNull List<? extends Selfie> list, long j, boolean z, boolean z2, @NotNull CameraProperties cameraProperties, long j2, SelfieState selfieState) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.selfies = list;
            this.minDurationMs = j;
            this.isDelayComplete = z;
            this.isFinalizeComplete = z2;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j2;
            this.backState = selfieState;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Ljava/util/List;", "o", "()Ljava/util/List;", "i", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "v", "J", "l", "()J", "w", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class FinalizeWebRtc extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<FinalizeWebRtc> CREATOR = new a();

        @NotNull
        private final List<Selfie> selfies;

        @NotNull
        private final CameraProperties cameraProperties;

        private final long startSelfieTimestamp;

        private final SelfieState backState;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FinalizeWebRtc> {
            @Override
            @NotNull
            public final FinalizeWebRtc createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()));
                }
                return new FinalizeWebRtc(arrayList, (CameraProperties) parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final FinalizeWebRtc[] newArray(int i) {
                return new FinalizeWebRtc[i];
            }
        }

        public FinalizeWebRtc(@NotNull List<? extends Selfie> list, @NotNull CameraProperties cameraProperties, long j, SelfieState selfieState) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.selfies = list;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
        }

        @NotNull
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public List<Selfie> o() {
            return this.selfies;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            List<Selfie> list = this.selfies;
            parcel.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            parcel.writeParcelable(this.cameraProperties, flags);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, flags);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010+\u001a\b\u0012\u0004\u0012\u00020$0#8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "hasRequestedCameraPermissions", "hasRequestedAudioPermissions", "backState", "<init>", "(ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Z", "getHasRequestedCameraPermissions", "()Z", "i", "getHasRequestedAudioPermissions", "v", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "w", "Ljava/util/List;", "o", "()Ljava/util/List;", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class RestartCamera extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<RestartCamera> CREATOR = new a();

        private final boolean hasRequestedCameraPermissions;

        private final boolean hasRequestedAudioPermissions;

        private final SelfieState backState;

        @NotNull
        private final List<Selfie> selfies;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RestartCamera> {
            @Override
            @NotNull
            public final RestartCamera createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RestartCamera(parcel.readInt() != 0, parcel.readInt() != 0, (SelfieState) parcel.readParcelable(RestartCamera.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final RestartCamera[] newArray(int i) {
                return new RestartCamera[i];
            }
        }

        public RestartCamera(boolean z, boolean z2, SelfieState selfieState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, selfieState);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RestartCamera)) {
                return false;
            }
            RestartCamera restartCamera = (RestartCamera) other;
            return this.hasRequestedCameraPermissions == restartCamera.hasRequestedCameraPermissions && this.hasRequestedAudioPermissions == restartCamera.hasRequestedAudioPermissions && Intrinsics.b(this.backState, restartCamera.backState);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.hasRequestedCameraPermissions) * 31) + Boolean.hashCode(this.hasRequestedAudioPermissions)) * 31;
            SelfieState selfieState = this.backState;
            return iHashCode + (selfieState == null ? 0 : selfieState.hashCode());
        }

        @Override
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public List<Selfie> o() {
            return this.selfies;
        }

        @NotNull
        public String toString() {
            return "RestartCamera(hasRequestedCameraPermissions=" + this.hasRequestedCameraPermissions + ", hasRequestedAudioPermissions=" + this.hasRequestedAudioPermissions + ", backState=" + this.backState + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.hasRequestedCameraPermissions ? 1 : 0);
            parcel.writeInt(this.hasRequestedAudioPermissions ? 1 : 0);
            parcel.writeParcelable(this.backState, flags);
        }

        public RestartCamera(boolean z, boolean z2, SelfieState selfieState) {
            super(null);
            this.hasRequestedCameraPermissions = z;
            this.hasRequestedAudioPermissions = z2;
            this.backState = selfieState;
            this.selfies = CollectionsKt.j();
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "selfiesToReview", "", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Ljava/util/List;", "o", "()Ljava/util/List;", "i", "q", "v", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "w", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "y", "J", "l", "()J", "z", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ReviewCaptures extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<ReviewCaptures> CREATOR = new a();

        @NotNull
        private final List<Selfie> selfies;

        @NotNull
        private final List<Selfie> selfiesToReview;

        private final String webRtcObjectId;

        @NotNull
        private final CameraProperties cameraProperties;

        private final long startSelfieTimestamp;

        private final SelfieState backState;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReviewCaptures> {
            @Override
            @NotNull
            public final ReviewCaptures createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ReviewCaptures.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(ReviewCaptures.class.getClassLoader()));
                }
                return new ReviewCaptures(arrayList, arrayList2, parcel.readString(), (CameraProperties) parcel.readParcelable(ReviewCaptures.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(ReviewCaptures.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final ReviewCaptures[] newArray(int i) {
                return new ReviewCaptures[i];
            }
        }

        public ReviewCaptures(@NotNull List<? extends Selfie> list, @NotNull List<? extends Selfie> list2, String str, @NotNull CameraProperties cameraProperties, long j, SelfieState selfieState) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "selfies");
            Intrinsics.checkNotNullParameter(list2, "selfiesToReview");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.selfies = list;
            this.selfiesToReview = list2;
            this.webRtcObjectId = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
        }

        @NotNull
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public List<Selfie> o() {
            return this.selfies;
        }

        @NotNull
        public final List<Selfie> q() {
            return this.selfiesToReview;
        }

        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            List<Selfie> list = this.selfies;
            parcel.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            List<Selfie> list2 = this.selfiesToReview;
            parcel.writeInt(list2.size());
            Iterator<Selfie> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), flags);
            }
            parcel.writeString(this.webRtcObjectId);
            parcel.writeParcelable(this.cameraProperties, flags);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, flags);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "backState", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "i", "Ljava/util/List;", "o", "()Ljava/util/List;", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ShowInstructions extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<ShowInstructions> CREATOR = new a();

        private final SelfieState backState;

        @NotNull
        private final List<Selfie> selfies;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowInstructions> {
            @Override
            @NotNull
            public final ShowInstructions createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowInstructions((SelfieState) parcel.readParcelable(ShowInstructions.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final ShowInstructions[] newArray(int i) {
                return new ShowInstructions[i];
            }
        }

        public ShowInstructions(SelfieState selfieState) {
            super(null);
            this.backState = selfieState;
            this.selfies = CollectionsKt.j();
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public List<Selfie> o() {
            return this.selfies;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(this.backState, flags);
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\"\u0010#R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "posesNeeded", "", "autoCaptureSupported", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "<init>", "(Ljava/util/List;Ljava/util/List;ZLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Ljava/util/List;", "o", "()Ljava/util/List;", "i", "a", "v", "Z", "f", "()Z", "w", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "y", "J", "l", "()J", "z", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "A", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "b", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ShowPoseHint extends SelfieState implements com.withpersona.sdk2.inquiry.selfie.a {

        @NotNull
        public static final Parcelable.Creator<ShowPoseHint> CREATOR = new a();

        @NotNull
        private final PoseConfigs poseConfigs;

        @NotNull
        private final List<Selfie> selfies;

        @NotNull
        private final List<Selfie.b> posesNeeded;

        private final boolean autoCaptureSupported;

        @NotNull
        private final CameraProperties cameraProperties;

        private final long startSelfieTimestamp;

        private final SelfieState backState;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowPoseHint> {
            @Override
            @NotNull
            public final ShowPoseHint createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ShowPoseHint.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Selfie.b.valueOf(parcel.readString()));
                }
                return new ShowPoseHint(arrayList, arrayList2, parcel.readInt() != 0, (CameraProperties) parcel.readParcelable(ShowPoseHint.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(ShowPoseHint.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final ShowPoseHint[] newArray(int i) {
                return new ShowPoseHint[i];
            }
        }

        public ShowPoseHint(@NotNull List<? extends Selfie> list, @NotNull List<? extends Selfie.b> list2, boolean z, @NotNull CameraProperties cameraProperties, long j, SelfieState selfieState, @NotNull PoseConfigs poseConfigs) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "selfies");
            Intrinsics.checkNotNullParameter(list2, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            this.selfies = list;
            this.posesNeeded = list2;
            this.autoCaptureSupported = z;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
        }

        @Override
        @NotNull
        public List<Selfie.b> a() {
            return this.posesNeeded;
        }

        @Override
        @NotNull
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @NotNull
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowPoseHint)) {
                return false;
            }
            ShowPoseHint showPoseHint = (ShowPoseHint) other;
            return Intrinsics.b(this.selfies, showPoseHint.selfies) && Intrinsics.b(this.posesNeeded, showPoseHint.posesNeeded) && this.autoCaptureSupported == showPoseHint.autoCaptureSupported && Intrinsics.b(this.cameraProperties, showPoseHint.cameraProperties) && this.startSelfieTimestamp == showPoseHint.startSelfieTimestamp && Intrinsics.b(this.backState, showPoseHint.backState) && Intrinsics.b(this.poseConfigs, showPoseHint.poseConfigs);
        }

        public final boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.selfies.hashCode() * 31) + this.posesNeeded.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            return ((iHashCode + (selfieState == null ? 0 : selfieState.hashCode())) * 31) + this.poseConfigs.hashCode();
        }

        @Override
        public Selfie.b k() {
            return a.C0155a.c(this);
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public List<Selfie> o() {
            return this.selfies;
        }

        @NotNull
        public String toString() {
            return "ShowPoseHint(selfies=" + this.selfies + ", posesNeeded=" + this.posesNeeded + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            List<Selfie> list = this.selfies;
            parcel.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            List<Selfie.b> list2 = this.posesNeeded;
            parcel.writeInt(list2.size());
            Iterator<Selfie.b> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeString(it2.next().name());
            }
            parcel.writeInt(this.autoCaptureSupported ? 1 : 0);
            parcel.writeParcelable(this.cameraProperties, flags);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(parcel, flags);
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R&\u0010=\u001a\b\u0012\u0004\u0012\u0002080\u00038\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b9\u0010#\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010%¨\u0006>"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "posesNeeded", "", "startCaptureTimestamp", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "startSelfieTimestamp", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "<init>", "(Ljava/util/List;JLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Ljava/util/List;", "a", "()Ljava/util/List;", "i", "J", "d", "()J", "v", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "w", "l", "y", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "z", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "b", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "A", "o", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class StartCaptureFaceDetected extends SelfieState implements com.withpersona.sdk2.inquiry.selfie.a {

        @NotNull
        public static final Parcelable.Creator<StartCaptureFaceDetected> CREATOR = new a();

        @NotNull
        private final List<Selfie> selfies;

        @NotNull
        private final List<Selfie.b> posesNeeded;

        private final long startCaptureTimestamp;

        @NotNull
        private final CameraProperties cameraProperties;

        private final long startSelfieTimestamp;

        private final SelfieState backState;

        @NotNull
        private final PoseConfigs poseConfigs;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StartCaptureFaceDetected> {
            @Override
            @NotNull
            public final StartCaptureFaceDetected createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Selfie.b.valueOf(parcel.readString()));
                }
                return new StartCaptureFaceDetected(arrayList, parcel.readLong(), (CameraProperties) parcel.readParcelable(StartCaptureFaceDetected.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(StartCaptureFaceDetected.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final StartCaptureFaceDetected[] newArray(int i) {
                return new StartCaptureFaceDetected[i];
            }
        }

        public StartCaptureFaceDetected(@NotNull List<? extends Selfie.b> list, long j, @NotNull CameraProperties cameraProperties, long j2, SelfieState selfieState, @NotNull PoseConfigs poseConfigs) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            this.posesNeeded = list;
            this.startCaptureTimestamp = j;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j2;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.selfies = CollectionsKt.j();
        }

        @Override
        @NotNull
        public List<Selfie.b> a() {
            return this.posesNeeded;
        }

        @Override
        @NotNull
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @NotNull
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        public final long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartCaptureFaceDetected)) {
                return false;
            }
            StartCaptureFaceDetected startCaptureFaceDetected = (StartCaptureFaceDetected) other;
            return Intrinsics.b(this.posesNeeded, startCaptureFaceDetected.posesNeeded) && this.startCaptureTimestamp == startCaptureFaceDetected.startCaptureTimestamp && Intrinsics.b(this.cameraProperties, startCaptureFaceDetected.cameraProperties) && this.startSelfieTimestamp == startCaptureFaceDetected.startSelfieTimestamp && Intrinsics.b(this.backState, startCaptureFaceDetected.backState) && Intrinsics.b(this.poseConfigs, startCaptureFaceDetected.poseConfigs);
        }

        public int hashCode() {
            int iHashCode = ((((((this.posesNeeded.hashCode() * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            return ((iHashCode + (selfieState == null ? 0 : selfieState.hashCode())) * 31) + this.poseConfigs.hashCode();
        }

        @Override
        @NotNull
        public PoseConfig i() {
            return a.C0155a.b(this);
        }

        @Override
        public Selfie.b k() {
            return a.C0155a.c(this);
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public List<Selfie> o() {
            return this.selfies;
        }

        @NotNull
        public String toString() {
            return "StartCaptureFaceDetected(posesNeeded=" + this.posesNeeded + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            List<Selfie.b> list = this.posesNeeded;
            parcel.writeInt(list.size());
            Iterator<Selfie.b> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().name());
            }
            parcel.writeLong(this.startCaptureTimestamp);
            parcel.writeParcelable(this.cameraProperties, flags);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(parcel, flags);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Ljava/util/List;", "o", "()Ljava/util/List;", "i", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "v", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "w", "J", "l", "()J", "y", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Submit extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<Submit> CREATOR = new a();

        @NotNull
        private final List<Selfie> selfies;

        private final String webRtcObjectId;

        @NotNull
        private final CameraProperties cameraProperties;

        private final long startSelfieTimestamp;

        private final SelfieState backState;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Submit> {
            @Override
            @NotNull
            public final Submit createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Submit.class.getClassLoader()));
                }
                return new Submit(arrayList, parcel.readString(), (CameraProperties) parcel.readParcelable(Submit.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(Submit.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final Submit[] newArray(int i) {
                return new Submit[i];
            }
        }

        public Submit(@NotNull List<? extends Selfie> list, String str, @NotNull CameraProperties cameraProperties, long j, SelfieState selfieState) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.selfies = list;
            this.webRtcObjectId = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
        }

        @NotNull
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public List<Selfie> o() {
            return this.selfies;
        }

        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            List<Selfie> list = this.selfies;
            parcel.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            parcel.writeString(this.webRtcObjectId);
            parcel.writeParcelable(this.cameraProperties, flags);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, flags);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJJ\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R&\u00108\u001a\b\u0012\u0004\u0012\u0002030\u00078\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b4\u0010,\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010.¨\u00069"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "", "hasRequestedCameraPermissions", "hasRequestedAudioPermissions", "backState", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "posesNeeded", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "<init>", "(ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;)V", "q", "(ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Z", "t", "()Z", "i", "s", "v", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "w", "Ljava/util/List;", "a", "()Ljava/util/List;", "y", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "b", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "z", "o", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class WaitForCameraFeed extends SelfieState implements com.withpersona.sdk2.inquiry.selfie.a {

        @NotNull
        public static final Parcelable.Creator<WaitForCameraFeed> CREATOR = new a();

        private final boolean hasRequestedCameraPermissions;

        private final boolean hasRequestedAudioPermissions;

        private final SelfieState backState;

        @NotNull
        private final List<Selfie.b> posesNeeded;

        @NotNull
        private final PoseConfigs poseConfigs;

        @NotNull
        private final List<Selfie> selfies;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WaitForCameraFeed> {
            @Override
            @NotNull
            public final WaitForCameraFeed createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                SelfieState selfieState = (SelfieState) parcel.readParcelable(WaitForCameraFeed.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Selfie.b.valueOf(parcel.readString()));
                }
                return new WaitForCameraFeed(z, z2, selfieState, arrayList, PoseConfigs.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final WaitForCameraFeed[] newArray(int i) {
                return new WaitForCameraFeed[i];
            }
        }

        public WaitForCameraFeed(boolean z, boolean z2, SelfieState selfieState, List list, PoseConfigs poseConfigs, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, selfieState, list, poseConfigs);
        }

        public static WaitForCameraFeed r(WaitForCameraFeed waitForCameraFeed, boolean z, boolean z2, SelfieState selfieState, List list, PoseConfigs poseConfigs, int i, Object obj) {
            if ((i & 1) != 0) {
                z = waitForCameraFeed.hasRequestedCameraPermissions;
            }
            if ((i & 2) != 0) {
                z2 = waitForCameraFeed.hasRequestedAudioPermissions;
            }
            boolean z3 = z2;
            if ((i & 4) != 0) {
                selfieState = waitForCameraFeed.backState;
            }
            SelfieState selfieState2 = selfieState;
            if ((i & 8) != 0) {
                list = waitForCameraFeed.posesNeeded;
            }
            List list2 = list;
            if ((i & 16) != 0) {
                poseConfigs = waitForCameraFeed.poseConfigs;
            }
            return waitForCameraFeed.q(z, z3, selfieState2, list2, poseConfigs);
        }

        @Override
        @NotNull
        public List<Selfie.b> a() {
            return this.posesNeeded;
        }

        @Override
        @NotNull
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitForCameraFeed)) {
                return false;
            }
            WaitForCameraFeed waitForCameraFeed = (WaitForCameraFeed) other;
            return this.hasRequestedCameraPermissions == waitForCameraFeed.hasRequestedCameraPermissions && this.hasRequestedAudioPermissions == waitForCameraFeed.hasRequestedAudioPermissions && Intrinsics.b(this.backState, waitForCameraFeed.backState) && Intrinsics.b(this.posesNeeded, waitForCameraFeed.posesNeeded) && Intrinsics.b(this.poseConfigs, waitForCameraFeed.poseConfigs);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.hasRequestedCameraPermissions) * 31) + Boolean.hashCode(this.hasRequestedAudioPermissions)) * 31;
            SelfieState selfieState = this.backState;
            return ((((iHashCode + (selfieState == null ? 0 : selfieState.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31) + this.poseConfigs.hashCode();
        }

        @Override
        public Selfie.b k() {
            return a.C0155a.c(this);
        }

        @Override
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public List<Selfie> o() {
            return this.selfies;
        }

        @NotNull
        public final WaitForCameraFeed q(boolean hasRequestedCameraPermissions, boolean hasRequestedAudioPermissions, SelfieState backState, @NotNull List<? extends Selfie.b> posesNeeded, @NotNull PoseConfigs poseConfigs) {
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            return new WaitForCameraFeed(hasRequestedCameraPermissions, hasRequestedAudioPermissions, backState, posesNeeded, poseConfigs);
        }

        public final boolean getHasRequestedAudioPermissions() {
            return this.hasRequestedAudioPermissions;
        }

        public final boolean getHasRequestedCameraPermissions() {
            return this.hasRequestedCameraPermissions;
        }

        @NotNull
        public String toString() {
            return "WaitForCameraFeed(hasRequestedCameraPermissions=" + this.hasRequestedCameraPermissions + ", hasRequestedAudioPermissions=" + this.hasRequestedAudioPermissions + ", backState=" + this.backState + ", posesNeeded=" + this.posesNeeded + ", poseConfigs=" + this.poseConfigs + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.hasRequestedCameraPermissions ? 1 : 0);
            parcel.writeInt(this.hasRequestedAudioPermissions ? 1 : 0);
            parcel.writeParcelable(this.backState, flags);
            List<Selfie.b> list = this.posesNeeded;
            parcel.writeInt(list.size());
            Iterator<Selfie.b> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().name());
            }
            this.poseConfigs.writeToParcel(parcel, flags);
        }

        public WaitForCameraFeed(boolean z, boolean z2, SelfieState selfieState, @NotNull List<? extends Selfie.b> list, @NotNull PoseConfigs poseConfigs) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            this.hasRequestedCameraPermissions = z;
            this.hasRequestedAudioPermissions = z2;
            this.backState = selfieState;
            this.posesNeeded = list;
            this.poseConfigs = poseConfigs;
            this.selfies = CollectionsKt.j();
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R&\u0010>\u001a\b\u0012\u0004\u0012\u0002090\n8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b:\u00102\u0012\u0004\b<\u0010=\u001a\u0004\b;\u00104¨\u0006?"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "", "webRtcJwt", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "posesNeeded", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Ljava/lang/String;", "q", "i", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "v", "J", "l", "()J", "w", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "y", "Ljava/util/List;", "a", "()Ljava/util/List;", "z", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "b", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "A", "o", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class WaitForWebRtcSetup extends SelfieState implements com.withpersona.sdk2.inquiry.selfie.a {

        @NotNull
        public static final Parcelable.Creator<WaitForWebRtcSetup> CREATOR = new a();

        @NotNull
        private final List<Selfie> selfies;

        private final String webRtcJwt;

        @NotNull
        private final CameraProperties cameraProperties;

        private final long startSelfieTimestamp;

        private final SelfieState backState;

        @NotNull
        private final List<Selfie.b> posesNeeded;

        @NotNull
        private final PoseConfigs poseConfigs;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WaitForWebRtcSetup> {
            @Override
            @NotNull
            public final WaitForWebRtcSetup createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(WaitForWebRtcSetup.class.getClassLoader());
                long j = parcel.readLong();
                SelfieState selfieState = (SelfieState) parcel.readParcelable(WaitForWebRtcSetup.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Selfie.b.valueOf(parcel.readString()));
                }
                return new WaitForWebRtcSetup(string, cameraProperties, j, selfieState, arrayList, PoseConfigs.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final WaitForWebRtcSetup[] newArray(int i) {
                return new WaitForWebRtcSetup[i];
            }
        }

        public WaitForWebRtcSetup(String str, @NotNull CameraProperties cameraProperties, long j, SelfieState selfieState, @NotNull List<? extends Selfie.b> list, @NotNull PoseConfigs poseConfigs) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(list, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            this.webRtcJwt = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
            this.posesNeeded = list;
            this.poseConfigs = poseConfigs;
            this.selfies = CollectionsKt.j();
        }

        @Override
        @NotNull
        public List<Selfie.b> a() {
            return this.posesNeeded;
        }

        @Override
        @NotNull
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @NotNull
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitForWebRtcSetup)) {
                return false;
            }
            WaitForWebRtcSetup waitForWebRtcSetup = (WaitForWebRtcSetup) other;
            return Intrinsics.b(this.webRtcJwt, waitForWebRtcSetup.webRtcJwt) && Intrinsics.b(this.cameraProperties, waitForWebRtcSetup.cameraProperties) && this.startSelfieTimestamp == waitForWebRtcSetup.startSelfieTimestamp && Intrinsics.b(this.backState, waitForWebRtcSetup.backState) && Intrinsics.b(this.posesNeeded, waitForWebRtcSetup.posesNeeded) && Intrinsics.b(this.poseConfigs, waitForWebRtcSetup.poseConfigs);
        }

        public int hashCode() {
            String str = this.webRtcJwt;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            return ((((iHashCode + (selfieState != null ? selfieState.hashCode() : 0)) * 31) + this.posesNeeded.hashCode()) * 31) + this.poseConfigs.hashCode();
        }

        @Override
        public Selfie.b k() {
            return a.C0155a.c(this);
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public List<Selfie> o() {
            return this.selfies;
        }

        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        @NotNull
        public String toString() {
            return "WaitForWebRtcSetup(webRtcJwt=" + this.webRtcJwt + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", posesNeeded=" + this.posesNeeded + ", poseConfigs=" + this.poseConfigs + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.webRtcJwt);
            parcel.writeParcelable(this.cameraProperties, flags);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, flags);
            List<Selfie.b> list = this.posesNeeded;
            parcel.writeInt(list.size());
            Iterator<Selfie.b> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().name());
            }
            this.poseConfigs.writeToParcel(parcel, flags);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Ljava/util/List;", "o", "()Ljava/util/List;", "i", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "v", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "w", "J", "l", "()J", "y", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class WebRtcFinished extends SelfieState {

        @NotNull
        public static final Parcelable.Creator<WebRtcFinished> CREATOR = new a();

        @NotNull
        private final List<Selfie> selfies;

        @NotNull
        private final String webRtcObjectId;

        @NotNull
        private final CameraProperties cameraProperties;

        private final long startSelfieTimestamp;

        private final SelfieState backState;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WebRtcFinished> {
            @Override
            @NotNull
            public final WebRtcFinished createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(WebRtcFinished.class.getClassLoader()));
                }
                return new WebRtcFinished(arrayList, parcel.readString(), (CameraProperties) parcel.readParcelable(WebRtcFinished.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(WebRtcFinished.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final WebRtcFinished[] newArray(int i) {
                return new WebRtcFinished[i];
            }
        }

        public WebRtcFinished(@NotNull List<? extends Selfie> list, @NotNull String str, @NotNull CameraProperties cameraProperties, long j, SelfieState selfieState) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "selfies");
            Intrinsics.checkNotNullParameter(str, "webRtcObjectId");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.selfies = list;
            this.webRtcObjectId = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
        }

        @NotNull
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public List<Selfie> o() {
            return this.selfies;
        }

        @NotNull
        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            List<Selfie> list = this.selfies;
            parcel.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            parcel.writeString(this.webRtcObjectId);
            parcel.writeParcelable(this.cameraProperties, flags);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, flags);
        }
    }

    public SelfieState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract SelfieState getBackState();

    @NotNull
    public abstract List<Selfie> o();

    public final void p(boolean z) {
        this.didGoBack = z;
    }

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Be\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jz\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b'\u0010(R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u00106R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/b;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "posesNeeded", "LV8/l;", "selfieError", "", "startCaptureTimestamp", "", "autoCaptureSupported", "startSelfieTimestamp", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "<init>", "(Ljava/util/List;Ljava/util/List;LV8/l;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;)V", "q", "(Ljava/util/List;Ljava/util/List;LV8/l;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Ljava/util/List;", "o", "()Ljava/util/List;", "i", "a", "v", "LV8/l;", "s", "()LV8/l;", "w", "J", "d", "()J", "y", "Z", "f", "()Z", "z", "l", "A", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "B", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "C", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "b", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Capture extends SelfieState implements b {

        @NotNull
        public static final Parcelable.Creator<Capture> CREATOR = new a();

        @NotNull
        private final CameraProperties cameraProperties;

        private final SelfieState backState;

        @NotNull
        private final PoseConfigs poseConfigs;

        @NotNull
        private final List<Selfie> selfies;

        @NotNull
        private final List<Selfie.b> posesNeeded;

        private final V8.l selfieError;

        private final long startCaptureTimestamp;

        private final boolean autoCaptureSupported;

        private final long startSelfieTimestamp;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Capture> {
            @Override
            @NotNull
            public final Capture createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Capture.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Selfie.b.valueOf(parcel.readString()));
                }
                return new Capture(arrayList, arrayList2, parcel.readInt() == 0 ? null : V8.l.valueOf(parcel.readString()), parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), (CameraProperties) parcel.readParcelable(Capture.class.getClassLoader()), (SelfieState) parcel.readParcelable(Capture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final Capture[] newArray(int i) {
                return new Capture[i];
            }
        }

        public Capture(List list, List list2, V8.l lVar, long j, boolean z, long j2, CameraProperties cameraProperties, SelfieState selfieState, PoseConfigs poseConfigs, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.j() : list, list2, (i & 4) != 0 ? null : lVar, j, (i & 16) != 0 ? true : z, j2, cameraProperties, selfieState, poseConfigs);
        }

        @Override
        @NotNull
        public List<Selfie.b> a() {
            return this.posesNeeded;
        }

        @Override
        @NotNull
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override
        @NotNull
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override
        public long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Capture)) {
                return false;
            }
            Capture capture = (Capture) other;
            return Intrinsics.b(this.selfies, capture.selfies) && Intrinsics.b(this.posesNeeded, capture.posesNeeded) && this.selfieError == capture.selfieError && this.startCaptureTimestamp == capture.startCaptureTimestamp && this.autoCaptureSupported == capture.autoCaptureSupported && this.startSelfieTimestamp == capture.startSelfieTimestamp && Intrinsics.b(this.cameraProperties, capture.cameraProperties) && Intrinsics.b(this.backState, capture.backState) && Intrinsics.b(this.poseConfigs, capture.poseConfigs);
        }

        @Override
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override
        public boolean g() {
            return b.a.d(this);
        }

        @Override
        @NotNull
        public Selfie.b h() {
            return b.a.a(this);
        }

        public int hashCode() {
            int iHashCode = ((this.selfies.hashCode() * 31) + this.posesNeeded.hashCode()) * 31;
            V8.l lVar = this.selfieError;
            int iHashCode2 = (((((((((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + this.cameraProperties.hashCode()) * 31;
            SelfieState selfieState = this.backState;
            return ((iHashCode2 + (selfieState != null ? selfieState.hashCode() : 0)) * 31) + this.poseConfigs.hashCode();
        }

        @Override
        @NotNull
        public PoseConfig i() {
            return b.a.b(this);
        }

        @Override
        public Selfie.b k() {
            return b.a.c(this);
        }

        @Override
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public List<Selfie> o() {
            return this.selfies;
        }

        @NotNull
        public final Capture q(@NotNull List<? extends Selfie> selfies, @NotNull List<? extends Selfie.b> posesNeeded, V8.l selfieError, long startCaptureTimestamp, boolean autoCaptureSupported, long startSelfieTimestamp, @NotNull CameraProperties cameraProperties, SelfieState backState, @NotNull PoseConfigs poseConfigs) {
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            return new Capture(selfies, posesNeeded, selfieError, startCaptureTimestamp, autoCaptureSupported, startSelfieTimestamp, cameraProperties, backState, poseConfigs);
        }

        public final V8.l getSelfieError() {
            return this.selfieError;
        }

        @NotNull
        public String toString() {
            return "Capture(selfies=" + this.selfies + ", posesNeeded=" + this.posesNeeded + ", selfieError=" + this.selfieError + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", autoCaptureSupported=" + this.autoCaptureSupported + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", cameraProperties=" + this.cameraProperties + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            List<Selfie> list = this.selfies;
            parcel.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
            List<Selfie.b> list2 = this.posesNeeded;
            parcel.writeInt(list2.size());
            Iterator<Selfie.b> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeString(it2.next().name());
            }
            V8.l lVar = this.selfieError;
            if (lVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(lVar.name());
            }
            parcel.writeLong(this.startCaptureTimestamp);
            parcel.writeInt(this.autoCaptureSupported ? 1 : 0);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.cameraProperties, flags);
            parcel.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(parcel, flags);
        }

        public Capture(@NotNull List<? extends Selfie> list, @NotNull List<? extends Selfie.b> list2, V8.l lVar, long j, boolean z, long j2, @NotNull CameraProperties cameraProperties, SelfieState selfieState, @NotNull PoseConfigs poseConfigs) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "selfies");
            Intrinsics.checkNotNullParameter(list2, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            this.selfies = list;
            this.posesNeeded = list2;
            this.selfieError = lVar;
            this.startCaptureTimestamp = j;
            this.autoCaptureSupported = z;
            this.startSelfieTimestamp = j2;
            this.cameraProperties = cameraProperties;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
        }
    }

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jt\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010\f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010)\u001a\u0004\b9\u0010+R\u001a\u0010\r\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u00107R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR&\u0010M\u001a\b\u0012\u0004\u0012\u00020H0\u00078\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\bI\u00101\u0012\u0004\bK\u0010L\u001a\u0004\bJ\u00103¨\u0006N"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/b;", "", "centered", "LV8/l;", "selfieError", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "posesNeeded", "", "startCaptureTimestamp", "autoCaptureSupported", "startSelfieTimestamp", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "<init>", "(ZLV8/l;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;)V", "q", "(ZLV8/l;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Z", "s", "()Z", "i", "LV8/l;", "t", "()LV8/l;", "v", "Ljava/util/List;", "a", "()Ljava/util/List;", "w", "J", "d", "()J", "y", "f", "z", "l", "A", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "B", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "C", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "b", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "D", "o", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class StartCapture extends SelfieState implements b {

        @NotNull
        public static final Parcelable.Creator<StartCapture> CREATOR = new a();

        @NotNull
        private final CameraProperties cameraProperties;

        private final SelfieState backState;

        @NotNull
        private final PoseConfigs poseConfigs;

        @NotNull
        private final List<Selfie> selfies;

        private final boolean centered;

        private final V8.l selfieError;

        @NotNull
        private final List<Selfie.b> posesNeeded;

        private final long startCaptureTimestamp;

        private final boolean autoCaptureSupported;

        private final long startSelfieTimestamp;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StartCapture> {
            @Override
            @NotNull
            public final StartCapture createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z = parcel.readInt() != 0;
                V8.l lVarValueOf = parcel.readInt() == 0 ? null : V8.l.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Selfie.b.valueOf(parcel.readString()));
                }
                return new StartCapture(z, lVarValueOf, arrayList, parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), (CameraProperties) parcel.readParcelable(StartCapture.class.getClassLoader()), (SelfieState) parcel.readParcelable(StartCapture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final StartCapture[] newArray(int i) {
                return new StartCapture[i];
            }
        }

        public StartCapture(boolean z, V8.l lVar, List list, long j, boolean z2, long j2, CameraProperties cameraProperties, SelfieState selfieState, PoseConfigs poseConfigs, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? V8.l.d : lVar, list, j, (i & 16) != 0 ? true : z2, j2, cameraProperties, selfieState, poseConfigs);
        }

        @Override
        @NotNull
        public List<Selfie.b> a() {
            return this.posesNeeded;
        }

        @Override
        @NotNull
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override
        @NotNull
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override
        public long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartCapture)) {
                return false;
            }
            StartCapture startCapture = (StartCapture) other;
            return this.centered == startCapture.centered && this.selfieError == startCapture.selfieError && Intrinsics.b(this.posesNeeded, startCapture.posesNeeded) && this.startCaptureTimestamp == startCapture.startCaptureTimestamp && this.autoCaptureSupported == startCapture.autoCaptureSupported && this.startSelfieTimestamp == startCapture.startSelfieTimestamp && Intrinsics.b(this.cameraProperties, startCapture.cameraProperties) && Intrinsics.b(this.backState, startCapture.backState) && Intrinsics.b(this.poseConfigs, startCapture.poseConfigs);
        }

        @Override
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override
        public boolean g() {
            return b.a.d(this);
        }

        @Override
        @NotNull
        public Selfie.b h() {
            return b.a.a(this);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.centered) * 31;
            V8.l lVar = this.selfieError;
            int iHashCode2 = (((((((((((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + this.cameraProperties.hashCode()) * 31;
            SelfieState selfieState = this.backState;
            return ((iHashCode2 + (selfieState != null ? selfieState.hashCode() : 0)) * 31) + this.poseConfigs.hashCode();
        }

        @Override
        @NotNull
        public PoseConfig i() {
            return b.a.b(this);
        }

        @Override
        public Selfie.b k() {
            return b.a.c(this);
        }

        @Override
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override
        @NotNull
        public List<Selfie> o() {
            return this.selfies;
        }

        @NotNull
        public final StartCapture q(boolean centered, V8.l selfieError, @NotNull List<? extends Selfie.b> posesNeeded, long startCaptureTimestamp, boolean autoCaptureSupported, long startSelfieTimestamp, @NotNull CameraProperties cameraProperties, SelfieState backState, @NotNull PoseConfigs poseConfigs) {
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            return new StartCapture(centered, selfieError, posesNeeded, startCaptureTimestamp, autoCaptureSupported, startSelfieTimestamp, cameraProperties, backState, poseConfigs);
        }

        public final boolean getCentered() {
            return this.centered;
        }

        public final V8.l getSelfieError() {
            return this.selfieError;
        }

        @NotNull
        public String toString() {
            return "StartCapture(centered=" + this.centered + ", selfieError=" + this.selfieError + ", posesNeeded=" + this.posesNeeded + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", autoCaptureSupported=" + this.autoCaptureSupported + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", cameraProperties=" + this.cameraProperties + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.centered ? 1 : 0);
            V8.l lVar = this.selfieError;
            if (lVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(lVar.name());
            }
            List<Selfie.b> list = this.posesNeeded;
            parcel.writeInt(list.size());
            Iterator<Selfie.b> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().name());
            }
            parcel.writeLong(this.startCaptureTimestamp);
            parcel.writeInt(this.autoCaptureSupported ? 1 : 0);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.cameraProperties, flags);
            parcel.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(parcel, flags);
        }

        public StartCapture(boolean z, V8.l lVar, @NotNull List<? extends Selfie.b> list, long j, boolean z2, long j2, @NotNull CameraProperties cameraProperties, SelfieState selfieState, @NotNull PoseConfigs poseConfigs) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            this.centered = z;
            this.selfieError = lVar;
            this.posesNeeded = list;
            this.startCaptureTimestamp = j;
            this.autoCaptureSupported = z2;
            this.startSelfieTimestamp = j2;
            this.cameraProperties = cameraProperties;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.selfies = CollectionsKt.j();
        }
    }

    private SelfieState() {
    }
}
