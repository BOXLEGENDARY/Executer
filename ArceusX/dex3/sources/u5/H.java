package u5;

import P9.o;
import P9.p;
import S9.b;
import Y9.a;
import android.media.Image;
import androidx.camera.core.f;
import androidx.camera.core.n;
import com.roblox.client.personasdk.R;
import ha.InterfaceC0636b;
import ha.M;
import ha.N;
import ha.V0;
import ha.c0;
import ha.g;
import ha.z0;
import ka.B;
import ka.h;
import ka.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u00020\u0005B%\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\fH\u0096A¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Ll8/H;", "Landroidx/camera/core/f$a;", "Lka/B;", "LP9/o;", "Ll8/J;", "Ln8/b;", "Ll8/K;", "selfieProcessor", "Lka/x;", "resultFlow", "<init>", "(Ll8/K;Lka/x;)V", "Lka/h;", "collector", "", "a", "(Lka/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requireStrictSelfie", "", "m", "(Z)V", "Landroidx/camera/core/n;", "imageProxy", "k", "(Landroidx/camera/core/n;)V", "Landroid/media/Image;", "image", "", "rotationDegrees", "g", "(Landroid/media/Image;I)V", "d", "Ll8/K;", "e", "Lka/x;", "Lha/L;", "i", "Lha/L;", "coroutineScope", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class H implements f.a, B<o<? extends J>>, InterfaceC0636b {

    @NotNull
    private final K selfieProcessor;

    @NotNull
    private final x<o<J>> resultFlow;

    @NotNull
    private final ha.L coroutineScope;

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.camera.SelfieDirectionFeed$analyze$1", f = "SelfieDirectionFeed.kt", l = {41}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final Object i;

        L(Object obj, Continuation<? super L> continuation) {
            super(2, continuation);
            this.i = obj;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return H.this.new L(this.i, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                x xVar = H.this.resultFlow;
                o oVarA = o.a(this.i);
                this.d = 1;
                if (xVar.c(oVarA, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            return Unit.a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.camera.SelfieDirectionFeed$analyze$2", f = "SelfieDirectionFeed.kt", l = {51}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0613b extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final Object i;

        C0613b(Object obj, Continuation<? super C0613b> continuation) {
            super(2, continuation);
            this.i = obj;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return H.this.new C0613b(this.i, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                x xVar = H.this.resultFlow;
                o oVarA = o.a(this.i);
                this.d = 1;
                if (xVar.c(oVarA, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            return Unit.a;
        }
    }

    public H(@NotNull K k, @NotNull x<o<J>> xVar) {
        Intrinsics.checkNotNullParameter(k, "selfieProcessor");
        Intrinsics.checkNotNullParameter(xVar, "resultFlow");
        this.selfieProcessor = k;
        this.resultFlow = xVar;
        this.coroutineScope = M.a(c0.a().K(V0.b((z0) null, 1, (Object) null)));
    }

    public Object a(@NotNull h<? super o<? extends J>> hVar, @NotNull Continuation<?> continuation) {
        return this.resultFlow.a(hVar, continuation);
    }

    @Override
    public void g(@NotNull Image image, int rotationDegrees) {
        Intrinsics.checkNotNullParameter(image, "image");
        try {
            Object objD = this.selfieProcessor.d(image, rotationDegrees);
            a.a(image, (Throwable) null);
            g.d(this.coroutineScope, (CoroutineContext) null, (N) null, new C0613b(objD, null), 3, (Object) null);
        } finally {
        }
    }

    public void k(@NotNull n imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        try {
            Object objB = this.selfieProcessor.b(imageProxy);
            a.a(imageProxy, (Throwable) null);
            g.d(this.coroutineScope, (CoroutineContext) null, (N) null, new L(objB, null), 3, (Object) null);
        } finally {
        }
    }

    public final void m(boolean requireStrictSelfie) {
        this.selfieProcessor.l(requireStrictSelfie);
    }
}
