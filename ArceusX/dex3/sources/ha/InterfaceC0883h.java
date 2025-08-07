package ha;

import N1.a;
import N1.c;
import P9.h;
import P9.i;
import android.content.Context;
import coil.memory.MemoryCache;
import ha.C0351b;
import ha.C0356g;
import ha.InterfaceC0353d;
import ha.InterfaceC0878c;
import ha.InterfaceC0883h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okio.C0410h;
import okio.C0418p;
import okio.C0421t;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lz1/h;", "", "LJ1/g;", "request", "LJ1/d;", "a", "(LJ1/g;)LJ1/d;", "", "shutdown", "()V", "Lz1/b;", "getComponents", "()Lz1/b;", "components", "Lcoil/memory/MemoryCache;", "b", "()Lcoil/memory/MemoryCache;", "memoryCache", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InterfaceC0883h {

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010&\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010#R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00102¨\u00064"}, d2 = {"Lz1/h$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lz1/b;", "components", "h", "(Lz1/b;)Lz1/h$a;", "", "enable", "j", "(Z)Lz1/h$a;", "", "durationMillis", "i", "(I)Lz1/h$a;", "LN1/c$a;", "factory", "k", "(LN1/c$a;)Lz1/h$a;", "Lz1/h;", "d", "()Lz1/h;", "a", "Landroid/content/Context;", "applicationContext", "LJ1/b;", "b", "LJ1/b;", "defaults", "LP9/h;", "Lcoil/memory/MemoryCache;", "c", "LP9/h;", "memoryCache", "LC1/a;", "diskCache", "Lokhttp3/Call$Factory;", "e", "callFactory", "Lz1/c$c;", "f", "Lz1/c$c;", "eventListenerFactory", "g", "Lz1/b;", "componentRegistry", "LO1/p;", "LO1/p;", "options", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        @NotNull
        private final Context applicationContext;

        @NotNull
        private C0351b defaults = C0410h.b();

        private h<? extends MemoryCache> memoryCache = null;

        private h<? extends ha.a> diskCache = null;

        private h<? extends Call.Factory> callFactory = null;

        private InterfaceC0878c.InterfaceC0321c eventListenerFactory = null;

        private C0877b componentRegistry = null;

        @NotNull
        private C0418p options = new C0418p(false, false, false, 0, null, 31, null);

        public a(@NotNull Context context) {
            this.applicationContext = context.getApplicationContext();
        }

        public static final MemoryCache e(a aVar) {
            return new MemoryCache.a(aVar.applicationContext).a();
        }

        public static final ha.a f(a aVar) {
            return C0421t.a.a(aVar.applicationContext);
        }

        public static final OkHttpClient g() {
            return new OkHttpClient();
        }

        @NotNull
        public final InterfaceC0883h d() {
            Context context = this.applicationContext;
            C0351b c0351b = this.defaults;
            h<? extends MemoryCache> hVarB = this.memoryCache;
            if (hVarB == null) {
                hVarB = i.b(new Function0() {
                    public final Object invoke() {
                        return InterfaceC0883h.a.e(this.d);
                    }
                });
            }
            h<? extends MemoryCache> hVar = hVarB;
            h<? extends ha.a> hVarB2 = this.diskCache;
            if (hVarB2 == null) {
                hVarB2 = i.b(new Function0() {
                    public final Object invoke() {
                        return InterfaceC0883h.a.f(this.d);
                    }
                });
            }
            h<? extends ha.a> hVar2 = hVarB2;
            h<? extends Call.Factory> hVarB3 = this.callFactory;
            if (hVarB3 == null) {
                hVarB3 = i.b(new Function0() {
                    public final Object invoke() {
                        return InterfaceC0883h.a.g();
                    }
                });
            }
            h<? extends Call.Factory> hVar3 = hVarB3;
            InterfaceC0878c.InterfaceC0321c interfaceC0321c = this.eventListenerFactory;
            if (interfaceC0321c == null) {
                interfaceC0321c = InterfaceC0878c.InterfaceC0321c.b;
            }
            InterfaceC0878c.InterfaceC0321c interfaceC0321c2 = interfaceC0321c;
            C0877b c0877b = this.componentRegistry;
            if (c0877b == null) {
                c0877b = new C0877b();
            }
            return new C0886k(context, c0351b, hVar, hVar2, hVar3, interfaceC0321c2, c0877b, this.options, null);
        }

        @NotNull
        public final a h(@NotNull C0877b components) {
            this.componentRegistry = components;
            return this;
        }

        @NotNull
        public final a i(int durationMillis) {
            c.a c0040a;
            if (durationMillis > 0) {
                c0040a = new a.C0040a(durationMillis, false, 2, null);
            } else {
                c0040a = c.a.b;
            }
            k(c0040a);
            return this;
        }

        @NotNull
        public final a j(boolean enable) {
            return i(enable ? 100 : 0);
        }

        @NotNull
        public final a k(@NotNull c.a factory) {
            C0351b c0351b = this.defaults;
            this.defaults = c0351b.a((32751 & 1) != 0 ? c0351b.interceptorDispatcher : null, (32751 & 2) != 0 ? c0351b.fetcherDispatcher : null, (32751 & 4) != 0 ? c0351b.decoderDispatcher : null, (32751 & 8) != 0 ? c0351b.transformationDispatcher : null, (32751 & 16) != 0 ? c0351b.transitionFactory : factory, (32751 & 32) != 0 ? c0351b.precision : null, (32751 & 64) != 0 ? c0351b.bitmapConfig : null, (32751 & 128) != 0 ? c0351b.allowHardware : false, (32751 & 256) != 0 ? c0351b.allowRgb565 : false, (32751 & 512) != 0 ? c0351b.placeholder : null, (32751 & 1024) != 0 ? c0351b.error : null, (32751 & 2048) != 0 ? c0351b.fallback : null, (32751 & 4096) != 0 ? c0351b.memoryCachePolicy : null, (32751 & 8192) != 0 ? c0351b.diskCachePolicy : null, (32751 & 16384) != 0 ? c0351b.networkCachePolicy : null);
            return this;
        }
    }

    @NotNull
    InterfaceC0353d a(@NotNull C0356g request);

    MemoryCache b();

    @NotNull
    C0877b getComponents();

    void shutdown();
}
