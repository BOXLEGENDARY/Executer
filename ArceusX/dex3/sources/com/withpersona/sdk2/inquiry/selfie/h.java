package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.squareup.workflow1.ui.x;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.p;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/h;", "Lcom/squareup/workflow1/ui/j;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$b;", "LW8/c;", "binding", "<init>", "(LW8/c;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/squareup/workflow1/ui/y;)V", "rendering", "d", "(Lcom/withpersona/sdk2/inquiry/selfie/p$d$b;Lcom/squareup/workflow1/ui/y;)V", "b", "LW8/c;", "Landroid/view/View;", "Landroid/view/View;", "currentInstructionAssetView", "a", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class h implements com.squareup.workflow1.ui.j<p.AbstractC0528d.b> {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final W8.c binding;

    private View currentInstructionAssetView;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/h$a;", "Lcom/squareup/workflow1/ui/A;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$b;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/selfie/p$d$b;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "type", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion implements A<p.AbstractC0528d.b> {
        private final A<p.AbstractC0528d.b> a;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class C0163a extends kotlin.jvm.internal.j implements aa.n<LayoutInflater, ViewGroup, Boolean, W8.c> {
            public static final C0163a d = new C0163a();

            C0163a() {
                super(3, W8.c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;", 0);
            }

            @NotNull
            public final W8.c f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(layoutInflater, "p0");
                return W8.c.d(layoutInflater, viewGroup, z);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
            }
        }

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class b extends kotlin.jvm.internal.j implements Function1<W8.c, h> {
            public static final b d = new b();

            b() {
                super(1, h.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;)V", 0);
            }

            @NotNull
            public final h invoke(@NotNull W8.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "p0");
                return new h(cVar);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public View a(@NotNull p.AbstractC0528d.b initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public fa.c<? super p.AbstractC0528d.b> getType() {
            return this.a.getType();
        }

        private Companion() {
            j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
            this.a = new x(z.b(p.AbstractC0528d.b.class), C0163a.d, b.d);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.l implements Function0<Unit> {
        final p.AbstractC0528d.b d;

        b(p.AbstractC0528d.b bVar) {
            super(0);
            this.d = bVar;
        }

        public Object invoke() {
            m533invoke();
            return Unit.a;
        }

        public final void m533invoke() {
            this.d.d().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.l implements Function0<Unit> {
        final p.AbstractC0528d.b d;

        c(p.AbstractC0528d.b bVar) {
            super(0);
            this.d = bVar;
        }

        public Object invoke() {
            m534invoke();
            return Unit.a;
        }

        public final void m534invoke() {
            this.d.e().invoke();
        }
    }

    public h(@NotNull W8.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "binding");
        this.binding = cVar;
        ScrollView scrollViewA = cVar.a();
        Intrinsics.checkNotNullExpressionValue(scrollViewA, "getRoot(...)");
        C0601d.c(scrollViewA, false, false, false, false, 15, null);
    }

    private final void c(StepStyles.SelfieStepStyle styles, ViewEnvironment viewEnvironment) throws P9.m {
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textView = this.binding.m;
            textView.setPadding(textView.getPaddingLeft(), 0, this.binding.m.getPaddingRight(), 0);
            TextView textView2 = this.binding.m;
            Intrinsics.checkNotNullExpressionValue(textView2, "textviewSelfieStartTitle");
            v.e(textView2, titleStyleValue);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textView3 = this.binding.l;
            textView3.setPadding(textView3.getPaddingLeft(), 0, this.binding.l.getPaddingRight(), 0);
            TextView textView4 = this.binding.l;
            Intrinsics.checkNotNullExpressionValue(textView4, "textviewSelfieStartBody");
            v.e(textView4, textStyleValue);
        }
        TextBasedComponentStyle disclaimerStyleValue = styles.getDisclaimerStyleValue();
        if (disclaimerStyleValue != null) {
            TextView textView5 = this.binding.k;
            textView5.setPadding(textView5.getPaddingLeft(), 0, this.binding.k.getPaddingRight(), 0);
            TextView textView6 = this.binding.k;
            Intrinsics.checkNotNullExpressionValue(textView6, "textviewSelfieDisclosure");
            v.e(textView6, disclaimerStyleValue);
        }
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
            this.binding.g.setControlsColor(headerButtonColorValue.intValue());
        }
        ButtonSubmitComponentStyle buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue();
        if (buttonPrimaryStyleValue != null) {
            Button button = this.binding.j;
            Intrinsics.checkNotNullExpressionValue(button, "startButton");
            s9.d.f(button, buttonPrimaryStyleValue, false, false, 6, null);
        }
    }

    public static final void e(p.AbstractC0528d.b bVar, View view) {
        Intrinsics.checkNotNullParameter(bVar, "$rendering");
        bVar.f().invoke();
    }

    private final void f(StepStyles.SelfieStepStyle styles) throws P9.m {
        if (styles != null) {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.binding.e;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "instructionAnimation");
            s9.e.c(themeableLottieAnimationView, styles.getSelfieStartIconStyle(), new String[]{"#022050"}, new String[]{"#AA85FF"}, new String[]{"#DBCCFF"});
            return;
        }
        ThemeableLottieAnimationView themeableLottieAnimationView2 = this.binding.e;
        int color = Color.parseColor("#022050");
        Context context = this.binding.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        themeableLottieAnimationView2.C(color, C0476u.d(context, c4.b.l, null, false, 6, null));
        ThemeableLottieAnimationView themeableLottieAnimationView3 = this.binding.e;
        int color2 = Color.parseColor("#AA85FF");
        Context context2 = this.binding.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int i = c4.b.m;
        themeableLottieAnimationView3.C(color2, C0476u.d(context2, i, null, false, 6, null));
        Context context3 = this.binding.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iD = C0476u.d(context3, i, null, false, 6, null);
        Context context4 = this.binding.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.binding.e.C(Color.parseColor("#DBCCFF"), androidx.core.graphics.a.c(iD, C0476u.d(context4, c4.b.n, null, false, 6, null), 0.66f));
    }

    @Override
    public void a(@NotNull final p.AbstractC0528d.b rendering, @NotNull ViewEnvironment viewEnvironment) throws P9.m {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        W8.c cVar = this.binding;
        Context context = cVar.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numF = C0476u.f(context, S8.a.t, null, false, 6, null);
        if (numF != null) {
            this.binding.d.setImageResource(numF.intValue());
            this.binding.d.setVisibility(0);
        }
        cVar.m.setText(rendering.getTitle());
        cVar.l.setText(rendering.getPrompt());
        G9.e.b(cVar.k.getContext()).c(cVar.k, rendering.getDisclosure());
        cVar.j.setText(rendering.getStart());
        cVar.j.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.selfie.h.e(rendering, view);
            }
        });
        NavigationState navigationStateC = rendering.getNavigationState();
        b bVar = new b(rendering);
        c cVar2 = new c(rendering);
        Pi2NavigationBar pi2NavigationBar = cVar.g;
        Intrinsics.checkNotNullExpressionValue(pi2NavigationBar, "navigationBar");
        ScrollView scrollViewA = cVar.a();
        Intrinsics.checkNotNullExpressionValue(scrollViewA, "getRoot(...)");
        C0588c.a(navigationStateC, bVar, cVar2, pi2NavigationBar, scrollViewA);
        Context context2 = this.binding.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer numF2 = C0476u.f(context2, S8.a.o, null, false, 6, null);
        if (rendering.getInstructionAsset() != null) {
            if (this.currentInstructionAssetView == null) {
                RemoteImage remoteImageB = rendering.getInstructionAsset();
                ConstraintLayout constraintLayout = cVar.h;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "nestedUiContainer");
                this.currentInstructionAssetView = t9.a.b(remoteImageB, constraintLayout, false, 2, null);
                cVar.e.setVisibility(8);
            }
        } else if (numF2 != null) {
            cVar.e.setAnimation(numF2.intValue());
            cVar.e.u();
        } else {
            f(rendering.getStyles());
        }
        if (rendering.getStyles() != null) {
            c(rendering.getStyles(), viewEnvironment);
        }
    }
}
