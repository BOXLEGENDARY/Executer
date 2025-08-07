package g8;

import com.roblox.client.personasdk.R;
import ha.L;
import ja.v;
import ka.InterfaceC0563a;
import ka.InterfaceC0570h;
import ka.q;
import ka.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u0005:\u0002&*BI\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001e\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014Jq\u0010\u001f\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u0015\"\u0004\b\u0004\u0010\u0016\"\u0004\b\u0005\u0010\u00172\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00182\u0006\u0010\u001a\u001a\u00028\u00032\u0006\u0010\u001c\u001a\u00020\u001b2$\u0010\u001e\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J>\u0010&\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0#\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u000f¢\u0006\u0004\b(\u0010\u0011R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\bX\u0088\u0004¢\u0006\u0006\n\u0004\b&\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R,\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010,R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R,\u00102\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lg8/f;", "PropsT", "StateT", "OutputT", "Lf8/a;", "Lf8/h;", "Lf8/r;", "Lg8/f$a;", "renderer", "Lg8/f$b;", "sideEffectRunner", "Lja/v;", "eventActionsChannel", "<init>", "(Lg8/f$a;Lg8/f$b;Lja/v;)V", "", "e", "()V", "value", "g", "(Lf8/r;)V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lf8/q;", "child", "props", "", "key", "Lkotlin/Function1;", "handler", "c", "(Lf8/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lha/L;", "Lkotlin/coroutines/Continuation;", "", "sideEffect", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "f", "Lg8/f$a;", "b", "Lg8/f$b;", "Lja/v;", "", "d", "Z", "frozen", "()Lf8/h;", "actionSink", "wf1-workflow-runtime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class f<PropsT, StateT, OutputT> implements InterfaceC0563a<PropsT, StateT, OutputT>, InterfaceC0570h<r<? super PropsT, StateT, ? extends OutputT>> {

    @NotNull
    private final a<PropsT, StateT, OutputT> renderer;

    @NotNull
    private final b sideEffectRunner;

    @NotNull
    private final v<r<? super PropsT, StateT, ? extends OutputT>> eventActionsChannel;

    private boolean frozen;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\u00020\u0004Jq\u0010\u0010\u001a\u00028\b\"\u0004\b\u0006\u0010\u0005\"\u0004\b\u0007\u0010\u0006\"\u0004\b\b\u0010\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\b2\u0006\u0010\n\u001a\u00028\u00062\u0006\u0010\f\u001a\u00020\u000b2$\u0010\u000f\u001a \u0012\u0004\u0012\u00028\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lg8/f$a;", "PropsT", "StateT", "OutputT", "", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Lf8/q;", "child", "props", "", "key", "Lkotlin/Function1;", "Lf8/r;", "handler", "a", "(Lf8/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "wf1-workflow-runtime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public interface a<PropsT, StateT, OutputT> {
        <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT a(@NotNull q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, @NotNull String key, @NotNull Function1<? super ChildOutputT, ? extends r<? super PropsT, StateT, ? extends OutputT>> handler);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J>\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lg8/f$b;", "", "", "key", "Lkotlin/Function2;", "Lha/L;", "Lkotlin/coroutines/Continuation;", "", "sideEffect", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "wf1-workflow-runtime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public interface b {
        void a(@NotNull String key, @NotNull Function2<? super L, ? super Continuation<? super Unit>, ? extends Object> sideEffect);
    }

    public f(@NotNull a<PropsT, StateT, OutputT> aVar, @NotNull b bVar, @NotNull v<? super r<? super PropsT, StateT, ? extends OutputT>> vVar) {
        Intrinsics.checkNotNullParameter(aVar, "renderer");
        Intrinsics.checkNotNullParameter(bVar, "sideEffectRunner");
        Intrinsics.checkNotNullParameter(vVar, "eventActionsChannel");
        this.renderer = aVar;
        this.sideEffectRunner = bVar;
        this.eventActionsChannel = vVar;
    }

    private final void e() {
        if (this.frozen) {
            throw new IllegalStateException("RenderContext cannot be used after render method returns.");
        }
    }

    @Override
    public void a(@NotNull String key, @NotNull Function2<? super L, ? super Continuation<? super Unit>, ? extends Object> sideEffect) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        e();
        this.sideEffectRunner.a(key, sideEffect);
    }

    @Override
    @NotNull
    public InterfaceC0570h<r<? super PropsT, StateT, ? extends OutputT>> b() {
        return this;
    }

    @Override
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT c(@NotNull q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, @NotNull String key, @NotNull Function1<? super ChildOutputT, ? extends r<? super PropsT, StateT, ? extends OutputT>> handler) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        e();
        return (ChildRenderingT) this.renderer.a(child, props, key, handler);
    }

    public final void f() {
        e();
        this.frozen = true;
    }

    @Override
    public void d(@NotNull r<? super PropsT, StateT, ? extends OutputT> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!this.frozen) {
            throw new UnsupportedOperationException(Intrinsics.m("Expected sink to not be sent to until after the render pass. Received action: ", value));
        }
        this.eventActionsChannel.offer(value);
    }
}
