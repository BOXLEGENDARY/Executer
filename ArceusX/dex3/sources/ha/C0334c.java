package ha;

import K1.Size;
import ha.C0356g;
import ha.C0358i;
import ha.InterfaceC0333b;
import ha.InterfaceC0878c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b%\u0010,R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b'\u0010/¨\u00060"}, d2 = {"LF1/c;", "LF1/b$a;", "LJ1/g;", "initialRequest", "", "LF1/b;", "interceptors", "", "index", "request", "LK1/i;", "size", "Lz1/c;", "eventListener", "", "isPlaceholderCached", "<init>", "(LJ1/g;Ljava/util/List;ILJ1/g;LK1/i;Lz1/c;Z)V", "interceptor", "", "a", "(LJ1/g;LF1/b;)V", "b", "(ILJ1/g;LK1/i;)LF1/c;", "LJ1/h;", "f", "(LJ1/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LJ1/g;", "getInitialRequest", "()LJ1/g;", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "c", "I", "getIndex", "()I", "d", "i", "e", "LK1/i;", "h", "()LK1/i;", "Lz1/c;", "()Lz1/c;", "g", "Z", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0334c implements InterfaceC0333b.a {

    @NotNull
    private final C0356g initialRequest;

    @NotNull
    private final List<InterfaceC0333b> interceptors;

    private final int index;

    @NotNull
    private final C0356g request;

    @NotNull
    private final Size size;

    @NotNull
    private final InterfaceC0878c eventListener;

    private final boolean isPlaceholderCached;

    @f(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {32}, m = "proceed")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a extends d {
        Object d;
        Object e;
        Object i;
        int w;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.w |= Integer.MIN_VALUE;
            return C0334c.this.f(null, this);
        }
    }

    public C0334c(@NotNull C0356g c0356g, @NotNull List<? extends InterfaceC0333b> list, int i, @NotNull C0356g c0356g2, @NotNull Size size, @NotNull InterfaceC0878c interfaceC0878c, boolean z) {
        this.initialRequest = c0356g;
        this.interceptors = list;
        this.index = i;
        this.request = c0356g2;
        this.size = size;
        this.eventListener = interfaceC0878c;
        this.isPlaceholderCached = z;
    }

    private final void a(C0356g request, InterfaceC0333b interceptor) {
        if (request.getContext() != this.initialRequest.getContext()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's context.").toString());
        }
        if (request.getData() == C0358i.a) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot set the request's data to null.").toString());
        }
        if (request.getTarget() != this.initialRequest.getTarget()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's target.").toString());
        }
        if (request.getLifecycle() != this.initialRequest.getLifecycle()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's lifecycle.").toString());
        }
        if (request.getSizeResolver() == this.initialRequest.getSizeResolver()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    private final C0334c b(int index, C0356g request, Size size) {
        return new C0334c(this.initialRequest, this.interceptors, index, request, size, this.eventListener, this.isPlaceholderCached);
    }

    static C0334c c(C0334c c0334c, int i, C0356g c0356g, Size size, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c0334c.index;
        }
        if ((i2 & 2) != 0) {
            c0356g = c0334c.getRequest();
        }
        if ((i2 & 4) != 0) {
            size = c0334c.getSize();
        }
        return c0334c.b(i, c0356g, size);
    }

    @NotNull
    public final InterfaceC0878c getEventListener() {
        return this.eventListener;
    }

    public final boolean getIsPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    public java.lang.Object f(@org.jetbrains.annotations.NotNull ha.C0356g r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super ha.AbstractC0357h> r13) {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0334c.f(J1.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override
    @NotNull
    public Size getSize() {
        return this.size;
    }

    @Override
    @NotNull
    public C0356g getRequest() {
        return this.request;
    }
}
