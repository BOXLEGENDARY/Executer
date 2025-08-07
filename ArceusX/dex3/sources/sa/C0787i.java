package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ua.C0810B;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0007\u0010\u000fR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0018"}, d2 = {"Lsa/i;", "", "<init>", "()V", "Lua/q;", "Lsa/h;", "", "b", "Lua/q;", "d", "()Lua/q;", "year", "Lua/B;", "c", "Lua/B;", "()Lua/B;", "month", "a", "dayOfMonth", "e", "isoDayOfWeek", "f", "getDayOfYear", "dayOfYear", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
final class C0787i {

    @NotNull
    public static final C0787i a = new C0787i();

    @NotNull
    private static final ua.q<InterfaceC0786h, Integer> year = new ua.q<>(new ua.x(new kotlin.jvm.internal.p() {
        public Object get(Object obj) {
            return ((InterfaceC0786h) obj).j();
        }

        public void l(Object obj, Object obj2) {
            ((InterfaceC0786h) obj).r((Integer) obj2);
        }
    }), null, null, null, 14, null);

    @NotNull
    private static final C0810B<InterfaceC0786h> month = new C0810B<>(new ua.x(new kotlin.jvm.internal.p() {
        public Object get(Object obj) {
            return ((InterfaceC0786h) obj).u();
        }

        public void l(Object obj, Object obj2) {
            ((InterfaceC0786h) obj).f((Integer) obj2);
        }
    }), 1, 12, null, null, null, 56, null);

    @NotNull
    private static final C0810B<InterfaceC0786h> dayOfMonth = new C0810B<>(new ua.x(new kotlin.jvm.internal.p() {
        public Object get(Object obj) {
            return ((InterfaceC0786h) obj).t();
        }

        public void l(Object obj, Object obj2) {
            ((InterfaceC0786h) obj).l((Integer) obj2);
        }
    }), 1, 31, null, null, null, 56, null);

    @NotNull
    private static final C0810B<InterfaceC0786h> isoDayOfWeek = new C0810B<>(new ua.x(new kotlin.jvm.internal.p() {
        public Object get(Object obj) {
            return ((InterfaceC0786h) obj).p();
        }

        public void l(Object obj, Object obj2) {
            ((InterfaceC0786h) obj).w((Integer) obj2);
        }
    }), 1, 7, null, null, null, 56, null);

    @NotNull
    private static final C0810B<InterfaceC0786h> dayOfYear = new C0810B<>(new ua.x(new kotlin.jvm.internal.p() {
        public Object get(Object obj) {
            return ((InterfaceC0786h) obj).q();
        }

        public void l(Object obj, Object obj2) {
            ((InterfaceC0786h) obj).D((Integer) obj2);
        }
    }), 1, 366, null, null, null, 56, null);

    private C0787i() {
    }

    @NotNull
    public final C0810B<InterfaceC0786h> a() {
        return dayOfMonth;
    }

    @NotNull
    public final C0810B<InterfaceC0786h> b() {
        return isoDayOfWeek;
    }

    @NotNull
    public final C0810B<InterfaceC0786h> c() {
        return month;
    }

    @NotNull
    public final ua.q<InterfaceC0786h, Integer> d() {
        return year;
    }
}
