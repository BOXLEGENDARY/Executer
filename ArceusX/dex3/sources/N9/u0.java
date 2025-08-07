package n9;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "Ln9/s0;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;Ln9/s0;)Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class u0 {
    public static final ButtonWithLoadingIndicator a(@NotNull VerifyPersonaButtonComponent verifyPersonaButtonComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(verifyPersonaButtonComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        VerifyPersonaButton.Attributes attributes = verifyPersonaButtonComponent.e().getAttributes();
        if ((attributes != null ? attributes.getUrl() : null) != null) {
            return com.withpersona.sdk2.inquiry.steps.ui.components.b.c(verifyPersonaButtonComponent, s0Var);
        }
        return null;
    }
}
