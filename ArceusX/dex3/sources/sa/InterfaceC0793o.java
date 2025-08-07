package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0007\b\u0005\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lsa/o;", "", "", "value", "", "c", "(Ljava/lang/String;)V", "a", "b", "d", "Lsa/b;", "Lsa/o$a;", "Lsa/o$c;", "Lsa/o$d;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface InterfaceC0793o {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0001\u0001\u0015¨\u0006\u0016"}, d2 = {"Lsa/o$a;", "Lsa/o;", "Lsa/F;", "padding", "", "i", "(Lsa/F;)V", "v", "Lsa/D;", "names", "d", "(Lsa/D;)V", "e", "Lsa/s;", "p", "(Lsa/s;)V", "Lsa/n;", "Lra/f;", "format", "w", "(Lsa/n;)V", "Lsa/c;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface a extends InterfaceC0793o {

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0285a {
            public static void a(a aVar, EnumC0766F enumC0766F, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dayOfMonth");
                }
                if ((i & 1) != 0) {
                    enumC0766F = EnumC0766F.e;
                }
                aVar.e(enumC0766F);
            }

            public static void b(a aVar, EnumC0766F enumC0766F, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: monthNumber");
                }
                if ((i & 1) != 0) {
                    enumC0766F = EnumC0766F.e;
                }
                aVar.v(enumC0766F);
            }

            public static void c(a aVar, EnumC0766F enumC0766F, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: year");
                }
                if ((i & 1) != 0) {
                    enumC0766F = EnumC0766F.e;
                }
                aVar.i(enumC0766F);
            }
        }

        void d(@NotNull C0764D names);

        void e(@NotNull EnumC0766F padding);

        void i(@NotNull EnumC0766F padding);

        void p(@NotNull C0797s names);

        void v(@NotNull EnumC0766F padding);

        void w(@NotNull InterfaceC0792n<ra.f> format);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lsa/o$b;", "", "Lsa/o$d;", "Lsa/l$a;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface b extends a, c, d {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J#\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\r\u0082\u0001\u0001\u000e¨\u0006\u000f"}, d2 = {"Lsa/o$c;", "Lsa/o;", "Lsa/F;", "padding", "", "m", "(Lsa/F;)V", "j", "l", "", "minLength", "maxLength", "f", "(II)V", "Lsa/f;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface c extends InterfaceC0793o {

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a {
            public static void a(c cVar, EnumC0766F enumC0766F, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hour");
                }
                if ((i & 1) != 0) {
                    enumC0766F = EnumC0766F.e;
                }
                cVar.m(enumC0766F);
            }

            public static void b(c cVar, EnumC0766F enumC0766F, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: minute");
                }
                if ((i & 1) != 0) {
                    enumC0766F = EnumC0766F.e;
                }
                cVar.j(enumC0766F);
            }

            public static void c(c cVar, EnumC0766F enumC0766F, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: second");
                }
                if ((i & 1) != 0) {
                    enumC0766F = EnumC0766F.e;
                }
                cVar.l(enumC0766F);
            }
        }

        void f(int minLength, int maxLength);

        void j(@NotNull EnumC0766F padding);

        void l(@NotNull EnumC0766F padding);

        void m(@NotNull EnumC0766F padding);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u001d\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\r\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lsa/o$d;", "Lsa/o;", "Lsa/F;", "padding", "", "t", "(Lsa/F;)V", "h", "r", "Lsa/n;", "Lra/i;", "format", "s", "(Lsa/n;)V", "Lsa/e;", "Lsa/o$b;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface d extends InterfaceC0793o {

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a {
            public static void a(d dVar, EnumC0766F enumC0766F, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetHours");
                }
                if ((i & 1) != 0) {
                    enumC0766F = EnumC0766F.e;
                }
                dVar.t(enumC0766F);
            }

            public static void b(d dVar, EnumC0766F enumC0766F, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetMinutesOfHour");
                }
                if ((i & 1) != 0) {
                    enumC0766F = EnumC0766F.e;
                }
                dVar.h(enumC0766F);
            }

            public static void c(d dVar, EnumC0766F enumC0766F, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetSecondsOfMinute");
                }
                if ((i & 1) != 0) {
                    enumC0766F = EnumC0766F.e;
                }
                dVar.r(enumC0766F);
            }
        }

        void h(@NotNull EnumC0766F padding);

        void r(@NotNull EnumC0766F padding);

        void s(@NotNull InterfaceC0792n<ra.i> format);

        void t(@NotNull EnumC0766F padding);
    }

    void c(@NotNull String value);
}
