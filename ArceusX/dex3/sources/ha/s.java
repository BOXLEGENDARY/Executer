package ha;

import android.view.View;
import ha.T;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"LJ1/s;", "LJ1/d;", "Landroid/view/View;", "view", "Lha/T;", "LJ1/h;", "job", "<init>", "(Landroid/view/View;Lha/T;)V", "a", "Landroid/view/View;", "b", "Lha/T;", "getJob", "()Lha/T;", "(Lha/T;)V", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s implements InterfaceC0353d {

    @NotNull
    private final View view;

    @NotNull
    private volatile T<? extends AbstractC0357h> job;

    public s(@NotNull View view, @NotNull T<? extends AbstractC0357h> t) {
        this.view = view;
        this.job = t;
    }

    public void a(@NotNull T<? extends AbstractC0357h> t) {
        this.job = t;
    }
}
