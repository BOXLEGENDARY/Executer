package N3;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import e2.vb.oyfFwvPUKctyaG;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import n3.C2648f;
import o5.C2686c;
import o5.C2690g;

public final class M {

    private static final AbstractC0538i f2583i = AbstractC0538i.c("optional-module-barcode", oyfFwvPUKctyaG.bIctqWal);

    private final String f2584a;

    private final String f2585b;

    private final F f2586c;

    private final o5.n f2587d;

    private final Task f2588e;

    private final Task f2589f;

    private final String f2590g;

    private final int f2591h;

    public M(Context context, final o5.n nVar, F f7, String str) {
        new HashMap();
        new HashMap();
        this.f2584a = context.getPackageName();
        this.f2585b = C2686c.a(context);
        this.f2587d = nVar;
        this.f2586c = f7;
        X.a();
        this.f2590g = str;
        this.f2588e = C2690g.a().b(new Callable() {
            @Override
            public final Object call() {
                return this.f2581d.a();
            }
        });
        C2690g c2690gA = C2690g.a();
        Objects.requireNonNull(nVar);
        this.f2589f = c2690gA.b(new Callable() {
            @Override
            public final Object call() {
                return nVar.a();
            }
        });
        AbstractC0538i abstractC0538i = f2583i;
        this.f2591h = abstractC0538i.containsKey(str) ? DynamiteModule.c(context, (String) abstractC0538i.get(str)) : -1;
    }

    final String a() throws Exception {
        return C2648f.a().b(this.f2590g);
    }
}
