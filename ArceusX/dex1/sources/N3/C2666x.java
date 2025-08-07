package n3;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C1819d;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import l3.C2526a;

public final class C2666x {

    private final SparseIntArray f22298a = new SparseIntArray();

    private C1819d f22299b;

    public C2666x(C1819d c1819d) {
        C2651i.l(c1819d);
        this.f22299b = c1819d;
    }

    public final int a(Context context, int i7) {
        return this.f22298a.get(i7, -1);
    }

    @ResultIgnorabilityUnspecified
    public final int b(Context context, C2526a.f fVar) {
        C2651i.l(context);
        C2651i.l(fVar);
        int i7 = 0;
        if (!fVar.k()) {
            return 0;
        }
        int iL = fVar.l();
        int iA = a(context, iL);
        if (iA == -1) {
            int i8 = 0;
            while (true) {
                if (i8 >= this.f22298a.size()) {
                    i7 = -1;
                    break;
                }
                int iKeyAt = this.f22298a.keyAt(i8);
                if (iKeyAt > iL && this.f22298a.get(iKeyAt) == 0) {
                    break;
                }
                i8++;
            }
            iA = i7 == -1 ? this.f22299b.h(context, iL) : i7;
            this.f22298a.put(iL, iA);
        }
        return iA;
    }

    public final void c() {
        this.f22298a.clear();
    }
}
