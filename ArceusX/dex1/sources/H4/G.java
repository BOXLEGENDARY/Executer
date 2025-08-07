package H4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class G {
    public static final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            I i7 = (I) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", i7.a());
            bundle.putLong("event_timestamp", i7.b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static final void b(int i7, List list) {
        list.add(I.c(i7, System.currentTimeMillis()));
    }
}
