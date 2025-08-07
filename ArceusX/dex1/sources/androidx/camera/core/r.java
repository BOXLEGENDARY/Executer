package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import z.V;

public final class r extends e {

    private final int f9516A;

    private final Object f9517v;

    private final V f9518w;

    private Rect f9519y;

    private final int f9520z;

    r(n nVar, V v7) {
        this(nVar, null, v7);
    }

    @Override
    public void B0(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f9517v) {
            this.f9519y = rect;
        }
    }

    @Override
    public V D0() {
        return this.f9518w;
    }

    @Override
    public int getHeight() {
        return this.f9516A;
    }

    @Override
    public int getWidth() {
        return this.f9520z;
    }

    public r(n nVar, Size size, V v7) {
        super(nVar);
        this.f9517v = new Object();
        if (size == null) {
            this.f9520z = super.getWidth();
            this.f9516A = super.getHeight();
        } else {
            this.f9520z = size.getWidth();
            this.f9516A = size.getHeight();
        }
        this.f9518w = v7;
    }
}
