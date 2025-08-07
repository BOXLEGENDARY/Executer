package P9;

import C9.e;
import C9.h;
import P9.GovernmentIdHintWorker;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;

public final class c implements GovernmentIdHintWorker.b {
    private final b a;

    c(b bVar) {
        this.a = bVar;
    }

    public static h<GovernmentIdHintWorker.b> b(b bVar) {
        return e.a(new c(bVar));
    }

    @Override
    public GovernmentIdHintWorker a(IdConfig.b bVar) {
        return this.a.b(bVar);
    }
}
