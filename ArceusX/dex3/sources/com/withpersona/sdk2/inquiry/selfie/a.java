package com.withpersona.sdk2.inquiry.selfie;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0006\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/a;", "", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "a", "()Ljava/util/List;", "posesNeeded", "h", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "currentPose", "k", "currentPoseOrNull", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "b", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "i", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "currentPoseConfig", "Lcom/withpersona/sdk2/inquiry/selfie/b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface a {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class C0155a {
        @NotNull
        public static Selfie.b a(@NotNull a aVar) {
            return (Selfie.b) CollectionsKt.M(aVar.a());
        }

        @NotNull
        public static PoseConfig b(@NotNull a aVar) {
            Selfie.b bVarK = aVar.k();
            return bVarK == null ? PoseConfig.INSTANCE.a() : aVar.b().a(bVarK);
        }

        public static Selfie.b c(@NotNull a aVar) {
            return (Selfie.b) CollectionsKt.firstOrNull(aVar.a());
        }
    }

    @NotNull
    List<Selfie.b> a();

    @NotNull
    PoseConfigs b();

    @NotNull
    Selfie.b h();

    @NotNull
    PoseConfig i();

    Selfie.b k();
}
