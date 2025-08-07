package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.withpersona.sdk2.camera.a;
import com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import ha.C0456d;
import ha.C0458f;
import ha.C0467l;
import ha.C0476u;
import ha.C0588c;
import ha.EnumC0329d;
import ha.L;
import ha.c0;
import ha.z0;
import i9.C0596c;
import j9.C0601d;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n9.g0;
import n9.s0;
import org.jetbrains.annotations.NotNull;
import p8.EnumC0732a;
import s9.v;
import u5.B;
import u5.C0621h;
import u5.E;
import u5.InterfaceC0620g;
import u5.N;
import u5.w;
import v8.C0823D;
import v8.OverlayAssets;
import z8.C0889b;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001^B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010\u001cJ\u0019\u0010(\u001a\u0004\u0018\u00010\u00102\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010AR*\u0010M\u001a\u0016\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u0010\u0018\u00010Hj\u0004\u0018\u0001`J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001e\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010AR\u0018\u0010V\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010D¨\u0006_"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/CameraScreenRunner;", "Lcom/squareup/workflow1/ui/j;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "Lz8/b;", "binding", "Ll8/g;", "cameraController", "Ll8/w;", "governmentIdFeed", "<init>", "(Lz8/b;Ll8/g;Ll8/w;)V", "rendering", "Landroid/view/View;", "overlay", "Landroid/widget/TextView;", "overlayText", "", "x", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroid/view/View;Landroid/widget/TextView;)V", "F", "(Ll8/w;)V", "v", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;)V", "", "alpha", "q", "(Landroid/view/View;F)V", "u", "()V", "", "maxRecordingLengthMs", "E", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;J)V", "Landroidx/lifecycle/i;", "lifecycleScope", "y", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroidx/lifecycle/i;J)V", "w", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "s", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;)Lkotlin/Unit;", "", "t", "()Z", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "z", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lcom/squareup/workflow1/ui/y;)V", "b", "Lz8/b;", "c", "Ll8/g;", "d", "Ll8/w;", "", "e", "I", "getCurrentHintAnimation", "()I", "setCurrentHintAnimation", "(I)V", "currentHintAnimation", "Lha/z0;", "f", "Lha/z0;", "currentCaptureJob", "g", "Landroid/view/View;", "customOverlay", "h", "maxRecordingLimitJob", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "i", "Lkotlin/jvm/functions/Function1;", "currentErrorHandler", "Lkotlin/Function0;", "j", "Lkotlin/jvm/functions/Function0;", "permissionChangedHandler", "k", "cameraStateListenerJob", "l", "Ljava/lang/Integer;", "lastAutoCaptureRulesId", "Ly8/d;", "m", "Ly8/d;", "captureTipsBottomSheetController", "n", "currentOverlayAssetView", "o", "a", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class CameraScreenRunner implements com.squareup.workflow1.ui.j<Screen.b> {
    private static final int p;

    @NotNull
    private final C0889b binding;

    @NotNull
    private final InterfaceC0620g cameraController;

    @NotNull
    private final w governmentIdFeed;

    private int currentHintAnimation;

    private z0 currentCaptureJob;

    private View customOverlay;

    private z0 maxRecordingLimitJob;

    private Function1<? super Throwable, Unit> currentErrorHandler;

    private Function0<Unit> permissionChangedHandler;

    private z0 cameraStateListenerJob;

    private Integer lastAutoCaptureRulesId;

    @NotNull
    private final y8.d captureTipsBottomSheetController;

    private View currentOverlayAssetView;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/CameraScreenRunner$1", "Landroidx/lifecycle/d;", "Landroidx/lifecycle/o;", "owner", "", "onResume", "(Landroidx/lifecycle/o;)V", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class AnonymousClass1 implements androidx.lifecycle.d {
        AnonymousClass1() {
        }

        public static final void b(CameraScreenRunner cameraScreenRunner) {
            Intrinsics.checkNotNullParameter(cameraScreenRunner, "this$0");
            Function0 function0 = cameraScreenRunner.permissionChangedHandler;
            if (function0 != null) {
                function0.invoke();
            }
            cameraScreenRunner.w();
        }

        public void onResume(@NotNull androidx.lifecycle.o owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            FrameLayout frameLayoutC = CameraScreenRunner.this.binding.a();
            final CameraScreenRunner cameraScreenRunner = CameraScreenRunner.this;
            frameLayoutC.post(new Runnable() {
                @Override
                public final void run() {
                    CameraScreenRunner.AnonymousClass1.b(cameraScreenRunner);
                }
            });
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class b {
        public static final int[] a;
        public static final int[] b;

        static {
            int[] iArr = new int[Screen.b.a.values().length];
            try {
                iArr[Screen.b.a.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Screen.b.a.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Screen.b.a.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[IdConfig.b.values().length];
            try {
                iArr2[IdConfig.b.v.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IdConfig.b.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IdConfig.b.A.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IdConfig.b.w.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IdConfig.b.z.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$registerCameraStateListener$1", f = "CameraScreenRunner.kt", l = {535}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
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

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return CameraScreenRunner.this.new c(continuation);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$setupMaxRecordingLimitJob$1", f = "CameraScreenRunner.kt", l = {517, 520}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class d extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final long e;
        final Screen.b i;
        final CameraScreenRunner v;

        d(long j, Screen.b bVar, CameraScreenRunner cameraScreenRunner, Continuation<? super d> continuation) {
            super(2, continuation);
            this.e = j;
            this.i = bVar;
            this.v = cameraScreenRunner;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.e, this.i, this.v, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.l implements Function0<Unit> {
        e() {
            super(0);
        }

        public Object invoke() {
            m44invoke();
            return Unit.a;
        }

        public final void m44invoke() {
            CameraScreenRunner cameraScreenRunner = CameraScreenRunner.this;
            cameraScreenRunner.F(cameraScreenRunner.governmentIdFeed);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$showRendering$1$12", f = "CameraScreenRunner.kt", l = {358}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class f extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final Screen.b i;

        f(Screen.b bVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.i = bVar;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return CameraScreenRunner.this.new f(this.i, continuation);
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
            Screen.b bVar = this.i;
            CameraScreenRunner cameraScreenRunner = CameraScreenRunner.this;
            if (P9.o.h(objJ)) {
                bVar.z().invoke((File) objJ, cameraScreenRunner.cameraController.c());
            }
            Screen.b bVar2 = this.i;
            Throwable thE = P9.o.e(objJ);
            if (thE != null && !(thE instanceof B)) {
                bVar2.x().invoke(thE);
            }
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.l implements Function0<Unit> {
        final s0 e;
        final C0889b i;

        g(s0 s0Var, C0889b c0889b) {
            super(0);
            this.e = s0Var;
            this.i = c0889b;
        }

        public Object invoke() {
            m45invoke();
            return Unit.a;
        }

        public final void m45invoke() {
            View view = CameraScreenRunner.this.customOverlay;
            if (view != null) {
                C0889b c0889b = this.i;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                bVar.h = c0889b.p.getId();
                bVar.k = c0889b.p.getId();
                bVar.q = c0889b.p.getId();
                bVar.s = c0889b.p.getId();
                view.setLayoutParams(bVar);
            }
            this.e.c();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.l implements Function0<Unit> {
        final Screen.b d;

        h(Screen.b bVar) {
            super(0);
            this.d = bVar;
        }

        public Object invoke() {
            m46invoke();
            return Unit.a;
        }

        public final void m46invoke() {
            this.d.f().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.l implements Function0<Unit> {
        final Screen.b d;

        i(Screen.b bVar) {
            super(0);
            this.d = bVar;
        }

        public Object invoke() {
            m47invoke();
            return Unit.a;
        }

        public final void m47invoke() {
            this.d.m().invoke();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$showRendering$1$7$1", f = "CameraScreenRunner.kt", l = {296}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class j extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        final Screen.b A;
        final CameraScreenRunner B;
        int d;
        int e;
        Object i;
        Object v;
        Object w;
        Object y;
        int z;

        j(Screen.b bVar, CameraScreenRunner cameraScreenRunner, Continuation<? super j> continuation) {
            super(2, continuation);
            this.A = bVar;
            this.B = cameraScreenRunner;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new j(this.A, this.B, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$showRendering$1$9", f = "CameraScreenRunner.kt", l = {319}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class k extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        final CameraScreenRunner A;
        int d;
        int e;
        Object i;
        Object v;
        Object w;
        int y;
        final Screen.b z;

        k(Screen.b bVar, CameraScreenRunner cameraScreenRunner, Continuation<? super k> continuation) {
            super(2, continuation);
            this.z = bVar;
            this.A = cameraScreenRunner;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.z, this.A, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$startLocalVideoCaptureIfNeeded$1", f = "CameraScreenRunner.kt", l = {501}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class l extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final Screen.b i;
        final androidx.lifecycle.i v;
        final long w;

        l(Screen.b bVar, androidx.lifecycle.i iVar, long j, Continuation<? super l> continuation) {
            super(2, continuation);
            this.i = bVar;
            this.v = iVar;
            this.w = j;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return CameraScreenRunner.this.new l(this.i, this.v, this.w, continuation);
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
                CameraScreenRunner.this.y(this.i, this.v, this.w);
            }
            return Unit.a;
        }
    }

    static {
        p = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
    }

    public CameraScreenRunner(@NotNull C0889b c0889b, @NotNull InterfaceC0620g interfaceC0620g, @NotNull w wVar) {
        Intrinsics.checkNotNullParameter(c0889b, "binding");
        Intrinsics.checkNotNullParameter(interfaceC0620g, "cameraController");
        Intrinsics.checkNotNullParameter(wVar, "governmentIdFeed");
        this.binding = c0889b;
        this.cameraController = interfaceC0620g;
        this.governmentIdFeed = wVar;
        FrameLayout frameLayoutC = c0889b.a();
        Intrinsics.checkNotNullExpressionValue(frameLayoutC, "getRoot(...)");
        this.captureTipsBottomSheetController = new y8.d(frameLayoutC);
        ThemeableLottieAnimationView themeableLottieAnimationView = c0889b.r;
        int color = Color.parseColor("#43957D");
        Context context = c0889b.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        themeableLottieAnimationView.C(color, C0476u.d(context, g.a.A, null, false, 6, null));
        FrameLayout frameLayout = c0889b.m;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "innerContentView");
        C0601d.c(frameLayout, false, false, false, false, 15, null);
        Context context2 = c0889b.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        C0456d.i(context2).getLifecycle().a(new AnonymousClass1());
        w();
    }

    public static final void A(CameraScreenRunner cameraScreenRunner, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(cameraScreenRunner, "this$0");
        cameraScreenRunner.cameraController.a(z);
    }

    public static final void B(CameraScreenRunner cameraScreenRunner, Screen.b bVar, androidx.lifecycle.i iVar, View view) {
        Intrinsics.checkNotNullParameter(cameraScreenRunner, "this$0");
        Intrinsics.checkNotNullParameter(bVar, "$rendering");
        Intrinsics.checkNotNullParameter(iVar, "$lifecycleScope");
        if (cameraScreenRunner.t()) {
            return;
        }
        cameraScreenRunner.E(bVar, bVar.getMaxRecordingLengthMs());
        bVar.s().invoke();
        cameraScreenRunner.currentCaptureJob = ha.g.d(iVar, c0.c(), (ha.N) null, new j(bVar, cameraScreenRunner, null), 2, (Object) null);
    }

    public static final void C(CameraScreenRunner cameraScreenRunner, View view) {
        Intrinsics.checkNotNullParameter(cameraScreenRunner, "this$0");
        cameraScreenRunner.cameraController.h();
    }

    public static final void D(CameraScreenRunner cameraScreenRunner, Screen.b bVar, View view) {
        Intrinsics.checkNotNullParameter(cameraScreenRunner, "this$0");
        Intrinsics.checkNotNullParameter(bVar, "$rendering");
        cameraScreenRunner.captureTipsBottomSheetController.i(bVar.getStyles(), bVar.getCaptureTips(), bVar.getAssetConfig());
    }

    private final void E(Screen.b rendering, long maxRecordingLengthMs) {
        if (rendering.getVideoCaptureMethod() == EnumC0732a.e) {
            Context context = this.binding.a().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            androidx.lifecycle.i iVarA = androidx.lifecycle.p.a(C0456d.i(context));
            ha.g.d(iVarA, c0.c(), (ha.N) null, new l(rendering, iVarA, maxRecordingLengthMs, null), 2, (Object) null);
        }
    }

    public final void F(w wVar) {
        int[] iArr = new int[2];
        this.binding.o.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        Rect rect = new Rect(i2, iArr[1], this.binding.o.getWidth() + i2, iArr[1] + this.binding.o.getHeight());
        View previewView = this.cameraController.getPreviewView();
        previewView.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        wVar.s(rect, new Rect(i3, iArr[1], previewView.getWidth() + i3, iArr[1] + previewView.getHeight()));
    }

    private final void q(final View view, final float f2) {
        if (view.getAlpha() == f2) {
            if (f2 <= 0.0f) {
                view.setVisibility(4);
            }
        } else {
            if (view.getVisibility() != 0) {
                if (f2 <= 0.0f) {
                    return;
                }
                view.setVisibility(0);
                view.setAlpha(0.0f);
            }
            view.animate().alpha(f2).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    CameraScreenRunner.r(f2, view);
                }
            });
        }
    }

    public static final void r(float f2, View view) {
        Intrinsics.checkNotNullParameter(view, "$this_animateAlphaIfNeeded");
        if (f2 == 0.0f) {
            view.setVisibility(4);
        }
    }

    private final Unit s(StepStyles.GovernmentIdStepStyle styles) {
        int iCeil;
        StepStyles.StepTextBasedComponentStyleContainer base;
        TextBasedComponentStyle base2;
        String fontNameValue;
        C0889b c0889b = this.binding;
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textView = this.binding.D;
            Intrinsics.checkNotNullExpressionValue(textView, Title.type);
            v.e(textView, titleStyleValue);
            this.binding.D.setTextColor(-1);
        }
        Integer governmentIdCaptureFeedBoxBorderColorValue = styles.getGovernmentIdCaptureFeedBoxBorderColorValue();
        if (governmentIdCaptureFeedBoxBorderColorValue != null) {
            c0889b.B.setBorderColor(governmentIdCaptureFeedBoxBorderColorValue.intValue());
        }
        Double governmentIdCaptureFeedBoxBorderRadiusValue = styles.getGovernmentIdCaptureFeedBoxBorderRadiusValue();
        float fA = governmentIdCaptureFeedBoxBorderRadiusValue != null ? (float) C0458f.a(governmentIdCaptureFeedBoxBorderRadiusValue.doubleValue()) : 0.0f;
        Double governmentIdCaptureFeedBoxBorderWidthValue = styles.getGovernmentIdCaptureFeedBoxBorderWidthValue();
        if (governmentIdCaptureFeedBoxBorderWidthValue != null) {
            iCeil = (int) Math.ceil(C0458f.a(governmentIdCaptureFeedBoxBorderWidthValue.doubleValue()));
            ImageView imageView = c0889b.p;
            imageView.setPadding(imageView.getPaddingLeft(), ((int) C0458f.a(18.0d)) + iCeil, c0889b.p.getPaddingRight(), c0889b.p.getPaddingBottom());
        } else {
            iCeil = 0;
        }
        float f2 = iCeil;
        c0889b.C.setRadius(fA + f2);
        TextBasedComponentStyle governmentIdCaptureHintTextStyle = styles.getGovernmentIdCaptureHintTextStyle();
        if (governmentIdCaptureHintTextStyle != null) {
            TextView textView2 = this.binding.t;
            Intrinsics.checkNotNullExpressionValue(textView2, "overlayText");
            v.e(textView2, governmentIdCaptureHintTextStyle);
        }
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = styles.getTextStyle();
        if (textStyle != null && (base = textStyle.getBase()) != null && (base2 = base.getBase()) != null && (fontNameValue = base2.getFontNameValue()) != null) {
            TextView textView3 = this.binding.i;
            Intrinsics.checkNotNullExpressionValue(textView3, "disclaimer");
            v.d(textView3, fontNameValue);
        }
        View view = c0889b.o;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fA);
        gradientDrawable.setStroke(iCeil, c0889b.B.getBorderColor());
        view.setBackground(gradientDrawable);
        ConstraintLayout constraintLayout = c0889b.q;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(iCeil + ((int) C0458f.a(12.0d)), 0);
        gradientDrawable2.setColor(-1);
        float f3 = fA - (r6 / 2);
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f3, f3, f3, f3});
        constraintLayout.setBackground(gradientDrawable2);
        Integer captureHintIconStrokeColor = styles.getCaptureHintIconStrokeColor();
        if (captureHintIconStrokeColor != null) {
            this.binding.r.C(Color.parseColor("#000000"), captureHintIconStrokeColor.intValue());
        }
        Integer captureHintIconFillColor = styles.getCaptureHintIconFillColor();
        if (captureHintIconFillColor != null) {
            this.binding.r.C(Color.parseColor("#43957D"), captureHintIconFillColor.intValue());
        }
        c0889b.B.setStrokeWidth(f2);
        c0889b.B.setCornerRadius(fA);
        Integer governmentIdCaptureFeedBoxStrokeColorValue = styles.getGovernmentIdCaptureFeedBoxStrokeColorValue();
        if (governmentIdCaptureFeedBoxStrokeColorValue != null) {
            c0889b.B.setHighlightColor(governmentIdCaptureFeedBoxStrokeColorValue.intValue());
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue == null) {
            return null;
        }
        this.binding.n.setControlsColor(capturePageHeaderIconColorValue.intValue());
        return Unit.a;
    }

    private final boolean t() {
        z0 z0Var = this.currentCaptureJob;
        return z0Var != null && z0Var.b();
    }

    public final void u() {
        C0889b c0889b = this.binding;
        c0889b.a().setHapticFeedbackEnabled(true);
        c0889b.a().performHapticFeedback(p, 2);
    }

    private final void v(Screen.b rendering) {
        C0889b c0889b = this.binding;
        if (rendering.getShowFinalizeUi()) {
            View view = c0889b.w;
            Intrinsics.checkNotNullExpressionValue(view, "previewDim");
            q(view, 0.66f);
            AppCompatImageView appCompatImageView = c0889b.A;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "scanningAnimation");
            q(appCompatImageView, 0.0f);
            View view2 = c0889b.p;
            Intrinsics.checkNotNullExpressionValue(view2, "overlayGuide");
            q(view2, 0.0f);
            View view3 = c0889b.q;
            Intrinsics.checkNotNullExpressionValue(view3, "overlayHint");
            q(view3, 0.0f);
            View view4 = c0889b.z;
            Intrinsics.checkNotNullExpressionValue(view4, "progressBar");
            q(view4, 1.0f);
            c0889b.B.setScanningAnimationEnabled(false);
            return;
        }
        View view5 = c0889b.w;
        Intrinsics.checkNotNullExpressionValue(view5, "previewDim");
        q(view5, 0.0f);
        AppCompatImageView appCompatImageView2 = c0889b.A;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "scanningAnimation");
        q(appCompatImageView2, 1.0f);
        View view6 = c0889b.p;
        Intrinsics.checkNotNullExpressionValue(view6, "overlayGuide");
        q(view6, 1.0f);
        View view7 = c0889b.p;
        Intrinsics.checkNotNullExpressionValue(view7, "overlayGuide");
        q(view7, 1.0f);
        View view8 = c0889b.z;
        Intrinsics.checkNotNullExpressionValue(view8, "progressBar");
        q(view8, 0.0f);
        c0889b.B.setScanningAnimationEnabled(true);
    }

    public final void w() {
        z0 z0Var = this.cameraStateListenerJob;
        if (z0Var != null) {
            z0.a.a(z0Var, (CancellationException) null, 1, (Object) null);
        }
        Context context = this.binding.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.cameraStateListenerJob = ha.g.d(androidx.lifecycle.p.a(C0456d.i(context)), (CoroutineContext) null, (ha.N) null, new c(null), 3, (Object) null);
    }

    private final void x(Screen.b rendering, View overlay, TextView overlayText) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
        if (rendering.getHintText() != null) {
            accessibilityEventObtain.getText().add(rendering.getHintText());
        } else {
            int i2 = b.b[rendering.getCaptureSide().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                accessibilityEventObtain.getText().add(overlayText.getContext().getString(S8.e.v));
            } else if (i2 == 4) {
                accessibilityEventObtain.getText().add(overlayText.getContext().getString(S8.e.t));
            } else if (i2 == 5) {
                accessibilityEventObtain.getText().add(overlayText.getContext().getString(S8.e.u));
            }
            accessibilityEventObtain.getText().add(overlay.getContext().getString(S8.e.w));
        }
        overlayText.getParent().requestSendAccessibilityEvent(overlayText, accessibilityEventObtain);
    }

    public final void y(Screen.b rendering, androidx.lifecycle.i lifecycleScope, long maxRecordingLengthMs) {
        z0 z0Var = this.maxRecordingLimitJob;
        if (z0Var != null) {
            z0.a.a(z0Var, (CancellationException) null, 1, (Object) null);
        }
        this.maxRecordingLimitJob = ha.g.d(lifecycleScope, c0.b(), (ha.N) null, new d(maxRecordingLengthMs, rendering, this, null), 2, (Object) null);
    }

    @Override
    public void a(@NotNull final Screen.b rendering, @NotNull ViewEnvironment viewEnvironment) {
        z0 z0Var;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        C0889b c0889b = this.binding;
        Context context = c0889b.a().getContext();
        Intrinsics.d(context);
        final androidx.lifecycle.i iVarA = androidx.lifecycle.p.a(C0456d.i(context));
        this.cameraController.f();
        boolean z = (rendering.getState() instanceof GovernmentIdState.WaitForAutocapture) && rendering.getVideoCaptureMethod() == EnumC0732a.d && ((GovernmentIdState.WaitForAutocapture) rendering.getState()).getWebRtcState() != EnumC0329d.e;
        if (z) {
            c0889b.e.setVisibility(4);
            c0889b.d.setVisibility(0);
            y(rendering, iVarA, rendering.getMaxRecordingLengthMs());
        } else {
            c0889b.e.setVisibility(0);
            c0889b.d.setVisibility(4);
            this.cameraController.getPreviewView().setVisibility(0);
        }
        this.cameraController.i(rendering.getEnableAnalyzer());
        C0596c.a(viewEnvironment, androidx.core.content.a.c(this.binding.a().getContext(), C0467l.a));
        Integer num = this.lastAutoCaptureRulesId;
        int autoCaptureRulesId = rendering.getAutoCaptureRulesId();
        if (num == null || num.intValue() != autoCaptureRulesId) {
            this.governmentIdFeed.o(com.withpersona.sdk2.inquiry.governmentid.b.b(rendering.getCaptureSide()), rendering.c(), CollectionsKt.d(new z5.g()));
            this.lastAutoCaptureRulesId = Integer.valueOf(rendering.getAutoCaptureRulesId());
        }
        this.currentErrorHandler = rendering.x();
        this.permissionChangedHandler = rendering.l();
        c0889b.t.setText(rendering.getMessage());
        c0889b.i.setText(rendering.getDisclaimer());
        c0889b.D.setText(rendering.getTitle());
        TextView textView = c0889b.D;
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView.setVisibility(text.length() == 0 ? 8 : 0);
        if (StringsKt.Y(rendering.getDisclaimer())) {
            c0889b.j.setVisibility(8);
        } else {
            c0889b.j.setVisibility(0);
        }
        if (rendering.getHintText() == null || z) {
            c0889b.l.setVisibility(8);
        } else {
            c0889b.l.setVisibility(0);
            c0889b.l.setText(rendering.getHintText());
        }
        Context context2 = c0889b.t.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (C0456d.g(context2) && c0889b.t.getParent() != null) {
            View view = c0889b.o;
            Intrinsics.checkNotNullExpressionValue(view, "overlay");
            TextView textView2 = c0889b.t;
            Intrinsics.checkNotNullExpressionValue(textView2, "overlayText");
            x(rendering, view, textView2);
        }
        int i2 = b.a[rendering.getCaptureButtonState().ordinal()];
        if (i2 == 1) {
            c0889b.f.setEnabled(false);
        } else if (i2 == 2) {
            c0889b.f.setVisibility(0);
            c0889b.f.setEnabled(true);
        } else if (i2 == 3) {
            c0889b.f.setVisibility(4);
        }
        if (!rendering.getIsEnabled()) {
            c0889b.f.setEnabled(false);
        }
        if (C0476u.b(context, S8.a.h, null, false, false, 14, null)) {
            c0889b.t.setGravity(17);
            TextView textView3 = c0889b.t;
            Intrinsics.checkNotNullExpressionValue(textView3, "overlayText");
            ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            textView3.setLayoutParams(marginLayoutParams);
        }
        Integer numF = C0476u.f(context, S8.a.p, null, false, 6, null);
        c0889b.i.setCompoundDrawablesRelativeWithIntrinsicBounds(numF != null ? numF.intValue() : C0823D.l, 0, 0, 0);
        OverlayAssets overlayAssetsB = q.b(context, rendering.getOverlay());
        NextStep.GovernmentId.AssetConfig.CapturePage assetConfig = rendering.getAssetConfig();
        RemoteImage remoteImageA = assetConfig != null ? a.a(assetConfig, rendering.getIdClass(), rendering.getCaptureSide()) : null;
        if (remoteImageA != null) {
            if (this.currentOverlayAssetView == null) {
                ConstraintLayout constraintLayout = c0889b.s;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "overlayIconContainer");
                this.currentOverlayAssetView = t9.a.b(remoteImageA, constraintLayout, false, 2, null);
                c0889b.r.setVisibility(8);
            }
        } else if (this.currentHintAnimation != overlayAssetsB.getHintAnimation()) {
            this.currentHintAnimation = overlayAssetsB.getHintAnimation();
            c0889b.r.setAnimation(overlayAssetsB.getHintAnimation());
            c0889b.r.setVisibility(0);
        }
        c0889b.p.setImageResource(overlayAssetsB.getGuideDrawable());
        c0889b.o.setBackground(q.a(context, S8.a.g));
        Integer numF2 = C0476u.f(context, S8.a.l, null, false, 6, null);
        if (numF2 != null) {
            c0889b.A.setAnimation(numF2.intValue());
            c0889b.o.setVisibility(0);
            c0889b.B.setVisibility(8);
        } else {
            c0889b.A.setVisibility(4);
            c0889b.o.setVisibility(4);
            c0889b.B.setVisibility(0);
        }
        if ((rendering.getOverlay() instanceof Screen.Overlay.Custom) && this.customOverlay == null) {
            s0 s0Var = new s0(context);
            View viewI = g0.i(((Screen.Overlay.Custom) rendering.getOverlay()).getCustomImage(), s0Var);
            this.customOverlay = viewI;
            c0889b.e.addView(viewI);
            c0889b.A.setVisibility(4);
            c0889b.p.setVisibility(4);
            View view2 = this.customOverlay;
            if (view2 != null) {
                j9.o.b(view2, new g(s0Var, c0889b));
            }
        }
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        if (styles != null) {
            s(styles);
        }
        NavigationState navigationState = rendering.getNavigationState();
        h hVar = new h(rendering);
        i iVar = new i(rendering);
        Pi2NavigationBar pi2NavigationBar = c0889b.n;
        Intrinsics.checkNotNullExpressionValue(pi2NavigationBar, "navigationBar");
        FrameLayout frameLayoutC = c0889b.a();
        Intrinsics.checkNotNullExpressionValue(frameLayoutC, "getRoot(...)");
        C0588c.a(navigationState, hVar, iVar, pi2NavigationBar, frameLayoutC);
        c0889b.k.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                CameraScreenRunner.A(this.a, compoundButton, z2);
            }
        });
        c0889b.f.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                CameraScreenRunner.B(this.d, rendering, iVarA, view3);
            }
        });
        this.cameraController.getPreviewView().setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                CameraScreenRunner.C(this.d, view3);
            }
        });
        if (rendering.getAutoCapturing() && !t()) {
            E(rendering, rendering.getMaxRecordingLengthMs());
            this.currentCaptureJob = ha.g.d(iVarA, c0.c(), (ha.N) null, new k(rendering, this, null), 2, (Object) null);
        }
        j9.o.b(this.cameraController.getPreviewView(), new e());
        v(rendering);
        if (rendering.getCaptureTips() == null || rendering.getCaptureTips().getHelpButtonText().length() == 0) {
            c0889b.h.setVisibility(4);
        } else {
            c0889b.h.setVisibility(0);
            c0889b.h.setText(rendering.getCaptureTips().getHelpButtonText());
            c0889b.h.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    CameraScreenRunner.D(this.d, rendering, view3);
                }
            });
        }
        this.captureTipsBottomSheetController.k();
        if (((rendering.getState() instanceof GovernmentIdState.FinalizeWebRtc) || rendering.getFinalizeLocalVideo()) && (z0Var = this.maxRecordingLimitJob) != null) {
            z0.a.a(z0Var, (CancellationException) null, 1, (Object) null);
        }
        if (rendering.getFinalizeLocalVideo()) {
            ha.g.d(iVarA, c0.c(), (ha.N) null, new f(rendering, null), 2, (Object) null);
        }
    }
}
