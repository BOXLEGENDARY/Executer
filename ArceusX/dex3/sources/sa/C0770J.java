package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ta.C0804a;
import ua.C0810B;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\bR#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u001a\u0010\b¨\u0006\u001c"}, d2 = {"Lsa/J;", "", "<init>", "()V", "Lua/B;", "Lsa/I;", "b", "Lua/B;", "()Lua/B;", "hour", "c", "minute", "d", "second", "Lua/q;", "Lta/a;", "e", "Lua/q;", "a", "()Lua/q;", "fractionOfSecond", "Lsa/g;", "f", "getAmPm", "amPm", "g", "getHourOfAmPm", "hourOfAmPm", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
final class C0770J {

    @NotNull
    public static final C0770J a = new C0770J();

    @NotNull
    private static final C0810B<InterfaceC0769I> hour = new C0810B<>(new ua.x(new kotlin.jvm.internal.p() {
        public Object get(Object obj) {
            return ((InterfaceC0769I) obj).getHour();
        }

        public void l(Object obj, Object obj2) {
            ((InterfaceC0769I) obj).v((Integer) obj2);
        }
    }), 0, 23, null, null, null, 56, null);

    @NotNull
    private static final C0810B<InterfaceC0769I> minute = new C0810B<>(new ua.x(new kotlin.jvm.internal.p() {
        public Object get(Object obj) {
            return ((InterfaceC0769I) obj).getMinute();
        }

        public void l(Object obj, Object obj2) {
            ((InterfaceC0769I) obj).i((Integer) obj2);
        }
    }), 0, 59, null, null, null, 56, null);

    @NotNull
    private static final C0810B<InterfaceC0769I> second = new C0810B<>(new ua.x(new kotlin.jvm.internal.p() {
        public Object get(Object obj) {
            return ((InterfaceC0769I) obj).getSecond();
        }

        public void l(Object obj, Object obj2) {
            ((InterfaceC0769I) obj).C((Integer) obj2);
        }
    }), 0, 59, null, 0, null, 40, null);

    @NotNull
    private static final ua.q<InterfaceC0769I, C0804a> fractionOfSecond = new ua.q<>(new ua.x(new kotlin.jvm.internal.p() {
        public Object get(Object obj) {
            return ((InterfaceC0769I) obj).m();
        }

        public void l(Object obj, Object obj2) {
            ((InterfaceC0769I) obj).k((C0804a) obj2);
        }
    }), null, new C0804a(0, 9), null, 10, null);

    @NotNull
    private static final ua.q<InterfaceC0769I, EnumC0785g> amPm = new ua.q<>(new ua.x(new kotlin.jvm.internal.p() {
        public Object get(Object obj) {
            return ((InterfaceC0769I) obj).getAmPm();
        }

        public void l(Object obj, Object obj2) {
            ((InterfaceC0769I) obj).y((EnumC0785g) obj2);
        }
    }), null, null, null, 14, null);

    @NotNull
    private static final C0810B<InterfaceC0769I> hourOfAmPm = new C0810B<>(new ua.x(new kotlin.jvm.internal.p() {
        public Object get(Object obj) {
            return ((InterfaceC0769I) obj).getHourOfAmPm();
        }

        public void l(Object obj, Object obj2) {
            ((InterfaceC0769I) obj).d((Integer) obj2);
        }
    }), 1, 12, null, null, null, 56, null);

    private C0770J() {
    }

    @NotNull
    public final ua.q<InterfaceC0769I, C0804a> a() {
        return fractionOfSecond;
    }

    @NotNull
    public final C0810B<InterfaceC0769I> b() {
        return hour;
    }

    @NotNull
    public final C0810B<InterfaceC0769I> c() {
        return minute;
    }

    @NotNull
    public final C0810B<InterfaceC0769I> d() {
        return second;
    }
}
