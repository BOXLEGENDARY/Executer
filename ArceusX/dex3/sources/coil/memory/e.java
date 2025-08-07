package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import g0.j;
import java.util.Map;
import kotlin.Metadata;
import okio.C0404a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\b\b*\u0001\u001c\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0014\u0010!\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006#"}, d2 = {"Lcoil/memory/e;", "Lcoil/memory/g;", "", "maxSize", "Lcoil/memory/h;", "weakMemoryCache", "<init>", "(ILcoil/memory/h;)V", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$b;", "a", "(Lcoil/memory/MemoryCache$Key;)Lcoil/memory/MemoryCache$b;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", "extras", "", "d", "(Lcoil/memory/MemoryCache$Key;Landroid/graphics/Bitmap;Ljava/util/Map;)V", "c", "()V", "level", "b", "(I)V", "Lcoil/memory/h;", "coil/memory/e$b", "Lcoil/memory/e$b;", "cache", "g", "()I", "size", "f", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements g {

    @NotNull
    private final h weakMemoryCache;

    @NotNull
    private final b cache;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcoil/memory/e$a;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "", "extras", "", "size", "<init>", "(Landroid/graphics/Bitmap;Ljava/util/Map;I)V", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "I", "()I", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {

        @NotNull
        private final Bitmap bitmap;

        @NotNull
        private final Map<String, Object> extras;

        private final int size;

        public a(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map, int i) {
            this.bitmap = bitmap;
            this.extras = map;
            this.size = i;
        }

        @NotNull
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        @NotNull
        public final Map<String, Object> b() {
            return this.extras;
        }

        public final int getSize() {
            return this.size;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"coil/memory/e$b", "Lg0/j;", "Lcoil/memory/MemoryCache$Key;", "Lcoil/memory/e$a;", "key", "value", "", "n", "(Lcoil/memory/MemoryCache$Key;Lcoil/memory/e$a;)I", "", "evicted", "oldValue", "newValue", "", "m", "(ZLcoil/memory/MemoryCache$Key;Lcoil/memory/e$a;Lcoil/memory/e$a;)V", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends j<MemoryCache.Key, a> {
        final e j;

        b(int i, e eVar) {
            super(i);
            this.j = eVar;
        }

        public void b(boolean evicted, MemoryCache.Key key, a oldValue, a newValue) {
            this.j.weakMemoryCache.d(key, oldValue.getBitmap(), oldValue.b(), oldValue.getSize());
        }

        public int j(MemoryCache.Key key, a value) {
            return value.getSize();
        }
    }

    public e(int i, @NotNull h hVar) {
        this.weakMemoryCache = hVar;
        this.cache = new b(i, this);
    }

    @Override
    public MemoryCache.Value a(@NotNull MemoryCache.Key key) {
        a aVar = (a) this.cache.d(key);
        if (aVar != null) {
            return new MemoryCache.Value(aVar.getBitmap(), aVar.b());
        }
        return null;
    }

    @Override
    public void b(int level) {
        if (level >= 40) {
            c();
        } else {
            if (10 > level || level >= 20) {
                return;
            }
            this.cache.l(g() / 2);
        }
    }

    @Override
    public void c() {
        this.cache.c();
    }

    @Override
    public void d(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> extras) {
        int iA = C0404a.a(bitmap);
        if (iA <= f()) {
            this.cache.f(key, new a(bitmap, extras, iA));
        } else {
            this.cache.g(key);
            this.weakMemoryCache.d(key, bitmap, extras, iA);
        }
    }

    public int f() {
        return this.cache.e();
    }

    public int g() {
        return this.cache.i();
    }
}
