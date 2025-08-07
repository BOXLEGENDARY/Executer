package l9;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.steps.ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b {
    @NotNull
    public static final UiComponentScreen a(@NotNull NestedUiStep nestedUiStep) {
        Intrinsics.checkNotNullParameter(nestedUiStep, "<this>");
        return new UiComponentScreen(nestedUiStep.getComponents(), nestedUiStep.getStyles());
    }
}
