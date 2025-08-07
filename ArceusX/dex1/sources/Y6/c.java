package y6;

import bb.t;
import g6.C2466b;
import java.util.ArrayList;
import s7.g;
import y6.f;

public class c extends f {

    private ArrayList<Long> f24461J;

    public c(long j7) {
        ArrayList<Long> arrayList = new ArrayList<>(1);
        this.f24461J = arrayList;
        arrayList.add(Long.valueOf(j7));
    }

    private void w(long j7, String str) {
        U5.a aVarD;
        if (str == null || str.isEmpty() || (aVarD = U5.b.b().d(j7)) == null) {
            return;
        }
        aVarD.e(str);
    }

    @Override
    public void m() throws Throwable {
        if (this.f24461J.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24461J.get(0));
        for (int i7 = 1; i7 < this.f24461J.size(); i7++) {
            sb.append(",");
            sb.append(this.f24461J.get(i7));
        }
        t tVarExecute = g.d().c().b(sb.toString(), "150x150", "Png", Boolean.FALSE).execute();
        ArrayList arrayList = new ArrayList();
        if (tVarExecute.g()) {
            for (A7.a aVar : ((A7.b) tVarExecute.a()).data) {
                w(aVar.targetId, aVar.imageUrl);
                arrayList.add(Long.valueOf(aVar.targetId));
            }
        }
        Wa.c.d().j(new C2466b(arrayList));
    }

    @Override
    protected void v(f.a aVar) {
    }
}
