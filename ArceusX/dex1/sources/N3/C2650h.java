package n3;

import a4.C1574k;
import com.google.android.gms.tasks.Task;
import l3.AbstractC2535j;
import l3.InterfaceC2540o;

public class C2650h {

    private static final InterfaceC2627C f22281a = new C2668z();

    public interface a<R extends InterfaceC2540o, T> {
        T a(R r7);
    }

    public static <R extends InterfaceC2540o, T> Task<T> a(AbstractC2535j<R> abstractC2535j, a<R, T> aVar) {
        InterfaceC2627C interfaceC2627C = f22281a;
        C1574k c1574k = new C1574k();
        abstractC2535j.a(new C2625A(abstractC2535j, c1574k, aVar, interfaceC2627C));
        return c1574k.a();
    }

    public static <R extends InterfaceC2540o> Task<Void> b(AbstractC2535j<R> abstractC2535j) {
        return a(abstractC2535j, new C2626B());
    }
}
