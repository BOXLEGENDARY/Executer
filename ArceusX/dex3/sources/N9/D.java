package n9;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponent;
import j9.C0608k;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "Ln9/s0;", "uiComponentHelper", "Lcom/google/android/material/textfield/TextInputLayout;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;Ln9/s0;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class D {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InputCurrencyComponent d;
        final q9.k e;

        a(InputCurrencyComponent inputCurrencyComponent, q9.k kVar) {
            super(0);
            this.d = inputCurrencyComponent;
            this.e = kVar;
        }

        public Object invoke() {
            m618invoke();
            return Unit.a;
        }

        public final void m618invoke() {
            InputTextBasedComponentStyle styles = this.d.e().getStyles();
            if (styles != null) {
                TextInputLayout textInputLayout = this.e.c;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "inputLayout");
                s9.t.j(textInputLayout, styles);
            }
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"n9/D$b", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b implements TextWatcher {
        final kotlin.jvm.internal.y<String> d;
        final q9.k e;
        final Currency i;
        final NumberFormat v;
        final NumberFormat w;
        final InputCurrencyComponent y;

        b(kotlin.jvm.internal.y<String> yVar, q9.k kVar, Currency currency, NumberFormat numberFormat, NumberFormat numberFormat2, InputCurrencyComponent inputCurrencyComponent) {
            this.d = yVar;
            this.e = kVar;
            this.i = currency;
            this.v = numberFormat;
            this.w = numberFormat2;
            this.y = inputCurrencyComponent;
        }

        @Override
        public void afterTextChanged(Editable s) throws IOException, ParseException {
            if (Intrinsics.b(String.valueOf(s), this.d.d) || s == null || StringsKt.Y(s)) {
                return;
            }
            this.e.b.removeTextChangedListener(this);
            String strQuote = Pattern.quote(this.i.getSymbol());
            Intrinsics.checkNotNullExpressionValue(strQuote, "quote(...)");
            String strReplace = new Regex(strQuote).replace(s, "");
            StringBuilder sb = new StringBuilder();
            int length = strReplace.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = strReplace.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Number number = this.v.parse(string);
            if (number != null) {
                double dDoubleValue = number.doubleValue() / 100.0d;
                String str = this.w.format(dDoubleValue);
                this.d.d = str;
                this.e.b.setText(str);
                this.e.b.setSelection(str.length());
                this.e.b.addTextChangedListener(this);
                this.y.getNumberController().c(Double.valueOf(dDoubleValue));
            }
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    }

    @NotNull
    public static final TextInputLayout a(@NotNull InputCurrencyComponent inputCurrencyComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(inputCurrencyComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        q9.k kVarD = q9.k.d(s0Var.getLayoutInflater());
        InputCurrency.Attributes attributes = inputCurrencyComponent.e().getAttributes();
        String str = "USD";
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
            String currencyCode = attributes.getCurrencyCode();
            if (currencyCode != null) {
                str = currencyCode;
            }
        }
        Currency currency = Currency.getInstance(str);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(currency);
        NumberFormat numberFormat = NumberFormat.getInstance();
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        Editable text = kVarD.b.getText();
        yVar.d = text != null ? text.toString() : null;
        b bVar = new b(yVar, kVarD, currency, numberFormat, currencyInstance, inputCurrencyComponent);
        if (inputCurrencyComponent.getValue() != null) {
            try {
                kVarD.b.setText(currencyInstance.format(inputCurrencyComponent.getValue().doubleValue()));
            } catch (Exception unused) {
            }
        }
        kVarD.b.addTextChangedListener(bVar);
        s0Var.d(new a(inputCurrencyComponent, kVarD));
        TextInputLayout textInputLayoutA = kVarD.a();
        Intrinsics.checkNotNullExpressionValue(textInputLayoutA, "getRoot(...)");
        return textInputLayoutA;
    }
}
