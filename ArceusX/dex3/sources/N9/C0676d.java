package n9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Branding;
import com.withpersona.sdk2.inquiry.steps.ui.components.BrandingComponent;
import ha.C0468m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/BrandingComponent;", "Ln9/s0;", "uiComponentHelper", "Landroid/view/View;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/BrandingComponent;Ln9/s0;)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0676d {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ShapeableImageView d;

        a(ShapeableImageView shapeableImageView) {
            super(0);
            this.d = shapeableImageView;
        }

        public Object invoke() {
            m666invoke();
            return Unit.a;
        }

        public final void m666invoke() {
            ShapeableImageView shapeableImageView = this.d;
            ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.z = 1.0f;
            ((ViewGroup.MarginLayoutParams) bVar).width = -2;
            ((ViewGroup.MarginLayoutParams) bVar).height = -2;
            shapeableImageView.setLayoutParams(bVar);
        }
    }

    public static final View a(@NotNull BrandingComponent brandingComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(brandingComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        Branding.Attributes attributes = brandingComponent.e().getAttributes();
        boolean zB = attributes != null ? Intrinsics.b(attributes.getHideLogo(), Boolean.TRUE) : false;
        Context context = s0Var.getContext();
        if (zB) {
            return null;
        }
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setImageResource(l9.c.b);
        shapeableImageView.setAdjustViewBounds(true);
        int dimension = (int) context.getResources().getDimension(C0468m.b);
        shapeableImageView.setPadding(dimension, shapeableImageView.getPaddingTop(), dimension, shapeableImageView.getPaddingBottom());
        s0Var.d(new a(shapeableImageView));
        return shapeableImageView;
    }
}
