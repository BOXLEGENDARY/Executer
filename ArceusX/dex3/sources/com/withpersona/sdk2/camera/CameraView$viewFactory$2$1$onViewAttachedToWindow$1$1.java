package com.withpersona.sdk2.camera;

import androidx.lifecycle.o;
import com.roblox.client.personasdk.R;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/withpersona/sdk2/camera/CameraView$viewFactory$2$1$onViewAttachedToWindow$1$1", "Landroidx/lifecycle/d;", "Landroidx/lifecycle/o;", "owner", "", "onDestroy", "(Landroidx/lifecycle/o;)V", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class CameraView$viewFactory$2$1$onViewAttachedToWindow$1$1 implements androidx.lifecycle.d {
    final ExecutorService d;

    public void onDestroy(@NotNull o owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.d.shutdown();
    }
}
