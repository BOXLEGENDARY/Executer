package I1;

import P9.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;
import okio.C0412j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010+\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"LI1/c;", "", "Lokio/g;", "source", "<init>", "(Lokio/g;)V", "Lokhttp3/Response;", "response", "(Lokhttp3/Response;)V", "Lokio/f;", "sink", "", "k", "(Lokio/f;)V", "Lokhttp3/CacheControl;", "a", "LP9/h;", "e", "()Lokhttp3/CacheControl;", "cacheControl", "Lokhttp3/MediaType;", "b", "f", "()Lokhttp3/MediaType;", "contentType", "", "c", "J", "i", "()J", "sentRequestAtMillis", "d", "g", "receivedResponseAtMillis", "", "Z", "j", "()Z", "isTls", "Lokhttp3/Headers;", "Lokhttp3/Headers;", "h", "()Lokhttp3/Headers;", "responseHeaders", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    @NotNull
    private final P9.h cacheControl;

    @NotNull
    private final P9.h contentType;

    private final long sentRequestAtMillis;

    private final long receivedResponseAtMillis;

    private final boolean isTls;

    @NotNull
    private final Headers responseHeaders;

    public c(@NotNull okio.g gVar) throws NumberFormatException {
        l lVar = l.i;
        this.cacheControl = P9.i.a(lVar, new Function0() {
            public final Object invoke() {
                return c.c(this.d);
            }
        });
        this.contentType = P9.i.a(lVar, new Function0() {
            public final Object invoke() {
                return c.d(this.d);
            }
        });
        this.sentRequestAtMillis = Long.parseLong(gVar.O0());
        this.receivedResponseAtMillis = Long.parseLong(gVar.O0());
        this.isTls = Integer.parseInt(gVar.O0()) > 0;
        int i = Integer.parseInt(gVar.O0());
        Headers.Builder builder = new Headers.Builder();
        for (int i2 = 0; i2 < i; i2++) {
            C0412j.b(builder, gVar.O0());
        }
        this.responseHeaders = builder.build();
    }

    public static final CacheControl c(c cVar) {
        return CacheControl.Companion.parse(cVar.responseHeaders);
    }

    public static final MediaType d(c cVar) {
        String str = cVar.responseHeaders.get("Content-Type");
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @NotNull
    public final CacheControl e() {
        return (CacheControl) this.cacheControl.getValue();
    }

    public final MediaType f() {
        return (MediaType) this.contentType.getValue();
    }

    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @NotNull
    public final Headers getResponseHeaders() {
        return this.responseHeaders;
    }

    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final boolean getIsTls() {
        return this.isTls;
    }

    public final void k(@NotNull okio.f sink) {
        sink.q1(this.sentRequestAtMillis).R(10);
        sink.q1(this.receivedResponseAtMillis).R(10);
        sink.q1(this.isTls ? 1L : 0L).R(10);
        sink.q1(this.responseHeaders.size()).R(10);
        int size = this.responseHeaders.size();
        for (int i = 0; i < size; i++) {
            sink.m0(this.responseHeaders.name(i)).m0(": ").m0(this.responseHeaders.value(i)).R(10);
        }
    }

    public c(@NotNull Response response) {
        l lVar = l.i;
        this.cacheControl = P9.i.a(lVar, new Function0() {
            public final Object invoke() {
                return c.c(this.d);
            }
        });
        this.contentType = P9.i.a(lVar, new Function0() {
            public final Object invoke() {
                return c.d(this.d);
            }
        });
        this.sentRequestAtMillis = response.sentRequestAtMillis();
        this.receivedResponseAtMillis = response.receivedResponseAtMillis();
        this.isTls = response.handshake() != null;
        this.responseHeaders = response.headers();
    }
}
