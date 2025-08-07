package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.squareup.workflow1.ui.x;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.p;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
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
import org.jetbrains.annotations.NotNull;
import s9.v;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/m;", "Lcom/squareup/workflow1/ui/j;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$e;", "LW8/g;", "binding", "<init>", "(LW8/g;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "textPosition", "", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/squareup/workflow1/ui/y;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "rendering", "e", "(Lcom/withpersona/sdk2/inquiry/selfie/p$d$e;Lcom/squareup/workflow1/ui/y;)V", "b", "LW8/g;", "Landroid/view/View;", "Landroid/view/View;", "currentLoadingAssetView", "d", "a", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class m implements com.squareup.workflow1.ui.j<p.AbstractC0528d.e> {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final W8.g binding;

    private View currentLoadingAssetView;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/m$a;", "Lcom/squareup/workflow1/ui/A;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$e;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/selfie/p$d$e;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "type", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion implements A<p.AbstractC0528d.e> {
        private final A<p.AbstractC0528d.e> a;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class C0167a extends kotlin.jvm.internal.j implements aa.n<LayoutInflater, ViewGroup, Boolean, W8.g> {
            public static final C0167a d = new C0167a();

            C0167a() {
                super(3, W8.g.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieSubmittingScreenBinding;", 0);
            }

            @NotNull
            public final W8.g f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(layoutInflater, "p0");
                return W8.g.d(layoutInflater, viewGroup, z);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
            }
        }

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class b extends kotlin.jvm.internal.j implements Function1<W8.g, m> {
            public static final b d = new b();

            b() {
                super(1, m.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieSubmittingScreenBinding;)V", 0);
            }

            @NotNull
            public final m invoke(@NotNull W8.g gVar) {
                Intrinsics.checkNotNullParameter(gVar, "p0");
                return new m(gVar);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public View a(@NotNull p.AbstractC0528d.e initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public fa.c<? super p.AbstractC0528d.e> getType() {
            return this.a.getType();
        }

        private Companion() {
            j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
            this.a = new x(z.b(p.AbstractC0528d.e.class), C0167a.d, b.d);
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class b {
        public static final int[] a;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.l implements Function0<Unit> {
        final p.AbstractC0528d.e d;

        c(p.AbstractC0528d.e eVar) {
            super(0);
            this.d = eVar;
        }

        public Object invoke() {
            m537invoke();
            return Unit.a;
        }

        public final void m537invoke() {
            this.d.d().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.l implements Function0<Unit> {
        final p.AbstractC0528d.e d;

        d(p.AbstractC0528d.e eVar) {
            super(0);
            this.d = eVar;
        }

        public Object invoke() {
            m538invoke();
            return Unit.a;
        }

        public final void m538invoke() {
            this.d.e().invoke();
        }
    }

    public m(@NotNull final W8.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "binding");
        this.binding = gVar;
        Context context = gVar.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numF = C0476u.f(context, S8.a.n, null, false, 6, null);
        if (numF != null) {
            gVar.f.setAnimation(numF.intValue());
            gVar.f.t();
        } else {
            gVar.f.h(new U1.e("scanner", "**"), P1.j.a, new c2.e() {
                @Override
                public final Object a(c2.b bVar) {
                    return com.withpersona.sdk2.inquiry.selfie.m.d(gVar, bVar);
                }
            });
        }
        ConstraintLayout constraintLayoutA = gVar.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
        C0601d.c(constraintLayoutA, false, false, false, false, 15, null);
    }

    private final void c(StepStyles.SelfieStepStyle styles, ViewEnvironment viewEnvironment, PendingPageTextPosition textPosition) throws P9.m {
        float f;
        StyleElements.PositionType pendingPageAlignmentValue = styles.getPendingPageAlignmentValue();
        if (pendingPageAlignmentValue == null) {
            pendingPageAlignmentValue = textPosition == PendingPageTextPosition.TOP ? StyleElements.PositionType.START : StyleElements.PositionType.CENTER;
        }
        int[] iArr = textPosition == PendingPageTextPosition.TOP ? new int[]{this.binding.g.getId(), this.binding.c.getId(), this.binding.b.getId()} : new int[]{this.binding.b.getId(), this.binding.g.getId(), this.binding.c.getId()};
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this.binding.d);
        int i = b.a[pendingPageAlignmentValue.ordinal()];
        if (i == 1) {
            f = 0.0f;
        } else if (i == 2) {
            f = 0.5f;
        } else {
            if (i != 3) {
                throw new P9.m();
            }
            f = 1.0f;
        }
        dVar.q(0, 3, 0, 4, iArr, (float[]) null, 2);
        dVar.A(kotlin.collections.i.z(iArr), f);
        dVar.c(this.binding.d);
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
        TextBasedComponentStyle processingTitleStyleValue = styles.getProcessingTitleStyleValue();
        if (processingTitleStyleValue != null) {
            TextView textView = this.binding.g;
            Intrinsics.checkNotNullExpressionValue(textView, Title.type);
            v.e(textView, processingTitleStyleValue);
        }
        TextBasedComponentStyle processingTextStyleValue = styles.getProcessingTextStyleValue();
        if (processingTextStyleValue != null) {
            TextView textView2 = this.binding.c;
            Intrinsics.checkNotNullExpressionValue(textView2, "body");
            v.e(textView2, processingTextStyleValue);
        }
        Integer fillColorValue = styles.getFillColorValue();
        if (fillColorValue != null) {
            int iIntValue2 = fillColorValue.intValue();
            this.binding.f.C(Color.parseColor("#AA85FF"), iIntValue2);
            this.binding.f.C(Color.parseColor("#4600EB"), iIntValue2);
        }
        Integer strokeColorValue = styles.getStrokeColorValue();
        if (strokeColorValue != null) {
            this.binding.f.C(Color.parseColor("#190052"), strokeColorValue.intValue());
        }
        Integer backgroundColorValue2 = styles.getBackgroundColorValue();
        if (backgroundColorValue2 != null) {
            int iIntValue3 = backgroundColorValue2.intValue();
            this.binding.f.C(Color.parseColor("#FFFFFF"), iIntValue3);
            this.binding.f.C(Color.parseColor("#F1EBFF"), iIntValue3);
        }
    }

    public static final Integer d(W8.g gVar, c2.b bVar) {
        Intrinsics.checkNotNullParameter(gVar, "$this_apply");
        Context context = gVar.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Integer.valueOf(C0476u.d(context, g.a.A, null, false, 6, null));
    }

    @Override
    public void a(@NotNull p.AbstractC0528d.e rendering, @NotNull ViewEnvironment viewEnvironment) throws P9.m {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        W8.g gVar = this.binding;
        NavigationState navigationStateC = rendering.getNavigationState();
        c cVar = new c(rendering);
        d dVar = new d(rendering);
        Pi2NavigationBar pi2NavigationBar = gVar.e;
        Intrinsics.checkNotNullExpressionValue(pi2NavigationBar, "navigationBar");
        ConstraintLayout constraintLayoutA = gVar.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
        C0588c.a(navigationStateC, cVar, dVar, pi2NavigationBar, constraintLayoutA);
        if (rendering.getTitle().length() == 0) {
            gVar.g.setVisibility(8);
        } else {
            gVar.g.setText(rendering.getTitle());
            TextView textView = gVar.g;
            Intrinsics.checkNotNullExpressionValue(textView, Title.type);
            j9.o.e(textView);
        }
        if (rendering.getDescription().length() == 0) {
            gVar.c.setVisibility(8);
        } else {
            gVar.c.setText(rendering.getDescription());
        }
        RemoteImage remoteImageA = rendering.getCustomLoadingAsset();
        if (remoteImageA != null && this.currentLoadingAssetView == null) {
            ConstraintLayout constraintLayout = gVar.b;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "animationContainer");
            this.currentLoadingAssetView = t9.a.b(remoteImageA, constraintLayout, false, 2, null);
            gVar.f.setVisibility(8);
        }
        StepStyles.SelfieStepStyle selfieStepStyleG = rendering.getStyles();
        if (selfieStepStyleG != null) {
            c(selfieStepStyleG, viewEnvironment, rendering.getPendingPageTextVerticalPosition());
        }
    }
}
