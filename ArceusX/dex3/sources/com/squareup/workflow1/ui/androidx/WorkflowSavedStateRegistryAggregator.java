package com.squareup.workflow1.ui.androidx;

import P9.t;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.T;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.o;
import androidx.savedstate.a;
import b1.d;
import b1.e;
import com.roblox.client.personasdk.R;
import h8.C0583a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001-\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0003J\u001d\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00062\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d¢\u0006\u0004\b\u001f\u0010 R$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010#R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/squareup/workflow1/ui/androidx/WorkflowSavedStateRegistryAggregator;", "", "<init>", "()V", "Lh8/a;", "child", "", "n", "(Lh8/a;)V", "l", "Landroid/os/Bundle;", "o", "()Landroid/os/Bundle;", "restoredState", "k", "(Landroid/os/Bundle;)V", "", "key", "Lb1/d;", "parentOwner", "f", "(Ljava/lang/String;Lb1/d;)V", "g", "Landroid/view/View;", "view", "h", "(Landroid/view/View;Ljava/lang/String;)V", "m", "(Ljava/lang/String;)V", "", "keysToKeep", "j", "(Ljava/util/Collection;)V", "", "a", "Ljava/util/Map;", "states", "b", "Lb1/d;", "parentRegistryOwner", "c", "Ljava/lang/String;", "parentKey", "d", "children", "com/squareup/workflow1/ui/androidx/WorkflowSavedStateRegistryAggregator$lifecycleObserver$1", "e", "Lcom/squareup/workflow1/ui/androidx/WorkflowSavedStateRegistryAggregator$lifecycleObserver$1;", "lifecycleObserver", "", "i", "()Z", "isRestored", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class WorkflowSavedStateRegistryAggregator {

    private Map<String, Bundle> states;

    private d parentRegistryOwner;

    private String parentKey;

    @NotNull
    private final Map<String, C0583a> children = new LinkedHashMap();

    @NotNull
    private final WorkflowSavedStateRegistryAggregator$lifecycleObserver$1 lifecycleObserver = new l() {
        public void j(@NotNull o source, @NotNull h.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event != h.a.ON_CREATE) {
                throw new IllegalStateException(Intrinsics.m("Expected to receive ON_CREATE event before anything else, but got ", event).toString());
            }
            if (this.d.i()) {
                throw new IllegalStateException("Expected not to be observing lifecycle after restoration.");
            }
            source.getLifecycle().d(this);
            WorkflowSavedStateRegistryAggregator workflowSavedStateRegistryAggregator = this.d;
            d dVar = workflowSavedStateRegistryAggregator.parentRegistryOwner;
            Intrinsics.d(dVar);
            a savedStateRegistry = dVar.getSavedStateRegistry();
            String str = this.d.parentKey;
            Intrinsics.d(str);
            workflowSavedStateRegistryAggregator.k(savedStateRegistry.b(str));
        }
    };

    public final boolean i() {
        return this.states != null;
    }

    public final void k(Bundle restoredState) {
        Set<String> setKeySet;
        if (this.states != null) {
            throw new IllegalStateException("Expected performRestore to be called only once.");
        }
        this.states = new LinkedHashMap();
        if (restoredState != null && (setKeySet = restoredState.keySet()) != null) {
            for (String str : setKeySet) {
                Map<String, Bundle> map = this.states;
                Intrinsics.d(map);
                Bundle bundle = restoredState.getBundle(str);
                Intrinsics.d(bundle);
                Pair pairA = t.a(str, bundle);
                map.put(pairA.c(), pairA.d());
            }
        }
        for (C0583a c0583a : this.children.values()) {
            if (c0583a.getLifecycle().b() == h.b.e) {
                l(c0583a);
            }
        }
    }

    private final void l(C0583a child) {
        Map<String, Bundle> map = this.states;
        if (map == null) {
            return;
        }
        child.getController().d(map.remove(child.getKey()));
    }

    private final void n(C0583a child) {
        Map<String, Bundle> map = this.states;
        if (map == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        child.getController().e(bundle);
        Pair pairA = t.a(child.getKey(), bundle);
        map.put(pairA.c(), pairA.d());
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        Map<String, Bundle> map = this.states;
        if (map != null) {
            Iterator<T> it = this.children.values().iterator();
            while (it.hasNext()) {
                n((C0583a) it.next());
            }
            for (Map.Entry<String, Bundle> entry : map.entrySet()) {
                bundle.putBundle(entry.getKey(), entry.getValue());
            }
        }
        return bundle;
    }

    public final void f(@NotNull String key, @NotNull d parentOwner) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parentOwner, "parentOwner");
        g();
        this.parentRegistryOwner = parentOwner;
        this.parentKey = key;
        if (i()) {
            return;
        }
        a savedStateRegistry = parentOwner.getSavedStateRegistry();
        Intrinsics.checkNotNullExpressionValue(savedStateRegistry, "parentOwner.savedStateRegistry");
        h lifecycle = parentOwner.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "parentOwner.lifecycle");
        try {
            savedStateRegistry.h(key, new a.c() {
                public final Bundle a() {
                    return this.a.o();
                }
            });
            lifecycle.a(this.lifecycleObserver);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Error registering SavedStateProvider: key \"" + key + "\" is already in use on parent SavedStateRegistryOwner " + parentOwner + ".\nThis is most easily remedied by giving your container Screen rendering a unique Compatible.compatibilityKey, perhaps by wrapping it with Named.", e);
        }
    }

    public final void g() {
        h lifecycle;
        a savedStateRegistry;
        d dVar = this.parentRegistryOwner;
        if (dVar != null && (savedStateRegistry = dVar.getSavedStateRegistry()) != null) {
            String str = this.parentKey;
            Intrinsics.d(str);
            savedStateRegistry.j(str);
        }
        d dVar2 = this.parentRegistryOwner;
        if (dVar2 != null && (lifecycle = dVar2.getLifecycle()) != null) {
            lifecycle.d(this.lifecycleObserver);
        }
        this.parentRegistryOwner = null;
        this.parentKey = null;
    }

    public final void h(@NotNull View view, @NotNull String key) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(key, "key");
        o oVarA = T.a(view);
        if (oVarA == null) {
            throw new IllegalArgumentException(("Expected " + view + '(' + key + ") to have a ViewTreeLifecycleOwner. Use WorkflowLifecycleOwner to fix that.").toString());
        }
        C0583a c0583a = new C0583a(key, oVarA);
        if (this.children.put(key, c0583a) != null) {
            throw new IllegalArgumentException(key + " is already in use, it cannot be used to register " + view);
        }
        d dVarA = e.a(view);
        if (dVarA == null) {
            e.b(view, c0583a);
            l(c0583a);
        } else {
            throw new IllegalArgumentException(view + " already has ViewTreeSavedStateRegistryOwner: " + dVarA);
        }
    }

    public final void j(@NotNull Collection<String> keysToKeep) {
        Intrinsics.checkNotNullParameter(keysToKeep, "keysToKeep");
        Collection<String> collection = keysToKeep;
        Iterator it = L.g(this.children.keySet(), collection).iterator();
        while (it.hasNext()) {
            this.children.remove((String) it.next());
        }
        Map<String, Bundle> map = this.states;
        if (map == null) {
            return;
        }
        CollectionsKt.B(map.keySet(), L.g(map.keySet(), collection));
    }

    public final void m(@NotNull String key) {
        Unit unit;
        Intrinsics.checkNotNullParameter(key, "key");
        C0583a c0583aRemove = this.children.remove(key);
        if (c0583aRemove == null) {
            unit = null;
        } else {
            n(c0583aRemove);
            unit = Unit.a;
        }
        if (unit == null) {
            throw new IllegalArgumentException(Intrinsics.m("No such child: ", key));
        }
    }
}
