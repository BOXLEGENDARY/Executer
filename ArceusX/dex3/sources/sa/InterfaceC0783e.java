package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sa.InterfaceC0793o;
import ua.BasicFormatStructure;
import ua.SignedFormatStructure;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsa/e;", "Lsa/o$d;", "Lua/o;", "Lsa/L;", "structure", "", "g", "(Lua/o;)V", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface InterfaceC0783e extends InterfaceC0793o.d {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {
        public static void a(@NotNull InterfaceC0783e interfaceC0783e, @NotNull InterfaceC0792n<ra.i> interfaceC0792n) {
            Intrinsics.checkNotNullParameter(interfaceC0792n, "format");
            if (interfaceC0792n instanceof C0773M) {
                interfaceC0783e.g(((C0773M) interfaceC0792n).b());
            }
        }

        public static void b(@NotNull InterfaceC0783e interfaceC0783e, @NotNull EnumC0766F enumC0766F) {
            Intrinsics.checkNotNullParameter(enumC0766F, "padding");
            interfaceC0783e.g(new SignedFormatStructure(new BasicFormatStructure(new C0777Q(enumC0766F)), true));
        }

        public static void c(@NotNull InterfaceC0783e interfaceC0783e, @NotNull EnumC0766F enumC0766F) {
            Intrinsics.checkNotNullParameter(enumC0766F, "padding");
            interfaceC0783e.g(new BasicFormatStructure(new C0775O(enumC0766F)));
        }

        public static void d(@NotNull InterfaceC0783e interfaceC0783e, @NotNull EnumC0766F enumC0766F) {
            Intrinsics.checkNotNullParameter(enumC0766F, "padding");
            interfaceC0783e.g(new BasicFormatStructure(new C0776P(enumC0766F)));
        }
    }

    void g(@NotNull ua.o<? super InterfaceC0772L> structure);
}
