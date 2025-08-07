package P1;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

public class p extends PorterDuffColorFilter {
    public p(int i) {
        super(i, PorterDuff.Mode.SRC_ATOP);
    }
}
