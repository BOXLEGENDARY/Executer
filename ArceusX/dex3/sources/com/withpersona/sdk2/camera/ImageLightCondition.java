package com.withpersona.sdk2.camera;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000e¨\u0006&"}, d2 = {"Lcom/withpersona/sdk2/camera/ImageLightCondition;", "Landroid/os/Parcelable;", "", "luminosity", "rmsContrast", "lowHighContrast", "", "sampleSize", "<init>", "(DDDI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "D", "b", "()D", "e", "c", "i", "a", "v", "I", "getSampleSize", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class ImageLightCondition implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ImageLightCondition> CREATOR = new a();

    private final double luminosity;

    private final double rmsContrast;

    private final double lowHighContrast;

    private final int sampleSize;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImageLightCondition> {
        @Override
        @NotNull
        public final ImageLightCondition createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ImageLightCondition(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt());
        }

        @Override
        @NotNull
        public final ImageLightCondition[] newArray(int i) {
            return new ImageLightCondition[i];
        }
    }

    public ImageLightCondition(double d, double d2, double d3, int i) {
        this.luminosity = d;
        this.rmsContrast = d2;
        this.lowHighContrast = d3;
        this.sampleSize = i;
    }

    public final double getLowHighContrast() {
        return this.lowHighContrast;
    }

    public final double getLuminosity() {
        return this.luminosity;
    }

    public final double getRmsContrast() {
        return this.rmsContrast;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageLightCondition)) {
            return false;
        }
        ImageLightCondition imageLightCondition = (ImageLightCondition) other;
        return Double.compare(this.luminosity, imageLightCondition.luminosity) == 0 && Double.compare(this.rmsContrast, imageLightCondition.rmsContrast) == 0 && Double.compare(this.lowHighContrast, imageLightCondition.lowHighContrast) == 0 && this.sampleSize == imageLightCondition.sampleSize;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.luminosity) * 31) + Double.hashCode(this.rmsContrast)) * 31) + Double.hashCode(this.lowHighContrast)) * 31) + Integer.hashCode(this.sampleSize);
    }

    @NotNull
    public String toString() {
        return "ImageLightCondition(luminosity=" + this.luminosity + ", rmsContrast=" + this.rmsContrast + ", lowHighContrast=" + this.lowHighContrast + ", sampleSize=" + this.sampleSize + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.luminosity);
        parcel.writeDouble(this.rmsContrast);
        parcel.writeDouble(this.lowHighContrast);
        parcel.writeInt(this.sampleSize);
    }
}
