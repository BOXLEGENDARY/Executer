package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sa.InterfaceC0780b;
import sa.InterfaceC0783e;
import sa.InterfaceC0793o;
import ua.C0815d;
import ua.C0817f;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\f\u000eB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lsa/M;", "Lsa/a;", "Lra/i;", "Lsa/x;", "Lua/f;", "Lsa/L;", "actualFormat", "<init>", "(Lua/f;)V", "intermediate", "f", "(Lsa/x;)Lra/i;", "a", "Lua/f;", "b", "()Lua/f;", "e", "()Lsa/x;", "emptyIntermediate", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0773M extends AbstractC0779a<ra.i, C0802x> {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final C0817f<InterfaceC0772L> actualFormat;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lsa/M$a;", "Lsa/b;", "Lsa/L;", "Lsa/e;", "Lua/d;", "actualBuilder", "<init>", "(Lua/d;)V", "Lua/o;", "structure", "", "g", "(Lua/o;)V", "y", "()Lsa/M$a;", "a", "Lua/d;", "()Lua/d;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    private static final class a implements InterfaceC0780b<InterfaceC0772L, a>, InterfaceC0783e {

        @NotNull
        private final C0815d<InterfaceC0772L> actualBuilder;

        public a(@NotNull C0815d<InterfaceC0772L> c0815d) {
            Intrinsics.checkNotNullParameter(c0815d, "actualBuilder");
            this.actualBuilder = c0815d;
        }

        @Override
        @NotNull
        public C0815d<InterfaceC0772L> a() {
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
        public void g(@NotNull ua.o<? super InterfaceC0772L> structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            a().a(structure);
        }

        @Override
        public void h(@NotNull EnumC0766F enumC0766F) {
            InterfaceC0783e.a.c(this, enumC0766F);
        }

        @Override
        public void n(@NotNull Function1<? super a, Unit>[] function1Arr, @NotNull Function1<? super a, Unit> function1) {
            InterfaceC0780b.a.a(this, function1Arr, function1);
        }

        @Override
        public void r(@NotNull EnumC0766F enumC0766F) {
            InterfaceC0783e.a.d(this, enumC0766F);
        }

        @Override
        public void t(@NotNull EnumC0766F enumC0766F) {
            InterfaceC0783e.a.b(this, enumC0766F);
        }

        @NotNull
        public C0817f<InterfaceC0772L> x() {
            return InterfaceC0780b.a.c(this);
        }

        @Override
        @NotNull
        public a u() {
            return new a(new C0815d());
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsa/M$b;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsa/o$d;", "", "block", "Lsa/M;", "a", "(Lkotlin/jvm/functions/Function1;)Lsa/M;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C0773M a(@NotNull Function1<? super InterfaceC0793o.d, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            a aVar = new a(new C0815d());
            block.invoke(aVar);
            return new C0773M(aVar.x());
        }

        private Companion() {
        }
    }

    public C0773M(@NotNull C0817f<? super InterfaceC0772L> c0817f) {
        super(null);
        Intrinsics.checkNotNullParameter(c0817f, "actualFormat");
        this.actualFormat = c0817f;
    }

    @Override
    @NotNull
    public C0817f<InterfaceC0772L> b() {
        return this.actualFormat;
    }

    @Override
    @NotNull
    public C0802x c() {
        return C0774N.d;
    }

    @Override
    @NotNull
    public ra.i d(@NotNull C0802x intermediate) {
        Intrinsics.checkNotNullParameter(intermediate, "intermediate");
        return intermediate.d();
    }
}
