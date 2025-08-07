package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.squareup.workflow1.ui.x;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import ha.C0446E;
import ha.C0458f;
import ha.C0476u;
import ha.C0588c;
import i9.C0596c;
import j9.C0601d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import s9.v;
import v8.C0824E;
import v8.C0847o;
import v8.C0850r;
import z8.C0893f;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/i;", "Lcom/squareup/workflow1/ui/j;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;", "Lz8/f;", "binding", "<init>", "(Lz8/f;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/squareup/workflow1/ui/y;)V", "rendering", "d", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;Lcom/squareup/workflow1/ui/y;)V", "b", "Lz8/f;", "", "Z", "shouldHideSeparators", "Landroidx/recyclerview/widget/i;", "Landroidx/recyclerview/widget/i;", "dividerItemDecoration", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "f", "a", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class i implements com.squareup.workflow1.ui.j<Screen.c> {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final C0893f binding;

    private final boolean shouldHideSeparators;

    @NotNull
    private final androidx.recyclerview.widget.i dividerItemDecoration;

    @NotNull
    private final RecyclerView recyclerView;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/i$a;", "Lcom/squareup/workflow1/ui/A;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "type", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion implements A<Screen.c> {
        private final A<Screen.c> a;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class C0108a extends kotlin.jvm.internal.j implements aa.n<LayoutInflater, ViewGroup, Boolean, C0893f> {
            public static final C0108a d = new C0108a();

            C0108a() {
                super(3, C0893f.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidInstructionsBinding;", 0);
            }

            @NotNull
            public final C0893f f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(layoutInflater, "p0");
                return C0893f.d(layoutInflater, viewGroup, z);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
            }
        }

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class b extends kotlin.jvm.internal.j implements Function1<C0893f, i> {
            public static final b d = new b();

            b() {
                super(1, i.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidInstructionsBinding;)V", 0);
            }

            @NotNull
            public final i invoke(@NotNull C0893f c0893f) {
                Intrinsics.checkNotNullParameter(c0893f, "p0");
                return new i(c0893f);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public View a(@NotNull Screen.c initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public fa.c<? super Screen.c> getType() {
            return this.a.getType();
        }

        private Companion() {
            j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
            this.a = new x(z.b(Screen.c.class), C0108a.d, b.d);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.l implements Function0<Unit> {
        final double e;

        b(double d) {
            super(0);
            this.e = d;
        }

        public Object invoke() {
            m49invoke();
            return Unit.a;
        }

        public final void m49invoke() {
            View view = i.this.binding.e;
            ViewGroup.LayoutParams layoutParams = i.this.binding.e.getLayoutParams();
            double d = this.e;
            i iVar = i.this;
            if (d > 0.0d) {
                layoutParams.height = (int) C0458f.a(d);
            } else {
                iVar.binding.e.setVisibility(8);
            }
            view.setLayoutParams(layoutParams);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.l implements Function0<Unit> {
        final Screen.c d;

        c(Screen.c cVar) {
            super(0);
            this.d = cVar;
        }

        public Object invoke() {
            m50invoke();
            return Unit.a;
        }

        public final void m50invoke() {
            this.d.g().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.l implements Function0<Unit> {
        final Screen.c d;

        d(Screen.c cVar) {
            super(0);
            this.d = cVar;
        }

        public Object invoke() {
            m51invoke();
            return Unit.a;
        }

        public final void m51invoke() {
            this.d.h().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "idClass", "", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class e extends kotlin.jvm.internal.l implements Function1<IdConfig, Unit> {
        final Screen.c d;

        e(Screen.c cVar) {
            super(1);
            this.d = cVar;
        }

        public final void a(@NotNull IdConfig idConfig) {
            Intrinsics.checkNotNullParameter(idConfig, "idClass");
            this.d.k().invoke(idConfig);
        }

        public Object invoke(Object obj) {
            a((IdConfig) obj);
            return Unit.a;
        }
    }

    public i(@NotNull C0893f c0893f) {
        Intrinsics.checkNotNullParameter(c0893f, "binding");
        this.binding = c0893f;
        Context context = c0893f.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean zB = C0476u.b(context, S8.a.e, null, false, false, 14, null);
        this.shouldHideSeparators = zB;
        androidx.recyclerview.widget.i iVar = new androidx.recyclerview.widget.i(c0893f.a().getContext(), 1);
        this.dividerItemDecoration = iVar;
        RecyclerView recyclerView = c0893f.g;
        recyclerView.setLayoutManager(new LinearLayoutManager(c0893f.a().getContext()));
        if (!zB) {
            recyclerView.g(iVar);
        }
        Intrinsics.checkNotNullExpressionValue(recyclerView, "apply(...)");
        this.recyclerView = recyclerView;
        CoordinatorLayout coordinatorLayoutA = c0893f.a();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutA, "getRoot(...)");
        C0601d.c(coordinatorLayoutA, false, false, false, false, 15, null);
    }

    private final void c(StepStyles.GovernmentIdStepStyle styles, ViewEnvironment viewEnvironment) {
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.a().setBackgroundColor(iIntValue);
            C0596c.a(viewEnvironment, iIntValue);
        }
        Context context = this.binding.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable drawableBackgroundImageDrawable = styles.backgroundImageDrawable(context);
        if (drawableBackgroundImageDrawable != null) {
            this.binding.a().setBackground(drawableBackgroundImageDrawable);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.f.setControlsColor(headerButtonColorValue.intValue());
        }
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textView = this.binding.j;
            Intrinsics.checkNotNullExpressionValue(textView, "textviewGovernmentidInstructionsTitle");
            v.e(textView, titleStyleValue);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textView2 = this.binding.h;
            Intrinsics.checkNotNullExpressionValue(textView2, "textviewGovernmentidInstructionsBody");
            v.e(textView2, textStyleValue);
            TextView textView3 = this.binding.k;
            Intrinsics.checkNotNullExpressionValue(textView3, "textviewGovernmentidInstructionslistheader");
            v.e(textView3, textStyleValue);
        }
        TextBasedComponentStyle disclaimerStyleValue = styles.getDisclaimerStyleValue();
        if (disclaimerStyleValue != null) {
            TextView textView4 = this.binding.i;
            Intrinsics.checkNotNullExpressionValue(textView4, "textviewGovernmentidInstructionsDisclaimer");
            v.e(textView4, disclaimerStyleValue);
        }
        Integer governmentIdSelectOptionBorderColorValue = styles.getGovernmentIdSelectOptionBorderColorValue();
        if (governmentIdSelectOptionBorderColorValue != null) {
            int iIntValue2 = governmentIdSelectOptionBorderColorValue.intValue();
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{iIntValue2, iIntValue2});
            gradientDrawable.setSize((int) Math.ceil(C0458f.a(1.0d)), (int) Math.ceil(C0458f.a(1.0d)));
            this.dividerItemDecoration.m(gradientDrawable);
            this.binding.e.setBackgroundColor(iIntValue2);
        }
        Double governmentIdOptionBorderWidthValue = styles.getGovernmentIdOptionBorderWidthValue();
        if (governmentIdOptionBorderWidthValue != null) {
            double dDoubleValue = governmentIdOptionBorderWidthValue.doubleValue();
            GradientDrawable gradientDrawable2 = (GradientDrawable) this.dividerItemDecoration.l();
            if (gradientDrawable2 != null) {
                gradientDrawable2.setSize((int) Math.ceil(C0458f.a(dDoubleValue)), (int) Math.ceil(C0458f.a(dDoubleValue)));
            }
            View view = this.binding.e;
            Intrinsics.checkNotNullExpressionValue(view, "listDivider");
            j9.o.b(view, new b(dDoubleValue));
        }
    }

    @Override
    public void a(@NotNull Screen.c rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Context context = this.binding.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numF = C0476u.f(context, S8.a.c, null, false, 6, null);
        NextStep.GovernmentId.AssetConfig.SelectPage assetConfig = rendering.getAssetConfig();
        RemoteImage headerPictograph = assetConfig != null ? assetConfig.getHeaderPictograph() : null;
        if (numF != null) {
            this.binding.d.setImageResource(numF.intValue());
            TextView textView = this.binding.j;
            Intrinsics.checkNotNullExpressionValue(textView, "textviewGovernmentidInstructionsTitle");
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            textView.setLayoutParams(marginLayoutParams);
            this.binding.c.setVisibility(8);
            this.binding.d.setVisibility(0);
        } else if (headerPictograph != null) {
            ConstraintLayout constraintLayout = this.binding.c;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "governmentidHeaderImageContainer");
            t9.a.b(headerPictograph, constraintLayout, false, 2, null);
            this.binding.c.setVisibility(0);
            this.binding.d.setVisibility(8);
        } else {
            this.binding.c.setVisibility(8);
            this.binding.d.setVisibility(8);
        }
        this.binding.j.setText(rendering.getTitle());
        TextView textView2 = this.binding.h;
        Intrinsics.checkNotNullExpressionValue(textView2, "textviewGovernmentidInstructionsBody");
        C0847o.b(textView2, rendering.getPrompt());
        TextView textView3 = this.binding.k;
        Intrinsics.checkNotNullExpressionValue(textView3, "textviewGovernmentidInstructionslistheader");
        C0847o.b(textView3, rendering.getChooseText());
        TextView textView4 = this.binding.i;
        Intrinsics.checkNotNullExpressionValue(textView4, "textviewGovernmentidInstructionsDisclaimer");
        C0847o.b(textView4, rendering.getDisclaimer());
        if (!StringsKt.Y(rendering.getDisclaimer())) {
            this.binding.f.setAccessibilityTraversalAfter(C0824E.z0);
        }
        this.binding.e.setVisibility(this.shouldHideSeparators ? 8 : 0);
        RecyclerView.h adapter = this.recyclerView.getAdapter();
        C0850r c0850r = adapter instanceof C0850r ? (C0850r) adapter : null;
        if (c0850r == null) {
            Context context2 = this.binding.a().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            c0850r = new C0850r(context2, rendering.d(), rendering.getStyles(), rendering.getAssetConfig(), new e(rendering));
        }
        if (this.recyclerView.getAdapter() == null) {
            this.recyclerView.setAdapter(c0850r);
        }
        c0850r.I(rendering.getIsEnabled());
        NavigationState navigationState = rendering.getNavigationState();
        c cVar = new c(rendering);
        d dVar = new d(rendering);
        Pi2NavigationBar pi2NavigationBar = this.binding.f;
        Intrinsics.checkNotNullExpressionValue(pi2NavigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutA = this.binding.a();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutA, "getRoot(...)");
        C0588c.a(navigationState, cVar, dVar, pi2NavigationBar, coordinatorLayoutA);
        CoordinatorLayout coordinatorLayoutA2 = this.binding.a();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutA2, "getRoot(...)");
        C0446E.b(coordinatorLayoutA2, rendering.getError(), rendering.i(), null, 0, 0, 56, null);
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        if (styles != null) {
            c(styles, viewEnvironment);
        }
    }
}
