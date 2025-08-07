package coil.memory;

import K1.Size;
import K1.c;
import P9.m;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache;
import ha.C0330a;
import ha.C0356g;
import ha.C0361l;
import ha.C0364o;
import ha.C0365p;
import ha.InterfaceC0333b;
import ha.InterfaceC0878c;
import ha.InterfaceC0883h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.F;
import kotlin.jvm.internal.Intrinsics;
import okio.C0404a;
import okio.C0410h;
import okio.C0412j;
import okio.InterfaceC0420s;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000  2\u00020\u0001:\u0001\u001eB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b \u0010\u0016J'\u0010#\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J-\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u00020\u0014*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\u0004\u0018\u000100*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u00101¨\u00063"}, d2 = {"Lcoil/memory/c;", "", "Lz1/h;", "imageLoader", "LJ1/o;", "requestService", "LO1/s;", "logger", "<init>", "(Lz1/h;LJ1/o;LO1/s;)V", "LJ1/g;", "request", "Lcoil/memory/MemoryCache$Key;", "cacheKey", "Lcoil/memory/MemoryCache$b;", "cacheValue", "LK1/i;", "size", "LK1/h;", "scale", "", "e", "(LJ1/g;Lcoil/memory/MemoryCache$Key;Lcoil/memory/MemoryCache$b;LK1/i;LK1/h;)Z", "mappedData", "LJ1/l;", "options", "Lz1/c;", "eventListener", "f", "(LJ1/g;Ljava/lang/Object;LJ1/l;Lz1/c;)Lcoil/memory/MemoryCache$Key;", "a", "(LJ1/g;Lcoil/memory/MemoryCache$Key;LK1/i;LK1/h;)Lcoil/memory/MemoryCache$b;", "c", "LF1/a$b;", "result", "h", "(Lcoil/memory/MemoryCache$Key;LJ1/g;LF1/a$b;)Z", "LF1/b$a;", "chain", "LJ1/p;", "g", "(LF1/b$a;LJ1/g;Lcoil/memory/MemoryCache$Key;Lcoil/memory/MemoryCache$b;)LJ1/p;", "Lz1/h;", "b", "LJ1/o;", "d", "(Lcoil/memory/MemoryCache$b;)Z", "isSampled", "", "(Lcoil/memory/MemoryCache$b;)Ljava/lang/String;", "diskCacheKey", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    @NotNull
    private final InterfaceC0883h imageLoader;

    @NotNull
    private final C0364o requestService;

    public c(@NotNull InterfaceC0883h interfaceC0883h, @NotNull C0364o c0364o, InterfaceC0420s interfaceC0420s) {
        this.imageLoader = interfaceC0883h;
        this.requestService = c0364o;
    }

    private final String b(MemoryCache.Value value) {
        Object obj = value.b().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final boolean d(MemoryCache.Value value) {
        Object obj = value.b().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean e(C0356g request, MemoryCache.Key cacheKey, MemoryCache.Value cacheValue, Size size, K1.h scale) throws m {
        boolean zD = d(cacheValue);
        if (K1.b.b(size)) {
            return !zD;
        }
        String str = cacheKey.c().get("coil#transformation_size");
        if (str != null) {
            return Intrinsics.b(str, size.toString());
        }
        int width = cacheValue.getBitmap().getWidth();
        int height = cacheValue.getBitmap().getHeight();
        K1.c cVarD = size.d();
        int i = cVarD instanceof c.a ? ((c.a) cVarD).px : Integer.MAX_VALUE;
        K1.c cVarC = size.c();
        int i2 = cVarC instanceof c.a ? ((c.a) cVarC).px : Integer.MAX_VALUE;
        double dC = okio.g.c(width, height, i, i2, scale);
        boolean zA = C0410h.a(request);
        if (zA) {
            double dE = kotlin.ranges.b.e(dC, 1.0d);
            if (Math.abs(i - (width * dE)) <= 1.0d || Math.abs(i2 - (dE * height)) <= 1.0d) {
                return true;
            }
        } else if ((C0412j.s(i) || Math.abs(i - width) <= 1) && (C0412j.s(i2) || Math.abs(i2 - height) <= 1)) {
            return true;
        }
        if (dC == 1.0d || zA) {
            return dC <= 1.0d || !zD;
        }
        return false;
    }

    public final MemoryCache.Value a(@NotNull C0356g request, @NotNull MemoryCache.Key cacheKey, @NotNull Size size, @NotNull K1.h scale) {
        if (!request.getMemoryCachePolicy().getReadEnabled()) {
            return null;
        }
        MemoryCache memoryCacheB = this.imageLoader.b();
        MemoryCache.Value valueA = memoryCacheB != null ? memoryCacheB.a(cacheKey) : null;
        if (valueA == null || !c(request, cacheKey, valueA, size, scale)) {
            return null;
        }
        return valueA;
    }

    public final boolean c(@NotNull C0356g request, @NotNull MemoryCache.Key cacheKey, @NotNull MemoryCache.Value cacheValue, @NotNull Size size, @NotNull K1.h scale) {
        if (this.requestService.c(request, C0404a.c(cacheValue.getBitmap()))) {
            return e(request, cacheKey, cacheValue, size, scale);
        }
        return false;
    }

    public final MemoryCache.Key f(@NotNull C0356g request, @NotNull Object mappedData, @NotNull C0361l options, @NotNull InterfaceC0878c eventListener) {
        MemoryCache.Key memoryCacheKey = request.getMemoryCacheKey();
        if (memoryCacheKey != null) {
            return memoryCacheKey;
        }
        eventListener.k(request, mappedData);
        String strF = this.imageLoader.getComponents().f(mappedData, options);
        eventListener.g(request, strF);
        if (strF == null) {
            return null;
        }
        List<M1.a> listO = request.O();
        Map<String, String> mapG = request.getParameters().g();
        if (listO.isEmpty() && mapG.isEmpty()) {
            return new MemoryCache.Key(strF, null, 2, null);
        }
        Map mapU = F.u(mapG);
        if (!listO.isEmpty()) {
            List<M1.a> listO2 = request.O();
            int size = listO2.size();
            for (int i = 0; i < size; i++) {
                mapU.put("coil#transformation_" + i, listO2.get(i).b());
            }
            mapU.put("coil#transformation_size", options.getSize().toString());
        }
        return new MemoryCache.Key(strF, mapU);
    }

    @NotNull
    public final C0365p g(@NotNull InterfaceC0333b.a chain, @NotNull C0356g request, @NotNull MemoryCache.Key cacheKey, @NotNull MemoryCache.Value cacheValue) {
        return new C0365p(new BitmapDrawable(request.getContext().getResources(), cacheValue.getBitmap()), request, okio.e.d, cacheKey, b(cacheValue), d(cacheValue), C0412j.t(chain));
    }

    public final boolean h(MemoryCache.Key cacheKey, @NotNull C0356g request, @NotNull C0330a.b result) {
        MemoryCache memoryCacheB;
        Bitmap bitmap;
        if (request.getMemoryCachePolicy().getWriteEnabled() && (memoryCacheB = this.imageLoader.b()) != null && cacheKey != null) {
            Drawable drawable = result.getDrawable();
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(result.getIsSampled()));
                String diskCacheKey = result.getDiskCacheKey();
                if (diskCacheKey != null) {
                    linkedHashMap.put("coil#disk_cache_key", diskCacheKey);
                }
                memoryCacheB.c(cacheKey, new MemoryCache.Value(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
