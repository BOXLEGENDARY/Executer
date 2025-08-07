package C;

import android.util.Size;
import android.view.Surface;

public final class C0355u0 extends AbstractC0324e0 {

    private final Surface f738o;

    public C0355u0(Surface surface, Size size, int i7) {
        super(size, i7);
        this.f738o = surface;
    }

    @Override
    public com.google.common.util.concurrent.p<Surface> r() {
        return G.n.p(this.f738o);
    }

    public C0355u0(Surface surface) {
        this.f738o = surface;
    }
}
