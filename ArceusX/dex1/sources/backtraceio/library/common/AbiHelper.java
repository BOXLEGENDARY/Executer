package backtraceio.library.common;

import android.os.Build;

public class AbiHelper {
    public static String getCurrentAbi() {
        return Build.SUPPORTED_ABIS[0];
    }
}
