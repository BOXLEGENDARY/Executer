package ra;

import com.roblox.client.personasdk.R;
import java.time.ZoneOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import sa.C0774N;
import sa.InterfaceC0792n;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0010\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0016"}, d2 = {"Lra/i;", "", "Ljava/time/ZoneOffset;", "zoneOffset", "<init>", "(Ljava/time/ZoneOffset;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "a", "Ljava/time/ZoneOffset;", "getZoneOffset$kotlinx_datetime", "()Ljava/time/ZoneOffset;", "totalSeconds", "b", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
@Serializable(with = xa.i.class)
public final class i {

    @NotNull
    private static final i c;

    @NotNull
    private final ZoneOffset zoneOffset;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Lra/i$b;", "", "<init>", "()V", "Lsa/n;", "Lra/i;", "b", "()Lsa/n;", "ISO", "a", "FOUR_DIGITS", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b {

        @NotNull
        public static final b a = new b();

        private b() {
        }

        @NotNull
        public final InterfaceC0792n<i> a() {
            return C0774N.b();
        }

        @NotNull
        public final InterfaceC0792n<i> b() {
            return C0774N.c();
        }
    }

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        Intrinsics.checkNotNullExpressionValue(zoneOffset, "UTC");
        c = new i(zoneOffset);
    }

    public i(@NotNull ZoneOffset zoneOffset) {
        Intrinsics.checkNotNullParameter(zoneOffset, "zoneOffset");
        this.zoneOffset = zoneOffset;
    }

    public final int a() {
        return this.zoneOffset.getTotalSeconds();
    }

    public boolean equals(Object other) {
        return (other instanceof i) && Intrinsics.b(this.zoneOffset, ((i) other).zoneOffset);
    }

    public int hashCode() {
        return this.zoneOffset.hashCode();
    }

    @NotNull
    public String toString() {
        String string = this.zoneOffset.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
