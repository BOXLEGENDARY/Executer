package com.withpersona.sdk2.camera;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\rR\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/withpersona/sdk2/camera/CameraProperties;", "Landroid/os/Parcelable;", "", "label", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "facingMode", "Landroid/util/Size;", "size", "", "frameRate", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties$b;Landroid/util/Size;I)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "b", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "i", "Landroid/util/Size;", "f", "()Landroid/util/Size;", "v", "I", "c", "", "a", "()D", "aspectRatio", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class CameraProperties implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CameraProperties> CREATOR = new a();

    @NotNull
    private final String label;

    @NotNull
    private final b facingMode;

    @NotNull
    private final Size size;

    private final int frameRate;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CameraProperties> {
        @Override
        @NotNull
        public final CameraProperties createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CameraProperties(parcel.readString(), b.valueOf(parcel.readString()), parcel.readSize(), parcel.readInt());
        }

        @Override
        @NotNull
        public final CameraProperties[] newArray(int i) {
            return new CameraProperties[i];
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/camera/CameraProperties$b;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b {
        public static final b d = new b("User", 0);
        public static final b e = new b("Environment", 1);
        public static final b i = new b("Unknown", 2);
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

    public CameraProperties() {
        this(null, null, null, 0, 15, null);
    }

    public final double a() {
        if (this.size.getHeight() == 0) {
            return 0.0d;
        }
        return this.size.getWidth() / this.size.getHeight();
    }

    @NotNull
    public final b getFacingMode() {
        return this.facingMode;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final Size getSize() {
        return this.size;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.label);
        parcel.writeString(this.facingMode.name());
        parcel.writeSize(this.size);
        parcel.writeInt(this.frameRate);
    }

    public CameraProperties(@NotNull String str, @NotNull b bVar, @NotNull Size size, int i) {
        Intrinsics.checkNotNullParameter(str, "label");
        Intrinsics.checkNotNullParameter(bVar, "facingMode");
        Intrinsics.checkNotNullParameter(size, "size");
        this.label = str;
        this.facingMode = bVar;
        this.size = size;
        this.frameRate = i;
    }

    public CameraProperties(String str, b bVar, Size size, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? b.i : bVar, (i2 & 4) != 0 ? new Size(0, 0) : size, (i2 & 8) != 0 ? 0 : i);
    }
}
