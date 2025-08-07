package I3;

import android.os.Handler;
import android.os.Looper;

public class j extends Handler {

    private final Looper f1692a;

    public j(Looper looper) {
        super(looper);
        this.f1692a = Looper.getMainLooper();
    }

    public j(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f1692a = Looper.getMainLooper();
    }
}
