package M8;

import M8.e;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.C0493e;
import com.squareup.workflow1.ui.InterfaceC0490b;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.squareup.workflow1.ui.x;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import ha.C0476u;
import j9.C0598a;
import j9.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;
import s9.v;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010\f\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001fR \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00000(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"LM8/e;", "Lcom/squareup/workflow1/ui/b;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lkotlin/Function0;", "", "onExit", "onContinue", "", Title.type, "message", "resumeButtonText", "cancelButtonText", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LN8/a;", "binding", "k", "(LN8/a;)V", "rendering", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "n", "(LN8/a;LM8/e;Lcom/squareup/workflow1/ui/y;)V", "", "isWrappingButtons", "j", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;LN8/a;Z)V", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "e", "Lkotlin/jvm/functions/Function0;", "i", "v", "Ljava/lang/String;", "w", "y", "z", "A", "onCancel", "Lcom/squareup/workflow1/ui/A;", "B", "Lcom/squareup/workflow1/ui/A;", "a", "()Lcom/squareup/workflow1/ui/A;", "viewFactory", "modal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class e implements InterfaceC0490b<e> {

    @NotNull
    private Function0<Unit> onCancel;

    @NotNull
    private final A<e> viewFactory;

    private final StepStyle styles;

    @NotNull
    private final Function0<Unit> onExit;

    @NotNull
    private final Function0<Unit> onContinue;

    private final String title;

    private final String message;

    private final String resumeButtonText;

    private final String cancelButtonText;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        a() {
            super(0);
        }

        public Object invoke() {
            m11invoke();
            return Unit.a;
        }

        public final void m11invoke() {
            e.this.onCancel.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"M8/e$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "modal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {
        final BottomSheetBehavior<FrameLayout> d;

        b(BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
            this.d = bottomSheetBehavior;
        }

        public static final void b(BottomSheetBehavior bottomSheetBehavior) {
            Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$behavior");
            bottomSheetBehavior.R0(3);
        }

        @Override
        public void onViewAttachedToWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            final BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.d;
            view.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    e.b.b(bottomSheetBehavior);
                }
            }, 100L);
        }

        @Override
        public void onViewDetachedFromWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.l implements Function0<Unit> {
        final BottomSheetBehavior<FrameLayout> d;

        c(BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
            super(0);
            this.d = bottomSheetBehavior;
        }

        public Object invoke() {
            m12invoke();
            return Unit.a;
        }

        public final void m12invoke() {
            this.d.R0(5);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.l implements Function0<Unit> {
        final N8.a d;
        final e e;

        d(N8.a aVar, e eVar) {
            super(0);
            this.d = aVar;
            this.e = eVar;
        }

        public Object invoke() throws P9.m {
            m13invoke();
            return Unit.a;
        }

        public final void m13invoke() throws P9.m {
            boolean z = true;
            if (this.d.d.getLineCount() > 1 || this.d.h.getLineCount() > 1) {
                Button button = this.d.d;
                Intrinsics.checkNotNullExpressionValue(button, "closeButton");
                N8.a aVar = this.d;
                ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = aVar.e.getWidth();
                button.setLayoutParams(layoutParams);
                Button button2 = this.d.h;
                Intrinsics.checkNotNullExpressionValue(button2, "retryButton");
                N8.a aVar2 = this.d;
                ViewGroup.LayoutParams layoutParams2 = button2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.width = aVar2.e.getWidth();
                button2.setLayoutParams(layoutParams2);
                N8.a aVar3 = this.d;
                aVar3.e.setReferencedIds(new int[]{aVar3.d.getId(), this.d.h.getId()});
            } else {
                z = false;
            }
            e eVar = this.e;
            eVar.j(eVar.styles, this.d, z);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0036e extends kotlin.jvm.internal.l implements Function0<Unit> {
        public static final C0036e d = new C0036e();

        C0036e() {
            super(0);
        }

        public Object invoke() {
            m14invoke();
            return Unit.a;
        }

        public final void m14invoke() {
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class f extends kotlin.jvm.internal.j implements aa.n<LayoutInflater, ViewGroup, Boolean, N8.a> {
        public static final f d = new f();

        f() {
            super(3, N8.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/modal/databinding/Pi2CancelModalBinding;", 0);
        }

        @NotNull
        public final N8.a f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "p0");
            return N8.a.d(layoutInflater, viewGroup, z);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LN8/a;", "it", "Lcom/squareup/workflow1/ui/j;", "LM8/e;", "b", "(LN8/a;)Lcom/squareup/workflow1/ui/j;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class g extends kotlin.jvm.internal.l implements Function1<N8.a, com.squareup.workflow1.ui.j<e>> {
        g() {
            super(1);
        }

        public static final void c(e eVar, N8.a aVar, e eVar2, ViewEnvironment viewEnvironment) {
            Intrinsics.checkNotNullParameter(eVar, "this$0");
            Intrinsics.checkNotNullParameter(aVar, "$it");
            Intrinsics.checkNotNullParameter(eVar2, "rendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            eVar.n(aVar, eVar2, viewEnvironment);
        }

        @NotNull
        public final com.squareup.workflow1.ui.j<e> invoke(@NotNull final N8.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "it");
            e.this.k(aVar);
            final e eVar = e.this;
            return new com.squareup.workflow1.ui.j() {
                @Override
                public final void a(Object obj, ViewEnvironment viewEnvironment) {
                    e.g.c(eVar, aVar, (e) obj, viewEnvironment);
                }
            };
        }
    }

    public e(StepStyle stepStyle, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(function0, "onExit");
        Intrinsics.checkNotNullParameter(function02, "onContinue");
        this.styles = stepStyle;
        this.onExit = function0;
        this.onContinue = function02;
        this.title = str;
        this.message = str2;
        this.resumeButtonText = str3;
        this.cancelButtonText = str4;
        this.onCancel = C0036e.d;
        j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
        this.viewFactory = new x(z.b(e.class), f.d, new g());
    }

    public final void j(StepStyle styles, N8.a binding, boolean isWrappingButtons) throws P9.m {
        ButtonCancelComponentStyle cancelDialogResumeStyleValue;
        ButtonSubmitComponentStyle cancelDialogCloseStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        FrameLayout frameLayout = binding.b;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "bottomSheet");
        ConstraintLayout constraintLayout = binding.c;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "bottomSheetContent");
        s9.b.b(frameLayout, styles, constraintLayout, null, 4, null);
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView textView = binding.g;
            Intrinsics.checkNotNullExpressionValue(textView, "hintTitle");
            v.e(textView, titleStyleValue);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView textView2 = binding.f;
            Intrinsics.checkNotNullExpressionValue(textView2, "hintMessage");
            v.e(textView2, textStyleValue);
        }
        if (styles != null && (cancelDialogCloseStyleValue = styles.getCancelDialogCloseStyleValue()) != null) {
            Button button = binding.d;
            Intrinsics.checkNotNullExpressionValue(button, "closeButton");
            s9.d.f(button, cancelDialogCloseStyleValue, false, !isWrappingButtons, 2, null);
        }
        if (styles == null || (cancelDialogResumeStyleValue = styles.getCancelDialogResumeStyleValue()) == null) {
            return;
        }
        Button button2 = binding.h;
        Intrinsics.checkNotNullExpressionValue(button2, "retryButton");
        s9.d.f(button2, cancelDialogResumeStyleValue, false, !isWrappingButtons, 2, null);
    }

    public final void k(N8.a binding) {
        int iD;
        Integer backgroundColorValue;
        final BottomSheetBehavior bottomSheetBehaviorM0 = BottomSheetBehavior.m0(binding.b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM0, "from(...)");
        a aVar = new a();
        FrameLayout frameLayout = binding.b;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "bottomSheet");
        C0598a.a(bottomSheetBehaviorM0, aVar, frameLayout, null, binding.i);
        binding.a().addOnAttachStateChangeListener(new b(bottomSheetBehaviorM0));
        binding.h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                e.l(bottomSheetBehaviorM0, view);
            }
        });
        binding.i.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                e.m(bottomSheetBehaviorM0, view);
            }
        });
        FrameLayout frameLayout2 = binding.b;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "bottomSheet");
        C0493e.c(frameLayout2, new c(bottomSheetBehaviorM0));
        StepStyle stepStyle = this.styles;
        if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
            Context context = binding.a().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iD = C0476u.d(context, c4.b.n, null, false, 6, null);
        } else {
            iD = backgroundColorValue.intValue();
        }
        binding.a().setTag(m.g, Integer.valueOf(iD));
        Button button = binding.d;
        Intrinsics.checkNotNullExpressionValue(button, "closeButton");
        o.b(button, new d(binding, this));
    }

    public static final void l(BottomSheetBehavior bottomSheetBehavior, View view) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$behavior");
        bottomSheetBehavior.R0(5);
    }

    public static final void m(BottomSheetBehavior bottomSheetBehavior, View view) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$behavior");
        bottomSheetBehavior.R0(5);
    }

    public final void n(final N8.a binding, final e rendering, ViewEnvironment viewEnvironment) {
        TextView textView = binding.g;
        String str = this.title;
        textView.setText((str == null || str.length() == 0) ? binding.g.getText() : this.title);
        TextView textView2 = binding.f;
        String str2 = this.message;
        textView2.setText((str2 == null || str2.length() == 0) ? binding.f.getText() : this.message);
        Button button = binding.d;
        String str3 = this.cancelButtonText;
        button.setText((str3 == null || str3.length() == 0) ? binding.d.getText() : this.cancelButtonText);
        Button button2 = binding.h;
        String str4 = this.resumeButtonText;
        button2.setText((str4 == null || str4.length() == 0) ? binding.h.getText() : this.resumeButtonText);
        this.onCancel = rendering.onContinue;
        binding.d.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                e.o(this.d, binding, view);
            }
        });
    }

    public static final void o(e eVar, N8.a aVar, View view) {
        Intrinsics.checkNotNullParameter(eVar, "$rendering");
        Intrinsics.checkNotNullParameter(aVar, "$this_with");
        eVar.onExit.invoke();
        BottomSheetBehavior.m0(aVar.b).R0(5);
    }

    @Override
    @NotNull
    public A<e> a() {
        return this.viewFactory;
    }
}
