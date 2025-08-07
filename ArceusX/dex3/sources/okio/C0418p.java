package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0011\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016¨\u0006\u0017"}, d2 = {"LO1/p;", "", "", "addLastModifiedToFileCacheKey", "networkObserverEnabled", "respectCacheHeaders", "", "bitmapFactoryMaxParallelism", "LB1/k;", "bitmapFactoryExifOrientationPolicy", "<init>", "(ZZZILB1/k;)V", "a", "Z", "()Z", "b", "d", "c", "e", "I", "()I", "LB1/k;", "()LB1/k;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0418p {

    private final boolean addLastModifiedToFileCacheKey;

    private final boolean networkObserverEnabled;

    private final boolean respectCacheHeaders;

    private final int bitmapFactoryMaxParallelism;

    @NotNull
    private final k bitmapFactoryExifOrientationPolicy;

    public C0418p(boolean z, boolean z2, boolean z3, int i, @NotNull k kVar) {
        this.addLastModifiedToFileCacheKey = z;
        this.networkObserverEnabled = z2;
        this.respectCacheHeaders = z3;
        this.bitmapFactoryMaxParallelism = i;
        this.bitmapFactoryExifOrientationPolicy = kVar;
    }

    public final boolean getAddLastModifiedToFileCacheKey() {
        return this.addLastModifiedToFileCacheKey;
    }

    @NotNull
    public final k getBitmapFactoryExifOrientationPolicy() {
        return this.bitmapFactoryExifOrientationPolicy;
    }

    public final int getBitmapFactoryMaxParallelism() {
        return this.bitmapFactoryMaxParallelism;
    }

    public final boolean getNetworkObserverEnabled() {
        return this.networkObserverEnabled;
    }

    public final boolean getRespectCacheHeaders() {
        return this.respectCacheHeaders;
    }

    public C0418p(boolean z, boolean z2, boolean z3, int i, k kVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) == 0 ? z3 : true, (i2 & 8) != 0 ? 4 : i, (i2 & 16) != 0 ? k.e : kVar);
    }
}
