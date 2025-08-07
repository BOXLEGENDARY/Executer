package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0002\u0017\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0019\u0010\u0003R2\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u001d\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\"¨\u0006$"}, d2 = {"Lcoil/memory/f;", "Lcoil/memory/h;", "<init>", "()V", "", "f", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$b;", "a", "(Lcoil/memory/MemoryCache$Key;)Lcoil/memory/MemoryCache$b;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", "extras", "", "size", "d", "(Lcoil/memory/MemoryCache$Key;Landroid/graphics/Bitmap;Ljava/util/Map;I)V", "c", "level", "b", "(I)V", "e", "Ljava/util/LinkedHashMap;", "Ljava/util/ArrayList;", "Lcoil/memory/f$b;", "Ljava/util/LinkedHashMap;", "getCache$coil_base_release", "()Ljava/util/LinkedHashMap;", "getCache$coil_base_release$annotations", "cache", "I", "operationsSinceCleanUp", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements h {

    @NotNull
    private final LinkedHashMap<MemoryCache.Key, ArrayList<b>> cache = new LinkedHashMap<>();

    private int operationsSinceCleanUp;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcoil/memory/f$b;", "", "", "identityHashCode", "Ljava/lang/ref/WeakReference;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "extras", "size", "<init>", "(ILjava/lang/ref/WeakReference;Ljava/util/Map;I)V", "a", "I", "c", "()I", "b", "Ljava/lang/ref/WeakReference;", "()Ljava/lang/ref/WeakReference;", "Ljava/util/Map;", "()Ljava/util/Map;", "d", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        private final int identityHashCode;

        @NotNull
        private final WeakReference<Bitmap> bitmap;

        @NotNull
        private final Map<String, Object> extras;

        private final int size;

        public b(int i, @NotNull WeakReference<Bitmap> weakReference, @NotNull Map<String, ? extends Object> map, int i2) {
            this.identityHashCode = i;
            this.bitmap = weakReference;
            this.extras = map;
            this.size = i2;
        }

        @NotNull
        public final WeakReference<Bitmap> a() {
            return this.bitmap;
        }

        @NotNull
        public final Map<String, Object> b() {
            return this.extras;
        }

        public final int getIdentityHashCode() {
            return this.identityHashCode;
        }

        public final int getSize() {
            return this.size;
        }
    }

    private final void f() {
        int i = this.operationsSinceCleanUp;
        this.operationsSinceCleanUp = i + 1;
        if (i >= 10) {
            e();
        }
    }

    @Override
    public synchronized MemoryCache.Value a(@NotNull MemoryCache.Key key) {
        try {
            ArrayList<b> arrayList = this.cache.get(key);
            MemoryCache.Value value = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                b bVar = arrayList.get(i);
                Bitmap bitmap = bVar.a().get();
                MemoryCache.Value value2 = bitmap != null ? new MemoryCache.Value(bitmap, bVar.b()) : null;
                if (value2 != null) {
                    value = value2;
                    break;
                }
                i++;
            }
            f();
            return value;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public synchronized void b(int level) {
        if (level >= 10 && level != 20) {
            e();
        }
    }

    @Override
    public synchronized void c() {
        this.operationsSinceCleanUp = 0;
        this.cache.clear();
    }

    @Override
    public synchronized void d(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> extras, int size) {
        try {
            LinkedHashMap<MemoryCache.Key, ArrayList<b>> linkedHashMap = this.cache;
            ArrayList<b> arrayList = linkedHashMap.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(key, arrayList);
            }
            ArrayList<b> arrayList2 = arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            b bVar = new b(iIdentityHashCode, new WeakReference(bitmap), extras, size);
            int size2 = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size2) {
                    arrayList2.add(bVar);
                    break;
                }
                b bVar2 = arrayList2.get(i);
                if (size < bVar2.getSize()) {
                    i++;
                } else if (bVar2.getIdentityHashCode() == iIdentityHashCode && bVar2.a().get() == bitmap) {
                    arrayList2.set(i, bVar);
                } else {
                    arrayList2.add(i, bVar);
                }
            }
            f();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e() {
        WeakReference<Bitmap> weakReferenceA;
        this.operationsSinceCleanUp = 0;
        Iterator<ArrayList<b>> it = this.cache.values().iterator();
        while (it.hasNext()) {
            ArrayList<b> next = it.next();
            if (next.size() <= 1) {
                b bVar = (b) CollectionsKt.firstOrNull(next);
                if (((bVar == null || (weakReferenceA = bVar.a()) == null) ? null : weakReferenceA.get()) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (next.get(i3).a().get() == null) {
                        next.remove(i3);
                        i++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
