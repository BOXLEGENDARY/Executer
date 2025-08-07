package ha;

import android.content.Context;
import h7.l;
import j6.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import okio.g;
import okio.w;

public class C2696b {

    private static final C2696b f22517b = new C2696b();

    private final Map<String, byte[]> f22518a = new HashMap();

    public static C2696b b() {
        return f22517b;
    }

    public synchronized byte[] a(Context context, String str) {
        if (this.f22518a.containsKey(str)) {
            return this.f22518a.get(str);
        }
        String str2 = "shared_compression_dictionaries/" + str + ".dict";
        if (d.a().r2()) {
            h7.d.a(str2);
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open(str2);
            try {
                g gVarD = w.d(w.l(inputStreamOpen));
                try {
                    byte[] bArrO = gVarD.O();
                    this.f22518a.put(str, bArrO);
                    gVarD.close();
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    return bArrO;
                } finally {
                }
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e7) {
            l.e("DictionaryManager", "Error reading dictionary " + str, e7);
            return null;
        }
    }

    public synchronized void c() {
        this.f22518a.clear();
    }
}
