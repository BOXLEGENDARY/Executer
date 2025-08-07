package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ta.C0804a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0006R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\u0006R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0004\"\u0004\b\u0012\u0010\u0006R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010 \u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lsa/I;", "", "", "h", "()Ljava/lang/Integer;", "i", "(Ljava/lang/Integer;)V", "minute", "A", "C", "second", "n", "e", "nanosecond", "x", "v", "hour", "o", "d", "hourOfAmPm", "Lsa/g;", "b", "()Lsa/g;", "y", "(Lsa/g;)V", "amPm", "Lta/a;", "value", "m", "()Lta/a;", "k", "(Lta/a;)V", "fractionOfSecond", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface InterfaceC0769I {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {
        public static C0804a a(@NotNull InterfaceC0769I interfaceC0769I) {
            Integer numN = interfaceC0769I.n();
            if (numN != null) {
                return new C0804a(numN.intValue(), 9);
            }
            return null;
        }

        public static void b(@NotNull InterfaceC0769I interfaceC0769I, C0804a c0804a) {
            interfaceC0769I.e(c0804a != null ? Integer.valueOf(c0804a.e(9)) : null);
        }
    }

    Integer A();

    void C(Integer num);

    EnumC0785g b();

    void d(Integer num);

    void e(Integer num);

    Integer h();

    void i(Integer num);

    void k(C0804a c0804a);

    C0804a m();

    Integer n();

    Integer o();

    void v(Integer num);

    Integer x();

    void y(EnumC0785g enumC0785g);
}
