package b1;

import android.os.Bundle;
import android.view.AbstractC1694h;
import androidx.savedstate.Recreator;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0019"}, d2 = {"Lb1/c;", BuildConfig.FLAVOR, "Lb1/d;", "owner", "<init>", "(Lb1/d;)V", BuildConfig.FLAVOR, "c", "()V", "Landroid/os/Bundle;", "savedState", "d", "(Landroid/os/Bundle;)V", "outBundle", "e", "a", "Lb1/d;", "Landroidx/savedstate/a;", "b", "Landroidx/savedstate/a;", "()Landroidx/savedstate/a;", "savedStateRegistry", BuildConfig.FLAVOR, "Z", "attached", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    public static final Companion INSTANCE = new Companion(null);

    private final d owner;

    private final androidx.savedstate.a savedStateRegistry;

    private boolean attached;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lb1/c$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lb1/d;", "owner", "Lb1/c;", "a", "(Lb1/d;)Lb1/c;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(d owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new c(owner, null);
        }

        private Companion() {
        }
    }

    public c(d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar);
    }

    public static final c a(d dVar) {
        return INSTANCE.a(dVar);
    }

    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    public final void c() {
        AbstractC1694h lifecycle = this.owner.getLifecycle();
        if (lifecycle.getState() != AbstractC1694h.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(this.owner));
        this.savedStateRegistry.e(lifecycle);
        this.attached = true;
    }

    public final void d(Bundle savedState) {
        if (!this.attached) {
            c();
        }
        AbstractC1694h lifecycle = this.owner.getLifecycle();
        if (!lifecycle.getState().e(AbstractC1694h.b.STARTED)) {
            this.savedStateRegistry.f(savedState);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getState()).toString());
    }

    public final void e(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.savedStateRegistry.g(outBundle);
    }

    private c(d dVar) {
        this.owner = dVar;
        this.savedStateRegistry = new androidx.savedstate.a();
    }
}
