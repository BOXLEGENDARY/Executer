package E;

import android.util.Size;
import java.util.Comparator;

public final class d implements Comparator<Size> {

    private boolean f1008d;

    public d() {
        this(false);
    }

    @Override
    public int compare(Size size, Size size2) {
        int iSignum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f1008d ? iSignum * (-1) : iSignum;
    }

    public d(boolean z7) {
        this.f1008d = z7;
    }
}
