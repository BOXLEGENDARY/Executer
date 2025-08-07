package p4;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import c4.C1746b;
import z0.C3071a;

public abstract class AbstractC2723a<V extends View> {

    private final TimeInterpolator f22681a;

    protected final V f22682b;

    protected final int f22683c;

    protected final int f22684d;

    protected final int f22685e;

    public AbstractC2723a(V v7) {
        this.f22682b = v7;
        Context context = v7.getContext();
        this.f22681a = e.g(context, C1746b.f12720P, C3071a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f22683c = e.f(context, C1746b.f12710F, 300);
        this.f22684d = e.f(context, C1746b.f12714J, 150);
        this.f22685e = e.f(context, C1746b.f12713I, 100);
    }
}
