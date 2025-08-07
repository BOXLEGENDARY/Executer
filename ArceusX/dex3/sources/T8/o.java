package T8;

import T8.c;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.squareup.workflow1.ui.x;
import ha.C0458f;
import ha.C0469n;
import j9.C0601d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"LT8/o;", "Lcom/squareup/workflow1/ui/j;", "LT8/i;", "LU8/b;", "binding", "<init>", "(LU8/b;)V", "rendering", "Landroid/content/Context;", "context", "", "h", "(LT8/i;Landroid/content/Context;)V", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "l", "(LT8/i;Lcom/squareup/workflow1/ui/y;)V", "b", "LU8/b;", "Landroid/app/Dialog;", "c", "Landroid/app/Dialog;", "optionsDialog", "d", "a", "sandbox_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class o implements com.squareup.workflow1.ui.j<SandboxScreen<?>> {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final U8.b binding;

    private Dialog optionsDialog;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J8\u0010\r\u001a\u00020\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LT8/o$a;", "Lcom/squareup/workflow1/ui/A;", "LT8/i;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(LT8/i;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "type", "sandbox_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion implements A<SandboxScreen<?>> {
        private final A<SandboxScreen<?>> a;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class C0050a extends kotlin.jvm.internal.j implements aa.n<LayoutInflater, ViewGroup, Boolean, U8.b> {
            public static final C0050a d = new C0050a();

            C0050a() {
                super(3, U8.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;", 0);
            }

            @NotNull
            public final U8.b f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(layoutInflater, "p0");
                return U8.b.d(layoutInflater, viewGroup, z);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
            }
        }

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class b extends kotlin.jvm.internal.j implements Function1<U8.b, o> {
            public static final b d = new b();

            b() {
                super(1, o.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;)V", 0);
            }

            @NotNull
            public final o invoke(@NotNull U8.b bVar) {
                Intrinsics.checkNotNullParameter(bVar, "p0");
                return new o(bVar);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public View a(@NotNull SandboxScreen<?> initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public fa.c<? super SandboxScreen<?>> getType() {
            return this.a.getType();
        }

        private Companion() {
            j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
            this.a = new x(z.b(SandboxScreen.class), C0050a.d, b.d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/core/view/WindowInsetsCompat;", "insets", "", "a", "(Landroidx/core/view/WindowInsetsCompat;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends kotlin.jvm.internal.l implements Function1<WindowInsetsCompat, Unit> {
        b() {
            super(1);
        }

        public final void a(@NotNull WindowInsetsCompat windowInsetsCompat) {
            Intrinsics.checkNotNullParameter(windowInsetsCompat, "insets");
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars()), "getInsetsIgnoringVisibility(...)");
            FloatingActionButton floatingActionButton = o.this.binding.c;
            Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
            ViewGroup.LayoutParams layoutParams = floatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
            ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = (int) (r7.bottom + C0458f.c(16.0d));
            floatingActionButton.setLayoutParams(fVar);
        }

        public Object invoke(Object obj) {
            a((WindowInsetsCompat) obj);
            return Unit.a;
        }
    }

    public o(@NotNull U8.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "binding");
        this.binding = bVar;
    }

    private final void h(final SandboxScreen<?> rendering, Context context) {
        if (this.optionsDialog != null) {
            return;
        }
        final Dialog dialog = new Dialog(context, c4.j.c);
        U8.a aVarD = U8.a.d(LayoutInflater.from(dialog.getContext()));
        Intrinsics.checkNotNullExpressionValue(aVarD, "inflate(...)");
        dialog.setContentView((View) aVarD.a());
        aVarD.c.setTitle("Sandbox options");
        aVarD.c.setNavigationIcon(C0469n.t);
        aVarD.c.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                o.i(dialog, view);
            }
        });
        aVarD.b.setChecked(rendering.getSimulateGovIdNfc());
        aVarD.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                o.j(rendering, compoundButton, z);
            }
        });
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(null);
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                o.k(this.d, dialogInterface);
            }
        });
        this.optionsDialog = dialog;
        dialog.show();
    }

    public static final void i(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$this_apply");
        dialog.dismiss();
    }

    public static final void j(SandboxScreen sandboxScreen, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(sandboxScreen, "$rendering");
        sandboxScreen.d().invoke(Boolean.valueOf(z));
    }

    public static final void k(o oVar, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(oVar, "this$0");
        oVar.optionsDialog = null;
    }

    public static final void m(SandboxScreen sandboxScreen, U8.b bVar, View view) throws P9.m {
        Intrinsics.checkNotNullParameter(sandboxScreen, "$rendering");
        Intrinsics.checkNotNullParameter(bVar, "$this_with");
        sandboxScreen.c().invoke();
        Toast.makeText(bVar.c.getRootView().getContext(), "Setting the debug flag to: " + c.INSTANCE.a((c.b) sandboxScreen.a().invoke()), 0).show();
    }

    public static final boolean n(o oVar, SandboxScreen sandboxScreen, Context context, View view) {
        Intrinsics.checkNotNullParameter(oVar, "this$0");
        Intrinsics.checkNotNullParameter(sandboxScreen, "$rendering");
        Intrinsics.d(context);
        oVar.h(sandboxScreen, context);
        return true;
    }

    @Override
    public void a(@NotNull final SandboxScreen<?> rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        final U8.b bVar = this.binding;
        final Context context = bVar.a().getContext();
        bVar.c.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) throws P9.m {
                o.m(rendering, bVar, view);
            }
        });
        bVar.c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                return o.n(this.d, rendering, context, view);
            }
        });
        FloatingActionButton floatingActionButton = bVar.c;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
        C0601d.e(floatingActionButton, new b());
        bVar.b.c(rendering.b(), viewEnvironment);
    }
}
