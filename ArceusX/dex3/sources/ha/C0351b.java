package ha;

import K1.e;
import N1.c;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import ha.H;
import ha.c0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.C0412j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b!\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J©\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b+\u00104R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b'\u00107R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b)\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b&\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b#\u00109\u001a\u0004\b5\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b8\u0010;R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b<\u0010?R\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b:\u0010>\u001a\u0004\b2\u0010?R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b0\u0010>\u001a\u0004\b=\u0010?¨\u0006@"}, d2 = {"LJ1/b;", "", "Lha/H;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "LN1/c$a;", "transitionFactory", "LK1/e;", "precision", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "", "allowHardware", "allowRgb565", "Landroid/graphics/drawable/Drawable;", "placeholder", "error", "fallback", "LJ1/a;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Lha/H;Lha/H;Lha/H;Lha/H;LN1/c$a;LK1/e;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;LJ1/a;LJ1/a;LJ1/a;)V", "a", "(Lha/H;Lha/H;Lha/H;Lha/H;LN1/c$a;LK1/e;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;LJ1/a;LJ1/a;LJ1/a;)LJ1/b;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lha/H;", "k", "()Lha/H;", "b", "j", "c", "f", "d", "p", "e", "LN1/c$a;", "q", "()LN1/c$a;", "LK1/e;", "o", "()LK1/e;", "g", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "h", "Z", "()Z", "i", "Landroid/graphics/drawable/Drawable;", "n", "()Landroid/graphics/drawable/Drawable;", "l", "m", "LJ1/a;", "()LJ1/a;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0351b {

    @NotNull
    private final H interceptorDispatcher;

    @NotNull
    private final H fetcherDispatcher;

    @NotNull
    private final H decoderDispatcher;

    @NotNull
    private final H transformationDispatcher;

    @NotNull
    private final c.a transitionFactory;

    @NotNull
    private final e precision;

    @NotNull
    private final Bitmap.Config bitmapConfig;

    private final boolean allowHardware;

    private final boolean allowRgb565;

    private final Drawable placeholder;

    private final Drawable error;

    private final Drawable fallback;

    @NotNull
    private final EnumC0350a memoryCachePolicy;

    @NotNull
    private final EnumC0350a diskCachePolicy;

    @NotNull
    private final EnumC0350a networkCachePolicy;

    public C0351b() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);
    }

    @NotNull
    public final C0351b a(@NotNull H interceptorDispatcher, @NotNull H fetcherDispatcher, @NotNull H decoderDispatcher, @NotNull H transformationDispatcher, @NotNull c.a transitionFactory, @NotNull e precision, @NotNull Bitmap.Config bitmapConfig, boolean allowHardware, boolean allowRgb565, Drawable placeholder, Drawable error, Drawable fallback, @NotNull EnumC0350a memoryCachePolicy, @NotNull EnumC0350a diskCachePolicy, @NotNull EnumC0350a networkCachePolicy) {
        return new C0351b(interceptorDispatcher, fetcherDispatcher, decoderDispatcher, transformationDispatcher, transitionFactory, precision, bitmapConfig, allowHardware, allowRgb565, placeholder, error, fallback, memoryCachePolicy, diskCachePolicy, networkCachePolicy);
    }

    public final boolean getAllowHardware() {
        return this.allowHardware;
    }

    public final boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    @NotNull
    public final Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof C0351b) {
            C0351b c0351b = (C0351b) other;
            if (Intrinsics.b(this.interceptorDispatcher, c0351b.interceptorDispatcher) && Intrinsics.b(this.fetcherDispatcher, c0351b.fetcherDispatcher) && Intrinsics.b(this.decoderDispatcher, c0351b.decoderDispatcher) && Intrinsics.b(this.transformationDispatcher, c0351b.transformationDispatcher) && Intrinsics.b(this.transitionFactory, c0351b.transitionFactory) && this.precision == c0351b.precision && this.bitmapConfig == c0351b.bitmapConfig && this.allowHardware == c0351b.allowHardware && this.allowRgb565 == c0351b.allowRgb565 && Intrinsics.b(this.placeholder, c0351b.placeholder) && Intrinsics.b(this.error, c0351b.error) && Intrinsics.b(this.fallback, c0351b.fallback) && this.memoryCachePolicy == c0351b.memoryCachePolicy && this.diskCachePolicy == c0351b.diskCachePolicy && this.networkCachePolicy == c0351b.networkCachePolicy) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final H getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    @NotNull
    public final EnumC0350a getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public final Drawable getError() {
        return this.error;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.interceptorDispatcher.hashCode() * 31) + this.fetcherDispatcher.hashCode()) * 31) + this.decoderDispatcher.hashCode()) * 31) + this.transformationDispatcher.hashCode()) * 31) + this.transitionFactory.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.bitmapConfig.hashCode()) * 31) + Boolean.hashCode(this.allowHardware)) * 31) + Boolean.hashCode(this.allowRgb565)) * 31;
        Drawable drawable = this.placeholder;
        int iHashCode2 = (iHashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.error;
        int iHashCode3 = (iHashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.fallback;
        return ((((((iHashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode();
    }

    public final Drawable getFallback() {
        return this.fallback;
    }

    @NotNull
    public final H getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    @NotNull
    public final H getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    @NotNull
    public final EnumC0350a getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    @NotNull
    public final EnumC0350a getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    public final Drawable getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    public final e getPrecision() {
        return this.precision;
    }

    @NotNull
    public final H getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    @NotNull
    public final c.a getTransitionFactory() {
        return this.transitionFactory;
    }

    public C0351b(@NotNull H h, @NotNull H h2, @NotNull H h3, @NotNull H h4, @NotNull c.a aVar, @NotNull e eVar, @NotNull Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, @NotNull EnumC0350a enumC0350a, @NotNull EnumC0350a enumC0350a2, @NotNull EnumC0350a enumC0350a3) {
        this.interceptorDispatcher = h;
        this.fetcherDispatcher = h2;
        this.decoderDispatcher = h3;
        this.transformationDispatcher = h4;
        this.transitionFactory = aVar;
        this.precision = eVar;
        this.bitmapConfig = config;
        this.allowHardware = z;
        this.allowRgb565 = z2;
        this.placeholder = drawable;
        this.error = drawable2;
        this.fallback = drawable3;
        this.memoryCachePolicy = enumC0350a;
        this.diskCachePolicy = enumC0350a2;
        this.networkCachePolicy = enumC0350a3;
    }

    public C0351b(H h, H h2, H h3, H h4, c.a aVar, e eVar, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, EnumC0350a enumC0350a, EnumC0350a enumC0350a2, EnumC0350a enumC0350a3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? c0.c().B1() : h, (i & 2) != 0 ? c0.b() : h2, (i & 4) != 0 ? c0.b() : h3, (i & 8) != 0 ? c0.b() : h4, (i & 16) != 0 ? c.a.b : aVar, (i & 32) != 0 ? e.i : eVar, (i & 64) != 0 ? C0412j.f() : config, (i & 128) != 0 ? true : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : drawable, (i & 1024) != 0 ? null : drawable2, (i & 2048) == 0 ? drawable3 : null, (i & 4096) != 0 ? EnumC0350a.i : enumC0350a, (i & 8192) != 0 ? EnumC0350a.i : enumC0350a2, (i & 16384) != 0 ? EnumC0350a.i : enumC0350a3);
    }
}
