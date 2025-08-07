package ra;

import com.roblox.client.personasdk.R;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import ta.C0806c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001)B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0015\u0010\"\u001a\u00060\u001ej\u0002`\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b#\u0010\u0011R\u0015\u0010(\u001a\u00060$j\u0002`%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lra/f;", "", "Ljava/time/LocalDate;", "value", "<init>", "(Ljava/time/LocalDate;)V", "", "year", "monthNumber", "dayOfMonth", "(III)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "(Lra/f;)I", "k", "d", "Ljava/time/LocalDate;", "i", "()Ljava/time/LocalDate;", "j", "h", "Ljava/time/Month;", "Lkotlinx/datetime/Month;", "g", "()Ljava/time/Month;", "month", "e", "Ljava/time/DayOfWeek;", "Lkotlinx/datetime/DayOfWeek;", "f", "()Ljava/time/DayOfWeek;", "dayOfWeek", "a", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
@Serializable(with = xa.e.class)
public final class f implements Comparable<f> {

    @NotNull
    private static final f i;

    @NotNull
    private static final f v;

    @NotNull
    private final LocalDate value;

    static {
        LocalDate localDate = LocalDate.MIN;
        Intrinsics.checkNotNullExpressionValue(localDate, "MIN");
        i = new f(localDate);
        LocalDate localDate2 = LocalDate.MAX;
        Intrinsics.checkNotNullExpressionValue(localDate2, "MAX");
        v = new f(localDate2);
    }

    public f(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "value");
        this.value = localDate;
    }

    @Override
    public int compareTo(@NotNull f other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.value.compareTo((ChronoLocalDate) other.value);
    }

    public final int e() {
        return this.value.getDayOfMonth();
    }

    public boolean equals(Object other) {
        return this == other || ((other instanceof f) && Intrinsics.b(this.value, ((f) other).value));
    }

    @NotNull
    public final DayOfWeek f() {
        DayOfWeek dayOfWeek = this.value.getDayOfWeek();
        Intrinsics.checkNotNullExpressionValue(dayOfWeek, "getDayOfWeek(...)");
        return dayOfWeek;
    }

    @NotNull
    public final Month g() {
        Month month = this.value.getMonth();
        Intrinsics.checkNotNullExpressionValue(month, "getMonth(...)");
        return month;
    }

    public final int h() {
        return this.value.getMonthValue();
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @NotNull
    public final LocalDate getValue() {
        return this.value;
    }

    public final int j() {
        return this.value.getYear();
    }

    public final int k() {
        return C0806c.a(this.value.toEpochDay());
    }

    @NotNull
    public String toString() {
        String string = this.value.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public f(int i2, int i3, int i4) {
        try {
            LocalDate localDateOf = LocalDate.of(i2, i3, i4);
            Intrinsics.d(localDateOf);
            this(localDateOf);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
