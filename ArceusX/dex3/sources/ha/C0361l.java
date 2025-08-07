package ha;

import K1.Size;
import K1.h;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b)\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ§\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u00105\u001a\u0004\b6\u00107R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u00108\u001a\u0004\b-\u00109R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u00108\u001a\u0004\b1\u00109R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b;\u00109R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010>R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bF\u0010HR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b;\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u001a\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b6\u0010I\u001a\u0004\b<\u0010KR\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b3\u0010I\u001a\u0004\bB\u0010K¨\u0006L"}, d2 = {"LJ1/l;", "", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/ColorSpace;", "colorSpace", "LK1/i;", "size", "LK1/h;", "scale", "", "allowInexactSize", "allowRgb565", "premultipliedAlpha", "", "diskCacheKey", "Lokhttp3/Headers;", "headers", "LJ1/r;", "tags", "LJ1/m;", "parameters", "LJ1/a;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;LK1/i;LK1/h;ZZZLjava/lang/String;Lokhttp3/Headers;LJ1/r;LJ1/m;LJ1/a;LJ1/a;LJ1/a;)V", "a", "(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;LK1/i;LK1/h;ZZZLjava/lang/String;Lokhttp3/Headers;LJ1/r;LJ1/m;LJ1/a;LJ1/a;LJ1/a;)LJ1/l;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/content/Context;", "g", "()Landroid/content/Context;", "b", "Landroid/graphics/Bitmap$Config;", "f", "()Landroid/graphics/Bitmap$Config;", "c", "Landroid/graphics/ColorSpace;", "e", "()Landroid/graphics/ColorSpace;", "d", "LK1/i;", "o", "()LK1/i;", "LK1/h;", "n", "()LK1/h;", "Z", "()Z", "h", "m", "i", "Ljava/lang/String;", "()Ljava/lang/String;", "j", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "k", "LJ1/r;", "p", "()LJ1/r;", "l", "LJ1/m;", "()LJ1/m;", "LJ1/a;", "getMemoryCachePolicy", "()LJ1/a;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0361l {

    @NotNull
    private final Context context;

    @NotNull
    private final Bitmap.Config config;

    private final ColorSpace colorSpace;

    @NotNull
    private final Size size;

    @NotNull
    private final h scale;

    private final boolean allowInexactSize;

    private final boolean allowRgb565;

    private final boolean premultipliedAlpha;

    private final String diskCacheKey;

    @NotNull
    private final Headers headers;

    @NotNull
    private final Tags tags;

    @NotNull
    private final Parameters parameters;

    @NotNull
    private final EnumC0350a memoryCachePolicy;

    @NotNull
    private final EnumC0350a diskCachePolicy;

    @NotNull
    private final EnumC0350a networkCachePolicy;

    public C0361l(@NotNull Context context, @NotNull Bitmap.Config config, ColorSpace colorSpace, @NotNull Size size, @NotNull h hVar, boolean z, boolean z2, boolean z3, String str, @NotNull Headers headers, @NotNull Tags tags, @NotNull Parameters parameters, @NotNull EnumC0350a enumC0350a, @NotNull EnumC0350a enumC0350a2, @NotNull EnumC0350a enumC0350a3) {
        this.context = context;
        this.config = config;
        this.colorSpace = colorSpace;
        this.size = size;
        this.scale = hVar;
        this.allowInexactSize = z;
        this.allowRgb565 = z2;
        this.premultipliedAlpha = z3;
        this.diskCacheKey = str;
        this.headers = headers;
        this.tags = tags;
        this.parameters = parameters;
        this.memoryCachePolicy = enumC0350a;
        this.diskCachePolicy = enumC0350a2;
        this.networkCachePolicy = enumC0350a3;
    }

    @NotNull
    public final C0361l a(@NotNull Context context, @NotNull Bitmap.Config config, ColorSpace colorSpace, @NotNull Size size, @NotNull h scale, boolean allowInexactSize, boolean allowRgb565, boolean premultipliedAlpha, String diskCacheKey, @NotNull Headers headers, @NotNull Tags tags, @NotNull Parameters parameters, @NotNull EnumC0350a memoryCachePolicy, @NotNull EnumC0350a diskCachePolicy, @NotNull EnumC0350a networkCachePolicy) {
        return new C0361l(context, config, colorSpace, size, scale, allowInexactSize, allowRgb565, premultipliedAlpha, diskCacheKey, headers, tags, parameters, memoryCachePolicy, diskCachePolicy, networkCachePolicy);
    }

    public final boolean getAllowInexactSize() {
        return this.allowInexactSize;
    }

    public final boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    public final ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof C0361l) {
            C0361l c0361l = (C0361l) other;
            if (Intrinsics.b(this.context, c0361l.context) && this.config == c0361l.config && Intrinsics.b(this.colorSpace, c0361l.colorSpace) && Intrinsics.b(this.size, c0361l.size) && this.scale == c0361l.scale && this.allowInexactSize == c0361l.allowInexactSize && this.allowRgb565 == c0361l.allowRgb565 && this.premultipliedAlpha == c0361l.premultipliedAlpha && Intrinsics.b(this.diskCacheKey, c0361l.diskCacheKey) && Intrinsics.b(this.headers, c0361l.headers) && Intrinsics.b(this.tags, c0361l.tags) && Intrinsics.b(this.parameters, c0361l.parameters) && this.memoryCachePolicy == c0361l.memoryCachePolicy && this.diskCachePolicy == c0361l.diskCachePolicy && this.networkCachePolicy == c0361l.networkCachePolicy) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final Bitmap.Config getConfig() {
        return this.config;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    public int hashCode() {
        int iHashCode = ((this.context.hashCode() * 31) + this.config.hashCode()) * 31;
        ColorSpace colorSpace = this.colorSpace;
        int iHashCode2 = (((((((((((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.size.hashCode()) * 31) + this.scale.hashCode()) * 31) + Boolean.hashCode(this.allowInexactSize)) * 31) + Boolean.hashCode(this.allowRgb565)) * 31) + Boolean.hashCode(this.premultipliedAlpha)) * 31;
        String str = this.diskCacheKey;
        return ((((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.headers.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode();
    }

    @NotNull
    public final EnumC0350a getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    @NotNull
    public final Headers getHeaders() {
        return this.headers;
    }

    @NotNull
    public final EnumC0350a getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    @NotNull
    public final Parameters getParameters() {
        return this.parameters;
    }

    public final boolean getPremultipliedAlpha() {
        return this.premultipliedAlpha;
    }

    @NotNull
    public final h getScale() {
        return this.scale;
    }

    @NotNull
    public final Size getSize() {
        return this.size;
    }

    @NotNull
    public final Tags getTags() {
        return this.tags;
    }
}
