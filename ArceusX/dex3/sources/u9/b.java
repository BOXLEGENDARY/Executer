package u9;

import android.content.Context;
import android.view.View;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n9.InterfaceC0689q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR#\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lu9/b;", "Landroid/view/View;", "Lu9/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "", "", "componentParams", "", "triggeringComponentIsHidden", "", "a", "(Ljava/util/Map;Z)V", "", "Ljava/lang/ref/WeakReference;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "d", "Ljava/util/List;", "getAssociatedComponents", "()Ljava/util/List;", "associatedComponents", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b extends View implements a {

    @NotNull
    private final List<WeakReference<UiComponent>> associatedComponents;

    public b(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.associatedComponents = new ArrayList();
    }

    @Override
    public void a(@NotNull Map<String, ? extends Object> componentParams, boolean triggeringComponentIsHidden) {
        boolean zBooleanValue;
        Boolean value;
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        if (triggeringComponentIsHidden) {
            setVisibility(8);
            return;
        }
        Iterator<T> it = this.associatedComponents.iterator();
        loop0: while (true) {
            zBooleanValue = false;
            while (it.hasNext()) {
                UiComponent uiComponent = (UiComponent) ((WeakReference) it.next()).get();
                JsonLogicBoolean hidden = null;
                InterfaceC0689q interfaceC0689q = uiComponent instanceof InterfaceC0689q ? (InterfaceC0689q) uiComponent : null;
                if (interfaceC0689q != null) {
                    hidden = interfaceC0689q.getHidden();
                }
                if (hidden == null || (value = hidden.getValue(componentParams, uiComponent)) == null) {
                    break;
                } else {
                    zBooleanValue = value.booleanValue();
                }
            }
        }
        setVisibility(zBooleanValue ? 8 : 0);
    }

    @NotNull
    public final List<WeakReference<UiComponent>> getAssociatedComponents() {
        return this.associatedComponents;
    }
}
