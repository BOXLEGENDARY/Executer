package android.view;

import P9.t;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import com.github.luben.zstd.BuildConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import ka.K;
import ka.M;
import ka.i;
import ka.y;
import kotlin.Metadata;
import kotlin.collections.F;
import kotlin.collections.L;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u0.d;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0002#&B\u001f\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001f\u001a\u00020\u001e\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b!\u0010\u001cR\"\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R$\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030(0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010$R(\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010+0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010$R\u0014\u0010/\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010.¨\u00060"}, d2 = {"Landroidx/lifecycle/E;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "T", "key", BuildConfig.FLAVOR, "hasInitialValue", "initialValue", "Landroidx/lifecycle/w;", "g", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/w;", "Landroidx/savedstate/a$c;", "k", "()Landroidx/savedstate/a$c;", "f", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/w;", "Lka/K;", "h", "(Ljava/lang/String;Ljava/lang/Object;)Lka/K;", BuildConfig.FLAVOR, "i", "()Ljava/util/Set;", "e", "(Ljava/lang/String;)Ljava/lang/Object;", "value", BuildConfig.FLAVOR, "m", "(Ljava/lang/String;Ljava/lang/Object;)V", "j", BuildConfig.FLAVOR, "a", "Ljava/util/Map;", "regular", "b", "savedStateProviders", "Landroidx/lifecycle/E$b;", "c", "liveDatas", "Lka/y;", "d", "flows", "Landroidx/savedstate/a$c;", "savedStateProvider", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C1671E {

    public static final Companion INSTANCE = new Companion(null);

    private static final Class<? extends Object>[] f11261g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    private final Map<String, Object> regular;

    private final Map<String, a.c> savedStateProviders;

    private final Map<String, b<?>> liveDatas;

    private final Map<String, y<Object>> flows;

    private final a.c savedStateProvider;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/E$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/os/Bundle;", "restoredState", "defaultState", "Landroidx/lifecycle/E;", "a", "(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/E;", "value", BuildConfig.FLAVOR, "b", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "Ljava/lang/Class;", "ACCEPTABLE_CLASSES", "[Ljava/lang/Class;", BuildConfig.FLAVOR, "KEYS", "Ljava/lang/String;", "VALUES", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1671E a(Bundle restoredState, Bundle defaultState) {
            if (restoredState == null) {
                if (defaultState == null) {
                    return new C1671E();
                }
                HashMap map = new HashMap();
                for (String str : defaultState.keySet()) {
                    Intrinsics.checkNotNullExpressionValue(str, "key");
                    map.put(str, defaultState.get(str));
                }
                return new C1671E(map);
            }
            ArrayList parcelableArrayList = restoredState.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = restoredState.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                Object obj = parcelableArrayList.get(i7);
                Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i7));
            }
            return new C1671E(linkedHashMap);
        }

        public final boolean b(Object value) {
            if (value == null) {
                return true;
            }
            for (Class cls : C1671E.f11261g) {
                Intrinsics.d(cls);
                if (cls.isInstance(value)) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    public C1671E(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new a.c() {
            @Override
            public final Bundle a() {
                return C1671E.l(this.f11256a);
            }
        };
        linkedHashMap.putAll(map);
    }

    private final <T> C1709w<T> g(String key, boolean hasInitialValue, T initialValue) {
        b<?> bVar;
        b<?> bVar2 = this.liveDatas.get(key);
        b<?> bVar3 = bVar2 instanceof C1709w ? bVar2 : null;
        if (bVar3 != null) {
            return bVar3;
        }
        if (this.regular.containsKey(key)) {
            bVar = new b<>(this, key, this.regular.get(key));
        } else if (hasInitialValue) {
            this.regular.put(key, initialValue);
            bVar = new b<>(this, key, initialValue);
        } else {
            bVar = new b<>(this, key);
        }
        this.liveDatas.put(key, bVar);
        return bVar;
    }

    public static final Bundle l(C1671E c1671e) {
        Intrinsics.checkNotNullParameter(c1671e, "this$0");
        for (Map.Entry entry : F.s(c1671e.savedStateProviders).entrySet()) {
            c1671e.m((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> setKeySet = c1671e.regular.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(c1671e.regular.get(str));
        }
        return d.a(t.a("keys", arrayList), t.a("values", arrayList2));
    }

    public final <T> T e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            j(key);
            return null;
        }
    }

    public final <T> C1709w<T> f(String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return g(key, true, initialValue);
    }

    public final <T> K<T> h(String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, y<Object>> map = this.flows;
        y<Object> yVarA = map.get(key);
        if (yVarA == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            yVarA = M.a(this.regular.get(key));
            this.flows.put(key, yVarA);
            map.put(key, yVarA);
        }
        K<T> kA = i.a(yVarA);
        Intrinsics.e(kA, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return kA;
    }

    public final Set<String> i() {
        return L.h(L.h(this.regular.keySet(), this.savedStateProviders.keySet()), this.liveDatas.keySet());
    }

    public final <T> T j(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t7 = (T) this.regular.remove(key);
        b<?> bVarRemove = this.liveDatas.remove(key);
        if (bVarRemove != null) {
            bVarRemove.p();
        }
        this.flows.remove(key);
        return t7;
    }

    public final a.c getSavedStateProvider() {
        return this.savedStateProvider;
    }

    public final <T> void m(String key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!INSTANCE.b(value)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            Intrinsics.d(value);
            sb.append(value.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        b<?> bVar = this.liveDatas.get(key);
        b<?> bVar2 = bVar instanceof C1709w ? bVar : null;
        if (bVar2 != null) {
            bVar2.o(value);
        } else {
            this.regular.put(key, value);
        }
        y<Object> yVar = this.flows.get(key);
        if (yVar == null) {
            return;
        }
        yVar.setValue(value);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/E$b;", "T", "Landroidx/lifecycle/w;", "Landroidx/lifecycle/E;", "handle", BuildConfig.FLAVOR, "key", "value", "<init>", "(Landroidx/lifecycle/E;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/E;Ljava/lang/String;)V", BuildConfig.FLAVOR, "o", "(Ljava/lang/Object;)V", "p", "()V", "l", "Ljava/lang/String;", "m", "Landroidx/lifecycle/E;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> extends C1709w<T> {

        private String key;

        private C1671E handle;

        public b(C1671E c1671e, String str, T t7) {
            super(t7);
            Intrinsics.checkNotNullParameter(str, "key");
            this.key = str;
            this.handle = c1671e;
        }

        @Override
        public void o(T value) {
            C1671E c1671e = this.handle;
            if (c1671e != null) {
                c1671e.regular.put(this.key, value);
                y yVar = (y) c1671e.flows.get(this.key);
                if (yVar != null) {
                    yVar.setValue(value);
                }
            }
            super.o(value);
        }

        public final void p() {
            this.handle = null;
        }

        public b(C1671E c1671e, String str) {
            Intrinsics.checkNotNullParameter(str, "key");
            this.key = str;
            this.handle = c1671e;
        }
    }

    public C1671E() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new a.c() {
            @Override
            public final Bundle a() {
                return C1671E.l(this.f11256a);
            }
        };
    }
}
