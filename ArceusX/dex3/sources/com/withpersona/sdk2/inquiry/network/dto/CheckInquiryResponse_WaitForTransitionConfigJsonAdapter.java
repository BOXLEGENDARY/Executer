package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CheckInquiryResponse_WaitForTransitionConfigJsonAdapter extends h<CheckInquiryResponse.WaitForTransitionConfig> {

    @NotNull
    private final h<Long> nullableLongAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"intervalMs", "maxAttempts", "pollingMode"});

    @NotNull
    private final h<CheckInquiryResponse.PollingMode> pollingModeAdapter;

    public CheckInquiryResponse_WaitForTransitionConfigJsonAdapter(@NotNull w wVar) {
        this.nullableLongAdapter = wVar.f(Long.class, L.d(), "intervalMs");
        this.pollingModeAdapter = wVar.f(CheckInquiryResponse.PollingMode.class, L.d(), "pollingMode");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(66);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CheckInquiryResponse.WaitForTransitionConfig");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CheckInquiryResponse.WaitForTransitionConfig m138fromJson(@NotNull m mVar) throws j {
        mVar.e();
        CheckInquiryResponse.PollingMode pollingMode = null;
        Long l = null;
        Long l2 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                l = (Long) this.nullableLongAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                l2 = (Long) this.nullableLongAdapter.fromJson(mVar);
            } else if (iP0 == 2 && (pollingMode = (CheckInquiryResponse.PollingMode) this.pollingModeAdapter.fromJson(mVar)) == null) {
                throw c.x("pollingMode", "pollingMode", mVar);
            }
        }
        mVar.j();
        if (pollingMode != null) {
            return new CheckInquiryResponse.WaitForTransitionConfig(l, l2, pollingMode);
        }
        throw c.o("pollingMode", "pollingMode", mVar);
    }

    public void toJson(@NotNull t tVar, CheckInquiryResponse.WaitForTransitionConfig waitForTransitionConfig) {
        if (waitForTransitionConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("intervalMs");
        this.nullableLongAdapter.toJson(tVar, waitForTransitionConfig.getIntervalMs());
        tVar.Z("maxAttempts");
        this.nullableLongAdapter.toJson(tVar, waitForTransitionConfig.getMaxAttempts());
        tVar.Z("pollingMode");
        this.pollingModeAdapter.toJson(tVar, waitForTransitionConfig.getPollingMode());
        tVar.y();
    }
}
