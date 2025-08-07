package E4;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.Executor;

public final class C0406l implements D4.M {

    private final Context f1142a;

    private final C4.f f1143b;

    private final C0408n f1144c;

    private final Executor f1145d;

    private final C4.t f1146e;

    public C0406l(Context context, Executor executor, C0408n c0408n, C4.f fVar, C4.t tVar) {
        this.f1142a = context;
        this.f1143b = fVar;
        this.f1144c = c0408n;
        this.f1145d = executor;
        this.f1146e = tVar;
    }

    static void c(C0406l c0406l, List list, D4.K k7) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Integer numE = c0406l.e(list);
        if (numE == null) {
            return;
        }
        if (numE.intValue() == 0) {
            k7.a();
        } else {
            k7.A(numE.intValue());
        }
    }

    static void d(C0406l c0406l, D4.K k7) {
        try {
            if (C4.a.f(N.a(c0406l.f1142a))) {
                Log.i("SplitCompat", "Splits installed.");
                k7.zza();
            } else {
                Log.e("SplitCompat", "Emulating splits failed.");
                k7.A(-12);
            }
        } catch (Exception e7) {
            Log.e("SplitCompat", "Error emulating splits.", e7);
            k7.A(-12);
        }
    }

    private final java.lang.Integer e(java.util.List r13) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        throw new UnsupportedOperationException("Method not decompiled: E4.C0406l.e(java.util.List):java.lang.Integer");
    }

    @Override
    public final void a(List list, D4.K k7) {
        if (!C4.a.g()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.f1145d.execute(new RunnableC0405k(this, list, k7));
    }
}
