package j9;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\b\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lkotlin/Function0;", "", "onCancel", "Landroid/view/View;", "bottomSheet", "contentContainer", "tintView", "a", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lkotlin/jvm/functions/Function0;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0598a {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"j9/a$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class C0236a extends BottomSheetBehavior.f {
        final Function0<Unit> a;
        final View b;

        C0236a(Function0<Unit> function0, View view) {
            this.a = function0;
            this.b = view;
        }

        public void b(@NotNull View bottomSheet, float slideOffset) {
            View view;
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (slideOffset > 0.0f && (view = this.b) != null) {
                view.setVisibility(0);
            }
            View view2 = this.b;
            if (view2 == null) {
                return;
            }
            view2.setAlpha(kotlin.ranges.b.b(slideOffset, 0.0f));
        }

        public void c(@NotNull View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (newState == 4 || newState == 5) {
                this.a.invoke();
                View view = this.b;
                if (view == null) {
                    return;
                }
                view.setVisibility(8);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/core/view/WindowInsetsCompat;", "insets", "", "a", "(Landroidx/core/view/WindowInsetsCompat;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends kotlin.jvm.internal.l implements Function1<WindowInsetsCompat, Unit> {
        final View d;

        b(View view) {
            super(1);
            this.d = view;
        }

        public final void a(@NotNull WindowInsetsCompat windowInsetsCompat) {
            Intrinsics.checkNotNullParameter(windowInsetsCompat, "insets");
            Insets insetsIgnoringVisibility = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
            Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            int iMax = Integer.max(insetsIgnoringVisibility.bottom, insets.bottom);
            View view = this.d;
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iMax);
            View view2 = this.d;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = insetsIgnoringVisibility.top;
            view2.setLayoutParams(marginLayoutParams);
        }

        public Object invoke(Object obj) {
            a((WindowInsetsCompat) obj);
            return Unit.a;
        }
    }

    public static final void a(@NotNull BottomSheetBehavior<?> bottomSheetBehavior, @NotNull Function0<Unit> function0, @NotNull View view, View view2, View view3) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        Intrinsics.checkNotNullParameter(function0, "onCancel");
        Intrinsics.checkNotNullParameter(view, "bottomSheet");
        bottomSheetBehavior.Y(new C0236a(function0, view3));
        bottomSheetBehavior.Q0(true);
        if (view2 != null) {
            view = view2;
        }
        C0601d.e(view, new b(view));
    }
}
