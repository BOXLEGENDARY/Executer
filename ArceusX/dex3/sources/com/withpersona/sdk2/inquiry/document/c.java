package com.withpersona.sdk2.inquiry.document;

import P9.m;
import aa.n;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
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
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import ha.C0476u;
import ha.C0588c;
import i9.C0596c;
import j9.C0601d;
import j9.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;
import r8.C0743a;
import s9.v;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\b*\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001e¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/c;", "Lcom/squareup/workflow1/ui/j;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d$a;", "Lr8/a;", "binding", "<init>", "(Lr8/a;)V", "Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "c", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "textPosition", "", "b", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/squareup/workflow1/ui/y;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "rendering", "e", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d$a;Lcom/squareup/workflow1/ui/y;)V", "Lr8/a;", "Landroid/view/View;", "Landroid/view/View;", "currentLoadingAssetView", "d", "a", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class c implements j<DocumentWorkflow.AbstractC0501d.LoadingAnimation> {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final C0743a binding;

    private View currentLoadingAssetView;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/c$a;", "Lcom/squareup/workflow1/ui/A;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d$a;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d$a;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "type", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion implements A<DocumentWorkflow.AbstractC0501d.LoadingAnimation> {
        private final A<DocumentWorkflow.AbstractC0501d.LoadingAnimation> a;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class C0085a extends kotlin.jvm.internal.j implements n<LayoutInflater, ViewGroup, Boolean, C0743a> {
            public static final C0085a d = new C0085a();

            C0085a() {
                super(3, C0743a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentLoadingBinding;", 0);
            }

            @NotNull
            public final C0743a f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(layoutInflater, "p0");
                return C0743a.d(layoutInflater, viewGroup, z);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
            }
        }

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class b extends kotlin.jvm.internal.j implements Function1<C0743a, c> {
            public static final b d = new b();

            b() {
                super(1, c.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentLoadingBinding;)V", 0);
            }

            @NotNull
            public final c invoke(@NotNull C0743a c0743a) {
                Intrinsics.checkNotNullParameter(c0743a, "p0");
                return new c(c0743a);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public View a(@NotNull DocumentWorkflow.AbstractC0501d.LoadingAnimation initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public fa.c<? super DocumentWorkflow.AbstractC0501d.LoadingAnimation> getType() {
            return this.a.getType();
        }

        private Companion() {
            j.Companion companion = j.INSTANCE;
            this.a = new x(z.b(DocumentWorkflow.AbstractC0501d.LoadingAnimation.class), C0085a.d, b.d);
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
    static final class C0086c extends l implements Function0<Unit> {
        final DocumentWorkflow.AbstractC0501d.LoadingAnimation d;

        C0086c(DocumentWorkflow.AbstractC0501d.LoadingAnimation aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m40invoke();
            return Unit.a;
        }

        public final void m40invoke() {
            this.d.c().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends l implements Function0<Unit> {
        final DocumentWorkflow.AbstractC0501d.LoadingAnimation d;

        d(DocumentWorkflow.AbstractC0501d.LoadingAnimation aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m41invoke();
            return Unit.a;
        }

        public final void m41invoke() {
            this.d.d().invoke();
        }
    }

    public c(@NotNull C0743a c0743a) {
        Intrinsics.checkNotNullParameter(c0743a, "binding");
        this.binding = c0743a;
        Context context = c0743a.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numF = C0476u.f(context, S8.a.n, null, false, 6, null);
        if (numF != null) {
            c0743a.f.setAnimation(numF.intValue());
            c0743a.f.u();
        } else {
            ThemeableLottieAnimationView themeableLottieAnimationView = c0743a.f;
            int color = Color.parseColor("#4600EB");
            Context context2 = c0743a.a().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            themeableLottieAnimationView.C(color, d(this, context2, g.a.A, null, false, 6, null));
        }
        ConstraintLayout constraintLayoutC = c0743a.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutC, "getRoot(...)");
        C0601d.c(constraintLayoutC, false, false, false, false, 15, null);
    }

    private final void b(StepStyles.DocumentStepStyle styles, ViewEnvironment viewEnvironment, PendingPageTextPosition textPosition) throws m {
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
                throw new m();
            }
            f = 1.0f;
        }
        dVar.q(0, 3, 0, 4, iArr, (float[]) null, 2);
        dVar.A(i.z(iArr), f);
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
            this.binding.f.C(Color.parseColor("#4600EB"), fillColorValue.intValue());
        }
        Integer strokeColorValue = styles.getStrokeColorValue();
        if (strokeColorValue != null) {
            int iIntValue2 = strokeColorValue.intValue();
            this.binding.f.C(Color.parseColor("#180052"), iIntValue2);
            this.binding.f.C(Color.parseColor("#190052"), iIntValue2);
        }
    }

    private final int c(Context context, int i, TypedValue typedValue, boolean z) {
        context.getTheme().resolveAttribute(i, typedValue, z);
        return typedValue.data;
    }

    static int d(c cVar, Context context, int i, TypedValue typedValue, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return cVar.c(context, i, typedValue, z);
    }

    @Override
    public void a(@NotNull DocumentWorkflow.AbstractC0501d.LoadingAnimation rendering, @NotNull ViewEnvironment viewEnvironment) throws m {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        C0743a c0743a = this.binding;
        NavigationState navigationStateB = rendering.getNavigationState();
        C0086c c0086c = new C0086c(rendering);
        d dVar = new d(rendering);
        Pi2NavigationBar pi2NavigationBar = c0743a.e;
        Intrinsics.checkNotNullExpressionValue(pi2NavigationBar, "navigationBar");
        ConstraintLayout constraintLayoutC = c0743a.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutC, "getRoot(...)");
        C0588c.a(navigationStateB, c0086c, dVar, pi2NavigationBar, constraintLayoutC);
        String strH = rendering.getTitle();
        if (strH == null || strH.length() == 0) {
            c0743a.g.setVisibility(8);
        } else {
            c0743a.g.setText(rendering.getTitle());
            TextView textView = c0743a.g;
            Intrinsics.checkNotNullExpressionValue(textView, Title.type);
            o.e(textView);
        }
        String strF = rendering.getPrompt();
        if (strF == null || strF.length() == 0) {
            c0743a.c.setVisibility(8);
        } else {
            c0743a.c.setText(rendering.getPrompt());
        }
        NextStep.Document.AssetConfig.PendingPage pendingPageA = rendering.getAssetConfig();
        RemoteImage loadingPictograph = pendingPageA != null ? pendingPageA.getLoadingPictograph() : null;
        if (loadingPictograph != null && this.currentLoadingAssetView == null) {
            ConstraintLayout constraintLayout = c0743a.b;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "animationContainer");
            this.currentLoadingAssetView = t9.a.b(loadingPictograph, constraintLayout, false, 2, null);
            c0743a.f.setVisibility(8);
        }
        StepStyles.DocumentStepStyle documentStepStyleG = rendering.getStyles();
        if (documentStepStyleG != null) {
            b(documentStepStyleG, viewEnvironment, rendering.getPendingPageTextVerticalPosition());
        }
    }
}
