package n9;

import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMultiSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMultiSelectComponent;
import j9.C0608k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;", "Ln9/s0;", "uiComponentHelper", "Lcom/google/android/material/textfield/TextInputLayout;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;Ln9/s0;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class L {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InputMultiSelectComponent d;
        final q9.r e;

        a(InputMultiSelectComponent inputMultiSelectComponent, q9.r rVar) {
            super(0);
            this.d = inputMultiSelectComponent;
            this.e = rVar;
        }

        public Object invoke() {
            m621invoke();
            return Unit.a;
        }

        public final void m621invoke() {
            InputSelectComponentStyle styles = this.d.e().getStyles();
            if (styles != null) {
                TextInputLayout textInputLayout = this.e.b;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "listSelector");
                s9.f.b(textInputLayout, styles);
            }
        }
    }

    @NotNull
    public static final TextInputLayout a(@NotNull InputMultiSelectComponent inputMultiSelectComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(inputMultiSelectComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        q9.r rVarD = q9.r.d(s0Var.getLayoutInflater());
        InputMultiSelect.Attributes attributes = inputMultiSelectComponent.e().getAttributes();
        if (attributes != null) {
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null && !StringsKt.Y(placeholder)) {
                rVarD.a().setPlaceholderText(attributes.getPlaceholder());
                rVarD.a().setExpandedHintEnabled(false);
                TextInputLayout textInputLayoutA = rVarD.a();
                Intrinsics.checkNotNullExpressionValue(textInputLayoutA, "getRoot(...)");
                C0608k.a(textInputLayoutA);
            }
            String label = attributes.getLabel();
            if (label != null) {
                rVarD.a().setHint(label);
            }
        }
        s0Var.d(new a(inputMultiSelectComponent, rVarD));
        TextInputLayout textInputLayoutA2 = rVarD.a();
        Intrinsics.checkNotNullExpressionValue(textInputLayoutA2, "getRoot(...)");
        return textInputLayoutA2;
    }
}
