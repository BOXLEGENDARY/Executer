package ha;

import K1.Size;
import K1.c;
import K1.h;
import L1.a;
import L1.b;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import coil.request.BaseRequestDelegate;
import coil.request.ViewTargetRequestDelegate;
import ha.InterfaceC0883h;
import ha.z0;
import kotlin.Metadata;
import kotlin.collections.i;
import kotlin.jvm.internal.Intrinsics;
import okio.C0404a;
import okio.C0408f;
import okio.C0410h;
import okio.C0412j;
import okio.ComponentCallbacks2C0422u;
import okio.InterfaceC0417o;
import okio.InterfaceC0420s;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010-¨\u0006/"}, d2 = {"LJ1/o;", "", "Lz1/h;", "imageLoader", "LO1/u;", "systemCallbacks", "LO1/s;", "logger", "<init>", "(Lz1/h;LO1/u;LO1/s;)V", "LJ1/l;", "options", "", "b", "(LJ1/l;)Z", "LJ1/g;", "request", "LK1/i;", "size", "d", "(LJ1/g;LK1/i;)Z", "e", "(LJ1/g;)Z", "initialRequest", "Lha/z0;", "job", "LJ1/n;", "g", "(LJ1/g;Lha/z0;)LJ1/n;", "", "throwable", "LJ1/e;", "a", "(LJ1/g;Ljava/lang/Throwable;)LJ1/e;", "f", "(LJ1/g;LK1/i;)LJ1/l;", "Landroid/graphics/Bitmap$Config;", "requestedConfig", "c", "(LJ1/g;Landroid/graphics/Bitmap$Config;)Z", "h", "(LJ1/l;)LJ1/l;", "Lz1/h;", "LO1/u;", "LO1/o;", "LO1/o;", "hardwareBitmapService", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0364o {

    @NotNull
    private final InterfaceC0883h imageLoader;

    @NotNull
    private final ComponentCallbacks2C0422u systemCallbacks;

    @NotNull
    private final InterfaceC0417o hardwareBitmapService;

    public C0364o(@NotNull InterfaceC0883h interfaceC0883h, @NotNull ComponentCallbacks2C0422u componentCallbacks2C0422u, InterfaceC0420s interfaceC0420s) {
        this.imageLoader = interfaceC0883h;
        this.systemCallbacks = componentCallbacks2C0422u;
        this.hardwareBitmapService = C0408f.a(interfaceC0420s);
    }

    private final boolean b(C0361l options) {
        return !C0404a.d(options.getConfig()) || this.hardwareBitmapService.getAllowHardware();
    }

    private final boolean d(C0356g request, Size size) {
        if (C0404a.d(request.getBitmapConfig())) {
            return c(request, request.getBitmapConfig()) && this.hardwareBitmapService.a(size);
        }
        return true;
    }

    private final boolean e(C0356g request) {
        return request.O().isEmpty() || i.w(C0412j.o(), request.getBitmapConfig());
    }

    @NotNull
    public final C0354e a(@NotNull C0356g request, @NotNull Throwable throwable) {
        Drawable drawableT;
        if (!(throwable instanceof C0359j) || (drawableT = request.u()) == null) {
            drawableT = request.t();
        }
        return new C0354e(drawableT, request, throwable);
    }

    public final boolean c(@NotNull C0356g request, @NotNull Bitmap.Config requestedConfig) {
        if (!C0404a.d(requestedConfig)) {
            return true;
        }
        if (!request.getAllowHardware()) {
            return false;
        }
        a target = request.getTarget();
        if (target instanceof b) {
            View view = ((b) target).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final C0361l f(@NotNull C0356g request, @NotNull Size size) {
        Bitmap.Config bitmapConfig = (e(request) && d(request, size)) ? request.getBitmapConfig() : Bitmap.Config.ARGB_8888;
        c cVarD = size.d();
        c.b bVar = c.b.a;
        return new C0361l(request.getContext(), bitmapConfig, request.getColorSpace(), size, (Intrinsics.b(cVarD, bVar) || Intrinsics.b(size.c(), bVar)) ? h.e : request.getScale(), C0410h.a(request), request.getAllowRgb565() && request.O().isEmpty() && bitmapConfig != Bitmap.Config.ALPHA_8, request.getPremultipliedAlpha(), request.getDiskCacheKey(), request.getHeaders(), request.getTags(), request.getParameters(), request.getMemoryCachePolicy(), request.getDiskCachePolicy(), request.getNetworkCachePolicy());
    }

    @NotNull
    public final InterfaceC0363n g(@NotNull C0356g initialRequest, @NotNull z0 job) {
        androidx.lifecycle.h lifecycle = initialRequest.getLifecycle();
        a target = initialRequest.getTarget();
        return target instanceof b ? new ViewTargetRequestDelegate(this.imageLoader, initialRequest, (b) target, lifecycle, job) : new BaseRequestDelegate(lifecycle, job);
    }

    @NotNull
    public final C0361l h(@NotNull C0361l options) {
        boolean z;
        Bitmap.Config config;
        EnumC0350a enumC0350a;
        Bitmap.Config config2 = options.getConfig();
        EnumC0350a networkCachePolicy = options.getNetworkCachePolicy();
        boolean z2 = true;
        if (b(options)) {
            z = false;
            config = config2;
        } else {
            config = Bitmap.Config.ARGB_8888;
            z = true;
        }
        if (!options.getNetworkCachePolicy().getReadEnabled() || this.systemCallbacks.b()) {
            enumC0350a = networkCachePolicy;
            z2 = z;
        } else {
            enumC0350a = EnumC0350a.y;
        }
        return z2 ? options.a((16381 & 1) != 0 ? options.context : null, (16381 & 2) != 0 ? options.config : config, (16381 & 4) != 0 ? options.colorSpace : null, (16381 & 8) != 0 ? options.size : null, (16381 & 16) != 0 ? options.scale : null, (16381 & 32) != 0 ? options.allowInexactSize : false, (16381 & 64) != 0 ? options.allowRgb565 : false, (16381 & 128) != 0 ? options.premultipliedAlpha : false, (16381 & 256) != 0 ? options.diskCacheKey : null, (16381 & 512) != 0 ? options.headers : null, (16381 & 1024) != 0 ? options.tags : null, (16381 & 2048) != 0 ? options.parameters : null, (16381 & 4096) != 0 ? options.memoryCachePolicy : null, (16381 & 8192) != 0 ? options.diskCachePolicy : null, (16381 & 16384) != 0 ? options.networkCachePolicy : enumC0350a) : options;
    }
}
