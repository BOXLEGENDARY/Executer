package g3;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import l3.AbstractC2531f;
import l3.C2526a;

public abstract class AbstractC2461b extends AbstractC2531f<C2526a.d.c> {

    private static final C2526a.g f20957k;

    private static final C2526a.AbstractC0203a f20958l;

    private static final C2526a f20959m;

    static {
        C2526a.g gVar = new C2526a.g();
        f20957k = gVar;
        C2462c c2462c = new C2462c();
        f20958l = c2462c;
        f20959m = new C2526a("SmsRetriever.API", c2462c, gVar);
    }

    public AbstractC2461b(Context context) {
        super(context, (C2526a<C2526a.d.c>) f20959m, C2526a.d.f21784x, AbstractC2531f.a.f21797c);
    }

    public abstract Task<Void> E();
}
