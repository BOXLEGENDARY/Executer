package u;

import C.X;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r.C2739a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lu/b;", BuildConfig.FLAVOR, "<init>", "()V", "Lr/a$a;", "options", "LC/X$c;", "priority", BuildConfig.FLAVOR, "a", "(Lr/a$a;LC/X$c;)V", "camera-camera2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C2921b {

    public static final C2921b f23846a = new C2921b();

    private C2921b() {
    }

    public static final void a(C2739a.C0218a options, X.c priority) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (Build.VERSION.SDK_INT >= 34) {
            options.g(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, priority);
        }
    }
}
