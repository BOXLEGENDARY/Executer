package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sa.InterfaceC0780b;
import sa.InterfaceC0782d;
import sa.InterfaceC0783e;
import sa.InterfaceC0793o;
import ua.C0815d;
import ua.C0817f;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lsa/l;", "Lsa/a;", "Lsa/j;", "Lsa/k;", "Lua/f;", "actualFormat", "<init>", "(Lua/f;)V", "intermediate", "f", "(Lsa/k;)Lsa/j;", "a", "Lua/f;", "b", "()Lua/f;", "e", "()Lsa/k;", "emptyIntermediate", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0790l extends AbstractC0779a<C0788j, C0789k> {

    @NotNull
    private final C0817f<C0789k> actualFormat;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lsa/l$a;", "Lsa/b;", "Lsa/k;", "Lsa/d;", "Lsa/e;", "Lsa/o$b;", "Lua/d;", "actualBuilder", "<init>", "(Lua/d;)V", "Lua/o;", "", "structure", "", "k", "(Lua/o;)V", "Lsa/L;", "g", "y", "()Lsa/l$a;", "a", "Lua/d;", "()Lua/d;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements InterfaceC0780b<C0789k, a>, InterfaceC0782d, InterfaceC0783e, InterfaceC0793o.b {

        @NotNull
        private final C0815d<C0789k> actualBuilder;

        public a(@NotNull C0815d<C0789k> c0815d) {
            Intrinsics.checkNotNullParameter(c0815d, "actualBuilder");
            this.actualBuilder = c0815d;
        }

        @Override
        @NotNull
        public C0815d<C0789k> a() {
            return this.actualBuilder;
        }

        @Override
        public void b(@NotNull String str, @NotNull Function1<? super a, Unit> function1) {
            InterfaceC0780b.a.b(this, str, function1);
        }

        @Override
        public void c(@NotNull String str) {
            InterfaceC0780b.a.d(this, str);
        }

        @Override
        public void d(@NotNull C0764D c0764d) {
            InterfaceC0782d.a.h(this, c0764d);
        }

        @Override
        public void e(@NotNull EnumC0766F enumC0766F) {
            InterfaceC0782d.a.d(this, enumC0766F);
        }

        @Override
        public void f(int i, int i2) {
            InterfaceC0782d.a.k(this, i, i2);
        }

        @Override
        public void g(@NotNull ua.o<? super InterfaceC0772L> structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            a().a(structure);
        }

        @Override
        public void h(@NotNull EnumC0766F enumC0766F) {
            InterfaceC0783e.a.c(this, enumC0766F);
        }

        @Override
        public void i(@NotNull EnumC0766F enumC0766F) {
            InterfaceC0782d.a.l(this, enumC0766F);
        }

        @Override
        public void j(@NotNull EnumC0766F enumC0766F) {
            InterfaceC0782d.a.g(this, enumC0766F);
        }

        @Override
        public void k(@NotNull ua.o<Object> structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            a().a(structure);
        }

        @Override
        public void l(@NotNull EnumC0766F enumC0766F) {
            InterfaceC0782d.a.j(this, enumC0766F);
        }

        @Override
        public void m(@NotNull EnumC0766F enumC0766F) {
            InterfaceC0782d.a.f(this, enumC0766F);
        }

        @Override
        public void n(@NotNull Function1<? super a, Unit>[] function1Arr, @NotNull Function1<? super a, Unit> function1) {
            InterfaceC0780b.a.a(this, function1Arr, function1);
        }

        @Override
        public void o(@NotNull ua.o<? super InterfaceC0786h> oVar) {
            InterfaceC0782d.a.a(this, oVar);
        }

        @Override
        public void p(@NotNull C0797s c0797s) {
            InterfaceC0782d.a.e(this, c0797s);
        }

        @Override
        public void q(@NotNull ua.o<? super InterfaceC0769I> oVar) {
            InterfaceC0782d.a.b(this, oVar);
        }

        @Override
        public void r(@NotNull EnumC0766F enumC0766F) {
            InterfaceC0783e.a.d(this, enumC0766F);
        }

        @Override
        public void s(@NotNull InterfaceC0792n<ra.i> interfaceC0792n) {
            InterfaceC0783e.a.a(this, interfaceC0792n);
        }

        @Override
        public void t(@NotNull EnumC0766F enumC0766F) {
            InterfaceC0783e.a.b(this, enumC0766F);
        }

        @Override
        public void v(@NotNull EnumC0766F enumC0766F) {
            InterfaceC0782d.a.i(this, enumC0766F);
        }

        @Override
        public void w(@NotNull InterfaceC0792n<ra.f> interfaceC0792n) {
            InterfaceC0782d.a.c(this, interfaceC0792n);
        }

        @NotNull
        public C0817f<C0789k> x() {
            return InterfaceC0780b.a.c(this);
        }

        @Override
        @NotNull
        public a u() {
            return new a(new C0815d());
        }
    }

    public C0790l(@NotNull C0817f<? super C0789k> c0817f) {
        super(null);
        Intrinsics.checkNotNullParameter(c0817f, "actualFormat");
        this.actualFormat = c0817f;
    }

    @Override
    @NotNull
    public C0817f<C0789k> b() {
        return this.actualFormat;
    }

    @Override
    @NotNull
    public C0789k c() {
        return C0791m.b;
    }

    @Override
    @NotNull
    public C0788j d(@NotNull C0789k intermediate) {
        Intrinsics.checkNotNullParameter(intermediate, "intermediate");
        return new C0788j(intermediate);
    }
}
