package com.withpersona.sdk2.inquiry.network.dto.selfie;

import com.squareup.moshi.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class PoseConfig {
    private final Boolean allowReview;
    private final Boolean autoCaptureEnabled;
    private final Long manualCaptureDelayMs;
    private final Boolean manualCaptureEnabled;
    private final String pose;

    public PoseConfig(String str, Boolean bool, Boolean bool2, Long l, Boolean bool3) {
        this.pose = str;
        this.allowReview = bool;
        this.manualCaptureEnabled = bool2;
        this.manualCaptureDelayMs = l;
        this.autoCaptureEnabled = bool3;
    }

    public static PoseConfig copy$default(PoseConfig poseConfig, String str, Boolean bool, Boolean bool2, Long l, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = poseConfig.pose;
        }
        if ((i & 2) != 0) {
            bool = poseConfig.allowReview;
        }
        Boolean bool4 = bool;
        if ((i & 4) != 0) {
            bool2 = poseConfig.manualCaptureEnabled;
        }
        Boolean bool5 = bool2;
        if ((i & 8) != 0) {
            l = poseConfig.manualCaptureDelayMs;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            bool3 = poseConfig.autoCaptureEnabled;
        }
        return poseConfig.copy(str, bool4, bool5, l2, bool3);
    }

    public final String component1() {
        return this.pose;
    }

    public final Boolean component2() {
        return this.allowReview;
    }

    public final Boolean component3() {
        return this.manualCaptureEnabled;
    }

    public final Long component4() {
        return this.manualCaptureDelayMs;
    }

    public final Boolean component5() {
        return this.autoCaptureEnabled;
    }

    @NotNull
    public final PoseConfig copy(String str, Boolean bool, Boolean bool2, Long l, Boolean bool3) {
        return new PoseConfig(str, bool, bool2, l, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoseConfig)) {
            return false;
        }
        PoseConfig poseConfig = (PoseConfig) obj;
        return Intrinsics.b(this.pose, poseConfig.pose) && Intrinsics.b(this.allowReview, poseConfig.allowReview) && Intrinsics.b(this.manualCaptureEnabled, poseConfig.manualCaptureEnabled) && Intrinsics.b(this.manualCaptureDelayMs, poseConfig.manualCaptureDelayMs) && Intrinsics.b(this.autoCaptureEnabled, poseConfig.autoCaptureEnabled);
    }

    public final Boolean getAllowReview() {
        return this.allowReview;
    }

    public final Boolean getAutoCaptureEnabled() {
        return this.autoCaptureEnabled;
    }

    public final Long getManualCaptureDelayMs() {
        return this.manualCaptureDelayMs;
    }

    public final Boolean getManualCaptureEnabled() {
        return this.manualCaptureEnabled;
    }

    public final String getPose() {
        return this.pose;
    }

    public int hashCode() {
        String str = this.pose;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.allowReview;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.manualCaptureEnabled;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.manualCaptureDelayMs;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool3 = this.autoCaptureEnabled;
        return iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PoseConfig(pose=" + this.pose + ", allowReview=" + this.allowReview + ", manualCaptureEnabled=" + this.manualCaptureEnabled + ", manualCaptureDelayMs=" + this.manualCaptureDelayMs + ", autoCaptureEnabled=" + this.autoCaptureEnabled + ")";
    }
}
