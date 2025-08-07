package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sa.InterfaceC0793o;
import ua.BasicFormatStructure;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsa/c;", "Lsa/o$a;", "Lua/o;", "Lsa/h;", "structure", "", "o", "(Lua/o;)V", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface InterfaceC0781c extends InterfaceC0793o.a {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {
        public static void a(@NotNull InterfaceC0781c interfaceC0781c, @NotNull InterfaceC0792n<ra.f> interfaceC0792n) {
            Intrinsics.checkNotNullParameter(interfaceC0792n, "format");
            if (interfaceC0792n instanceof C0803y) {
                interfaceC0781c.o(((C0803y) interfaceC0792n).b());
            }
        }

        public static void b(@NotNull InterfaceC0781c interfaceC0781c, @NotNull EnumC0766F enumC0766F) {
            Intrinsics.checkNotNullParameter(enumC0766F, "padding");
            interfaceC0781c.o(new BasicFormatStructure(new C0795q(enumC0766F)));
        }

        public static void c(@NotNull InterfaceC0781c interfaceC0781c, @NotNull C0797s c0797s) {
            Intrinsics.checkNotNullParameter(c0797s, "names");
            interfaceC0781c.o(new BasicFormatStructure(new C0796r(c0797s)));
        }

        public static void d(@NotNull InterfaceC0781c interfaceC0781c, @NotNull C0764D c0764d) {
            Intrinsics.checkNotNullParameter(c0764d, "names");
            interfaceC0781c.o(new BasicFormatStructure(new C0763C(c0764d)));
        }

        public static void e(@NotNull InterfaceC0781c interfaceC0781c, @NotNull EnumC0766F enumC0766F) {
            Intrinsics.checkNotNullParameter(enumC0766F, "padding");
            interfaceC0781c.o(new BasicFormatStructure(new C0762B(enumC0766F)));
        }

        public static void f(@NotNull InterfaceC0781c interfaceC0781c, @NotNull EnumC0766F enumC0766F) {
            Intrinsics.checkNotNullParameter(enumC0766F, "padding");
            interfaceC0781c.o(new BasicFormatStructure(new C0778S(enumC0766F, false, 2, null)));
        }
    }

    void o(@NotNull ua.o<? super InterfaceC0786h> structure);
}
