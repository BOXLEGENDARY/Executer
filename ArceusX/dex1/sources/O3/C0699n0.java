package O3;

import java.util.Iterator;
import java.util.Map;

final class C0699n0 extends E0 {
    C0699n0(Iterator it) {
        super(it);
    }

    @Override
    final Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }
}
