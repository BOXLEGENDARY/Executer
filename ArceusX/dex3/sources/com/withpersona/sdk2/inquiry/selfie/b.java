package com.withpersona.sdk2.inquiry.selfie;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b\u0082\u0001\u0003\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/b;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "", "d", "()J", "startCaptureTimestamp", "", "f", "()Z", "autoCaptureSupported", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "l", "startSelfieTimestamp", "g", "manualCaptureEnabled", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface b extends com.withpersona.sdk2.inquiry.selfie.a {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {
        @NotNull
        public static Selfie.b a(@NotNull b bVar) {
            return a.C0155a.a(bVar);
        }

        @NotNull
        public static PoseConfig b(@NotNull b bVar) {
            return a.C0155a.b(bVar);
        }

        public static Selfie.b c(@NotNull b bVar) {
            return a.C0155a.c(bVar);
        }

        public static boolean d(@NotNull b bVar) {
            PoseConfig poseConfigI = bVar.i();
            if (!bVar.f() || poseConfigI.getManualCaptureEnabled()) {
                return (bVar.f() && poseConfigI.getAutoCaptureEnabled() && System.currentTimeMillis() - bVar.d() <= poseConfigI.getManualCaptureDelayMs()) ? false : true;
            }
            return false;
        }
    }

    @NotNull
    CameraProperties c();

    long d();

    boolean f();

    boolean g();

    long l();
}
