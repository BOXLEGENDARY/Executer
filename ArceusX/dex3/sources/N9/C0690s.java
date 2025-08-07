package n9;

import android.widget.ImageView;
import c9.C0488f;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.steps.ui.components.ImagePreviewComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ImagePreviewComponent;", "Ln9/s0;", "uiComponentHelper", "Landroid/widget/ImageView;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ImagePreviewComponent;Ln9/s0;)Landroid/widget/ImageView;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0690s {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0488f d;
        final ImagePreviewComponent e;

        a(C0488f c0488f, ImagePreviewComponent imagePreviewComponent) {
            super(0);
            this.d = c0488f;
            this.e = imagePreviewComponent;
        }

        public Object invoke() throws P9.m {
            m683invoke();
            return Unit.a;
        }

        public final void m683invoke() throws P9.m {
            ImageView imageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            s9.e.b(imageView, this.e.e().getStyles());
        }
    }

    @NotNull
    public static final ImageView a(@NotNull ImagePreviewComponent imagePreviewComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(imagePreviewComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        C0488f c0488fD = C0488f.d(s0Var.getLayoutInflater());
        s0Var.d(new a(c0488fD, imagePreviewComponent));
        ImageView imageViewA = c0488fD.a();
        Intrinsics.checkNotNullExpressionValue(imageViewA, "getRoot(...)");
        return imageViewA;
    }
}
