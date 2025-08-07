package n9;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import ka.C0731h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "Ln9/s0;", "uiComponentHelper", "Landroidx/constraintlayout/widget/ConstraintLayout;", "d", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Ln9/s0;)Landroidx/constraintlayout/widget/ConstraintLayout;", "other", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0692u {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InputAddressComponent d;
        final q9.d e;

        a(InputAddressComponent inputAddressComponent, q9.d dVar) {
            super(0);
            this.d = inputAddressComponent;
            this.e = dVar;
        }

        public Object invoke() {
            m684invoke();
            return Unit.a;
        }

        public final void m684invoke() {
            InputTextBasedComponentStyle inputTextStyle;
            TextBasedComponentStyle expandComponentsButtonStyle;
            InputAddress.AddressComponentStyle styles = this.d.e().getStyles();
            if (styles != null && (expandComponentsButtonStyle = styles.getExpandComponentsButtonStyle()) != null) {
                TextView textView = this.e.c;
                Intrinsics.checkNotNullExpressionValue(textView, "addressExpandComponentsButton");
                s9.v.e(textView, expandComponentsButtonStyle);
            }
            InputAddress.AddressComponentStyle styles2 = this.d.e().getStyles();
            if (styles2 == null || (inputTextStyle = styles2.getInputTextStyle()) == null) {
                return;
            }
            q9.d dVar = this.e;
            TextView textView2 = dVar.k;
            Intrinsics.checkNotNullExpressionValue(textView2, "addressLabel");
            s9.v.e(textView2, inputTextStyle.getLabelTextBasedStyle());
            TextInputLayout textInputLayout = dVar.d;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "addressFieldCollapsed");
            s9.t.j(textInputLayout, inputTextStyle);
            TextInputLayout textInputLayout2 = dVar.f;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "addressFieldExpanded");
            s9.t.j(textInputLayout2, inputTextStyle);
            TextInputLayout textInputLayout3 = dVar.n;
            Intrinsics.checkNotNullExpressionValue(textInputLayout3, "addressSuite");
            s9.t.j(textInputLayout3, inputTextStyle);
            TextInputLayout textInputLayout4 = dVar.b;
            Intrinsics.checkNotNullExpressionValue(textInputLayout4, "addressCity");
            s9.t.j(textInputLayout4, inputTextStyle);
            TextInputLayout textInputLayout5 = dVar.m;
            Intrinsics.checkNotNullExpressionValue(textInputLayout5, "addressSubdivision");
            s9.t.j(textInputLayout5, inputTextStyle);
            TextInputLayout textInputLayout6 = dVar.l;
            Intrinsics.checkNotNullExpressionValue(textInputLayout6, "addressPostalCode");
            s9.t.j(textInputLayout6, inputTextStyle);
        }
    }

    public static final InputAddressComponent c(InputAddressComponent inputAddressComponent, InputAddressComponent inputAddressComponent2) {
        inputAddressComponent.H(inputAddressComponent2.getIsAddressFieldCollapsed());
        inputAddressComponent.L(inputAddressComponent2.getTextControllerForAddressStreet1());
        inputAddressComponent.M(inputAddressComponent2.getTextControllerForAddressStreet2());
        inputAddressComponent.I(inputAddressComponent2.getTextControllerForAddressCity());
        inputAddressComponent.O(inputAddressComponent2.getTextControllerForAddressSubdivision());
        inputAddressComponent.J(inputAddressComponent2.getTextControllerForAddressPostalCode());
        return inputAddressComponent;
    }

    @NotNull
    public static final ConstraintLayout d(@NotNull final InputAddressComponent inputAddressComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(inputAddressComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        q9.d dVarD = q9.d.d(s0Var.getLayoutInflater());
        InputAddress.Attributes attributes = inputAddressComponent.e().getAttributes();
        if (attributes != null) {
            com.squareup.workflow1.ui.r rVarP = inputAddressComponent.getTextControllerForAddressStreet1();
            EditText editText = dVarD.d.getEditText();
            Intrinsics.d(editText);
            com.squareup.workflow1.ui.s.b(rVarP, editText);
            com.squareup.workflow1.ui.r rVarP2 = inputAddressComponent.getTextControllerForAddressStreet1();
            EditText editText2 = dVarD.f.getEditText();
            Intrinsics.d(editText2);
            com.squareup.workflow1.ui.s.b(rVarP2, editText2);
            com.squareup.workflow1.ui.r rVarQ = inputAddressComponent.getTextControllerForAddressStreet2();
            EditText editText3 = dVarD.n.getEditText();
            Intrinsics.d(editText3);
            com.squareup.workflow1.ui.s.b(rVarQ, editText3);
            com.squareup.workflow1.ui.r rVarB = inputAddressComponent.getTextControllerForAddressCity();
            EditText editText4 = dVarD.b.getEditText();
            Intrinsics.d(editText4);
            com.squareup.workflow1.ui.s.b(rVarB, editText4);
            com.squareup.workflow1.ui.r rVarH = inputAddressComponent.getTextControllerForAddressSubdivision();
            EditText editText5 = dVarD.m.getEditText();
            Intrinsics.d(editText5);
            com.squareup.workflow1.ui.s.b(rVarH, editText5);
            com.squareup.workflow1.ui.r rVarG = inputAddressComponent.getTextControllerForAddressPostalCode();
            EditText editText6 = dVarD.l.getEditText();
            Intrinsics.d(editText6);
            com.squareup.workflow1.ui.s.b(rVarG, editText6);
            String placeholderAutocomplete = attributes.getPlaceholderAutocomplete();
            if (placeholderAutocomplete != null) {
                dVarD.d.setHint(placeholderAutocomplete);
            }
            String placeholderAddressStreet1 = attributes.getPlaceholderAddressStreet1();
            if (placeholderAddressStreet1 != null) {
                dVarD.f.setHint(placeholderAddressStreet1);
            }
            String placeholderAddressStreet2 = attributes.getPlaceholderAddressStreet2();
            if (placeholderAddressStreet2 != null) {
                dVarD.n.setHint(placeholderAddressStreet2);
            }
            String placeholderAddressCity = attributes.getPlaceholderAddressCity();
            if (placeholderAddressCity != null) {
                dVarD.b.setHint(placeholderAddressCity);
            }
            boolean zB = Intrinsics.b(attributes.getSelectedCountryCode(), "US");
            dVarD.m.setHint(zB ? attributes.getPlaceholderAddressSubdivisionUs() : attributes.getPlaceholderAddressSubdivision());
            dVarD.l.setHint(zB ? attributes.getPlaceholderAddressPostalCodeUs() : attributes.getPlaceholderAddressPostalCode());
            String label = attributes.getLabel();
            if (label != null) {
                dVarD.k.setText(label);
            }
            String editAddressManuallyPrompt = attributes.getEditAddressManuallyPrompt();
            if (editAddressManuallyPrompt != null) {
                dVarD.c.setText(editAddressManuallyPrompt);
            }
        }
        dVarD.a().setTag(dVarD);
        s0Var.d(new a(inputAddressComponent, dVarD));
        dVarD.c.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                C0692u.e(inputAddressComponent, view);
            }
        });
        dVarD.a().setTag(dVarD);
        ConstraintLayout constraintLayoutA = dVarD.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
        return constraintLayoutA;
    }

    public static final void e(InputAddressComponent inputAddressComponent, View view) {
        Intrinsics.checkNotNullParameter(inputAddressComponent, "$this_makeView");
        inputAddressComponent.G(Boolean.FALSE);
        C0731h c0731hL = inputAddressComponent.getIsAddressFieldCollapsed();
        Boolean boolF = inputAddressComponent.getIsAddressComponentsCollapsed();
        c0731hL.c(boolF != null ? boolF.booleanValue() : false);
    }
}
