package t9;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.steps.ui.components.b;
import j9.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import n9.g0;
import n9.s0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "", "centerVertical", "Landroid/view/View;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Landroidx/constraintlayout/widget/ConstraintLayout;Z)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0287a extends l implements Function0<Unit> {
        final s0 d;

        C0287a(s0 s0Var) {
            super(0);
            this.d = s0Var;
        }

        public Object invoke() {
            m692invoke();
            return Unit.a;
        }

        public final void m692invoke() {
            this.d.c();
        }
    }

    @NotNull
    public static final View a(@NotNull RemoteImage remoteImage, @NotNull ConstraintLayout constraintLayout, boolean z) {
        Intrinsics.checkNotNullParameter(remoteImage, "<this>");
        Intrinsics.checkNotNullParameter(constraintLayout, "container");
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        s0 s0Var = new s0(context);
        View viewI = g0.i(b.f(remoteImage), s0Var);
        constraintLayout.addView(viewI);
        ConstraintLayout.b layoutParams = viewI.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = layoutParams;
        bVar.h = 0;
        bVar.q = 0;
        bVar.s = 0;
        if (z) {
            bVar.k = 0;
        }
        viewI.setLayoutParams(bVar);
        o.b(constraintLayout, new C0287a(s0Var));
        return viewI;
    }

    public static View b(RemoteImage remoteImage, ConstraintLayout constraintLayout, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a(remoteImage, constraintLayout, z);
    }
}
