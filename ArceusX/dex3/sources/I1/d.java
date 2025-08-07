package I1;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okio.C0412j;
import okio.C0423v;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\n\bB\u001d\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"LI1/d;", "", "Lokhttp3/Request;", "networkRequest", "LI1/c;", "cacheResponse", "<init>", "(Lokhttp3/Request;LI1/c;)V", "a", "Lokhttp3/Request;", "b", "()Lokhttp3/Request;", "LI1/c;", "()LI1/c;", "c", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    private final Request networkRequest;

    private final c cacheResponse;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LI1/d$a;", "", "<init>", "()V", "", "name", "", "e", "(Ljava/lang/String;)Z", "d", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", "c", "(Lokhttp3/Request;Lokhttp3/Response;)Z", "LI1/c;", "b", "(Lokhttp3/Request;LI1/c;)Z", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "a", "(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean d(String name) {
            return StringsKt.r("Content-Length", name, true) || StringsKt.r("Content-Encoding", name, true) || StringsKt.r("Content-Type", name, true);
        }

        private final boolean e(String name) {
            return (StringsKt.r("Connection", name, true) || StringsKt.r("Keep-Alive", name, true) || StringsKt.r("Proxy-Authenticate", name, true) || StringsKt.r("Proxy-Authorization", name, true) || StringsKt.r("TE", name, true) || StringsKt.r("Trailers", name, true) || StringsKt.r("Transfer-Encoding", name, true) || StringsKt.r("Upgrade", name, true)) ? false : true;
        }

        @NotNull
        public final Headers a(@NotNull Headers cachedHeaders, @NotNull Headers networkHeaders) {
            Headers.Builder builder = new Headers.Builder();
            int size = cachedHeaders.size();
            for (int i = 0; i < size; i++) {
                String strName = cachedHeaders.name(i);
                String strValue = cachedHeaders.value(i);
                if ((!StringsKt.r("Warning", strName, true) || !StringsKt.F(strValue, "1", false, 2, (Object) null)) && (d(strName) || !e(strName) || networkHeaders.get(strName) == null)) {
                    builder.addUnsafeNonAscii(strName, strValue);
                }
            }
            int size2 = networkHeaders.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String strName2 = networkHeaders.name(i2);
                if (!d(strName2) && e(strName2)) {
                    builder.addUnsafeNonAscii(strName2, networkHeaders.value(i2));
                }
            }
            return builder.build();
        }

        public final boolean b(@NotNull Request request, @NotNull c response) {
            return (request.cacheControl().noStore() || response.e().noStore() || Intrinsics.b(response.getResponseHeaders().get("Vary"), "*")) ? false : true;
        }

        public final boolean c(@NotNull Request request, @NotNull Response response) {
            return (request.cacheControl().noStore() || response.cacheControl().noStore() || Intrinsics.b(response.headers().get("Vary"), "*")) ? false : true;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"LI1/d$b;", "", "Lokhttp3/Request;", "request", "LI1/c;", "cacheResponse", "<init>", "(Lokhttp3/Request;LI1/c;)V", "", "c", "()J", "a", "", "d", "(Lokhttp3/Request;)Z", "LI1/d;", "b", "()LI1/d;", "Lokhttp3/Request;", "LI1/c;", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", "", "Ljava/lang/String;", "servedDateString", "e", "lastModified", "f", "lastModifiedString", "g", "expires", "h", "J", "sentRequestMillis", "i", "receivedResponseMillis", "j", "etag", "", "k", "I", "ageSeconds", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        @NotNull
        private final Request request;

        private final c cacheResponse;

        private Date servedDate;

        private String servedDateString;

        private Date lastModified;

        private String lastModifiedString;

        private Date expires;

        private long sentRequestMillis;

        private long receivedResponseMillis;

        private String etag;

        private int ageSeconds;

        public b(@NotNull Request request, c cVar) {
            this.request = request;
            this.cacheResponse = cVar;
            this.ageSeconds = -1;
            if (cVar != null) {
                this.sentRequestMillis = cVar.getSentRequestAtMillis();
                this.receivedResponseMillis = cVar.getReceivedResponseAtMillis();
                Headers responseHeaders = cVar.getResponseHeaders();
                int size = responseHeaders.size();
                for (int i = 0; i < size; i++) {
                    String strName = responseHeaders.name(i);
                    if (StringsKt.r(strName, "Date", true)) {
                        this.servedDate = responseHeaders.getDate("Date");
                        this.servedDateString = responseHeaders.value(i);
                    } else if (StringsKt.r(strName, "Expires", true)) {
                        this.expires = responseHeaders.getDate("Expires");
                    } else if (StringsKt.r(strName, "Last-Modified", true)) {
                        this.lastModified = responseHeaders.getDate("Last-Modified");
                        this.lastModifiedString = responseHeaders.value(i);
                    } else if (StringsKt.r(strName, "ETag", true)) {
                        this.etag = responseHeaders.value(i);
                    } else if (StringsKt.r(strName, "Age", true)) {
                        this.ageSeconds = C0412j.z(responseHeaders.value(i), -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.servedDate;
            long jMax = date != null ? Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            int i = this.ageSeconds;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            return jMax + (this.receivedResponseMillis - this.sentRequestMillis) + (C0423v.a.a() - this.receivedResponseMillis);
        }

        private final long c() {
            c cVar = this.cacheResponse;
            Intrinsics.d(cVar);
            if (cVar.e().maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.maxAgeSeconds());
            }
            Date date = this.expires;
            if (date != null) {
                Date date2 = this.servedDate;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.receivedResponseMillis);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.lastModified == null || this.request.url().query() != null) {
                return 0L;
            }
            Date date3 = this.servedDate;
            long time2 = date3 != null ? date3.getTime() : this.sentRequestMillis;
            Date date4 = this.lastModified;
            Intrinsics.d(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / 10;
            }
            return 0L;
        }

        private final boolean d(Request request) {
            return (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) ? false : true;
        }

        @NotNull
        public final d b() {
            String str;
            c cVar = null;
            if (this.cacheResponse == null) {
                return new d(this.request, cVar, cVar);
            }
            if (this.request.isHttps() && !this.cacheResponse.getIsTls()) {
                return new d(this.request, cVar, cVar);
            }
            CacheControl cacheControlE = this.cacheResponse.e();
            if (!d.INSTANCE.b(this.request, this.cacheResponse)) {
                return new d(this.request, cVar, cVar);
            }
            CacheControl cacheControl = this.request.cacheControl();
            if (cacheControl.noCache() || d(this.request)) {
                return new d(this.request, cVar, cVar);
            }
            long jA = a();
            long jC = c();
            if (cacheControl.maxAgeSeconds() != -1) {
                jC = Math.min(jC, TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
            }
            long millis = 0;
            long millis2 = cacheControl.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds()) : 0L;
            if (!cacheControlE.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                millis = TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
            }
            if (!cacheControlE.noCache() && jA + millis2 < jC + millis) {
                return new d(cVar, this.cacheResponse, cVar);
            }
            String str2 = this.etag;
            if (str2 != null) {
                Intrinsics.d(str2);
                str = "If-None-Match";
            } else {
                str = "If-Modified-Since";
                if (this.lastModified != null) {
                    str2 = this.lastModifiedString;
                    Intrinsics.d(str2);
                } else {
                    if (this.servedDate == null) {
                        return new d(this.request, cVar, cVar);
                    }
                    str2 = this.servedDateString;
                    Intrinsics.d(str2);
                }
            }
            return new d(this.request.newBuilder().addHeader(str, str2).build(), this.cacheResponse, cVar);
        }
    }

    public d(Request request, c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(request, cVar);
    }

    public final c getCacheResponse() {
        return this.cacheResponse;
    }

    public final Request getNetworkRequest() {
        return this.networkRequest;
    }

    private d(Request request, c cVar) {
        this.networkRequest = request;
        this.cacheResponse = cVar;
    }
}
