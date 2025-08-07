package sa;

import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sa.InterfaceC0780b;
import ua.AlternativesParsing;
import ua.C0815d;
import ua.C0817f;
import ua.ConstantFormatStructure;
import ua.Optional;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0014\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u00020\u0003J\u000f\u0010\u0004\u001a\u00028\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005JO\u0010\u000b\u001a\u00020\b2*\u0010\t\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lsa/b;", "Target", "ActualSelf", "Lsa/o;", "u", "()Lsa/b;", "", "Lkotlin/Function1;", "", "otherFormats", "mainFormat", "n", "([Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "onZero", "format", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lua/d;", "a", "()Lua/d;", "actualBuilder", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface InterfaceC0780b<Target, ActualSelf extends InterfaceC0780b<Target, ActualSelf>> extends InterfaceC0793o {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {
        public static <Target, ActualSelf extends InterfaceC0780b<Target, ActualSelf>> void a(@NotNull InterfaceC0780b<Target, ActualSelf> interfaceC0780b, @NotNull Function1<? super ActualSelf, Unit>[] function1Arr, @NotNull Function1<? super ActualSelf, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1Arr, "otherFormats");
            Intrinsics.checkNotNullParameter(function1, "mainFormat");
            ArrayList arrayList = new ArrayList(function1Arr.length);
            for (Function1<? super ActualSelf, Unit> function12 : function1Arr) {
                InterfaceC0780b interfaceC0780bU = interfaceC0780b.u();
                function12.invoke(interfaceC0780bU);
                arrayList.add(interfaceC0780bU.a().b());
            }
            InterfaceC0780b interfaceC0780bU2 = interfaceC0780b.u();
            function1.invoke(interfaceC0780bU2);
            interfaceC0780b.a().a(new AlternativesParsing(interfaceC0780bU2.a().b(), arrayList));
        }

        public static <Target, ActualSelf extends InterfaceC0780b<Target, ActualSelf>> void b(@NotNull InterfaceC0780b<Target, ActualSelf> interfaceC0780b, @NotNull String str, @NotNull Function1<? super ActualSelf, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "onZero");
            Intrinsics.checkNotNullParameter(function1, "format");
            C0815d<Target> c0815dA = interfaceC0780b.a();
            InterfaceC0780b interfaceC0780bU = interfaceC0780b.u();
            function1.invoke(interfaceC0780bU);
            Unit unit = Unit.a;
            c0815dA.a(new Optional(str, interfaceC0780bU.a().b()));
        }

        @NotNull
        public static <Target, ActualSelf extends InterfaceC0780b<Target, ActualSelf>> C0817f<Target> c(@NotNull InterfaceC0780b<Target, ActualSelf> interfaceC0780b) {
            return new C0817f<>(interfaceC0780b.a().b().c());
        }

        public static <Target, ActualSelf extends InterfaceC0780b<Target, ActualSelf>> void d(@NotNull InterfaceC0780b<Target, ActualSelf> interfaceC0780b, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            interfaceC0780b.a().a(new ConstantFormatStructure(str));
        }
    }

    @NotNull
    C0815d<Target> a();

    void b(@NotNull String onZero, @NotNull Function1<? super ActualSelf, Unit> format);

    void n(@NotNull Function1<? super ActualSelf, Unit>[] otherFormats, @NotNull Function1<? super ActualSelf, Unit> mainFormat);

    @NotNull
    ActualSelf u();
}
