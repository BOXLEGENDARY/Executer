package P9;

import C9.h;
import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import u5.w;

public final class b {
    private final h<Context> a;
    private final h<w> b;

    public b(h<Context> hVar, h<w> hVar2) {
        this.a = hVar;
        this.b = hVar2;
    }

    public static b a(h<Context> hVar, h<w> hVar2) {
        return new b(hVar, hVar2);
    }

    public static GovernmentIdHintWorker c(Context context, w wVar, IdConfig.b bVar) {
        return new GovernmentIdHintWorker(context, wVar, bVar);
    }

    public GovernmentIdHintWorker b(IdConfig.b bVar) {
        return c((Context) this.a.get(), (w) this.b.get(), bVar);
    }
}
