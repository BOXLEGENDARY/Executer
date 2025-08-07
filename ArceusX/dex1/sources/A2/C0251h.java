package A2;

import android.content.Context;

public final class C0251h implements u2.b<String> {

    private final O9.a<Context> f61a;

    public C0251h(O9.a<Context> aVar) {
        this.f61a = aVar;
    }

    public static C0251h a(O9.a<Context> aVar) {
        return new C0251h(aVar);
    }

    public static String c(Context context) {
        return (String) u2.d.c(AbstractC0249f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public String get() {
        return c((Context) this.f61a.get());
    }
}
