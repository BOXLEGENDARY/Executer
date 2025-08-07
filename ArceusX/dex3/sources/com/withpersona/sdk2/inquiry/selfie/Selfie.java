package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0005\t\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "Landroid/os/Parcelable;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "absoluteFilePath", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "b", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "captureMethod", "SelfieImage", "SelfieVideo", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieVideo;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class Selfie implements Parcelable {

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001d\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "", "absoluteFilePath", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "captureMethod", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "pose", "", "capturedTimestamp", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "a", "e", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "b", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "i", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "v", "J", "c", "()J", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class SelfieImage extends Selfie {

        @NotNull
        public static final Parcelable.Creator<SelfieImage> CREATOR = new a();

        @NotNull
        private final String absoluteFilePath;

        @NotNull
        private final a captureMethod;

        @NotNull
        private final b pose;

        private final long capturedTimestamp;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelfieImage> {
            @Override
            @NotNull
            public final SelfieImage createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieImage(parcel.readString(), a.valueOf(parcel.readString()), b.valueOf(parcel.readString()), parcel.readLong());
            }

            @Override
            @NotNull
            public final SelfieImage[] newArray(int i) {
                return new SelfieImage[i];
            }
        }

        public SelfieImage(@NotNull String str, @NotNull a aVar, @NotNull b bVar, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "absoluteFilePath");
            Intrinsics.checkNotNullParameter(aVar, "captureMethod");
            Intrinsics.checkNotNullParameter(bVar, "pose");
            this.absoluteFilePath = str;
            this.captureMethod = aVar;
            this.pose = bVar;
            this.capturedTimestamp = j;
        }

        @Override
        @NotNull
        public String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        @Override
        @NotNull
        public a getCaptureMethod() {
            return this.captureMethod;
        }

        public final long getCapturedTimestamp() {
            return this.capturedTimestamp;
        }

        @NotNull
        public final b getPose() {
            return this.pose;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelfieImage)) {
                return false;
            }
            SelfieImage selfieImage = (SelfieImage) other;
            return Intrinsics.b(this.absoluteFilePath, selfieImage.absoluteFilePath) && this.captureMethod == selfieImage.captureMethod && this.pose == selfieImage.pose && this.capturedTimestamp == selfieImage.capturedTimestamp;
        }

        public int hashCode() {
            return (((((this.absoluteFilePath.hashCode() * 31) + this.captureMethod.hashCode()) * 31) + this.pose.hashCode()) * 31) + Long.hashCode(this.capturedTimestamp);
        }

        @NotNull
        public String toString() {
            return "SelfieImage(absoluteFilePath=" + this.absoluteFilePath + ", captureMethod=" + this.captureMethod + ", pose=" + this.pose + ", capturedTimestamp=" + this.capturedTimestamp + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.absoluteFilePath);
            parcel.writeString(this.captureMethod.name());
            parcel.writeString(this.pose.name());
            parcel.writeLong(this.capturedTimestamp);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieVideo;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "", "absoluteFilePath", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "captureMethod", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "a", "e", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "b", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class SelfieVideo extends Selfie {

        @NotNull
        public static final Parcelable.Creator<SelfieVideo> CREATOR = new a();

        @NotNull
        private final String absoluteFilePath;

        @NotNull
        private final a captureMethod;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelfieVideo> {
            @Override
            @NotNull
            public final SelfieVideo createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieVideo(parcel.readString(), a.valueOf(parcel.readString()));
            }

            @Override
            @NotNull
            public final SelfieVideo[] newArray(int i) {
                return new SelfieVideo[i];
            }
        }

        public SelfieVideo(@NotNull String str, @NotNull a aVar) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "absoluteFilePath");
            Intrinsics.checkNotNullParameter(aVar, "captureMethod");
            this.absoluteFilePath = str;
            this.captureMethod = aVar;
        }

        @Override
        @NotNull
        public String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        @Override
        @NotNull
        public a getCaptureMethod() {
            return this.captureMethod;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelfieVideo)) {
                return false;
            }
            SelfieVideo selfieVideo = (SelfieVideo) other;
            return Intrinsics.b(this.absoluteFilePath, selfieVideo.absoluteFilePath) && this.captureMethod == selfieVideo.captureMethod;
        }

        public int hashCode() {
            return (this.absoluteFilePath.hashCode() * 31) + this.captureMethod.hashCode();
        }

        @NotNull
        public String toString() {
            return "SelfieVideo(absoluteFilePath=" + this.absoluteFilePath + ", captureMethod=" + this.captureMethod + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.absoluteFilePath);
            parcel.writeString(this.captureMethod.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "", "", "method", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "d", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "i", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {
        public static final a e = new a("AUTO", 0, "auto");
        public static final a i = new a("MANUAL", 1, "manual");
        private static final a[] v;
        private static final T9.a w;

        @NotNull
        private final String method;

        static {
            a[] aVarArrC = c();
            v = aVarArrC;
            w = T9.b.a(aVarArrC);
        }

        private a(String str, int i2, String str2) {
            this.method = str2;
        }

        private static final a[] c() {
            return new a[]{e, i};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) v.clone();
        }

        @NotNull
        public final String getMethod() {
            return this.method;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b {
        public static final b d = new b("Center", 0);
        public static final b e = new b("Left", 1);
        public static final b i = new b("Right", 2);
        private static final b[] v;
        private static final T9.a w;

        static {
            b[] bVarArrC = c();
            v = bVarArrC;
            w = T9.b.a(bVarArrC);
        }

        private b(String str, int i2) {
        }

        private static final b[] c() {
            return new b[]{d, e, i};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) v.clone();
        }
    }

    public Selfie(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getAbsoluteFilePath();

    @NotNull
    public abstract a getCaptureMethod();

    private Selfie() {
    }
}
