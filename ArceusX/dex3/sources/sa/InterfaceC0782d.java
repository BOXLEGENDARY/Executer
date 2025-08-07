package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sa.InterfaceC0781c;
import sa.InterfaceC0784f;
import sa.InterfaceC0793o;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsa/d;", "Lsa/c;", "Lsa/f;", "", "Lua/o;", "structure", "", "k", "(Lua/o;)V", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface InterfaceC0782d extends InterfaceC0781c, InterfaceC0784f, InterfaceC0793o.a, InterfaceC0793o.c {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {
        public static void a(@NotNull InterfaceC0782d interfaceC0782d, @NotNull ua.o<? super InterfaceC0786h> oVar) {
            Intrinsics.checkNotNullParameter(oVar, "structure");
            interfaceC0782d.k(oVar);
        }

        public static void b(@NotNull InterfaceC0782d interfaceC0782d, @NotNull ua.o<? super InterfaceC0769I> oVar) {
            Intrinsics.checkNotNullParameter(oVar, "structure");
            interfaceC0782d.k(oVar);
        }

        public static void c(@NotNull InterfaceC0782d interfaceC0782d, @NotNull InterfaceC0792n<ra.f> interfaceC0792n) {
            Intrinsics.checkNotNullParameter(interfaceC0792n, "format");
            InterfaceC0781c.a.a(interfaceC0782d, interfaceC0792n);
        }

        public static void d(@NotNull InterfaceC0782d interfaceC0782d, @NotNull EnumC0766F enumC0766F) {
            Intrinsics.checkNotNullParameter(enumC0766F, "padding");
            InterfaceC0781c.a.b(interfaceC0782d, enumC0766F);
        }

        public static void e(@NotNull InterfaceC0782d interfaceC0782d, @NotNull C0797s c0797s) {
            Intrinsics.checkNotNullParameter(c0797s, "names");
            InterfaceC0781c.a.c(interfaceC0782d, c0797s);
        }

        public static void f(@NotNull InterfaceC0782d interfaceC0782d, @NotNull EnumC0766F enumC0766F) {
            Intrinsics.checkNotNullParameter(enumC0766F, "padding");
            InterfaceC0784f.a.a(interfaceC0782d, enumC0766F);
        }

        public static void g(@NotNull InterfaceC0782d interfaceC0782d, @NotNull EnumC0766F enumC0766F) {
            Intrinsics.checkNotNullParameter(enumC0766F, "padding");
            InterfaceC0784f.a.b(interfaceC0782d, enumC0766F);
        }

        public static void h(@NotNull InterfaceC0782d interfaceC0782d, @NotNull C0764D c0764d) {
            Intrinsics.checkNotNullParameter(c0764d, "names");
            InterfaceC0781c.a.d(interfaceC0782d, c0764d);
        }

        public static void i(@NotNull InterfaceC0782d interfaceC0782d, @NotNull EnumC0766F enumC0766F) {
            Intrinsics.checkNotNullParameter(enumC0766F, "padding");
            InterfaceC0781c.a.e(interfaceC0782d, enumC0766F);
        }

        public static void j(@NotNull InterfaceC0782d interfaceC0782d, @NotNull EnumC0766F enumC0766F) {
            Intrinsics.checkNotNullParameter(enumC0766F, "padding");
            InterfaceC0784f.a.c(interfaceC0782d, enumC0766F);
        }

        public static void k(@NotNull InterfaceC0782d interfaceC0782d, int i, int i2) {
            InterfaceC0784f.a.d(interfaceC0782d, i, i2);
        }

        public static void l(@NotNull InterfaceC0782d interfaceC0782d, @NotNull EnumC0766F enumC0766F) {
            Intrinsics.checkNotNullParameter(enumC0766F, "padding");
            InterfaceC0781c.a.f(interfaceC0782d, enumC0766F);
        }
    }

    void k(@NotNull ua.o<Object> structure);
}
