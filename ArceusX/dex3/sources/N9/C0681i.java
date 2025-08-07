package n9;

import android.view.View;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "old", "new", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "Ln9/s0;", "uiComponentHelper", "Landroid/view/View;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;Ln9/s0;)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0681i {
    public static final View a(@NotNull CreatePersonaSheetComponent createPersonaSheetComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(createPersonaSheetComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        return null;
    }

    @NotNull
    public static final CreatePersonaSheetComponent b(@NotNull CreatePersonaSheetComponent createPersonaSheetComponent, @NotNull UiComponent uiComponent, @NotNull UiComponent uiComponent2) {
        Intrinsics.checkNotNullParameter(createPersonaSheetComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponent, "old");
        Intrinsics.checkNotNullParameter(uiComponent2, "new");
        UiComponentScreen screen = createPersonaSheetComponent.getScreen();
        List<UiComponent> components = createPersonaSheetComponent.getScreen().getComponents();
        return createPersonaSheetComponent.a((207 & 1) != 0 ? createPersonaSheetComponent.config : null, (207 & 2) != 0 ? createPersonaSheetComponent.ctaCard : null, (207 & 4) != 0 ? createPersonaSheetComponent.url : null, (207 & 8) != 0 ? createPersonaSheetComponent.autoCompleteOnDismiss : false, (207 & 16) != 0 ? createPersonaSheetComponent.shown : false, (207 & 32) != 0 ? createPersonaSheetComponent.showing : false, (207 & 64) != 0 ? createPersonaSheetComponent.hideWhenTappedOutside : false, (207 & 128) != 0 ? createPersonaSheetComponent.screen : UiComponentScreen.b(screen, components != null ? com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, uiComponent2) : null, null, 2, null));
    }
}
