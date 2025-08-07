package C4;

import android.util.Log;

final class r implements Runnable {

    final a f850d;

    r(a aVar) {
        this.f850d = aVar;
    }

    @Override
    public final void run() {
        try {
            this.f850d.f822a.k();
        } catch (Exception e7) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e7);
        }
    }
}
