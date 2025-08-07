package n9;

import android.content.Context;
import android.view.LayoutInflater;
import com.roblox.client.personasdk.R;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00072\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R$\u0010\u0018\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln9/s0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lkotlin/Function0;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/OnLayoutListener;", "cb", "d", "(Lkotlin/jvm/functions/Function0;)V", "c", "()V", "a", "Landroid/content/Context;", "()Landroid/content/Context;", "Landroid/view/LayoutInflater;", "b", "Landroid/view/LayoutInflater;", "()Landroid/view/LayoutInflater;", "layoutInflater", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "onLayoutListeners", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class s0 {

    @NotNull
    private final Context context;

    @NotNull
    private final LayoutInflater layoutInflater;

    @NotNull
    private final LinkedList<Function0<Unit>> onLayoutListeners;

    public s0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        this.layoutInflater = layoutInflaterFrom;
        this.onLayoutListeners = new LinkedList<>();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final LayoutInflater getLayoutInflater() {
        return this.layoutInflater;
    }

    public final void c() {
        Iterator<Function0<Unit>> it = this.onLayoutListeners.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
    }

    public final void d(@NotNull Function0<Unit> cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        this.onLayoutListeners.add(cb);
    }
}
