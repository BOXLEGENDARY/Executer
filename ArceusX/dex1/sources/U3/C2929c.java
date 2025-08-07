package u3;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.github.luben.zstd.BuildConfig;

@Deprecated
public class C2929c {
    public static String a(PowerManager.WakeLock wakeLock, String str) {
        String strValueOf = String.valueOf((Process.myPid() << 32) | System.identityHashCode(wakeLock));
        if (true == TextUtils.isEmpty(str)) {
            str = BuildConfig.FLAVOR;
        }
        return String.valueOf(strValueOf).concat(String.valueOf(str));
    }
}
