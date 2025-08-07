package sa;

import com.roblox.client.personasdk.R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0004\u001a[\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u0002\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\f\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lsa/o;", "T", "", "Lkotlin/Function1;", "", "alternativeFormats", "primaryFormat", "a", "(Lsa/o;[Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "ifZero", "format", "c", "(Lsa/o;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "value", "b", "(Lsa/o;C)V", "kotlinx-datetime"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0794p {
    public static final <T extends InterfaceC0793o> void a(@NotNull T t, @NotNull Function1<? super T, Unit>[] function1Arr, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(function1Arr, "alternativeFormats");
        Intrinsics.checkNotNullParameter(function1, "primaryFormat");
        if (!(t instanceof InterfaceC0780b)) {
            throw new IllegalStateException("impossible");
        }
        ((InterfaceC0780b) t).n((Function1[]) Arrays.copyOf(function1Arr, function1Arr.length), (Function1) kotlin.jvm.internal.D.c(function1, 1));
    }

    public static final void b(@NotNull InterfaceC0793o interfaceC0793o, char c) {
        Intrinsics.checkNotNullParameter(interfaceC0793o, "<this>");
        interfaceC0793o.c(String.valueOf(c));
    }

    public static final <T extends InterfaceC0793o> void c(@NotNull T t, @NotNull String str, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(str, "ifZero");
        Intrinsics.checkNotNullParameter(function1, "format");
        if (!(t instanceof InterfaceC0780b)) {
            throw new IllegalStateException("impossible");
        }
        ((InterfaceC0780b) t).b(str, (Function1) kotlin.jvm.internal.D.c(function1, 1));
    }

    public static void d(InterfaceC0793o interfaceC0793o, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        c(interfaceC0793o, str, function1);
    }
}
