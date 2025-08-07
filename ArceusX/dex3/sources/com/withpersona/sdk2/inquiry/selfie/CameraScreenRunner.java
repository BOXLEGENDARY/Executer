package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.withpersona.sdk2.camera.a;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.p;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import ha.C0456d;
import ha.C0467l;
import ha.C0588c;
import ha.L;
import ha.L0;
import ha.W;
import ha.c0;
import ha.z0;
import i9.C0596c;
import j9.C0601d;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s9.v;
import u5.B;
import u5.C0621h;
import u5.E;
import u5.F;
import u5.H;
import u5.InterfaceC0620g;
import u5.N;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u000b*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R*\u0010/\u001a\u0016\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000b\u0018\u00010*j\u0004\u0018\u0001`,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010(R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/CameraScreenRunner;", "Lcom/squareup/workflow1/ui/j;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a;", "LW8/a;", "binding", "Ll8/g;", "cameraController", "Ll8/H;", "selfieDirectionFeed", "<init>", "(LW8/a;Ll8/g;Ll8/H;)V", "", "p", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "o", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "Landroid/widget/TextView;", "", "scale", "m", "(Landroid/widget/TextView;F)V", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$b;", "v", "(Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$b;", "rendering", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "q", "(Lcom/withpersona/sdk2/inquiry/selfie/p$d$a;Lcom/squareup/workflow1/ui/y;)V", "b", "LW8/a;", "c", "Ll8/g;", "d", "Ll8/H;", "Lha/z0;", "e", "Lha/z0;", "maxRecordingLimitJob", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "f", "Lkotlin/jvm/functions/Function1;", "currentErrorHandler", "Lkotlin/Function0;", "g", "Lkotlin/jvm/functions/Function0;", "permissionChangedHandler", "h", "cameraStateListenerJob", "", "i", "I", "confirmConst", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class CameraScreenRunner implements com.squareup.workflow1.ui.j<p.AbstractC0528d.a> {

    @NotNull
    private final W8.a binding;

    @NotNull
    private final InterfaceC0620g cameraController;

    @NotNull
    private final H selfieDirectionFeed;

    private z0 maxRecordingLimitJob;

    private Function1<? super Throwable, Unit> currentErrorHandler;

    private Function0<Unit> permissionChangedHandler;

    private z0 cameraStateListenerJob;

    private final int confirmConst;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/CameraScreenRunner$1", "Landroidx/lifecycle/d;", "Landroidx/lifecycle/o;", "owner", "", "onResume", "(Landroidx/lifecycle/o;)V", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class AnonymousClass1 implements androidx.lifecycle.d {
        AnonymousClass1() {
        }

        public static final void b(CameraScreenRunner cameraScreenRunner) {
            Intrinsics.checkNotNullParameter(cameraScreenRunner, "this$0");
            Function0 function0 = cameraScreenRunner.permissionChangedHandler;
            if (function0 != null) {
                function0.invoke();
            }
            cameraScreenRunner.p();
        }

        public void onResume(@NotNull androidx.lifecycle.o owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            ConstraintLayout constraintLayoutA = CameraScreenRunner.this.binding.a();
            final CameraScreenRunner cameraScreenRunner = CameraScreenRunner.this;
            constraintLayoutA.post(new Runnable() {
                @Override
                public final void run() {
                    CameraScreenRunner.AnonymousClass1.b(cameraScreenRunner);
                }
            });
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[p.AbstractC0528d.a.c.values().length];
            try {
                iArr[p.AbstractC0528d.a.c.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.AbstractC0528d.a.c.v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.AbstractC0528d.a.c.z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.AbstractC0528d.a.c.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.AbstractC0528d.a.c.w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.AbstractC0528d.a.c.A.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p.AbstractC0528d.a.c.D.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[p.AbstractC0528d.a.c.i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[p.AbstractC0528d.a.c.y.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[p.AbstractC0528d.a.c.B.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[p.AbstractC0528d.a.c.C.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[p.AbstractC0528d.a.c.E.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$registerCameraStateListener$1", f = "CameraScreenRunner.kt", l = {111}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/camera/a;", "it", "", "a", "(Lcom/withpersona/sdk2/camera/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a<T> implements ka.h {
            final CameraScreenRunner d;

            a(CameraScreenRunner cameraScreenRunner) {
                this.d = cameraScreenRunner;
            }

            public final Object c(@NotNull com.withpersona.sdk2.camera.a aVar, @NotNull Continuation<? super Unit> continuation) {
                Function1 function1;
                if (Intrinsics.b(aVar, a.b.a)) {
                    Function1 function12 = this.d.currentErrorHandler;
                    if (function12 != null) {
                        function12.invoke(new N());
                    }
                } else if ((aVar instanceof a.Closed) && ((a.Closed) aVar).getWasRecordingInterrupted() && (function1 = this.d.currentErrorHandler) != null) {
                    function1.invoke(new E());
                }
                return Unit.a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return CameraScreenRunner.this.new b(continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                P9.p.b(obj);
                ka.g<com.withpersona.sdk2.camera.a> gVarA = C0621h.a(CameraScreenRunner.this.cameraController.b());
                a aVar = new a(CameraScreenRunner.this);
                this.d = 1;
                if (gVarA.a(aVar, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
            }
            return Unit.a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$showRendering$1$1", f = "CameraScreenRunner.kt", l = {200, 202}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final p.AbstractC0528d.a.b i;

        @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$showRendering$1$1$1", f = "CameraScreenRunner.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/camera/a;", "it", "", "<anonymous>", "(Lcom/withpersona/sdk2/camera/a;)Z"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<com.withpersona.sdk2.camera.a, Continuation<? super Boolean>, Object> {
            int d;
            Object e;

            a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            public final Object invoke(@NotNull com.withpersona.sdk2.camera.a aVar, Continuation<? super Boolean> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.a);
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.e = obj;
                return aVar;
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                S9.b.c();
                if (this.d != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!Intrinsics.b((com.withpersona.sdk2.camera.a) this.e, a.e.a));
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$showRendering$1$1$2", f = "CameraScreenRunner.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
            int d;
            final p.AbstractC0528d.a.b e;
            final CameraScreenRunner i;

            b(p.AbstractC0528d.a.b bVar, CameraScreenRunner cameraScreenRunner, Continuation<? super b> continuation) {
                super(2, continuation);
                this.e = bVar;
                this.i = cameraScreenRunner;
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.e, this.i, continuation);
            }

            public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
                return create(l, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                S9.b.c();
                if (this.d != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
                ((p.AbstractC0528d.a.b.g) this.e).c().invoke(this.i.cameraController.c());
                return Unit.a;
            }
        }

        c(p.AbstractC0528d.a.b bVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.i = bVar;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return CameraScreenRunner.this.new c(this.i, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                P9.p.b(obj);
                ka.g gVarG = ka.i.G(CameraScreenRunner.this.cameraController.b(), new a(null));
                this.d = 1;
                if (ka.i.h(gVarG, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    P9.p.b(obj);
                    return Unit.a;
                }
                P9.p.b(obj);
            }
            L0 l0C = c0.c();
            b bVar = new b(this.i, CameraScreenRunner.this, null);
            this.d = 2;
            if (ha.g.g(l0C, bVar, this) == objC) {
                return objC;
            }
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.l implements Function0<Unit> {
        final p.AbstractC0528d.a d;

        d(p.AbstractC0528d.a aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m527invoke();
            return Unit.a;
        }

        public final void m527invoke() {
            this.d.i().invoke();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$showRendering$1$2", f = "CameraScreenRunner.kt", l = {213}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class e extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final p.AbstractC0528d.a.b e;
        final CameraScreenRunner i;

        e(p.AbstractC0528d.a.b bVar, CameraScreenRunner cameraScreenRunner, Continuation<? super e> continuation) {
            super(2, continuation);
            this.e = bVar;
            this.i = cameraScreenRunner;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.e, this.i, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                P9.p.b(obj);
                long jC = ((p.AbstractC0528d.a.b.i) this.e).getMaxRecordingLengthMs();
                this.d = 1;
                if (W.a(jC, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
            }
            Function1 function1 = this.i.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new F());
            }
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.l implements Function0<Unit> {
        final p.AbstractC0528d.a.b d;

        f(p.AbstractC0528d.a.b bVar) {
            super(0);
            this.d = bVar;
        }

        public Object invoke() {
            m528invoke();
            return Unit.a;
        }

        public final void m528invoke() {
            ((p.AbstractC0528d.a.b.f) this.d).c().invoke();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$showRendering$1$4", f = "CameraScreenRunner.kt", l = {226}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class g extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final androidx.lifecycle.i i;
        final p.AbstractC0528d.a.b v;

        @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$showRendering$1$4$1", f = "CameraScreenRunner.kt", l = {231, 233}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
            int d;
            final p.AbstractC0528d.a.b e;
            final CameraScreenRunner i;

            a(p.AbstractC0528d.a.b bVar, CameraScreenRunner cameraScreenRunner, Continuation<? super a> continuation) {
                super(2, continuation);
                this.e = bVar;
                this.i = cameraScreenRunner;
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.e, this.i, continuation);
            }

            public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
                return create(l, continuation).invokeSuspend(Unit.a);
            }

            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        g(androidx.lifecycle.i iVar, p.AbstractC0528d.a.b bVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.i = iVar;
            this.v = bVar;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return CameraScreenRunner.this.new g(this.i, this.v, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                P9.p.b(obj);
                InterfaceC0620g interfaceC0620g = CameraScreenRunner.this.cameraController;
                this.d = 1;
                obj = interfaceC0620g.d(this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                z0 z0Var = CameraScreenRunner.this.maxRecordingLimitJob;
                if (z0Var != null) {
                    z0.a.a(z0Var, (CancellationException) null, 1, (Object) null);
                }
                CameraScreenRunner.this.maxRecordingLimitJob = ha.g.d(this.i, c0.b(), (ha.N) null, new a(this.v, CameraScreenRunner.this, null), 2, (Object) null);
            }
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.l implements Function0<Unit> {
        final p.AbstractC0528d.a.b d;

        h(p.AbstractC0528d.a.b bVar) {
            super(0);
            this.d = bVar;
        }

        public Object invoke() {
            m529invoke();
            return Unit.a;
        }

        public final void m529invoke() {
            ((p.AbstractC0528d.a.b.e) this.d).c().invoke();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$showRendering$1$7", f = "CameraScreenRunner.kt", l = {339}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class i extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final p.AbstractC0528d.a.b i;
        final p.AbstractC0528d.a v;

        i(p.AbstractC0528d.a.b bVar, p.AbstractC0528d.a aVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.i = bVar;
            this.v = aVar;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return CameraScreenRunner.this.new i(this.i, this.v, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objJ;
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                P9.p.b(obj);
                InterfaceC0620g interfaceC0620g = CameraScreenRunner.this.cameraController;
                this.d = 1;
                objJ = interfaceC0620g.j(this);
                if (objJ == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
                objJ = ((P9.o) obj).j();
            }
            p.AbstractC0528d.a.b bVar = this.i;
            if (P9.o.h(objJ)) {
                ((p.AbstractC0528d.a.b.c) bVar).c().invoke((File) objJ);
            }
            p.AbstractC0528d.a aVar = this.v;
            Throwable thE = P9.o.e(objJ);
            if (thE != null && !(thE instanceof B)) {
                aVar.h().invoke(thE);
            }
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class j extends kotlin.jvm.internal.l implements Function0<Unit> {
        final p.AbstractC0528d.a.b d;

        j(p.AbstractC0528d.a.b bVar) {
            super(0);
            this.d = bVar;
        }

        public Object invoke() {
            m530invoke();
            return Unit.a;
        }

        public final void m530invoke() {
            ((p.AbstractC0528d.a.b.c) this.d).d().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class k extends kotlin.jvm.internal.l implements Function0<Unit> {
        final p.AbstractC0528d.a d;

        k(p.AbstractC0528d.a aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m531invoke();
            return Unit.a;
        }

        public final void m531invoke() {
            this.d.g().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class l extends kotlin.jvm.internal.l implements Function0<Unit> {
        final androidx.lifecycle.i d;
        final CameraScreenRunner e;
        final p.AbstractC0528d.a.b i;

        l(androidx.lifecycle.i iVar, CameraScreenRunner cameraScreenRunner, p.AbstractC0528d.a.b bVar) {
            super(0);
            this.d = iVar;
            this.e = cameraScreenRunner;
            this.i = bVar;
        }

        public Object invoke() {
            m532invoke();
            return Unit.a;
        }

        public final void m532invoke() {
            CameraScreenRunner.u(this.d, this.e, this.i);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$showRendering$1$takePhoto$1", f = "CameraScreenRunner.kt", l = {275}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class m extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final p.AbstractC0528d.a.b i;

        m(p.AbstractC0528d.a.b bVar, Continuation<? super m> continuation) {
            super(2, continuation);
            this.i = bVar;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return CameraScreenRunner.this.new m(this.i, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE;
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                P9.p.b(obj);
                InterfaceC0620g interfaceC0620g = CameraScreenRunner.this.cameraController;
                this.d = 1;
                objE = interfaceC0620g.e(this);
                if (objE == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
                objE = ((P9.o) obj).j();
            }
            p.AbstractC0528d.a.b bVar = this.i;
            if (P9.o.h(objE)) {
                Function1<String, Unit> function1E = ((p.AbstractC0528d.a.b.C0172d) bVar).e();
                String absolutePath = ((File) objE).getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                function1E.invoke(absolutePath);
            }
            p.AbstractC0528d.a.b bVar2 = this.i;
            Throwable thE = P9.o.e(objE);
            if (thE != null) {
                ((p.AbstractC0528d.a.b.C0172d) bVar2).d().invoke(thE);
            }
            return Unit.a;
        }
    }

    public CameraScreenRunner(@NotNull W8.a aVar, @NotNull InterfaceC0620g interfaceC0620g, @NotNull H h2) {
        Intrinsics.checkNotNullParameter(aVar, "binding");
        Intrinsics.checkNotNullParameter(interfaceC0620g, "cameraController");
        Intrinsics.checkNotNullParameter(h2, "selfieDirectionFeed");
        this.binding = aVar;
        this.cameraController = interfaceC0620g;
        this.selfieDirectionFeed = h2;
        aVar.l.setPreviewView(interfaceC0620g.getPreviewView());
        ConstraintLayout constraintLayoutA = aVar.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
        C0601d.c(constraintLayoutA, false, false, false, false, 15, null);
        Context context = aVar.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C0456d.i(context).getLifecycle().a(new AnonymousClass1());
        p();
        this.confirmConst = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
    }

    private final void m(final TextView textView, float f2) {
        textView.setVisibility(0);
        textView.animate().setDuration(500L).scaleX(f2).scaleY(f2).alpha(0.0f).withEndAction(new Runnable() {
            @Override
            public final void run() {
                CameraScreenRunner.n(textView);
            }
        });
    }

    public static final void n(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "$this_animateIn");
        textView.setAlpha(1.0f);
        textView.setVisibility(8);
    }

    private final void o(StepStyles.SelfieStepStyle styles) {
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textView = this.binding.m;
            Intrinsics.checkNotNullExpressionValue(textView, Title.type);
            v.e(textView, titleStyleValue);
            this.binding.m.setTextColor(-1);
        }
        TextBasedComponentStyle selfieCaptureHintTextStyle = styles.getSelfieCaptureHintTextStyle();
        if (selfieCaptureHintTextStyle != null) {
            TextView textView2 = this.binding.f;
            Intrinsics.checkNotNullExpressionValue(textView2, "hintMessage");
            v.e(textView2, selfieCaptureHintTextStyle);
            this.binding.f.setTextColor(-1);
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue != null) {
            this.binding.h.setControlsColor(capturePageHeaderIconColorValue.intValue());
        }
    }

    public final void p() {
        z0 z0Var = this.cameraStateListenerJob;
        if (z0Var != null) {
            z0.a.a(z0Var, (CancellationException) null, 1, (Object) null);
        }
        Context context = this.binding.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.cameraStateListenerJob = ha.g.d(androidx.lifecycle.p.a(C0456d.i(context)), (CoroutineContext) null, (ha.N) null, new b(null), 3, (Object) null);
    }

    private static final void r(W8.a aVar, androidx.lifecycle.i iVar, CameraScreenRunner cameraScreenRunner, p.AbstractC0528d.a.b bVar) {
        aVar.b.setEnabled(false);
        if (aVar.l.q()) {
            u(iVar, cameraScreenRunner, bVar);
        } else {
            aVar.l.p(new l(iVar, cameraScreenRunner, bVar));
        }
    }

    public static final void s(W8.a aVar, androidx.lifecycle.i iVar, CameraScreenRunner cameraScreenRunner, p.AbstractC0528d.a.b bVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$this_apply");
        Intrinsics.checkNotNullParameter(iVar, "$lifecycleScope");
        Intrinsics.checkNotNullParameter(cameraScreenRunner, "this$0");
        Intrinsics.checkNotNullParameter(bVar, "$mode");
        r(aVar, iVar, cameraScreenRunner, bVar);
    }

    public static final void t(W8.a aVar, p.AbstractC0528d.a.b bVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$this_apply");
        Intrinsics.checkNotNullParameter(bVar, "$mode");
        if (aVar.l.q()) {
            ((p.AbstractC0528d.a.b.e) bVar).c().invoke();
        } else {
            aVar.l.p(new h(bVar));
        }
    }

    public static final void u(androidx.lifecycle.i iVar, CameraScreenRunner cameraScreenRunner, p.AbstractC0528d.a.b bVar) {
        ha.g.d(iVar, c0.c(), (ha.N) null, cameraScreenRunner.new m(bVar, null), 2, (Object) null);
    }

    private final SelfieOverlayView.b v(p.AbstractC0528d.a.c cVar) throws P9.m {
        switch (a.a[cVar.ordinal()]) {
            case 1:
                return SelfieOverlayView.b.d;
            case 2:
                return SelfieOverlayView.b.v;
            case 3:
                return SelfieOverlayView.b.z;
            case 4:
                return SelfieOverlayView.b.e;
            case 5:
                return SelfieOverlayView.b.w;
            case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                return SelfieOverlayView.b.A;
            case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                return SelfieOverlayView.b.D;
            case R.styleable.LottieAnimationView_lottie_loop:
                return SelfieOverlayView.b.i;
            case R.styleable.LottieAnimationView_lottie_progress:
                return SelfieOverlayView.b.y;
            case R.styleable.LottieAnimationView_lottie_rawRes:
                return SelfieOverlayView.b.B;
            case R.styleable.LottieAnimationView_lottie_renderMode:
                return SelfieOverlayView.b.C;
            case R.styleable.LottieAnimationView_lottie_repeatCount:
                return SelfieOverlayView.b.E;
            default:
                throw new P9.m();
        }
    }

    @Override
    public void a(@NotNull p.AbstractC0528d.a rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        this.currentErrorHandler = rendering.h();
        this.permissionChangedHandler = rendering.j();
        this.cameraController.f();
        this.cameraController.getPreviewView().setVisibility(0);
        if ((rendering.getMode() instanceof p.AbstractC0528d.a.b.i) || (rendering.getMode() instanceof p.AbstractC0528d.a.b.g)) {
            this.binding.d.setVisibility(0);
        } else {
            this.binding.d.setVisibility(8);
        }
        this.selfieDirectionFeed.m(rendering.getRequireStrictSelfieCapture());
        final W8.a aVar = this.binding;
        Context context = aVar.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final androidx.lifecycle.i iVarA = androidx.lifecycle.p.a(C0456d.i(context));
        TextView textView = this.binding.m;
        String strM = rendering.getTitle();
        if (strM == null) {
            strM = "";
        }
        textView.setText(strM);
        TextView textView2 = this.binding.m;
        CharSequence text = aVar.m.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView2.setVisibility(text.length() == 0 ? 8 : 0);
        String strD = rendering.getMessage();
        String str = strD != null ? strD : "";
        if (!Intrinsics.b(str, aVar.f.getText())) {
            aVar.f.setText(str);
        }
        aVar.l.setLeftPoseImage(rendering.getAssetOverrides().getLeftPoseImage());
        aVar.l.setRightPoseImage(rendering.getAssetOverrides().getRightPoseImage());
        int i2 = a.a[rendering.getMode().getOverlay().ordinal()];
        if (i2 == 1) {
            TextView textView3 = aVar.f;
            textView3.announceForAccessibility(textView3.getContext().getString(S8.e.N));
        } else if (i2 == 2) {
            TextView textView4 = aVar.f;
            textView4.announceForAccessibility(textView4.getContext().getString(S8.e.P));
        } else if (i2 == 3) {
            TextView textView5 = aVar.f;
            textView5.announceForAccessibility(textView5.getContext().getString(S8.e.Q));
        } else if (rendering.getMode() instanceof p.AbstractC0528d.a.b.C0172d) {
            TextView textView6 = aVar.f;
            textView6.announceForAccessibility(textView6.getContext().getString(S8.e.O));
        }
        aVar.b.setEnabled(true);
        aVar.e.setVisibility(8);
        if (!(rendering.getMode() instanceof p.AbstractC0528d.a.b.i)) {
            aVar.g.setVisibility(8);
        }
        final p.AbstractC0528d.a.b bVarE = rendering.getMode();
        if (bVarE instanceof p.AbstractC0528d.a.b.g) {
            aVar.b.setVisibility(4);
            ha.g.d(iVarA, c0.a(), (ha.N) null, new c(bVarE, null), 2, (Object) null);
            SelfieOverlayView selfieOverlayView = aVar.l;
            Intrinsics.checkNotNullExpressionValue(selfieOverlayView, "selfieWindow");
            SelfieOverlayView.w(selfieOverlayView, v(bVarE.getOverlay()), bVarE.getShowProgress(), null, 4, null);
        } else if (bVarE instanceof p.AbstractC0528d.a.b.i) {
            aVar.g.setVisibility(0);
            aVar.b.setVisibility(4);
            z0 z0Var = this.maxRecordingLimitJob;
            if (z0Var != null) {
                z0.a.a(z0Var, (CancellationException) null, 1, (Object) null);
            }
            this.maxRecordingLimitJob = ha.g.d(iVarA, c0.b(), (ha.N) null, new e(bVarE, this, null), 2, (Object) null);
        } else if (bVarE instanceof p.AbstractC0528d.a.b.f) {
            aVar.b.setVisibility(4);
            aVar.l.v(v(bVarE.getOverlay()), bVarE.getShowProgress(), new f(bVarE));
        } else if (bVarE instanceof p.AbstractC0528d.a.b.C0171b) {
            p.AbstractC0528d.a.b.C0171b c0171b = (p.AbstractC0528d.a.b.C0171b) bVarE;
            if (c0171b.getRecordLocalVideo()) {
                ha.g.d(iVarA, c0.c(), (ha.N) null, new g(iVarA, bVarE, null), 2, (Object) null);
            }
            aVar.b.setVisibility(4);
            if (!Intrinsics.b(aVar.e.getTag(), Integer.valueOf(c0171b.getCountDown()))) {
                TextView textView7 = aVar.e;
                Intrinsics.checkNotNullExpressionValue(textView7, "countdown");
                m(textView7, kotlin.ranges.b.c(4 - c0171b.getCountDown(), 1) * 1.5f);
                aVar.e.setText(String.valueOf(c0171b.getCountDown()));
                aVar.e.setTag(Integer.valueOf(c0171b.getCountDown()));
            }
            SelfieOverlayView selfieOverlayView2 = aVar.l;
            Intrinsics.checkNotNullExpressionValue(selfieOverlayView2, "selfieWindow");
            SelfieOverlayView.w(selfieOverlayView2, v(bVarE.getOverlay()), bVarE.getShowProgress(), null, 4, null);
        } else if (bVarE instanceof p.AbstractC0528d.a.b.h) {
            z0 z0Var2 = this.maxRecordingLimitJob;
            if (z0Var2 != null) {
                z0.a.a(z0Var2, (CancellationException) null, 1, (Object) null);
            }
            aVar.b.setEnabled(false);
            SelfieOverlayView selfieOverlayView3 = aVar.l;
            SelfieOverlayView.b bVarV = v(bVarE.getOverlay());
            boolean zB = bVarE.getShowProgress();
            p.AbstractC0528d.a.b.h hVar = (p.AbstractC0528d.a.b.h) bVarE;
            selfieOverlayView3.v(bVarV, zB, hVar.d());
            if (hVar.getImageCaptured()) {
                aVar.a().setHapticFeedbackEnabled(true);
                aVar.a().performHapticFeedback(this.confirmConst, 2);
            }
        } else if (bVarE instanceof p.AbstractC0528d.a.b.C0172d) {
            aVar.b.setVisibility(0);
            aVar.b.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    CameraScreenRunner.s(aVar, iVarA, this, bVarE, view);
                }
            });
            if (((p.AbstractC0528d.a.b.C0172d) bVarE).getForceCapture()) {
                aVar.b.setVisibility(4);
                r(aVar, iVarA, this, bVarE);
            }
            SelfieOverlayView selfieOverlayView4 = aVar.l;
            Intrinsics.checkNotNullExpressionValue(selfieOverlayView4, "selfieWindow");
            SelfieOverlayView.w(selfieOverlayView4, v(bVarE.getOverlay()), bVarE.getShowProgress(), null, 4, null);
        } else if (bVarE instanceof p.AbstractC0528d.a.b.e) {
            aVar.b.setVisibility(0);
            aVar.b.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    CameraScreenRunner.t(aVar, bVarE, view);
                }
            });
            SelfieOverlayView selfieOverlayView5 = aVar.l;
            Intrinsics.checkNotNullExpressionValue(selfieOverlayView5, "selfieWindow");
            SelfieOverlayView.w(selfieOverlayView5, v(bVarE.getOverlay()), bVarE.getShowProgress(), null, 4, null);
        } else if (bVarE instanceof p.AbstractC0528d.a.b.C0170a) {
            aVar.b.setVisibility(4);
            SelfieOverlayView selfieOverlayView6 = aVar.l;
            Intrinsics.checkNotNullExpressionValue(selfieOverlayView6, "selfieWindow");
            SelfieOverlayView.w(selfieOverlayView6, v(bVarE.getOverlay()), bVarE.getShowProgress(), null, 4, null);
        } else if (bVarE instanceof p.AbstractC0528d.a.b.c) {
            aVar.b.setVisibility(4);
            if (((p.AbstractC0528d.a.b.c) bVarE).getStartFinalize()) {
                z0 z0Var3 = this.maxRecordingLimitJob;
                if (z0Var3 != null) {
                    z0.a.a(z0Var3, (CancellationException) null, 1, (Object) null);
                }
                ha.g.d(iVarA, c0.c(), (ha.N) null, new i(bVarE, rendering, null), 2, (Object) null);
            }
            aVar.l.v(v(bVarE.getOverlay()), bVarE.getShowProgress(), new j(bVarE));
        }
        NavigationState navigationStateF = rendering.getNavigationState();
        k kVar = new k(rendering);
        d dVar = new d(rendering);
        Pi2NavigationBar pi2NavigationBar = aVar.h;
        Intrinsics.checkNotNullExpressionValue(pi2NavigationBar, "navigationBar");
        ConstraintLayout constraintLayoutA = aVar.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
        C0588c.a(navigationStateF, kVar, dVar, pi2NavigationBar, constraintLayoutA);
        StepStyles.SelfieStepStyle selfieStepStyleL = rendering.getStyles();
        if (selfieStepStyleL != null) {
            o(selfieStepStyleL);
            int iC = androidx.core.content.a.c(this.binding.a().getContext(), C0467l.a);
            this.binding.l.o(selfieStepStyleL);
            C0596c.a(viewEnvironment, iC);
        }
    }
}
