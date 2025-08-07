package l9;

import com.roblox.client.personasdk.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Ll9/g;", "", "", "", "Ll9/a;", "componentNameToComponentView", "<init>", "(Ljava/util/Map;)V", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class g {

    @NotNull
    private final Map<String, ComponentView> componentNameToComponentView;

    public g(@NotNull Map<String, ComponentView> map) {
        Intrinsics.checkNotNullParameter(map, "componentNameToComponentView");
        this.componentNameToComponentView = map;
    }

    @NotNull
    public final Map<String, ComponentView> a() {
        return this.componentNameToComponentView;
    }
}
