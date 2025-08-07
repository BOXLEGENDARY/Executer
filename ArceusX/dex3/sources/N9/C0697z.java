package n9;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.OptionWithDescription;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ka.C0730g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;", "Ln9/s0;", "uiComponentHelper", "Landroid/widget/LinearLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;Ln9/s0;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0697z {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InputCheckboxGroupComponent d;
        final q9.j e;

        a(InputCheckboxGroupComponent inputCheckboxGroupComponent, q9.j jVar) {
            super(0);
            this.d = inputCheckboxGroupComponent;
            this.e = jVar;
        }

        public Object invoke() {
            m686invoke();
            return Unit.a;
        }

        public final void m686invoke() {
            TextBasedComponentStyle textBasedStyle;
            InputCheckbox.InputCheckboxComponentStyle styles = this.d.e().getStyles();
            if (styles == null || (textBasedStyle = styles.getTextBasedStyle()) == null) {
                return;
            }
            TextView textView = this.e.d;
            Intrinsics.checkNotNullExpressionValue(textView, "checkboxGroupLabel");
            s9.v.e(textView, textBasedStyle);
        }
    }

    @NotNull
    public static final LinearLayout b(@NotNull final InputCheckboxGroupComponent inputCheckboxGroupComponent, @NotNull s0 s0Var) {
        List<OptionWithDescription> listJ;
        TextBasedComponentStyle errorTextStyle;
        List<String> prefill;
        Intrinsics.checkNotNullParameter(inputCheckboxGroupComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        q9.j jVarD = q9.j.d(s0Var.getLayoutInflater());
        InputCheckboxGroup.Attributes attributes = inputCheckboxGroupComponent.e().getAttributes();
        final ArrayList arrayList = new ArrayList();
        Set setV0 = (attributes == null || (prefill = attributes.getPrefill()) == null) ? null : CollectionsKt.v0(prefill);
        if (attributes == null || (listJ = attributes.getOptions()) == null) {
            listJ = CollectionsKt.j();
        }
        for (OptionWithDescription optionWithDescription : listJ) {
            InputCheckboxComponent inputCheckboxComponent = new InputCheckboxComponent(new InputCheckbox(optionWithDescription.getValue(), new InputCheckbox.Attributes(Boolean.valueOf(setV0 != null && setV0.contains(optionWithDescription.getValue())), optionWithDescription.getText(), optionWithDescription.getDescriptionText(), attributes != null ? attributes.getHidden() : null, attributes != null ? attributes.getDisabled() : null), inputCheckboxGroupComponent.e().getStyles()), setV0 != null && setV0.contains(optionWithDescription.getValue()));
            q9.i iVarE = q9.i.e(s0Var.getLayoutInflater(), jVarD.b, false);
            Intrinsics.checkNotNullExpressionValue(iVarE, "inflate(...)");
            jVarD.b.addView(C0695x.d(inputCheckboxComponent, s0Var, iVarE));
            iVarE.b.setTag(optionWithDescription.getValue());
            if (inputCheckboxGroupComponent.getStringSetController().b().contains(optionWithDescription.getValue())) {
                iVarE.b.setChecked(true);
            }
            MaterialCheckBox materialCheckBox = iVarE.b;
            Intrinsics.checkNotNullExpressionValue(materialCheckBox, "checkbox");
            arrayList.add(materialCheckBox);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((MaterialCheckBox) it.next()).c(new MaterialCheckBox.b() {
                public final void a(MaterialCheckBox materialCheckBox2, int i) {
                    C0697z.c(inputCheckboxGroupComponent, arrayList, materialCheckBox2, i);
                }
            });
        }
        InputCheckbox.InputCheckboxComponentStyle styles = inputCheckboxGroupComponent.e().getStyles();
        if (styles != null && (errorTextStyle = styles.getErrorTextStyle()) != null) {
            TextView textView = jVarD.c;
            Intrinsics.checkNotNullExpressionValue(textView, "checkboxGroupError");
            s9.v.e(textView, errorTextStyle);
        }
        String label = attributes != null ? attributes.getLabel() : null;
        if (label == null || label.length() == 0) {
            jVarD.d.setVisibility(8);
        } else {
            jVarD.d.setVisibility(0);
            jVarD.d.setText(label);
            s0Var.d(new a(inputCheckboxGroupComponent, jVarD));
        }
        jVarD.a().setTag(jVarD);
        LinearLayout linearLayoutA = jVarD.a();
        Intrinsics.checkNotNullExpressionValue(linearLayoutA, "getRoot(...)");
        return linearLayoutA;
    }

    public static final void c(InputCheckboxGroupComponent inputCheckboxGroupComponent, List list, MaterialCheckBox materialCheckBox, int i) {
        Intrinsics.checkNotNullParameter(inputCheckboxGroupComponent, "$this_makeView");
        Intrinsics.checkNotNullParameter(list, "$allCheckboxes");
        Intrinsics.checkNotNullParameter(materialCheckBox, "checkBox");
        d(inputCheckboxGroupComponent, list);
    }

    private static final void d(InputCheckboxGroupComponent inputCheckboxGroupComponent, List<MaterialCheckBox> list) {
        String str;
        C0730g stringSetController = inputCheckboxGroupComponent.getStringSetController();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MaterialCheckBox materialCheckBox : list) {
            if (materialCheckBox.isChecked()) {
                Object tag = materialCheckBox.getTag();
                Intrinsics.e(tag, "null cannot be cast to non-null type kotlin.String");
                str = (String) tag;
            } else {
                str = null;
            }
            if (str != null) {
                linkedHashSet.add(str);
            }
        }
        stringSetController.c(linkedHashSet);
    }
}
