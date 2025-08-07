package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.internal.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CheckInquiryResponse_AttributesJsonAdapter extends h<CheckInquiryResponse.Attributes> {

    @NotNull
    private final h<NextStep> nextStepAdapter;

    @NotNull
    private final h<Map<String, InquiryField>> nullableMapOfStringInquiryFieldAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"selectedCountryCode", "status", "nextStep", "fields", "waitForTransition", "environment"});

    @NotNull
    private final h<CheckInquiryResponse.WaitForTransitionConfig> waitForTransitionConfigAdapter;

    public CheckInquiryResponse_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "selectedCountryCode");
        this.nextStepAdapter = wVar.f(NextStep.class, L.d(), "nextStep");
        this.nullableMapOfStringInquiryFieldAdapter = wVar.f(A.j(Map.class, new Type[]{String.class, InquiryField.class}), L.d(), "fields");
        this.waitForTransitionConfigAdapter = wVar.f(CheckInquiryResponse.WaitForTransitionConfig.class, L.d(), "waitForTransitionConfig");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(53);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CheckInquiryResponse.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CheckInquiryResponse.Attributes m136fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        String str2 = null;
        NextStep nextStep = null;
        Map map = null;
        CheckInquiryResponse.WaitForTransitionConfig waitForTransitionConfig = null;
        String str3 = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 2:
                    nextStep = (NextStep) this.nextStepAdapter.fromJson(mVar);
                    if (nextStep == null) {
                        throw c.x("nextStep", "nextStep", mVar);
                    }
                    break;
                case 3:
                    map = (Map) this.nullableMapOfStringInquiryFieldAdapter.fromJson(mVar);
                    break;
                case 4:
                    waitForTransitionConfig = (CheckInquiryResponse.WaitForTransitionConfig) this.waitForTransitionConfigAdapter.fromJson(mVar);
                    if (waitForTransitionConfig == null) {
                        throw c.x("waitForTransitionConfig", "waitForTransition", mVar);
                    }
                    break;
                case 5:
                    str3 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        if (nextStep == null) {
            throw c.o("nextStep", "nextStep", mVar);
        }
        if (waitForTransitionConfig != null) {
            return new CheckInquiryResponse.Attributes(str, str2, nextStep, map, waitForTransitionConfig, str3);
        }
        throw c.o("waitForTransitionConfig", "waitForTransition", mVar);
    }

    public void toJson(@NotNull t tVar, CheckInquiryResponse.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("selectedCountryCode");
        this.nullableStringAdapter.toJson(tVar, attributes.getSelectedCountryCode());
        tVar.Z("status");
        this.nullableStringAdapter.toJson(tVar, attributes.getStatus());
        tVar.Z("nextStep");
        this.nextStepAdapter.toJson(tVar, attributes.getNextStep());
        tVar.Z("fields");
        this.nullableMapOfStringInquiryFieldAdapter.toJson(tVar, attributes.getFields());
        tVar.Z("waitForTransition");
        this.waitForTransitionConfigAdapter.toJson(tVar, attributes.getWaitForTransitionConfig());
        tVar.Z("environment");
        this.nullableStringAdapter.toJson(tVar, attributes.getEnvironment());
        tVar.y();
    }
}
