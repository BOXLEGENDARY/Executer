package l9;

import android.view.View;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll9/f;", "", "Ll9/g;", "viewBindings", "Landroid/view/View;", "contentView", "footerView", "<init>", "(Ll9/g;Landroid/view/View;Landroid/view/View;)V", "a", "Ll9/g;", "c", "()Ll9/g;", "b", "Landroid/view/View;", "()Landroid/view/View;", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class f {

    @NotNull
    private final g viewBindings;

    @NotNull
    private final View contentView;

    private final View footerView;

    public f(@NotNull g gVar, @NotNull View view, View view2) {
        Intrinsics.checkNotNullParameter(gVar, "viewBindings");
        Intrinsics.checkNotNullParameter(view, "contentView");
        this.viewBindings = gVar;
        this.contentView = view;
        this.footerView = view2;
    }

    @NotNull
    public final View getContentView() {
        return this.contentView;
    }

    public final View getFooterView() {
        return this.footerView;
    }

    @NotNull
    public final g getViewBindings() {
        return this.viewBindings;
    }
}
