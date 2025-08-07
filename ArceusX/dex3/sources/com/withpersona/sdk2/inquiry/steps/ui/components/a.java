package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.r;
import com.squareup.workflow1.ui.s;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.text.StringsKt;
import n9.K;
import n9.MaskTextInputState;
import n9.s0;
import org.jetbrains.annotations.NotNull;
import q9.p;
import s9.f;
import s9.t;
import s9.v;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001aS\u0010\u0017\u001a\u00020\u0010*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$b;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "h", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$b;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$d;", "i", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$d;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "Ln9/s0;", "uiComponentHelper", "Landroidx/constraintlayout/widget/ConstraintLayout;", "g", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;Ln9/s0;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Lq9/p;", "binding", "Lkotlin/Function0;", "", "onCountryInputClick", "onIdTypeInputClick", "", "countryError", "idTypeError", "valueError", "j", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;Lq9/p;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0182a extends l implements Function0<Unit> {
        final InputInternationalDbComponent d;
        final p e;

        C0182a(InputInternationalDbComponent inputInternationalDbComponent, p pVar) {
            super(0);
            this.d = inputInternationalDbComponent;
            this.e = pVar;
        }

        public Object invoke() {
            m593invoke();
            return Unit.a;
        }

        public final void m593invoke() {
            InputInternationalDb.InputInternationalDbComponentStyle styles = this.d.c().getStyles();
            if (styles != null) {
                p pVar = this.e;
                InputSelectComponentStyle inputSelectStyle = styles.getInputSelectStyle();
                if (inputSelectStyle != null) {
                    TextInputLayout textInputLayout = pVar.c;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout, "idbCountryInput");
                    f.b(textInputLayout, inputSelectStyle);
                    TextInputLayout textInputLayout2 = pVar.f;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout2, "idbIdTypeInput");
                    f.b(textInputLayout2, inputSelectStyle);
                }
                InputTextBasedComponentStyle inputTextStyle = styles.getInputTextStyle();
                if (inputTextStyle != null) {
                    TextInputLayout textInputLayout3 = pVar.i;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout3, "idbValueInput");
                    t.j(textInputLayout3, inputTextStyle);
                }
                TextBasedComponentStyle textStyle = styles.getTextStyle();
                if (textStyle != null) {
                    TextView textView = pVar.e;
                    Intrinsics.checkNotNullExpressionValue(textView, "idbDescription");
                    v.e(textView, textStyle);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends l implements Function1<Option, CharSequence> {
        public static final b d = new b();

        b() {
            super(1);
        }

        @NotNull
        public final CharSequence invoke(@NotNull Option option) {
            Intrinsics.checkNotNullParameter(option, "it");
            return option.getText();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends l implements Function1<Option, CharSequence> {
        public static final c d = new c();

        c() {
            super(1);
        }

        @NotNull
        public final CharSequence invoke(@NotNull Option option) {
            Intrinsics.checkNotNullParameter(option, "it");
            return option.getText();
        }
    }

    @NotNull
    public static final ConstraintLayout g(@NotNull InputInternationalDbComponent inputInternationalDbComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(inputInternationalDbComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        p pVarD = p.d(s0Var.getLayoutInflater());
        InputInternationalDb.Attributes attributes = inputInternationalDbComponent.c().getAttributes();
        pVarD.h.setText(attributes != null ? attributes.getLabel() : null);
        pVarD.c.setHint(attributes != null ? attributes.getLabelIdbCountry() : null);
        pVarD.f.setHint(attributes != null ? attributes.getLabelIdbType() : null);
        pVarD.i.setHint(attributes != null ? attributes.getLabelIdbValue() : null);
        EditText editText = pVarD.i.getEditText();
        if (editText != null) {
            r rVarQ = inputInternationalDbComponent.q();
            Intrinsics.d(editText);
            s.b(rVarQ, editText);
        }
        s0Var.d(new C0182a(inputInternationalDbComponent, pVarD));
        pVarD.a().setTag(pVarD);
        ConstraintLayout constraintLayoutA = pVarD.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
        return constraintLayoutA;
    }

    public static final Option h(InputInternationalDbComponent.b bVar) {
        return new Option(bVar.b(), bVar.a());
    }

    public static final Option i(InputInternationalDbComponent.d dVar) {
        return new Option(dVar.b(), dVar.a());
    }

    public static final void j(@NotNull InputInternationalDbComponent inputInternationalDbComponent, @NotNull p pVar, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, String str, String str2, String str3) {
        InputInternationalDb.IdType idType;
        List<InputInternationalDb.IdType> allowedIdTypes;
        Object next;
        Intrinsics.checkNotNullParameter(inputInternationalDbComponent, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "binding");
        Intrinsics.checkNotNullParameter(function0, "onCountryInputClick");
        Intrinsics.checkNotNullParameter(function02, "onIdTypeInputClick");
        EditText editText = pVar.c.getEditText();
        if (editText != null) {
            editText.setText(CollectionsKt.U(inputInternationalDbComponent.f().b(), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, b.d, 30, (Object) null));
        }
        EditText editText2 = pVar.f.getEditText();
        if (editText2 != null) {
            editText2.setText(CollectionsKt.U(inputInternationalDbComponent.n().b(), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, c.d, 30, (Object) null));
        }
        InputInternationalDb.Attributes attributes = inputInternationalDbComponent.c().getAttributes();
        String strR = inputInternationalDbComponent.r();
        String strS = inputInternationalDbComponent.s();
        List<InputInternationalDbComponent.b> listD = inputInternationalDbComponent.d();
        List<InputInternationalDbComponent.d> listL = inputInternationalDbComponent.l();
        boolean zH = inputInternationalDbComponent.h();
        boolean zK = inputInternationalDbComponent.k();
        boolean z = true;
        if (strR == null) {
            pVar.f.setEnabled(false);
        } else {
            pVar.f.setEnabled(true);
        }
        if (strR == null && listD != null && listD.size() == 1) {
            inputInternationalDbComponent.f().c(CollectionsKt.d(h((InputInternationalDbComponent.b) CollectionsKt.M(listD))));
            if (attributes != null ? Intrinsics.b(attributes.getHideCountryIfSingleChoice(), Boolean.TRUE) : false) {
                zH = true;
            }
        }
        if (strR != null) {
            if (listL != null && listL.size() == 1) {
                inputInternationalDbComponent.n().c(CollectionsKt.d(i((InputInternationalDbComponent.d) CollectionsKt.M(listL))));
                if (attributes != null ? Intrinsics.b(attributes.getHideTypeIfSingleChoice(), Boolean.TRUE) : false) {
                    zK = true;
                }
            }
        }
        pVar.c.setVisibility(zH ? 8 : 0);
        pVar.f.setVisibility(zK ? 8 : 0);
        if (strR == null || strS == null) {
            pVar.i.setEnabled(false);
            pVar.e.setVisibility(8);
        } else {
            pVar.i.setEnabled(true);
            InputInternationalDb.Attributes attributes2 = inputInternationalDbComponent.c().getAttributes();
            if (attributes2 == null || (allowedIdTypes = attributes2.getAllowedIdTypes()) == null) {
                idType = null;
            } else {
                Iterator<T> it = allowedIdTypes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    InputInternationalDb.IdType idType2 = (InputInternationalDb.IdType) next;
                    if (Intrinsics.b(idType2.getCountryCode(), strR) && Intrinsics.b(idType2.getIdType(), strS)) {
                        break;
                    }
                }
                idType = (InputInternationalDb.IdType) next;
            }
            TextInputLayout textInputLayout = pVar.i;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "idbValueInput");
            K.c(textInputLayout, new MaskTextInputState(null, idType != null ? idType.getMask() : null, idType != null ? idType.getSecure() : null, null, idType != null ? idType.getPlaceholder() : null));
            String description = idType != null ? idType.getDescription() : null;
            if (description != null && !StringsKt.Y(description)) {
                z = false;
            }
            if (z) {
                pVar.e.setVisibility(8);
            } else {
                pVar.e.setVisibility(0);
                pVar.e.setText(idType != null ? idType.getDescription() : null);
            }
        }
        pVar.c.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.steps.ui.components.a.k(function0, view);
            }
        });
        EditText editText3 = pVar.c.getEditText();
        if (editText3 != null) {
            editText3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    com.withpersona.sdk2.inquiry.steps.ui.components.a.l(function0, view);
                }
            });
        }
        pVar.f.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.steps.ui.components.a.m(function02, view);
            }
        });
        EditText editText4 = pVar.f.getEditText();
        if (editText4 != null) {
            editText4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    com.withpersona.sdk2.inquiry.steps.ui.components.a.n(function02, view);
                }
            });
        }
        pVar.c.setError(str);
        pVar.f.setError(str2);
        pVar.i.setError(str3);
    }

    public static final void k(Function0 function0, View view) {
        Intrinsics.checkNotNullParameter(function0, "$onCountryInputClick");
        function0.invoke();
    }

    public static final void l(Function0 function0, View view) {
        Intrinsics.checkNotNullParameter(function0, "$onCountryInputClick");
        function0.invoke();
    }

    public static final void m(Function0 function0, View view) {
        Intrinsics.checkNotNullParameter(function0, "$onIdTypeInputClick");
        function0.invoke();
    }

    public static final void n(Function0 function0, View view) {
        Intrinsics.checkNotNullParameter(function0, "$onIdTypeInputClick");
        function0.invoke();
    }
}
