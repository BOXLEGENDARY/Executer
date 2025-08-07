package w8;

import P9.m;
import aa.n;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.squareup.workflow1.ui.x;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import ha.C0588c;
import ha.C0750f;
import i9.C0596c;
import j9.C0601d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;
import n9.S;
import org.jetbrains.annotations.NotNull;
import s9.v;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b*\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lw8/j;", "Lcom/squareup/workflow1/ui/j;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;", "Lz8/i;", "binding", "<init>", "(Lz8/i;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "", "g", "(Lz8/i;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/squareup/workflow1/ui/y;)V", "Ln9/S;", "inputSelectComponent", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "onOptionSelected", "h", "(Ln9/S;Lkotlin/jvm/functions/Function1;)V", "rendering", "i", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;Lcom/squareup/workflow1/ui/y;)V", "b", "Lz8/i;", "Lr9/f;", "c", "Lr9/f;", "inputSelectBottomSheetController", "d", "a", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class j implements com.squareup.workflow1.ui.j<Screen.a> {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final z8.i binding;

    @NotNull
    private final C0750f inputSelectBottomSheetController;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lw8/j$a;", "Lcom/squareup/workflow1/ui/A;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "type", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion implements A<Screen.a> {
        private final A<Screen.a> a;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class C0299a extends kotlin.jvm.internal.j implements n<LayoutInflater, ViewGroup, Boolean, z8.i> {
            public static final C0299a d = new C0299a();

            C0299a() {
                super(3, z8.i.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSelectCountryAndIdClassBinding;", 0);
            }

            @NotNull
            public final z8.i f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(layoutInflater, "p0");
                return z8.i.d(layoutInflater, viewGroup, z);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
            }
        }

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class b extends kotlin.jvm.internal.j implements Function1<z8.i, j> {
            public static final b d = new b();

            b() {
                super(1, j.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSelectCountryAndIdClassBinding;)V", 0);
            }

            @NotNull
            public final j invoke(@NotNull z8.i iVar) {
                Intrinsics.checkNotNullParameter(iVar, "p0");
                return new j(iVar);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public View a(@NotNull Screen.a initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public fa.c<? super Screen.a> getType() {
            return this.a.getType();
        }

        private Companion() {
            j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
            this.a = new x(z.b(Screen.a.class), C0299a.d, b.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "selectedItems", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends l implements Function1<List<? extends Option>, Unit> {
        final Function1<Option, Unit> d;

        b(Function1<? super Option, Unit> function1) {
            super(1);
            this.d = function1;
        }

        public final void a(@NotNull List<Option> list) {
            Intrinsics.checkNotNullParameter(list, "selectedItems");
            Option option = (Option) CollectionsKt.firstOrNull(list);
            if (option == null) {
                return;
            }
            this.d.invoke(option);
        }

        public Object invoke(Object obj) {
            a((List) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends l implements Function0<Unit> {
        final Screen.a d;

        c(Screen.a aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m706invoke();
            return Unit.a;
        }

        public final void m706invoke() {
            this.d.g().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends l implements Function0<Unit> {
        final Screen.a d;

        d(Screen.a aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m707invoke();
            return Unit.a;
        }

        public final void m707invoke() {
            this.d.h().invoke();
        }
    }

    public j(@NotNull z8.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "binding");
        this.binding = iVar;
        CoordinatorLayout coordinatorLayoutA = iVar.a();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutA, "getRoot(...)");
        this.inputSelectBottomSheetController = new C0750f(coordinatorLayoutA);
        LinearLayout linearLayout = iVar.b;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "contentView");
        C0601d.c(linearLayout, false, false, false, false, 15, null);
    }

    private final void g(z8.i iVar, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, ViewEnvironment viewEnvironment) throws m {
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonSubmitComponentStyle base2;
        StepStyles.InputSelectStyleContainer base3;
        InputSelectComponentStyle base4;
        StepStyles.StepTextBasedComponentStyleContainer base5;
        TextBasedComponentStyle base6;
        StepStyles.StepTextBasedComponentStyleContainer base7;
        TextBasedComponentStyle base8;
        if (governmentIdStepStyle == null) {
            return;
        }
        Integer backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            iVar.a().setBackgroundColor(iIntValue);
            C0596c.a(viewEnvironment, iIntValue);
        }
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle.getTitleStyle();
        if (titleStyle != null && (base7 = titleStyle.getBase()) != null && (base8 = base7.getBase()) != null) {
            TextView textView = iVar.i;
            Intrinsics.checkNotNullExpressionValue(textView, Title.type);
            v.e(textView, base8);
        }
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = governmentIdStepStyle.getTextStyle();
        if (textStyle != null && (base5 = textStyle.getBase()) != null && (base6 = base5.getBase()) != null) {
            TextView textView2 = iVar.e;
            Intrinsics.checkNotNullExpressionValue(textView2, "countrySelectorText");
            v.e(textView2, base6);
            TextView textView3 = iVar.g;
            Intrinsics.checkNotNullExpressionValue(textView3, "idClassSelectorText");
            v.e(textView3, base6);
        }
        StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle = governmentIdStepStyle.getInputSelectStyle();
        if (inputSelectStyle != null && (base3 = inputSelectStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            TextInputLayout textInputLayout = iVar.d;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "countrySelector");
            s9.f.b(textInputLayout, base4);
            TextInputLayout textInputLayout2 = iVar.f;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "idClassSelector");
            s9.f.b(textInputLayout2, base4);
        }
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle.getButtonPrimaryStyle();
        if (buttonPrimaryStyle == null || (base = buttonPrimaryStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return;
        }
        Button button = iVar.c;
        Intrinsics.checkNotNullExpressionValue(button, "continueButton");
        s9.d.f(button, base2, false, false, 6, null);
    }

    private final void h(S inputSelectComponent, Function1<? super Option, Unit> onOptionSelected) {
        this.inputSelectBottomSheetController.o(inputSelectComponent, new b(onOptionSelected));
    }

    public static final void j(j jVar, Screen.a aVar, View view) {
        Intrinsics.checkNotNullParameter(jVar, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "$rendering");
        jVar.h(aVar.getCountrySelectComponent(), aVar.j());
    }

    public static final void k(j jVar, Screen.a aVar, View view) {
        Intrinsics.checkNotNullParameter(jVar, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "$rendering");
        jVar.h(aVar.getCountrySelectComponent(), aVar.j());
    }

    public static final void l(j jVar, Screen.a aVar, View view) {
        Intrinsics.checkNotNullParameter(jVar, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "$rendering");
        jVar.h(aVar.getIdClassSelectComponent(), aVar.k());
    }

    public static final void m(j jVar, Screen.a aVar, View view) {
        Intrinsics.checkNotNullParameter(jVar, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "$rendering");
        jVar.h(aVar.getIdClassSelectComponent(), aVar.k());
    }

    public static final void n(Screen.a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$rendering");
        aVar.i().invoke();
    }

    @Override
    public void a(@NotNull final Screen.a rendering, @NotNull ViewEnvironment viewEnvironment) throws m {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        z8.i iVar = this.binding;
        NavigationState navigationState = rendering.getNavigationState();
        c cVar = new c(rendering);
        d dVar = new d(rendering);
        Pi2NavigationBar pi2NavigationBar = iVar.h;
        Intrinsics.checkNotNullExpressionValue(pi2NavigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutA = iVar.a();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutA, "getRoot(...)");
        C0588c.a(navigationState, cVar, dVar, pi2NavigationBar, coordinatorLayoutA);
        iVar.i.setText(rendering.getTitle());
        Option option = (Option) CollectionsKt.firstOrNull(rendering.getCountrySelectComponent().b());
        String text = option != null ? option.getText() : null;
        iVar.d.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                j.j(this.d, rendering, view);
            }
        });
        EditText editText = iVar.d.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    j.k(this.d, rendering, view);
                }
            });
        }
        EditText editText2 = iVar.d.getEditText();
        if (editText2 != null) {
            editText2.setText(text);
        }
        if (text != null) {
            iVar.f.setEnabled(true);
            EditText editText3 = iVar.f.getEditText();
            if (editText3 != null) {
                editText3.setEnabled(true);
            }
            iVar.f.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    j.l(this.d, rendering, view);
                }
            });
            EditText editText4 = iVar.f.getEditText();
            if (editText4 != null) {
                editText4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        j.m(this.d, rendering, view);
                    }
                });
            }
            EditText editText5 = iVar.f.getEditText();
            if (editText5 != null) {
                Option option2 = (Option) CollectionsKt.firstOrNull(rendering.getIdClassSelectComponent().b());
                editText5.setText(option2 != null ? option2.getText() : null);
            }
        } else {
            iVar.f.setEnabled(false);
            EditText editText6 = iVar.f.getEditText();
            if (editText6 != null) {
                editText6.setEnabled(false);
            }
        }
        iVar.e.setText(rendering.getCountryInputTitle());
        iVar.g.setText(rendering.getIdClassInputTitle());
        iVar.c.setEnabled(rendering.getIsContinueEnabled());
        iVar.c.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                j.n(rendering, view);
            }
        });
        iVar.c.setText(rendering.getContinueButtonText());
        g(iVar, rendering.getStyles(), viewEnvironment);
    }
}
