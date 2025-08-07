package com.withpersona.sdk2.inquiry.steps.ui;

import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.F;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000bR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;", "Landroid/os/Parcelable;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "getComponents", "()Ljava/util/List;", "components", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "a", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface NestedUiStep extends Parcelable {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\r0\f¢\u0006\u0004\b\u000e\u0010\u000fR,\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;", "", "<init>", "()V", "", "actionName", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "cb", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;", "", "Lkotlin/Pair;", "b", "()Ljava/util/List;", "", "Ljava/util/Map;", "componentNameToAction", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {

        @NotNull
        private final Map<String, Function1<UiComponent, Unit>> componentNameToAction = new LinkedHashMap();

        @NotNull
        public final a a(String actionName, @NotNull Function1<? super UiComponent, Unit> cb) {
            Intrinsics.checkNotNullParameter(cb, "cb");
            if (actionName == null) {
                return this;
            }
            this.componentNameToAction.put(actionName, cb);
            return this;
        }

        @NotNull
        public final List<Pair<String, Function1<UiComponent, Unit>>> b() {
            return F.v(this.componentNameToAction);
        }
    }

    List<UiComponent> getComponents();

    StepStyles.UiStepStyle getStyles();
}
