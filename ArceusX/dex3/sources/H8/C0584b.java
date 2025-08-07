package h8;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.lifecycle.T;
import androidx.lifecycle.o;
import b1.e;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u0001*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0082\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lh8/b;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lb1/d;", "d", "(Landroid/view/View;)Lb1/d;", "T", "Landroid/content/Context;", "Lfa/c;", "ownerClass", "b", "(Landroid/content/Context;Lfa/c;)Ljava/lang/Object;", "Landroidx/lifecycle/o;", "a", "(Landroid/view/View;)Landroidx/lifecycle/o;", "c", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class C0584b {

    @NotNull
    public static final C0584b a = new C0584b();

    private C0584b() {
    }

    private final <T> T b(Context context, fa.c<T> cVar) {
        while (!cVar.e(context)) {
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == null) {
                return null;
            }
        }
        return (T) fa.d.a(cVar, context);
    }

    private final b1.d d(View view) {
        b1.d dVarA = e.a(view);
        if (dVarA != null) {
            return dVarA;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        return (b1.d) b(context, z.b(b1.d.class));
    }

    public final o a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o oVarA = T.a(view);
        if (oVarA != null) {
            return oVarA;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        return (o) b(context, z.b(o.class));
    }

    @NotNull
    public final b1.d c(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        b1.d dVarD = d(view);
        if (dVarD != null) {
            return dVarD;
        }
        throw new IllegalStateException(Intrinsics.m("Expected to find a SavedStateRegistryOwner either in a parent view or the Context of ", view).toString());
    }
}
