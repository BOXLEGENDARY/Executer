package g0;

import com.github.luben.zstd.BuildConfig;
import h0.C2474a;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"E", "Lg0/b;", BuildConfig.FLAVOR, "hash", "b", "(Lg0/b;I)I", BuildConfig.FLAVOR, "key", "c", "(Lg0/b;Ljava/lang/Object;I)I", "d", "(Lg0/b;)I", "size", BuildConfig.FLAVOR, "a", "(Lg0/b;I)V", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final <E> void a(C2458b<E> c2458b, int i7) {
        Intrinsics.checkNotNullParameter(c2458b, "<this>");
        c2458b.o(new int[i7]);
        c2458b.n(new Object[i7]);
    }

    public static final <E> int b(C2458b<E> c2458b, int i7) {
        Intrinsics.checkNotNullParameter(c2458b, "<this>");
        try {
            return C2474a.a(c2458b.getHashes(), c2458b.l(), i7);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> int c(C2458b<E> c2458b, Object obj, int i7) {
        Intrinsics.checkNotNullParameter(c2458b, "<this>");
        int iL = c2458b.l();
        if (iL == 0) {
            return -1;
        }
        int iB = b(c2458b, i7);
        if (iB < 0 || Intrinsics.b(obj, c2458b.getArray()[iB])) {
            return iB;
        }
        int i8 = iB + 1;
        while (i8 < iL && c2458b.getHashes()[i8] == i7) {
            if (Intrinsics.b(obj, c2458b.getArray()[i8])) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iB - 1; i9 >= 0 && c2458b.getHashes()[i9] == i7; i9--) {
            if (Intrinsics.b(obj, c2458b.getArray()[i9])) {
                return i9;
            }
        }
        return ~i8;
    }

    public static final <E> int d(C2458b<E> c2458b) {
        Intrinsics.checkNotNullParameter(c2458b, "<this>");
        return c(c2458b, null, 0);
    }
}
