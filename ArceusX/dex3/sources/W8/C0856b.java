package w8;

import P9.m;
import aa.n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.InterfaceC0490b;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.squareup.workflow1.ui.x;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import ha.C0472q;
import ha.C0588c;
import i9.C0596c;
import j9.C0601d;
import j9.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;
import s9.v;
import w8.C0856b;
import z8.C0888a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\n*\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0015\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b\u0019\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00000(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lw8/b;", "Lcom/squareup/workflow1/ui/b;", "", "titleText", "continueButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onContinueClick", "onBackClick", "onCancelClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lz8/a;", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "b", "(Lz8/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/squareup/workflow1/ui/y;)V", "d", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "e", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "h", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "v", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "w", "Lkotlin/jvm/functions/Function0;", "g", "()Lkotlin/jvm/functions/Function0;", "y", "z", "f", "Lcom/squareup/workflow1/ui/A;", "A", "Lcom/squareup/workflow1/ui/A;", "a", "()Lcom/squareup/workflow1/ui/A;", "viewFactory", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0856b implements InterfaceC0490b<C0856b> {

    @NotNull
    private final A<C0856b> viewFactory;

    private final String titleText;

    private final String continueButtonText;

    private final StepStyles.GovernmentIdStepStyle styles;

    @NotNull
    private final NavigationState navigationState;

    @NotNull
    private final Function0<Unit> onContinueClick;

    @NotNull
    private final Function0<Unit> onBackClick;

    @NotNull
    private final Function0<Unit> onCancelClick;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class a extends kotlin.jvm.internal.j implements n<LayoutInflater, ViewGroup, Boolean, C0888a> {
        public static final a d = new a();

        a() {
            super(3, C0888a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2ErrorBinding;", 0);
        }

        @NotNull
        public final C0888a f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "p0");
            return C0888a.d(layoutInflater, viewGroup, z);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz8/a;", "binding", "Lcom/squareup/workflow1/ui/j;", "Lw8/b;", "c", "(Lz8/a;)Lcom/squareup/workflow1/ui/j;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0297b extends l implements Function1<C0888a, com.squareup.workflow1.ui.j<C0856b>> {

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class a extends l implements Function0<Unit> {
            final C0856b d;

            a(C0856b c0856b) {
                super(0);
                this.d = c0856b;
            }

            public Object invoke() {
                m703invoke();
                return Unit.a;
            }

            public final void m703invoke() {
                this.d.e().invoke();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class C0298b extends l implements Function0<Unit> {
            final C0856b d;

            C0298b(C0856b c0856b) {
                super(0);
                this.d = c0856b;
            }

            public Object invoke() {
                m704invoke();
                return Unit.a;
            }

            public final void m704invoke() {
                this.d.f().invoke();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class c extends l implements Function0<Unit> {
            final C0888a d;
            final LocalImageComponentStyle e;

            c(C0888a c0888a, LocalImageComponentStyle localImageComponentStyle) {
                super(0);
                this.d = c0888a;
                this.e = localImageComponentStyle;
            }

            public Object invoke() throws m {
                m705invoke();
                return Unit.a;
            }

            public final void m705invoke() throws m {
                ThemeableLottieAnimationView themeableLottieAnimationView = this.d.d;
                Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "illustration");
                s9.e.c(themeableLottieAnimationView, this.e, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0]);
            }
        }

        C0297b() {
            super(1);
        }

        public static final void e(C0888a c0888a, final C0856b c0856b, C0856b c0856b2, ViewEnvironment viewEnvironment) throws m {
            StepStyles.GovernmentIdStepImageLocalStyle imageLocalStyle;
            StepStyles.GovernmentIdStepImageLocalStyleContainer illustration;
            Intrinsics.checkNotNullParameter(c0888a, "$binding");
            Intrinsics.checkNotNullParameter(c0856b, "this$0");
            Intrinsics.checkNotNullParameter(c0856b2, "rendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            NavigationState navigationState = c0856b2.getNavigationState();
            a aVar = new a(c0856b2);
            C0298b c0298b = new C0298b(c0856b2);
            Pi2NavigationBar pi2NavigationBar = c0888a.e;
            Intrinsics.checkNotNullExpressionValue(pi2NavigationBar, "navigationBar");
            CoordinatorLayout coordinatorLayoutA = c0888a.a();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutA, "getRoot(...)");
            C0588c.a(navigationState, aVar, c0298b, pi2NavigationBar, coordinatorLayoutA);
            StepStyles.GovernmentIdStepStyle styles = c0856b2.getStyles();
            LocalImageComponentStyle base = (styles == null || (imageLocalStyle = styles.getImageLocalStyle()) == null || (illustration = imageLocalStyle.getIllustration()) == null) ? null : illustration.getBase();
            c0888a.d.setAnimation(C0472q.i);
            if (base != null) {
                CoordinatorLayout coordinatorLayoutA2 = c0888a.a();
                Intrinsics.checkNotNullExpressionValue(coordinatorLayoutA2, "getRoot(...)");
                o.b(coordinatorLayoutA2, new c(c0888a, base));
            }
            c0888a.f.setText(c0856b2.getTitleText());
            c0888a.c.setText(c0856b2.getContinueButtonText());
            c0888a.c.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    C0856b.C0297b.f(c0856b, view);
                }
            });
            c0856b.b(c0888a, c0856b2.getStyles(), viewEnvironment);
        }

        public static final void f(C0856b c0856b, View view) {
            Intrinsics.checkNotNullParameter(c0856b, "this$0");
            c0856b.g().invoke();
        }

        @NotNull
        public final com.squareup.workflow1.ui.j<C0856b> invoke(@NotNull final C0888a c0888a) {
            Intrinsics.checkNotNullParameter(c0888a, "binding");
            CoordinatorLayout coordinatorLayoutA = c0888a.a();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutA, "getRoot(...)");
            C0601d.c(coordinatorLayoutA, false, false, false, false, 15, null);
            final C0856b c0856b = C0856b.this;
            return new com.squareup.workflow1.ui.j() {
                @Override
                public final void a(Object obj, ViewEnvironment viewEnvironment) throws m {
                    C0856b.C0297b.e(c0888a, c0856b, (C0856b) obj, viewEnvironment);
                }
            };
        }
    }

    public C0856b(String str, String str2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @NotNull NavigationState navigationState, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03) {
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(function0, "onContinueClick");
        Intrinsics.checkNotNullParameter(function02, "onBackClick");
        Intrinsics.checkNotNullParameter(function03, "onCancelClick");
        this.titleText = str;
        this.continueButtonText = str2;
        this.styles = governmentIdStepStyle;
        this.navigationState = navigationState;
        this.onContinueClick = function0;
        this.onBackClick = function02;
        this.onCancelClick = function03;
        j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
        this.viewFactory = new x(z.b(C0856b.class), a.d, new C0297b());
    }

    @Override
    @NotNull
    public A<C0856b> a() {
        return this.viewFactory;
    }

    public final void b(@NotNull C0888a c0888a, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @NotNull ViewEnvironment viewEnvironment) throws m {
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonSubmitComponentStyle base2;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        Intrinsics.checkNotNullParameter(c0888a, "<this>");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        if (governmentIdStepStyle == null) {
            return;
        }
        Integer backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            c0888a.a().setBackgroundColor(iIntValue);
            C0596c.a(viewEnvironment, iIntValue);
        }
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle.getTitleStyle();
        if (titleStyle != null && (base3 = titleStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            TextView textView = c0888a.f;
            Intrinsics.checkNotNullExpressionValue(textView, Title.type);
            v.e(textView, base4);
        }
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle.getButtonPrimaryStyle();
        if (buttonPrimaryStyle == null || (base = buttonPrimaryStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return;
        }
        Button button = c0888a.c;
        Intrinsics.checkNotNullExpressionValue(button, "continueButton");
        s9.d.f(button, base2, false, false, 6, null);
    }

    public final String getContinueButtonText() {
        return this.continueButtonText;
    }

    @NotNull
    public final NavigationState getNavigationState() {
        return this.navigationState;
    }

    @NotNull
    public final Function0<Unit> e() {
        return this.onBackClick;
    }

    @NotNull
    public final Function0<Unit> f() {
        return this.onCancelClick;
    }

    @NotNull
    public final Function0<Unit> g() {
        return this.onContinueClick;
    }

    public final StepStyles.GovernmentIdStepStyle getStyles() {
        return this.styles;
    }

    public final String getTitleText() {
        return this.titleText;
    }
}
