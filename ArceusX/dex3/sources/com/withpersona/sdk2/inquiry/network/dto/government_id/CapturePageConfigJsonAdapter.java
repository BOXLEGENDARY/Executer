package com.withpersona.sdk2.inquiry.network.dto.government_id;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CapturePageConfigJsonAdapter extends h<CapturePageConfig> {

    @NotNull
    private final h<CapturePageConfig.AutoCaptureConfig> nullableAutoCaptureConfigAdapter;

    @NotNull
    private final h<CapturePageConfig.ManualCaptureConfig> nullableManualCaptureConfigAdapter;

    @NotNull
    private final h<CapturePageConfig.OverlayConfig> nullableOverlayConfigAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"side", "manualCaptureConfig", "autoCaptureConfig", "overlay"});

    public CapturePageConfigJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "side");
        this.nullableManualCaptureConfigAdapter = wVar.f(CapturePageConfig.ManualCaptureConfig.class, L.d(), "manualCaptureConfig");
        this.nullableAutoCaptureConfigAdapter = wVar.f(CapturePageConfig.AutoCaptureConfig.class, L.d(), "autoCaptureConfig");
        this.nullableOverlayConfigAdapter = wVar.f(CapturePageConfig.OverlayConfig.class, L.d(), "overlay");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CapturePageConfig");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CapturePageConfig m205fromJson(@NotNull m mVar) {
        mVar.e();
        String str = null;
        CapturePageConfig.ManualCaptureConfig manualCaptureConfig = null;
        CapturePageConfig.AutoCaptureConfig autoCaptureConfig = null;
        CapturePageConfig.OverlayConfig overlayConfig = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                manualCaptureConfig = (CapturePageConfig.ManualCaptureConfig) this.nullableManualCaptureConfigAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                autoCaptureConfig = (CapturePageConfig.AutoCaptureConfig) this.nullableAutoCaptureConfigAdapter.fromJson(mVar);
            } else if (iP0 == 3) {
                overlayConfig = (CapturePageConfig.OverlayConfig) this.nullableOverlayConfigAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new CapturePageConfig(str, manualCaptureConfig, autoCaptureConfig, overlayConfig);
    }

    public void toJson(@NotNull t tVar, CapturePageConfig capturePageConfig) {
        if (capturePageConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("side");
        this.nullableStringAdapter.toJson(tVar, capturePageConfig.getSide());
        tVar.Z("manualCaptureConfig");
        this.nullableManualCaptureConfigAdapter.toJson(tVar, capturePageConfig.getManualCaptureConfig());
        tVar.Z("autoCaptureConfig");
        this.nullableAutoCaptureConfigAdapter.toJson(tVar, capturePageConfig.getAutoCaptureConfig());
        tVar.Z("overlay");
        this.nullableOverlayConfigAdapter.toJson(tVar, capturePageConfig.getOverlay());
        tVar.y();
    }
}
