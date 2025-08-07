package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ra.C0755b;
import sa.InterfaceC0769I;
import ta.C0804a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002BO\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010$\u001a\u0004\b!\u0010%\"\u0004\b&\u0010'R$\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001c\u001a\u0004\b.\u0010\u001e\"\u0004\b*\u0010 ¨\u0006/"}, d2 = {"Lsa/w;", "Lsa/I;", "Lwa/c;", "", "hour", "hourOfAmPm", "Lsa/g;", "amPm", "minute", "second", "nanosecond", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lsa/g;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lra/h;", "c", "()Lra/h;", "a", "()Lsa/w;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "x", "()Ljava/lang/Integer;", "v", "(Ljava/lang/Integer;)V", "b", "o", "d", "Lsa/g;", "()Lsa/g;", "y", "(Lsa/g;)V", "h", "i", "e", "A", "C", "f", "n", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0801w implements InterfaceC0769I, wa.c<C0801w> {

    private Integer hour;

    private Integer hourOfAmPm;

    private EnumC0785g amPm;

    private Integer minute;

    private Integer second;

    private Integer nanosecond;

    public C0801w() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override
    public Integer getSecond() {
        return this.second;
    }

    @Override
    public void C(Integer num) {
        this.second = num;
    }

    @Override
    @NotNull
    public C0801w copy() {
        return new C0801w(getHour(), getHourOfAmPm(), getAmPm(), getMinute(), getSecond(), getNanosecond());
    }

    @Override
    public EnumC0785g getAmPm() {
        return this.amPm;
    }

    @NotNull
    public final ra.h c() {
        int iIntValue;
        int iIntValue2;
        Integer hour = getHour();
        if (hour != null) {
            iIntValue = hour.intValue();
            Integer hourOfAmPm = getHourOfAmPm();
            if (hourOfAmPm != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = hourOfAmPm.intValue())) {
                throw new IllegalArgumentException(("Inconsistent hour and hour-of-am-pm: hour is " + iIntValue + ", but hour-of-am-pm is " + iIntValue2).toString());
            }
            EnumC0785g amPm = getAmPm();
            if (amPm != null) {
                if ((amPm == EnumC0785g.e) != (iIntValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + amPm).toString());
                }
            }
        } else {
            Integer hourOfAmPm2 = getHourOfAmPm();
            Integer numValueOf = null;
            if (hourOfAmPm2 != null) {
                int iIntValue3 = hourOfAmPm2.intValue();
                EnumC0785g amPm2 = getAmPm();
                if (amPm2 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (amPm2 != EnumC0785g.e ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                throw new C0755b("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        int iIntValue4 = ((Number) z.c(getMinute(), "minute")).intValue();
        Integer second = getSecond();
        int iIntValue5 = second != null ? second.intValue() : 0;
        Integer nanosecond = getNanosecond();
        return new ra.h(iIntValue, iIntValue4, iIntValue5, nanosecond != null ? nanosecond.intValue() : 0);
    }

    @Override
    public void d(Integer num) {
        this.hourOfAmPm = num;
    }

    @Override
    public void e(Integer num) {
        this.nanosecond = num;
    }

    public boolean equals(Object other) {
        if (other instanceof C0801w) {
            C0801w c0801w = (C0801w) other;
            if (Intrinsics.b(getHour(), c0801w.getHour()) && Intrinsics.b(getHourOfAmPm(), c0801w.getHourOfAmPm()) && getAmPm() == c0801w.getAmPm() && Intrinsics.b(getMinute(), c0801w.getMinute()) && Intrinsics.b(getSecond(), c0801w.getSecond()) && Intrinsics.b(getNanosecond(), c0801w.getNanosecond())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer getMinute() {
        return this.minute;
    }

    public int hashCode() {
        Integer hour = getHour();
        int iIntValue = (hour != null ? hour.intValue() : 0) * 31;
        Integer hourOfAmPm = getHourOfAmPm();
        int iIntValue2 = iIntValue + ((hourOfAmPm != null ? hourOfAmPm.intValue() : 0) * 31);
        EnumC0785g amPm = getAmPm();
        int iHashCode = iIntValue2 + ((amPm != null ? amPm.hashCode() : 0) * 31);
        Integer minute = getMinute();
        int iIntValue3 = iHashCode + ((minute != null ? minute.intValue() : 0) * 31);
        Integer second = getSecond();
        int iIntValue4 = iIntValue3 + ((second != null ? second.intValue() : 0) * 31);
        Integer nanosecond = getNanosecond();
        return iIntValue4 + (nanosecond != null ? nanosecond.intValue() : 0);
    }

    @Override
    public void i(Integer num) {
        this.minute = num;
    }

    @Override
    public void k(C0804a c0804a) {
        InterfaceC0769I.a.b(this, c0804a);
    }

    @Override
    public C0804a m() {
        return InterfaceC0769I.a.a(this);
    }

    @Override
    public Integer getNanosecond() {
        return this.nanosecond;
    }

    @Override
    public Integer getHourOfAmPm() {
        return this.hourOfAmPm;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: sa.C0801w.toString():java.lang.String");
    }

    @Override
    public void v(Integer num) {
        this.hour = num;
    }

    @Override
    public Integer getHour() {
        return this.hour;
    }

    @Override
    public void y(EnumC0785g enumC0785g) {
        this.amPm = enumC0785g;
    }

    public C0801w(Integer num, Integer num2, EnumC0785g enumC0785g, Integer num3, Integer num4, Integer num5) {
        this.hour = num;
        this.hourOfAmPm = num2;
        this.amPm = enumC0785g;
        this.minute = num3;
        this.second = num4;
        this.nanosecond = num5;
    }

    public C0801w(Integer num, Integer num2, EnumC0785g enumC0785g, Integer num3, Integer num4, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : enumC0785g, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5);
    }
}
