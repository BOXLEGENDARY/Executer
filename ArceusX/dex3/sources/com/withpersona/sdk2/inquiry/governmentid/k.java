package com.withpersona.sdk2.inquiry.governmentid;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.L;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.squareup.workflow1.ui.x;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.k;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import ha.C0356g;
import ha.C0446E;
import ha.C0458f;
import ha.C0467l;
import ha.C0476u;
import ha.C0588c;
import ha.InterfaceC0883h;
import i9.C0596c;
import j9.C0601d;
import java.io.File;
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
import v8.C0822C;
import v8.C0824E;
import v8.C0825F;
import v8.OverlayAssets;
import z8.C0894g;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/k;", "Lcom/squareup/workflow1/ui/j;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "Lz8/g;", "binding", "<init>", "(Lz8/g;)V", "", "isProcessing", "", "m", "(Z)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "preferredAxis", "", "originalCallTimestamp", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "i", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;)Lkotlin/Unit;", "j", "()V", "rendering", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "n", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;Lcom/squareup/workflow1/ui/y;)V", "b", "Lz8/g;", "Landroidx/constraintlayout/widget/d;", "c", "Landroidx/constraintlayout/widget/d;", "constraintSet", "Landroid/view/View;", "d", "Landroid/view/View;", "currentOverlayAssetView", "e", "Z", "f", "a", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class k implements com.squareup.workflow1.ui.j<Screen.d> {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final C0894g binding;

    @NotNull
    private final androidx.constraintlayout.widget.d constraintSet;

    private View currentOverlayAssetView;

    private boolean isProcessing;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/k$a;", "Lcom/squareup/workflow1/ui/A;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "type", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion implements A<Screen.d> {
        private final A<Screen.d> a;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class C0109a extends kotlin.jvm.internal.j implements aa.n<LayoutInflater, ViewGroup, Boolean, C0894g> {
            public static final C0109a d = new C0109a();

            C0109a() {
                super(3, C0894g.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidReviewBinding;", 0);
            }

            @NotNull
            public final C0894g f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(layoutInflater, "p0");
                return C0894g.d(layoutInflater, viewGroup, z);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
            }
        }

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class b extends kotlin.jvm.internal.j implements Function1<C0894g, k> {
            public static final b d = new b();

            b() {
                super(1, k.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidReviewBinding;)V", 0);
            }

            @NotNull
            public final k invoke(@NotNull C0894g c0894g) {
                Intrinsics.checkNotNullParameter(c0894g, "p0");
                return new k(c0894g);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public View a(@NotNull Screen.d initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public fa.c<? super Screen.d> getType() {
            return this.a.getType();
        }

        private Companion() {
            j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
            this.a = new x(z.b(Screen.d.class), C0109a.d, b.d);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0894g d;
        final long e;
        final k i;
        final StyleElements.Axis v;

        b(C0894g c0894g, long j, k kVar, StyleElements.Axis axis) {
            super(0);
            this.d = c0894g;
            this.e = j;
            this.i = kVar;
            this.v = axis;
        }

        public static final void b(k kVar) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(kVar, "this$0");
            kVar.j();
        }

        public Object invoke() {
            m52invoke();
            return Unit.a;
        }

        public final void m52invoke() {
            boolean z = (this.d.b.getLineCount() == 0 || this.d.t.getLineCount() == 0) ? false : true;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.e;
            boolean z2 = jCurrentTimeMillis - j > 300;
            if (!z && !z2) {
                this.i.k(this.v, j);
                return;
            }
            if (z && (this.d.b.getLineCount() > 1 || this.d.t.getLineCount() > 1 || this.v == StyleElements.Axis.VERTICAL)) {
                Button button = this.d.b;
                Intrinsics.checkNotNullExpressionValue(button, "acceptButton");
                C0894g c0894g = this.d;
                ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = c0894g.j.getWidth();
                button.setLayoutParams(layoutParams);
                Button button2 = this.d.t;
                Intrinsics.checkNotNullExpressionValue(button2, "retryButton");
                C0894g c0894g2 = this.d;
                ViewGroup.LayoutParams layoutParams2 = button2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.width = c0894g2.j.getWidth();
                button2.setLayoutParams(layoutParams2);
                C0894g c0894g3 = this.d;
                c0894g3.j.setReferencedIds(new int[]{c0894g3.b.getId(), this.d.t.getId()});
                this.i.binding.k.setAccessibilityTraversalAfter(C0824E.r0);
            }
            Button button3 = this.d.b;
            final k kVar = this.i;
            L.a(button3, new Runnable() {
                @Override
                public final void run() throws Resources.NotFoundException {
                    k.b.b(kVar);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0894g d;
        final Screen.d e;

        c(C0894g c0894g, Screen.d dVar) {
            super(0);
            this.d = c0894g;
            this.e = dVar;
        }

        public Object invoke() {
            m53invoke();
            return Unit.a;
        }

        public final void m53invoke() {
            this.d.u.setTag(C0824E.g0, this.e.getImagePath());
            ImageView imageView = this.d.u;
            Intrinsics.checkNotNullExpressionValue(imageView, "reviewImage");
            File file = new File(this.e.getImagePath());
            InterfaceC0883h imageLoader = this.e.getImageLoader();
            C0894g c0894g = this.d;
            Screen.d dVar = this.e;
            C0356g.a aVarS = new C0356g.a(imageView.getContext()).d(file).s(imageView);
            int iF = kotlin.ranges.b.f(c0894g.u.getMeasuredWidth(), 2000);
            aVarS.o(iF, iF);
            aVarS.h(dVar.getImagePath());
            imageLoader.a(aVarS.a());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.l implements Function0<Unit> {
        final Screen.d d;

        d(Screen.d dVar) {
            super(0);
            this.d = dVar;
        }

        public Object invoke() {
            m54invoke();
            return Unit.a;
        }

        public final void m54invoke() {
            this.d.p().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.l implements Function0<Unit> {
        final Screen.d d;

        e(Screen.d dVar) {
            super(0);
            this.d = dVar;
        }

        public Object invoke() {
            m55invoke();
            return Unit.a;
        }

        public final void m55invoke() {
            this.d.e().invoke();
        }
    }

    public k(@NotNull C0894g c0894g) {
        Intrinsics.checkNotNullParameter(c0894g, "binding");
        this.binding = c0894g;
        this.constraintSet = new androidx.constraintlayout.widget.d();
        CoordinatorLayout coordinatorLayout = c0894g.d;
        Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "cameraScreenContent");
        C0601d.c(coordinatorLayout, false, false, false, false, 15, null);
        ThemeableLottieAnimationView themeableLottieAnimationView = c0894g.o;
        int color = Color.parseColor("#43957D");
        Context context = c0894g.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        themeableLottieAnimationView.C(color, C0476u.d(context, g.a.A, null, false, 6, null));
    }

    private final Unit i(StepStyles.GovernmentIdStepStyle styles) throws P9.m {
        int iIntValue;
        StepStyles.StepTextBasedComponentStyleContainer base;
        TextBasedComponentStyle base2;
        String fontNameValue;
        C0894g c0894g = this.binding;
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textView = this.binding.x;
            Intrinsics.checkNotNullExpressionValue(textView, Title.type);
            v.e(textView, titleStyleValue);
            this.binding.x.setTextColor(-1);
        }
        TextBasedComponentStyle governmentIdCaptureHintTextStyle = styles.getGovernmentIdCaptureHintTextStyle();
        if (governmentIdCaptureHintTextStyle != null) {
            TextView textView2 = this.binding.q;
            Intrinsics.checkNotNullExpressionValue(textView2, "overlayText");
            v.e(textView2, governmentIdCaptureHintTextStyle);
        }
        Integer governmentIdReviewImageBoxBorderColorValue = styles.getGovernmentIdReviewImageBoxBorderColorValue();
        if (governmentIdReviewImageBoxBorderColorValue != null) {
            iIntValue = governmentIdReviewImageBoxBorderColorValue.intValue();
            c0894g.s.setIndeterminateTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{iIntValue}));
        } else {
            iIntValue = -1;
        }
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = styles.getTextStyle();
        if (textStyle != null && (base = textStyle.getBase()) != null && (base2 = base.getBase()) != null && (fontNameValue = base2.getFontNameValue()) != null) {
            TextView textView3 = this.binding.f;
            Intrinsics.checkNotNullExpressionValue(textView3, "disclaimer");
            v.d(textView3, fontNameValue);
        }
        Double governmentIdReviewImageBoxBorderRadiusValue = styles.getGovernmentIdReviewImageBoxBorderRadiusValue();
        float fA = governmentIdReviewImageBoxBorderRadiusValue != null ? (float) C0458f.a(governmentIdReviewImageBoxBorderRadiusValue.doubleValue()) : 0.0f;
        Double governmentIdReviewImageBoxBorderWidthValue = styles.getGovernmentIdReviewImageBoxBorderWidthValue();
        int iCeil = governmentIdReviewImageBoxBorderWidthValue != null ? (int) Math.ceil(C0458f.a(governmentIdReviewImageBoxBorderWidthValue.doubleValue())) : 0;
        c0894g.v.setRadius(iCeil + fA);
        View view = c0894g.l;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fA);
        gradientDrawable.setStroke(iCeil, iIntValue);
        view.setBackground(gradientDrawable);
        ConstraintLayout constraintLayout = c0894g.n;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(iCeil + ((int) C0458f.a(12.0d)), 0);
        gradientDrawable2.setColor(-1);
        float f = fA - (r8 / 2);
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
        constraintLayout.setBackground(gradientDrawable2);
        ButtonSubmitComponentStyle submitPhotoButtonStyleValue = styles.getSubmitPhotoButtonStyleValue();
        if (submitPhotoButtonStyleValue != null) {
            Button button = c0894g.b;
            Intrinsics.checkNotNullExpressionValue(button, "acceptButton");
            s9.d.f(button, submitPhotoButtonStyleValue, false, false, 2, null);
        }
        ButtonCancelComponentStyle retakePhotoButtonStyleValue = styles.getRetakePhotoButtonStyleValue();
        if (retakePhotoButtonStyleValue != null) {
            Button button2 = c0894g.t;
            Intrinsics.checkNotNullExpressionValue(button2, "retryButton");
            s9.d.f(button2, retakePhotoButtonStyleValue, false, false, 2, null);
        }
        Integer captureHintIconStrokeColor = styles.getCaptureHintIconStrokeColor();
        if (captureHintIconStrokeColor != null) {
            this.binding.o.C(Color.parseColor("#000000"), captureHintIconStrokeColor.intValue());
        }
        Integer captureHintIconFillColor = styles.getCaptureHintIconFillColor();
        if (captureHintIconFillColor != null) {
            this.binding.o.C(Color.parseColor("#43957D"), captureHintIconFillColor.intValue());
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue == null) {
            return null;
        }
        this.binding.k.setControlsColor(capturePageHeaderIconColorValue.intValue());
        return Unit.a;
    }

    public final void j() throws Resources.NotFoundException {
        C0894g c0894g = this.binding;
        if (c0894g.b.getTop() < c0894g.h.getBottom() + c0894g.a().getContext().getResources().getDimensionPixelOffset(C0822C.a)) {
            this.constraintSet.e(c0894g.a().getContext(), C0825F.h);
            androidx.transition.x.a(this.binding.d, new androidx.transition.a());
            this.constraintSet.c(this.binding.e);
        }
    }

    public final void k(StyleElements.Axis preferredAxis, long originalCallTimestamp) {
        C0894g c0894g = this.binding;
        Button button = c0894g.b;
        Intrinsics.checkNotNullExpressionValue(button, "acceptButton");
        j9.o.b(button, new b(c0894g, originalCallTimestamp, this, preferredAxis));
    }

    static void l(k kVar, StyleElements.Axis axis, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        kVar.k(axis, j);
    }

    private final void m(boolean isProcessing) {
        if (this.isProcessing == isProcessing) {
            return;
        }
        this.isProcessing = isProcessing;
        C0894g c0894g = this.binding;
        androidx.transition.z zVarW0 = new androidx.transition.z().q0(new androidx.transition.e(3)).q0(new androidx.transition.b()).q0(new androidx.transition.c()).q0(new androidx.transition.d()).y0(0).w0(300L);
        Intrinsics.checkNotNullExpressionValue(zVarW0, "setDuration(...)");
        androidx.transition.x.a(c0894g.a(), zVarW0);
        if (isProcessing) {
            c0894g.r.setVisibility(0);
            c0894g.h.setVisibility(4);
            c0894g.b.setVisibility(4);
            c0894g.t.setVisibility(4);
            c0894g.n.setVisibility(4);
            return;
        }
        c0894g.r.setVisibility(4);
        c0894g.h.setVisibility(0);
        c0894g.b.setVisibility(0);
        c0894g.t.setVisibility(0);
        c0894g.n.setVisibility(0);
    }

    public static final void o(C0894g c0894g) {
        Intrinsics.checkNotNullParameter(c0894g, "$this_with");
        ObjectAnimator duration = ObjectAnimator.ofFloat(c0894g.i, "alpha", 0.9f, 0.0f).setDuration(500L);
        duration.setInterpolator(new LinearInterpolator());
        duration.start();
        c0894g.a().setHapticFeedbackEnabled(true);
        c0894g.a().performHapticFeedback(1, 2);
    }

    public static final void p(C0894g c0894g, P1.d dVar) {
        Intrinsics.checkNotNullParameter(c0894g, "$this_with");
        c0894g.o.setProgress(1.0f);
    }

    public static final void q(Screen.d dVar, View view) {
        Intrinsics.checkNotNullParameter(dVar, "$rendering");
        dVar.a().invoke();
    }

    public static final void r(Screen.d dVar, View view) {
        Intrinsics.checkNotNullParameter(dVar, "$rendering");
        dVar.p().invoke();
    }

    @Override
    public void a(@NotNull final Screen.d rendering, @NotNull ViewEnvironment viewEnvironment) throws P9.m {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        final C0894g c0894g = this.binding;
        if (c0894g.c.isChecked()) {
            c0894g.o.f(new P1.i() {
                @Override
                public final void a(P1.d dVar) {
                    com.withpersona.sdk2.inquiry.governmentid.k.p(c0894g, dVar);
                }
            });
        } else {
            c0894g.c.setChecked(true);
            c0894g.a().post(new Runnable() {
                @Override
                public final void run() {
                    com.withpersona.sdk2.inquiry.governmentid.k.o(c0894g);
                }
            });
        }
        Object tag = c0894g.u.getTag(C0824E.g0);
        if (!Intrinsics.b(tag instanceof String ? (String) tag : null, rendering.getImagePath())) {
            ImageView imageView = c0894g.u;
            Intrinsics.checkNotNullExpressionValue(imageView, "reviewImage");
            j9.o.b(imageView, new c(c0894g, rendering));
        }
        c0894g.q.setText(rendering.getMessage());
        c0894g.g.setVisibility(StringsKt.Y(rendering.getDisclaimer()) ? 8 : 0);
        c0894g.f.setVisibility(StringsKt.Y(rendering.getDisclaimer()) ? 8 : 0);
        c0894g.f.setText(rendering.getDisclaimer());
        c0894g.b.setText(rendering.getAcceptText());
        c0894g.t.setText(rendering.getRetryText());
        c0894g.x.setText(rendering.getConfirmCaptureTitle());
        TextView textView = c0894g.x;
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView.setVisibility(text.length() == 0 ? 8 : 0);
        Context context = c0894g.a().getContext();
        View view = c0894g.l;
        Intrinsics.d(context);
        view.setBackground(q.a(context, S8.a.k));
        if (C0476u.b(context, S8.a.h, null, false, false, 14, null)) {
            c0894g.q.setGravity(17);
            TextView textView2 = c0894g.q;
            Intrinsics.checkNotNullExpressionValue(textView2, "overlayText");
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            textView2.setLayoutParams(marginLayoutParams);
        }
        Integer numF = C0476u.f(context, S8.a.p, null, false, 6, null);
        if (numF != null) {
            c0894g.g.setImageResource(numF.intValue());
        }
        OverlayAssets overlayAssetsB = q.b(context, rendering.getOverlay());
        c0894g.m.setImageResource(overlayAssetsB.getGuideDrawable());
        NextStep.GovernmentId.AssetConfig.CapturePage assetConfig = rendering.getAssetConfig();
        RemoteImage remoteImageA = assetConfig != null ? a.a(assetConfig, rendering.getIdClass(), rendering.getCaptureSide()) : null;
        if (remoteImageA == null) {
            c0894g.o.setAnimation(overlayAssetsB.getHintAnimation());
        } else if (this.currentOverlayAssetView == null) {
            ConstraintLayout constraintLayout = c0894g.p;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "overlayIconContainer");
            this.currentOverlayAssetView = t9.a.b(remoteImageA, constraintLayout, false, 2, null);
            c0894g.o.setVisibility(8);
        }
        NavigationState navigationState = rendering.getNavigationState();
        d dVar = new d(rendering);
        e eVar = new e(rendering);
        Pi2NavigationBar pi2NavigationBar = c0894g.k;
        Intrinsics.checkNotNullExpressionValue(pi2NavigationBar, "navigationBar");
        FrameLayout frameLayoutC = c0894g.a();
        Intrinsics.checkNotNullExpressionValue(frameLayoutC, "getRoot(...)");
        C0588c.a(navigationState, dVar, eVar, pi2NavigationBar, frameLayoutC);
        c0894g.b.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                com.withpersona.sdk2.inquiry.governmentid.k.q(rendering, view2);
            }
        });
        c0894g.t.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                com.withpersona.sdk2.inquiry.governmentid.k.r(rendering, view2);
            }
        });
        c0894g.b.setEnabled(rendering.getIsEnabled());
        c0894g.t.setEnabled(rendering.getIsEnabled());
        if (rendering.getIsAutoClassifying()) {
            m(true);
        } else {
            m(false);
        }
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        if (styles != null) {
            i(styles);
            C0596c.a(viewEnvironment, androidx.core.content.a.c(this.binding.a().getContext(), C0467l.a));
        }
        l(this, rendering.getReviewCaptureButtonsAxis(), 0L, 2, null);
        CoordinatorLayout coordinatorLayout = this.binding.d;
        Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "cameraScreenContent");
        C0446E.b(coordinatorLayout, rendering.getError(), rendering.n(), null, 0, 0, 56, null);
    }
}
