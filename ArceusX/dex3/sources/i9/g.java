package I9;

import G9.q;
import G9.s;
import H9.b;
import androidx.annotation.NonNull;

public class g implements s {
    @Override
    public Object a(@NonNull G9.g gVar, @NonNull q qVar) {
        if (b.a.BULLET == H9.b.a.c(qVar)) {
            return new J9.b(gVar.e(), H9.b.b.c(qVar).intValue());
        }
        return new J9.h(gVar.e(), String.valueOf(H9.b.c.c(qVar)) + ". ");
    }
}
