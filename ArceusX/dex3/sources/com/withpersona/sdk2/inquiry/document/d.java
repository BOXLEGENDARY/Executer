package com.withpersona.sdk2.inquiry.document;

import P9.m;
import aa.n;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.squareup.workflow1.ui.x;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import ha.C0446E;
import ha.C0588c;
import i9.C0596c;
import j9.C0601d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;
import s9.v;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/d;", "Lcom/squareup/workflow1/ui/j;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d$b;", "Lr8/c;", "binding", "<init>", "(Lr8/c;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/squareup/workflow1/ui/y;)V", "rendering", "d", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d$b;Lcom/squareup/workflow1/ui/y;)V", "b", "Lr8/c;", "a", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class d implements j<DocumentWorkflow.AbstractC0501d.ReviewCaptures> {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final r8.c binding;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/d$a;", "Lcom/squareup/workflow1/ui/A;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d$b;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d$b;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "type", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion implements A<DocumentWorkflow.AbstractC0501d.ReviewCaptures> {
        private final A<DocumentWorkflow.AbstractC0501d.ReviewCaptures> a;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class C0087a extends kotlin.jvm.internal.j implements n<LayoutInflater, ViewGroup, Boolean, r8.c> {
            public static final C0087a d = new C0087a();

            C0087a() {
                super(3, r8.c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;", 0);
            }

            @NotNull
            public final r8.c f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(layoutInflater, "p0");
                return r8.c.d(layoutInflater, viewGroup, z);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
            }
        }

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class b extends kotlin.jvm.internal.j implements Function1<r8.c, d> {
            public static final b d = new b();

            b() {
                super(1, d.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;)V", 0);
            }

            @NotNull
            public final d invoke(@NotNull r8.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "p0");
                return new d(cVar);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public View a(@NotNull DocumentWorkflow.AbstractC0501d.ReviewCaptures initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public fa.c<? super DocumentWorkflow.AbstractC0501d.ReviewCaptures> getType() {
            return this.a.getType();
        }

        private Companion() {
            j.Companion companion = j.INSTANCE;
            this.a = new x(z.b(DocumentWorkflow.AbstractC0501d.ReviewCaptures.class), C0087a.d, b.d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/document/DocumentFile;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends l implements Function1<DocumentFile, Unit> {
        final DocumentWorkflow.AbstractC0501d.ReviewCaptures d;

        b(DocumentWorkflow.AbstractC0501d.ReviewCaptures bVar) {
            super(1);
            this.d = bVar;
        }

        public final void a(@NotNull DocumentFile documentFile) {
            Intrinsics.checkNotNullParameter(documentFile, "it");
            if (documentFile instanceof DocumentFile.Remote) {
                this.d.k().invoke(documentFile);
            }
        }

        public Object invoke(Object obj) {
            a((DocumentFile) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends l implements Function0<Unit> {
        final DocumentWorkflow.AbstractC0501d.ReviewCaptures d;

        c(DocumentWorkflow.AbstractC0501d.ReviewCaptures bVar) {
            super(0);
            this.d = bVar;
        }

        public Object invoke() {
            m42invoke();
            return Unit.a;
        }

        public final void m42invoke() {
            this.d.h().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0088d extends l implements Function0<Unit> {
        final DocumentWorkflow.AbstractC0501d.ReviewCaptures d;

        C0088d(DocumentWorkflow.AbstractC0501d.ReviewCaptures bVar) {
            super(0);
            this.d = bVar;
        }

        public Object invoke() {
            m43invoke();
            return Unit.a;
        }

        public final void m43invoke() {
            this.d.i().invoke();
        }
    }

    public d(@NotNull r8.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "binding");
        this.binding = cVar;
        CoordinatorLayout coordinatorLayoutC = cVar.a();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutC, "getRoot(...)");
        C0601d.c(coordinatorLayoutC, false, false, false, false, 15, null);
    }

    private final void c(StepStyles.DocumentStepStyle styles, ViewEnvironment viewEnvironment) throws m {
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        TextBasedComponentStyle disclaimerStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        Integer headerButtonColorValue;
        Integer backgroundColorValue;
        if (styles != null && (backgroundColorValue = styles.getBackgroundColorValue()) != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.a().setBackgroundColor(iIntValue);
            C0596c.a(viewEnvironment, iIntValue);
        }
        if (styles != null) {
            Context context = this.binding.a().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Drawable drawableBackgroundImageDrawable = styles.backgroundImageDrawable(context);
            if (drawableBackgroundImageDrawable != null) {
                this.binding.a().setBackground(drawableBackgroundImageDrawable);
            }
        }
        if (styles != null && (headerButtonColorValue = styles.getHeaderButtonColorValue()) != null) {
            this.binding.f.setControlsColor(headerButtonColorValue.intValue());
        }
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView textView = this.binding.j;
            Intrinsics.checkNotNullExpressionValue(textView, Title.type);
            v.e(textView, titleStyleValue);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView textView2 = this.binding.b;
            Intrinsics.checkNotNullExpressionValue(textView2, "body");
            v.e(textView2, textStyleValue);
        }
        if (styles != null && (disclaimerStyleValue = styles.getDisclaimerStyleValue()) != null) {
            TextView textView3 = this.binding.d;
            Intrinsics.checkNotNullExpressionValue(textView3, "disclaimer");
            v.e(textView3, disclaimerStyleValue);
        }
        if (styles == null || (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) == null) {
            return;
        }
        Button button = this.binding.i;
        Intrinsics.checkNotNullExpressionValue(button, "submitButton");
        s9.d.f(button, buttonPrimaryStyleValue, false, false, 6, null);
    }

    public static final void e(DocumentWorkflow.AbstractC0501d.ReviewCaptures bVar, View view) {
        Intrinsics.checkNotNullParameter(bVar, "$rendering");
        bVar.l().invoke();
    }

    @Override
    public void a(@NotNull final DocumentWorkflow.AbstractC0501d.ReviewCaptures rendering, @NotNull ViewEnvironment viewEnvironment) throws m {
        e eVar;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        r8.c cVar = this.binding;
        cVar.j.setText(rendering.getTitle());
        String strN = rendering.getPrompt();
        if (strN != null) {
            G9.e.b(this.binding.a().getContext()).c(cVar.b, strN);
        }
        cVar.d.setText(rendering.getDisclaimer());
        if (cVar.g.getAdapter() == null) {
            Context context = this.binding.a().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            eVar = new e(context, rendering.getImageLoader(), rendering.m(), rendering.getStyles());
            cVar.g.setAdapter(eVar);
        } else {
            RecyclerView.h adapter = cVar.g.getAdapter();
            Intrinsics.e(adapter, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter");
            eVar = (e) adapter;
        }
        eVar.K(!rendering.getDisabled() && rendering.getAddButtonEnabled(), rendering.d());
        eVar.J(new b(rendering));
        cVar.i.setText(rendering.getSubmitButtonText());
        cVar.i.setEnabled(rendering.getSubmitButtonEnabled());
        cVar.i.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.document.d.e(rendering, view);
            }
        });
        NavigationState navigationStateG = rendering.getNavigationState();
        c cVar2 = new c(rendering);
        C0088d c0088d = new C0088d(rendering);
        Pi2NavigationBar pi2NavigationBar = cVar.f;
        Intrinsics.checkNotNullExpressionValue(pi2NavigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutC = cVar.a();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutC, "getRoot(...)");
        C0588c.a(navigationStateG, cVar2, c0088d, pi2NavigationBar, coordinatorLayoutC);
        CoordinatorLayout coordinatorLayoutC2 = this.binding.a();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutC2, "getRoot(...)");
        C0446E.a(coordinatorLayoutC2, rendering.getError(), rendering.j(), this.binding.i, 4, 10000);
        c(rendering.getStyles(), viewEnvironment);
    }
}
