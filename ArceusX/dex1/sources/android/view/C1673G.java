package android.view;

import P9.h;
import P9.i;
import android.os.Bundle;
import androidx.savedstate.a;
import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/G;", "Landroidx/savedstate/a$c;", "Landroidx/savedstate/a;", "savedStateRegistry", "Landroidx/lifecycle/S;", "viewModelStoreOwner", "<init>", "(Landroidx/savedstate/a;Landroidx/lifecycle/S;)V", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", BuildConfig.FLAVOR, "d", "()V", BuildConfig.FLAVOR, "key", "b", "(Ljava/lang/String;)Landroid/os/Bundle;", "Landroidx/savedstate/a;", BuildConfig.FLAVOR, "Z", "restored", "c", "Landroid/os/Bundle;", "restoredState", "Landroidx/lifecycle/H;", "LP9/h;", "()Landroidx/lifecycle/H;", "viewModel", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C1673G implements a.c {

    private final androidx.savedstate.a savedStateRegistry;

    private boolean restored;

    private Bundle restoredState;

    private final h viewModel;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/H;", "a", "()Landroidx/lifecycle/H;"}, k = 3, mv = {1, 8, 0})
    static final class a extends l implements Function0<C1674H> {

        final InterfaceC1684S f11277d;

        a(InterfaceC1684S interfaceC1684S) {
            super(0);
            this.f11277d = interfaceC1684S;
        }

        public final C1674H invoke() {
            return C1672F.e(this.f11277d);
        }
    }

    public C1673G(androidx.savedstate.a aVar, InterfaceC1684S interfaceC1684S) {
        Intrinsics.checkNotNullParameter(aVar, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(interfaceC1684S, "viewModelStoreOwner");
        this.savedStateRegistry = aVar;
        this.viewModel = i.b(new a(interfaceC1684S));
    }

    private final C1674H c() {
        return (C1674H) this.viewModel.getValue();
    }

    @Override
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, C1671E> entry : c().f().entrySet()) {
            String key = entry.getKey();
            Bundle bundleA = entry.getValue().getSavedStateProvider().a();
            if (!Intrinsics.b(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(key, bundleA);
            }
        }
        this.restored = false;
        return bundle;
    }

    public final Bundle b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        d();
        Bundle bundle = this.restoredState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.restoredState;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.restoredState = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.restored) {
            return;
        }
        Bundle bundleB = this.savedStateRegistry.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.restoredState = bundle;
        this.restored = true;
        c();
    }
}
