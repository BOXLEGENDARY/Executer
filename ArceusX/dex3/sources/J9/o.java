package j9;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.e0;
import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b*\u00020\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/view/View;", "Lkotlin/Function0;", "", "onPreDraw", "b", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "e", "(Landroid/view/View;)V", "", "d", "(Landroid/view/View;)Ljava/util/List;", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class o {
    public static final void b(@NotNull View view, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(function0, "onPreDraw");
        ViewTreeObserverOnPreDrawListenerC0602e.INSTANCE.a(view, new Runnable() {
            @Override
            public final void run() {
                o.c(function0);
            }
        });
    }

    public static final void c(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "$tmp0");
        function0.invoke();
    }

    @NotNull
    public static final List<View> d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        linkedList.push(view);
        while (!linkedList.isEmpty()) {
            Object objPollLast = linkedList.pollLast();
            if (objPollLast == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            View view2 = (View) objPollLast;
            if (view2 instanceof ViewGroup) {
                Iterator it = CollectionsKt.g0(kotlin.sequences.g.s(e0.a((ViewGroup) view2))).iterator();
                while (it.hasNext()) {
                    linkedList.push((View) it.next());
                }
            }
            if (!Intrinsics.b(view2, view)) {
                arrayList.add(view2);
            }
        }
        return arrayList;
    }

    public static final void e(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.sendAccessibilityEvent(32768);
    }
}
