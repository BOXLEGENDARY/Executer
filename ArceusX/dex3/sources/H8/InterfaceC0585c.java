package h8;

import android.view.View;
import androidx.lifecycle.T;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.androidx.RealWorkflowLifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lh8/c;", "Landroidx/lifecycle/o;", "", "P", "()V", "q", "a", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public interface InterfaceC0585c extends o {

    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lh8/c$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/lifecycle/h;", "b", "(Landroid/view/View;)Landroidx/lifecycle/h;", "Lkotlin/Function1;", "findParentLifecycle", "", "d", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lh8/c;", "c", "(Landroid/view/View;)Lh8/c;", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class Companion {
        static final Companion a = new Companion();

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "v", "Landroidx/lifecycle/h;", "a", "(Landroid/view/View;)Landroidx/lifecycle/h;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
        public static final class C0233a extends l implements Function1<View, h> {
            public static final C0233a d = new C0233a();

            C0233a() {
                super(1);
            }

            @NotNull
            public final h invoke(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "v");
                return Companion.a.b(view);
            }
        }

        private Companion() {
        }

        public final h b(View view) {
            o oVarA;
            Object parent = view.getParent();
            h lifecycle = null;
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null && (oVarA = C0584b.a.a(view2)) != null) {
                lifecycle = oVarA.getLifecycle();
            }
            if (lifecycle != null) {
                return lifecycle;
            }
            throw new IllegalStateException(("Expected parent or context of " + view + " to have or be a ViewTreeLifecycleOwner").toString());
        }

        public static void e(Companion companion, View view, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                function1 = C0233a.d;
            }
            companion.d(view, function1);
        }

        public final InterfaceC0585c c(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o oVarA = T.a(view);
            if (oVarA instanceof InterfaceC0585c) {
                return (InterfaceC0585c) oVarA;
            }
            return null;
        }

        public final void d(@NotNull View view, @NotNull Function1<? super View, ? extends h> findParentLifecycle) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(findParentLifecycle, "findParentLifecycle");
            RealWorkflowLifecycleOwner realWorkflowLifecycleOwner = new RealWorkflowLifecycleOwner(findParentLifecycle, false, 2, null);
            T.b(view, realWorkflowLifecycleOwner);
            view.addOnAttachStateChangeListener(realWorkflowLifecycleOwner);
        }
    }

    void P();
}
