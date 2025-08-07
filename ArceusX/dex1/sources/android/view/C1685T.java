package android.view;

import Q0.a;
import android.view.View;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.sequences.g;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/o;", "lifecycleOwner", BuildConfig.FLAVOR, "b", "(Landroid/view/View;Landroidx/lifecycle/o;)V", "a", "(Landroid/view/View;)Landroidx/lifecycle/o;", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class C1685T {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "currentView", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    static final class C0102a extends l implements Function1<View, View> {

        public static final C0102a f11380d = new C0102a();

        C0102a() {
            super(1);
        }

        public final View invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "currentView");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "viewParent", "Landroidx/lifecycle/o;", "a", "(Landroid/view/View;)Landroidx/lifecycle/o;"}, k = 3, mv = {1, 8, 0})
    static final class C0103b extends l implements Function1<View, InterfaceC1701o> {

        public static final C0103b f11381d = new C0103b();

        C0103b() {
            super(1);
        }

        public final InterfaceC1701o invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "viewParent");
            Object tag = view.getTag(a.f3789a);
            if (tag instanceof InterfaceC1701o) {
                return (InterfaceC1701o) tag;
            }
            return null;
        }
    }

    public static final InterfaceC1701o a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (InterfaceC1701o) g.m(g.r(g.d(view, C0102a.f11380d), C0103b.f11381d));
    }

    public static final void b(View view, InterfaceC1701o interfaceC1701o) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(a.f3789a, interfaceC1701o);
    }
}
