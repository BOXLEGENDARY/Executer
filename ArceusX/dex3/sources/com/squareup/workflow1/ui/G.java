package com.squareup.workflow1.ui;

import android.view.View;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0002\n\u0010B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00028\u00008 X¡\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR0\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00028\u0000`\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/squareup/workflow1/ui/G;", "", "RenderingT", "<init>", "()V", "c", "()Ljava/lang/Object;", "getShowing$annotations", "showing", "Lcom/squareup/workflow1/ui/y;", "a", "()Lcom/squareup/workflow1/ui/y;", "environment", "Lkotlin/Function2;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "b", "()Lkotlin/jvm/functions/Function2;", "showRendering", "Lcom/squareup/workflow1/ui/G$a;", "Lcom/squareup/workflow1/ui/G$b;", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public abstract class G<RenderingT> {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B;\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00028\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"Lcom/squareup/workflow1/ui/G$b;", "", "RenderingT", "Lcom/squareup/workflow1/ui/G;", "showing", "Lcom/squareup/workflow1/ui/y;", "environment", "Lkotlin/Function2;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "showRendering", "<init>", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;Lkotlin/jvm/functions/Function2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "b", "Lcom/squareup/workflow1/ui/y;", "()Lcom/squareup/workflow1/ui/y;", "c", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class Started<RenderingT> extends G<RenderingT> {

        @NotNull
        private final RenderingT showing;

        @NotNull
        private final ViewEnvironment environment;

        @NotNull
        private final Function2<RenderingT, ViewEnvironment, Unit> showRendering;

        public Started(@NotNull RenderingT renderingt, @NotNull ViewEnvironment viewEnvironment, @NotNull Function2<? super RenderingT, ? super ViewEnvironment, Unit> function2) {
            super(null);
            Intrinsics.checkNotNullParameter(renderingt, "showing");
            Intrinsics.checkNotNullParameter(viewEnvironment, "environment");
            Intrinsics.checkNotNullParameter(function2, "showRendering");
            this.showing = renderingt;
            this.environment = viewEnvironment;
            this.showRendering = function2;
        }

        @Override
        @NotNull
        public ViewEnvironment getEnvironment() {
            return this.environment;
        }

        @Override
        @NotNull
        public Function2<RenderingT, ViewEnvironment, Unit> b() {
            return this.showRendering;
        }

        @Override
        @NotNull
        public RenderingT c() {
            return this.showing;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Started)) {
                return false;
            }
            Started started = (Started) other;
            return Intrinsics.b(c(), started.c()) && Intrinsics.b(getEnvironment(), started.getEnvironment()) && Intrinsics.b(b(), started.b());
        }

        public int hashCode() {
            return (((c().hashCode() * 31) + getEnvironment().hashCode()) * 31) + b().hashCode();
        }

        @NotNull
        public String toString() {
            return "Started(showing=" + c() + ", environment=" + getEnvironment() + ", showRendering=" + b() + ')';
        }
    }

    public G(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract ViewEnvironment getEnvironment();

    @NotNull
    public abstract Function2<RenderingT, ViewEnvironment, Unit> b();

    @NotNull
    public abstract RenderingT c();

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003BQ\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJf\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052$\b\u0002\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00028\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/squareup/workflow1/ui/G$a;", "", "RenderingT", "Lcom/squareup/workflow1/ui/G;", "showing", "Lcom/squareup/workflow1/ui/y;", "environment", "Lkotlin/Function2;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "showRendering", "Lkotlin/Function1;", "Landroid/view/View;", "starter", "<init>", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "d", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lcom/squareup/workflow1/ui/G$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "b", "Lcom/squareup/workflow1/ui/y;", "()Lcom/squareup/workflow1/ui/y;", "c", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "g", "()Lkotlin/jvm/functions/Function1;", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class New<RenderingT> extends G<RenderingT> {

        @NotNull
        private final RenderingT showing;

        @NotNull
        private final ViewEnvironment environment;

        @NotNull
        private final Function2<RenderingT, ViewEnvironment, Unit> showRendering;

        @NotNull
        private final Function1<View, Unit> starter;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u0000\"\n\b\u0001\u0010\u0001 \u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "RenderingT", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
        static final class C0063a extends kotlin.jvm.internal.l implements Function1<View, Unit> {
            public static final C0063a d = new C0063a();

            C0063a() {
                super(1);
            }

            public final void a(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                G<?> gD = H.d(view);
                Object objC = gD == null ? null : gD.c();
                Object obj = objC != null ? objC : null;
                Intrinsics.d(obj);
                ViewEnvironment viewEnvironmentC = E.c(view);
                Intrinsics.d(viewEnvironmentC);
                E.g(view, obj, viewEnvironmentC);
            }

            public Object invoke(Object obj) {
                a((View) obj);
                return Unit.a;
            }
        }

        public New(Object obj, ViewEnvironment viewEnvironment, Function2 function2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, viewEnvironment, function2, (i & 8) != 0 ? C0063a.d : function1);
        }

        public static New e(New r0, Object obj, ViewEnvironment viewEnvironment, Function2 function2, Function1 function1, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = r0.c();
            }
            if ((i & 2) != 0) {
                viewEnvironment = r0.getEnvironment();
            }
            if ((i & 4) != 0) {
                function2 = r0.b();
            }
            if ((i & 8) != 0) {
                function1 = r0.starter;
            }
            return r0.d(obj, viewEnvironment, function2, function1);
        }

        @Override
        @NotNull
        public ViewEnvironment getEnvironment() {
            return this.environment;
        }

        @Override
        @NotNull
        public Function2<RenderingT, ViewEnvironment, Unit> b() {
            return this.showRendering;
        }

        @NotNull
        public final New<RenderingT> d(@NotNull RenderingT showing, @NotNull ViewEnvironment environment, @NotNull Function2<? super RenderingT, ? super ViewEnvironment, Unit> showRendering, @NotNull Function1<? super View, Unit> starter) {
            Intrinsics.checkNotNullParameter(showing, "showing");
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(showRendering, "showRendering");
            Intrinsics.checkNotNullParameter(starter, "starter");
            return new New<>(showing, environment, showRendering, starter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof New)) {
                return false;
            }
            New r5 = (New) other;
            return Intrinsics.b(c(), r5.c()) && Intrinsics.b(getEnvironment(), r5.getEnvironment()) && Intrinsics.b(b(), r5.b()) && Intrinsics.b(this.starter, r5.starter);
        }

        @Override
        @NotNull
        public RenderingT c() {
            return this.showing;
        }

        @NotNull
        public final Function1<View, Unit> g() {
            return this.starter;
        }

        public int hashCode() {
            return (((((c().hashCode() * 31) + getEnvironment().hashCode()) * 31) + b().hashCode()) * 31) + this.starter.hashCode();
        }

        @NotNull
        public String toString() {
            return "New(showing=" + c() + ", environment=" + getEnvironment() + ", showRendering=" + b() + ", starter=" + this.starter + ')';
        }

        public New(@NotNull RenderingT renderingt, @NotNull ViewEnvironment viewEnvironment, @NotNull Function2<? super RenderingT, ? super ViewEnvironment, Unit> function2, @NotNull Function1<? super View, Unit> function1) {
            super(null);
            Intrinsics.checkNotNullParameter(renderingt, "showing");
            Intrinsics.checkNotNullParameter(viewEnvironment, "environment");
            Intrinsics.checkNotNullParameter(function2, "showRendering");
            Intrinsics.checkNotNullParameter(function1, "starter");
            this.showing = renderingt;
            this.environment = viewEnvironment;
            this.showRendering = function2;
            this.starter = function1;
        }
    }

    private G() {
    }
}
