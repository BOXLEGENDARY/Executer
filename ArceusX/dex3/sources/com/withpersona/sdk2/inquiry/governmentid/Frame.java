package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "Landroid/os/Parcelable;", "", "absoluteFilePath", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "a", "e", "b", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class Frame implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Frame> CREATOR = new a();

    @NotNull
    private final String absoluteFilePath;

    @NotNull
    private final String mimeType;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Frame> {
        @Override
        @NotNull
        public final Frame createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Frame(parcel.readString(), parcel.readString());
        }

        @Override
        @NotNull
        public final Frame[] newArray(int i) {
            return new Frame[i];
        }
    }

    public Frame(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "absoluteFilePath");
        Intrinsics.checkNotNullParameter(str2, "mimeType");
        this.absoluteFilePath = str;
        this.mimeType = str2;
    }

    @NotNull
    public final String getAbsoluteFilePath() {
        return this.absoluteFilePath;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) other;
        return Intrinsics.b(this.absoluteFilePath, frame.absoluteFilePath) && Intrinsics.b(this.mimeType, frame.mimeType);
    }

    public int hashCode() {
        return (this.absoluteFilePath.hashCode() * 31) + this.mimeType.hashCode();
    }

    @NotNull
    public String toString() {
        return "Frame(absoluteFilePath=" + this.absoluteFilePath + ", mimeType=" + this.mimeType + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.absoluteFilePath);
        parcel.writeString(this.mimeType);
    }

    public Frame(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String fileExtensionFromUrl;
        if ((i & 2) != 0 && ((fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str)) == null || (str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) == null)) {
            str2 = "image/*";
        }
        this(str, str2);
    }
}
