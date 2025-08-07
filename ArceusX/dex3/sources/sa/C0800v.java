package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ra.AbstractC0756c;
import ra.C0755b;
import ra.C0757d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002BC\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR$\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001e¨\u0006*"}, d2 = {"Lsa/v;", "Lsa/h;", "Lwa/c;", "", "year", "monthNumber", "dayOfMonth", "isoDayOfWeek", "dayOfYear", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lra/f;", "b", "()Lra/f;", "a", "()Lsa/v;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "r", "(Ljava/lang/Integer;)V", "u", "f", "c", "t", "l", "d", "p", "w", "e", "q", "D", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0800v implements InterfaceC0786h, wa.c<C0800v> {

    private Integer year;

    private Integer monthNumber;

    private Integer dayOfMonth;

    private Integer isoDayOfWeek;

    private Integer dayOfYear;

    public C0800v() {
        this(null, null, null, null, null, 31, null);
    }

    @Override
    public void D(Integer num) {
        this.dayOfYear = num;
    }

    @Override
    @NotNull
    public C0800v copy() {
        return new C0800v(getYear(), getMonthNumber(), getDayOfMonth(), getIsoDayOfWeek(), getDayOfYear());
    }

    @NotNull
    public final ra.f b() {
        ra.f fVar;
        int iIntValue;
        int iIntValue2 = ((Number) z.c(getYear(), "year")).intValue();
        Integer dayOfYear = getDayOfYear();
        if (dayOfYear == null) {
            fVar = new ra.f(iIntValue2, ((Number) z.c(getMonthNumber(), "monthNumber")).intValue(), ((Number) z.c(getDayOfMonth(), "dayOfMonth")).intValue());
        } else {
            ra.f fVarB = ra.g.b(new ra.f(iIntValue2, 1, 1), dayOfYear.intValue() - 1, AbstractC0756c.INSTANCE.a());
            if (fVarB.j() != iIntValue2) {
                throw new C0755b("Can not create a LocalDate from the given input: the day of year is " + dayOfYear + ", which is not a valid day of year for the year " + iIntValue2);
            }
            if (getMonthNumber() != null) {
                int iH = fVarB.h();
                Integer monthNumber = getMonthNumber();
                if (monthNumber == null || iH != monthNumber.intValue()) {
                    throw new C0755b("Can not create a LocalDate from the given input: the day of year is " + dayOfYear + ", which is " + fVarB.g() + ", but " + getMonthNumber() + " was specified as the month number");
                }
            }
            if (getDayOfMonth() != null) {
                int iE = fVarB.e();
                Integer dayOfMonth = getDayOfMonth();
                if (dayOfMonth == null || iE != dayOfMonth.intValue()) {
                    throw new C0755b("Can not create a LocalDate from the given input: the day of year is " + dayOfYear + ", which is the day " + fVarB.e() + " of " + fVarB.g() + ", but " + getDayOfMonth() + " was specified as the day of month");
                }
            }
            fVar = fVarB;
        }
        Integer isoDayOfWeek = getIsoDayOfWeek();
        if (isoDayOfWeek == null || (iIntValue = isoDayOfWeek.intValue()) == C0757d.b(fVar.f())) {
            return fVar;
        }
        throw new C0755b("Can not create a LocalDate from the given input: the day of week is " + C0757d.a(iIntValue) + " but the date is " + fVar + ", which is a " + fVar.f());
    }

    public boolean equals(Object other) {
        if (other instanceof C0800v) {
            C0800v c0800v = (C0800v) other;
            if (Intrinsics.b(getYear(), c0800v.getYear()) && Intrinsics.b(getMonthNumber(), c0800v.getMonthNumber()) && Intrinsics.b(getDayOfMonth(), c0800v.getDayOfMonth()) && Intrinsics.b(getIsoDayOfWeek(), c0800v.getIsoDayOfWeek()) && Intrinsics.b(getDayOfYear(), c0800v.getDayOfYear())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void f(Integer num) {
        this.monthNumber = num;
    }

    public int hashCode() {
        Integer year = getYear();
        int iHashCode = (year != null ? year.hashCode() : 0) * 923521;
        Integer monthNumber = getMonthNumber();
        int iHashCode2 = iHashCode + ((monthNumber != null ? monthNumber.hashCode() : 0) * 29791);
        Integer dayOfMonth = getDayOfMonth();
        int iHashCode3 = iHashCode2 + ((dayOfMonth != null ? dayOfMonth.hashCode() : 0) * 961);
        Integer isoDayOfWeek = getIsoDayOfWeek();
        int iHashCode4 = iHashCode3 + ((isoDayOfWeek != null ? isoDayOfWeek.hashCode() : 0) * 31);
        Integer dayOfYear = getDayOfYear();
        return iHashCode4 + (dayOfYear != null ? dayOfYear.hashCode() : 0);
    }

    @Override
    public Integer getYear() {
        return this.year;
    }

    @Override
    public void l(Integer num) {
        this.dayOfMonth = num;
    }

    @Override
    public Integer getIsoDayOfWeek() {
        return this.isoDayOfWeek;
    }

    @Override
    public Integer getDayOfYear() {
        return this.dayOfYear;
    }

    @Override
    public void r(Integer num) {
        this.year = num;
    }

    @Override
    public Integer getDayOfMonth() {
        return this.dayOfMonth;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Object year = getYear();
        if (year == null) {
            year = "??";
        }
        sb.append(year);
        sb.append('-');
        Object monthNumber = getMonthNumber();
        if (monthNumber == null) {
            monthNumber = "??";
        }
        sb.append(monthNumber);
        sb.append('-');
        Object dayOfMonth = getDayOfMonth();
        if (dayOfMonth == null) {
            dayOfMonth = "??";
        }
        sb.append(dayOfMonth);
        sb.append(" (day of week is ");
        Integer isoDayOfWeek = getIsoDayOfWeek();
        sb.append(isoDayOfWeek != null ? isoDayOfWeek : "??");
        sb.append(')');
        return sb.toString();
    }

    @Override
    public Integer getMonthNumber() {
        return this.monthNumber;
    }

    @Override
    public void w(Integer num) {
        this.isoDayOfWeek = num;
    }

    public C0800v(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.year = num;
        this.monthNumber = num2;
        this.dayOfMonth = num3;
        this.isoDayOfWeek = num4;
        this.dayOfYear = num5;
    }

    public C0800v(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5);
    }
}
