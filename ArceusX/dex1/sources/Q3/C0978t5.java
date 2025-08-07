package Q3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class C0978t5 implements InterfaceC0958q5 {

    final List f4621a;

    public C0978t5(Context context, AbstractC0971s5 abstractC0971s5) {
        ArrayList arrayList = new ArrayList();
        this.f4621a = arrayList;
        if (abstractC0971s5.c()) {
            arrayList.add(new D5(context, abstractC0971s5));
        }
    }

    @Override
    public final void a(InterfaceC0951p5 interfaceC0951p5) {
        Iterator it = this.f4621a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0958q5) it.next()).a(interfaceC0951p5);
        }
    }
}
