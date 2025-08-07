package n9;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.OptionWithDescription;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0726c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;", "Ln9/s0;", "uiComponentHelper", "Landroid/widget/LinearLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;Ln9/s0;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class Q {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InputRadioGroupComponent d;
        final q9.b e;

        a(InputRadioGroupComponent inputRadioGroupComponent, q9.b bVar) {
            super(0);
            this.d = inputRadioGroupComponent;
            this.e = bVar;
        }

        public Object invoke() {
            m624invoke();
            return Unit.a;
        }

        public final void m624invoke() {
            TextBasedComponentStyle descriptionTextStyle;
            TextBasedComponentStyle textBasedStyle;
            InputRadioGroup.InputRadioGroupComponentStyle styles = this.d.e().getStyles();
            if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
                TextView textView = this.e.d;
                Intrinsics.checkNotNullExpressionValue(textView, "radioButtonLabel");
                s9.v.e(textView, textBasedStyle);
            }
            InputRadioGroup.InputRadioGroupComponentStyle styles2 = this.d.e().getStyles();
            if (styles2 != null && (descriptionTextStyle = styles2.getDescriptionTextStyle()) != null) {
                TextView textView2 = this.e.c;
                Intrinsics.checkNotNullExpressionValue(textView2, "radioButtonDescription");
                s9.v.e(textView2, descriptionTextStyle);
            }
            q9.b bVar = this.e;
            bVar.b.setButtonTintList(ColorStateList.valueOf(androidx.core.graphics.a.l(bVar.d.getCurrentTextColor(), 150)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InputRadioGroupComponent d;
        final q9.m e;

        b(InputRadioGroupComponent inputRadioGroupComponent, q9.m mVar) {
            super(0);
            this.d = inputRadioGroupComponent;
            this.e = mVar;
        }

        public Object invoke() {
            m625invoke();
            return Unit.a;
        }

        public final void m625invoke() {
            TextBasedComponentStyle textBasedStyle;
            InputRadioGroup.InputRadioGroupComponentStyle styles = this.d.e().getStyles();
            if (styles == null || (textBasedStyle = styles.getTextBasedStyle()) == null) {
                return;
            }
            TextView textView = this.e.d;
            Intrinsics.checkNotNullExpressionValue(textView, "radioGroupLabel");
            s9.v.e(textView, textBasedStyle);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.l implements Function0<Unit> {
        final InputRadioGroupComponent d;
        final q9.m e;

        c(InputRadioGroupComponent inputRadioGroupComponent, q9.m mVar) {
            super(0);
            this.d = inputRadioGroupComponent;
            this.e = mVar;
        }

        public Object invoke() {
            m626invoke();
            return Unit.a;
        }

        public final void m626invoke() {
            StyleElements.SizeSet margins;
            InputRadioGroup.InputRadioGroupComponentStyle styles = this.d.e().getStyles();
            if (styles == null || (margins = styles.getMargins()) == null) {
                return;
            }
            LinearLayout linearLayoutA = this.e.a();
            Intrinsics.checkNotNullExpressionValue(linearLayoutA, "getRoot(...)");
            u9.d.c(linearLayoutA, margins);
        }
    }

    @NotNull
    public static final LinearLayout c(@NotNull final InputRadioGroupComponent inputRadioGroupComponent, @NotNull s0 s0Var) {
        List<OptionWithDescription> listJ;
        TextBasedComponentStyle errorTextStyle;
        Intrinsics.checkNotNullParameter(inputRadioGroupComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        q9.m mVarD = q9.m.d(s0Var.getLayoutInflater());
        InputRadioGroup.Attributes attributes = inputRadioGroupComponent.e().getAttributes();
        final ArrayList arrayList = new ArrayList();
        if (attributes == null || (listJ = attributes.getOptions()) == null) {
            listJ = CollectionsKt.j();
        }
        for (final OptionWithDescription optionWithDescription : listJ) {
            final q9.b bVarD = q9.b.d(s0Var.getLayoutInflater(), mVarD.a(), false);
            TextView textView = bVarD.d;
            Intrinsics.checkNotNullExpressionValue(textView, "radioButtonLabel");
            C0726c.c(textView, optionWithDescription.getText());
            String descriptionText = optionWithDescription.getDescriptionText();
            if (descriptionText == null || StringsKt.Y(descriptionText)) {
                bVarD.c.setVisibility(8);
            } else {
                bVarD.c.setVisibility(0);
                TextView textView2 = bVarD.c;
                Intrinsics.checkNotNullExpressionValue(textView2, "radioButtonDescription");
                C0726c.c(textView2, descriptionText);
            }
            s0Var.d(new a(inputRadioGroupComponent, bVarD));
            bVarD.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Q.d(arrayList, inputRadioGroupComponent, optionWithDescription, compoundButton, z);
                }
            });
            bVarD.a().setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    Q.e(bVarD, view);
                }
            });
            mVarD.b.addView(bVarD.a());
            MaterialRadioButton materialRadioButton = bVarD.b;
            Intrinsics.checkNotNullExpressionValue(materialRadioButton, "radioButton");
            arrayList.add(materialRadioButton);
            if (Intrinsics.b(inputRadioGroupComponent.getTextController().b(), optionWithDescription.getValue())) {
                bVarD.b.setChecked(true);
            }
        }
        InputRadioGroup.InputRadioGroupComponentStyle styles = inputRadioGroupComponent.e().getStyles();
        if (styles != null && (errorTextStyle = styles.getErrorTextStyle()) != null) {
            TextView textView3 = mVarD.c;
            Intrinsics.checkNotNullExpressionValue(textView3, "radioGroupError");
            s9.v.e(textView3, errorTextStyle);
        }
        String label = attributes != null ? attributes.getLabel() : null;
        if (label == null || label.length() == 0) {
            mVarD.d.setVisibility(8);
        } else {
            mVarD.d.setVisibility(0);
            mVarD.d.setText(label);
            s0Var.d(new b(inputRadioGroupComponent, mVarD));
        }
        s0Var.d(new c(inputRadioGroupComponent, mVarD));
        mVarD.a().setTag(mVarD);
        LinearLayout linearLayoutA = mVarD.a();
        Intrinsics.checkNotNullExpressionValue(linearLayoutA, "getRoot(...)");
        return linearLayoutA;
    }

    public static final void d(List list, InputRadioGroupComponent inputRadioGroupComponent, OptionWithDescription optionWithDescription, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(list, "$radioButtons");
        Intrinsics.checkNotNullParameter(inputRadioGroupComponent, "$this_makeView");
        Intrinsics.checkNotNullParameter(optionWithDescription, "$option");
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.b((RadioButton) obj, compoundButton)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((RadioButton) it.next()).setChecked(false);
            }
            f(inputRadioGroupComponent, inputRadioGroupComponent.e(), optionWithDescription.getText());
        }
    }

    public static final void e(q9.b bVar, View view) {
        Intrinsics.checkNotNullParameter(bVar, "$this_apply");
        if (bVar.b.isChecked()) {
            return;
        }
        bVar.b.setChecked(true);
    }

    private static final void f(InputRadioGroupComponent inputRadioGroupComponent, InputRadioGroup inputRadioGroup, String str) {
        List<OptionWithDescription> options;
        Object next;
        InputRadioGroup.Attributes attributes = inputRadioGroup.getAttributes();
        String value = null;
        if (attributes != null && (options = attributes.getOptions()) != null) {
            Iterator<T> it = options.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.b(((OptionWithDescription) next).getText(), str)) {
                        break;
                    }
                }
            }
            OptionWithDescription optionWithDescription = (OptionWithDescription) next;
            if (optionWithDescription != null) {
                value = optionWithDescription.getValue();
            }
        }
        if (value != null) {
            inputRadioGroupComponent.getTextController().c(value);
        }
    }
}
