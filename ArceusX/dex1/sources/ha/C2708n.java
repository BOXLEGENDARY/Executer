package ha;

import P9.p;
import S5.Cg.XjqcfAbdbc;
import S9.b;
import com.github.luben.zstd.BuildConfig;
import ha.M;
import ha.N;
import ha.c0;
import ha.g;
import ha.v;
import ha.x;
import ha.z0;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dns;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0010B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R,\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lo6/n;", "Lokhttp3/Dns;", "systemDns", "<init>", "(Lokhttp3/Dns;)V", BuildConfig.FLAVOR, "e", "()V", BuildConfig.FLAVOR, "hostname", "d", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "a", "Lokhttp3/Dns;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lha/v;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "prewarmingFutures", "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C2708n implements Dns {

    public static final Companion INSTANCE;

    private static final C2708n f22537d;

    private final Dns systemDns;

    private final ConcurrentHashMap<String, v<List<InetAddress>>> prewarmingFutures;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lo6/n$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lo6/n;", "Instance", "Lo6/n;", "a", "()Lo6/n;", "getInstance$annotations", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2708n a() {
            return C2708n.f22537d;
        }

        private Companion() {
        }
    }

    @f(c = "com.roblox.client.http.PrewarmableDnsResolver$lookup$1", f = "PrewarmableDnsResolver.kt", l = {79}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lha/L;", BuildConfig.FLAVOR, "Ljava/net/InetAddress;", "<anonymous>", "(Lha/L;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super List<? extends InetAddress>>, Object> {

        int f22540d;

        final v<List<InetAddress>> f22541e;

        final C2708n f22542i;

        final String f22543v;

        @f(c = "com.roblox.client.http.PrewarmableDnsResolver$lookup$1$1", f = "PrewarmableDnsResolver.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", BuildConfig.FLAVOR, "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {2, 0, 0})
        static final class C0212a extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {

            int f22544d;

            final v<List<InetAddress>> f22545e;

            final C2708n f22546i;

            final String f22547v;

            C0212a(v<List<InetAddress>> vVar, C2708n c2708n, String str, Continuation<? super C0212a> continuation) {
                super(2, continuation);
                this.f22545e = vVar;
                this.f22546i = c2708n;
                this.f22547v = str;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0212a(this.f22545e, this.f22546i, this.f22547v, continuation);
            }

            public final Object invoke(ha.L l7, Continuation<? super Unit> continuation) {
                return create(l7, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object obj) {
                b.c();
                if (this.f22544d != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
                try {
                    this.f22545e.S0(this.f22546i.systemDns.lookup(this.f22547v));
                } catch (UnknownHostException unused) {
                }
                return Unit.a;
            }
        }

        L(v<List<InetAddress>> vVar, C2708n c2708n, String str, Continuation<? super L> continuation) {
            super(2, continuation);
            this.f22541e = vVar;
            this.f22542i = c2708n;
            this.f22543v = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new L(this.f22541e, this.f22542i, this.f22543v, continuation);
        }

        public final Object invoke(ha.L l7, Continuation<? super List<? extends InetAddress>> continuation) {
            return create(l7, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objC = b.c();
            int i7 = this.f22540d;
            if (i7 == 0) {
                p.b(obj);
                g.d(M.a(c0.b()), (CoroutineContext) null, (N) null, new C0212a(this.f22541e, this.f22542i, this.f22543v, null), 3, (Object) null);
                v<List<InetAddress>> vVar = this.f22541e;
                this.f22540d = 1;
                obj = vVar.h0(this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            return obj;
        }
    }

    @f(c = "com.roblox.client.http.PrewarmableDnsResolver$prewarmIOThread$1", f = "PrewarmableDnsResolver.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", BuildConfig.FLAVOR, "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {2, 0, 0})
    static final class C2709c extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {

        int f22548d;

        C2709c(Continuation<? super C2709c> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2709c(continuation);
        }

        public final Object invoke(ha.L l7, Continuation<? super Unit> continuation) {
            return create(l7, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            b.c();
            if (this.f22548d != 0) {
                throw new IllegalStateException(XjqcfAbdbc.pGJkcXCBPiVsyrw);
            }
            p.b(obj);
            return Unit.a;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        f22537d = new C2708n(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    public C2708n(Dns dns) {
        Intrinsics.checkNotNullParameter(dns, "systemDns");
        this.systemDns = dns;
        this.prewarmingFutures = new ConcurrentHashMap<>();
    }

    public static final C2708n c() {
        return INSTANCE.a();
    }

    private final void e() {
        g.d(M.a(c0.b()), (CoroutineContext) null, (N) null, new C2709c(null), 3, (Object) null);
    }

    public final void d(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        v<List<InetAddress>> vVarB = x.b((z0) null, 1, (Object) null);
        if (this.prewarmingFutures.putIfAbsent(hostname, vVarB) == null) {
            try {
                e();
                vVarB.S0(this.systemDns.lookup(hostname));
            } catch (UnknownHostException e7) {
                if (vVarB.Q0(e7)) {
                    this.prewarmingFutures.remove(hostname, vVarB);
                }
            }
        }
    }

    public List<InetAddress> lookup(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        v<List<InetAddress>> vVar = this.prewarmingFutures.get(hostname);
        if (vVar == null) {
            return this.systemDns.lookup(hostname);
        }
        try {
            return vVar.i1() ? (List) vVar.u() : (List) g.f((CoroutineContext) null, new L(vVar, this, hostname, null), 1, (Object) null);
        } catch (UnknownHostException unused) {
            return this.systemDns.lookup(hostname);
        }
    }

    public C2708n(Dns dns, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? Dns.SYSTEM : dns);
    }
}
