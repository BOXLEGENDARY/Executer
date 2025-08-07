package ha;

import E1.h;
import E1.m;
import M1.a;
import P9.p;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache;
import ha.C0356g;
import ha.C0361l;
import ha.C0364o;
import ha.C0365p;
import ha.C0877b;
import ha.InterfaceC0333b;
import ha.InterfaceC0878c;
import ha.InterfaceC0883h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.i;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.y;
import okio.C0404a;
import okio.C0412j;
import okio.C0415m;
import okio.ComponentCallbacks2C0422u;
import okio.InterfaceC0420s;
import okio.e;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 :2\u00020\u0001:\u00022,B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001f\u0010 J-\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0096@¢\u0006\u0004\b,\u0010-J0\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0081@¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"LF1/a;", "LF1/b;", "Lz1/h;", "imageLoader", "LO1/u;", "systemCallbacks", "LJ1/o;", "requestService", "LO1/s;", "logger", "<init>", "(Lz1/h;LO1/u;LJ1/o;LO1/s;)V", "LJ1/g;", "request", "", "mappedData", "LJ1/l;", "_options", "Lz1/c;", "eventListener", "LF1/a$b;", "j", "(LJ1/g;Ljava/lang/Object;LJ1/l;Lz1/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lz1/b;", "components", "options", "LE1/h;", "k", "(Lz1/b;LJ1/g;Ljava/lang/Object;LJ1/l;Lz1/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LE1/m;", "fetchResult", "i", "(LE1/m;Lz1/b;LJ1/g;Ljava/lang/Object;LJ1/l;Lz1/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "LM1/a;", "transformations", "Landroid/graphics/Bitmap;", "h", "(Landroid/graphics/drawable/Drawable;LJ1/l;Ljava/util/List;)Landroid/graphics/Bitmap;", "LF1/b$a;", "chain", "LJ1/h;", "a", "(LF1/b$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "result", "l", "(LF1/a$b;LJ1/g;LJ1/l;Lz1/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lz1/h;", "b", "LO1/u;", "c", "LJ1/o;", "Lcoil/memory/c;", "d", "Lcoil/memory/c;", "memoryCacheService", "e", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0330a implements InterfaceC0333b {

    @NotNull
    private final InterfaceC0883h imageLoader;

    @NotNull
    private final ComponentCallbacks2C0422u systemCallbacks;

    @NotNull
    private final C0364o requestService;

    @NotNull
    private final coil.memory.c memoryCacheService;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"LF1/a$b;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isSampled", "LB1/e;", "dataSource", "", "diskCacheKey", "<init>", "(Landroid/graphics/drawable/Drawable;ZLB1/e;Ljava/lang/String;)V", "a", "(Landroid/graphics/drawable/Drawable;ZLB1/e;Ljava/lang/String;)LF1/a$b;", "Landroid/graphics/drawable/Drawable;", "e", "()Landroid/graphics/drawable/Drawable;", "b", "Z", "f", "()Z", "c", "LB1/e;", "()LB1/e;", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        @NotNull
        private final Drawable drawable;

        private final boolean isSampled;

        @NotNull
        private final e dataSource;

        private final String diskCacheKey;

        public b(@NotNull Drawable drawable, boolean z, @NotNull e eVar, String str) {
            this.drawable = drawable;
            this.isSampled = z;
            this.dataSource = eVar;
            this.diskCacheKey = str;
        }

        public static b b(b bVar, Drawable drawable, boolean z, e eVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                drawable = bVar.drawable;
            }
            if ((i & 2) != 0) {
                z = bVar.isSampled;
            }
            if ((i & 4) != 0) {
                eVar = bVar.dataSource;
            }
            if ((i & 8) != 0) {
                str = bVar.diskCacheKey;
            }
            return bVar.a(drawable, z, eVar, str);
        }

        @NotNull
        public final b a(@NotNull Drawable drawable, boolean isSampled, @NotNull e dataSource, String diskCacheKey) {
            return new b(drawable, isSampled, dataSource, diskCacheKey);
        }

        @NotNull
        public final e getDataSource() {
            return this.dataSource;
        }

        public final String getDiskCacheKey() {
            return this.diskCacheKey;
        }

        @NotNull
        public final Drawable getDrawable() {
            return this.drawable;
        }

        public final boolean getIsSampled() {
            return this.isSampled;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {203}, m = "decode")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object A;
        int B;
        Object C;
        int E;
        Object d;
        Object e;
        Object i;
        Object v;
        Object w;
        Object y;
        Object z;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.C = obj;
            this.E |= Integer.MIN_VALUE;
            return C0330a.this.i(null, null, null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {126, 130, 148}, m = "execute")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {
        Object A;
        Object B;
        int D;
        Object d;
        Object e;
        Object i;
        Object v;
        Object w;
        Object y;
        Object z;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return C0330a.this.j(null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {131}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "LF1/a$b;", "<anonymous>", "(Lha/L;)LF1/a$b;"}, k = 3, mv = {2, 0, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super b>, Object> {
        final InterfaceC0878c A;
        int d;
        final y<h> i;
        final y<C0877b> v;
        final C0356g w;
        final Object y;
        final y<C0361l> z;

        L(y<h> yVar, y<C0877b> yVar2, C0356g c0356g, Object obj, y<C0361l> yVar3, InterfaceC0878c interfaceC0878c, Continuation<? super L> continuation) {
            super(2, continuation);
            this.i = yVar;
            this.v = yVar2;
            this.w = c0356g;
            this.y = obj;
            this.z = yVar3;
            this.A = interfaceC0878c;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C0330a.this.new L(this.i, this.v, this.w, this.y, this.z, this.A, continuation);
        }

        public final Object invoke(ha.L l, Continuation<? super b> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                C0330a c0330a = C0330a.this;
                m mVar = (m) this.i.d;
                C0877b c0877b = (C0877b) this.v.d;
                C0356g c0356g = this.w;
                Object obj2 = this.y;
                C0361l c0361l = (C0361l) this.z.d;
                InterfaceC0878c interfaceC0878c = this.A;
                this.d = 1;
                obj = c0330a.i(mVar, c0877b, c0356g, obj2, c0361l, interfaceC0878c, this);
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

    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {169}, m = "fetch")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class f extends kotlin.coroutines.jvm.internal.d {
        int A;
        Object B;
        int D;
        Object d;
        Object e;
        Object i;
        Object v;
        Object w;
        Object y;
        Object z;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return C0330a.this.k(null, null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {75}, m = "intercept")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class g extends kotlin.coroutines.jvm.internal.d {
        Object d;
        Object e;
        Object i;
        int w;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.w |= Integer.MIN_VALUE;
            return C0330a.this.a(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {77}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "LJ1/p;", "<anonymous>", "(Lha/L;)LJ1/p;"}, k = 3, mv = {2, 0, 0})
    static final class C0331h extends k implements Function2<ha.L, Continuation<? super C0365p>, Object> {
        final InterfaceC0333b.a A;
        int d;
        final C0356g i;
        final Object v;
        final C0361l w;
        final InterfaceC0878c y;
        final MemoryCache.Key z;

        C0331h(C0356g c0356g, Object obj, C0361l c0361l, InterfaceC0878c interfaceC0878c, MemoryCache.Key key, InterfaceC0333b.a aVar, Continuation<? super C0331h> continuation) {
            super(2, continuation);
            this.i = c0356g;
            this.v = obj;
            this.w = c0361l;
            this.y = interfaceC0878c;
            this.z = key;
            this.A = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C0330a.this.new C0331h(this.i, this.v, this.w, this.y, this.z, this.A, continuation);
        }

        public final Object invoke(ha.L l, Continuation<? super C0365p> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                C0330a c0330a = C0330a.this;
                C0356g c0356g = this.i;
                Object obj2 = this.v;
                C0361l c0361l = this.w;
                InterfaceC0878c interfaceC0878c = this.y;
                this.d = 1;
                obj = c0330a.j(c0356g, obj2, c0361l, interfaceC0878c, this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            b bVar = (b) obj;
            C0330a.this.systemCallbacks.c();
            return new C0365p(bVar.getDrawable(), this.i, bVar.getDataSource(), C0330a.this.memoryCacheService.h(this.z, this.i, bVar) ? this.z : null, bVar.getDiskCacheKey(), bVar.getIsSampled(), C0412j.t(this.A));
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {246}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "LF1/a$b;", "<anonymous>", "(Lha/L;)LF1/a$b;"}, k = 3, mv = {2, 0, 0})
    static final class C0332i extends k implements Function2<ha.L, Continuation<? super b>, Object> {
        final b A;
        final C0361l B;
        final List<a> C;
        final InterfaceC0878c D;
        final C0356g E;
        Object d;
        Object e;
        int i;
        int v;
        int w;
        private Object y;

        C0332i(b bVar, C0361l c0361l, List<? extends a> list, InterfaceC0878c interfaceC0878c, C0356g c0356g, Continuation<? super C0332i> continuation) {
            super(2, continuation);
            this.A = bVar;
            this.B = c0361l;
            this.C = list;
            this.D = interfaceC0878c;
            this.E = c0356g;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0332i c0332i = C0330a.this.new C0332i(this.A, this.B, this.C, this.D, this.E, continuation);
            c0332i.y = obj;
            return c0332i;
        }

        public final Object invoke(ha.L l, Continuation<? super b> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            throw new UnsupportedOperationException("Method not decompiled: ha.C0330a.C0332i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C0330a(@NotNull InterfaceC0883h interfaceC0883h, @NotNull ComponentCallbacks2C0422u componentCallbacks2C0422u, @NotNull C0364o c0364o, InterfaceC0420s interfaceC0420s) {
        this.imageLoader = interfaceC0883h;
        this.systemCallbacks = componentCallbacks2C0422u;
        this.requestService = c0364o;
        this.memoryCacheService = new coil.memory.c(interfaceC0883h, c0364o, null);
    }

    public final Bitmap h(Drawable drawable, C0361l options, List<? extends a> transformations) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (i.w(C0412j.o(), C0404a.c(bitmap))) {
                return bitmap;
            }
        }
        return C0415m.a.a(drawable, options.getConfig(), options.getSize(), options.getScale(), options.getAllowInexactSize());
    }

    public final java.lang.Object i(E1.m r18, ha.C0877b r19, ha.C0356g r20, java.lang.Object r21, ha.C0361l r22, ha.InterfaceC0878c r23, kotlin.coroutines.Continuation<? super ha.C0330a.b> r24) {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0330a.i(E1.m, z1.b, J1.g, java.lang.Object, J1.l, z1.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object j(ha.C0356g r27, java.lang.Object r28, ha.C0361l r29, ha.InterfaceC0878c r30, kotlin.coroutines.Continuation<? super ha.C0330a.b> r31) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0330a.j(J1.g, java.lang.Object, J1.l, z1.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object k(ha.C0877b r10, ha.C0356g r11, java.lang.Object r12, ha.C0361l r13, ha.InterfaceC0878c r14, kotlin.coroutines.Continuation<? super E1.h> r15) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0330a.k(z1.b, J1.g, java.lang.Object, J1.l, z1.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override
    public java.lang.Object a(@org.jetbrains.annotations.NotNull ha.InterfaceC0333b.a r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super ha.AbstractC0357h> r15) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0330a.a(F1.b$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object l(@NotNull b bVar, @NotNull C0356g c0356g, @NotNull C0361l c0361l, @NotNull InterfaceC0878c interfaceC0878c, @NotNull Continuation<? super b> continuation) {
        List<a> listO = c0356g.O();
        return listO.isEmpty() ? bVar : ((bVar.getDrawable() instanceof BitmapDrawable) || c0356g.getAllowConversionToBitmap()) ? ha.g.g(c0356g.getTransformationDispatcher(), new C0332i(bVar, c0361l, listO, interfaceC0878c, c0356g, null), continuation) : bVar;
    }
}
