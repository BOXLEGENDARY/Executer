package com.withpersona.sdk2.inquiry.document;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "Landroid/os/Parcelable;", "()V", "Local", "Remote", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class DocumentFile implements Parcelable {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "", "absoluteFilePath", "Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;", "captureMethod", "", "uploadProgress", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;I)Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "c", "e", "Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;", "()Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;", "i", "I", "f", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Local extends DocumentFile {

        @NotNull
        public static final Parcelable.Creator<Local> CREATOR = new a();

        @NotNull
        private final String absoluteFilePath;

        @NotNull
        private final CaptureMethod captureMethod;

        private final int uploadProgress;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Local> {
            @Override
            @NotNull
            public final Local createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Local(parcel.readString(), CaptureMethod.CREATOR.createFromParcel(parcel), parcel.readInt());
            }

            @Override
            @NotNull
            public final Local[] newArray(int i) {
                return new Local[i];
            }
        }

        public Local(String str, CaptureMethod captureMethod, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, captureMethod, (i2 & 4) != 0 ? 0 : i);
        }

        public static Local b(Local local, String str, CaptureMethod captureMethod, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = local.absoluteFilePath;
            }
            if ((i2 & 2) != 0) {
                captureMethod = local.captureMethod;
            }
            if ((i2 & 4) != 0) {
                i = local.uploadProgress;
            }
            return local.a(str, captureMethod, i);
        }

        @NotNull
        public final Local a(@NotNull String absoluteFilePath, @NotNull CaptureMethod captureMethod, int uploadProgress) {
            Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            return new Local(absoluteFilePath, captureMethod, uploadProgress);
        }

        @NotNull
        public final String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        @NotNull
        public final CaptureMethod getCaptureMethod() {
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
            if (!Intrinsics.b(Local.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.e(other, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentFile.Local");
            return Intrinsics.b(this.absoluteFilePath, ((Local) other).absoluteFilePath);
        }

        public final int getUploadProgress() {
            return this.uploadProgress;
        }

        public int hashCode() {
            return this.absoluteFilePath.hashCode();
        }

        @NotNull
        public String toString() {
            return "Local(absoluteFilePath=" + this.absoluteFilePath + ", captureMethod=" + this.captureMethod + ", uploadProgress=" + this.uploadProgress + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.absoluteFilePath);
            this.captureMethod.writeToParcel(parcel, flags);
            parcel.writeInt(this.uploadProgress);
        }

        public Local(@NotNull String str, @NotNull CaptureMethod captureMethod, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "absoluteFilePath");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            this.absoluteFilePath = str;
            this.captureMethod = captureMethod;
            this.uploadProgress = i;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\n¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "", "absoluteFilePath", "filename", "remoteUrl", "documentFileId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "a", "e", "c", "i", "v", "b", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Remote extends DocumentFile {

        @NotNull
        public static final Parcelable.Creator<Remote> CREATOR = new a();

        private final String absoluteFilePath;

        private final String filename;

        @NotNull
        private final String remoteUrl;

        @NotNull
        private final String documentFileId;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Remote> {
            @Override
            @NotNull
            public final Remote createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Remote(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override
            @NotNull
            public final Remote[] newArray(int i) {
                return new Remote[i];
            }
        }

        public Remote(String str, String str2, @NotNull String str3, @NotNull String str4) {
            super(null);
            Intrinsics.checkNotNullParameter(str3, "remoteUrl");
            Intrinsics.checkNotNullParameter(str4, "documentFileId");
            this.absoluteFilePath = str;
            this.filename = str2;
            this.remoteUrl = str3;
            this.documentFileId = str4;
        }

        public final String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        @NotNull
        public final String getDocumentFileId() {
            return this.documentFileId;
        }

        public final String getFilename() {
            return this.filename;
        }

        @NotNull
        public final String getRemoteUrl() {
            return this.remoteUrl;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) other;
            return Intrinsics.b(this.absoluteFilePath, remote.absoluteFilePath) && Intrinsics.b(this.filename, remote.filename) && Intrinsics.b(this.remoteUrl, remote.remoteUrl) && Intrinsics.b(this.documentFileId, remote.documentFileId);
        }

        public int hashCode() {
            String str = this.absoluteFilePath;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.filename;
            return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.remoteUrl.hashCode()) * 31) + this.documentFileId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Remote(absoluteFilePath=" + this.absoluteFilePath + ", filename=" + this.filename + ", remoteUrl=" + this.remoteUrl + ", documentFileId=" + this.documentFileId + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.absoluteFilePath);
            parcel.writeString(this.filename);
            parcel.writeString(this.remoteUrl);
            parcel.writeString(this.documentFileId);
        }
    }

    public DocumentFile(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DocumentFile() {
    }
}
