package n9;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponent;
import j9.C0608k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;", "Ln9/s0;", "uiComponentHelper", "Lcom/google/android/material/textfield/TextInputLayout;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;Ln9/s0;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class M {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InputNumberComponent d;
        final q9.k e;

        a(InputNumberComponent inputNumberComponent, q9.k kVar) {
            super(0);
            this.d = inputNumberComponent;
            this.e = kVar;
        }

        public Object invoke() {
            m622invoke();
            return Unit.a;
        }

        public final void m622invoke() {
            InputTextBasedComponentStyle styles = this.d.e().getStyles();
            if (styles != null) {
                TextInputLayout textInputLayout = this.e.c;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "inputLayout");
                s9.t.j(textInputLayout, styles);
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", Text.type, "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b implements TextWatcher {
        final InputNumberComponent d;

        public b(InputNumberComponent inputNumberComponent) {
            this.d = inputNumberComponent;
        }

        @Override
        public void afterTextChanged(Editable s) {
            String string;
            this.d.getNumberController().c((s == null || (string = s.toString()) == null) ? null : StringsKt.i(string));
        }

        @Override
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }
    }

    @NotNull
    public static final TextInputLayout a(@NotNull InputNumberComponent inputNumberComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(inputNumberComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        q9.k kVarD = q9.k.d(s0Var.getLayoutInflater());
        InputNumber.Attributes attributes = inputNumberComponent.e().getAttributes();
        if (attributes != null) {
            String label = attributes.getLabel();
            if (label != null) {
                kVarD.c.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                kVarD.c.setPlaceholderText(placeholder);
                TextInputLayout textInputLayout = kVarD.c;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "inputLayout");
                C0608k.a(textInputLayout);
            }
            Integer precision = attributes.getPrecision();
            if (precision != null) {
                int iIntValue = precision.intValue();
                EditText editText = kVarD.c.getEditText();
                if (editText != null) {
                    editText.setFilters(new C0683k[]{new C0683k(iIntValue)});
                }
            }
        }
        kVarD.b.setText(String.valueOf(inputNumberComponent.getNumberController().b()));
        TextInputEditText textInputEditText = kVarD.b;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "editText");
        textInputEditText.addTextChangedListener(new b(inputNumberComponent));
        s0Var.d(new a(inputNumberComponent, kVarD));
        TextInputLayout textInputLayoutA = kVarD.a();
        Intrinsics.checkNotNullExpressionValue(textInputLayoutA, "getRoot(...)");
        return textInputLayoutA;
    }
}
