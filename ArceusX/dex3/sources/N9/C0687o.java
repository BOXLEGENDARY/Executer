package n9;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.SubmitButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "Ln9/s0;", "uiComponentHelper", "Landroid/widget/LinearLayout;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;Ln9/s0;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0687o {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final TextInputLayout d;
        final TextInputLayout e;
        final ConstraintLayout i;
        final ConstraintLayout v;

        a(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
            super(0);
            this.d = textInputLayout;
            this.e = textInputLayout2;
            this.i = constraintLayout;
            this.v = constraintLayout2;
        }

        public Object invoke() {
            m678invoke();
            return Unit.a;
        }

        public final void m678invoke() {
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            this.i.setVisibility(8);
            this.v.setVisibility(8);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.l implements Function0<Unit> {
        final TextView d;
        final GovernmentIdNfcScanComponent e;

        b(TextView textView, GovernmentIdNfcScanComponent governmentIdNfcScanComponent) {
            super(0);
            this.d = textView;
            this.e = governmentIdNfcScanComponent;
        }

        public Object invoke() {
            m679invoke();
            return Unit.a;
        }

        public final void m679invoke() {
            TextBasedComponentStyle errorLabelStyle;
            this.d.setVisibility(8);
            GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles = this.e.e().getStyles();
            if (styles == null || (errorLabelStyle = styles.getErrorLabelStyle()) == null) {
                return;
            }
            s9.v.e(this.d, errorLabelStyle);
        }
    }

    @NotNull
    public static final LinearLayout a(@NotNull GovernmentIdNfcScanComponent governmentIdNfcScanComponent, @NotNull s0 s0Var) {
        String launchButtonText;
        Boolean hidePrefilledInputs;
        Intrinsics.checkNotNullParameter(governmentIdNfcScanComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        LinearLayout linearLayout = new LinearLayout(s0Var.getContext());
        linearLayout.setOrientation(1);
        GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScanComponent.e().getAttributes();
        String cardAccessNumberLabel = attributes != null ? attributes.getCardAccessNumberLabel() : null;
        GovernmentIdNfcScan.Attributes attributes2 = governmentIdNfcScanComponent.e().getAttributes();
        String prefillCardAccessNumber = attributes2 != null ? attributes2.getPrefillCardAccessNumber() : null;
        InputText.InputType inputType = InputText.InputType.TEXT;
        GovernmentIdNfcScan.Attributes attributes3 = governmentIdNfcScanComponent.e().getAttributes();
        JsonLogicBoolean disabled = attributes3 != null ? attributes3.getDisabled() : null;
        GovernmentIdNfcScan.Attributes attributes4 = governmentIdNfcScanComponent.e().getAttributes();
        InputText.Attributes attributes5 = new InputText.Attributes(prefillCardAccessNumber, cardAccessNumberLabel, null, inputType, null, attributes4 != null ? attributes4.getHidden() : null, disabled);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles = governmentIdNfcScanComponent.e().getStyles();
        View viewA = V.a(new InputTextComponent(new InputText("can_access_code", attributes5, styles != null ? styles.getDocumentNumberStyle() : null), null, 2, null), s0Var, governmentIdNfcScanComponent.getCardAccessNumberController());
        viewA.setId(l9.d.c0);
        linearLayout.addView(viewA);
        GovernmentIdNfcScan.Attributes attributes6 = governmentIdNfcScanComponent.e().getAttributes();
        String documentNumberLabel = attributes6 != null ? attributes6.getDocumentNumberLabel() : null;
        GovernmentIdNfcScan.Attributes attributes7 = governmentIdNfcScanComponent.e().getAttributes();
        String prefillDocumentNumber = attributes7 != null ? attributes7.getPrefillDocumentNumber() : null;
        GovernmentIdNfcScan.Attributes attributes8 = governmentIdNfcScanComponent.e().getAttributes();
        JsonLogicBoolean disabled2 = attributes8 != null ? attributes8.getDisabled() : null;
        GovernmentIdNfcScan.Attributes attributes9 = governmentIdNfcScanComponent.e().getAttributes();
        InputText.Attributes attributes10 = new InputText.Attributes(prefillDocumentNumber, documentNumberLabel, null, inputType, null, attributes9 != null ? attributes9.getHidden() : null, disabled2);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles2 = governmentIdNfcScanComponent.e().getStyles();
        View viewA2 = V.a(new InputTextComponent(new InputText("doc_number", attributes10, styles2 != null ? styles2.getDocumentNumberStyle() : null), null, 2, null), s0Var, governmentIdNfcScanComponent.getDocumentNumberController());
        viewA2.setId(l9.d.e0);
        linearLayout.addView(viewA2);
        GovernmentIdNfcScan.Attributes attributes11 = governmentIdNfcScanComponent.e().getAttributes();
        String dateOfBirthLabel = attributes11 != null ? attributes11.getDateOfBirthLabel() : null;
        GovernmentIdNfcScan.Attributes attributes12 = governmentIdNfcScanComponent.e().getAttributes();
        String prefillDateOfBirth = attributes12 != null ? attributes12.getPrefillDateOfBirth() : null;
        GovernmentIdNfcScan.Companion companion = GovernmentIdNfcScan.Companion;
        List<String> listGenerateTextMonths = companion.generateTextMonths();
        GovernmentIdNfcScan.Attributes attributes13 = governmentIdNfcScanComponent.e().getAttributes();
        JsonLogicBoolean disabled3 = attributes13 != null ? attributes13.getDisabled() : null;
        GovernmentIdNfcScan.Attributes attributes14 = governmentIdNfcScanComponent.e().getAttributes();
        InputDate.Attributes attributes15 = new InputDate.Attributes(prefillDateOfBirth, dateOfBirthLabel, null, null, null, listGenerateTextMonths, attributes14 != null ? attributes14.getHidden() : null, disabled3, 28, null);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles3 = governmentIdNfcScanComponent.e().getStyles();
        View viewA3 = E.a(new InputDateComponent(new InputDate("dob", styles3 != null ? styles3.getDateStyle() : null, attributes15), null, 2, null), s0Var, governmentIdNfcScanComponent.getDateOfBirthController());
        viewA3.setId(l9.d.d0);
        linearLayout.addView(viewA3);
        GovernmentIdNfcScan.Attributes attributes16 = governmentIdNfcScanComponent.e().getAttributes();
        String expirationDateLabel = attributes16 != null ? attributes16.getExpirationDateLabel() : null;
        GovernmentIdNfcScan.Attributes attributes17 = governmentIdNfcScanComponent.e().getAttributes();
        String prefillExpirationDate = attributes17 != null ? attributes17.getPrefillExpirationDate() : null;
        List<String> listGenerateTextMonths2 = companion.generateTextMonths();
        GovernmentIdNfcScan.Attributes attributes18 = governmentIdNfcScanComponent.e().getAttributes();
        JsonLogicBoolean disabled4 = attributes18 != null ? attributes18.getDisabled() : null;
        GovernmentIdNfcScan.Attributes attributes19 = governmentIdNfcScanComponent.e().getAttributes();
        InputDate.Attributes attributes20 = new InputDate.Attributes(prefillExpirationDate, expirationDateLabel, null, null, null, listGenerateTextMonths2, attributes19 != null ? attributes19.getHidden() : null, disabled4, 28, null);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles4 = governmentIdNfcScanComponent.e().getStyles();
        View viewA4 = E.a(new InputDateComponent(new InputDate(GovernmentIdNfcScan.expirationDateName, styles4 != null ? styles4.getDateStyle() : null, attributes20), null, 2, null), s0Var, governmentIdNfcScanComponent.getExpirationDateController());
        viewA4.setId(l9.d.g0);
        linearLayout.addView(viewA4);
        GovernmentIdNfcScan.Attributes attributes21 = governmentIdNfcScanComponent.e().getAttributes();
        if (attributes21 == null || (launchButtonText = attributes21.getLaunchButtonText()) == null) {
            launchButtonText = "";
        }
        BasicButtonAttributes basicButtonAttributes = new BasicButtonAttributes(launchButtonText, Button.ButtonType.PRIMARY, null, null, null, null, 60, null);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles5 = governmentIdNfcScanComponent.e().getStyles();
        ButtonWithLoadingIndicator buttonWithLoadingIndicatorA = p0.a(new SubmitButtonComponent(new SubmitButton(GovernmentIdNfcScan.launchButtonName, basicButtonAttributes, styles5 != null ? styles5.getLaunchButtonStyle() : null)), s0Var);
        buttonWithLoadingIndicatorA.setId(l9.d.h0);
        linearLayout.addView(buttonWithLoadingIndicatorA);
        GovernmentIdNfcScan.Attributes attributes22 = governmentIdNfcScanComponent.e().getAttributes();
        String prefillCardAccessNumber2 = attributes22 != null ? attributes22.getPrefillCardAccessNumber() : null;
        if (prefillCardAccessNumber2 == null || StringsKt.Y(prefillCardAccessNumber2)) {
            viewA.setVisibility(8);
        }
        GovernmentIdNfcScan.Attributes attributes23 = governmentIdNfcScanComponent.e().getAttributes();
        if (attributes23 != null && (hidePrefilledInputs = attributes23.getHidePrefilledInputs()) != null && hidePrefilledInputs.booleanValue()) {
            s0Var.d(new a(viewA, viewA2, viewA3, viewA4));
        }
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(l9.d.f0);
        s0Var.d(new b(textView, governmentIdNfcScanComponent));
        linearLayout.addView(textView);
        Object tag = viewA3.getTag();
        Intrinsics.e(tag, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding");
        q9.f fVar = (q9.f) tag;
        Object tag2 = viewA4.getTag();
        Intrinsics.e(tag2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding");
        linearLayout.setTag(new C0688p(viewA, viewA2, fVar, (q9.f) tag2, buttonWithLoadingIndicatorA, textView));
        return linearLayout;
    }
}
