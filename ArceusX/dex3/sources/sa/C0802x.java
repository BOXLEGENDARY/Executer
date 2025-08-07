package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B7\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"¨\u0006'"}, d2 = {"Lsa/x;", "Lsa/L;", "Lwa/c;", "", "isNegative", "", "totalHoursAbs", "minutesOfHour", "secondsOfMinute", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lra/i;", "d", "()Lra/i;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "()Lsa/x;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "z", "(Ljava/lang/Boolean;)V", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "E", "(Ljava/lang/Integer;)V", "s", "B", "g", "F", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0802x implements InterfaceC0772L, wa.c<C0802x> {

    private Boolean isNegative;

    private Integer totalHoursAbs;

    private Integer minutesOfHour;

    private Integer secondsOfMinute;

    public C0802x() {
        this(null, null, null, null, 15, null);
    }

    @Override
    public void B(Integer num) {
        this.minutesOfHour = num;
    }

    @Override
    public void E(Integer num) {
        this.totalHoursAbs = num;
    }

    @Override
    public void F(Integer num) {
        this.secondsOfMinute = num;
    }

    @Override
    public Boolean getIsNegative() {
        return this.isNegative;
    }

    @Override
    @NotNull
    public C0802x copy() {
        return new C0802x(getIsNegative(), getTotalHoursAbs(), getMinutesOfHour(), getSecondsOfMinute());
    }

    @Override
    public Integer getTotalHoursAbs() {
        return this.totalHoursAbs;
    }

    @NotNull
    public final ra.i d() {
        int i = Intrinsics.b(getIsNegative(), Boolean.TRUE) ? -1 : 1;
        Integer totalHoursAbs = getTotalHoursAbs();
        Integer numValueOf = totalHoursAbs != null ? Integer.valueOf(totalHoursAbs.intValue() * i) : null;
        Integer minutesOfHour = getMinutesOfHour();
        Integer numValueOf2 = minutesOfHour != null ? Integer.valueOf(minutesOfHour.intValue() * i) : null;
        Integer secondsOfMinute = getSecondsOfMinute();
        return ra.j.a(numValueOf, numValueOf2, secondsOfMinute != null ? Integer.valueOf(secondsOfMinute.intValue() * i) : null);
    }

    public boolean equals(Object other) {
        if (other instanceof C0802x) {
            C0802x c0802x = (C0802x) other;
            if (Intrinsics.b(getIsNegative(), c0802x.getIsNegative()) && Intrinsics.b(getTotalHoursAbs(), c0802x.getTotalHoursAbs()) && Intrinsics.b(getMinutesOfHour(), c0802x.getMinutesOfHour()) && Intrinsics.b(getSecondsOfMinute(), c0802x.getSecondsOfMinute())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer getSecondsOfMinute() {
        return this.secondsOfMinute;
    }

    public int hashCode() {
        Boolean isNegative = getIsNegative();
        int iHashCode = isNegative != null ? isNegative.hashCode() : 0;
        Integer totalHoursAbs = getTotalHoursAbs();
        int iHashCode2 = iHashCode + (totalHoursAbs != null ? totalHoursAbs.hashCode() : 0);
        Integer minutesOfHour = getMinutesOfHour();
        int iHashCode3 = iHashCode2 + (minutesOfHour != null ? minutesOfHour.hashCode() : 0);
        Integer secondsOfMinute = getSecondsOfMinute();
        return iHashCode3 + (secondsOfMinute != null ? secondsOfMinute.hashCode() : 0);
    }

    @Override
    public Integer getMinutesOfHour() {
        return this.minutesOfHour;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Boolean isNegative = getIsNegative();
        sb.append(isNegative != null ? isNegative.booleanValue() ? "-" : "+" : " ");
        Object totalHoursAbs = getTotalHoursAbs();
        if (totalHoursAbs == null) {
            totalHoursAbs = "??";
        }
        sb.append(totalHoursAbs);
        sb.append(':');
        Object minutesOfHour = getMinutesOfHour();
        if (minutesOfHour == null) {
            minutesOfHour = "??";
        }
        sb.append(minutesOfHour);
        sb.append(':');
        Integer secondsOfMinute = getSecondsOfMinute();
        sb.append(secondsOfMinute != null ? secondsOfMinute : "??");
        return sb.toString();
    }

    @Override
    public void z(Boolean bool) {
        this.isNegative = bool;
    }

    public C0802x(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.isNegative = bool;
        this.totalHoursAbs = num;
        this.minutesOfHour = num2;
        this.secondsOfMinute = num3;
    }

    public C0802x(Boolean bool, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }
}
