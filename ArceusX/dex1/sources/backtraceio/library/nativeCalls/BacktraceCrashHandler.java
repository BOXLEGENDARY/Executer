package backtraceio.library.nativeCalls;

import backtraceio.library.enums.UnwindingMode;

public class BacktraceCrashHandler {
    public static native boolean handleCrash(String[] strArr);

    public static native boolean initializeCrashHandler(String str, String str2, String str3, String[] strArr, String[] strArr2, String[] strArr3, boolean z7, UnwindingMode unwindingMode);

    public static native boolean initializeJavaCrashHandler(String str, String str2, String str3, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4);
}
