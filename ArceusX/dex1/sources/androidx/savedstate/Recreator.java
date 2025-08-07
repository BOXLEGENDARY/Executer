package androidx.savedstate;

import android.os.Bundle;
import android.view.AbstractC1694h;
import android.view.InterfaceC1698l;
import android.view.InterfaceC1701o;
import androidx.savedstate.a;
import b1.d;
import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\t\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/l;", "Lb1/d;", "owner", "<init>", "(Lb1/d;)V", BuildConfig.FLAVOR, "className", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;)V", "Landroidx/lifecycle/o;", "source", "Landroidx/lifecycle/h$a;", "event", "j", "(Landroidx/lifecycle/o;Landroidx/lifecycle/h$a;)V", "d", "Lb1/d;", "e", "b", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Recreator implements InterfaceC1698l {

    private final d owner;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/savedstate/Recreator$b;", "Landroidx/savedstate/a$c;", "Landroidx/savedstate/a;", "registry", "<init>", "(Landroidx/savedstate/a;)V", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", BuildConfig.FLAVOR, "className", BuildConfig.FLAVOR, "b", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "Ljava/util/Set;", "classes", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements a.c {

        private final Set<String> classes;

        public b(a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "registry");
            this.classes = new LinkedHashSet();
            aVar.h("androidx.savedstate.Restarter", this);
        }

        @Override
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.classes));
            return bundle;
        }

        public final void b(String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.classes.add(className);
        }
    }

    public Recreator(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "owner");
        this.owner = dVar;
    }

    private final void a(String className) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(className, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0118a.class);
            Intrinsics.checkNotNullExpressionValue(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((a.InterfaceC0118a) objNewInstance).a(this.owner);
                } catch (Exception e7) {
                    throw new RuntimeException("Failed to instantiate " + className, e7);
                }
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
            }
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException("Class " + className + " wasn't found", e9);
        }
    }

    @Override
    public void j(InterfaceC1701o source, AbstractC1694h.a event) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC1694h.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().d(this);
        Bundle bundleB = this.owner.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if (bundleB == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleB.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
