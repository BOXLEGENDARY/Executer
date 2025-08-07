package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ta.C0804a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005B3\b\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010/\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u00102\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u001e\u00105\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R\u001e\u00108\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R\u001e\u0010;\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\u001e\u0010@\u001a\u0004\u0018\u00010<8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001d\u0010=\"\u0004\b>\u0010?R(\u0010G\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8V@VX\u0096\u000f¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001e\u0010J\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bH\u0010,\"\u0004\bI\u0010.R\u001e\u0010L\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bK\u0010,\"\u0004\b%\u0010.R\u001e\u0010O\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bM\u0010,\"\u0004\bN\u0010.R\u001e\u0010R\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bP\u0010,\"\u0004\bQ\u0010.R\u001e\u0010U\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bS\u0010,\"\u0004\bT\u0010.R\u001e\u0010Y\u001a\u0004\u0018\u00010\u00138\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0019\u0010V\"\u0004\bW\u0010XR\u001e\u0010\\\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bZ\u0010,\"\u0004\b[\u0010.R\u001e\u0010_\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b]\u0010,\"\u0004\b^\u0010.R\u001e\u0010a\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b!\u0010,\"\u0004\b`\u0010.¨\u0006b"}, d2 = {"Lsa/k;", "Lsa/h;", "Lsa/I;", "Lsa/L;", "", "Lwa/c;", "Lsa/v;", "date", "Lsa/w;", "time", "Lsa/x;", "offset", "", "timeZoneId", "<init>", "(Lsa/v;Lsa/w;Lsa/x;Ljava/lang/String;)V", "G", "()Lsa/k;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lsa/v;", "H", "()Lsa/v;", "b", "Lsa/w;", "J", "()Lsa/w;", "c", "Lsa/x;", "I", "()Lsa/x;", "d", "Ljava/lang/String;", "K", "()Ljava/lang/String;", "L", "(Ljava/lang/String;)V", "t", "()Ljava/lang/Integer;", "l", "(Ljava/lang/Integer;)V", "dayOfMonth", "q", "D", "dayOfYear", "p", "w", "isoDayOfWeek", "u", "f", "monthNumber", "j", "r", "year", "Lsa/g;", "()Lsa/g;", "y", "(Lsa/g;)V", "amPm", "Lta/a;", "value", "m", "()Lta/a;", "k", "(Lta/a;)V", "fractionOfSecond", "x", "v", "hour", "o", "hourOfAmPm", "h", "i", "minute", "n", "e", "nanosecond", "A", "C", "second", "()Ljava/lang/Boolean;", "z", "(Ljava/lang/Boolean;)V", "isNegative", "s", "B", "minutesOfHour", "g", "F", "secondsOfMinute", "E", "totalHoursAbs", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0789k implements InterfaceC0786h, InterfaceC0769I, InterfaceC0772L, wa.c<C0789k> {

    @NotNull
    private final C0800v date;

    @NotNull
    private final C0801w time;

    @NotNull
    private final C0802x offset;

    private String timeZoneId;

    public C0789k() {
        this(null, null, null, null, 15, null);
    }

    @Override
    public Integer getSecond() {
        return this.time.getSecond();
    }

    @Override
    public void B(Integer num) {
        this.offset.B(num);
    }

    @Override
    public void C(Integer num) {
        this.time.C(num);
    }

    @Override
    public void D(Integer num) {
        this.date.D(num);
    }

    @Override
    public void E(Integer num) {
        this.offset.E(num);
    }

    @Override
    public void F(Integer num) {
        this.offset.F(num);
    }

    @Override
    @NotNull
    public C0789k copy() {
        return new C0789k(this.date.copy(), this.time.copy(), this.offset.copy(), this.timeZoneId);
    }

    @NotNull
    public final C0800v getDate() {
        return this.date;
    }

    @NotNull
    public final C0802x getOffset() {
        return this.offset;
    }

    @NotNull
    public final C0801w getTime() {
        return this.time;
    }

    public final String getTimeZoneId() {
        return this.timeZoneId;
    }

    public final void L(String str) {
        this.timeZoneId = str;
    }

    @Override
    public Boolean getIsNegative() {
        return this.offset.getIsNegative();
    }

    @Override
    public EnumC0785g getAmPm() {
        return this.time.getAmPm();
    }

    @Override
    public Integer getTotalHoursAbs() {
        return this.offset.getTotalHoursAbs();
    }

    @Override
    public void d(Integer num) {
        this.time.d(num);
    }

    @Override
    public void e(Integer num) {
        this.time.e(num);
    }

    public boolean equals(Object other) {
        if (other instanceof C0789k) {
            C0789k c0789k = (C0789k) other;
            if (Intrinsics.b(c0789k.date, this.date) && Intrinsics.b(c0789k.time, this.time) && Intrinsics.b(c0789k.offset, this.offset) && Intrinsics.b(c0789k.timeZoneId, this.timeZoneId)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void f(Integer num) {
        this.date.f(num);
    }

    @Override
    public Integer getSecondsOfMinute() {
        return this.offset.getSecondsOfMinute();
    }

    @Override
    public Integer getMinute() {
        return this.time.getMinute();
    }

    public int hashCode() {
        int iHashCode = (this.date.hashCode() ^ this.time.hashCode()) ^ this.offset.hashCode();
        String str = this.timeZoneId;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    @Override
    public void i(Integer num) {
        this.time.i(num);
    }

    @Override
    public Integer getYear() {
        return this.date.getYear();
    }

    @Override
    public void k(C0804a c0804a) {
        this.time.k(c0804a);
    }

    @Override
    public void l(Integer num) {
        this.date.l(num);
    }

    @Override
    public C0804a m() {
        return this.time.m();
    }

    @Override
    public Integer getNanosecond() {
        return this.time.getNanosecond();
    }

    @Override
    public Integer getHourOfAmPm() {
        return this.time.getHourOfAmPm();
    }

    @Override
    public Integer getIsoDayOfWeek() {
        return this.date.getIsoDayOfWeek();
    }

    @Override
    public Integer getDayOfYear() {
        return this.date.getDayOfYear();
    }

    @Override
    public void r(Integer num) {
        this.date.r(num);
    }

    @Override
    public Integer getMinutesOfHour() {
        return this.offset.getMinutesOfHour();
    }

    @Override
    public Integer getDayOfMonth() {
        return this.date.getDayOfMonth();
    }

    @Override
    public Integer getMonthNumber() {
        return this.date.getMonthNumber();
    }

    @Override
    public void v(Integer num) {
        this.time.v(num);
    }

    @Override
    public void w(Integer num) {
        this.date.w(num);
    }

    @Override
    public Integer getHour() {
        return this.time.getHour();
    }

    @Override
    public void y(EnumC0785g enumC0785g) {
        this.time.y(enumC0785g);
    }

    @Override
    public void z(Boolean bool) {
        this.offset.z(bool);
    }

    public C0789k(@NotNull C0800v c0800v, @NotNull C0801w c0801w, @NotNull C0802x c0802x, String str) {
        Intrinsics.checkNotNullParameter(c0800v, "date");
        Intrinsics.checkNotNullParameter(c0801w, "time");
        Intrinsics.checkNotNullParameter(c0802x, "offset");
        this.date = c0800v;
        this.time = c0801w;
        this.offset = c0802x;
        this.timeZoneId = str;
    }

    public C0789k(C0800v c0800v, C0801w c0801w, C0802x c0802x, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0800v(null, null, null, null, null, 31, null) : c0800v, (i & 2) != 0 ? new C0801w(null, null, null, null, null, null, 63, null) : c0801w, (i & 4) != 0 ? new C0802x(null, null, null, null, 15, null) : c0802x, (i & 8) != 0 ? null : str);
    }
}
