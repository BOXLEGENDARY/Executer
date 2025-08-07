package okio;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okio.B;
import okio.C0412j;
import okio.g;
import okio.l;
import okio.o;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lokio/B;", "file", "Lokio/l;", "fileSystem", "", "diskCacheKey", "Ljava/io/Closeable;", "closeable", "LB1/o;", "g", "(Lokio/B;Lokio/l;Ljava/lang/String;Ljava/io/Closeable;)LB1/o;", "Lokio/g;", "source", "Landroid/content/Context;", "context", "e", "(Lokio/g;Landroid/content/Context;)LB1/o;", "LB1/o$a;", "metadata", "f", "(Lokio/g;Landroid/content/Context;LB1/o$a;)LB1/o;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class C0325r {
    public static final File c(Context context) {
        return C0412j.m(context);
    }

    public static final File d(Context context) {
        return C0412j.m(context);
    }

    @NotNull
    public static final o e(@NotNull g gVar, @NotNull final Context context) {
        return new t(gVar, new Function0() {
            public final Object invoke() {
                return C0325r.c(context);
            }
        }, null);
    }

    @NotNull
    public static final o f(@NotNull g gVar, @NotNull final Context context, o.a aVar) {
        return new t(gVar, new Function0() {
            public final Object invoke() {
                return C0325r.d(context);
            }
        }, aVar);
    }

    @NotNull
    public static final o g(@NotNull B b, @NotNull l lVar, String str, Closeable closeable) {
        return new n(b, lVar, str, closeable, null);
    }

    public static o h(B b, l lVar, String str, Closeable closeable, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = l.b;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            closeable = null;
        }
        return g(b, lVar, str, closeable);
    }
}
