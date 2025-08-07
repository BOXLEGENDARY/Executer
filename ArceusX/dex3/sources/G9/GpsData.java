package g9;

import android.location.Location;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lg9/a;", "", "Landroid/location/Location;", "location", "Lg9/b;", "precision", "<init>", "(Landroid/location/Location;Lg9/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/location/Location;", "()Landroid/location/Location;", "b", "Lg9/b;", "()Lg9/b;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class GpsData {

    @NotNull
    private final Location location;

    @NotNull
    private final EnumC0580b precision;

    public GpsData(@NotNull Location location, @NotNull EnumC0580b enumC0580b) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(enumC0580b, "precision");
        this.location = location;
        this.precision = enumC0580b;
    }

    @NotNull
    public final Location getLocation() {
        return this.location;
    }

    @NotNull
    public final EnumC0580b getPrecision() {
        return this.precision;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GpsData)) {
            return false;
        }
        GpsData gpsData = (GpsData) other;
        return Intrinsics.b(this.location, gpsData.location) && this.precision == gpsData.precision;
    }

    public int hashCode() {
        return (this.location.hashCode() * 31) + this.precision.hashCode();
    }

    @NotNull
    public String toString() {
        return "GpsData(location=" + this.location + ", precision=" + this.precision + ")";
    }
}
