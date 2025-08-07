package android.view;

import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0014\u0010\u0013R*\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0005R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010 \u001a\u0004\b\u001c\u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/activity/E;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "enabled", "<init>", "(Z)V", BuildConfig.FLAVOR, "h", "()V", "Landroidx/activity/b;", "backEvent", "f", "(Landroidx/activity/b;)V", "e", "d", "c", "Landroidx/activity/c;", "cancellable", "a", "(Landroidx/activity/c;)V", "i", "value", "Z", "g", "()Z", "j", "isEnabled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "b", "Ljava/util/concurrent/CopyOnWriteArrayList;", "cancellables", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "k", "(Lkotlin/jvm/functions/Function0;)V", "enabledChangedCallback", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class E {

    private boolean isEnabled;

    private final CopyOnWriteArrayList<InterfaceC1589c> cancellables = new CopyOnWriteArrayList<>();

    private Function0<Unit> enabledChangedCallback;

    public E(boolean z7) {
        this.isEnabled = z7;
    }

    public final void a(InterfaceC1589c cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final Function0<Unit> b() {
        return this.enabledChangedCallback;
    }

    public void c() {
    }

    public abstract void d();

    public void e(C1588b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void f(C1588b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final void h() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((InterfaceC1589c) it.next()).cancel();
        }
    }

    public final void i(InterfaceC1589c cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    public final void j(boolean z7) {
        this.isEnabled = z7;
        Function0<Unit> function0 = this.enabledChangedCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void k(Function0<Unit> function0) {
        this.enabledChangedCallback = function0;
    }
}
