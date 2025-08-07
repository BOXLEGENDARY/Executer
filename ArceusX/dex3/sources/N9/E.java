package n9;

import android.graphics.drawable.ColorDrawable;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent;
import java.util.List;
import ka.C0725b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m9.C0633a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "Ln9/s0;", "uiComponentHelper", "Lo9/b;", "dateController", "Landroidx/constraintlayout/widget/ConstraintLayout;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;Ln9/s0;Lo9/b;)Landroidx/constraintlayout/widget/ConstraintLayout;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class E {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InputDate.InputDateComponentStyle d;
        final q9.f e;

        a(InputDate.InputDateComponentStyle inputDateComponentStyle, q9.f fVar) {
            super(0);
            this.d = inputDateComponentStyle;
            this.e = fVar;
        }

        public Object invoke() {
            m619invoke();
            return Unit.a;
        }

        public final void m619invoke() {
            InputTextBasedComponentStyle inputTextStyle;
            InputTextBasedComponentStyle inputTextStyle2;
            InputSelectComponentStyle inputSelectStyle;
            InputSelectComponentStyle inputSelectStyle2;
            TextBasedComponentStyle errorTextStyle;
            InputSelectComponentStyle inputSelectStyle3;
            TextBasedComponentStyle labelStyle;
            AttributeStyles.InputMarginStyle margin;
            StyleElements.MeasurementSet base;
            StyleElements.SizeSet base2;
            InputDate.InputDateComponentStyle inputDateComponentStyle = this.d;
            if (inputDateComponentStyle != null && (margin = inputDateComponentStyle.getMargin()) != null && (base = margin.getBase()) != null && (base2 = base.getBase()) != null) {
                ConstraintLayout constraintLayoutA = this.e.a();
                Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
                u9.d.c(constraintLayoutA, base2);
            }
            InputDate.InputDateComponentStyle inputDateComponentStyle2 = this.d;
            if (inputDateComponentStyle2 != null && (inputSelectStyle3 = inputDateComponentStyle2.getInputSelectStyle()) != null && (labelStyle = inputSelectStyle3.getLabelStyle()) != null) {
                TextView textView = this.e.b;
                Intrinsics.checkNotNullExpressionValue(textView, "dateLabel");
                s9.v.e(textView, labelStyle);
            }
            InputDate.InputDateComponentStyle inputDateComponentStyle3 = this.d;
            if (inputDateComponentStyle3 != null && (inputSelectStyle2 = inputDateComponentStyle3.getInputSelectStyle()) != null && (errorTextStyle = inputSelectStyle2.getErrorTextStyle()) != null) {
                TextView textView2 = this.e.e;
                Intrinsics.checkNotNullExpressionValue(textView2, "errorLabel");
                s9.v.e(textView2, errorTextStyle);
            }
            InputDate.InputDateComponentStyle inputDateComponentStyle4 = this.d;
            if (inputDateComponentStyle4 != null && (inputSelectStyle = inputDateComponentStyle4.getInputSelectStyle()) != null) {
                TextInputLayout textInputLayout = this.e.f;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "month");
                s9.f.b(textInputLayout, inputSelectStyle);
            }
            InputDate.InputDateComponentStyle inputDateComponentStyle5 = this.d;
            if (inputDateComponentStyle5 != null && (inputTextStyle2 = inputDateComponentStyle5.getInputTextStyle()) != null) {
                TextInputLayout textInputLayout2 = this.e.c;
                Intrinsics.checkNotNullExpressionValue(textInputLayout2, "day");
                s9.t.j(textInputLayout2, inputTextStyle2);
            }
            InputDate.InputDateComponentStyle inputDateComponentStyle6 = this.d;
            if (inputDateComponentStyle6 == null || (inputTextStyle = inputDateComponentStyle6.getInputTextStyle()) == null) {
                return;
            }
            TextInputLayout textInputLayout3 = this.e.h;
            Intrinsics.checkNotNullExpressionValue(textInputLayout3, "year");
            s9.t.j(textInputLayout3, inputTextStyle);
        }
    }

    @NotNull
    public static final ConstraintLayout a(@NotNull InputDateComponent inputDateComponent, @NotNull s0 s0Var, @NotNull C0725b c0725b) {
        AttributeStyles.DateSelectBackgroundColorStyle backgroundColor;
        Integer inputSelectBackgroundColor;
        InputSelectComponentStyle inputSelectStyle;
        Intrinsics.checkNotNullParameter(inputDateComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(c0725b, "dateController");
        q9.f fVarD = q9.f.d(s0Var.getLayoutInflater());
        InputDate.InputDateComponentStyle styles = inputDateComponent.e().getStyles();
        InputDate.Attributes attributes = inputDateComponent.e().getAttributes();
        if (attributes != null) {
            fVarD.b.setText(attributes.getLabel());
            List<String> textMonths = attributes.getTextMonths();
            if (textMonths == null) {
                textMonths = CollectionsKt.j();
            }
            C0633a c0633a = new C0633a(s0Var.getContext(), l9.e.g, textMonths, (styles == null || (inputSelectStyle = styles.getInputSelectStyle()) == null) ? null : inputSelectStyle.getTextBasedStyle());
            com.squareup.workflow1.ui.r monthController = c0725b.getMonthController();
            AutoCompleteTextView autoCompleteTextView = fVarD.g;
            Intrinsics.checkNotNullExpressionValue(autoCompleteTextView, "monthEditText");
            com.squareup.workflow1.ui.s.b(monthController, autoCompleteTextView);
            fVarD.g.setAdapter(c0633a);
            if (styles != null && (backgroundColor = styles.getBackgroundColor()) != null && (inputSelectBackgroundColor = backgroundColor.getInputSelectBackgroundColor()) != null) {
                fVarD.g.setDropDownBackgroundDrawable(new ColorDrawable(inputSelectBackgroundColor.intValue()));
            }
            fVarD.c.setHint(attributes.getPlaceholderDay());
            com.squareup.workflow1.ui.r dayController = c0725b.getDayController();
            TextInputEditText textInputEditText = fVarD.d;
            Intrinsics.checkNotNullExpressionValue(textInputEditText, "dayEditText");
            com.squareup.workflow1.ui.s.b(dayController, textInputEditText);
            fVarD.h.setHint(attributes.getPlaceholderYear());
            com.squareup.workflow1.ui.r yearController = c0725b.getYearController();
            TextInputEditText textInputEditText2 = fVarD.i;
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "yearEditText");
            com.squareup.workflow1.ui.s.b(yearController, textInputEditText2);
        }
        s0Var.d(new a(styles, fVarD));
        fVarD.a().setTag(fVarD);
        ConstraintLayout constraintLayoutA = fVarD.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
        return constraintLayoutA;
    }

    public static ConstraintLayout b(InputDateComponent inputDateComponent, s0 s0Var, C0725b c0725b, int i, Object obj) {
        if ((i & 2) != 0) {
            c0725b = inputDateComponent.getDateController();
        }
        return a(inputDateComponent, s0Var, c0725b);
    }
}
