package S;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import z.C3070z;

public interface I {

    public static final I f6203a = new a();

    class a implements I {
        a() {
        }

        @Override
        public List<C1230l> b(C3070z c3070z) {
            return new ArrayList();
        }
    }

    default U.g a(C1230l c1230l, C3070z c3070z) {
        return null;
    }

    List<C1230l> b(C3070z c3070z);

    default C1230l c(Size size, C3070z c3070z) {
        return C1230l.f6342g;
    }

    default U.g d(Size size, C3070z c3070z) {
        return null;
    }
}
