package ha;

import P9.i;
import P9.o;
import P9.p;
import S9.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import ha.C0456d;
import ha.C0469n;
import ha.L0;
import ha.N;
import ha.V0;
import ha.W;
import ha.c0;
import ha.m;
import ha.n;
import ha.y;
import ha.z0;
import j9.C0598a;
import j9.C0601d;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.text.StringsKt;
import n9.S;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010)\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b*\u0010+*\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lr9/f;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lkotlin/Function0;", "", "callback", "l", "(Lkotlin/jvm/functions/Function0;)V", "", "visible", "hasTitle", "m", "(ZZ)V", "n", "()V", "Ln9/S;", "component", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "onItemsSelectedListener", "o", "(Ln9/S;Lkotlin/jvm/functions/Function1;)V", "i", "()Z", "a", "Landroid/view/ViewGroup;", "LP9/h;", "Lq9/a;", "b", "LP9/h;", "lazyBinding", "c", "Z", "setup", "", "d", "Lkotlin/jvm/functions/Function1;", "bottomSheetStateChangeListener", "k", "()Lq9/a;", "getBinding$delegate", "(Lr9/f;)Ljava/lang/Object;", "binding", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0750f {

    @NotNull
    private final ViewGroup contentView;

    @NotNull
    private final P9.h<q9.a> lazyBinding;

    private boolean setup;

    private Function1<? super Integer, Unit> bottomSheetStateChangeListener;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq9/a;", "a", "()Lq9/a;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends l implements Function0<q9.a> {
        a() {
            super(0);
        }

        @NotNull
        public final q9.a invoke() {
            return q9.a.d(LayoutInflater.from(C0750f.this.contentView.getContext()), C0750f.this.contentView, true);
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        private Object e;
        final Function0<Unit> v;

        @f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1", f = "InputSelectBottomSheetController.kt", l = {296, 208}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0262a extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
            Object d;
            int e;
            final y i;
            final C0750f v;
            final Function0<Unit> w;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/core/view/WindowInsetsCompat;", "insets", "", "a", "(Landroidx/core/view/WindowInsetsCompat;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class a extends l implements Function1<WindowInsetsCompat, Unit> {
                final v d;
                final m<Unit> e;

                a(v vVar, m<? super Unit> mVar) {
                    super(1);
                    this.d = vVar;
                    this.e = mVar;
                }

                public final void a(@NotNull WindowInsetsCompat windowInsetsCompat) {
                    Intrinsics.checkNotNullParameter(windowInsetsCompat, "insets");
                    if (this.d.d) {
                        return;
                    }
                    Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
                    Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
                    if (insets.bottom > 0) {
                        this.d.d = true;
                        m<Unit> mVar = this.e;
                        o.a aVar = o.e;
                        mVar.resumeWith(o.b(Unit.a));
                    }
                }

                public Object invoke(Object obj) {
                    a((WindowInsetsCompat) obj);
                    return Unit.a;
                }
            }

            @f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1$2", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0263b extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
                int d;
                final Function0<Unit> e;

                C0263b(Function0<Unit> function0, Continuation<? super C0263b> continuation) {
                    super(2, continuation);
                    this.e = function0;
                }

                @NotNull
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new C0263b(this.e, continuation);
                }

                public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
                    return create(l, continuation).invokeSuspend(Unit.a);
                }

                public final Object invokeSuspend(@NotNull Object obj) {
                    b.c();
                    if (this.d != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                    this.e.invoke();
                    return Unit.a;
                }
            }

            C0262a(y yVar, C0750f c0750f, Function0<Unit> function0, Continuation<? super C0262a> continuation) {
                super(2, continuation);
                this.i = yVar;
                this.v = c0750f;
                this.w = function0;
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C0262a(this.i, this.v, this.w, continuation);
            }

            public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
                return create(l, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = b.c();
                int i = this.e;
                if (i == 0) {
                    p.b(obj);
                    C0750f c0750f = this.v;
                    this.d = c0750f;
                    this.e = 1;
                    n nVar = new n(b.b(this), 1);
                    nVar.C();
                    v vVar = new v();
                    View view = c0750f.k().h;
                    Intrinsics.checkNotNullExpressionValue(view, "shadow");
                    C0601d.e(view, new a(vVar, nVar));
                    Object objZ = nVar.z();
                    if (objZ == b.c()) {
                        kotlin.coroutines.jvm.internal.h.c(this);
                    }
                    if (objZ == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p.b(obj);
                        z0.a.a(this.i, (CancellationException) null, 1, (Object) null);
                        return Unit.a;
                    }
                    p.b(obj);
                }
                L0 l0C = c0.c();
                C0263b c0263b = new C0263b(this.w, null);
                this.d = null;
                this.e = 2;
                if (ha.g.g(l0C, c0263b, this) == objC) {
                    return objC;
                }
                z0.a.a(this.i, (CancellationException) null, 1, (Object) null);
                return Unit.a;
            }
        }

        @f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2", f = "InputSelectBottomSheetController.kt", l = {215, 216}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0264b extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
            int d;
            final y e;
            final Function0<Unit> i;

            @f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2$1", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0265a extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
                int d;
                final Function0<Unit> e;

                C0265a(Function0<Unit> function0, Continuation<? super C0265a> continuation) {
                    super(2, continuation);
                    this.e = function0;
                }

                @NotNull
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new C0265a(this.e, continuation);
                }

                public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
                    return create(l, continuation).invokeSuspend(Unit.a);
                }

                public final Object invokeSuspend(@NotNull Object obj) {
                    b.c();
                    if (this.d != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                    this.e.invoke();
                    return Unit.a;
                }
            }

            C0264b(y yVar, Function0<Unit> function0, Continuation<? super C0264b> continuation) {
                super(2, continuation);
                this.e = yVar;
                this.i = function0;
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C0264b(this.e, this.i, continuation);
            }

            public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
                return create(l, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = b.c();
                int i = this.d;
                if (i == 0) {
                    p.b(obj);
                    this.d = 1;
                    if (W.a(1000L, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p.b(obj);
                        z0.a.a(this.e, (CancellationException) null, 1, (Object) null);
                        return Unit.a;
                    }
                    p.b(obj);
                }
                L0 l0C = c0.c();
                C0265a c0265a = new C0265a(this.i, null);
                this.d = 2;
                if (ha.g.g(l0C, c0265a, this) == objC) {
                    return objC;
                }
                z0.a.a(this.e, (CancellationException) null, 1, (Object) null);
                return Unit.a;
            }
        }

        L(Function0<Unit> function0, Continuation<? super L> continuation) {
            super(2, continuation);
            this.v = function0;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            L l = C0750f.this.new L(this.v, continuation);
            l.e = obj;
            return l;
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            ha.L l = (ha.L) this.e;
            y yVarB = V0.b((z0) null, 1, (Object) null);
            ha.g.d(l, yVarB, (N) null, new C0262a(yVarB, C0750f.this, this.v, null), 2, (Object) null);
            ha.g.d(l, yVarB, (N) null, new C0264b(yVarB, this.v, null), 2, (Object) null);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends l implements Function0<Unit> {
        public static final c d = new c();

        c() {
            super(0);
        }

        public Object invoke() {
            m688invoke();
            return Unit.a;
        }

        public final void m688invoke() {
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"r9/f$d", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class d extends BottomSheetBehavior.f {
        d() {
        }

        public void b(@NotNull View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        public void c(@NotNull View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            Function1 function1 = C0750f.this.bottomSheetStateChangeListener;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(newState));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newState", "", "a", "(I)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class e extends l implements Function1<Integer, Unit> {
        final kotlin.jvm.internal.y<Function1<List<Option>, Unit>> d;
        final C0753i e;
        final C0750f i;

        e(kotlin.jvm.internal.y<Function1<List<Option>, Unit>> yVar, C0753i c0753i, C0750f c0750f) {
            super(1);
            this.d = yVar;
            this.e = c0753i;
            this.i = c0750f;
        }

        public final void a(int i) {
            if (i == 5) {
                Function1 function1 = (Function1) this.d.d;
                if (function1 != null) {
                    function1.invoke(CollectionsKt.r0(this.e.E()));
                }
                this.d.d = null;
                Context context = this.i.contentView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                C0456d.d(context);
            }
        }

        public Object invoke(Object obj) {
            a(((Number) obj).intValue());
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"r9/f$f", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class C0266f implements TextWatcher {
        final C0753i d;

        C0266f(C0753i c0753i) {
            this.d = c0753i;
        }

        @Override
        public void afterTextChanged(Editable s) {
            this.d.I(String.valueOf(s));
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class g extends l implements Function0<Unit> {
        final BottomSheetBehavior<FrameLayout> d;

        g(BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
            super(0);
            this.d = bottomSheetBehavior;
        }

        public Object invoke() {
            m689invoke();
            return Unit.a;
        }

        public final void m689invoke() {
            this.d.R0(3);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "selectedItem", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class h extends l implements Function1<Option, Unit> {
        final S d;
        final kotlin.jvm.internal.y<Function1<List<Option>, Unit>> e;
        final C0750f i;

        h(S s, kotlin.jvm.internal.y<Function1<List<Option>, Unit>> yVar, C0750f c0750f) {
            super(1);
            this.d = s;
            this.e = yVar;
            this.i = c0750f;
        }

        public final void a(@NotNull Option option) {
            Intrinsics.checkNotNullParameter(option, "selectedItem");
            if (this.d.getCanSelectMultipleValues()) {
                return;
            }
            Function1 function1 = (Function1) this.e.d;
            if (function1 != null) {
                function1.invoke(CollectionsKt.d(option));
            }
            this.e.d = null;
            this.i.i();
        }

        public Object invoke(Object obj) {
            a((Option) obj);
            return Unit.a;
        }
    }

    public C0750f(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "contentView");
        this.contentView = viewGroup;
        this.lazyBinding = i.b(new a());
    }

    public static final void j(BottomSheetBehavior bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$behavior");
        bottomSheetBehavior.R0(5);
    }

    public final q9.a k() {
        return (q9.a) this.lazyBinding.getValue();
    }

    private final void l(Function0<Unit> callback) {
        Context context = this.contentView.getContext();
        Intrinsics.d(context);
        androidx.appcompat.app.d dVarA = C0456d.a(context);
        if (dVarA == null) {
            return;
        }
        ha.g.d(androidx.lifecycle.p.a(dVarA), (CoroutineContext) null, (N) null, new L(callback, null), 3, (Object) null);
    }

    private final void m(boolean visible, boolean hasTitle) {
        if (visible) {
            k().i.setVisibility(8);
            k().g.setVisibility(0);
            k().j.getMenu().setGroupVisible(0, false);
            k().f.requestFocus();
            Context context = k().f.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C0456d.j(context);
        } else {
            Context context2 = k().f.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            C0456d.d(context2);
            k().g.setVisibility(8);
            k().i.setVisibility(0);
            k().j.getMenu().setGroupVisible(0, true);
            k().f.setText("");
        }
        if (visible && hasTitle) {
            k().j.setNavigationIcon(C0469n.s);
        } else {
            k().j.setNavigationIcon(C0469n.t);
        }
    }

    private final void n() {
        if (this.setup) {
            return;
        }
        this.setup = true;
        BottomSheetBehavior bottomSheetBehaviorM0 = BottomSheetBehavior.m0(k().b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM0, "from(...)");
        bottomSheetBehaviorM0.T0(true);
        c cVar = c.d;
        FrameLayout frameLayout = k().b;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "bottomSheet");
        C0598a.a(bottomSheetBehaviorM0, cVar, frameLayout, k().c, k().h);
        bottomSheetBehaviorM0.Y(new d());
    }

    public static final boolean p(C0750f c0750f, boolean z, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(c0750f, "this$0");
        if (menuItem.getItemId() != l9.d.F) {
            return false;
        }
        c0750f.m(true, z);
        return true;
    }

    public static final void q(BottomSheetBehavior bottomSheetBehavior, View view) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$behavior");
        bottomSheetBehavior.R0(5);
    }

    public static final void r(boolean z, C0750f c0750f, View view) {
        Intrinsics.checkNotNullParameter(c0750f, "this$0");
        if (z) {
            TextInputLayout textInputLayout = c0750f.k().g;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "searchBarTextInput");
            if (textInputLayout.getVisibility() == 0) {
                c0750f.m(false, z);
                return;
            }
        }
        c0750f.i();
    }

    public static final void s(boolean z, C0750f c0750f, BottomSheetBehavior bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(c0750f, "this$0");
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$behavior");
        if (z) {
            c0750f.l(new g(bottomSheetBehavior));
        } else {
            bottomSheetBehavior.R0(3);
        }
    }

    public final boolean i() {
        if (!this.lazyBinding.a()) {
            return false;
        }
        final BottomSheetBehavior bottomSheetBehaviorM0 = BottomSheetBehavior.m0(k().b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM0, "from(...)");
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C0456d.d(context);
        this.contentView.postDelayed(new Runnable() {
            @Override
            public final void run() {
                C0750f.j(bottomSheetBehaviorM0);
            }
        }, 100L);
        return bottomSheetBehaviorM0.q0() != 5;
    }

    public final void o(@NotNull S component, @NotNull Function1<? super List<Option>, Unit> onItemsSelectedListener) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(onItemsSelectedListener, "onItemsSelectedListener");
        n();
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.d = onItemsSelectedListener;
        String label = component.getLabel();
        final boolean z = label == null || StringsKt.Y(label);
        final boolean z2 = !z;
        final BottomSheetBehavior bottomSheetBehaviorM0 = BottomSheetBehavior.m0(k().b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM0, "from(...)");
        Context context = k().e.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C0753i c0753i = new C0753i(context, component.d(), component.getStyles(), component.getCanSelectMultipleValues(), component.b(), new h(component, yVar, this));
        this.bottomSheetStateChangeListener = new e(yVar, c0753i, this);
        m(z, z2);
        k().j.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return C0750f.p(this.a, z2, menuItem);
            }
        });
        k().i.setText(component.getLabel());
        k().e.setAdapter(c0753i);
        k().h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                C0750f.q(bottomSheetBehaviorM0, view);
            }
        });
        InputSelectBoxComponentStyle styles = component.getStyles();
        if (styles != null) {
            TextView textView = k().i;
            Intrinsics.checkNotNullExpressionValue(textView, "textviewInputSelectSheetTitle");
            s9.v.e(textView, styles.getTextBasedStyle());
            Integer baseBackgroundColorValue = styles.getBaseBackgroundColorValue();
            if (baseBackgroundColorValue != null) {
                int iIntValue = baseBackgroundColorValue.intValue();
                k().c.setBackgroundColor(iIntValue);
                k().e.setBackgroundColor(iIntValue);
            }
            Integer baseBorderColorValue = styles.getBaseBorderColorValue();
            if (baseBorderColorValue != null) {
                k().d.setBackgroundColor(baseBorderColorValue.intValue());
            }
            Integer headerCancelButtonColor = styles.getHeaderCancelButtonColor();
            if (headerCancelButtonColor != null) {
                int iIntValue2 = headerCancelButtonColor.intValue();
                k().j.setNavigationIconTint(iIntValue2);
                k().g.setEndIconTintList(ColorStateList.valueOf(iIntValue2));
            }
            Integer baseTextColor = styles.getBaseTextColor();
            if (baseTextColor != null) {
                int iIntValue3 = baseTextColor.intValue();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(androidx.core.graphics.a.l(iIntValue3, 128));
                Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
                k().f.setHintTextColor(colorStateListValueOf);
                k().f.setTextColor(iIntValue3);
            }
        }
        k().e.setLayoutManager(new LinearLayoutManager(k().a().getContext()));
        k().e.setHasFixedSize(true);
        k().f.addTextChangedListener(new C0266f(c0753i));
        k().j.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                C0750f.r(z2, this, view);
            }
        });
        k().f.setText("");
        k().b.setTranslationY(0.0f);
        this.contentView.postDelayed(new Runnable() {
            @Override
            public final void run() {
                C0750f.s(z, this, bottomSheetBehaviorM0);
            }
        }, 100L);
    }
}
