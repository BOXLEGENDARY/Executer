package backtraceio.library.breadcrumbs;

import backtraceio.library.logger.BacktraceLogger;
import e8.a;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class BacktraceQueueFileHelper {
    private final String breadcrumbLogDirectory;
    private final a breadcrumbStore;
    private final int maxQueueFileSizeBytes;
    private final Method usedBytes;
    private final String LOG_TAG = BacktraceQueueFileHelper.class.getSimpleName();
    private final int minimumQueueFileSizeBytes = 4096;

    public BacktraceQueueFileHelper(String str, int i7) throws NoSuchMethodException, SecurityException, IOException {
        this.breadcrumbLogDirectory = str;
        this.breadcrumbStore = new a(new File(str));
        Method declaredMethod = a.class.getDeclaredMethod("v", null);
        this.usedBytes = declaredMethod;
        declaredMethod.setAccessible(true);
        if (i7 < 4096) {
            this.maxQueueFileSizeBytes = 4096;
        } else {
            this.maxQueueFileSizeBytes = i7;
        }
    }

    public boolean add(byte[] bArr) {
        try {
            int length = bArr.length;
            if (length > 4096) {
                BacktraceLogger.e(this.LOG_TAG, "We should not have a breadcrumb this big, this is a bug!");
                return false;
            }
            int iIntValue = ((Integer) this.usedBytes.invoke(this.breadcrumbStore, null)).intValue();
            while (!this.breadcrumbStore.j() && iIntValue + length > this.maxQueueFileSizeBytes) {
                this.breadcrumbStore.q();
                iIntValue = ((Integer) this.usedBytes.invoke(this.breadcrumbStore, null)).intValue();
            }
            this.breadcrumbStore.d(bArr);
            return true;
        } catch (Exception e7) {
            BacktraceLogger.w(this.LOG_TAG, "Exception: " + e7.getMessage() + "\nWhen adding breadcrumb: " + new String(bArr, StandardCharsets.UTF_8));
            return false;
        }
    }

    public boolean clear() {
        try {
            this.breadcrumbStore.f();
            return true;
        } catch (Exception e7) {
            BacktraceLogger.w(this.LOG_TAG, "Exception: " + e7.getMessage() + "\nWhen clearing breadcrumbs");
            return false;
        }
    }
}
