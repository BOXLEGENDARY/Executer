package O3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class C0751r9 implements InterfaceC0719o9 {

    final List f3563a;

    public C0751r9(Context context, AbstractC0741q9 abstractC0741q9) {
        ArrayList arrayList = new ArrayList();
        this.f3563a = arrayList;
        if (abstractC0741q9.c()) {
            arrayList.add(new G9(context, abstractC0741q9));
        }
    }

    @Override
    public final void a(InterfaceC0708n9 interfaceC0708n9) {
        Iterator it = this.f3563a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0719o9) it.next()).a(interfaceC0708n9);
        }
    }
}
