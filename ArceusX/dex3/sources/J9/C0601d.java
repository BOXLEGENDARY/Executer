package j9;

import android.os.Build;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.I;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.Z;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\f\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0016\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Landroidx/core/view/WindowInsetsCompat;", "", "cb", "e", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "", "applyTopInset", "applyBottomInset", "applyLeftInset", "applyRightInset", "b", "(Landroid/view/View;ZZZZ)V", "g", "(Landroid/view/View;)V", "a", "Z", "d", "()Z", "supportsCustomNavigationBar", "getSupportsCustomStatusBar", "supportsCustomStatusBar", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0601d {
    private static final boolean a;
    private static final boolean b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/core/view/WindowInsetsCompat;", "insets", "", "a", "(Landroidx/core/view/WindowInsetsCompat;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function1<WindowInsetsCompat, Unit> {
        final View d;
        final boolean e;
        final boolean i;
        final boolean v;
        final boolean w;

        a(View view, boolean z, boolean z2, boolean z3, boolean z4) {
            super(1);
            this.d = view;
            this.e = z;
            this.i = z2;
            this.v = z3;
            this.w = z4;
        }

        public final void a(@NotNull WindowInsetsCompat windowInsetsCompat) {
            Intrinsics.checkNotNullParameter(windowInsetsCompat, "insets");
            Insets insetsIgnoringVisibility = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
            Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            int i = insets.bottom;
            int paddingTop = insetsIgnoringVisibility.top;
            int iMax = Integer.max(insetsIgnoringVisibility.bottom, i);
            int paddingLeft = insetsIgnoringVisibility.left;
            int paddingRight = insetsIgnoringVisibility.right;
            View view = this.d;
            if (!this.e) {
                paddingLeft = view.getPaddingLeft();
            }
            if (!this.i) {
                paddingTop = this.d.getPaddingTop();
            }
            if (!this.v) {
                paddingRight = this.d.getPaddingRight();
            }
            if (!this.w) {
                iMax = this.d.getPaddingBottom();
            }
            view.setPadding(paddingLeft, paddingTop, paddingRight, iMax);
        }

        public Object invoke(Object obj) {
            a((WindowInsetsCompat) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"j9/d$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override
        public void onViewAttachedToWindow(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            v.removeOnAttachStateChangeListener(this);
            v.requestApplyInsets();
        }

        @Override
        public void onViewDetachedFromWindow(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
        }
    }

    static {
        a = Build.VERSION.SDK_INT >= 30;
        b = true;
    }

    public static final void b(@NotNull View view, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        e(view, new a(view, z3, z, z4, z2));
    }

    public static void c(View view, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        if ((i & 8) != 0) {
            z4 = true;
        }
        b(view, z, z2, z3, z4);
    }

    public static final boolean d() {
        return a;
    }

    public static final void e(@NotNull View view, @NotNull final Function1<? super WindowInsetsCompat, Unit> function1) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(function1, "cb");
        Z.B0(view, new I() {
            public final WindowInsetsCompat K(View view2, WindowInsetsCompat windowInsetsCompat) {
                return C0601d.f(function1, view2, windowInsetsCompat);
            }
        });
        if (view.isAttachedToWindow()) {
            return;
        }
        g(view);
    }

    public static final WindowInsetsCompat f(Function1 function1, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(function1, "$cb");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "insets");
        function1.invoke(windowInsetsCompat);
        return windowInsetsCompat;
    }

    public static final void g(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }
}
