package J3;

import android.os.Handler;
import android.os.Looper;

public class i extends Handler {

    private final Looper f1723a;

    public i(Looper looper) {
        super(looper);
        this.f1723a = Looper.getMainLooper();
    }

    public i(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f1723a = Looper.getMainLooper();
    }
}
