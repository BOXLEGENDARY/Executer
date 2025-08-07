package android.view;

import android.app.Application;
import android.os.Bundle;
import android.view.C1681O;
import androidx.savedstate.a;
import b1.d;
import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/lifecycle/I;", "Landroidx/lifecycle/O$d;", "Landroidx/lifecycle/O$b;", "Landroid/app/Application;", "application", "Lb1/d;", "owner", "Landroid/os/Bundle;", "defaultArgs", "<init>", "(Landroid/app/Application;Lb1/d;Landroid/os/Bundle;)V", "Landroidx/lifecycle/L;", "T", "Ljava/lang/Class;", "modelClass", "LR0/a;", "extras", "b", "(Ljava/lang/Class;LR0/a;)Landroidx/lifecycle/L;", BuildConfig.FLAVOR, "key", "d", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/L;", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/L;", "viewModel", BuildConfig.FLAVOR, "c", "(Landroidx/lifecycle/L;)V", "Landroid/app/Application;", "Landroidx/lifecycle/O$b;", "factory", "Landroid/os/Bundle;", "Landroidx/lifecycle/h;", "e", "Landroidx/lifecycle/h;", "lifecycle", "Landroidx/savedstate/a;", "f", "Landroidx/savedstate/a;", "savedStateRegistry", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C1675I extends C1681O.d implements C1681O.b {

    private Application application;

    private final C1681O.b factory;

    private Bundle defaultArgs;

    private AbstractC1694h lifecycle;

    private a savedStateRegistry;

    public C1675I(Application application, d dVar, Bundle bundle) {
        Intrinsics.checkNotNullParameter(dVar, "owner");
        this.savedStateRegistry = dVar.getSavedStateRegistry();
        this.lifecycle = dVar.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        this.factory = application != null ? C1681O.a.INSTANCE.a(application) : new C1681O.a();
    }

    @Override
    public <T extends AbstractC1678L> T a(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override
    public <T extends AbstractC1678L> T b(Class<T> modelClass, R0.a extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(C1681O.c.f11339d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(C1672F.f11269a) == null || extras.a(C1672F.f11270b) == null) {
            if (this.lifecycle != null) {
                return (T) d(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(C1681O.a.f11332h);
        boolean zIsAssignableFrom = C1687a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? C1676J.c(modelClass, C1676J.f11285b) : C1676J.c(modelClass, C1676J.f11284a);
        return constructorC == null ? (T) this.factory.b(modelClass, extras) : (!zIsAssignableFrom || application == null) ? (T) C1676J.d(modelClass, constructorC, C1672F.a(extras)) : (T) C1676J.d(modelClass, constructorC, application, C1672F.a(extras));
    }

    @Override
    public void c(AbstractC1678L viewModel) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.lifecycle != null) {
            a aVar = this.savedStateRegistry;
            Intrinsics.d(aVar);
            AbstractC1694h abstractC1694h = this.lifecycle;
            Intrinsics.d(abstractC1694h);
            LegacySavedStateHandleController.a(viewModel, aVar, abstractC1694h);
        }
    }

    public final <T extends AbstractC1678L> T d(String key, Class<T> modelClass) throws NoSuchMethodException, SecurityException, IOException {
        T t7;
        Application application;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        AbstractC1694h abstractC1694h = this.lifecycle;
        if (abstractC1694h == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = C1687a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.application == null) ? C1676J.c(modelClass, C1676J.f11285b) : C1676J.c(modelClass, C1676J.f11284a);
        if (constructorC == null) {
            return this.application != null ? (T) this.factory.a(modelClass) : (T) C1681O.c.INSTANCE.a().a(modelClass);
        }
        a aVar = this.savedStateRegistry;
        Intrinsics.d(aVar);
        SavedStateHandleController savedStateHandleControllerB = LegacySavedStateHandleController.b(aVar, abstractC1694h, key, this.defaultArgs);
        if (!zIsAssignableFrom || (application = this.application) == null) {
            t7 = (T) C1676J.d(modelClass, constructorC, savedStateHandleControllerB.getHandle());
        } else {
            Intrinsics.d(application);
            t7 = (T) C1676J.d(modelClass, constructorC, application, savedStateHandleControllerB.getHandle());
        }
        t7.e("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerB);
        return t7;
    }
}
