package A2;

import android.content.Context;

public final class V implements u2.b<U> {

    private final O9.a<Context> f43a;

    private final O9.a<String> f44b;

    private final O9.a<Integer> f45c;

    public V(O9.a<Context> aVar, O9.a<String> aVar2, O9.a<Integer> aVar3) {
        this.f43a = aVar;
        this.f44b = aVar2;
        this.f45c = aVar3;
    }

    public static V a(O9.a<Context> aVar, O9.a<String> aVar2, O9.a<Integer> aVar3) {
        return new V(aVar, aVar2, aVar3);
    }

    public static U c(Context context, String str, int i7) {
        return new U(context, str, i7);
    }

    public U get() {
        return c((Context) this.f43a.get(), (String) this.f44b.get(), ((Integer) this.f45c.get()).intValue());
    }
}
