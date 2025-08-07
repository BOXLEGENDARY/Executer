package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import okio.B;
import okio.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lokio/l;", "Lokio/B;", "file", "", "a", "(Lokio/l;Lokio/B;)V", "directory", "b", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class C0407e {
    public static final void a(@NotNull l lVar, @NotNull B b) throws IOException {
        if (lVar.j(b)) {
            return;
        }
        C0412j.d(lVar.o(b));
    }

    public static final void b(@NotNull l lVar, @NotNull B b) throws IOException {
        try {
            IOException iOException = null;
            for (B b3 : lVar.k(b)) {
                try {
                    if (lVar.l(b3).f()) {
                        b(lVar, b3);
                    }
                    lVar.h(b3);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
