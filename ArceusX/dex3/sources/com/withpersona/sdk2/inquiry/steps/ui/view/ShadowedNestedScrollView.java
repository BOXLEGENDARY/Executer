package com.withpersona.sdk2.inquiry.steps.ui.view;

import S8.g;
import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getSolidColor", "()I", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class ShadowedNestedScrollView extends NestedScrollView {
    public ShadowedNestedScrollView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public int getSolidColor() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] iArr = g.h;
        Intrinsics.checkNotNullExpressionValue(iArr, "Theme");
        return context.obtainStyledAttributes(null, iArr, 0, 0).getColor(g.i, -3355444);
    }
}
