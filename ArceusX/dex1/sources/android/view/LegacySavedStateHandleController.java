package android.view;

import android.os.Bundle;
import android.view.AbstractC1694h;
import android.view.LegacySavedStateHandleController;
import androidx.savedstate.a;
import b1.d;
import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController;", BuildConfig.FLAVOR, "<init>", "()V", "Landroidx/savedstate/a;", "registry", "Landroidx/lifecycle/h;", "lifecycle", BuildConfig.FLAVOR, "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/SavedStateHandleController;", "b", "(Landroidx/savedstate/a;Landroidx/lifecycle/h;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/L;", "viewModel", BuildConfig.FLAVOR, "a", "(Landroidx/lifecycle/L;Landroidx/savedstate/a;Landroidx/lifecycle/h;)V", "c", "(Landroidx/savedstate/a;Landroidx/lifecycle/h;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacySavedStateHandleController {

    public static final LegacySavedStateHandleController f11295a = new LegacySavedStateHandleController();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController$a;", "Landroidx/savedstate/a$a;", "<init>", "()V", "Lb1/d;", "owner", BuildConfig.FLAVOR, "a", "(Lb1/d;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements a.InterfaceC0118a {
        @Override
        public void a(d owner) throws NoSuchMethodException, SecurityException {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof InterfaceC1684S)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            C1683Q viewModelStore = ((InterfaceC1684S) owner).getViewModelStore();
            androidx.savedstate.a savedStateRegistry = owner.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                AbstractC1678L abstractC1678LB = viewModelStore.b(it.next());
                Intrinsics.d(abstractC1678LB);
                LegacySavedStateHandleController.a(abstractC1678LB, savedStateRegistry, owner.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.i(a.class);
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(AbstractC1678L viewModel, androidx.savedstate.a registry, AbstractC1694h lifecycle) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.getIsAttached()) {
            return;
        }
        savedStateHandleController.a(registry, lifecycle);
        f11295a.c(registry, lifecycle);
    }

    public static final SavedStateHandleController b(androidx.savedstate.a registry, AbstractC1694h lifecycle, String key, Bundle defaultArgs) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.d(key);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(key, C1671E.INSTANCE.a(registry.b(key), defaultArgs));
        savedStateHandleController.a(registry, lifecycle);
        f11295a.c(registry, lifecycle);
        return savedStateHandleController;
    }

    private final void c(final androidx.savedstate.a registry, final AbstractC1694h lifecycle) throws NoSuchMethodException, SecurityException {
        AbstractC1694h.b state = lifecycle.getState();
        if (state == AbstractC1694h.b.INITIALIZED || state.e(AbstractC1694h.b.STARTED)) {
            registry.i(a.class);
        } else {
            lifecycle.a(new InterfaceC1698l() {
                @Override
                public void j(InterfaceC1701o source, AbstractC1694h.a event) throws NoSuchMethodException, SecurityException {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == AbstractC1694h.a.ON_START) {
                        lifecycle.d(this);
                        registry.i(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }
}
