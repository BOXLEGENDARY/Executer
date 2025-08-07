package n9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import ha.C0356g;
import ha.C0458f;
import ha.InterfaceC0883h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "Ln9/s0;", "uiComponentHelper", "Landroidx/constraintlayout/widget/ConstraintLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;Ln9/s0;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Lq9/v;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;", "styles", "", "b", "(Lq9/v;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;)V", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0685m {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ESignatureComponent d;
        final q9.v e;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"n9/m$a$a", "LL1/a;", "Landroid/graphics/drawable/Drawable;", "placeholder", "", "f", "(Landroid/graphics/drawable/Drawable;)V", "error", "c", "result", "b", "coil-base_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0256a implements L1.a {
            final q9.v d;
            final q9.v e;
            final ESignatureComponent i;
            final q9.v v;

            public C0256a(q9.v vVar, q9.v vVar2, ESignatureComponent eSignatureComponent, q9.v vVar3) {
                this.d = vVar;
                this.e = vVar2;
                this.i = eSignatureComponent;
                this.v = vVar3;
            }

            @Override
            public void b(Drawable result) {
                Bitmap bitmap;
                BitmapDrawable bitmapDrawable = result instanceof BitmapDrawable ? (BitmapDrawable) result : null;
                if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                    return;
                }
                Intrinsics.d(bitmap);
                this.i.getBitmapController().c(bitmap);
                this.v.g.setVisibility(0);
                this.v.c.setVisibility(0);
            }

            @Override
            public void c(Drawable error) {
                this.e.b.setVisibility(0);
            }

            @Override
            public void f(Drawable placeholder) {
                this.d.b.setVisibility(8);
                this.d.c.setVisibility(8);
                this.d.g.setVisibility(8);
            }
        }

        a(ESignatureComponent eSignatureComponent, q9.v vVar) {
            super(0);
            this.d = eSignatureComponent;
            this.e = vVar;
        }

        public Object invoke() {
            m676invoke();
            return Unit.a;
        }

        public final void m676invoke() {
            String prefill;
            ESignature.Attributes attributes = this.d.e().getAttributes();
            if (attributes != null && (prefill = attributes.getPrefill()) != null) {
                q9.v vVar = this.e;
                ESignatureComponent eSignatureComponent = this.d;
                Context context = vVar.g.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                InterfaceC0883h interfaceC0883hD = new InterfaceC0883h.a(context).j(true).i(100).d();
                Context context2 = vVar.g.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                interfaceC0883hD.a(new C0356g.a(context2).d(prefill).r(new C0256a(vVar, vVar, eSignatureComponent, vVar)).a());
            }
            ESignature.ESignatureComponentStyle styles = this.d.e().getStyles();
            if (styles != null) {
                q9.v vVar2 = this.e;
                Intrinsics.d(vVar2);
                C0685m.b(vVar2, styles);
            }
        }
    }

    public static final void b(q9.v vVar, ESignature.ESignatureComponentStyle eSignatureComponentStyle) {
        Drawable drawableMutate;
        TextView textView = vVar.b;
        Intrinsics.checkNotNullExpressionValue(textView, "addSignatureLabel");
        s9.v.e(textView, eSignatureComponentStyle.getInputTextStyle().getPlaceholderTextBasedStyle());
        Integer signaturePreviewBackgroundColor = eSignatureComponentStyle.getSignaturePreviewBackgroundColor();
        if (signaturePreviewBackgroundColor != null) {
            vVar.f.setCardBackgroundColor(signaturePreviewBackgroundColor.intValue());
        }
        Integer fillColorValue = eSignatureComponentStyle.getFillColorValue();
        if (fillColorValue != null) {
            int iIntValue = fillColorValue.intValue();
            Drawable drawable = vVar.c.getDrawable();
            if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                drawableMutate.setTint(iIntValue);
            }
        }
        TextView textView2 = vVar.d;
        Intrinsics.checkNotNullExpressionValue(textView2, "errorLabel");
        s9.v.e(textView2, eSignatureComponentStyle.getInputTextStyle().getErrorTextStyle());
        TextView textView3 = vVar.e;
        Intrinsics.checkNotNullExpressionValue(textView3, "label");
        s9.v.e(textView3, eSignatureComponentStyle.getInputTextStyle().getLabelTextBasedStyle());
        StyleElements.SizeSet margins = eSignatureComponentStyle.getMargins();
        if (margins != null) {
            ConstraintLayout constraintLayoutA = vVar.a();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
            u9.d.c(constraintLayoutA, margins);
        }
        Integer baseBorderColorValue = eSignatureComponentStyle.getInputTextStyle().getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            vVar.f.setStrokeColor(baseBorderColorValue.intValue());
        }
        Double borderWidthValue = eSignatureComponentStyle.getInputTextStyle().getBorderWidthValue();
        if (borderWidthValue != null) {
            vVar.f.setStrokeWidth((int) Math.ceil(C0458f.a(borderWidthValue.doubleValue())));
        }
        Double borderRadiusValue = eSignatureComponentStyle.getInputTextStyle().getBorderRadiusValue();
        if (borderRadiusValue != null) {
            vVar.f.setRadius((float) C0458f.a(borderRadiusValue.doubleValue()));
        }
    }

    @NotNull
    public static final ConstraintLayout c(@NotNull ESignatureComponent eSignatureComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(eSignatureComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        q9.v vVarD = q9.v.d(s0Var.getLayoutInflater());
        s0Var.d(new a(eSignatureComponent, vVarD));
        vVarD.a().setTag(vVarD);
        ConstraintLayout constraintLayoutA = vVarD.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
        return constraintLayoutA;
    }
}
