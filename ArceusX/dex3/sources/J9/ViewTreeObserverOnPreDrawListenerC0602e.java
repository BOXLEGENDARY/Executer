package j9;

import android.view.View;
import android.view.ViewTreeObserver;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\nB\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lj9/e;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Ljava/lang/Runnable;", "runnable", "<init>", "(Landroid/view/View;Ljava/lang/Runnable;)V", "", "a", "()V", "", "onPreDraw", "()Z", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "d", "Landroid/view/View;", "e", "Ljava/lang/Runnable;", "Landroid/view/ViewTreeObserver;", "i", "Landroid/view/ViewTreeObserver;", "viewTreeObserver", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class ViewTreeObserverOnPreDrawListenerC0602e implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final View view;

    @NotNull
    private final Runnable runnable;

    @NotNull
    private ViewTreeObserver viewTreeObserver;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lj9/e$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "Ljava/lang/Runnable;", "runnable", "Lj9/e;", "a", "(Landroid/view/View;Ljava/lang/Runnable;)Lj9/e;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ViewTreeObserverOnPreDrawListenerC0602e a(@NotNull View view, @NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            ViewTreeObserverOnPreDrawListenerC0602e viewTreeObserverOnPreDrawListenerC0602e = new ViewTreeObserverOnPreDrawListenerC0602e(view, runnable, null);
            view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0602e);
            view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0602e);
            return viewTreeObserverOnPreDrawListenerC0602e;
        }

        private Companion() {
        }
    }

    public ViewTreeObserverOnPreDrawListenerC0602e(View view, Runnable runnable, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, runnable);
    }

    private final void a() {
        if (this.viewTreeObserver.isAlive()) {
            this.viewTreeObserver.removeOnPreDrawListener(this);
        } else {
            this.view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.view.removeOnAttachStateChangeListener(this);
    }

    @Override
    public boolean onPreDraw() {
        a();
        this.runnable.run();
        return false;
    }

    @Override
    public void onViewAttachedToWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        ViewTreeObserver viewTreeObserver = v.getViewTreeObserver();
        Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "getViewTreeObserver(...)");
        this.viewTreeObserver = viewTreeObserver;
    }

    @Override
    public void onViewDetachedFromWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        a();
    }

    private ViewTreeObserverOnPreDrawListenerC0602e(View view, Runnable runnable) {
        this.view = view;
        this.runnable = runnable;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "getViewTreeObserver(...)");
        this.viewTreeObserver = viewTreeObserver;
    }
}
