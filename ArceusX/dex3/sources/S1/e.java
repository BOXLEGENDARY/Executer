package S1;

import java.util.List;

public class e extends g<W1.d> {
    private final W1.d i;

    public e(List<c2.a<W1.d>> list) {
        super(list);
        W1.d dVar = list.get(0).b;
        int iC = dVar != null ? dVar.c() : 0;
        this.i = new W1.d(new float[iC], new int[iC]);
    }

    @Override
    public W1.d i(c2.a<W1.d> aVar, float f) {
        this.i.d(aVar.b, aVar.c, f);
        return this.i;
    }
}
