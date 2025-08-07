package C4;

import android.util.Log;
import java.util.Set;

final class s implements Runnable {

    final Set f851d;

    final a f852e;

    s(a aVar, Set set) {
        this.f852e = aVar;
        this.f851d = set;
    }

    @Override
    public final void run() {
        try {
            this.f852e.i(this.f851d);
        } catch (Exception e7) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e7);
        }
    }
}
