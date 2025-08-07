package n9;

import android.telephony.PhoneNumberFormattingTextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import j9.C0608k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "Ln9/s0;", "uiComponentHelper", "Lcom/google/android/material/textfield/TextInputLayout;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;Ln9/s0;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class N {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InputPhoneNumberComponent d;
        final q9.l e;

        a(InputPhoneNumberComponent inputPhoneNumberComponent, q9.l lVar) {
            super(0);
            this.d = inputPhoneNumberComponent;
            this.e = lVar;
        }

        public Object invoke() {
            m623invoke();
            return Unit.a;
        }

        public final void m623invoke() {
            InputTextBasedComponentStyle styles = this.d.e().getStyles();
            if (styles != null) {
                TextInputLayout textInputLayout = this.e.b;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "inputLayout");
                s9.t.j(textInputLayout, styles);
            }
        }
    }

    @NotNull
    public static final TextInputLayout a(@NotNull InputPhoneNumberComponent inputPhoneNumberComponent, @NotNull s0 s0Var) {
        EditText editText;
        Intrinsics.checkNotNullParameter(inputPhoneNumberComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        q9.l lVarD = q9.l.d(s0Var.getLayoutInflater());
        InputPhoneNumber.Attributes attributes = inputPhoneNumberComponent.e().getAttributes();
        if (attributes != null) {
            String prefill = attributes.getPrefill();
            if (prefill != null && (editText = lVarD.b.getEditText()) != null) {
                editText.setText(prefill);
            }
            String label = attributes.getLabel();
            if (label != null) {
                lVarD.b.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                lVarD.b.setPlaceholderText(placeholder);
                TextInputLayout textInputLayout = lVarD.b;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "inputLayout");
                C0608k.a(textInputLayout);
            }
            EditText editText2 = lVarD.b.getEditText();
            if (editText2 != null) {
                com.squareup.workflow1.ui.r textController = inputPhoneNumberComponent.getTextController();
                Intrinsics.d(editText2);
                com.squareup.workflow1.ui.s.b(textController, editText2);
                editText2.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
            }
        }
        s0Var.d(new a(inputPhoneNumberComponent, lVarD));
        TextInputLayout textInputLayoutA = lVarD.a();
        Intrinsics.checkNotNullExpressionValue(textInputLayoutA, "getRoot(...)");
        return textInputLayoutA;
    }
}
