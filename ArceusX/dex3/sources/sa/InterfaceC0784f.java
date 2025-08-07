package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sa.InterfaceC0793o;
import ua.BasicFormatStructure;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsa/f;", "Lsa/o$c;", "Lua/o;", "Lsa/I;", "structure", "", "q", "(Lua/o;)V", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface InterfaceC0784f extends InterfaceC0793o.c {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {
        public static void a(@NotNull InterfaceC0784f interfaceC0784f, @NotNull EnumC0766F enumC0766F) {
            Intrinsics.checkNotNullParameter(enumC0766F, "padding");
            interfaceC0784f.q(new BasicFormatStructure(new C0799u(enumC0766F)));
        }

        public static void b(@NotNull InterfaceC0784f interfaceC0784f, @NotNull EnumC0766F enumC0766F) {
            Intrinsics.checkNotNullParameter(enumC0766F, "padding");
            interfaceC0784f.q(new BasicFormatStructure(new C0761A(enumC0766F)));
        }

        public static void c(@NotNull InterfaceC0784f interfaceC0784f, @NotNull EnumC0766F enumC0766F) {
            Intrinsics.checkNotNullParameter(enumC0766F, "padding");
            interfaceC0784f.q(new BasicFormatStructure(new C0767G(enumC0766F)));
        }

        public static void d(@NotNull InterfaceC0784f interfaceC0784f, int i, int i2) {
            interfaceC0784f.q(new BasicFormatStructure(new C0798t(i, i2, null, 4, null)));
        }
    }

    void q(@NotNull ua.o<? super InterfaceC0769I> structure);
}
