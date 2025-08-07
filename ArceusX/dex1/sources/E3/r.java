package E3;

import a4.C1576m;
import a4.InterfaceC1566c;
import android.content.Context;
import com.google.android.gms.common.C1819d;
import com.google.android.gms.tasks.Task;
import d3.C2384c;
import d3.InterfaceC2383b;
import l3.C2527b;

public final class r implements InterfaceC2383b {

    private final InterfaceC2383b f1095a;

    private final InterfaceC2383b f1096b;

    public r(Context context) {
        this.f1095a = new p(context, C1819d.f());
        this.f1096b = l.d(context);
    }

    public static Task a(r rVar, Task task) {
        if (task.o() || task.m()) {
            return task;
        }
        Exception excJ = task.j();
        if (!(excJ instanceof C2527b)) {
            return task;
        }
        int iB = ((C2527b) excJ).b();
        return (iB == 43001 || iB == 43002 || iB == 43003 || iB == 17) ? rVar.f1096b.b() : iB == 43000 ? C1576m.e(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : iB != 15 ? task : C1576m.e(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    @Override
    public final Task<C2384c> b() {
        return this.f1095a.b().h(new InterfaceC1566c() {
            @Override
            public final Object a(Task task) {
                return r.a(this.f1094a, task);
            }
        });
    }
}
