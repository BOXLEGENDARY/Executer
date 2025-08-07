package S1;

import android.graphics.Path;
import java.util.List;

public class m extends a<W1.m, Path> {
    private final W1.m i;
    private final Path j;

    public m(List<c2.a<W1.m>> list) {
        super(list);
        this.i = new W1.m();
        this.j = new Path();
    }

    @Override
    public Path i(c2.a<W1.m> aVar, float f) {
        this.i.c(aVar.b, aVar.c, f);
        b2.g.i(this.i, this.j);
        return this.j;
    }
}
