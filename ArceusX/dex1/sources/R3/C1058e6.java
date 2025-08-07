package R3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class C1058e6 implements InterfaceC1122m6 {

    final List f5517a;

    public C1058e6(Context context, AbstractC1050d6 abstractC1050d6) {
        ArrayList arrayList = new ArrayList();
        this.f5517a = arrayList;
        if (abstractC1050d6.c()) {
            arrayList.add(new v6(context, abstractC1050d6));
        }
    }

    @Override
    public final void a(InterfaceC1034b6 interfaceC1034b6) {
        Iterator it = this.f5517a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1122m6) it.next()).a(interfaceC1034b6);
        }
    }
}
