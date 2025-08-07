package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ua.C0810B;

@Metadata(d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\u0013"}, d2 = {"Lsa/E;", "", "<init>", "()V", "sa/E$c", "b", "Lsa/E$c;", "sign", "Lua/B;", "Lsa/L;", "c", "Lua/B;", "()Lua/B;", "totalHoursAbs", "d", "a", "minutesOfHour", "e", "secondsOfMinute", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
final class C0765E {

    @NotNull
    public static final C0765E a = new C0765E();

    @NotNull
    private static final c sign;

    @NotNull
    private static final C0810B<InterfaceC0772L> totalHoursAbs;

    @NotNull
    private static final C0810B<InterfaceC0772L> minutesOfHour;

    @NotNull
    private static final C0810B<InterfaceC0772L> secondsOfMinute;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"sa/E$c", "Lua/m;", "Lsa/L;", "obj", "", "d", "(Lsa/L;)Z", "Lua/x;", "a", "Lua/x;", "c", "()Lua/x;", "isNegative", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class c implements ua.m<InterfaceC0772L> {

        @NotNull
        private final ua.x<InterfaceC0772L, Boolean> isNegative = new ua.x<>(new kotlin.jvm.internal.p() {
            public Object get(Object obj) {
                return ((InterfaceC0772L) obj).getIsNegative();
            }

            public void l(Object obj, Object obj2) {
                ((InterfaceC0772L) obj).z((Boolean) obj2);
            }
        });

        c() {
        }

        @Override
        @NotNull
        public ua.x<InterfaceC0772L, Boolean> a() {
            return this.isNegative;
        }

        @Override
        public boolean b(@NotNull InterfaceC0772L obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            Integer totalHoursAbs = obj.getTotalHoursAbs();
            if ((totalHoursAbs != null ? totalHoursAbs.intValue() : 0) != 0) {
                return false;
            }
            Integer minutesOfHour = obj.getMinutesOfHour();
            if ((minutesOfHour != null ? minutesOfHour.intValue() : 0) != 0) {
                return false;
            }
            Integer secondsOfMinute = obj.getSecondsOfMinute();
            return (secondsOfMinute != null ? secondsOfMinute.intValue() : 0) == 0;
        }
    }

    static {
        c cVar = new c();
        sign = cVar;
        totalHoursAbs = new C0810B<>(new ua.x(new kotlin.jvm.internal.p() {
            public Object get(Object obj) {
                return ((InterfaceC0772L) obj).getTotalHoursAbs();
            }

            public void l(Object obj, Object obj2) {
                ((InterfaceC0772L) obj).E((Integer) obj2);
            }
        }), 0, 18, null, 0, cVar, 8, null);
        minutesOfHour = new C0810B<>(new ua.x(new kotlin.jvm.internal.p() {
            public Object get(Object obj) {
                return ((InterfaceC0772L) obj).getMinutesOfHour();
            }

            public void l(Object obj, Object obj2) {
                ((InterfaceC0772L) obj).B((Integer) obj2);
            }
        }), 0, 59, null, 0, cVar, 8, null);
        secondsOfMinute = new C0810B<>(new ua.x(new kotlin.jvm.internal.p() {
            public Object get(Object obj) {
                return ((InterfaceC0772L) obj).getSecondsOfMinute();
            }

            public void l(Object obj, Object obj2) {
                ((InterfaceC0772L) obj).F((Integer) obj2);
            }
        }), 0, 59, null, 0, cVar, 8, null);
    }

    private C0765E() {
    }

    @NotNull
    public final C0810B<InterfaceC0772L> a() {
        return minutesOfHour;
    }

    @NotNull
    public final C0810B<InterfaceC0772L> b() {
        return secondsOfMinute;
    }

    @NotNull
    public final C0810B<InterfaceC0772L> c() {
        return totalHoursAbs;
    }
}
