package androidx.savedstate;

import android.os.Bundle;
import android.view.AbstractC1694h;
import android.view.InterfaceC1698l;
import android.view.InterfaceC1701o;
import androidx.savedstate.Recreator;
import b1.d;
import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m.C2556b;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0003!\u0007\u000eB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000b2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010\u001dR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'R$\u0010+\u001a\u00020$2\u0006\u0010)\u001a\u00020$8G@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010.R\"\u00103\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010%\u001a\u0004\b0\u0010,\"\u0004\b1\u00102¨\u00064"}, d2 = {"Landroidx/savedstate/a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "key", "Landroid/os/Bundle;", "b", "(Ljava/lang/String;)Landroid/os/Bundle;", "Landroidx/savedstate/a$c;", "provider", BuildConfig.FLAVOR, "h", "(Ljava/lang/String;Landroidx/savedstate/a$c;)V", "c", "(Ljava/lang/String;)Landroidx/savedstate/a$c;", "j", "(Ljava/lang/String;)V", "Ljava/lang/Class;", "Landroidx/savedstate/a$a;", "clazz", "i", "(Ljava/lang/Class;)V", "Landroidx/lifecycle/h;", "lifecycle", "e", "(Landroidx/lifecycle/h;)V", "savedState", "f", "(Landroid/os/Bundle;)V", "outBundle", "g", "Lm/b;", "a", "Lm/b;", "components", BuildConfig.FLAVOR, "Z", "attached", "Landroid/os/Bundle;", "restoredState", "<set-?>", "d", "isRestored", "()Z", "Landroidx/savedstate/Recreator$b;", "Landroidx/savedstate/Recreator$b;", "recreatorProvider", "isAllowingSavingState$savedstate_release", "setAllowingSavingState$savedstate_release", "(Z)V", "isAllowingSavingState", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    private static final b f12099g = new b(null);

    private boolean attached;

    private Bundle restoredState;

    private boolean isRestored;

    private Recreator.b recreatorProvider;

    private final C2556b<String, c> components = new C2556b<>();

    private boolean isAllowingSavingState = true;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/savedstate/a$a;", BuildConfig.FLAVOR, "Lb1/d;", "owner", BuildConfig.FLAVOR, "a", "(Lb1/d;)V", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface InterfaceC0118a {
        void a(d owner);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/savedstate/a$b;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/savedstate/a$c;", BuildConfig.FLAVOR, "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface c {
        Bundle a();
    }

    public static final void d(a aVar, InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "this$0");
        Intrinsics.checkNotNullParameter(interfaceC1701o, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(aVar2, "event");
        if (aVar2 == AbstractC1694h.a.ON_START) {
            aVar.isAllowingSavingState = true;
        } else if (aVar2 == AbstractC1694h.a.ON_STOP) {
            aVar.isAllowingSavingState = false;
        }
    }

    public final Bundle b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.isRestored) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.restoredState;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.restoredState = null;
        }
        return bundle2;
    }

    public final c c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Iterator<Map.Entry<String, c>> it = this.components.iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "components");
            String key2 = next.getKey();
            c value = next.getValue();
            if (Intrinsics.b(key2, key)) {
                return value;
            }
        }
        return null;
    }

    public final void e(AbstractC1694h lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.attached) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new InterfaceC1698l() {
            @Override
            public final void j(InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar) {
                androidx.savedstate.a.d(this.f12563d, interfaceC1701o, aVar);
            }
        });
        this.attached = true;
    }

    public final void f(Bundle savedState) {
        if (!this.attached) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.isRestored) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.restoredState = savedState != null ? savedState.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.isRestored = true;
    }

    public final void g(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C2556b<String, c>.d dVarG = this.components.g();
        Intrinsics.checkNotNullExpressionValue(dVarG, "this.components.iteratorWithAdditions()");
        while (dVarG.hasNext()) {
            Map.Entry next = dVarG.next();
            bundle.putBundle((String) next.getKey(), ((c) next.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void h(String key, c provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (this.components.l(key, provider) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class<? extends InterfaceC0118a> clazz) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.isAllowingSavingState) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.b bVar = this.recreatorProvider;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.recreatorProvider = bVar;
        try {
            clazz.getDeclaredConstructor(null);
            Recreator.b bVar2 = this.recreatorProvider;
            if (bVar2 != null) {
                String name = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e7) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
        }
    }

    public final void j(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.components.m(key);
    }
}
