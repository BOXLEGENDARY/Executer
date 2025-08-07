package t2;

import android.content.Context;

public final class j implements u2.b<i> {

    private final O9.a<Context> f23808a;

    private final O9.a<C2.a> f23809b;

    private final O9.a<C2.a> f23810c;

    public j(O9.a<Context> aVar, O9.a<C2.a> aVar2, O9.a<C2.a> aVar3) {
        this.f23808a = aVar;
        this.f23809b = aVar2;
        this.f23810c = aVar3;
    }

    public static j a(O9.a<Context> aVar, O9.a<C2.a> aVar2, O9.a<C2.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, C2.a aVar, C2.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    public i get() {
        return c((Context) this.f23808a.get(), (C2.a) this.f23809b.get(), (C2.a) this.f23810c.get());
    }
}
