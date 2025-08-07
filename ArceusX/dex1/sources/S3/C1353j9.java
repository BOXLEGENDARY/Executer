package S3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class C1353j9 implements InterfaceC1320g9 {

    final List f6979a;

    public C1353j9(Context context, AbstractC1342i9 abstractC1342i9) {
        ArrayList arrayList = new ArrayList();
        this.f6979a = arrayList;
        if (abstractC1342i9.c()) {
            arrayList.add(new z9(context, abstractC1342i9));
        }
    }

    @Override
    public final void a(InterfaceC1309f9 interfaceC1309f9) {
        Iterator it = this.f6979a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1320g9) it.next()).a(interfaceC1309f9);
        }
    }
}
