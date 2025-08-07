package l9;

import aa.n;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import c9.C0483a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.C0493e;
import com.squareup.workflow1.ui.InterfaceC0490b;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.squareup.workflow1.ui.x;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import j9.C0598a;
import j9.C0601d;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012$\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R2\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b\u0016\u0010)R \u00100\u001a\b\u0012\u0004\u0012\u00020\u00000+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Ll9/h;", "Lcom/squareup/workflow1/ui/b;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "componentNamesToActions", "Lkotlin/Function0;", "onCancelled", "cancelButtonName", "", "hideWhenTappedOutside", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Z)V", "d", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "e", "Ljava/util/List;", "i", "Lkotlin/jvm/functions/Function0;", "v", "Ljava/lang/String;", "w", "Z", "Ll9/f;", "y", "Ll9/f;", "h", "()Ll9/f;", "j", "(Ll9/f;)V", "uiScreenGenerationResult", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "z", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "g", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "bottomSheetBehavior", "Lcom/squareup/workflow1/ui/A;", "A", "Lcom/squareup/workflow1/ui/A;", "a", "()Lcom/squareup/workflow1/ui/A;", "viewFactory", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class h implements InterfaceC0490b<h> {

    @NotNull
    private final A<h> viewFactory;

    @NotNull
    private final UiComponentScreen uiScreen;

    @NotNull
    private final List<Pair<String, Function1<UiComponent, Unit>>> componentNamesToActions;

    @NotNull
    private final Function0<Unit> onCancelled;

    private final String cancelButtonName;

    private final boolean hideWhenTappedOutside;

    private l9.f uiScreenGenerationResult;

    private BottomSheetBehavior<?> bottomSheetBehavior;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lj1/a;", "BindingT", "", "RenderingT", "binding", "Lcom/squareup/workflow1/ui/j;", "a", "(Lj1/a;)Lcom/squareup/workflow1/ui/j;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class a extends l implements Function1<C0483a, com.squareup.workflow1.ui.j<h>> {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lj1/a;", "BindingT", "", "RenderingT", "rendering", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "", "a", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        public static final class C0243a<RenderingT> implements com.squareup.workflow1.ui.j {
            final j1.a b;
            final h c;

            public C0243a(j1.a aVar, h hVar) {
                this.b = aVar;
                this.c = hVar;
            }

            @Override
            public final void a(@NotNull RenderingT renderingt, @NotNull ViewEnvironment viewEnvironment) {
                View viewD;
                Intrinsics.checkNotNullParameter(renderingt, "rendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                h hVar = (h) renderingt;
                C0483a c0483a = (C0483a) this.b;
                CoordinatorLayout.f layoutParams = c0483a.b.getLayoutParams();
                Intrinsics.e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                BottomSheetBehavior<?> bottomSheetBehaviorF = layoutParams.f();
                Intrinsics.e(bottomSheetBehaviorF, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<*>");
                BottomSheetBehavior<?> bottomSheetBehavior = bottomSheetBehaviorF;
                if (!C0601d.d()) {
                    CoordinatorLayout coordinatorLayoutA = c0483a.a();
                    Intrinsics.checkNotNullExpressionValue(coordinatorLayoutA, "getRoot(...)");
                    C0601d.c(coordinatorLayoutA, false, false, false, false, 14, null);
                }
                c cVar = hVar.new c();
                ConstraintLayout constraintLayout = c0483a.b;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "bottomSheet");
                C0598a.a(bottomSheetBehavior, cVar, constraintLayout, c0483a.d, c0483a.e);
                this.c.i(bottomSheetBehavior);
                c0483a.a().addOnAttachStateChangeListener(new d(bottomSheetBehavior));
                Context context = c0483a.a().getContext();
                j jVar = j.a;
                Intrinsics.d(context);
                l9.f fVarG = j.g(jVar, context, this.c.uiScreen, false, true, false, 16, null);
                this.c.j(fVarG);
                c0483a.c.addView(fVarG.getContentView());
                Map<String, ComponentView> mapA = fVarG.getViewBindings().a();
                for (Pair pair : this.c.componentNamesToActions) {
                    String str = (String) pair.c();
                    Function1 function1 = (Function1) pair.d();
                    ComponentView componentView = mapA.get(str);
                    if (componentView != null) {
                        componentView.d().setOnClickListener(new e(function1, componentView));
                    }
                }
                ComponentView componentView2 = mapA.get(this.c.cancelButtonName);
                if (componentView2 != null && (viewD = componentView2.d()) != null) {
                    viewD.setOnClickListener(new f(bottomSheetBehavior));
                }
                ConstraintLayout constraintLayout2 = c0483a.b;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "bottomSheet");
                C0493e.c(constraintLayout2, new g(bottomSheetBehavior));
                if (hVar.hideWhenTappedOutside) {
                    c0483a.e.setOnClickListener(new ViewOnClickListenerC0244h(bottomSheetBehavior));
                } else {
                    c0483a.e.setOnClickListener(null);
                }
                NestedScrollView nestedScrollView = c0483a.d;
                Intrinsics.checkNotNullExpressionValue(nestedScrollView, "contentScrollView");
                StepStyles.UiStepStyle styles = this.c.uiScreen.getStyles();
                FrameLayout frameLayout = c0483a.c;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "contentContainer");
                s9.b.b(nestedScrollView, styles, frameLayout, null, 4, null);
            }
        }

        public a() {
            super(1);
        }

        @NotNull
        public final com.squareup.workflow1.ui.j<h> invoke(@NotNull C0483a c0483a) {
            Intrinsics.checkNotNullParameter(c0483a, "binding");
            return new C0243a(c0483a, h.this);
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class b extends kotlin.jvm.internal.j implements n<LayoutInflater, ViewGroup, Boolean, C0483a> {
        public static final b d = new b();

        b() {
            super(3, C0483a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepBottomSheetBinding;", 0);
        }

        @NotNull
        public final C0483a f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "p0");
            return C0483a.d(layoutInflater, viewGroup, z);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends l implements Function0<Unit> {
        c() {
            super(0);
        }

        public Object invoke() {
            m612invoke();
            return Unit.a;
        }

        public final void m612invoke() {
            h.this.onCancelled.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"l9/h$d", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class d implements View.OnAttachStateChangeListener {
        final BottomSheetBehavior<?> d;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class a implements Runnable {
            final BottomSheetBehavior<?> d;

            a(BottomSheetBehavior<?> bottomSheetBehavior) {
                this.d = bottomSheetBehavior;
            }

            @Override
            public final void run() {
                this.d.R0(3);
            }
        }

        d(BottomSheetBehavior<?> bottomSheetBehavior) {
            this.d = bottomSheetBehavior;
        }

        @Override
        public void onViewAttachedToWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.postDelayed(new a(this.d), 100L);
        }

        @Override
        public void onViewDetachedFromWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class e implements View.OnClickListener {
        final Function1<UiComponent, Unit> d;
        final ComponentView e;

        e(Function1<? super UiComponent, Unit> function1, ComponentView componentView) {
            this.d = function1;
            this.e = componentView;
        }

        @Override
        public final void onClick(View view) {
            this.d.invoke(this.e.c());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class f implements View.OnClickListener {
        final BottomSheetBehavior<?> d;

        f(BottomSheetBehavior<?> bottomSheetBehavior) {
            this.d = bottomSheetBehavior;
        }

        @Override
        public final void onClick(View view) {
            this.d.R0(5);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class g extends l implements Function0<Unit> {
        final BottomSheetBehavior<?> d;

        g(BottomSheetBehavior<?> bottomSheetBehavior) {
            super(0);
            this.d = bottomSheetBehavior;
        }

        public Object invoke() {
            m613invoke();
            return Unit.a;
        }

        public final void m613invoke() {
            this.d.R0(5);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class ViewOnClickListenerC0244h implements View.OnClickListener {
        final BottomSheetBehavior<?> d;

        ViewOnClickListenerC0244h(BottomSheetBehavior<?> bottomSheetBehavior) {
            this.d = bottomSheetBehavior;
        }

        @Override
        public final void onClick(View view) {
            this.d.R0(5);
        }
    }

    public h(@NotNull UiComponentScreen uiComponentScreen, @NotNull List<? extends Pair<String, ? extends Function1<? super UiComponent, Unit>>> list, @NotNull Function0<Unit> function0, String str, boolean z) {
        Intrinsics.checkNotNullParameter(uiComponentScreen, "uiScreen");
        Intrinsics.checkNotNullParameter(list, "componentNamesToActions");
        Intrinsics.checkNotNullParameter(function0, "onCancelled");
        this.uiScreen = uiComponentScreen;
        this.componentNamesToActions = list;
        this.onCancelled = function0;
        this.cancelButtonName = str;
        this.hideWhenTappedOutside = z;
        j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
        this.viewFactory = new x(z.b(h.class), b.d, new a());
    }

    @Override
    @NotNull
    public A<h> a() {
        return this.viewFactory;
    }

    public final BottomSheetBehavior<?> g() {
        return this.bottomSheetBehavior;
    }

    public final l9.f getUiScreenGenerationResult() {
        return this.uiScreenGenerationResult;
    }

    public final void i(BottomSheetBehavior<?> bottomSheetBehavior) {
        this.bottomSheetBehavior = bottomSheetBehavior;
    }

    public final void j(l9.f fVar) {
        this.uiScreenGenerationResult = fVar;
    }

    public h(UiComponentScreen uiComponentScreen, List list, Function0 function0, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiComponentScreen, list, function0, str, (i & 16) != 0 ? true : z);
    }
}
