package n9;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponent;
import j9.C0608k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;", "Ln9/s0;", "uiComponentHelper", "Lcom/squareup/workflow1/ui/r;", "textController", "Lcom/google/android/material/textfield/TextInputLayout;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;Ln9/s0;Lcom/squareup/workflow1/ui/r;)Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;", "", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;)I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;", "", "d", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;)Ljava/lang/String;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class V {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;
        public static final int[] b;

        static {
            int[] iArr = new int[InputText.InputType.values().length];
            try {
                iArr[InputText.InputType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputText.InputType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputText.InputType.NUMBER_PAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[InputText.AutofillHint.values().length];
            try {
                iArr2[InputText.AutofillHint.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputText.AutofillHint.NAME_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InputText.AutofillHint.NAME_MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InputText.AutofillHint.NAME_LAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InputText.AutofillHint.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[InputText.AutofillHint.ADDRESS_LINE_1.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[InputText.AutofillHint.ADDRESS_LINE_2.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[InputText.AutofillHint.CITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[InputText.AutofillHint.COUNTRY.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[InputText.AutofillHint.POSTAL_CODE.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InputTextComponent d;
        final q9.o e;

        b(InputTextComponent inputTextComponent, q9.o oVar) {
            super(0);
            this.d = inputTextComponent;
            this.e = oVar;
        }

        public Object invoke() {
            m629invoke();
            return Unit.a;
        }

        public final void m629invoke() {
            InputTextBasedComponentStyle styles = this.d.e().getStyles();
            if (styles != null) {
                TextInputLayout textInputLayout = this.e.c;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "inputLayout");
                s9.t.j(textInputLayout, styles);
            }
        }
    }

    @NotNull
    public static final TextInputLayout a(@NotNull InputTextComponent inputTextComponent, @NotNull s0 s0Var, @NotNull com.squareup.workflow1.ui.r rVar) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(inputTextComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(rVar, "textController");
        q9.o oVarD = q9.o.d(s0Var.getLayoutInflater());
        TextInputEditText textInputEditText = oVarD.b;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "editText");
        com.squareup.workflow1.ui.s.b(rVar, textInputEditText);
        InputText.Attributes attributes = inputTextComponent.e().getAttributes();
        if (attributes != null) {
            String label = attributes.getLabel();
            if (label != null) {
                oVarD.c.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                oVarD.c.setPlaceholderText(placeholder);
                TextInputLayout textInputLayout = oVarD.c;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "inputLayout");
                C0608k.a(textInputLayout);
            }
            oVarD.b.setInputType(c(attributes.getInputType()));
            InputText.AutofillHint autofillHint = attributes.getAutofillHint();
            oVarD.c.setAutofillHints(autofillHint != null ? d(autofillHint) : null);
        }
        s0Var.d(new b(inputTextComponent, oVarD));
        TextInputLayout textInputLayoutA = oVarD.a();
        Intrinsics.checkNotNullExpressionValue(textInputLayoutA, "getRoot(...)");
        return textInputLayoutA;
    }

    public static TextInputLayout b(InputTextComponent inputTextComponent, s0 s0Var, com.squareup.workflow1.ui.r rVar, int i, Object obj) {
        if ((i & 2) != 0) {
            rVar = inputTextComponent.getTextController();
        }
        return a(inputTextComponent, s0Var, rVar);
    }

    private static final int c(InputText.InputType inputType) throws P9.m {
        int i = a.a[inputType.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 32;
        }
        if (i == 3) {
            return 2;
        }
        throw new P9.m();
    }

    private static final String d(InputText.AutofillHint autofillHint) throws P9.m {
        switch (a.b[autofillHint.ordinal()]) {
            case 1:
                return "personName";
            case 2:
                return "personGivenName";
            case 3:
                return "personMiddleName";
            case 4:
                return "personFamilyName";
            case 5:
                return "emailAddress";
            case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                return "streetAddress";
            case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                return "extendedAddress";
            case R.styleable.LottieAnimationView_lottie_loop:
                return "addressLocality";
            case R.styleable.LottieAnimationView_lottie_progress:
                return "addressCountry";
            case R.styleable.LottieAnimationView_lottie_rawRes:
                return "postalCode";
            default:
                throw new P9.m();
        }
    }
}
