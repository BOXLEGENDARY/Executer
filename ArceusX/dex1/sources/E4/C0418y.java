package E4;

import android.util.Log;
import java.io.File;

final class C0418y implements InterfaceC0411q {
    C0418y() {
    }

    @Override
    public final boolean a(Object obj, File file, File file2) {
        try {
            return !((Boolean) G.f(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }
}
