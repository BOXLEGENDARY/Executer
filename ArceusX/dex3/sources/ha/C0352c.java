package ha;

import K1.e;
import K1.j;
import N1.c;
import android.graphics.Bitmap;
import androidx.lifecycle.h;
import ha.H;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b$\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b.\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b4\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b*\u0010>R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b:\u0010?\u001a\u0004\b\"\u0010@R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b,\u0010?\u001a\u0004\b&\u0010@R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b(\u0010A\u001a\u0004\b8\u0010BR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b4\u0010A\u001a\u0004\b2\u0010BR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b6\u0010A\u001a\u0004\b<\u0010B¨\u0006C"}, d2 = {"LJ1/c;", "", "Landroidx/lifecycle/h;", "lifecycle", "LK1/j;", "sizeResolver", "LK1/h;", "scale", "Lha/H;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "LN1/c$a;", "transitionFactory", "LK1/e;", "precision", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "", "allowHardware", "allowRgb565", "LJ1/a;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Landroidx/lifecycle/h;LK1/j;LK1/h;Lha/H;Lha/H;Lha/H;Lha/H;LN1/c$a;LK1/e;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;LJ1/a;LJ1/a;LJ1/a;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/lifecycle/h;", "h", "()Landroidx/lifecycle/h;", "b", "LK1/j;", "m", "()LK1/j;", "c", "LK1/h;", "l", "()LK1/h;", "d", "Lha/H;", "g", "()Lha/H;", "e", "f", "n", "LN1/c$a;", "o", "()LN1/c$a;", "i", "LK1/e;", "k", "()LK1/e;", "j", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "LJ1/a;", "()LJ1/a;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0352c {

    private final h lifecycle;

    private final j sizeResolver;

    private final K1.h scale;

    private final H interceptorDispatcher;

    private final H fetcherDispatcher;

    private final H decoderDispatcher;

    private final H transformationDispatcher;

    private final c.a transitionFactory;

    private final e precision;

    private final Bitmap.Config bitmapConfig;

    private final Boolean allowHardware;

    private final Boolean allowRgb565;

    private final EnumC0350a memoryCachePolicy;

    private final EnumC0350a diskCachePolicy;

    private final EnumC0350a networkCachePolicy;

    public C0352c(h hVar, j jVar, K1.h hVar2, H h, H h2, H h3, H h4, c.a aVar, e eVar, Bitmap.Config config, Boolean bool, Boolean bool2, EnumC0350a enumC0350a, EnumC0350a enumC0350a2, EnumC0350a enumC0350a3) {
        this.lifecycle = hVar;
        this.sizeResolver = jVar;
        this.scale = hVar2;
        this.interceptorDispatcher = h;
        this.fetcherDispatcher = h2;
        this.decoderDispatcher = h3;
        this.transformationDispatcher = h4;
        this.transitionFactory = aVar;
        this.precision = eVar;
        this.bitmapConfig = config;
        this.allowHardware = bool;
        this.allowRgb565 = bool2;
        this.memoryCachePolicy = enumC0350a;
        this.diskCachePolicy = enumC0350a2;
        this.networkCachePolicy = enumC0350a3;
    }

    public final Boolean getAllowHardware() {
        return this.allowHardware;
    }

    public final Boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    public final Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    public final H getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    public final EnumC0350a getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof C0352c) {
            C0352c c0352c = (C0352c) other;
            if (Intrinsics.b(this.lifecycle, c0352c.lifecycle) && Intrinsics.b(this.sizeResolver, c0352c.sizeResolver) && this.scale == c0352c.scale && Intrinsics.b(this.interceptorDispatcher, c0352c.interceptorDispatcher) && Intrinsics.b(this.fetcherDispatcher, c0352c.fetcherDispatcher) && Intrinsics.b(this.decoderDispatcher, c0352c.decoderDispatcher) && Intrinsics.b(this.transformationDispatcher, c0352c.transformationDispatcher) && Intrinsics.b(this.transitionFactory, c0352c.transitionFactory) && this.precision == c0352c.precision && this.bitmapConfig == c0352c.bitmapConfig && Intrinsics.b(this.allowHardware, c0352c.allowHardware) && Intrinsics.b(this.allowRgb565, c0352c.allowRgb565) && this.memoryCachePolicy == c0352c.memoryCachePolicy && this.diskCachePolicy == c0352c.diskCachePolicy && this.networkCachePolicy == c0352c.networkCachePolicy) {
                return true;
            }
        }
        return false;
    }

    public final H getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    public final H getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    public final h getLifecycle() {
        return this.lifecycle;
    }

    public int hashCode() {
        h hVar = this.lifecycle;
        int iHashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        j jVar = this.sizeResolver;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        K1.h hVar2 = this.scale;
        int iHashCode3 = (iHashCode2 + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        H h = this.interceptorDispatcher;
        int iHashCode4 = (iHashCode3 + (h != null ? h.hashCode() : 0)) * 31;
        H h2 = this.fetcherDispatcher;
        int iHashCode5 = (iHashCode4 + (h2 != null ? h2.hashCode() : 0)) * 31;
        H h3 = this.decoderDispatcher;
        int iHashCode6 = (iHashCode5 + (h3 != null ? h3.hashCode() : 0)) * 31;
        H h4 = this.transformationDispatcher;
        int iHashCode7 = (iHashCode6 + (h4 != null ? h4.hashCode() : 0)) * 31;
        c.a aVar = this.transitionFactory;
        int iHashCode8 = (iHashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        e eVar = this.precision;
        int iHashCode9 = (iHashCode8 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        Bitmap.Config config = this.bitmapConfig;
        int iHashCode10 = (iHashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.allowHardware;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.allowRgb565;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        EnumC0350a enumC0350a = this.memoryCachePolicy;
        int iHashCode13 = (iHashCode12 + (enumC0350a != null ? enumC0350a.hashCode() : 0)) * 31;
        EnumC0350a enumC0350a2 = this.diskCachePolicy;
        int iHashCode14 = (iHashCode13 + (enumC0350a2 != null ? enumC0350a2.hashCode() : 0)) * 31;
        EnumC0350a enumC0350a3 = this.networkCachePolicy;
        return iHashCode14 + (enumC0350a3 != null ? enumC0350a3.hashCode() : 0);
    }

    public final EnumC0350a getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    public final EnumC0350a getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    public final e getPrecision() {
        return this.precision;
    }

    public final K1.h getScale() {
        return this.scale;
    }

    public final j getSizeResolver() {
        return this.sizeResolver;
    }

    public final H getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    public final c.a getTransitionFactory() {
        return this.transitionFactory;
    }
}
