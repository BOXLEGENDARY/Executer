package com.withpersona.sdk2.inquiry.network.dto;

import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_GovernmentId_DigitalIdConfigJsonAdapter extends h<NextStep.GovernmentId.DigitalIdConfig> {

    @NotNull
    private final h<List<NextStep.GovernmentId.DigitalIdRequest>> nullableListOfDigitalIdRequestAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"merchantId", "nonce", "fieldKeyMobileDriversLicense", "mobileRequests"});

    public NextStep_GovernmentId_DigitalIdConfigJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "merchantId");
        this.nullableListOfDigitalIdRequestAdapter = wVar.f(A.j(List.class, new Type[]{NextStep.GovernmentId.DigitalIdRequest.class}), L.d(), "mobileRequests");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(59);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.DigitalIdConfig");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.DigitalIdConfig m177fromJson(@NotNull m mVar) {
        mVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 3) {
                list = (List) this.nullableListOfDigitalIdRequestAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new NextStep.GovernmentId.DigitalIdConfig(str, str2, str3, list);
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.DigitalIdConfig digitalIdConfig) {
        if (digitalIdConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("merchantId");
        this.nullableStringAdapter.toJson(tVar, digitalIdConfig.getMerchantId());
        tVar.Z("nonce");
        this.nullableStringAdapter.toJson(tVar, digitalIdConfig.getNonce());
        tVar.Z("fieldKeyMobileDriversLicense");
        this.nullableStringAdapter.toJson(tVar, digitalIdConfig.getFieldKeyMobileDriversLicense());
        tVar.Z("mobileRequests");
        this.nullableListOfDigitalIdRequestAdapter.toJson(tVar, digitalIdConfig.getMobileRequests());
        tVar.y();
    }
}
