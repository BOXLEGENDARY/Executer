package n9;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponent;
import j9.C0608k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n9.Z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;", "Ln9/s0;", "uiComponentHelper", "Lcom/google/android/material/textfield/TextInputLayout;", "f", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;Ln9/s0;)Lcom/google/android/material/textfield/TextInputLayout;", "Ln9/a0;", "newState", "", "c", "(Lcom/google/android/material/textfield/TextInputLayout;Ln9/a0;)V", "Landroid/text/Editable;", "", "mask", "e", "(Landroid/text/Editable;Ljava/lang/String;)V", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class K {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InputMaskedTextComponent d;
        final q9.u e;

        a(InputMaskedTextComponent inputMaskedTextComponent, q9.u uVar) {
            super(0);
            this.d = inputMaskedTextComponent;
            this.e = uVar;
        }

        public Object invoke() {
            m620invoke();
            return Unit.a;
        }

        public final void m620invoke() {
            InputTextBasedComponentStyle styles = this.d.e().getStyles();
            if (styles != null) {
                TextInputLayout textInputLayoutA = this.e.a();
                Intrinsics.checkNotNullExpressionValue(textInputLayoutA, "getRoot(...)");
                s9.t.j(textInputLayoutA, styles);
            }
        }
    }

    public static final void c(@NotNull final TextInputLayout textInputLayout, @NotNull MaskTextInputState maskTextInputState) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        EditText editText;
        final String mask;
        EditText editText2;
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        Intrinsics.checkNotNullParameter(maskTextInputState, "newState");
        int i = l9.d.b0;
        Object tag = textInputLayout.getTag(i);
        if (Intrinsics.b(tag instanceof MaskTextInputState ? (MaskTextInputState) tag : null, maskTextInputState)) {
            return;
        }
        textInputLayout.setTag(i, maskTextInputState);
        String prefill = maskTextInputState.getPrefill();
        if (prefill != null && (editText2 = textInputLayout.getEditText()) != null) {
            editText2.setText(prefill);
        }
        String label = maskTextInputState.getLabel();
        if (label != null) {
            textInputLayout.setHint(label);
        }
        String placeholder = maskTextInputState.getPlaceholder();
        if (placeholder != null) {
            textInputLayout.setPlaceholderText(placeholder);
            C0608k.a(textInputLayout);
        }
        if (Intrinsics.b(maskTextInputState.getSecure(), Boolean.TRUE) && (mask = maskTextInputState.getMask()) != null) {
            textInputLayout.setEndIconMode(-1);
            textInputLayout.setEndIconDrawable(androidx.core.content.a.e(textInputLayout.getContext(), l9.c.d));
            textInputLayout.setEndIconContentDescription(textInputLayout.getContext().getString(S8.e.R));
            EditText editText3 = textInputLayout.getEditText();
            if (editText3 != null) {
                editText3.setTransformationMethod(new i0(mask));
            }
            textInputLayout.setEndIconOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    K.d(textInputLayout, mask, view);
                }
            });
        }
        int i2 = l9.d.i0;
        Object tag2 = textInputLayout.getTag(i2);
        b0 b0Var = tag2 instanceof b0 ? (b0) tag2 : null;
        if (b0Var != null && (editText = textInputLayout.getEditText()) != null) {
            editText.removeTextChangedListener(b0Var);
        }
        String mask2 = maskTextInputState.getMask();
        if (mask2 == null || StringsKt.Y(mask2)) {
            return;
        }
        b0 b0Var2 = new b0(maskTextInputState.getMask());
        EditText editText4 = textInputLayout.getEditText();
        if (editText4 != null) {
            editText4.addTextChangedListener(b0Var2);
        }
        textInputLayout.setTag(i2, b0Var2);
    }

    public static final void d(TextInputLayout textInputLayout, String str, View view) {
        Intrinsics.checkNotNullParameter(textInputLayout, "$this_bindMaskTextInputState");
        Intrinsics.checkNotNullParameter(str, "$mask");
        EditText editText = textInputLayout.getEditText();
        boolean z = (editText != null ? editText.getTransformationMethod() : null) != null;
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            editText2.setTransformationMethod(z ? null : new i0(str));
        }
        textInputLayout.setEndIconDrawable(androidx.core.content.a.e(textInputLayout.getContext(), z ? l9.c.c : l9.c.d));
    }

    public static final void e(Editable editable, String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            Z zA = Z.INSTANCE.a(cCharAt);
            while (true) {
                if (i < editable.length()) {
                    char cCharAt2 = editable.charAt(i);
                    if (zA.a(cCharAt2)) {
                        sb.append(cCharAt2);
                        i++;
                        break;
                    } else {
                        if (zA instanceof Z.Literal) {
                            sb.append(cCharAt);
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        editable.replace(0, editable.length(), sb);
    }

    @NotNull
    public static final TextInputLayout f(@NotNull InputMaskedTextComponent inputMaskedTextComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(inputMaskedTextComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        q9.u uVarD = q9.u.d(s0Var.getLayoutInflater());
        TextInputLayout textInputLayoutA = uVarD.a();
        Intrinsics.checkNotNullExpressionValue(textInputLayoutA, "getRoot(...)");
        InputMaskedText.Attributes attributes = inputMaskedTextComponent.e().getAttributes();
        String prefill = attributes != null ? attributes.getPrefill() : null;
        InputMaskedText.Attributes attributes2 = inputMaskedTextComponent.e().getAttributes();
        String mask = attributes2 != null ? attributes2.getMask() : null;
        InputMaskedText.Attributes attributes3 = inputMaskedTextComponent.e().getAttributes();
        Boolean secure = attributes3 != null ? attributes3.getSecure() : null;
        InputMaskedText.Attributes attributes4 = inputMaskedTextComponent.e().getAttributes();
        String label = attributes4 != null ? attributes4.getLabel() : null;
        InputMaskedText.Attributes attributes5 = inputMaskedTextComponent.e().getAttributes();
        c(textInputLayoutA, new MaskTextInputState(prefill, mask, secure, label, attributes5 != null ? attributes5.getPlaceholder() : null));
        EditText editText = uVarD.a().getEditText();
        if (editText != null) {
            com.squareup.workflow1.ui.r textController = inputMaskedTextComponent.getTextController();
            Intrinsics.d(editText);
            com.squareup.workflow1.ui.s.b(textController, editText);
        }
        s0Var.d(new a(inputMaskedTextComponent, uVarD));
        TextInputLayout textInputLayoutA2 = uVarD.a();
        Intrinsics.checkNotNullExpressionValue(textInputLayoutA2, "getRoot(...)");
        return textInputLayoutA2;
    }
}
