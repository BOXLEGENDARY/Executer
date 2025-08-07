package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;
import kotlin.Metadata;
import okio.C0404a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcoil/memory/a;", "Lcoil/memory/g;", "Lcoil/memory/h;", "weakMemoryCache", "<init>", "(Lcoil/memory/h;)V", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$b;", "a", "(Lcoil/memory/MemoryCache$Key;)Lcoil/memory/MemoryCache$b;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", "extras", "", "d", "(Lcoil/memory/MemoryCache$Key;Landroid/graphics/Bitmap;Ljava/util/Map;)V", "c", "()V", "", "level", "b", "(I)V", "Lcoil/memory/h;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements g {

    @NotNull
    private final h weakMemoryCache;

    public a(@NotNull h hVar) {
        this.weakMemoryCache = hVar;
    }

    @Override
    public MemoryCache.Value a(@NotNull MemoryCache.Key key) {
        return null;
    }

    @Override
    public void b(int level) {
    }

    @Override
    public void c() {
    }

    @Override
    public void d(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> extras) {
        this.weakMemoryCache.d(key, bitmap, extras, C0404a.a(bitmap));
    }
}
