package v5;

import android.os.SystemClock;
import com.github.luben.zstd.BuildConfig;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import n3.C2645c;
import n3.C2651i;
import u5.C2938a;

public class C2946a {

    private static final C2645c f24165c = new C2645c("StreamingFormatChecker", BuildConfig.FLAVOR);

    private final LinkedList f24166a = new LinkedList();

    private long f24167b = -1;

    public void a(C2938a c2938a) {
        if (c2938a.h() != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f24166a.add(Long.valueOf(jElapsedRealtime));
        if (this.f24166a.size() > 5) {
            this.f24166a.removeFirst();
        }
        if (this.f24166a.size() != 5 || jElapsedRealtime - ((Long) C2651i.l((Long) this.f24166a.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j7 = this.f24167b;
        if (j7 == -1 || jElapsedRealtime - j7 >= TimeUnit.SECONDS.toMillis(5L)) {
            this.f24167b = jElapsedRealtime;
            f24165c.f("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}
