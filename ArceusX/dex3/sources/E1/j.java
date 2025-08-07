package E1;

import E1.i;
import android.webkit.MimeTypeMap;
import ha.C0361l;
import ha.InterfaceC0883h;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okio.B;
import okio.C0325r;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"LE1/j;", "LE1/i;", "Ljava/io/File;", "data", "<init>", "(Ljava/io/File;)V", "LE1/h;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements i {

    @NotNull
    private final File data;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LE1/j$a;", "LE1/i$a;", "Ljava/io/File;", "<init>", "()V", "data", "LJ1/l;", "options", "Lz1/h;", "imageLoader", "LE1/i;", "b", "(Ljava/io/File;LJ1/l;Lz1/h;)LE1/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements i.a<File> {
        @Override
        @NotNull
        public i a(@NotNull File data, @NotNull C0361l options, @NotNull InterfaceC0883h imageLoader) {
            return new j(data);
        }
    }

    public j(@NotNull File file) {
        this.data = file;
    }

    @Override
    public Object a(@NotNull Continuation<? super h> continuation) {
        return new m(C0325r.h(B.a.d(B.e, this.data, false, 1, (Object) null), null, null, null, 14, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(X9.h.p(this.data)), okio.e.i);
    }
}
