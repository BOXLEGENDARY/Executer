package Q8;

import Q8.e;
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
import ka.C0726c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;
import s9.v;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00000&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"LQ8/e;", "Lcom/squareup/workflow1/ui/b;", "", "titleText", "messageText", "positiveButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lkotlin/Function0;", "", "onPositiveButtonClick", "negativeButtonText", "onNegativeButtonClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "LR8/b;", "binding", "l", "(LR8/b;)V", "rendering", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "o", "(LR8/b;LQ8/e;Lcom/squareup/workflow1/ui/y;)V", "", "isWrappingButtons", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;LR8/b;Z)V", "d", "Ljava/lang/String;", "e", "i", "v", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "w", "Lkotlin/jvm/functions/Function0;", "y", "z", "Lcom/squareup/workflow1/ui/A;", "A", "Lcom/squareup/workflow1/ui/A;", "a", "()Lcom/squareup/workflow1/ui/A;", "viewFactory", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class e implements InterfaceC0490b<e> {

    @NotNull
    private final A<e> viewFactory;

    @NotNull
    private final String titleText;

    @NotNull
    private final String messageText;

    @NotNull
    private final String positiveButtonText;

    private final StepStyle styles;

    @NotNull
    private final Function0<Unit> onPositiveButtonClick;

    @NotNull
    private final String negativeButtonText;

    @NotNull
    private final Function0<Unit> onNegativeButtonClick;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        a() {
            super(0);
        }

        public Object invoke() {
            m15invoke();
            return Unit.a;
        }

        public final void m15invoke() {
            e.this.onNegativeButtonClick.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Q8/e$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
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
        c() {
            super(0);
        }

        public Object invoke() {
            m16invoke();
            return Unit.a;
        }

        public final void m16invoke() {
            e.this.onNegativeButtonClick.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.l implements Function0<Unit> {
        final R8.b d;
        final e e;

        d(R8.b bVar, e eVar) {
            super(0);
            this.d = bVar;
            this.e = eVar;
        }

        public Object invoke() throws P9.m {
            m17invoke();
            return Unit.a;
        }

        public final void m17invoke() throws P9.m {
            boolean z = true;
            if (this.d.f.getLineCount() > 1 || this.d.g.getLineCount() > 1) {
                Button button = this.d.f;
                Intrinsics.checkNotNullExpressionValue(button, "negativeButton");
                R8.b bVar = this.d;
                ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = bVar.d.getWidth();
                button.setLayoutParams(layoutParams);
                Button button2 = this.d.g;
                Intrinsics.checkNotNullExpressionValue(button2, "positiveButton");
                R8.b bVar2 = this.d;
                ViewGroup.LayoutParams layoutParams2 = button2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.width = bVar2.d.getWidth();
                button2.setLayoutParams(layoutParams2);
                R8.b bVar3 = this.d;
                bVar3.d.setReferencedIds(new int[]{bVar3.g.getId(), this.d.f.getId()});
            } else {
                z = false;
            }
            e eVar = this.e;
            eVar.k(eVar.styles, this.d, z);
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class C0043e extends kotlin.jvm.internal.j implements aa.n<LayoutInflater, ViewGroup, Boolean, R8.b> {
        public static final C0043e d = new C0043e();

        C0043e() {
            super(3, R8.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2RequestPermissionRationaleBinding;", 0);
        }

        @NotNull
        public final R8.b f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "p0");
            return R8.b.d(layoutInflater, viewGroup, z);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LR8/b;", "it", "Lcom/squareup/workflow1/ui/j;", "LQ8/e;", "b", "(LR8/b;)Lcom/squareup/workflow1/ui/j;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class f extends kotlin.jvm.internal.l implements Function1<R8.b, com.squareup.workflow1.ui.j<e>> {
        f() {
            super(1);
        }

        public static final void c(e eVar, R8.b bVar, e eVar2, ViewEnvironment viewEnvironment) {
            Intrinsics.checkNotNullParameter(eVar, "this$0");
            Intrinsics.checkNotNullParameter(bVar, "$it");
            Intrinsics.checkNotNullParameter(eVar2, "rendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            eVar.o(bVar, eVar2, viewEnvironment);
        }

        @NotNull
        public final com.squareup.workflow1.ui.j<e> invoke(@NotNull final R8.b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "it");
            e.this.l(bVar);
            final e eVar = e.this;
            return new com.squareup.workflow1.ui.j() {
                @Override
                public final void a(Object obj, ViewEnvironment viewEnvironment) {
                    e.f.c(eVar, bVar, (e) obj, viewEnvironment);
                }
            };
        }
    }

    public e(@NotNull String str, @NotNull String str2, @NotNull String str3, StepStyle stepStyle, @NotNull Function0<Unit> function0, @NotNull String str4, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(str, "titleText");
        Intrinsics.checkNotNullParameter(str2, "messageText");
        Intrinsics.checkNotNullParameter(str3, "positiveButtonText");
        Intrinsics.checkNotNullParameter(function0, "onPositiveButtonClick");
        Intrinsics.checkNotNullParameter(str4, "negativeButtonText");
        Intrinsics.checkNotNullParameter(function02, "onNegativeButtonClick");
        this.titleText = str;
        this.messageText = str2;
        this.positiveButtonText = str3;
        this.styles = stepStyle;
        this.onPositiveButtonClick = function0;
        this.negativeButtonText = str4;
        this.onNegativeButtonClick = function02;
        j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
        this.viewFactory = new x(z.b(e.class), C0043e.d, new f());
    }

    public final void k(StepStyle styles, R8.b binding, boolean isWrappingButtons) throws P9.m {
        ButtonCancelComponentStyle buttonSecondaryStyleValue;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        FrameLayout frameLayout = binding.b;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "bottomSheet");
        ConstraintLayout constraintLayout = binding.c;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "bottomSheetContent");
        s9.b.b(frameLayout, styles, constraintLayout, null, 4, null);
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView textView = binding.i;
            Intrinsics.checkNotNullExpressionValue(textView, Title.type);
            v.e(textView, titleStyleValue);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView textView2 = binding.e;
            Intrinsics.checkNotNullExpressionValue(textView2, "message");
            v.e(textView2, textStyleValue);
        }
        if (styles != null && (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) != null) {
            Button button = binding.g;
            Intrinsics.checkNotNullExpressionValue(button, "positiveButton");
            s9.d.f(button, buttonPrimaryStyleValue, false, !isWrappingButtons, 2, null);
        }
        if (styles == null || (buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue()) == null) {
            return;
        }
        Button button2 = binding.f;
        Intrinsics.checkNotNullExpressionValue(button2, "negativeButton");
        s9.d.f(button2, buttonSecondaryStyleValue, false, !isWrappingButtons, 2, null);
    }

    public final void l(R8.b binding) {
        int iD;
        Integer backgroundColorValue;
        final BottomSheetBehavior bottomSheetBehaviorM0 = BottomSheetBehavior.m0(binding.b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM0, "from(...)");
        a aVar = new a();
        FrameLayout frameLayout = binding.b;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "bottomSheet");
        C0598a.a(bottomSheetBehaviorM0, aVar, frameLayout, null, binding.h);
        binding.a().addOnAttachStateChangeListener(new b(bottomSheetBehaviorM0));
        binding.b.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                e.m(view);
            }
        });
        binding.h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                e.n(bottomSheetBehaviorM0, view);
            }
        });
        StepStyle stepStyle = this.styles;
        if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
            Context context = binding.a().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iD = C0476u.d(context, c4.b.n, null, false, 6, null);
        } else {
            iD = backgroundColorValue.intValue();
        }
        binding.a().setTag(M8.m.g, Integer.valueOf(iD));
    }

    public static final void m(View view) {
    }

    public static final void n(BottomSheetBehavior bottomSheetBehavior, View view) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$behavior");
        bottomSheetBehavior.R0(5);
    }

    public final void o(R8.b binding, final e rendering, ViewEnvironment viewEnvironment) {
        if (this.titleText.length() > 0) {
            TextView textView = binding.i;
            Intrinsics.checkNotNullExpressionValue(textView, Title.type);
            C0726c.c(textView, this.titleText);
        } else {
            binding.i.setVisibility(8);
        }
        TextView textView2 = binding.e;
        Intrinsics.checkNotNullExpressionValue(textView2, "message");
        C0726c.c(textView2, this.messageText);
        binding.g.setText(rendering.positiveButtonText);
        binding.g.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                e.p(this.d, view);
            }
        });
        binding.f.setText(rendering.negativeButtonText);
        binding.f.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                e.q(this.d, view);
            }
        });
        FrameLayout frameLayout = binding.b;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "bottomSheet");
        C0493e.c(frameLayout, rendering.new c());
        Button button = binding.f;
        Intrinsics.checkNotNullExpressionValue(button, "negativeButton");
        j9.o.b(button, new d(binding, this));
    }

    public static final void p(e eVar, View view) {
        Intrinsics.checkNotNullParameter(eVar, "$rendering");
        eVar.onPositiveButtonClick.invoke();
    }

    public static final void q(e eVar, View view) {
        Intrinsics.checkNotNullParameter(eVar, "$rendering");
        eVar.onNegativeButtonClick.invoke();
    }

    @Override
    @NotNull
    public A<e> a() {
        return this.viewFactory;
    }
}
