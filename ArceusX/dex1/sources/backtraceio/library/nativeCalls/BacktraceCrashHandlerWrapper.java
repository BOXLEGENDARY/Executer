package backtraceio.library.nativeCalls;

import backtraceio.library.enums.UnwindingMode;
import backtraceio.library.interfaces.NativeCommunication;

public class BacktraceCrashHandlerWrapper implements NativeCommunication {
    @Override
    public boolean handleCrash(String[] strArr) {
        return BacktraceCrashHandler.handleCrash(strArr);
    }

    @Override
    public boolean initializeCrashHandler(String str, String str2, String str3, String[] strArr, String[] strArr2, String[] strArr3, boolean z7, UnwindingMode unwindingMode) {
        return BacktraceCrashHandler.initializeCrashHandler(str, str2, str3, strArr, strArr2, strArr3, z7, unwindingMode);
    }

    @Override
    public boolean initializeJavaCrashHandler(String str, String str2, String str3, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        return BacktraceCrashHandler.initializeJavaCrashHandler(str, str2, str3, strArr, strArr2, strArr3, strArr4);
    }
}
