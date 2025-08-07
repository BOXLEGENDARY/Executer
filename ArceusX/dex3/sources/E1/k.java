package E1;

import E1.i;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import ha.C0361l;
import ha.InterfaceC0883h;
import ha.a;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.C0325r;
import okio.C0412j;
import okio.o;
import okio.w;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 12\u00020\u0001:\u00024-B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u0004\u0018\u00010\u0017*\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020#*\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020#*\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010*\u001a\u00020)*\u00020\u0015H\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\b-\u0010.J#\u00101\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010/H\u0001¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00106R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010:R\u0014\u0010>\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010=¨\u0006?"}, d2 = {"LE1/k;", "LE1/i;", "", "url", "LJ1/l;", "options", "LP9/h;", "Lokhttp3/Call$Factory;", "callFactory", "LC1/a;", "diskCache", "", "respectCacheHeaders", "<init>", "(Ljava/lang/String;LJ1/l;LP9/h;LP9/h;Z)V", "LC1/a$c;", "i", "()LC1/a$c;", "snapshot", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", "LI1/c;", "cacheResponse", "n", "(LC1/a$c;Lokhttp3/Request;Lokhttp3/Response;LI1/c;)LC1/a$c;", "h", "()Lokhttp3/Request;", "c", "(Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "(Lokhttp3/Request;Lokhttp3/Response;)Z", "j", "(LC1/a$c;)LI1/c;", "LB1/o;", "l", "(LC1/a$c;)LB1/o;", "Lokhttp3/ResponseBody;", "m", "(Lokhttp3/ResponseBody;)LB1/o;", "LB1/e;", "k", "(Lokhttp3/Response;)LB1/e;", "LE1/h;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/MediaType;", "contentType", "f", "(Ljava/lang/String;Lokhttp3/MediaType;)Ljava/lang/String;", "Ljava/lang/String;", "b", "LJ1/l;", "LP9/h;", "d", "e", "Z", "()Ljava/lang/String;", "diskCacheKey", "Lokio/l;", "()Lokio/l;", "fileSystem", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements i {

    @NotNull
    private static final CacheControl g = new CacheControl.Builder().noCache().noStore().build();

    @NotNull
    private static final CacheControl h = new CacheControl.Builder().noCache().onlyIfCached().build();

    @NotNull
    private final String url;

    @NotNull
    private final C0361l options;

    @NotNull
    private final P9.h<Call.Factory> callFactory;

    @NotNull
    private final P9.h<ha.a> diskCache;

    private final boolean respectCacheHeaders;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u0019"}, d2 = {"LE1/k$b;", "LE1/i$a;", "Landroid/net/Uri;", "LP9/h;", "Lokhttp3/Call$Factory;", "callFactory", "LC1/a;", "diskCache", "", "respectCacheHeaders", "<init>", "(LP9/h;LP9/h;Z)V", "data", "c", "(Landroid/net/Uri;)Z", "LJ1/l;", "options", "Lz1/h;", "imageLoader", "LE1/i;", "b", "(Landroid/net/Uri;LJ1/l;Lz1/h;)LE1/i;", "a", "LP9/h;", "Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements i.a<Uri> {

        @NotNull
        private final P9.h<Call.Factory> callFactory;

        @NotNull
        private final P9.h<ha.a> diskCache;

        private final boolean respectCacheHeaders;

        public b(@NotNull P9.h<? extends Call.Factory> hVar, @NotNull P9.h<? extends ha.a> hVar2, boolean z) {
            this.callFactory = hVar;
            this.diskCache = hVar2;
            this.respectCacheHeaders = z;
        }

        private final boolean c(Uri data) {
            return Intrinsics.b(data.getScheme(), "http") || Intrinsics.b(data.getScheme(), "https");
        }

        @Override
        public i a(@NotNull Uri data, @NotNull C0361l options, @NotNull InterfaceC0883h imageLoader) {
            if (c(data)) {
                return new k(data.toString(), options, this.callFactory, this.diskCache, this.respectCacheHeaders);
            }
            return null;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {224}, m = "executeNetworkRequest")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object d;
        int i;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.i |= Integer.MIN_VALUE;
            return k.this.c(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {77, 106}, m = "fetch")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {
        Object d;
        Object e;
        Object i;
        Object v;
        int y;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.y |= Integer.MIN_VALUE;
            return k.this.a(this);
        }
    }

    public k(@NotNull String str, @NotNull C0361l c0361l, @NotNull P9.h<? extends Call.Factory> hVar, @NotNull P9.h<? extends ha.a> hVar2, boolean z) {
        this.url = str;
        this.options = c0361l;
        this.callFactory = hVar;
        this.diskCache = hVar2;
        this.respectCacheHeaders = z;
    }

    public final java.lang.Object c(okhttp3.Request r5, kotlin.coroutines.Continuation<? super okhttp3.Response> r6) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: E1.k.c(okhttp3.Request, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String d() {
        String diskCacheKey = this.options.getDiskCacheKey();
        return diskCacheKey == null ? this.url : diskCacheKey;
    }

    private final okio.l e() {
        Object value = this.diskCache.getValue();
        Intrinsics.d(value);
        return ((ha.a) value).getFileSystem();
    }

    private final boolean g(Request request, Response response) {
        return this.options.getDiskCachePolicy().getWriteEnabled() && (!this.respectCacheHeaders || I1.d.INSTANCE.c(request, response));
    }

    private final Request h() {
        Request.Builder builderHeaders = new Request.Builder().url(this.url).headers(this.options.getHeaders());
        for (Map.Entry<Class<?>, Object> entry : this.options.getTags().a().entrySet()) {
            Class<?> key = entry.getKey();
            Intrinsics.e(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            builderHeaders.tag(key, entry.getValue());
        }
        boolean readEnabled = this.options.getDiskCachePolicy().getReadEnabled();
        boolean readEnabled2 = this.options.getNetworkCachePolicy().getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            builderHeaders.cacheControl(CacheControl.FORCE_CACHE);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                builderHeaders.cacheControl(h);
            }
        } else if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            builderHeaders.cacheControl(CacheControl.FORCE_NETWORK);
        } else {
            builderHeaders.cacheControl(g);
        }
        return builderHeaders.build();
    }

    private final a.c i() {
        ha.a aVar;
        if (!this.options.getDiskCachePolicy().getReadEnabled() || (aVar = (ha.a) this.diskCache.getValue()) == null) {
            return null;
        }
        return aVar.b(d());
    }

    private final I1.c j(a.c cVar) throws Throwable {
        Throwable th;
        I1.c cVar2;
        try {
            okio.g gVarD = w.d(e().q(cVar.k()));
            try {
                cVar2 = new I1.c(gVarD);
                if (gVarD != null) {
                    try {
                        gVarD.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    th = null;
                }
            } catch (Throwable th3) {
                if (gVarD != null) {
                    try {
                        gVarD.close();
                    } catch (Throwable th4) {
                        P9.a.a(th3, th4);
                    }
                }
                th = th3;
                cVar2 = null;
            }
            if (th == null) {
                return cVar2;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    private final okio.e k(Response response) {
        return response.networkResponse() != null ? okio.e.v : okio.e.i;
    }

    private final o l(a.c cVar) {
        return C0325r.g(cVar.getData(), e(), d(), cVar);
    }

    private final o m(ResponseBody responseBody) {
        return C0325r.e(responseBody.source(), this.options.getContext());
    }

    private final C1.a.c n(C1.a.c r5, okhttp3.Request r6, okhttp3.Response r7, I1.c r8) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: E1.k.n(C1.a$c, okhttp3.Request, okhttp3.Response, I1.c):C1.a$c");
    }

    @Override
    public java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super E1.h> r12) throws java.lang.Exception {
        throw new UnsupportedOperationException("Method not decompiled: E1.k.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String f(@NotNull String url, MediaType contentType) {
        String strJ;
        String string = contentType != null ? contentType.toString() : null;
        if ((string == null || StringsKt.F(string, "text/plain", false, 2, (Object) null)) && (strJ = C0412j.j(MimeTypeMap.getSingleton(), url)) != null) {
            return strJ;
        }
        if (string != null) {
            return StringsKt.N0(string, ';', (String) null, 2, (Object) null);
        }
        return null;
    }
}
