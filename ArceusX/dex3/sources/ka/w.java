package ka;

import com.roblox.client.personasdk.R;
import fa.m;
import ka.g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"f8/x", "f8/y", "f8/z", "f8/A", "f8/B", "f8/C"}, d2 = {}, k = 4, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class w {
    @NotNull
    public static final <PropsT, StateT, OutputT, RenderingT> k<PropsT, StateT, OutputT, RenderingT>.a a(@NotNull InterfaceC0563a<? extends PropsT, StateT, ? super OutputT> interfaceC0563a, @NotNull k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar) {
        return z.a(interfaceC0563a, kVar);
    }

    @NotNull
    public static final <PropsT, StateT, OutputT, RenderingT> r<PropsT, StateT, OutputT> b(@NotNull k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar, @NotNull String str, @NotNull Function1<? super r<? super PropsT, StateT, ? extends OutputT>.c, Unit> function1) {
        return z.b(kVar, str, function1);
    }

    @NotNull
    public static final <PropsT, StateT, OutputT, RenderingT> r<PropsT, StateT, OutputT> c(@NotNull k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar, @NotNull Function0<String> function0, @NotNull Function1<? super r<? super PropsT, StateT, ? extends OutputT>.c, Unit> function1) {
        return z.c(kVar, function0, function1);
    }

    @NotNull
    public static final <PropsT, StateT, OutputT> r<PropsT, StateT, OutputT> d(@NotNull String str, @NotNull Function1<? super r<? super PropsT, StateT, ? extends OutputT>.c, Unit> function1) {
        return C0562B.a(str, function1);
    }

    @NotNull
    public static final <PropsT, StateT, OutputT> r<PropsT, StateT, OutputT> e(@NotNull Function0<String> function0, @NotNull Function1<? super r<? super PropsT, StateT, ? extends OutputT>.c, Unit> function1) {
        return C0562B.b(function0, function1);
    }

    @NotNull
    public static final <PropsT, StateT, OutputT> Pair<StateT, WorkflowOutput<OutputT>> h(@NotNull r<? super PropsT, StateT, ? extends OutputT> rVar, PropsT propst, StateT statet) {
        return C0562B.d(rVar, propst, statet);
    }

    public static final <T, PropsT, StateT, OutputT> Object i(@NotNull g<? extends T> gVar, @NotNull InterfaceC0570h<? super r<? super PropsT, StateT, ? extends OutputT>> interfaceC0570h, @NotNull Function1<? super T, ? extends r<? super PropsT, StateT, ? extends OutputT>> function1, @NotNull Continuation<? super Unit> continuation) {
        return y.a(gVar, interfaceC0570h, function1, continuation);
    }

    @NotNull
    public static final s j(@NotNull q<?, ?, ?> qVar) {
        return m.a(qVar);
    }

    public static final <OutputT> Object k(@NotNull o<? extends OutputT> oVar, @NotNull String str, @NotNull InterfaceC0570h<? super r<? super o<? extends OutputT>, Integer, ? extends OutputT>> interfaceC0570h, @NotNull Continuation<? super Unit> continuation) {
        return C0561A.d(oVar, str, interfaceC0570h, continuation);
    }

    public static final <T, PropsT, StateT, OutputT> void l(@NotNull InterfaceC0563a<? extends PropsT, StateT, ? super OutputT> interfaceC0563a, @NotNull o<? extends T> oVar, @NotNull m mVar, @NotNull String str, @NotNull Function1<? super T, ? extends r<? super PropsT, StateT, ? extends OutputT>> function1) {
        x.a(interfaceC0563a, oVar, mVar, str, function1);
    }

    public static final <PropsT, StateT, OutputT> Object m(@NotNull InterfaceC0570h<? super r<? super PropsT, StateT, ? extends OutputT>> interfaceC0570h, @NotNull r<? super PropsT, StateT, ? extends OutputT> rVar, @NotNull Continuation<? super Unit> continuation) {
        return y.b(interfaceC0570h, rVar, continuation);
    }

    @NotNull
    public static final s n(@NotNull m mVar) {
        return m.b(mVar);
    }
}
