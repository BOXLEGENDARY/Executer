package w9;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import ha.C0458f;
import j9.C0598a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R,\u0010'\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b(\u0010)*\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lw9/j;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;", "styles", "", "i", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lcom/squareup/workflow1/ui/y;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "component", "Lkotlin/Function2;", "", "Landroid/graphics/Bitmap;", "onComplete", "p", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lcom/squareup/workflow1/ui/y;Lkotlin/jvm/functions/Function2;)V", "j", "()Z", "a", "Landroid/view/ViewGroup;", "LP9/h;", "Lx9/b;", "b", "LP9/h;", "lazyBinding", "c", "Z", "setup", "d", "Lkotlin/jvm/functions/Function2;", "currentOnCompleteListener", "k", "()Lx9/b;", "getBinding$delegate", "(Lw9/j;)Ljava/lang/Object;", "binding", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class j {

    @NotNull
    private final ViewGroup contentView;

    @NotNull
    private final P9.h<x9.b> lazyBinding;

    private boolean setup;

    private Function2<? super Boolean, ? super Bitmap, Unit> currentOnCompleteListener;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx9/b;", "a", "()Lx9/b;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function0<x9.b> {
        a() {
            super(0);
        }

        @NotNull
        public final x9.b invoke() {
            return x9.b.d(LayoutInflater.from(j.this.contentView.getContext()), j.this.contentView, true);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.l implements Function0<Unit> {
        b() {
            super(0);
        }

        public Object invoke() {
            m711invoke();
            return Unit.a;
        }

        public final void m711invoke() {
            Function2 function2 = j.this.currentOnCompleteListener;
            if (function2 != null) {
                function2.invoke(Boolean.TRUE, (Object) null);
            }
            j.this.currentOnCompleteListener = null;
            j.this.k().h.j();
        }
    }

    public j(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "contentView");
        this.contentView = viewGroup;
        this.lazyBinding = P9.i.b(new a());
    }

    private final void i(ESignature.ESignatureComponentStyle styles) throws P9.m {
        TextBasedComponentStyle dialogTitleStyle = styles.getDialogTitleStyle();
        if (dialogTitleStyle != null) {
            TextView textView = k().j;
            Intrinsics.checkNotNullExpressionValue(textView, "signatureLabel");
            s9.v.e(textView, dialogTitleStyle);
        }
        TextBasedComponentStyle dialogTextStyle = styles.getDialogTextStyle();
        if (dialogTextStyle != null) {
            TextView textView2 = k().i;
            Intrinsics.checkNotNullExpressionValue(textView2, "signatureDescription");
            s9.v.e(textView2, dialogTextStyle);
        }
        Integer baseBackgroundColorValue = styles.getInputTextStyle().getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            k().h.setCardBackgroundColor(baseBackgroundColorValue.intValue());
        }
        Double borderRadiusValue = styles.getInputTextStyle().getBorderRadiusValue();
        if (borderRadiusValue != null) {
            k().h.setRadius((float) Math.ceil(C0458f.a(borderRadiusValue.doubleValue())));
        }
        Double borderWidthValue = styles.getInputTextStyle().getBorderWidthValue();
        if (borderWidthValue != null) {
            k().h.setStrokeWidth((int) Math.ceil(C0458f.a(borderWidthValue.doubleValue())));
        }
        Integer baseBorderColorValue = styles.getInputTextStyle().getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            k().h.setStrokeColor(baseBorderColorValue.intValue());
        }
        ButtonSubmitComponentStyle submitButtonStyle = styles.getSubmitButtonStyle();
        if (submitButtonStyle != null) {
            Button button = k().f;
            Intrinsics.checkNotNullExpressionValue(button, "saveButton");
            s9.d.f(button, submitButtonStyle, false, false, 6, null);
        }
        ButtonCancelComponentStyle clearSignatureButtonStyle = styles.getClearSignatureButtonStyle();
        if (clearSignatureButtonStyle != null) {
            Button button2 = k().c;
            Intrinsics.checkNotNullExpressionValue(button2, "clearButton");
            s9.d.f(button2, clearSignatureButtonStyle, false, false, 6, null);
        }
    }

    public final x9.b k() {
        return (x9.b) this.lazyBinding.getValue();
    }

    private final void l(StepStyles.UiStepStyle stepStyles, ViewEnvironment viewEnvironment) {
        if (this.setup) {
            return;
        }
        this.setup = true;
        final BottomSheetBehavior bottomSheetBehaviorM0 = BottomSheetBehavior.m0(k().b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM0, "from(...)");
        b bVar = new b();
        FrameLayout frameLayout = k().b;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "bottomSheet");
        C0598a.a(bottomSheetBehaviorM0, bVar, frameLayout, k().k, k().g);
        bottomSheetBehaviorM0.E0(false);
        k().d.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                j.m(bottomSheetBehaviorM0, view);
            }
        });
        k().c.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                j.n(this.d, view);
            }
        });
        k().f.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                j.o(this.d, bottomSheetBehaviorM0, view);
            }
        });
        ConstraintLayout constraintLayout = k().k;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "signatureSheet");
        s9.b.b(constraintLayout, stepStyles, null, new Rect(0, (int) C0458f.a(12.0d), 0, 0), 2, null);
    }

    public static final void m(BottomSheetBehavior bottomSheetBehavior, View view) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$behavior");
        bottomSheetBehavior.R0(5);
    }

    public static final void n(j jVar, View view) {
        Intrinsics.checkNotNullParameter(jVar, "this$0");
        jVar.k().h.j();
    }

    public static final void o(j jVar, BottomSheetBehavior bottomSheetBehavior, View view) {
        Intrinsics.checkNotNullParameter(jVar, "this$0");
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$behavior");
        Function2<? super Boolean, ? super Bitmap, Unit> function2 = jVar.currentOnCompleteListener;
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, jVar.k().h.m());
        }
        jVar.currentOnCompleteListener = null;
        bottomSheetBehavior.R0(5);
    }

    public static final void q(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "this$0");
        BottomSheetBehavior bottomSheetBehaviorM0 = BottomSheetBehavior.m0(jVar.k().b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM0, "from(...)");
        bottomSheetBehaviorM0.R0(3);
    }

    public final boolean j() {
        if (!this.lazyBinding.a()) {
            return false;
        }
        BottomSheetBehavior bottomSheetBehaviorM0 = BottomSheetBehavior.m0(k().b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM0, "from(...)");
        if (bottomSheetBehaviorM0.q0() == 5) {
            return false;
        }
        bottomSheetBehaviorM0.R0(5);
        return true;
    }

    public final void p(@NotNull ESignatureComponent component, StepStyles.UiStepStyle stepStyles, @NotNull ViewEnvironment viewEnvironment, @NotNull Function2<? super Boolean, ? super Bitmap, Unit> onComplete) {
        String dialogText;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        l(stepStyles, viewEnvironment);
        this.currentOnCompleteListener = onComplete;
        k().h.j();
        TextView textView = k().j;
        ESignature.Attributes attributes = component.e().getAttributes();
        textView.setText(attributes != null ? attributes.getDialogTitle() : null);
        TextView textView2 = k().i;
        ESignature.Attributes attributes2 = component.e().getAttributes();
        if (attributes2 == null || (dialogText = attributes2.getDialogText()) == null) {
            dialogText = "";
        }
        textView2.setText(dialogText);
        ESignature.ESignatureComponentStyle styles = component.e().getStyles();
        if (styles != null) {
            i(styles);
        }
        k().a().postDelayed(new Runnable() {
            @Override
            public final void run() {
                j.q(this.d);
            }
        }, 100L);
    }
}
