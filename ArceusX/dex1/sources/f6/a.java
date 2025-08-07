package F6;

import W7.k;
import android.content.Context;
import com.roblox.protocols.mediapicker.MediaPickerProtocol;
import j6.d;

public class a implements k.a {

    private static a f1264a;

    public static a e() {
        if (f1264a == null) {
            synchronized (a.class) {
                try {
                    if (f1264a == null) {
                        f1264a = new a();
                    }
                } finally {
                }
            }
        }
        return f1264a;
    }

    public void a(Context context, boolean z7, boolean z8) {
        if (context == null || d.a().m()) {
            return;
        }
        MediaPickerProtocol.p().n(z8);
    }

    public boolean b(Context context, boolean z7) {
        return context != null;
    }

    public boolean c(Context context) {
        return context != null;
    }

    public boolean d(Context context) {
        return context != null;
    }
}
