package ra;

import com.roblox.client.personasdk.R;
import java.time.DateTimeException;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import sa.C0788j;
import sa.InterfaceC0792n;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lra/e;", "", "Ljava/time/Instant;", "value", "<init>", "(Ljava/time/Instant;)V", "other", "", "f", "(Lra/e;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "d", "Ljava/time/Instant;", "getValue$kotlinx_datetime", "()Ljava/time/Instant;", "", "g", "()J", "epochSeconds", "e", "a", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
@Serializable(with = xa.d.class)
public final class e implements Comparable<e> {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final e i;

    @NotNull
    private static final e v;

    @NotNull
    private static final e w;

    @NotNull
    private static final e y;

    @NotNull
    private final Instant value;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lra/e$a;", "", "<init>", "()V", "", "input", "Lsa/n;", "Lsa/j;", "format", "Lra/e;", "e", "(Ljava/lang/CharSequence;Lsa/n;)Lra/e;", "", "isoString", "f", "(Ljava/lang/String;)Lra/e;", "", "epochSeconds", "nanosecondAdjustment", "b", "(JJ)Lra/e;", "", "a", "(JI)Lra/e;", "MIN", "Lra/e;", "d", "()Lra/e;", "MAX", "c", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static e g(Companion companion, CharSequence charSequence, InterfaceC0792n interfaceC0792n, int i, Object obj) {
            if ((i & 2) != 0) {
                interfaceC0792n = C0788j.b.a.a();
            }
            return companion.e(charSequence, interfaceC0792n);
        }

        @NotNull
        public final e a(long epochSeconds, int nanosecondAdjustment) {
            return b(epochSeconds, nanosecondAdjustment);
        }

        @NotNull
        public final e b(long epochSeconds, long nanosecondAdjustment) throws Exception {
            try {
                Instant instantOfEpochSecond = Instant.ofEpochSecond(epochSeconds, nanosecondAdjustment);
                Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
                return new e(instantOfEpochSecond);
            } catch (Exception e) {
                if ((e instanceof ArithmeticException) || (e instanceof DateTimeException)) {
                    return epochSeconds > 0 ? c() : d();
                }
                throw e;
            }
        }

        @NotNull
        public final e c() {
            return e.y;
        }

        @NotNull
        public final e d() {
            return e.w;
        }

        @NotNull
        public final e e(@NotNull CharSequence input, @NotNull InterfaceC0792n<C0788j> format) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(format, "format");
            try {
                return format.a(input).c();
            } catch (IllegalArgumentException e) {
                throw new C0755b("Failed to parse an instant from '" + ((Object) input) + '\'', e);
            }
        }

        public final e f(String isoString) {
            Intrinsics.checkNotNullParameter(isoString, "isoString");
            return g(this, isoString, null, 2, null);
        }

        private Companion() {
        }
    }

    static {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(-3217862419201L, 999999999L);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        i = new e(instantOfEpochSecond);
        Instant instantOfEpochSecond2 = Instant.ofEpochSecond(3093527980800L, 0L);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
        v = new e(instantOfEpochSecond2);
        Instant instant = Instant.MIN;
        Intrinsics.checkNotNullExpressionValue(instant, "MIN");
        w = new e(instant);
        Instant instant2 = Instant.MAX;
        Intrinsics.checkNotNullExpressionValue(instant2, "MAX");
        y = new e(instant2);
    }

    public e(@NotNull Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "value");
        this.value = instant;
    }

    public boolean equals(Object other) {
        return this == other || ((other instanceof e) && Intrinsics.b(this.value, ((e) other).value));
    }

    @Override
    public int compareTo(@NotNull e other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.value.compareTo(other.value);
    }

    public final long g() {
        return this.value.getEpochSecond();
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
}
