package ha;

import androidx.lifecycle.E;
import androidx.lifecycle.L;
import com.roblox.client.personasdk.R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LF8/D;", "Landroidx/lifecycle/L;", "Landroidx/lifecycle/E;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/E;)V", "", "g", "()V", "d", "Landroidx/lifecycle/E;", "f", "()Landroidx/lifecycle/E;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0338D extends L {

    @NotNull
    private final E savedStateHandle;

    public C0338D(@NotNull E e) {
        Intrinsics.checkNotNullParameter(e, "savedStateHandle");
        this.savedStateHandle = e;
    }

    @NotNull
    public final E getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public final void g() {
        Iterator it = this.savedStateHandle.i().iterator();
        while (it.hasNext()) {
            this.savedStateHandle.m((String) it.next(), (Object) null);
        }
    }
}
