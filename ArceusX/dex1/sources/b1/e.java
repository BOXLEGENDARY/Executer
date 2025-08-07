package b1;

import android.view.View;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.sequences.g;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Lb1/d;", "owner", BuildConfig.FLAVOR, "b", "(Landroid/view/View;Lb1/d;)V", "a", "(Landroid/view/View;)Lb1/d;", "savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "view", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    static final class a extends l implements Function1<View, View> {

        public static final a f12568d = new a();

        a() {
            super(1);
        }

        public final View invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lb1/d;", "a", "(Landroid/view/View;)Lb1/d;"}, k = 3, mv = {1, 8, 0})
    static final class b extends l implements Function1<View, d> {

        public static final b f12569d = new b();

        b() {
            super(1);
        }

        public final d invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Object tag = view.getTag(b1.a.f12562a);
            if (tag instanceof d) {
                return (d) tag;
            }
            return null;
        }
    }

    public static final d a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (d) g.m(g.r(g.d(view, a.f12568d), b.f12569d));
    }

    public static final void b(View view, d dVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(b1.a.f12562a, dVar);
    }
}
