package ha;

import E1.a;
import E1.b;
import E1.c;
import E1.e;
import E1.f;
import E1.j;
import E1.k;
import E1.l;
import H1.g;
import K1.Size;
import P9.h;
import P9.p;
import S9.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import coil.memory.MemoryCache;
import ha.AbstractC0357h;
import ha.C0330a;
import ha.C0334c;
import ha.C0351b;
import ha.C0354e;
import ha.C0356g;
import ha.C0360k;
import ha.C0364o;
import ha.I;
import ha.InterfaceC0333b;
import ha.InterfaceC0353d;
import ha.InterfaceC0878c;
import ha.M;
import ha.N;
import ha.T;
import ha.V0;
import ha.a;
import ha.c0;
import ha.z0;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okio.C0412j;
import okio.C0418p;
import okio.ComponentCallbacks2C0422u;
import okio.InterfaceC0420s;
import okio.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 e2\u00020\u0001:\u0001.Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0083@¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020'2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020$2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020\u0017H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020$2\u0006\u00100\u001a\u00020\u0019H\u0000¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020$H\u0016¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010?R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010=\u001a\u0004\bB\u0010?R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010NR\u0014\u0010R\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010QR\u0014\u0010U\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010TR\u001a\u0010W\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010F\u001a\u0004\bV\u0010HR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010ZR\u0014\u00103\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010_\u001a\u0004\bI\u0010`R\u001d\u0010d\u001a\u0004\u0018\u00010\u00078VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b8\u0010a*\u0004\bb\u0010c¨\u0006f"}, d2 = {"Lz1/k;", "Lz1/h;", "Landroid/content/Context;", "context", "LJ1/b;", "defaults", "LP9/h;", "Lcoil/memory/MemoryCache;", "memoryCacheLazy", "LC1/a;", "diskCacheLazy", "Lokhttp3/Call$Factory;", "callFactoryLazy", "Lz1/c$c;", "eventListenerFactory", "Lz1/b;", "componentRegistry", "LO1/p;", "options", "LO1/s;", "logger", "<init>", "(Landroid/content/Context;LJ1/b;LP9/h;LP9/h;LP9/h;Lz1/c$c;Lz1/b;LO1/p;LO1/s;)V", "LJ1/g;", "initialRequest", "", "type", "LJ1/h;", "e", "(LJ1/g;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LJ1/p;", "result", "LL1/a;", "target", "Lz1/c;", "eventListener", "", "l", "(LJ1/p;LL1/a;Lz1/c;)V", "LJ1/e;", "k", "(LJ1/e;LL1/a;Lz1/c;)V", "request", "j", "(LJ1/g;Lz1/c;)V", "LJ1/d;", "a", "(LJ1/g;)LJ1/d;", "level", "m", "(I)V", "shutdown", "()V", "Landroid/content/Context;", "f", "()Landroid/content/Context;", "b", "LJ1/b;", "g", "()LJ1/b;", "c", "LP9/h;", "getMemoryCacheLazy", "()LP9/h;", "d", "getDiskCacheLazy", "getCallFactoryLazy", "Lz1/c$c;", "getEventListenerFactory", "()Lz1/c$c;", "Lz1/b;", "getComponentRegistry", "()Lz1/b;", "h", "LO1/p;", "i", "()LO1/p;", "Lha/L;", "Lha/L;", "scope", "LO1/u;", "LO1/u;", "systemCallbacks", "LJ1/o;", "LJ1/o;", "requestService", "getComponents", "components", "", "LF1/b;", "Ljava/util/List;", "interceptors", "Ljava/util/concurrent/atomic/AtomicBoolean;", "n", "Ljava/util/concurrent/atomic/AtomicBoolean;", "LO1/s;", "()LO1/s;", "()Lcoil/memory/MemoryCache;", "getMemoryCache$delegate", "(Lz1/k;)Ljava/lang/Object;", "memoryCache", "o", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0886k implements InterfaceC0883h {

    @NotNull
    private final Context context;

    @NotNull
    private final C0351b defaults;

    @NotNull
    private final h<MemoryCache> memoryCacheLazy;

    @NotNull
    private final h<a> diskCacheLazy;

    @NotNull
    private final h<Call.Factory> callFactoryLazy;

    @NotNull
    private final InterfaceC0878c.InterfaceC0321c eventListenerFactory;

    @NotNull
    private final C0877b componentRegistry;

    @NotNull
    private final C0418p options;

    @NotNull
    private final ha.L scope = M.a(V0.b((z0) null, 1, (Object) null).K(c0.c().B1()).K(new e(I.r, this)));

    @NotNull
    private final ComponentCallbacks2C0422u systemCallbacks;

    @NotNull
    private final C0364o requestService;

    @NotNull
    private final C0877b components;

    @NotNull
    private final List<InterfaceC0333b> interceptors;

    @NotNull
    private final AtomicBoolean shutdown;

    @f(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {113}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "LJ1/h;", "<anonymous>", "(Lha/L;)LJ1/h;"}, k = 3, mv = {2, 0, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super AbstractC0357h>, Object> {
        int d;
        final C0356g i;

        L(C0356g c0356g, Continuation<? super L> continuation) {
            super(2, continuation);
            this.i = c0356g;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C0886k.this.new L(this.i, continuation);
        }

        public final Object invoke(ha.L l, Continuation<? super AbstractC0357h> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                C0886k c0886k = C0886k.this;
                C0356g c0356g = this.i;
                this.d = 1;
                obj = c0886k.e(c0356g, 0, this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            C0886k c0886k2 = C0886k.this;
            if (((AbstractC0357h) obj) instanceof C0354e) {
                c0886k2.h();
            }
            return obj;
        }
    }

    @f(c = "coil.RealImageLoader", f = "RealImageLoader.kt", l = {171, 183, 187}, m = "executeMain")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c extends d {
        int A;
        Object d;
        Object e;
        Object i;
        Object v;
        Object w;
        Object y;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.y = obj;
            this.A |= Integer.MIN_VALUE;
            return C0886k.this.e(null, 0, this);
        }
    }

    @f(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", l = {196}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "LJ1/h;", "<anonymous>", "(Lha/L;)LJ1/h;"}, k = 3, mv = {2, 0, 0})
    static final class C0887d extends k implements Function2<ha.L, Continuation<? super AbstractC0357h>, Object> {
        int d;
        final C0356g e;
        final C0886k i;
        final Size v;
        final InterfaceC0878c w;
        final Bitmap y;

        C0887d(C0356g c0356g, C0886k c0886k, Size size, InterfaceC0878c interfaceC0878c, Bitmap bitmap, Continuation<? super C0887d> continuation) {
            super(2, continuation);
            this.e = c0356g;
            this.i = c0886k;
            this.v = size;
            this.w = interfaceC0878c;
            this.y = bitmap;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C0887d(this.e, this.i, this.v, this.w, this.y, continuation);
        }

        public final Object invoke(ha.L l, Continuation<? super AbstractC0357h> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                C0334c c0334c = new C0334c(this.e, this.i.interceptors, 0, this.e, this.v, this.w, this.y != null);
                C0356g c0356g = this.e;
                this.d = 1;
                obj = c0334c.f(c0356g, this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"z1/k$e", "Lkotlin/coroutines/a;", "Lha/I;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "o1", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends kotlin.coroutines.a implements I {
        final C0886k e;

        public e(I.a aVar, C0886k c0886k) {
            super(aVar);
            this.e = c0886k;
        }

        public void o1(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            this.e.h();
        }
    }

    public C0886k(@NotNull Context context, @NotNull C0351b c0351b, @NotNull h<? extends MemoryCache> hVar, @NotNull h<? extends a> hVar2, @NotNull h<? extends Call.Factory> hVar3, @NotNull InterfaceC0878c.InterfaceC0321c interfaceC0321c, @NotNull C0877b c0877b, @NotNull C0418p c0418p, InterfaceC0420s interfaceC0420s) {
        this.context = context;
        this.defaults = c0351b;
        this.memoryCacheLazy = hVar;
        this.diskCacheLazy = hVar2;
        this.callFactoryLazy = hVar3;
        this.eventListenerFactory = interfaceC0321c;
        this.componentRegistry = c0877b;
        this.options = c0418p;
        ComponentCallbacks2C0422u componentCallbacks2C0422u = new ComponentCallbacks2C0422u(this);
        this.systemCallbacks = componentCallbacks2C0422u;
        C0364o c0364o = new C0364o(this, componentCallbacks2C0422u, null);
        this.requestService = c0364o;
        this.components = c0877b.h().d(new H1.c(), HttpUrl.class).d(new g(), String.class).d(new H1.b(), Uri.class).d(new H1.f(), Uri.class).d(new H1.e(), Integer.class).d(new H1.a(), byte[].class).c(new G1.c(), Uri.class).c(new G1.a(c0418p.getAddLastModifiedToFileCacheKey()), File.class).b(new k.b(hVar3, hVar2, c0418p.getRespectCacheHeaders()), Uri.class).b(new j.a(), File.class).b(new a.C0019a(), Uri.class).b(new e.a(), Uri.class).b(new l.b(), Uri.class).b(new f.a(), Drawable.class).b(new b.a(), Bitmap.class).b(new c.a(), ByteBuffer.class).a(new c.C0003c(c0418p.getBitmapFactoryMaxParallelism(), c0418p.getBitmapFactoryExifOrientationPolicy())).e();
        this.interceptors = CollectionsKt.f0(getComponents().c(), new C0330a(this, componentCallbacks2C0422u, c0364o, null));
        this.shutdown = new AtomicBoolean(false);
    }

    public final java.lang.Object e(ha.C0356g r21, int r22, kotlin.coroutines.Continuation<? super ha.AbstractC0357h> r23) {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0886k.e(J1.g, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void j(C0356g request, InterfaceC0878c eventListener) {
        eventListener.c(request);
        C0356g.b listener = request.getListener();
        if (listener != null) {
            listener.c(request);
        }
    }

    private final void k(ha.C0354e r4, L1.a r5, ha.InterfaceC0878c r6) {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0886k.k(J1.e, L1.a, z1.c):void");
    }

    private final void l(ha.C0365p r4, L1.a r5, ha.InterfaceC0878c r6) {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0886k.l(J1.p, L1.a, z1.c):void");
    }

    @Override
    @NotNull
    public InterfaceC0353d a(@NotNull C0356g request) {
        T<? extends AbstractC0357h> tB = g.b(this.scope, (CoroutineContext) null, (N) null, new L(request, null), 3, (Object) null);
        return request.getTarget() instanceof L1.b ? C0412j.l(((L1.b) request.getTarget()).getView()).b(tB) : new C0360k(tB);
    }

    @Override
    public MemoryCache b() {
        return (MemoryCache) this.memoryCacheLazy.getValue();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public C0351b getDefaults() {
        return this.defaults;
    }

    @Override
    @NotNull
    public C0877b getComponents() {
        return this.components;
    }

    public final InterfaceC0420s h() {
        return null;
    }

    @NotNull
    public final C0418p getOptions() {
        return this.options;
    }

    public final void m(int level) {
        MemoryCache memoryCache;
        h<MemoryCache> hVar = this.memoryCacheLazy;
        if (hVar == null || (memoryCache = (MemoryCache) hVar.getValue()) == null) {
            return;
        }
        memoryCache.b(level);
    }

    @Override
    public void shutdown() {
        if (this.shutdown.getAndSet(true)) {
            return;
        }
        M.e(this.scope, (CancellationException) null, 1, (Object) null);
        this.systemCallbacks.e();
        MemoryCache memoryCacheB = b();
        if (memoryCacheB != null) {
            memoryCacheB.clear();
        }
    }
}
