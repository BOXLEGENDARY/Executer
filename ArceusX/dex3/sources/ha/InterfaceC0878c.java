package ha;

import E1.h;
import E1.i;
import K1.Size;
import N1.c;
import android.graphics.Bitmap;
import ha.C0354e;
import ha.C0356g;
import ha.C0361l;
import ha.C0365p;
import ha.InterfaceC0878c;
import kotlin.Metadata;
import okio.f;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u000202J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0012\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\"\u0010#J1\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010$H\u0017¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020'H\u0017¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020'H\u0017¢\u0006\u0004\b*\u0010)J\u001f\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b0\u0010\u0006J\u001f\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u000201H\u0017¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u000204H\u0017¢\u0006\u0004\b5\u00106ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00067À\u0006\u0003"}, d2 = {"Lz1/c;", "LJ1/g$b;", "LJ1/g;", "request", "", "a", "(LJ1/g;)V", "e", "LK1/i;", "size", "j", "(LJ1/g;LK1/i;)V", "", "input", "h", "(LJ1/g;Ljava/lang/Object;)V", "output", "p", "k", "", "g", "(LJ1/g;Ljava/lang/String;)V", "LE1/i;", "fetcher", "LJ1/l;", "options", "l", "(LJ1/g;LE1/i;LJ1/l;)V", "LE1/h;", "result", "f", "(LJ1/g;LE1/i;LJ1/l;LE1/h;)V", "LB1/h;", "decoder", "o", "(LJ1/g;LB1/h;LJ1/l;)V", "LB1/f;", "q", "(LJ1/g;LB1/h;LJ1/l;LB1/f;)V", "Landroid/graphics/Bitmap;", "m", "(LJ1/g;Landroid/graphics/Bitmap;)V", "r", "LN1/c;", "transition", "n", "(LJ1/g;LN1/c;)V", "i", "c", "LJ1/e;", "b", "(LJ1/g;LJ1/e;)V", "LJ1/p;", "d", "(LJ1/g;LJ1/p;)V", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InterfaceC0878c extends C0356g.b {

    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final InterfaceC0878c b = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"z1/c$a", "Lz1/c;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements InterfaceC0878c {
        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lz1/c$b;", "", "<init>", "()V", "Lz1/c;", "NONE", "Lz1/c;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final Companion a = new Companion();

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lz1/c$c;", "", "LJ1/g;", "request", "Lz1/c;", "a", "(LJ1/g;)Lz1/c;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface InterfaceC0321c {

        @NotNull
        public static final Companion INSTANCE = Companion.a;

        @NotNull
        public static final InterfaceC0321c b = new InterfaceC0321c() {
            @Override
            public final InterfaceC0878c a(C0356g c0356g) {
                return InterfaceC0878c.InterfaceC0321c.b(c0356g);
            }
        };

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lz1/c$c$a;", "", "<init>", "()V", "Lz1/c$c;", "NONE", "Lz1/c$c;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final Companion a = new Companion();

            private Companion() {
            }
        }

        static InterfaceC0878c b(C0356g c0356g) {
            return InterfaceC0878c.b;
        }

        @NotNull
        InterfaceC0878c a(@NotNull C0356g request);
    }

    @Override
    default void a(@NotNull C0356g request) {
    }

    @Override
    default void b(@NotNull C0356g request, @NotNull C0354e result) {
    }

    @Override
    default void c(@NotNull C0356g request) {
    }

    @Override
    default void d(@NotNull C0356g request, @NotNull C0365p result) {
    }

    default void e(@NotNull C0356g request) {
    }

    default void f(@NotNull C0356g request, @NotNull i fetcher, @NotNull C0361l options, h result) {
    }

    default void g(@NotNull C0356g request, String output) {
    }

    default void h(@NotNull C0356g request, @NotNull Object input) {
    }

    default void i(@NotNull C0356g request, @NotNull c transition) {
    }

    default void j(@NotNull C0356g request, @NotNull Size size) {
    }

    default void k(@NotNull C0356g request, @NotNull Object input) {
    }

    default void l(@NotNull C0356g request, @NotNull i fetcher, @NotNull C0361l options) {
    }

    default void m(@NotNull C0356g request, @NotNull Bitmap input) {
    }

    default void n(@NotNull C0356g request, @NotNull c transition) {
    }

    default void o(@NotNull C0356g request, @NotNull okio.h decoder, @NotNull C0361l options) {
    }

    default void p(@NotNull C0356g request, @NotNull Object output) {
    }

    default void q(@NotNull C0356g request, @NotNull okio.h decoder, @NotNull C0361l options, f result) {
    }

    default void r(@NotNull C0356g request, @NotNull Bitmap output) {
    }
}
