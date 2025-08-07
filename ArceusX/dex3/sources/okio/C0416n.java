package okio;

import android.os.SystemClock;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LO1/n;", "", "<init>", "()V", "", "a", "()Z", "LO1/s;", "logger", "b", "(LO1/s;)Z", "Ljava/io/File;", "Ljava/io/File;", "fileDescriptorList", "", "c", "I", "decodesSinceLastFileDescriptorCheck", "", "d", "J", "lastFileDescriptorCheckTimestamp", "e", "Z", "hasAvailableFileDescriptors", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class C0416n {

    @NotNull
    public static final C0416n a = new C0416n();

    @NotNull
    private static final File fileDescriptorList = new File("/proc/self/fd");

    private static int decodesSinceLastFileDescriptorCheck = 30;

    private static long lastFileDescriptorCheckTimestamp = SystemClock.uptimeMillis();

    private static boolean hasAvailableFileDescriptors = true;

    private C0416n() {
    }

    private final boolean a() {
        int i = decodesSinceLastFileDescriptorCheck;
        decodesSinceLastFileDescriptorCheck = i + 1;
        return i >= 30 || SystemClock.uptimeMillis() > lastFileDescriptorCheckTimestamp + ((long) 30000);
    }

    public final synchronized boolean b(InterfaceC0420s logger) {
        try {
            if (a()) {
                decodesSinceLastFileDescriptorCheck = 0;
                lastFileDescriptorCheckTimestamp = SystemClock.uptimeMillis();
                String[] list = fileDescriptorList.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                boolean z = length < 800;
                hasAvailableFileDescriptors = z;
                if (!z && logger != null && logger.a() <= 5) {
                    logger.b("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return hasAvailableFileDescriptors;
    }
}
