package com.withpersona.sdk2.inquiry.document;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;", "", "Landroid/os/Parcelable;", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "e", "i", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class CaptureMethod implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CaptureMethod> CREATOR;
    public static final CaptureMethod e = new CaptureMethod("UPLOAD", 0, "upload");
    public static final CaptureMethod i = new CaptureMethod("MANUAL", 1, "manual");
    private static final CaptureMethod[] v;
    private static final T9.a w;

    @NotNull
    private final String type;

    static {
        CaptureMethod[] captureMethodArrC = c();
        v = captureMethodArrC;
        w = T9.b.a(captureMethodArrC);
        CREATOR = new Parcelable.Creator<CaptureMethod>() {
            @Override
            @NotNull
            public final CaptureMethod createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return CaptureMethod.valueOf(parcel.readString());
            }

            @Override
            @NotNull
            public final CaptureMethod[] newArray(int i2) {
                return new CaptureMethod[i2];
            }
        };
    }

    private CaptureMethod(String str, int i2, String str2) {
        this.type = str2;
    }

    private static final CaptureMethod[] c() {
        return new CaptureMethod[]{e, i};
    }

    public static CaptureMethod valueOf(String str) {
        return (CaptureMethod) Enum.valueOf(CaptureMethod.class, str);
    }

    public static CaptureMethod[] values() {
        return (CaptureMethod[]) v.clone();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(name());
    }
}
