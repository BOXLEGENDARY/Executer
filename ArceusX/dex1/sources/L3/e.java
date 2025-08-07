package L3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class e extends Handler {
    public e(Looper looper) {
        super(looper);
    }

    @Override
    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }

    public e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
