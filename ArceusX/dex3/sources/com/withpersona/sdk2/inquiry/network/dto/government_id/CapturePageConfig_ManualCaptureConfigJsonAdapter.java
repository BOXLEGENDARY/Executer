package com.withpersona.sdk2.inquiry.network.dto.government_id;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CapturePageConfig_ManualCaptureConfigJsonAdapter extends h<CapturePageConfig.ManualCaptureConfig> {

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<Long> nullableLongAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"isEnabled", "delayMs"});

    public CapturePageConfig_ManualCaptureConfigJsonAdapter(@NotNull w wVar) {
        this.nullableBooleanAdapter = wVar.f(Boolean.class, L.d(), "isEnabled");
        this.nullableLongAdapter = wVar.f(Long.class, L.d(), "delayMs");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(59);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CapturePageConfig.ManualCaptureConfig");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CapturePageConfig.ManualCaptureConfig m207fromJson(@NotNull m mVar) {
        mVar.e();
        Boolean bool = null;
        Long l = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                l = (Long) this.nullableLongAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new CapturePageConfig.ManualCaptureConfig(bool, l);
    }

    public void toJson(@NotNull t tVar, CapturePageConfig.ManualCaptureConfig manualCaptureConfig) {
        if (manualCaptureConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("isEnabled");
        this.nullableBooleanAdapter.toJson(tVar, manualCaptureConfig.isEnabled());
        tVar.Z("delayMs");
        this.nullableLongAdapter.toJson(tVar, manualCaptureConfig.getDelayMs());
        tVar.y();
    }
}
