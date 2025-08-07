package Q8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.InterfaceC0490b;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.squareup.workflow1.ui.x;
import ha.C0456d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LQ8/h;", "Lcom/squareup/workflow1/ui/b;", "LQ8/l;", "permission", "", "isPermanentPermissionRejectionCheck", "Lkotlin/Function1;", "", "callback", "<init>", "(LQ8/l;ZLkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "LQ8/l;", "e", "Z", "i", "Lkotlin/jvm/functions/Function1;", "Lcom/squareup/workflow1/ui/A;", "v", "Lcom/squareup/workflow1/ui/A;", "a", "()Lcom/squareup/workflow1/ui/A;", "viewFactory", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class CheckRequestPermissionRationaleStateView implements InterfaceC0490b<CheckRequestPermissionRationaleStateView> {

    @NotNull
    private final l permission;

    private final boolean isPermanentPermissionRejectionCheck;

    private final Function1<Boolean, Unit> callback;

    @NotNull
    private final A<CheckRequestPermissionRationaleStateView> viewFactory;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lj1/a;", "BindingT", "", "RenderingT", "binding", "Lcom/squareup/workflow1/ui/j;", "a", "(Lj1/a;)Lcom/squareup/workflow1/ui/j;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class a extends kotlin.jvm.internal.l implements Function1<R8.a, com.squareup.workflow1.ui.j<CheckRequestPermissionRationaleStateView>> {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lj1/a;", "BindingT", "", "RenderingT", "rendering", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "", "a", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        public static final class C0044a<RenderingT> implements com.squareup.workflow1.ui.j {
            final j1.a b;
            final CheckRequestPermissionRationaleStateView c;

            public C0044a(j1.a aVar, CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView) {
                this.b = aVar;
                this.c = checkRequestPermissionRationaleStateView;
            }

            @Override
            public final void a(@NotNull RenderingT renderingt, @NotNull ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(renderingt, "rendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView = (CheckRequestPermissionRationaleStateView) renderingt;
                R8.a aVar = (R8.a) this.b;
                Context context = aVar.a().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                androidx.appcompat.app.d dVarH = C0456d.h(context);
                if (checkRequestPermissionRationaleStateView.callback != null) {
                    aVar.a().post(new c(aVar, this.c, checkRequestPermissionRationaleStateView, dVarH));
                }
            }
        }

        public a() {
            super(1);
        }

        @NotNull
        public final com.squareup.workflow1.ui.j<CheckRequestPermissionRationaleStateView> invoke(@NotNull R8.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "binding");
            return new C0044a(aVar, CheckRequestPermissionRationaleStateView.this);
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class b extends kotlin.jvm.internal.j implements aa.n<LayoutInflater, ViewGroup, Boolean, R8.a> {
        public static final b d = new b();

        b() {
            super(3, R8.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2CheckRequestPermissionRationaleStateBinding;", 0);
        }

        @NotNull
        public final R8.a f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "p0");
            return R8.a.c(layoutInflater, viewGroup, z);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c implements Runnable {
        final R8.a d;
        final CheckRequestPermissionRationaleStateView e;
        final CheckRequestPermissionRationaleStateView i;
        final androidx.appcompat.app.d v;

        c(R8.a aVar, CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView, CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView2, androidx.appcompat.app.d dVar) {
            this.d = aVar;
            this.e = checkRequestPermissionRationaleStateView;
            this.i = checkRequestPermissionRationaleStateView2;
            this.v = dVar;
        }

        @Override
        public final void run() {
            if (this.d.a().isAttachedToWindow()) {
                if (this.e.permission != l.e || this.e.isPermanentPermissionRejectionCheck) {
                    this.i.callback.invoke(Boolean.valueOf(androidx.core.app.b.w(this.v, p.b(this.i.permission))));
                } else {
                    this.i.callback.invoke(Boolean.TRUE);
                }
            }
        }
    }

    public CheckRequestPermissionRationaleStateView(@NotNull l lVar, boolean z, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(lVar, "permission");
        this.permission = lVar;
        this.isPermanentPermissionRejectionCheck = z;
        this.callback = function1;
        j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
        this.viewFactory = new x(z.b(CheckRequestPermissionRationaleStateView.class), b.d, new a());
    }

    @Override
    @NotNull
    public A<CheckRequestPermissionRationaleStateView> a() {
        return this.viewFactory;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckRequestPermissionRationaleStateView)) {
            return false;
        }
        CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView = (CheckRequestPermissionRationaleStateView) other;
        return this.permission == checkRequestPermissionRationaleStateView.permission && this.isPermanentPermissionRejectionCheck == checkRequestPermissionRationaleStateView.isPermanentPermissionRejectionCheck && Intrinsics.b(this.callback, checkRequestPermissionRationaleStateView.callback);
    }

    public int hashCode() {
        int iHashCode = ((this.permission.hashCode() * 31) + Boolean.hashCode(this.isPermanentPermissionRejectionCheck)) * 31;
        Function1<Boolean, Unit> function1 = this.callback;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    @NotNull
    public String toString() {
        return "CheckRequestPermissionRationaleStateView(permission=" + this.permission + ", isPermanentPermissionRejectionCheck=" + this.isPermanentPermissionRejectionCheck + ", callback=" + this.callback + ")";
    }
}
