package t2;

import android.content.Context;

public final class l implements u2.b<k> {

    private final O9.a<Context> f23816a;

    private final O9.a<i> f23817b;

    public l(O9.a<Context> aVar, O9.a<i> aVar2) {
        this.f23816a = aVar;
        this.f23817b = aVar2;
    }

    public static l a(O9.a<Context> aVar, O9.a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    public k get() {
        return c((Context) this.f23816a.get(), this.f23817b.get());
    }
}
