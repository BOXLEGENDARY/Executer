package ra;

import com.roblox.client.personasdk.R;
import java.time.DateTimeException;
import java.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B-\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lra/h;", "", "Ljava/time/LocalTime;", "value", "<init>", "(Ljava/time/LocalTime;)V", "", "hour", "minute", "second", "nanosecond", "(IIII)V", "e", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "c", "(Lra/h;)I", "d", "Ljava/time/LocalTime;", "getValue$kotlinx_datetime", "()Ljava/time/LocalTime;", "a", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
@Serializable(with = xa.f.class)
public final class h implements Comparable<h> {

    @NotNull
    private static final h i;

    @NotNull
    private static final h v;

    @NotNull
    private final LocalTime value;

    static {
        LocalTime localTime = LocalTime.MIN;
        Intrinsics.checkNotNullExpressionValue(localTime, "MIN");
        i = new h(localTime);
        LocalTime localTime2 = LocalTime.MAX;
        Intrinsics.checkNotNullExpressionValue(localTime2, "MAX");
        v = new h(localTime2);
    }

    public h(@NotNull LocalTime localTime) {
        Intrinsics.checkNotNullParameter(localTime, "value");
        this.value = localTime;
    }

    @Override
    public int compareTo(@NotNull h other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.value.compareTo(other.value);
    }

    public final int e() {
        return this.value.toSecondOfDay();
    }

    public boolean equals(Object other) {
        return this == other || ((other instanceof h) && Intrinsics.b(this.value, ((h) other).value));
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @NotNull
    public String toString() {
        String string = this.value.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public h(int i2, int i3, int i4, int i5) {
        try {
            LocalTime localTimeOf = LocalTime.of(i2, i3, i4, i5);
            Intrinsics.d(localTimeOf);
            this(localTimeOf);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
