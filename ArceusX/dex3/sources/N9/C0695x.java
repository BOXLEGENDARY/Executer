package n9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import ha.C0458f;
import ha.C0476u;
import ka.C0726c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "Ln9/s0;", "uiComponentHelper", "Landroidx/constraintlayout/widget/ConstraintLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;Ln9/s0;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Lq9/i;", "binding", "d", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;Ln9/s0;Lq9/i;)Landroidx/constraintlayout/widget/ConstraintLayout;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0695x {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InputCheckboxComponent d;
        final q9.i e;

        a(InputCheckboxComponent inputCheckboxComponent, q9.i iVar) {
            super(0);
            this.d = inputCheckboxComponent;
            this.e = iVar;
        }

        public Object invoke() {
            m685invoke();
            return Unit.a;
        }

        public final void m685invoke() {
            TextBasedComponentStyle errorTextStyle;
            TextBasedComponentStyle descriptionTextStyle;
            TextBasedComponentStyle textBasedStyle;
            InputCheckbox.InputCheckboxComponentStyle styles = this.d.e().getStyles();
            if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
                TextView textView = this.e.e;
                Intrinsics.checkNotNullExpressionValue(textView, "checkboxLabel");
                s9.v.e(textView, textBasedStyle);
            }
            InputCheckbox.InputCheckboxComponentStyle styles2 = this.d.e().getStyles();
            if (styles2 != null && (descriptionTextStyle = styles2.getDescriptionTextStyle()) != null) {
                TextView textView2 = this.e.c;
                Intrinsics.checkNotNullExpressionValue(textView2, "checkboxDescription");
                s9.v.e(textView2, descriptionTextStyle);
            }
            InputCheckbox.InputCheckboxComponentStyle styles3 = this.d.e().getStyles();
            if (styles3 != null && (errorTextStyle = styles3.getErrorTextStyle()) != null) {
                TextView textView3 = this.e.d;
                Intrinsics.checkNotNullExpressionValue(textView3, "checkboxError");
                s9.v.e(textView3, errorTextStyle);
            }
            TextView textView4 = this.e.e;
            Intrinsics.checkNotNullExpressionValue(textView4, "checkboxLabel");
            q9.i iVar = this.e;
            ViewGroup.LayoutParams layoutParams = textView4.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            TextView textView5 = iVar.e;
            Intrinsics.checkNotNullExpressionValue(textView5, "checkboxLabel");
            int iA = j9.l.a(textView5);
            TextView textView6 = iVar.c;
            Intrinsics.checkNotNullExpressionValue(textView6, "checkboxDescription");
            int iA2 = iA + j9.l.a(textView6);
            if (iA2 != 0) {
                if (iA2 != 1) {
                    ((ViewGroup.MarginLayoutParams) bVar).topMargin = (int) C0458f.a(4.0d);
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar).topMargin = (int) C0458f.a(0.0d);
                }
            }
            textView4.setLayoutParams(bVar);
        }
    }

    @NotNull
    public static final ConstraintLayout c(@NotNull InputCheckboxComponent inputCheckboxComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(inputCheckboxComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        q9.i iVarD = q9.i.d(s0Var.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(iVarD, "inflate(...)");
        return d(inputCheckboxComponent, s0Var, iVarD);
    }

    @NotNull
    public static final ConstraintLayout d(@NotNull final InputCheckboxComponent inputCheckboxComponent, @NotNull s0 s0Var, @NotNull final q9.i iVar) {
        AttributeStyles.TextBasedTextColorStyle textColorHighlight;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        Integer value;
        Intrinsics.checkNotNullParameter(inputCheckboxComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(iVar, "binding");
        Context context = s0Var.getContext();
        iVar.b.setChecked(inputCheckboxComponent.getTwoStateViewController().b());
        iVar.b.setClickable(false);
        iVar.b.setFocusable(false);
        InputCheckbox.Attributes attributes = inputCheckboxComponent.e().getAttributes();
        String label = attributes != null ? attributes.getLabel() : null;
        if (label == null || StringsKt.Y(label)) {
            iVar.e.setVisibility(8);
        } else {
            iVar.e.setVisibility(0);
            TextView textView = iVar.e;
            Intrinsics.checkNotNullExpressionValue(textView, "checkboxLabel");
            C0726c.c(textView, label);
        }
        InputCheckbox.Attributes attributes2 = inputCheckboxComponent.e().getAttributes();
        String descriptionText = attributes2 != null ? attributes2.getDescriptionText() : null;
        if (descriptionText == null || StringsKt.Y(descriptionText)) {
            iVar.c.setVisibility(8);
        } else {
            iVar.c.setVisibility(0);
            TextView textView2 = iVar.c;
            Intrinsics.checkNotNullExpressionValue(textView2, "checkboxDescription");
            C0726c.c(textView2, descriptionText);
        }
        iVar.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C0695x.e(inputCheckboxComponent, compoundButton, z);
            }
        });
        iVar.a().setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                C0695x.f(iVar, view);
            }
        });
        InputCheckbox.InputCheckboxComponentStyle styles = inputCheckboxComponent.e().getStyles();
        if (styles != null && (textColorHighlight = styles.getTextColorHighlight()) != null && (base = textColorHighlight.getBase()) != null && (base2 = base.getBase()) != null && (value = base2.getValue()) != null) {
            int iIntValue = value.intValue();
            int i = c4.b.i;
            iVar.b.setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842912}, new int[]{android.R.attr.state_checked}}, new int[]{androidx.core.graphics.a.l(C0476u.d(context, i, null, false, 6, null), (int) (p0.h.g(context.getResources(), c4.d.A) * 255)), C0476u.d(context, i, null, false, 6, null), iIntValue}));
        }
        s0Var.d(new a(inputCheckboxComponent, iVar));
        iVar.a().setTag(iVar);
        ConstraintLayout constraintLayoutA = iVar.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
        return constraintLayoutA;
    }

    public static final void e(InputCheckboxComponent inputCheckboxComponent, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(inputCheckboxComponent, "$this_makeView");
        inputCheckboxComponent.getTwoStateViewController().c(z);
    }

    public static final void f(q9.i iVar, View view) {
        Intrinsics.checkNotNullParameter(iVar, "$this_apply");
        iVar.b.toggle();
    }
}
