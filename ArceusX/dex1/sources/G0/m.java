package g0;

import com.github.luben.zstd.BuildConfig;
import h0.C2474a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"E", "Lg0/l;", BuildConfig.FLAVOR, "key", "c", "(Lg0/l;I)Ljava/lang/Object;", BuildConfig.FLAVOR, "d", "(Lg0/l;)V", BuildConfig.FLAVOR, "a", "Ljava/lang/Object;", "DELETED", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {

    private static final Object f20947a = new Object();

    public static final <E> E c(l<E> lVar, int i7) {
        E e7;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        int iA = C2474a.a(lVar.f20944e, lVar.f20946v, i7);
        if (iA < 0 || (e7 = (E) lVar.f20945i[iA]) == f20947a) {
            return null;
        }
        return e7;
    }

    public static final <E> void d(l<E> lVar) {
        int i7 = lVar.f20946v;
        int[] iArr = lVar.f20944e;
        Object[] objArr = lVar.f20945i;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f20947a) {
                if (i9 != i8) {
                    iArr[i8] = iArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        lVar.f20943d = false;
        lVar.f20946v = i8;
    }
}
