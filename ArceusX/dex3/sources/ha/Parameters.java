package ha;

import P9.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.F;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.C0405c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 $2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0003%&'B\u001d\b\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ!\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"LJ1/m;", "", "Lkotlin/Pair;", "", "LJ1/m$c;", "", "entries", "<init>", "(Ljava/util/Map;)V", "()V", "", "T", "key", "k", "(Ljava/lang/String;)Ljava/lang/Object;", "", "isEmpty", "()Z", "g", "()Ljava/util/Map;", "", "iterator", "()Ljava/util/Iterator;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "LJ1/m$a;", "j", "()LJ1/m$a;", "d", "Ljava/util/Map;", "e", "c", "a", "b", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Parameters implements Iterable<Pair<? extends String, ? extends Entry>>, ba.a {

    @NotNull
    public static final Parameters i = new Parameters();

    @NotNull
    private final Map<String, Entry> entries;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"LJ1/m$a;", "", "LJ1/m;", "parameters", "<init>", "(LJ1/m;)V", "a", "()LJ1/m;", "", "", "LJ1/m$c;", "Ljava/util/Map;", "entries", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        @NotNull
        private final Map<String, Entry> entries;

        public a(@NotNull Parameters parameters) {
            this.entries = F.u(parameters.entries);
        }

        @NotNull
        public final Parameters a() {
            return new Parameters(C0405c.b(this.entries), null);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\f\u0010\u000b¨\u0006\u0013"}, d2 = {"LJ1/m$c;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "value", "Ljava/lang/String;", "memoryCacheKey", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Entry {

        private final Object value;

        private final String memoryCacheKey;

        public final String getMemoryCacheKey() {
            return this.memoryCacheKey;
        }

        public final Object getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Entry) {
                Entry entry = (Entry) other;
                if (Intrinsics.b(this.value, entry.value) && Intrinsics.b(this.memoryCacheKey, entry.memoryCacheKey)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.value;
            int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
            String str = this.memoryCacheKey;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Entry(value=" + this.value + ", memoryCacheKey=" + this.memoryCacheKey + ')';
        }
    }

    public Parameters(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Parameters) && Intrinsics.b(this.entries, ((Parameters) other).entries);
    }

    @NotNull
    public final Map<String, String> g() {
        if (isEmpty()) {
            return F.h();
        }
        Map<String, Entry> map = this.entries;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Entry> entry : map.entrySet()) {
            String memoryCacheKey = entry.getValue().getMemoryCacheKey();
            if (memoryCacheKey != null) {
                linkedHashMap.put(entry.getKey(), memoryCacheKey);
            }
        }
        return linkedHashMap;
    }

    public int hashCode() {
        return this.entries.hashCode();
    }

    public final boolean isEmpty() {
        return this.entries.isEmpty();
    }

    @Override
    @NotNull
    public Iterator<Pair<? extends String, ? extends Entry>> iterator() {
        Map<String, Entry> map = this.entries;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Entry> entry : map.entrySet()) {
            arrayList.add(t.a(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    @NotNull
    public final a j() {
        return new a(this);
    }

    public final <T> T k(@NotNull String key) {
        Entry entry = this.entries.get(key);
        if (entry != null) {
            return (T) entry.getValue();
        }
        return null;
    }

    @NotNull
    public String toString() {
        return "Parameters(entries=" + this.entries + ')';
    }

    private Parameters(Map<String, Entry> map) {
        this.entries = map;
    }

    public Parameters() {
        this(F.h());
    }
}
