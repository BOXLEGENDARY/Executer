package M8;

import aa.o;
import android.app.Dialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.l0;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.C0494f;
import com.squareup.workflow1.ui.E;
import com.squareup.workflow1.ui.ViewEnvironment;
import ha.C0452K;
import j9.C0601d;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"LM8/h;", "Lk8/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "view", "Landroid/app/Dialog;", "g", "(Landroid/view/View;)Landroid/app/Dialog;", "y", "a", "modal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class h extends k8.h {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J<\u0010\r\u001a\u00020\f2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u0012\u0012\u000e\b\u0000\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LM8/h$a;", "Lcom/squareup/workflow1/ui/A;", "LM8/i;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(LM8/i;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "type", "modal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion implements A<i<?, ?>> {
        private final C0494f<i<?, ?>> a;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u000e\u0010\u0001\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"LM8/i;", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialEnv", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "<anonymous parameter 3>", "Landroid/view/View;", "a", "(LM8/i;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0037a extends kotlin.jvm.internal.l implements o<i<?, ?>, ViewEnvironment, Context, ViewGroup, View> {
            public static final C0037a d = new C0037a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            class C0038a extends kotlin.jvm.internal.j implements Function2<k8.e<?, ? extends Object>, ViewEnvironment, Unit> {
                C0038a(Object obj) {
                    super(2, obj, h.class, "update", "update(Lcom/squareup/workflow1/ui/modal/HasModals;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
                }

                public final void f(@NotNull k8.e<?, ? extends Object> eVar, @NotNull ViewEnvironment viewEnvironment) {
                    Intrinsics.checkNotNullParameter(eVar, "p0");
                    Intrinsics.checkNotNullParameter(viewEnvironment, "p1");
                    ((h) ((kotlin.jvm.internal.d) this).receiver).c(eVar, viewEnvironment);
                }

                public Object invoke(Object obj, Object obj2) {
                    f((k8.e) obj, (ViewEnvironment) obj2);
                    return Unit.a;
                }
            }

            C0037a() {
                super(4);
            }

            @NotNull
            public final View h(@NotNull i<?, ?> iVar, @NotNull ViewEnvironment viewEnvironment, @NotNull Context context, ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(iVar, "initialRendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "initialEnv");
                Intrinsics.checkNotNullParameter(context, "contextForNewView");
                h hVar = new h(context, null, 0, 0, 14, null);
                hVar.setId(m.h);
                hVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                E.a(hVar, iVar, viewEnvironment, new C0038a(hVar));
                return hVar;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public View a(@NotNull i<?, ?> initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public fa.c<? super i<?, ?>> getType() {
            return this.a.getType();
        }

        private Companion() {
            this.a = new C0494f<>(z.b(i.class), C0037a.d);
        }
    }

    public h(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override
    @NotNull
    public Dialog g(@NotNull View view) {
        Object next;
        Intrinsics.checkNotNullParameter(view, "view");
        Dialog dialog = new Dialog(getContext(), S8.f.a);
        Iterator<T> it = j9.o.d(view).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((View) next).getTag(m.g) instanceof Integer) {
                break;
            }
        }
        View view2 = (View) next;
        Object tag = view2 != null ? view2.getTag(m.g) : null;
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        if (window != null) {
            if (num != null) {
                int iIntValue = num.intValue();
                Intrinsics.d(window);
                C0452K.a(window, iIntValue);
            }
            window.setBackgroundDrawable(null);
            window.setLayout(-1, -1);
            l0.b(window, false);
            if (!C0601d.d()) {
                window.setNavigationBarColor(-16777216);
            }
        }
        return dialog;
    }

    public h(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
