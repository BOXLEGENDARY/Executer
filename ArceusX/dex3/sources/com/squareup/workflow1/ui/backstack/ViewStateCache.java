package com.squareup.workflow1.ui.backstack;

import P9.t;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import b1.d;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.androidx.WorkflowSavedStateRegistryAggregator;
import com.squareup.workflow1.ui.m;
import i8.C0593e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.collections.L;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.sequences.g;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001(B\u001f\b\u0001\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\t¢\u0006\u0004\b\u000f\u0010\rJ1\u0010\u0014\u001a\u00020\u000b2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\bJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001c¢\u0006\u0004\b \u0010!R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010&¨\u0006)"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "", "", "", "Lcom/squareup/workflow1/ui/backstack/ViewStateFrame;", "viewStates", "<init>", "(Ljava/util/Map;)V", "()V", "", "retaining", "", "e", "(Ljava/util/Collection;)V", "Lcom/squareup/workflow1/ui/m;", "d", "retainedRenderings", "Landroid/view/View;", "oldViewMaybe", "newView", "h", "(Ljava/util/Collection;Landroid/view/View;Landroid/view/View;)V", "key", "Lb1/d;", "parentOwner", "a", "(Ljava/lang/String;Lb1/d;)V", "b", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "from", "f", "(Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;)V", "g", "()Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "Lcom/squareup/workflow1/ui/androidx/WorkflowSavedStateRegistryAggregator;", "Lcom/squareup/workflow1/ui/androidx/WorkflowSavedStateRegistryAggregator;", "stateRegistryAggregator", "Saved", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class ViewStateCache {

    @NotNull
    private final Map<String, ViewStateFrame> viewStates;

    @NotNull
    private final WorkflowSavedStateRegistryAggregator stateRegistryAggregator;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/squareup/workflow1/ui/m;", "it", "", "a", "(Lcom/squareup/workflow1/ui/m;)Ljava/lang/String;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class a extends l implements Function1<m<?>, String> {
        public static final a d = new a();

        a() {
            super(1);
        }

        @NotNull
        public final String invoke(@NotNull m<?> mVar) {
            Intrinsics.checkNotNullParameter(mVar, "it");
            return mVar.getCompatibilityKey();
        }
    }

    public ViewStateCache(@NotNull Map<String, ViewStateFrame> map) {
        Intrinsics.checkNotNullParameter(map, "viewStates");
        this.viewStates = map;
        this.stateRegistryAggregator = new WorkflowSavedStateRegistryAggregator();
    }

    private final void e(Collection<String> retaining) {
        CollectionsKt.B(this.viewStates.keySet(), L.g(this.viewStates.keySet(), retaining));
        this.stateRegistryAggregator.j(retaining);
    }

    public final void a(@NotNull String key, @NotNull d parentOwner) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parentOwner, "parentOwner");
        this.stateRegistryAggregator.f(key, parentOwner);
    }

    public final void b() {
        this.stateRegistryAggregator.g();
    }

    @NotNull
    public final Map<String, ViewStateFrame> c() {
        return this.viewStates;
    }

    public final void d(@NotNull Collection<? extends m<?>> retaining) {
        Intrinsics.checkNotNullParameter(retaining, "retaining");
        Collection<? extends m<?>> collection = retaining;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((m) it.next()).getCompatibilityKey());
        }
        e(arrayList);
    }

    public final void f(@NotNull Saved from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.viewStates.clear();
        this.viewStates.putAll(from.a());
    }

    @NotNull
    public final Saved g() {
        return new Saved(this);
    }

    public final void h(@NotNull Collection<? extends m<?>> retainedRenderings, View oldViewMaybe, @NotNull View newView) {
        Intrinsics.checkNotNullParameter(retainedRenderings, "retainedRenderings");
        Intrinsics.checkNotNullParameter(newView, "newView");
        String strB = C0593e.b(newView);
        Set setT = g.t(g.q(CollectionsKt.E(retainedRenderings), a.d));
        if (retainedRenderings.size() != setT.size()) {
            throw new IllegalArgumentException(("Duplicate entries not allowed in " + retainedRenderings + '.').toString());
        }
        this.stateRegistryAggregator.h(newView, strB);
        ViewStateFrame viewStateFrameRemove = this.viewStates.remove(strB);
        if (viewStateFrameRemove != null) {
            newView.restoreHierarchyState(viewStateFrameRemove.a());
        }
        if (oldViewMaybe != null) {
            String strB2 = C0593e.b(oldViewMaybe);
            if (!setT.contains(strB2)) {
                strB2 = null;
            }
            if (strB2 != null) {
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                oldViewMaybe.saveHierarchyState(sparseArray);
                Map<String, ViewStateFrame> mapC = c();
                Pair pairA = t.a(strB2, new ViewStateFrame(strB2, sparseArray));
                mapC.put(pairA.c(), pairA.d());
                this.stateRegistryAggregator.m(strB2);
            }
        }
        e(L.i(setT, strB));
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0016B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "Landroid/os/Parcelable;", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "viewStateCache", "<init>", "(Lcom/squareup/workflow1/ui/backstack/ViewStateCache;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "", "Lcom/squareup/workflow1/ui/backstack/ViewStateFrame;", "d", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "viewStates", "CREATOR", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class Saved implements Parcelable {

        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final Map<String, ViewStateFrame> viewStates;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "<init>", "()V", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "", "size", "", "b", "(I)[Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<Saved> {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override
            @NotNull
            public Saved createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new Saved(source);
            }

            @Override
            @NotNull
            public Saved[] newArray(int size) {
                return new Saved[size];
            }

            private Companion() {
            }
        }

        public Saved(@NotNull ViewStateCache viewStateCache) {
            Intrinsics.checkNotNullParameter(viewStateCache, "viewStateCache");
            this.viewStates = F.s(viewStateCache.c());
        }

        @NotNull
        public final Map<String, ViewStateFrame> a() {
            return this.viewStates;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NotNull Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeMap(this.viewStates);
        }

        public Saved(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "source");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            parcel.readMap(D.b(linkedHashMap), ViewStateCache.class.getClassLoader());
            this.viewStates = F.s(linkedHashMap);
        }
    }

    public ViewStateCache() {
        this(new LinkedHashMap());
    }
}
