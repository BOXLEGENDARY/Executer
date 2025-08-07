package coil.memory;

import coil.memory.MemoryCache;
import kotlin.Metadata;
import okio.C0405c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcoil/memory/d;", "Lcoil/memory/MemoryCache;", "Lcoil/memory/g;", "strongMemoryCache", "Lcoil/memory/h;", "weakMemoryCache", "<init>", "(Lcoil/memory/g;Lcoil/memory/h;)V", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$b;", "a", "(Lcoil/memory/MemoryCache$Key;)Lcoil/memory/MemoryCache$b;", "value", "", "c", "(Lcoil/memory/MemoryCache$Key;Lcoil/memory/MemoryCache$b;)V", "clear", "()V", "", "level", "b", "(I)V", "Lcoil/memory/g;", "Lcoil/memory/h;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements MemoryCache {

    @NotNull
    private final g strongMemoryCache;

    @NotNull
    private final h weakMemoryCache;

    public d(@NotNull g gVar, @NotNull h hVar) {
        this.strongMemoryCache = gVar;
        this.weakMemoryCache = hVar;
    }

    @Override
    public MemoryCache.Value a(@NotNull MemoryCache.Key key) {
        MemoryCache.Value valueA = this.strongMemoryCache.a(key);
        return valueA == null ? this.weakMemoryCache.a(key) : valueA;
    }

    @Override
    public void b(int level) {
        this.strongMemoryCache.b(level);
        this.weakMemoryCache.b(level);
    }

    @Override
    public void c(@NotNull MemoryCache.Key key, @NotNull MemoryCache.Value value) {
        this.strongMemoryCache.d(MemoryCache.Key.b(key, null, C0405c.b(key.c()), 1, null), value.getBitmap(), C0405c.b(value.b()));
    }

    @Override
    public void clear() {
        this.strongMemoryCache.c();
        this.weakMemoryCache.c();
    }
}
