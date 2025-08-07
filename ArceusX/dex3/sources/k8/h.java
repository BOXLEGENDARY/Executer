package k8;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.activity.G;
import androidx.activity.OnBackPressedDispatcher;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.C;
import com.squareup.workflow1.ui.C0492d;
import com.squareup.workflow1.ui.C0493e;
import com.squareup.workflow1.ui.D;
import com.squareup.workflow1.ui.E;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.modal.ModalContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lk8/h;", "Lcom/squareup/workflow1/ui/modal/ModalContainer;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "view", "Landroid/app/Dialog;", "g", "(Landroid/view/View;)Landroid/app/Dialog;", "initialModalRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "b", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "dialogRef", "", "d", "(Lcom/squareup/workflow1/ui/modal/ModalContainer$a;)V", "w", "a", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public class h extends ModalContainer<Object> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    static final class b extends l implements Function0<Unit> {
        public static final b d = new b();

        b() {
            super(0);
        }

        public Object invoke() {
            m609invoke();
            return Unit.a;
        }

        public final void m609invoke() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    static final class c extends l implements Function0<Unit> {
        public static final c d = new c();

        c() {
            super(0);
        }

        public Object invoke() {
            m610invoke();
            return Unit.a;
        }

        public final void m610invoke() {
        }
    }

    public h(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final boolean f(View view, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "$view");
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        G gB = C0493e.b(context);
        if (gB == null || (onBackPressedDispatcher = gB.getOnBackPressedDispatcher()) == null || !onBackPressedDispatcher.j()) {
            return true;
        }
        onBackPressedDispatcher.l();
        return true;
    }

    @Override
    @NotNull
    protected final ModalContainer.a<Object> b(@NotNull Object initialModalRendering, @NotNull ViewEnvironment initialViewEnvironment) {
        Intrinsics.checkNotNullParameter(initialModalRendering, "initialModalRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        C0492d c0492d = new C0492d(initialModalRendering, false, b.d, 2, null);
        C c3 = (C) initialViewEnvironment.a(C.INSTANCE);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.context");
        final View viewC = D.c(c3, c0492d, initialViewEnvironment, context, (16 & 8) != 0 ? null : this, (16 & 16) != 0 ? null : null);
        E.h(viewC);
        Dialog dialogG = g(viewC);
        dialogG.setOnKeyListener(new DialogInterface.OnKeyListener() {
            @Override
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return h.f(viewC, dialogInterface, i, keyEvent);
            }
        });
        return new ModalContainer.a<>(initialModalRendering, initialViewEnvironment, dialogG, viewC);
    }

    @Override
    protected void d(@NotNull ModalContainer.a<Object> dialogRef) {
        Intrinsics.checkNotNullParameter(dialogRef, "dialogRef");
        C0492d c0492d = new C0492d(dialogRef.f(), false, c.d, 2, null);
        Object extra = dialogRef.getExtra();
        if (extra == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        E.g((View) extra, c0492d, dialogRef.getViewEnvironment());
    }

    @NotNull
    public Dialog g(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Dialog dialog = new Dialog(getContext());
        dialog.setCancelable(false);
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        Intrinsics.d(window);
        window.setLayout(-2, -2);
        Window window2 = dialog.getWindow();
        Intrinsics.d(window2);
        window2.setBackgroundDrawable(null);
        return dialog;
    }
}
