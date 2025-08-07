package android.view;

import android.view.AbstractC1694h;
import androidx.savedstate.a;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/l;", BuildConfig.FLAVOR, "key", "Landroidx/lifecycle/E;", "handle", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/E;)V", "Landroidx/savedstate/a;", "registry", "Landroidx/lifecycle/h;", "lifecycle", BuildConfig.FLAVOR, "a", "(Landroidx/savedstate/a;Landroidx/lifecycle/h;)V", "Landroidx/lifecycle/o;", "source", "Landroidx/lifecycle/h$a;", "event", "j", "(Landroidx/lifecycle/o;Landroidx/lifecycle/h$a;)V", "d", "Ljava/lang/String;", "e", "Landroidx/lifecycle/E;", "b", "()Landroidx/lifecycle/E;", BuildConfig.FLAVOR, "<set-?>", "i", "Z", "c", "()Z", "isAttached", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandleController implements InterfaceC1698l {

    private final String key;

    private final C1671E handle;

    private boolean isAttached;

    public SavedStateHandleController(String str, C1671E c1671e) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(c1671e, "handle");
        this.key = str;
        this.handle = c1671e;
    }

    public final void a(a registry, AbstractC1694h lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.isAttached) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.isAttached = true;
        lifecycle.a(this);
        registry.h(this.key, this.handle.getSavedStateProvider());
    }

    public final C1671E getHandle() {
        return this.handle;
    }

    public final boolean getIsAttached() {
        return this.isAttached;
    }

    @Override
    public void j(InterfaceC1701o source, AbstractC1694h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1694h.a.ON_DESTROY) {
            this.isAttached = false;
            source.getLifecycle().d(this);
        }
    }
}
