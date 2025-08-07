package com.withpersona.sdk2.inquiry.network.dto.selfie;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class PoseConfigJsonAdapter extends h<PoseConfig> {

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<Long> nullableLongAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"pose", "allowReview", "manualCaptureEnabled", "manualCaptureDelayMs", "autoCaptureEnabled"});

    public PoseConfigJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "pose");
        this.nullableBooleanAdapter = wVar.f(Boolean.class, L.d(), "allowReview");
        this.nullableLongAdapter = wVar.f(Long.class, L.d(), "manualCaptureDelayMs");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PoseConfig");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public PoseConfig m213fromJson(@NotNull m mVar) {
        mVar.e();
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Long l = null;
        Boolean bool3 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
            } else if (iP0 == 3) {
                l = (Long) this.nullableLongAdapter.fromJson(mVar);
            } else if (iP0 == 4) {
                bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new PoseConfig(str, bool, bool2, l, bool3);
    }

    public void toJson(@NotNull t tVar, PoseConfig poseConfig) {
        if (poseConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("pose");
        this.nullableStringAdapter.toJson(tVar, poseConfig.getPose());
        tVar.Z("allowReview");
        this.nullableBooleanAdapter.toJson(tVar, poseConfig.getAllowReview());
        tVar.Z("manualCaptureEnabled");
        this.nullableBooleanAdapter.toJson(tVar, poseConfig.getManualCaptureEnabled());
        tVar.Z("manualCaptureDelayMs");
        this.nullableLongAdapter.toJson(tVar, poseConfig.getManualCaptureDelayMs());
        tVar.Z("autoCaptureEnabled");
        this.nullableBooleanAdapter.toJson(tVar, poseConfig.getAutoCaptureEnabled());
        tVar.y();
    }
}
