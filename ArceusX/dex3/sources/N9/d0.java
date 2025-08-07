package n9;

import android.widget.TextView;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.PrivacyPolicyComponent;
import ka.C0726c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/PrivacyPolicyComponent;", "Ln9/s0;", "uiComponentHelper", "Landroid/widget/TextView;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/PrivacyPolicyComponent;Ln9/s0;)Landroid/widget/TextView;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class d0 {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final PrivacyPolicyComponent d;
        final q9.t e;

        a(PrivacyPolicyComponent privacyPolicyComponent, q9.t tVar) {
            super(0);
            this.d = privacyPolicyComponent;
            this.e = tVar;
        }

        public Object invoke() {
            m667invoke();
            return Unit.a;
        }

        public final void m667invoke() {
            TextBasedComponentStyle styles = this.d.e().getStyles();
            if (styles != null) {
                TextView textView = this.e.b;
                Intrinsics.checkNotNullExpressionValue(textView, "textView");
                s9.v.e(textView, styles);
            }
        }
    }

    @NotNull
    public static final TextView a(@NotNull PrivacyPolicyComponent privacyPolicyComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(privacyPolicyComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        q9.t tVarD = q9.t.d(s0Var.getLayoutInflater());
        PrivacyPolicy.Attributes attributes = privacyPolicyComponent.e().getAttributes();
        if (attributes != null) {
            TextView textView = tVarD.b;
            Intrinsics.checkNotNullExpressionValue(textView, "textView");
            C0726c.c(textView, attributes.getText());
            s0Var.d(new a(privacyPolicyComponent, tVarD));
        }
        TextView textViewA = tVarD.a();
        Intrinsics.checkNotNullExpressionValue(textViewA, "getRoot(...)");
        return textViewA;
    }
}
