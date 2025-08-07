package ha;

import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.e;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\r\u0010+R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b!\u0010+¨\u0006-"}, d2 = {"LJ1/p;", "LJ1/h;", "Landroid/graphics/drawable/Drawable;", "drawable", "LJ1/g;", "request", "LB1/e;", "dataSource", "Lcoil/memory/MemoryCache$Key;", "memoryCacheKey", "", "diskCacheKey", "", "isSampled", "isPlaceholderCached", "<init>", "(Landroid/graphics/drawable/Drawable;LJ1/g;LB1/e;Lcoil/memory/MemoryCache$Key;Ljava/lang/String;ZZ)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "b", "LJ1/g;", "()LJ1/g;", "c", "LB1/e;", "()LB1/e;", "d", "Lcoil/memory/MemoryCache$Key;", "getMemoryCacheKey", "()Lcoil/memory/MemoryCache$Key;", "e", "Ljava/lang/String;", "getDiskCacheKey", "()Ljava/lang/String;", "f", "Z", "()Z", "g", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0365p extends AbstractC0357h {

    @NotNull
    private final Drawable drawable;

    @NotNull
    private final C0356g request;

    @NotNull
    private final e dataSource;

    private final MemoryCache.Key memoryCacheKey;

    private final String diskCacheKey;

    private final boolean isSampled;

    private final boolean isPlaceholderCached;

    public C0365p(@NotNull Drawable drawable, @NotNull C0356g c0356g, @NotNull e eVar, MemoryCache.Key key, String str, boolean z, boolean z2) {
        super(null);
        this.drawable = drawable;
        this.request = c0356g;
        this.dataSource = eVar;
        this.memoryCacheKey = key;
        this.diskCacheKey = str;
        this.isSampled = z;
        this.isPlaceholderCached = z2;
    }

    @Override
    @NotNull
    public Drawable getDrawable() {
        return this.drawable;
    }

    @Override
    @NotNull
    public C0356g getRequest() {
        return this.request;
    }

    @NotNull
    public final e getDataSource() {
        return this.dataSource;
    }

    public final boolean getIsPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof C0365p) {
            C0365p c0365p = (C0365p) other;
            if (Intrinsics.b(getDrawable(), c0365p.getDrawable()) && Intrinsics.b(getRequest(), c0365p.getRequest()) && this.dataSource == c0365p.dataSource && Intrinsics.b(this.memoryCacheKey, c0365p.memoryCacheKey) && Intrinsics.b(this.diskCacheKey, c0365p.diskCacheKey) && this.isSampled == c0365p.isSampled && this.isPlaceholderCached == c0365p.isPlaceholderCached) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((getDrawable().hashCode() * 31) + getRequest().hashCode()) * 31) + this.dataSource.hashCode()) * 31;
        MemoryCache.Key key = this.memoryCacheKey;
        int iHashCode2 = (iHashCode + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.diskCacheKey;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSampled)) * 31) + Boolean.hashCode(this.isPlaceholderCached);
    }
}
