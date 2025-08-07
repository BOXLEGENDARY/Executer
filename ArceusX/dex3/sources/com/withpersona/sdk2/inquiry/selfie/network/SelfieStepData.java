package com.withpersona.sdk2.inquiry.selfie.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006&"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SelfieStepData;", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "", "stepName", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "centerCapture", "leftCapture", "rightCapture", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "b", "e", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "a", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "i", "getLeftCapture", "v", "getRightCapture", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class SelfieStepData implements StepData {

    @NotNull
    public static final Parcelable.Creator<SelfieStepData> CREATOR = new a();

    @NotNull
    private final String stepName;

    private final Selfie centerCapture;

    private final Selfie leftCapture;

    private final Selfie rightCapture;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelfieStepData> {
        @Override
        @NotNull
        public final SelfieStepData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelfieStepData(parcel.readString(), (Selfie) parcel.readParcelable(SelfieStepData.class.getClassLoader()), (Selfie) parcel.readParcelable(SelfieStepData.class.getClassLoader()), (Selfie) parcel.readParcelable(SelfieStepData.class.getClassLoader()));
        }

        @Override
        @NotNull
        public final SelfieStepData[] newArray(int i) {
            return new SelfieStepData[i];
        }
    }

    public SelfieStepData(@NotNull String str, Selfie selfie, Selfie selfie2, Selfie selfie3) {
        Intrinsics.checkNotNullParameter(str, "stepName");
        this.stepName = str;
        this.centerCapture = selfie;
        this.leftCapture = selfie2;
        this.rightCapture = selfie3;
    }

    public final Selfie getCenterCapture() {
        return this.centerCapture;
    }

    @NotNull
    public String getStepName() {
        return this.stepName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieStepData)) {
            return false;
        }
        SelfieStepData selfieStepData = (SelfieStepData) other;
        return Intrinsics.b(this.stepName, selfieStepData.stepName) && Intrinsics.b(this.centerCapture, selfieStepData.centerCapture) && Intrinsics.b(this.leftCapture, selfieStepData.leftCapture) && Intrinsics.b(this.rightCapture, selfieStepData.rightCapture);
    }

    public int hashCode() {
        int iHashCode = this.stepName.hashCode() * 31;
        Selfie selfie = this.centerCapture;
        int iHashCode2 = (iHashCode + (selfie == null ? 0 : selfie.hashCode())) * 31;
        Selfie selfie2 = this.leftCapture;
        int iHashCode3 = (iHashCode2 + (selfie2 == null ? 0 : selfie2.hashCode())) * 31;
        Selfie selfie3 = this.rightCapture;
        return iHashCode3 + (selfie3 != null ? selfie3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SelfieStepData(stepName=" + this.stepName + ", centerCapture=" + this.centerCapture + ", leftCapture=" + this.leftCapture + ", rightCapture=" + this.rightCapture + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.stepName);
        parcel.writeParcelable(this.centerCapture, flags);
        parcel.writeParcelable(this.leftCapture, flags);
        parcel.writeParcelable(this.rightCapture, flags);
    }
}
