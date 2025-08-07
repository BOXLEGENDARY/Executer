package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import c2.b;
import com.airbnb.lottie.LottieAnimationView;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.C0493e;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow;
import com.withpersona.sdk2.inquiry.internal.g;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import ha.C0335A;
import ha.C0476u;
import ha.y;
import i9.C0596c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\b*\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/g;", "Lcom/squareup/workflow1/ui/j;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$c$b;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "h", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "animationResId", "", "j", "(I)V", "rendering", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "k", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$c$b;Lcom/squareup/workflow1/ui/y;)V", "b", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/airbnb/lottie/LottieAnimationView;", "c", "Lcom/airbnb/lottie/LottieAnimationView;", "pendingAnimation", "d", "Ljava/lang/Integer;", "customAnimation", "e", "currentAnimationRes", "f", "a", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class g implements com.squareup.workflow1.ui.j<InquiryWorkflow.c.b> {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final View view;

    @NotNull
    private final LottieAnimationView pendingAnimation;

    private final Integer customAnimation;

    private Integer currentAnimationRes;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/g$a;", "Lcom/squareup/workflow1/ui/A;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$c$b;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$c$b;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "type", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion implements A<InquiryWorkflow.c.b> {
        private final A<InquiryWorkflow.c.b> a;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class C0134a extends kotlin.jvm.internal.j implements Function1<View, g> {
            public static final C0134a d = new C0134a();

            C0134a() {
                super(1, g.class, "<init>", "<init>(Landroid/view/View;)V", 0);
            }

            @NotNull
            public final g invoke(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "p0");
                return new g(view);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public View a(@NotNull InquiryWorkflow.c.b initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public fa.c<? super InquiryWorkflow.c.b> getType() {
            return this.a.getType();
        }

        private Companion() {
            j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
            this.a = new com.squareup.workflow1.ui.l(z.b(InquiryWorkflow.c.b.class), ha.z.e, C0134a.d);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InquiryWorkflow.c.b d;

        b(InquiryWorkflow.c.b bVar) {
            super(0);
            this.d = bVar;
        }

        public Object invoke() {
            m84invoke();
            return Unit.a;
        }

        public final void m84invoke() {
            this.d.a().invoke();
        }
    }

    public g(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        Object objFindViewById = view.findViewById(y.a);
        Intrinsics.checkNotNullExpressionValue(objFindViewById, "findViewById(...)");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) objFindViewById;
        this.pendingAnimation = lottieAnimationView;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numF = C0476u.f(context, S8.a.n, null, false, 6, null);
        this.customAnimation = numF;
        if (numF != null) {
            j(numF.intValue());
            lottieAnimationView.u();
        } else {
            lottieAnimationView.h(new U1.e("**"), P1.j.b, new c2.e() {
                @Override
                public final Object a(b bVar) {
                    return g.f(this.a, bVar);
                }
            });
            lottieAnimationView.h(new U1.e("**"), P1.j.a, new c2.e() {
                @Override
                public final Object a(b bVar) {
                    return g.g(this.a, bVar);
                }
            });
        }
    }

    public static final Integer f(g gVar, c2.b bVar) {
        Intrinsics.checkNotNullParameter(gVar, "this$0");
        Context context = gVar.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Integer.valueOf(i(gVar, context, c4.b.l, null, false, 6, null));
    }

    public static final Integer g(g gVar, c2.b bVar) {
        Intrinsics.checkNotNullParameter(gVar, "this$0");
        Context context = gVar.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Integer.valueOf(i(gVar, context, g.a.A, null, false, 6, null));
    }

    private final int h(Context context, int i, TypedValue typedValue, boolean z) {
        context.getTheme().resolveAttribute(i, typedValue, z);
        return typedValue.data;
    }

    static int i(g gVar, Context context, int i, TypedValue typedValue, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return gVar.h(context, i, typedValue, z);
    }

    private final void j(int animationResId) {
        Integer num = this.currentAnimationRes;
        if (num != null && num.intValue() == animationResId) {
            return;
        }
        this.currentAnimationRes = Integer.valueOf(animationResId);
        this.pendingAnimation.i();
        this.pendingAnimation.setMinFrame(0);
        this.pendingAnimation.setAnimation(animationResId);
        this.pendingAnimation.s();
    }

    public static final Integer l(int i, c2.b bVar) {
        return Integer.valueOf(i);
    }

    public static final Integer m(int i, c2.b bVar) {
        return Integer.valueOf(i);
    }

    @Override
    public void a(@NotNull InquiryWorkflow.c.b rendering, @NotNull ViewEnvironment viewEnvironment) {
        int i;
        Integer backgroundColorValue;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        if (rendering.getUseBasicSpinner() && this.customAnimation == null) {
            j(C0335A.a);
            this.pendingAnimation.setScaleX(0.5f);
            this.pendingAnimation.setScaleY(0.5f);
        }
        if (rendering.getUseBasicSpinner()) {
            Context context = this.view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer numF = C0476u.f(context, S8.a.m, null, false, 6, null);
            if (numF != null) {
                this.view.setBackground(androidx.core.content.a.e(this.view.getContext(), numF.intValue()));
            }
        }
        StepStyle stepStyleB = rendering.getStyles();
        if (stepStyleB == null || (backgroundColorValue = stepStyleB.getBackgroundColorValue()) == null) {
            Context context2 = this.view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            i = i(this, context2, android.R.attr.colorBackground, null, false, 6, null);
        } else {
            i = backgroundColorValue.intValue();
        }
        C0596c.a(viewEnvironment, i);
        StepStyle stepStyleB2 = rendering.getStyles();
        if (stepStyleB2 != null) {
            Integer backgroundColorValue2 = stepStyleB2.getBackgroundColorValue();
            if (backgroundColorValue2 != null) {
                this.view.setBackgroundColor(backgroundColorValue2.intValue());
            }
            Context context3 = this.view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Drawable drawableBackgroundImageDrawable = stepStyleB2.backgroundImageDrawable(context3);
            if (drawableBackgroundImageDrawable != null) {
                this.view.setBackground(drawableBackgroundImageDrawable);
            }
            if (this.customAnimation == null) {
                Integer fillColorValue = stepStyleB2.getFillColorValue();
                if (fillColorValue != null) {
                    final int iIntValue = fillColorValue.intValue();
                    this.pendingAnimation.h(new U1.e("**"), P1.j.a, new c2.e() {
                        @Override
                        public final Object a(b bVar) {
                            return g.l(iIntValue, bVar);
                        }
                    });
                }
                Integer strokeColorValue = stepStyleB2.getStrokeColorValue();
                if (strokeColorValue != null) {
                    final int iIntValue2 = strokeColorValue.intValue();
                    this.pendingAnimation.h(new U1.e("**"), P1.j.b, new c2.e() {
                        @Override
                        public final Object a(b bVar) {
                            return g.m(iIntValue2, bVar);
                        }
                    });
                }
            }
        }
        C0493e.c(this.view, new b(rendering));
    }
}
