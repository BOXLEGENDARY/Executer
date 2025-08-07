package n9;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextAreaComponent;
import j9.C0608k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;", "Ln9/s0;", "uiComponentHelper", "Lcom/google/android/material/textfield/TextInputLayout;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;Ln9/s0;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class U {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InputTextAreaComponent d;
        final q9.n e;

        a(InputTextAreaComponent inputTextAreaComponent, q9.n nVar) {
            super(0);
            this.d = inputTextAreaComponent;
            this.e = nVar;
        }

        public Object invoke() {
            m628invoke();
            return Unit.a;
        }

        public final void m628invoke() {
            InputTextBasedComponentStyle styles = this.d.e().getStyles();
            if (styles != null) {
                TextInputLayout textInputLayout = this.e.c;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "inputLayout");
                s9.t.j(textInputLayout, styles);
            }
        }
    }

    @NotNull
    public static final TextInputLayout a(@NotNull InputTextAreaComponent inputTextAreaComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(inputTextAreaComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        q9.n nVarD = q9.n.d(s0Var.getLayoutInflater());
        InputTextArea.Attributes attributes = inputTextAreaComponent.e().getAttributes();
        if (attributes != null) {
            com.squareup.workflow1.ui.r textController = inputTextAreaComponent.getTextController();
            TextInputEditText textInputEditText = nVarD.b;
            Intrinsics.checkNotNullExpressionValue(textInputEditText, "editText");
            com.squareup.workflow1.ui.s.b(textController, textInputEditText);
            String label = attributes.getLabel();
            if (label != null) {
                nVarD.c.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                nVarD.c.setPlaceholderText(placeholder);
                TextInputLayout textInputLayout = nVarD.c;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "inputLayout");
                C0608k.a(textInputLayout);
            }
            Integer rows = attributes.getRows();
            if (rows != null) {
                int iIntValue = rows.intValue();
                nVarD.b.setMaxLines(iIntValue);
                nVarD.b.setMinLines(iIntValue);
                nVarD.b.setVerticalScrollBarEnabled(true);
            }
        }
        s0Var.d(new a(inputTextAreaComponent, nVarD));
        TextInputLayout textInputLayoutA = nVarD.a();
        Intrinsics.checkNotNullExpressionValue(textInputLayoutA, "getRoot(...)");
        return textInputLayoutA;
    }
}
