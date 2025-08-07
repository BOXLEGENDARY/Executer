package C;

import java.util.ArrayList;
import java.util.List;
import z.InterfaceC3059n;
import z.InterfaceC3060o;

public class C0357v0 implements InterfaceC3059n {

    private final int f747b;

    public C0357v0(int i7) {
        this.f747b = i7;
    }

    @Override
    public List<InterfaceC3060o> b(List<InterfaceC3060o> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3060o interfaceC3060o : list) {
            x0.g.b(interfaceC3060o instanceof I, "The camera info doesn't contain internal implementation.");
            if (interfaceC3060o.h() == this.f747b) {
                arrayList.add(interfaceC3060o);
            }
        }
        return arrayList;
    }

    public int c() {
        return this.f747b;
    }
}
