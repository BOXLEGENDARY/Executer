package ka;

import com.roblox.client.personasdk.R;
import fa.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2$\u0010\r\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\f0\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "PropsT", "StateT", "OutputT", "Lf8/a;", "Lf8/o;", "worker", "Lfa/m;", "workerType", "", "key", "Lkotlin/Function1;", "Lf8/r;", "handler", "", "a", "(Lf8/a;Lf8/o;Lfa/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "wf1-workflow-core"}, k = 5, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
final class x {
    public static final <T, PropsT, StateT, OutputT> void a(@NotNull InterfaceC0563a<? extends PropsT, StateT, ? super OutputT> interfaceC0563a, @NotNull o<? extends T> oVar, @NotNull m mVar, @NotNull String str, @NotNull Function1<? super T, ? extends r<? super PropsT, StateT, ? extends OutputT>> function1) {
        Intrinsics.checkNotNullParameter(interfaceC0563a, "<this>");
        Intrinsics.checkNotNullParameter(oVar, "worker");
        Intrinsics.checkNotNullParameter(mVar, "workerType");
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(function1, "handler");
        interfaceC0563a.c(new p(mVar, str), oVar, str, function1);
    }
}
