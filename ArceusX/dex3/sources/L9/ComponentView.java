package l9;

import android.view.View;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Ll9/a;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "component", "Landroid/view/View;", "view", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V", "a", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "b", "()Landroid/view/View;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "c", "Landroid/view/View;", "d", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class ComponentView {

    @NotNull
    private final UiComponent component;

    @NotNull
    private final View view;

    public ComponentView(@NotNull UiComponent uiComponent, @NotNull View view) {
        Intrinsics.checkNotNullParameter(uiComponent, "component");
        Intrinsics.checkNotNullParameter(view, "view");
        this.component = uiComponent;
        this.view = view;
    }

    @NotNull
    public final UiComponent getComponent() {
        return this.component;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @NotNull
    public final UiComponent c() {
        return this.component;
    }

    @NotNull
    public final View d() {
        return this.view;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComponentView)) {
            return false;
        }
        ComponentView componentView = (ComponentView) other;
        return Intrinsics.b(this.component, componentView.component) && Intrinsics.b(this.view, componentView.view);
    }

    public int hashCode() {
        return (this.component.hashCode() * 31) + this.view.hashCode();
    }

    @NotNull
    public String toString() {
        return "ComponentView(component=" + this.component + ", view=" + this.view + ")";
    }
}
