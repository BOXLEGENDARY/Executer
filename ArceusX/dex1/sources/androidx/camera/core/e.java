package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import z.V;

public abstract class e implements n {

    protected final n f9427e;

    private final Object f9426d = new Object();

    private final Set<a> f9428i = new HashSet();

    public interface a {
        void b(n nVar);
    }

    protected e(n nVar) {
        this.f9427e = nVar;
    }

    @Override
    public void B0(Rect rect) {
        this.f9427e.B0(rect);
    }

    @Override
    public V D0() {
        return this.f9427e.D0();
    }

    public void b(a aVar) {
        synchronized (this.f9426d) {
            this.f9428i.add(aVar);
        }
    }

    @Override
    public void close() {
        this.f9427e.close();
        e();
    }

    protected void e() {
        HashSet hashSet;
        synchronized (this.f9426d) {
            hashSet = new HashSet(this.f9428i);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b(this);
        }
    }

    @Override
    public int getHeight() {
        return this.f9427e.getHeight();
    }

    @Override
    public int getWidth() {
        return this.f9427e.getWidth();
    }

    @Override
    public int i() {
        return this.f9427e.i();
    }

    @Override
    public Image l() {
        return this.f9427e.l();
    }

    @Override
    public n.a[] s() {
        return this.f9427e.s();
    }
}
